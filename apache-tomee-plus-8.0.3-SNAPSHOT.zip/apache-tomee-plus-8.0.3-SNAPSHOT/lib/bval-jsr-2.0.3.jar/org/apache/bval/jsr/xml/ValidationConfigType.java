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
 * <p>Java-Klasse für validation-configType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="validation-configType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="default-provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message-interpolator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="traversable-resolver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="constraint-validator-factory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parameter-name-provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clock-provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value-extractor" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="executable-validation" type="{http://xmlns.jcp.org/xml/ns/validation/configuration}executable-validationType" minOccurs="0"/&gt;
 *         &lt;element name="constraint-mapping" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{http://xmlns.jcp.org/xml/ns/validation/configuration}propertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://xmlns.jcp.org/xml/ns/validation/configuration}versionType" fixed="2.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validation-configType", namespace = "http://xmlns.jcp.org/xml/ns/validation/configuration", propOrder = {
    "defaultProvider",
    "messageInterpolator",
    "traversableResolver",
    "constraintValidatorFactory",
    "parameterNameProvider",
    "clockProvider",
    "valueExtractor",
    "executableValidation",
    "constraintMapping",
    "property"
})
public class ValidationConfigType {

    @XmlElement(name = "default-provider")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String defaultProvider;
    @XmlElement(name = "message-interpolator")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String messageInterpolator;
    @XmlElement(name = "traversable-resolver")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String traversableResolver;
    @XmlElement(name = "constraint-validator-factory")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String constraintValidatorFactory;
    @XmlElement(name = "parameter-name-provider")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String parameterNameProvider;
    @XmlElement(name = "clock-provider")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String clockProvider;
    @XmlElement(name = "value-extractor")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected List<String> valueExtractor;
    @XmlElement(name = "executable-validation")
    protected ExecutableValidationType executableValidation;
    @XmlElement(name = "constraint-mapping")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected List<String> constraintMapping;
    protected List<PropertyType> property;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter.class)
    protected String version;

    /**
     * Ruft den Wert der defaultProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultProvider() {
        return defaultProvider;
    }

    /**
     * Legt den Wert der defaultProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultProvider(String value) {
        this.defaultProvider = value;
    }

    /**
     * Ruft den Wert der messageInterpolator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageInterpolator() {
        return messageInterpolator;
    }

    /**
     * Legt den Wert der messageInterpolator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageInterpolator(String value) {
        this.messageInterpolator = value;
    }

    /**
     * Ruft den Wert der traversableResolver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraversableResolver() {
        return traversableResolver;
    }

    /**
     * Legt den Wert der traversableResolver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraversableResolver(String value) {
        this.traversableResolver = value;
    }

    /**
     * Ruft den Wert der constraintValidatorFactory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstraintValidatorFactory() {
        return constraintValidatorFactory;
    }

    /**
     * Legt den Wert der constraintValidatorFactory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstraintValidatorFactory(String value) {
        this.constraintValidatorFactory = value;
    }

    /**
     * Ruft den Wert der parameterNameProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterNameProvider() {
        return parameterNameProvider;
    }

    /**
     * Legt den Wert der parameterNameProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterNameProvider(String value) {
        this.parameterNameProvider = value;
    }

    /**
     * Ruft den Wert der clockProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockProvider() {
        return clockProvider;
    }

    /**
     * Legt den Wert der clockProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockProvider(String value) {
        this.clockProvider = value;
    }

    /**
     * Gets the value of the valueExtractor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueExtractor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueExtractor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValueExtractor() {
        if (valueExtractor == null) {
            valueExtractor = new ArrayList<String>();
        }
        return this.valueExtractor;
    }

    /**
     * Ruft den Wert der executableValidation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutableValidationType }
     *     
     */
    public ExecutableValidationType getExecutableValidation() {
        return executableValidation;
    }

    /**
     * Legt den Wert der executableValidation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutableValidationType }
     *     
     */
    public void setExecutableValidation(ExecutableValidationType value) {
        this.executableValidation = value;
    }

    /**
     * Gets the value of the constraintMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraintMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraintMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getConstraintMapping() {
        if (constraintMapping == null) {
            constraintMapping = new ArrayList<String>();
        }
        return this.constraintMapping;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<PropertyType>();
        }
        return this.property;
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
