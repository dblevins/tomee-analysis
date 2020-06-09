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
 * <p>Java-Klasse für beanType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="beanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="class" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}classType" minOccurs="0"/&gt;
 *         &lt;element name="field" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}fieldType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="getter" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}getterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="constructor" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}constructorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}methodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="ignore-annotations" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanType", propOrder = {
    "classType",
    "field",
    "getter",
    "constructor",
    "method"
})
public class BeanType {

    @XmlElement(name = "class")
    protected ClassType classType;
    protected List<FieldType> field;
    protected List<GetterType> getter;
    protected List<ConstructorType> constructor;
    protected List<MethodType> method;
    @XmlAttribute(name = "class", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "ignore-annotations")
    protected Boolean ignoreAnnotations;

    /**
     * Ruft den Wert der classType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClassType }
     *     
     */
    public ClassType getClassType() {
        return classType;
    }

    /**
     * Legt den Wert der classType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassType }
     *     
     */
    public void setClassType(ClassType value) {
        this.classType = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldType }
     * 
     * 
     */
    public List<FieldType> getField() {
        if (field == null) {
            field = new ArrayList<FieldType>();
        }
        return this.field;
    }

    /**
     * Gets the value of the getter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetterType }
     * 
     * 
     */
    public List<GetterType> getGetter() {
        if (getter == null) {
            getter = new ArrayList<GetterType>();
        }
        return this.getter;
    }

    /**
     * Gets the value of the constructor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructorType }
     * 
     * 
     */
    public List<ConstructorType> getConstructor() {
        if (constructor == null) {
            constructor = new ArrayList<ConstructorType>();
        }
        return this.constructor;
    }

    /**
     * Gets the value of the method property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the method property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodType }
     * 
     * 
     */
    public List<MethodType> getMethod() {
        if (method == null) {
            method = new ArrayList<MethodType>();
        }
        return this.method;
    }

    /**
     * Ruft den Wert der clazz-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Legt den Wert der clazz-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
        if (ignoreAnnotations == null) {
            return true;
        } else {
            return ignoreAnnotations;
        }
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
