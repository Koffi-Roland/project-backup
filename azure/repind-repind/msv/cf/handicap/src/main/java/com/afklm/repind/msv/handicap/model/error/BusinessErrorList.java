package com.afklm.repind.msv.handicap.model.error;

import java.util.EnumMap;
import java.util.Map;

import com.afklm.repind.msv.handicap.model.error.BusinessErorMessageList;
import com.afklm.repind.msv.handicap.model.error.ErrorType;
import com.afklm.repind.msv.handicap.model.error.RestError;

/**
 * Business errors list
 *
 * @author m312812
 *
 */
public enum BusinessErrorList {

	API_CUSTOMER_EMPTY(
			new RestError("business.001", "gin or frequentFlyerNumber must not be empty", null, ErrorType.WARNING)),

	API_COMPLAINT_NOT_FOUND(new RestError("business.002", "Complaint id not found", null, ErrorType.WARNING)),

	API_STATION_NOT_FOUND(new RestError("business.003", "Station not found", null, ErrorType.WARNING)),

	API_NOTHING_TO_UPDATE(new RestError("business.004", "Nothing to update", null, ErrorType.WARNING)),

	API_MISSING_REQUEST_PARAMETER(new RestError("business.400", "Missing Request Parameter", null, ErrorType.WARNING)),

	API_GIN_IS_MISSING(new RestError("business.400.001", BusinessErorMessageList.ERROR_MESSAGE_400_001, null, ErrorType.WARNING)),

	API_TYPE_IS_MISSING(new RestError("business.400.002", BusinessErorMessageList.ERROR_MESSAGE_400_002, null, ErrorType.WARNING)),

	API_CODE_IS_MISSING(new RestError("business.400.003", BusinessErorMessageList.ERROR_MESSAGE_400_003, null, ErrorType.WARNING)),

	API_APPLICATION_IS_MISSING(new RestError("business.400.004", BusinessErorMessageList.ERROR_MESSAGE_400_004, null, ErrorType.WARNING)),

	API_DATA_ARE_MISSING(new RestError("business.400.005", BusinessErorMessageList.ERROR_MESSAGE_400_005, null, ErrorType.WARNING)),

	API_ID_IS_MISSING(new RestError("business.400.006", BusinessErorMessageList.ERROR_MESSAGE_400_006, null, ErrorType.WARNING)),

	API_KEY_IS_MISSING(new RestError("business.400.007", BusinessErorMessageList.ERROR_MESSAGE_400_007, null, ErrorType.WARNING)),

	API_HANDICAP_NOT_FOUND(
			new RestError("business.404.001", BusinessErorMessageList.ERROR_MESSAGE_404_001, null, ErrorType.WARNING)),

	API_CONSTRAINT_VIOLATION(new RestError("business.412", "Business constraint violation", null, ErrorType.WARNING)),

	API_PARAMETER_TYPE_MISMATCH(new RestError("business.412.001", "Mismatch type parameter", null, ErrorType.WARNING)),

	API_INVALID_GIN(
			new RestError("business.412.002", BusinessErorMessageList.ERROR_MESSAGE_412_002, null, ErrorType.WARNING)),

	API_TYPE_OR_CODE_NOT_ALLOWED(
			new RestError("business.412.003", BusinessErorMessageList.ERROR_MESSAGE_412_003, null, ErrorType.WARNING)),

	API_INVALID_KEY(
			new RestError("business.412.004", BusinessErorMessageList.ERROR_MESSAGE_412_004, null, ErrorType.WARNING)),

	API_INVALID_HANDICAP(
			new RestError("business.412.005", BusinessErorMessageList.ERROR_MESSAGE_412_005, null, ErrorType.WARNING)),

	API_DATA_NOT_FOUND(
			new RestError("business.412.006", BusinessErorMessageList.ERROR_MESSAGE_412_006, null, ErrorType.WARNING)),

	API_CUSTOMER_NOT_FOUND(
			new RestError("business.412.007", BusinessErorMessageList.ERROR_MESSAGE_412_007, null, ErrorType.WARNING)),

	API_INVALID_CODE(
			new RestError("business.412.008", BusinessErorMessageList.ERROR_MESSAGE_412_008, null, ErrorType.WARNING)),
	
	API_INVALID_TYPE(
			new RestError("business.412.009", BusinessErorMessageList.ERROR_MESSAGE_412_009, null, ErrorType.WARNING)),

	API_INVALID_APPLICATION(
			new RestError("business.412.010", BusinessErorMessageList.ERROR_MESSAGE_412_010, null, ErrorType.WARNING)),

	API_CODE_NOT_ALLOWED(
			new RestError("business.412.011", BusinessErorMessageList.ERROR_MESSAGE_412_011, null, ErrorType.WARNING)),

	API_PRESENT_MORE_THAN_ONCE(
			new RestError("business.412.012", BusinessErorMessageList.ERROR_MESSAGE_412_012, null, ErrorType.WARNING)),

	API_VALUE_TOO_LONG(
			new RestError("business.412.013", BusinessErorMessageList.ERROR_MESSAGE_412_013, null, ErrorType.WARNING)),

	API_VALUE_TOO_SHORT(
			new RestError("business.412.014", BusinessErorMessageList.ERROR_MESSAGE_412_014, null, ErrorType.WARNING)),

	API_INVALID_CUSTOMER(
			new RestError("business.412.015", BusinessErorMessageList.ERROR_MESSAGE_412_015, null, ErrorType.WARNING)),

	API_INVALID_TYPE_DATE(
			new RestError("business.412.016", BusinessErorMessageList.ERROR_MESSAGE_412_016, null, ErrorType.WARNING)),

	API_INVALID_TYPE_BOOLEAN(
			new RestError("business.412.017", BusinessErorMessageList.ERROR_MESSAGE_412_017, null, ErrorType.WARNING)),

	API_TOO_MUCH_TYPE(
			new RestError("business.412.018", BusinessErorMessageList.ERROR_MESSAGE_412_018, null, ErrorType.WARNING)),

	API_DUPLICATE_TYPE_CODE(
			new RestError("business.412.019", BusinessErorMessageList.ERROR_MESSAGE_412_019, null, ErrorType.WARNING)),
	
	API_KEY_IS_MANDATORY(
			new RestError("business.412.021", BusinessErorMessageList.ERROR_MESSAGE_412_021, null, ErrorType.WARNING)),
	
	API_KEY_NOT_FOUND(
			new RestError("business.412.022", BusinessErorMessageList.ERROR_MESSAGE_412_019, null, ErrorType.WARNING)),
	
	API_KEY_NOT_EXISTING(
			new RestError("business.412.020", BusinessErorMessageList.ERROR_MESSAGE_412_020, null, ErrorType.WARNING)),
	
	API_INVALID_BUSINESS_RULE(new RestError("business.412.004", "Invalid business rule", null, ErrorType.WARNING)),

	API_UNKNOWN_BUSINESS_ERROR(new RestError("business.005", "Business unknown error", null, ErrorType.WARNING)),

	API_BUSINESS_ERROR(new RestError("business.1000", "Business error generated by backend", null, ErrorType.WARNING));

	static Map<BusinessErrorList, RestError> enumMap = new EnumMap<>(BusinessErrorList.class);

	static {
		for (final BusinessErrorList element : values()) {
			enumMap.put(element, element.getError());
		}
	}

	

	public static void setEnumMap(final Map<BusinessErrorList, RestError> enumMap) {
		BusinessErrorList.enumMap = enumMap;
	}

	private RestError error;

	private BusinessErrorList(final RestError error) {
		this.error = error;
	}

	public RestError getError() {
		return error;
	}

}