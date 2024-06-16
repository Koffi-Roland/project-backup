package com.afklm.repind.v6.createorupdateindividual;

import com.afklm.repind.config.WebTestConfig;
import com.afklm.repind.createorupdateindividual.helper.CreateOrUpdateAnIndividualChangeEmailAccountDataHelper;
import com.afklm.repind.v6.createorupdateindividualws.CreateOrUpdateIndividualImplV6;
import com.afklm.soa.stubs.common.systemfault.v1.SystemException;
import com.afklm.soa.stubs.w000442.v6.BusinessErrorBlocBusinessException;
import com.afklm.soa.stubs.w000442.v6.data.CreateUpdateIndividualRequest;
import com.afklm.soa.stubs.w000442.v6.data.CreateUpdateIndividualResponse;
import com.afklm.soa.stubs.w000442.v6.request.EmailRequest;
import com.afklm.soa.stubs.w000442.v6.request.IndividualRequest;
import com.afklm.soa.stubs.w000442.v6.siccommontype.Requestor;
import com.afklm.soa.stubs.w000442.v6.sicindividutype.Email;
import com.afklm.soa.stubs.w000442.v6.sicindividutype.IndividualInformations;
import com.airfrance.ref.exception.jraf.JrafDaoException;
import com.airfrance.repind.dao.individu.AccountDataRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebTestConfig.class)
@Transactional(value = "transactionManagerRepind")
public class CreateOrUpdateAnIndividualChangeEmailAccountData {

	@Autowired
	@Qualifier("passenger_CreateUpdateIndividualService-v6Bean")
	private CreateOrUpdateIndividualImplV6 createOrUpdateIndividualImplV6;

	@Autowired
	AccountDataRepository accountDataRepository;

	@Autowired
	CreateOrUpdateAnIndividualChangeEmailAccountDataHelper helper;

	// BUG change of email in AccountData where email from contact change (with specific rules)
	/**
	 * This test is about a bug IM02496944 and REPIND-970 where B2C is changing
	 * a contact email that also must change account connection email Expected :
	 * The email in ACCOUNT_DATA table must be equals to the new define in EMAIL
	 * table
	 * 
	 * @throws BusinessErrorBlocBusinessException
	 * @throws SystemException
	 * @throws JrafDaoException
	 */
	@Test
	@Transactional
	@Rollback(true)
	@Category(com.airfrance.repind.util.TestCategory.Slow.class)
	public void testCreateOrUpdateIndividual_ChangeAccountDataEmail()
			throws BusinessErrorBlocBusinessException, SystemException, JrafDaoException {

		CreateUpdateIndividualRequest request = new CreateUpdateIndividualRequest();

		request.setStatus("V");

		// Preparing the request		
		Requestor requestor = new Requestor();
		requestor.setChannel("DS");
		requestor.setApplicationCode("ISI");
		requestor.setSite("TLS");
		requestor.setSignature("DALLAS");

		request.setRequestor(requestor);

		IndividualRequest indRequest = new IndividualRequest();
		// indRequest.setCivilian("MR");

		IndividualInformations indInfo = new IndividualInformations();
		indInfo.setIdentifier("400509651532");
		indRequest.setIndividualInformations(indInfo);

		request.setIndividualRequest(indRequest);

		// Email
		EmailRequest emailRequest = new EmailRequest();
		Email email = new Email();
		email.setMediumCode("D");
		email.setMediumStatus("V");
		email.setEmail("testChangeAccountData@airfrance.fr");
		emailRequest.setEmail(email);
		request.getEmailRequest().add(emailRequest);

		CreateUpdateIndividualResponse response = createOrUpdateIndividualImplV6.createIndividual(request);

		Assert.assertNotNull(response);
		Assert.assertNotNull(response.isSuccess());
		Assert.assertTrue(response.isSuccess());
		
		Assert.assertNotNull(accountDataRepository.findBySgin("400509651532").getEmailIdentifier(),
				"testChangeAccountData@airfrance.fr");

		helper.after();
	}
	
}