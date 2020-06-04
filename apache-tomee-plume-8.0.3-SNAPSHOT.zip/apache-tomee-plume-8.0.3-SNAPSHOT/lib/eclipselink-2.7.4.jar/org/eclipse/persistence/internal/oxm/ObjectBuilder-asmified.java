package asm.org.eclipse.persistence.internal.oxm;
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
public class ObjectBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/ObjectBuilder", "<ABSTRACT_RECORD:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractRecord;ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;DESCRIPTOR:Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;MARSHALLER:Lorg/eclipse/persistence/internal/oxm/Marshaller;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addClassIndicatorFieldToRow", "(Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addExtraNamespacesToNamespaceResolver", "(Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;ZZ)Ljava/util/List;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildNewInstance", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildRow", "(Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/Marshaller;Lorg/eclipse/persistence/internal/oxm/XPathFragment;)Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;", "(Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;TMARSHALLER;Lorg/eclipse/persistence/internal/oxm/XPathFragment;)Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "classFromRow", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljava/lang/Class;", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;TABSTRACT_SESSION;)Ljava/lang/Class;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createRecord", "(Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractRecord;", "(TABSTRACT_SESSION;)TABSTRACT_RECORD;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "extractPrimaryKeyFromObject", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljava/lang/Object;", "(Ljava/lang/Object;TABSTRACT_SESSION;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContainerValues", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/ContainerValue;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultEmptyContainerValues", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/ContainerValue;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDescriptor", "()Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;", "()TDESCRIPTOR;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNullCapableValues", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/NullCapableValue;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRootXPathNode", "()Lorg/eclipse/persistence/internal/oxm/XPathNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransformationMappings", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/mappings/TransformationMapping;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isXsiTypeIndicatorField", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "marshalAttributes", "(Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
