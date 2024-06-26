
package com.afklm.repind.ws.w000842.data.schema571954;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Telecoms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telecoms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mediumStatus" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypeMediumStatus" minOccurs="0"/>
 *         &lt;element name="mediumCode" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypeMediumCode" minOccurs="0"/>
 *         &lt;element name="terminalType" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypeTerminal" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypeCountryCodeTelecom" minOccurs="0"/>
 *         &lt;element name="normalizedCountryCode" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypeCountryCodeTelecom" minOccurs="0"/>
 *         &lt;element name="regionCode" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypeRegionCodeTelecom" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypePhoneNumber" minOccurs="0"/>
 *         &lt;element name="normalizedPhoneNumber" type="{http://www.af-klm.com/services/passenger/ProspectDataType-v1/xsd}DTypePhoneNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telecoms", propOrder = {
    "mediumStatus",
    "mediumCode",
    "terminalType",
    "countryCode",
    "normalizedCountryCode",
    "regionCode",
    "phoneNumber",
    "normalizedPhoneNumber"
})
public class Telecoms {

    protected String mediumStatus;
    protected String mediumCode;
    protected String terminalType;
    protected String countryCode;
    protected String normalizedCountryCode;
    protected String regionCode;
    protected String phoneNumber;
    protected String normalizedPhoneNumber;

    /**
     * Gets the value of the mediumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumStatus() {
        return mediumStatus;
    }

    /**
     * Sets the value of the mediumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumStatus(String value) {
        this.mediumStatus = value;
    }

    /**
     * Gets the value of the mediumCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumCode() {
        return mediumCode;
    }

    /**
     * Sets the value of the mediumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumCode(String value) {
        this.mediumCode = value;
    }

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the normalizedCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedCountryCode() {
        return normalizedCountryCode;
    }

    /**
     * Sets the value of the normalizedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedCountryCode(String value) {
        this.normalizedCountryCode = value;
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the normalizedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizedPhoneNumber() {
        return normalizedPhoneNumber;
    }

    /**
     * Sets the value of the normalizedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizedPhoneNumber(String value) {
        this.normalizedPhoneNumber = value;
    }

}
