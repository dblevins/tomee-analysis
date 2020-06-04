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
public class VariableXPathObjectMappingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/mappings/VariableXPathObjectMapping", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ATTRIBUTE_ACCESSOR::Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;CONTAINER_POLICY::Lorg/eclipse/persistence/internal/core/queries/CoreContainerPolicy;CONVERTER::Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;DESCRIPTOR:Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;MARSHALLER:Lorg/eclipse/persistence/internal/oxm/Marshaller;SESSION::Lorg/eclipse/persistence/core/sessions/CoreSession;UNMARSHALLER:Lorg/eclipse/persistence/internal/oxm/Unmarshaller;XML_RECORD::Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;>Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping<TABSTRACT_SESSION;TATTRIBUTE_ACCESSOR;TCONTAINER_POLICY;TDESCRIPTOR;TFIELD;TXML_RECORD;>;Lorg/eclipse/persistence/internal/oxm/mappings/XMLConverterMapping<TMARSHALLER;TSESSION;TUNMARSHALLER;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/mappings/Mapping", "org/eclipse/persistence/internal/oxm/mappings/XMLConverterMapping" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVariableAttributeAccessor", "()Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;", "()TATTRIBUTE_ACCESSOR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXPathFragmentForValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;ZC)Lorg/eclipse/persistence/internal/oxm/XPathFragment;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAttribute", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttribute", "(Z)V", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setReferenceClassName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setVariableAttributeAccessor", "(Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;)V", "(TATTRIBUTE_ACCESSOR;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setVariableAttributeName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setVariableGetMethodName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setVariableSetMethodName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
