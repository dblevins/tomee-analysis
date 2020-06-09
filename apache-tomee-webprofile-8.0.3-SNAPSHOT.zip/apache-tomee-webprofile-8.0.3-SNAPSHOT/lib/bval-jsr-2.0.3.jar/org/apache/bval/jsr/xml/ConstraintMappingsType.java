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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für constraint-mappingsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constraint-mappingsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="default-package" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bean" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}beanType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="constraint-definition" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}constraint-definitionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}versionType" fixed="2.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constraint-mappingsType", propOrder = {
    "defaultPackage",
    "bean",
    "constraintDefinition"
})
public class ConstraintMappingsType {

    @XmlElement(name = "default-package")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String defaultPackage;
    protected List<BeanType> bean;
    @XmlElement(name = "constraint-definition")
    protected List<ConstraintDefinitionType> constraintDefinition;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String version;

    /**
     * Ruft den Wert der defaultPackage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPackage() {
        return defaultPackage;
    }

    /**
     * Legt den Wert der defaultPackage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPackage(String value) {
        this.defaultPackage = value;
    }

    /**
     * Gets the value of the bean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeanType }
     * 
     * 
     */
    public List<BeanType> getBean() {
        if (bean == null) {
            bean = new ArrayList<BeanType>();
        }
        return this.bean;
    }

    /**
     * Gets the value of the constraintDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraintDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraintDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstraintDefinitionType }
     * 
     * 
     */
    public List<ConstraintDefinitionType> getConstraintDefinition() {
        if (constraintDefinition == null) {
            constraintDefinition = new ArrayList<ConstraintDefinitionType>();
        }
        return this.constraintDefinition;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
