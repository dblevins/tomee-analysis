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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für getterType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="convert-group" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}groupConversionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="container-element-type" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}containerElementTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="constraint" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}constraintType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ignore-annotations" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getterType", propOrder = {
    "valid",
    "convertGroup",
    "containerElementType",
    "constraint"
})
public class GetterType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valid;
    @XmlElement(name = "convert-group")
    protected List<GroupConversionType> convertGroup;
    @XmlElement(name = "container-element-type")
    protected List<ContainerElementTypeType> containerElementType;
    protected List<ConstraintType> constraint;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "ignore-annotations")
    protected Boolean ignoreAnnotations;

    /**
     * Ruft den Wert der valid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValid() {
        return valid;
    }

    /**
     * Legt den Wert der valid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValid(String value) {
        this.valid = value;
    }

    /**
     * Gets the value of the convertGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the convertGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConvertGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupConversionType }
     * 
     * 
     */
    public List<GroupConversionType> getConvertGroup() {
        if (convertGroup == null) {
            convertGroup = new ArrayList<GroupConversionType>();
        }
        return this.convertGroup;
    }

    /**
     * Gets the value of the containerElementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerElementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerElementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerElementTypeType }
     * 
     * 
     */
    public List<ContainerElementTypeType> getContainerElementType() {
        if (containerElementType == null) {
            containerElementType = new ArrayList<ContainerElementTypeType>();
        }
        return this.containerElementType;
    }

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintType }
     * 
     * 
     */
    public List<ConstraintType> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<ConstraintType>();
        }
        return this.constraint;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
