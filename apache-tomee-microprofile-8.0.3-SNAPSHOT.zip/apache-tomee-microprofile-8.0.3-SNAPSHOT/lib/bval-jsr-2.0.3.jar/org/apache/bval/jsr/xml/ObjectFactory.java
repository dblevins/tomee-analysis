//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.08.12 um 11:46:34 AM CEST 
//


package org.apache.bval.jsr.xml;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.bval.jsr.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidationConfig_QNAME = new QName("http://xmlns.jcp.org/xml/ns/validation/configuration", "validation-config");
    private final static QName _ConstraintMappings_QNAME = new QName("http://xmlns.jcp.org/xml/ns/validation/mapping", "constraint-mappings");
    private final static QName _ElementTypeValue_QNAME = new QName("http://xmlns.jcp.org/xml/ns/validation/mapping", "value");
    private final static QName _ElementTypeAnnotation_QNAME = new QName("http://xmlns.jcp.org/xml/ns/validation/mapping", "annotation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.bval.jsr.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidationConfigType }
     * 
     */
    public ValidationConfigType createValidationConfigType() {
        return new ValidationConfigType();
    }

    /**
     * Create an instance of {@link ExecutableValidationType }
     * 
     */
    public ExecutableValidationType createExecutableValidationType() {
        return new ExecutableValidationType();
    }

    /**
     * Create an instance of {@link DefaultValidatedExecutableTypesType }
     * 
     */
    public DefaultValidatedExecutableTypesType createDefaultValidatedExecutableTypesType() {
        return new DefaultValidatedExecutableTypesType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link ConstraintMappingsType }
     * 
     */
    public ConstraintMappingsType createConstraintMappingsType() {
        return new ConstraintMappingsType();
    }

    /**
     * Create an instance of {@link PayloadType }
     * 
     */
    public PayloadType createPayloadType() {
        return new PayloadType();
    }

    /**
     * Create an instance of {@link GroupsType }
     * 
     */
    public GroupsType createGroupsType() {
        return new GroupsType();
    }

    /**
     * Create an instance of {@link GroupSequenceType }
     * 
     */
    public GroupSequenceType createGroupSequenceType() {
        return new GroupSequenceType();
    }

    /**
     * Create an instance of {@link GroupConversionType }
     * 
     */
    public GroupConversionType createGroupConversionType() {
        return new GroupConversionType();
    }

    /**
     * Create an instance of {@link ValidatedByType }
     * 
     */
    public ValidatedByType createValidatedByType() {
        return new ValidatedByType();
    }

    /**
     * Create an instance of {@link ConstraintType }
     * 
     */
    public ConstraintType createConstraintType() {
        return new ConstraintType();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link ContainerElementTypeType }
     * 
     */
    public ContainerElementTypeType createContainerElementTypeType() {
        return new ContainerElementTypeType();
    }

    /**
     * Create an instance of {@link ClassType }
     * 
     */
    public ClassType createClassType() {
        return new ClassType();
    }

    /**
     * Create an instance of {@link BeanType }
     * 
     */
    public BeanType createBeanType() {
        return new BeanType();
    }

    /**
     * Create an instance of {@link AnnotationType }
     * 
     */
    public AnnotationType createAnnotationType() {
        return new AnnotationType();
    }

    /**
     * Create an instance of {@link GetterType }
     * 
     */
    public GetterType createGetterType() {
        return new GetterType();
    }

    /**
     * Create an instance of {@link MethodType }
     * 
     */
    public MethodType createMethodType() {
        return new MethodType();
    }

    /**
     * Create an instance of {@link ConstructorType }
     * 
     */
    public ConstructorType createConstructorType() {
        return new ConstructorType();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link ReturnValueType }
     * 
     */
    public ReturnValueType createReturnValueType() {
        return new ReturnValueType();
    }

    /**
     * Create an instance of {@link CrossParameterType }
     * 
     */
    public CrossParameterType createCrossParameterType() {
        return new CrossParameterType();
    }

    /**
     * Create an instance of {@link ConstraintDefinitionType }
     * 
     */
    public ConstraintDefinitionType createConstraintDefinitionType() {
        return new ConstraintDefinitionType();
    }

    /**
     * Create an instance of {@link FieldType }
     * 
     */
    public FieldType createFieldType() {
        return new FieldType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationConfigType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationConfigType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/validation/configuration", name = "validation-config")
    public JAXBElement<ValidationConfigType> createValidationConfig(ValidationConfigType value) {
        return new JAXBElement<ValidationConfigType>(_ValidationConfig_QNAME, ValidationConfigType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstraintMappingsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConstraintMappingsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/validation/mapping", name = "constraint-mappings")
    public JAXBElement<ConstraintMappingsType> createConstraintMappings(ConstraintMappingsType value) {
        return new JAXBElement<ConstraintMappingsType>(_ConstraintMappings_QNAME, ConstraintMappingsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/validation/mapping", name = "value", scope = ElementType.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createElementTypeValue(String value) {
        return new JAXBElement<String>(_ElementTypeValue_QNAME, String.class, ElementType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnotationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnnotationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/validation/mapping", name = "annotation", scope = ElementType.class)
    public JAXBElement<AnnotationType> createElementTypeAnnotation(AnnotationType value) {
        return new JAXBElement<AnnotationType>(_ElementTypeAnnotation_QNAME, AnnotationType.class, ElementType.class, value);
    }

}
