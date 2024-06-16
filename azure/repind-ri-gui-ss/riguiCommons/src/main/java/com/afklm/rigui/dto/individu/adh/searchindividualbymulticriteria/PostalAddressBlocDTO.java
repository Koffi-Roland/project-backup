package com.afklm.rigui.dto.individu.adh.searchindividualbymulticriteria;

/*PROTECTED REGION ID(_PChIIAfZEeegsNhfbw3UgQ i) ENABLED START*/

// add not generated imports here

import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;


/*PROTECTED REGION END*/

/**
 * <p>Title : PostalAddressBlocDTO</p>
 * 
 * <p>Copyright : Copyright (c) 2009</p>
 * <p>Company : AIRFRANCE</p>
 */
	public  class PostalAddressBlocDTO implements Serializable {


        
    /**
     * numberAndStreet
     */
    private String numberAndStreet;
        
        
    /**
     * city
     */
    private String city;
        
        
    /**
     * zipCode
     */
    private String zipCode;
        
        
    /**
     * countryCode
     */
    private String countryCode;
        
        
    /**
     * citySearchType
     */
    private String citySearchType;
        
        
    /**
     * zipCodeSearchType
     */
    private String zipCodeSearchType;
        
        
    /**
     * additionalInformation
     */
    private String additionalInformation;
        

    /*PROTECTED REGION ID(_PChIIAfZEeegsNhfbw3UgQ u var) ENABLED START*/
    // add your custom variables here if necessary
    
     /**
   * Determines if a de-serialized file is compatible with this class.
   *
   * Maintainers must change this value if and only if the new version
   * of this class is not compatible with old versions. See Sun docs
   * for <a href=http://java.sun.com/j2se/1.5.0/docs/guide/serialization
   * /serialization/spec/class.html#4100> details. </a>
   *
   * Not necessary to include in first version of the class, but
   * included here as a reminder of its importance.
   */
    private static final long serialVersionUID = 1L;
    
    /*PROTECTED REGION END*/

    
	    
	    /** 
	     * default constructor 
	     */
	    public PostalAddressBlocDTO() {
	    //empty constructor
	    }
	    
    /**
     *
     * @return additionalInformation
     */
    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    /**
     *
     * @param pAdditionalInformation additionalInformation value
     */
    public void setAdditionalInformation(String pAdditionalInformation) {
        this.additionalInformation = pAdditionalInformation;
    }

    /**
     *
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     *
     * @param pCity city value
     */
    public void setCity(String pCity) {
        this.city = pCity;
    }

    /**
     *
     * @return citySearchType
     */
    public String getCitySearchType() {
        return this.citySearchType;
    }

    /**
     *
     * @param pCitySearchType citySearchType value
     */
    public void setCitySearchType(String pCitySearchType) {
        this.citySearchType = pCitySearchType;
    }

    /**
     *
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     *
     * @param pCountryCode countryCode value
     */
    public void setCountryCode(String pCountryCode) {
        this.countryCode = pCountryCode;
    }

    /**
     *
     * @return numberAndStreet
     */
    public String getNumberAndStreet() {
        return this.numberAndStreet;
    }

    /**
     *
     * @param pNumberAndStreet numberAndStreet value
     */
    public void setNumberAndStreet(String pNumberAndStreet) {
        this.numberAndStreet = pNumberAndStreet;
    }

    /**
     *
     * @return zipCode
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     *
     * @param pZipCode zipCode value
     */
    public void setZipCode(String pZipCode) {
        this.zipCode = pZipCode;
    }

    /**
     *
     * @return zipCodeSearchType
     */
    public String getZipCodeSearchType() {
        return this.zipCodeSearchType;
    }

    /**
     *
     * @param pZipCodeSearchType zipCodeSearchType value
     */
    public void setZipCodeSearchType(String pZipCodeSearchType) {
        this.zipCodeSearchType = pZipCodeSearchType;
    }

    /**
     *
     * @return object as string
     */
    public String toString() {
        String result = null;
        /*PROTECTED REGION ID(toString_PChIIAfZEeegsNhfbw3UgQ) ENABLED START*/
        result = toStringImpl();
        /*PROTECTED REGION END*/
        return result;
    }

    /**
     *
     * @return object as string
     */
    public String toStringImpl() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName());
        buffer.append("@").append(Integer.toHexString(System.identityHashCode(this)));
        buffer.append("[");
        buffer.append("numberAndStreet=").append(getNumberAndStreet());
        buffer.append(",");
        buffer.append("city=").append(getCity());
        buffer.append(",");
        buffer.append("zipCode=").append(getZipCode());
        buffer.append(",");
        buffer.append("countryCode=").append(getCountryCode());
        buffer.append(",");
        buffer.append("citySearchType=").append(getCitySearchType());
        buffer.append(",");
        buffer.append("zipCodeSearchType=").append(getZipCodeSearchType());
        buffer.append(",");
        buffer.append("additionalInformation=").append(getAdditionalInformation());
        buffer.append("]");
        return buffer.toString();
    }

    /*PROTECTED REGION ID(_PChIIAfZEeegsNhfbw3UgQ u m) ENABLED START*/
    // add your custom methods here if necessary
    public boolean isEmpty() {
    	return StringUtils.isEmpty(this.numberAndStreet) && StringUtils.isEmpty(this.city) && StringUtils.isEmpty(this.zipCode) && 
    			StringUtils.isEmpty(this.countryCode) && StringUtils.isEmpty(this.additionalInformation);
    }
    /*PROTECTED REGION END*/

}