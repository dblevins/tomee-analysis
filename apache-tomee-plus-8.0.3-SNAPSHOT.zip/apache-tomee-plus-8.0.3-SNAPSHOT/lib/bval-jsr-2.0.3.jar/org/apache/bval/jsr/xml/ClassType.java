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
 * <p>Java-Klasse für classType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="classType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="group-sequence" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}groupSequenceType" minOccurs="0"/&gt;
 *         &lt;element name="constraint" type="{http://xmlns.jcp.org/xml/ns/validation/mapping}constraintType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "classType", propOrder = {
    "groupSequence",
    "constraint"
})
public class ClassType {

    @XmlElement(name = "group-sequence")
    protected GroupSequenceType groupSequence;
    protected List<ConstraintType> constraint;
    @XmlAttribute(name = "ignore-annotations")
    protected Boolean ignoreAnnotations;

    /**
     * Ruft den Wert der groupSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupSequenceType }
     *     
     */
    public GroupSequenceType getGroupSequence() {
        return groupSequence;
    }

    /**
     * Legt den Wert der groupSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSequenceType }
     *     
     */
    public void setGroupSequence(GroupSequenceType value) {
        this.groupSequence = value;
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
