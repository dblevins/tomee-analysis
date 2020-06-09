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


/**
 * <p>Java-Klasse für executable-validationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="executable-validationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="default-validated-executable-types" type="{http://xmlns.jcp.org/xml/ns/validation/configuration}default-validated-executable-typesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executable-validationType", namespace = "http://xmlns.jcp.org/xml/ns/validation/configuration", propOrder = {
    "defaultValidatedExecutableTypes"
})
public class ExecutableValidationType {

    @XmlElement(name = "default-validated-executable-types")
    protected DefaultValidatedExecutableTypesType defaultValidatedExecutableTypes;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;

    /**
     * Ruft den Wert der defaultValidatedExecutableTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValidatedExecutableTypesType }
     *     
     */
    public DefaultValidatedExecutableTypesType getDefaultValidatedExecutableTypes() {
        return defaultValidatedExecutableTypes;
    }

    /**
     * Legt den Wert der defaultValidatedExecutableTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValidatedExecutableTypesType }
     *     
     */
    public void setDefaultValidatedExecutableTypes(DefaultValidatedExecutableTypesType value) {
        this.defaultValidatedExecutableTypes = value;
    }

    /**
     * Ruft den Wert der enabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * Legt den Wert der enabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

}
