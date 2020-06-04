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
public class TransformationMappingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/mappings/TransformationMapping", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ATTRIBUTE_ACCESSOR::Lorg/eclipse/persistence/core/mappings/CoreAttributeAccessor;CONTAINER_POLICY::Lorg/eclipse/persistence/internal/core/queries/CoreContainerPolicy;DESCRIPTOR:Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;TRANSFORMATION_RECORD::Lorg/eclipse/persistence/internal/oxm/record/TransformationRecord;XML_RECORD::Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;>Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping<TABSTRACT_SESSION;TATTRIBUTE_ACCESSOR;TCONTAINER_POLICY;TDESCRIPTOR;TFIELD;TXML_RECORD;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/mappings/Mapping" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFieldTransformation", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFieldTransformerClassName", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFieldToTransformers", "()Ljava/util/List;", "()Ljava/util/List<[Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readFromRowIntoObject", "(Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Z)Ljava/lang/Object;", "(TXML_RECORD;Ljava/lang/Object;TABSTRACT_SESSION;Z)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttributeTransformation", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttributeTransformerClassName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIsOptional", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeFromAttributeIntoRow", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/Object;Z)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
