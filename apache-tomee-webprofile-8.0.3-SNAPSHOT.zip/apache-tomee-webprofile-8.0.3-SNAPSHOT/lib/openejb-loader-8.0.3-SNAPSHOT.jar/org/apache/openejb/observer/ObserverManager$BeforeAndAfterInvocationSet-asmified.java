package asm.org.apache.openejb.observer;
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
public class ObserverManager$BeforeAndAfterInvocationSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", null, "java/lang/Object", new String[] { "org/apache/openejb/observer/ObserverManager$Invocation" });

classWriter.visitInnerClass("org/apache/openejb/observer/ObserverManager$Invocation", "org/apache/openejb/observer/ObserverManager", "Invocation", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "org/apache/openejb/observer/ObserverManager", "BeforeAndAfterInvocationSet", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/observer/ObserverManager$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "before", "Lorg/apache/openejb/observer/ObserverManager$Invocation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "invoke", "Lorg/apache/openejb/observer/ObserverManager$Invocation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "after", "Lorg/apache/openejb/observer/ObserverManager$Invocation;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/observer/ObserverManager$Invocation;Lorg/apache/openejb/observer/ObserverManager$Invocation;Lorg/apache/openejb/observer/ObserverManager$Invocation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "before", "Lorg/apache/openejb/observer/ObserverManager$Invocation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "invoke", "Lorg/apache/openejb/observer/ObserverManager$Invocation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "after", "Lorg/apache/openejb/observer/ObserverManager$Invocation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "before", "Lorg/apache/openejb/observer/ObserverManager$Invocation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/observer/ObserverManager$Invocation", "invoke", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "invoke", "Lorg/apache/openejb/observer/ObserverManager$Invocation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/observer/ObserverManager$Invocation", "invoke", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "after", "Lorg/apache/openejb/observer/ObserverManager$Invocation;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/observer/ObserverManager$Invocation", "invoke", "(Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/observer/ObserverManager$Invocation;Lorg/apache/openejb/observer/ObserverManager$Invocation;Lorg/apache/openejb/observer/ObserverManager$Invocation;Lorg/apache/openejb/observer/ObserverManager$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/observer/ObserverManager$BeforeAndAfterInvocationSet", "<init>", "(Lorg/apache/openejb/observer/ObserverManager$Invocation;Lorg/apache/openejb/observer/ObserverManager$Invocation;Lorg/apache/openejb/observer/ObserverManager$Invocation;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
