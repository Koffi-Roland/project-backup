
package com.afklm.repind.ws.createorupdateindividualdata.v08.data.response;

import com.afklm.repind.ws.createorupdateindividualdata.siccommontype.siccommontype.Signature;
import com.afklm.repind.ws.createorupdateindividualdata.sicindividutype.PostalAddressContent;
import com.afklm.repind.ws.createorupdateindividualdata.sicindividutype.PostalAddressProperties;
import com.afklm.repind.ws.createorupdateindividualdata.sicindividutype.UsageAddress;
import com.afklm.repind.ws.createorupdateindividualdata.softcomputingtype.SoftComputingResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PostalAddressResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageAddress" type="{http://www.af-klm.com/services/passenger/SicIndividuType-v3/xsd}UsageAddress" maxOccurs="255" minOccurs="0"/>
 *         &lt;element name="softComputingResponse" type="{http://www.af-klm.com/services/passenger/SoftComputingType-v1/xsd}SoftComputingResponse" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.af-klm.com/services/passenger/SicCommonType-v1/xsd}Signature" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="postalAddressProperties" type="{http://www.af-klm.com/services/passenger/SicIndividuType-v3/xsd}PostalAddressProperties" minOccurs="0"/>
 *         &lt;element name="postalAddressContent" type="{http://www.af-klm.com/services/passenger/SicIndividuType-v3/xsd}PostalAddressContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressResponse", propOrder = {
    "usageAddress",
    "softComputingResponse",
    "signature",
    "postalAddressProperties",
    "postalAddressContent"
})
public class PostalAddressResponse {

    protected List<UsageAddress> usageAddress;
    protected SoftComputingResponse softComputingResponse;
    protected List<Signature> signature;
    protected PostalAddressProperties postalAddressProperties;
    protected PostalAddressContent postalAddressContent;

    /**
     * Gets the value of the usageAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageAddress }
     * 
     * 
     */
    public List<UsageAddress> getUsageAddress() {
        if (usageAddress == null) {
            usageAddress = new ArrayList<UsageAddress>();
        }
        return this.usageAddress;
    }

    /**
     * Gets the value of the softComputingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SoftComputingResponse }
     *     
     */
    public SoftComputingResponse getSoftComputingResponse() {
        return softComputingResponse;
    }

    /**
     * Sets the value of the softComputingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftComputingResponse }
     *     
     */
    public void setSoftComputingResponse(SoftComputingResponse value) {
        this.softComputingResponse = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signature }
     * 
     * 
     */
    public List<Signature> getSignature() {
        if (signature == null) {
            signature = new ArrayList<Signature>();
        }
        return this.signature;
    }

    /**
     * Gets the value of the postalAddressProperties property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressProperties }
     *     
     */
    public PostalAddressProperties getPostalAddressProperties() {
        return postalAddressProperties;
    }

    /**
     * Sets the value of the postalAddressProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressProperties }
     *     
     */
    public void setPostalAddressProperties(PostalAddressProperties value) {
        this.postalAddressProperties = value;
    }

    /**
     * Gets the value of the postalAddressContent property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressContent }
     *     
     */
    public PostalAddressContent getPostalAddressContent() {
        return postalAddressContent;
    }

    /**
     * Sets the value of the postalAddressContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressContent }
     *     
     */
    public void setPostalAddressContent(PostalAddressContent value) {
        this.postalAddressContent = value;
    }

}