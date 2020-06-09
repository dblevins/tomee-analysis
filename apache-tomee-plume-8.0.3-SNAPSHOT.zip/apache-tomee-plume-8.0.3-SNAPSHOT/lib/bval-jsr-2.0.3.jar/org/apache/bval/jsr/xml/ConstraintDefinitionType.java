//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.08.12 um 11:46:34 AM CEST 
//


package org.apache.bval.jsr.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für constraint-definitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="constraint-definitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="validated-by" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}validated-byType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="annotation" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "constraint-definitionType", propOrder = {
    "validatedBy"
})
public class ConstraintDefinitionType {

    @XmlElement(name = "validated-by", required = true)
    protected ValidatedByType validatedBy;
    @XmlAttribute(name = "annotation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String annotation;

    /**
     * Ruft den Wert der validatedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidatedByType }
     *     
     */
    public ValidatedByType getValidatedBy() {
        return validatedBy;
    }

    /**
     * Legt den Wert der validatedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatedByType }
     *     
     */
    public void setValidatedBy(ValidatedByType value) {
        this.validatedBy = value;
    }

    /**
     * Ruft den Wert der annotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Legt den Wert der annotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

}
