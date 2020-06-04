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
public class ObserverManager$BeforeInvocationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/observer/ObserverManager$BeforeInvocation", null, "org/apache/openejb/observer/ObserverManager$MethodInvocation", null);

classWriter.visitInnerClass("org/apache/openejb/observer/ObserverManager$BeforeInvocation", "org/apache/openejb/observer/ObserverManager", "BeforeInvocation", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/observer/ObserverManager$BeforeInvocation$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/observer/ObserverManager$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/observer/ObserverManager$MethodInvocation", "org/apache/openejb/observer/ObserverManager", "MethodInvocation", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/observer/ObserverManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/observer/ObserverManager;Ljava/lang/reflect/Method;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/observer/ObserverManager$BeforeInvocation", "this$0", "Lorg/apache/openejb/observer/ObserverManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/observer/ObserverManager$MethodInvocation", "<init>", "(Lorg/apache/openejb/observer/ObserverManager;Ljava/lang/reflect/Method;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/observer/ObserverManager$BeforeInvocation$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/observer/ObserverManager$BeforeInvocation$1", "<init>", "(Lorg/apache/openejb/observer/ObserverManager$BeforeInvocation;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/observer/ObserverManager$MethodInvocation", "invoke", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/observer/ObserverManager;Ljava/lang/reflect/Method;Ljava/lang/Object;Lorg/apache/openejb/observer/ObserverManager$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/observer/ObserverManager$BeforeInvocation", "<init>", "(Lorg/apache/openejb/observer/ObserverManager;Ljava/lang/reflect/Method;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
