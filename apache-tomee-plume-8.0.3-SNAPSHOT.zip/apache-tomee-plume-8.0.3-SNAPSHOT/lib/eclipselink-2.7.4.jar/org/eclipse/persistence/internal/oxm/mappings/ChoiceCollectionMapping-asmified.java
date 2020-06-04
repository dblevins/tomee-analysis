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
public class ChoiceCollectionMappingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ATTRIBUTE_ACCESSOR::Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;CONTAINER_POLICY::Lorg/eclipse/persistence/internal/core/queries/CoreContainerPolicy;CONVERTER::Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;DESCRIPTOR:Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;MARSHALLER:Lorg/eclipse/persistence/internal/oxm/Marshaller;SESSION::Lorg/eclipse/persistence/core/sessions/CoreSession;UNMARSHALLER:Lorg/eclipse/persistence/internal/oxm/Unmarshaller;XML_FIELD::Lorg/eclipse/persistence/internal/oxm/mappings/Field;XML_MAPPING::Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;XML_RECORD::Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;>Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping<TABSTRACT_SESSION;TATTRIBUTE_ACCESSOR;TCONTAINER_POLICY;TDESCRIPTOR;TFIELD;TXML_RECORD;>;Lorg/eclipse/persistence/internal/oxm/mappings/XMLContainerMapping;Lorg/eclipse/persistence/internal/oxm/mappings/XMLConverterMapping<TMARSHALLER;TSESSION;TUNMARSHALLER;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/mappings/Mapping", "org/eclipse/persistence/internal/oxm/mappings/XMLContainerMapping", "org/eclipse/persistence/internal/oxm/mappings/XMLConverterMapping" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChoiceElement", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/util/List<TXML_FIELD;>;Ljava/lang/String;Ljava/util/List<TXML_FIELD;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChoiceElement", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChoiceElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChoiceElement", "(Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/String;)V", "(TXML_FIELD;Ljava/lang/String;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addConverter", "(Lorg/eclipse/persistence/internal/oxm/mappings/Field;Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;)V", "(TXML_FIELD;TCONVERTER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChoiceElementMappings", "()Ljava/util/Map;", "()Ljava/util/Map<TXML_FIELD;TXML_MAPPING;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChoiceElementMappingsByClass", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;TXML_MAPPING;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChoiceFieldToClassAssociations", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/XMLChoiceFieldToClassAssociation;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassNameToFieldMappings", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;TXML_FIELD;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassToFieldMappings", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;TXML_FIELD;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClassToSourceFieldsMappings", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/Class;Ljava/util/List<TXML_FIELD;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConverter", "()Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;", "()TCONVERTER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConverter", "(Lorg/eclipse/persistence/internal/oxm/mappings/Field;)Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;", "(TXML_FIELD;)TCONVERTER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFieldToClassMappings", "()Ljava/util/Map;", "()Ljava/util/Map<TXML_FIELD;Ljava/lang/Class;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMixedContentMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;", "()TXML_MAPPING;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isMixedContent", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setConverter", "(Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;)V", "(TCONVERTER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIsWriteOnly", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMixedContent", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMixedContent", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "useCollectionClassName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAny", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAnyMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/AnyCollectionMapping;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
