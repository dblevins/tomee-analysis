//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.08.12 um 11:46:34 AM CEST 
//


package org.apache.bval.jsr.xml;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für constructorType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constructorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameter" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}parameterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cross-parameter" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}crossParameterType" minOccurs="0"/&gt;
 *         &lt;element name="return-value" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}returnValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ignore-annotations" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constructorType", propOrder = {
    "parameter",
    "crossParameter",
    "returnValue"
})
public class ConstructorType {

    protected List<ParameterType> parameter;
    @XmlElement(name = "cross-parameter")
    protected CrossParameterType crossParameter;
    @XmlElement(name = "return-value")
    protected ReturnValueType returnValue;
    @XmlAttribute(name = "ignore-annotations")
    protected Boolean ignoreAnnotations;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterType }
     * 
     * 
     */
    public List<ParameterType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ParameterType>();
        }
        return this.parameter;
    }

    /**
     * Ruft den Wert der crossParameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CrossParameterType }
     *     
     */
    public CrossParameterType getCrossParameter() {
        return crossParameter;
    }

    /**
     * Legt den Wert der crossParameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossParameterType }
     *     
     */
    public void setCrossParameter(CrossParameterType value) {
        this.crossParameter = value;
    }

    /**
     * Ruft den Wert der returnValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReturnValueType }
     *     
     */
    public ReturnValueType getReturnValue() {
        return returnValue;
    }

    /**
     * Legt den Wert der returnValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnValueType }
     *     
     */
    public void setReturnValue(ReturnValueType value) {
        this.returnValue = value;
    }

    /**
     * Ruft den Wert der ignoreAnnotations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreAnnotations() {
        return ignoreAnnotations;
    }

    /**
     * Legt den Wert der ignoreAnnotations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAnnotations(Boolean value) {
        this.ignoreAnnotations = value;
    }

}
