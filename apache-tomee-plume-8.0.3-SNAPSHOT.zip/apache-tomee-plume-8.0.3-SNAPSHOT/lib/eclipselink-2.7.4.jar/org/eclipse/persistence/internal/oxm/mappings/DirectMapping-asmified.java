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
public class DirectMappingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/mappings/DirectMapping", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ATTRIBUTE_ACCESSOR::Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;CONTAINER_POLICY::Lorg/eclipse/persistence/internal/core/queries/CoreContainerPolicy;CONVERTER::Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;DESCRIPTOR:Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;MARSHALLER:Lorg/eclipse/persistence/internal/oxm/Marshaller;SESSION::Lorg/eclipse/persistence/core/sessions/CoreSession;UNMARSHALLER:Lorg/eclipse/persistence/internal/oxm/Unmarshaller;XML_RECORD::Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;>Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping<TABSTRACT_SESSION;TATTRIBUTE_ACCESSOR;TCONTAINER_POLICY;TDESCRIPTOR;TFIELD;TXML_RECORD;>;Lorg/eclipse/persistence/internal/oxm/mappings/XMLConverterMapping<TMARSHALLER;TSESSION;TUNMARSHALLER;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/mappings/Mapping", "org/eclipse/persistence/internal/oxm/mappings/XMLConverterMapping" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/record/AbstractUnmarshalRecord;)Ljava/lang/Object;", "(Ljava/lang/Object;TABSTRACT_SESSION;Lorg/eclipse/persistence/internal/oxm/record/AbstractUnmarshalRecord;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConverter", "()Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;", "()TCONVERTER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFieldValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNullPolicy", "()Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNullValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObjectValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/core/sessions/CoreSession;)Ljava/lang/Object;", "(Ljava/lang/Object;TSESSION;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXPath", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasConverter", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isCDATA", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttributeClassification", "(Ljava/lang/Class;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttributeClassificationName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCollapsingStringValues", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setConverter", "(Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;)V", "(TCONVERTER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setField", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;)V", "(TFIELD;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIsCDATA", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIsWriteOnly", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNormalizingStringValues", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNullPolicy", "(Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNullValue", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNullValueMarshalled", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setXPath", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "valueFromObject", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/helper/CoreField;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljava/lang/Object;", "(Ljava/lang/Object;TFIELD;TABSTRACT_SESSION;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
