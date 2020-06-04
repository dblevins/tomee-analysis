package asm.org.eclipse.persistence.internal.oxm.mappings;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class DescriptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Descriptor", "<ATTRIBUTE_ACCESSOR::Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;CORE_MAPPING:Lorg/eclipse/persistence/core/mappings/CoreMapping;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;INHERITANCE_POLICY:Lorg/eclipse/persistence/core/descriptors/CoreInheritancePolicy;INSTANTIATION_POLICY:Lorg/eclipse/persistence/internal/core/descriptors/CoreInstantiationPolicy;NAMESPACE_RESOLVER:Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;OBJECT_BUILDER:Lorg/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder;TABLE::Lorg/eclipse/persistence/internal/core/helper/CoreTable;UNMARSHAL_RECORD::Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;UNMARSHALLER:Lorg/eclipse/persistence/internal/oxm/Unmarshaller;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addMapping", "(Lorg/eclipse/persistence/core/mappings/CoreMapping;)Lorg/eclipse/persistence/core/mappings/CoreMapping;", "(TCORE_MAPPING;)TCORE_MAPPING;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPrimaryKeyField", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;)V", "(TFIELD;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addRootElement", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAlias", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultRootElement", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultRootElementType", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultRootElementField", "()Lorg/eclipse/persistence/internal/oxm/mappings/Field;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInheritancePolicy", "()Lorg/eclipse/persistence/core/descriptors/CoreInheritancePolicy;", "()TINHERITANCE_POLICY;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInheritancePolicyOrNull", "()Lorg/eclipse/persistence/core/descriptors/CoreInheritancePolicy;", "()TINHERITANCE_POLICY;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInstantiationPolicy", "()Lorg/eclipse/persistence/internal/core/descriptors/CoreInstantiationPolicy;", "()TINSTANTIATION_POLICY;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJavaClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJavaClassName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocationAccessor", "()Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;", "()TATTRIBUTE_ACCESSOR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMappingForAttributeName", "(Ljava/lang/String;)Lorg/eclipse/persistence/core/mappings/CoreMapping;", "(Ljava/lang/String;)TCORE_MAPPING;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMappings", "()Ljava/util/Vector;", "()Ljava/util/Vector<TCORE_MAPPING;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", "()TNAMESPACE_RESOLVER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNonNullNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", "()TNAMESPACE_RESOLVER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObjectBuilder", "()Lorg/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder;", "()TOBJECT_BUILDER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimaryKeyFieldNames", "()Ljava/util/Vector;", "()Ljava/util/Vector<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimaryKeyFields", "()Ljava/util/List;", "()Ljava/util/List<TFIELD;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchemaReference", "()Lorg/eclipse/persistence/oxm/schema/XMLSchemaReference;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTableNames", "()Ljava/util/Vector;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTables", "()Ljava/util/Vector;", "()Ljava/util/Vector<TTABLE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypedField", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;)Lorg/eclipse/persistence/internal/core/helper/CoreField;", "(TFIELD;)TFIELD;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasInheritance", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isLazilyInitialized", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isResultAlwaysXMLRoot", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isSequencedObject", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isWrapper", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDefaultRootElement", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setInstantiationPolicy", "(Lorg/eclipse/persistence/internal/core/descriptors/CoreInstantiationPolicy;)V", "(TINSTANTIATION_POLICY;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJavaClass", "(Ljava/lang/Class;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJavaClassName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLocationAccessor", "(Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;)V", "(TATTRIBUTE_ACCESSOR;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNamespaceResolver", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProperties", "(Ljava/util/Map;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setResultAlwaysXMLRoot", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSchemaReference", "(Lorg/eclipse/persistence/oxm/schema/XMLSchemaReference;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shouldPreserveDocument", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wrapObjectInXMLRoot", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLorg/eclipse/persistence/internal/oxm/Unmarshaller;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZTUNMARSHALLER;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wrapObjectInXMLRoot", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLorg/eclipse/persistence/internal/oxm/Unmarshaller;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZTUNMARSHALLER;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "wrapObjectInXMLRoot", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Z)Ljava/lang/Object;", "(TUNMARSHAL_RECORD;Z)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeGroup", "(Ljava/lang/String;)Lorg/eclipse/persistence/core/queries/CoreAttributeGroup;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
