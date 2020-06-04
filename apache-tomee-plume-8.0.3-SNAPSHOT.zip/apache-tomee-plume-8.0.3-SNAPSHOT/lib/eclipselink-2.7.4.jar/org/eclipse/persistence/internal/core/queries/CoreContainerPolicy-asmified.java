package asm.org.eclipse.persistence.internal.core.queries;
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
public class CoreContainerPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/core/queries/CoreContainerPolicy", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addInto", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Z", "(Ljava/lang/Object;Ljava/lang/Object;TABSTRACT_SESSION;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addInto", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Z", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;TABSTRACT_SESSION;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clear", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "containerInstance", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "contains", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Z", "(Ljava/lang/Object;Ljava/lang/Object;TABSTRACT_SESSION;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasNext", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isEmpty", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isListPolicy", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "iteratorFor", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "next", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljava/lang/Object;", "(Ljava/lang/Object;TABSTRACT_SESSION;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nextEntry", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nextEntry", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljava/lang/Object;", "(Ljava/lang/Object;TABSTRACT_SESSION;)Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeFrom", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Z", "(Ljava/lang/Object;Ljava/lang/Object;TABSTRACT_SESSION;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setContainerClass", "(Ljava/lang/Class;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sizeFor", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "vectorFor", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljava/util/Vector;", "(Ljava/lang/Object;TABSTRACT_SESSION;)Ljava/util/Vector;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "containerInstance", "(I)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
