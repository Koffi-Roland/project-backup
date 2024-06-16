package com.airfrance.repind.dao.adresse;

import javax.validation.constraints.NotNull;

import com.airfrance.repind.entity.adresse.Telecoms;
import com.airfrance.repind.entity.firme.Fonction;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface TelecomsRepository extends JpaRepository<Telecoms, String>, TelecomsRepositoryCustom {

	/*
	 * Return one
	 */
	@Query(value = "select t from Telecoms t where t.sain in (select tel from Telecoms tel "
			+ "where tel.sgin = :gin "
			+ "and (tel.sstatut_medium = 'V' "
			+ "or tel.sstatut_medium = 'T') "
			+ "and tel.sterminal='T') and ROWNUM <=1 ORDER BY t.scode_medium ASC, GREATEST(DDATE_CREATION, DDATE_MODIFICATION) DESC")
	public Telecoms getPreferedTelecom(@Param("gin") String sgin);

	@Query(value = "select t from Telecoms t where t.sain in (select tel from Telecoms tel "
			+ "where tel.sgin = :gin "
			+ "and tel.sstatut_medium = 'V' "
			+ "and tel.sterminal=:terminalType "
			+ "and tel.snorm_inter_country_code=:countryCode "
			+ "and tel.snorm_nat_phone_number=:phoneNumber) and ROWNUM <=1 ORDER BY t.ddate_modification DESC")
	public Telecoms findLatest(@Param("gin") String gin, @Param("terminalType") String terminalType, 
			@Param("countryCode") String countryCode, @Param("phoneNumber") String phoneNumber);

	@Query(value = "select t from Telecoms t where t.sain in (select tel from Telecoms tel "
			+ "where tel.sgin = :gin "
			+ "and tel.scode_medium=:mediumCode "
			+ "and tel.sterminal=:terminalType "
			+ "and tel.snumero=:phoneNumber) and ROWNUM <=1 ORDER BY t.ddate_modification DESC")
	public Telecoms findLatestByUsageCodeValidOrNot(@Param("gin") String gin, @Param("mediumCode") String mediumCode, 
			@Param("terminalType") String terminalType, @Param("phoneNumber") String phoneNumber);

	@Query(value = "select t from Telecoms t where t.sain in (select tel from Telecoms tel "
			+ "where tel.sgin = :gin "
			+ "and tel.sstatut_medium = 'V' "
			+ "and tel.scode_medium=:mediumCode "
			+ "and tel.sterminal=:terminalType "
			+ "and tel.snumero=:phoneNumber) and ROWNUM <=1 ORDER BY t.ddate_modification DESC ")
	public Telecoms findLatestByUsageCode(@Param("gin") String gin, @Param("terminalType") String terminalType,
			@Param("mediumCode") String mediumCode, @Param("phoneNumber") String phoneNumber);

	@Query(value = "select t from Telecoms t where t.sain in (select tel from Telecoms tel "
			+ "left outer join tel.individu ind "
			+ "where ind.sgin = :gin "
			+ "and (tel.sstatut_medium = 'V' "
			+ "or tel.sstatut_medium = 'I') "
			+ "and tel.sterminal = :terminalType) "
			+ "and ROWNUM <=1 order by t.sstatut_medium desc, t.ddate_modification desc, t.sain desc")
	public Telecoms findLatest(@Param("gin") String gin, @Param("terminalType") String terminalType);

	@Query(value = "select t from Telecoms t where t.sain in (select tel from Telecoms tel "
			+ "left outer join tel.individu ind "
			+ "where ind.sgin = :gin "
			+ "and tel.scode_medium = :mediumCode "
			+ "and (tel.sstatut_medium = 'V' "
			+ "or tel.sstatut_medium = 'I') "
			+ "and tel.sterminal = :terminalType) "
			+ "and ROWNUM <=1 order by t.sstatut_medium desc, t.ddate_modification desc, t.sain desc")
	public Telecoms findLatestByUsageCode(@Param("gin") String gin, @Param("mediumCode") String mediumCode, @Param("terminalType") String terminalType);

	@Modifying
	@Query(value = "update Telecoms tel set "
			+ "tel.sstatut_medium = 'X', "
			+ "tel.ssignature_modification = :modificationSignature, "
			+ "tel.ssite_modification = :modificationSite, "
			+ "tel.ddate_modification = :modificationDate "
			+ "where tel.sgin = :gin "
			+ "and (tel.sstatut_medium = 'V' "
			+ "or tel.sstatut_medium = 'I') "
			+ "and tel.sterminal = :terminalType "
			+ "and sain <> :sain")
	public void removeAllButThis(@Param("gin") String gin, @Param("terminalType") String terminalType, @Param("sain") String sain, 
			@Param("modificationSignature") String modificationSignature, @Param("modificationSite") String modificationSite, @Param("modificationDate") Date modificationDate);

	@Modifying
	@Query(value = "update Telecoms tel set "
			+ "tel.sstatut_medium = 'X', "
			+ "tel.ssignature_modification = :modificationSignature, "
			+ "tel.ssite_modification = :modificationSite, "
			+ "tel.ddate_modification = :modificationDate "
			+ "where tel.sgin = :gin "
			+ "and (tel.sstatut_medium = 'V' "
			+ "or tel.sstatut_medium = 'I') "
			+ "and tel.scode_medium = :mediumCode "
			+ "and tel.sterminal = :terminalType "
			+ "and sain <> :sain")
	public void removeAllButThisByUsageCode(@Param("gin") String gin, @Param("terminalType") String terminalType, @Param("sain") String sain, @Param("mediumCode") String mediumCode, 
			@Param("modificationSignature") String modificationSignature, @Param("modificationSite") String modificationSite, @Param("modificationDate") Date modificationDate);
	
	/**
	 * Finds telecoms of moral person having the GIN gin. Returned telecoms
	 * indexes. Returned telecoms are given from the firstResultIndex and
	 * are in maximum maxResults.
	 *
	 * @param gin
	 * @param firstResultIndex
	 * @param maxResults
	 *
	 * @return null if no telecoms found for this gin.
	 * @throws JrafDaoException
	 */
	@Query(value = "select tel from Telecoms tel "
			+ "where tel.personneMorale.gin = :gin ")
	List<Telecoms> findByPMGin(@Param("gin") String gin, Pageable pageable);

	/**
	 * Finds telecoms of moral person having the GIN gin.
	 *
	 * @param gin
	 *
	 * @return null if no telecoms found for this gin.
	 */
	List<Telecoms> findBySgin(String gin);

	/**
	 * Gives a list of Email that have the Fonction fonction.
	 * The start index of the results is firstIndex, and the
	 * maximum number of results is maxResults.
	 *
	 * @param fonction
	 * @param firstIndex
	 * @param maxResults
	 *
	 * @return
	 *
	 * @throws JrafDaoException
	 *             if a technical exception occurs (Hibernate exception for
	 *             instance)
	 *             or when fonction is null.
	 */
	@Query(value = "select tel from Telecoms tel "
			+ "where tel.fonction = :fonction "
			+ "and tel.sstatut_medium <> 'X' "
			+ "and tel.sstatut_medium <> 'H' "
			+ "order by tel.ddate_modification desc")
	List<Telecoms> findByFonction(@Param("fonction") Fonction fonction, Pageable pageable);

	@Query(value = "select m.SAIN from sic2.MBR_TEL m "
			+ "where m.IKEY_MBR = :key ", nativeQuery = true)
	public List<String> getMbrTelSainByKey(@Param("key") Integer key);

	@Query(value = "select tel from Telecoms tel "
			+ "where tel.sgin = :gin "
			+ "and tel.sstatut_medium in ('I', 'V', 'H')")
	public List<Telecoms> findTelecomsByGIN(@Param("gin") String gin);
	
	@Query(value = "select count(1) from Telecoms tel "
			+ "where tel.sgin = :gin "
			+ "and tel.scode_medium = :codeMedium "
			+ "and tel.sstatut_medium = 'V'")
    int getNumberTelecomsProOrPersoByGinAndCodeMedium(@Param("gin") String gin, @Param("codeMedium") String codeMedium);
	
	@Query(value = "select tel from Telecoms tel where tel.sgin = :gin and tel.sstatut_medium in ('I', 'S', 'V', 'H', 'T')")
	List<Telecoms> findTelecomsToRemoveByGIN(@Param("gin") String gin);

	@Query("Select tel from Telecoms tel where tel.sgin = :gin and tel.sstatut_medium IN :status")
	public List<Telecoms> findByGinAndStatus(@Param("gin") String gin, @Param("status") List<String> status);

	@Query("Select tel from Telecoms tel where tel.sgin = :gin and tel.sstatut_medium IN :status and tel.scode_medium IN :codesMedium")
	public List<Telecoms> findByGinAndStatusAndCodeMedium(@Param("gin") String gin,
			@Param("status") List<String> status, @Param("codesMedium") List<String> codesMedium);

	public Telecoms findBySain(String sain);

	@Query(value = "SELECT t FROM Telecoms t WHERE t.personneMorale.gin = :gin AND t.sstatut_medium = 'V' ")
	List<Telecoms> findActiveByPm(@Param("gin") String ginPm);

	@Query(value = "SELECT t FROM Telecoms t WHERE t.fonction.cle = :function AND t.individu IS NULL AND t.sstatut_medium = 'V' ")
	public List<Telecoms> findActiveByFonction(@Param("function") String function);

	@Query(value = "SELECT t FROM Telecoms t WHERE t.personneMorale.gin = :gin AND t.scode_medium IN :codesMedium and t.sterminal IN :terminal")
	public Set<Telecoms> findByGinPmCodeMediumAndTerminal(@Param("gin") String gin, @Param("codesMedium") List<String> codeList, @Param("terminal") List<String> terminalList);

}