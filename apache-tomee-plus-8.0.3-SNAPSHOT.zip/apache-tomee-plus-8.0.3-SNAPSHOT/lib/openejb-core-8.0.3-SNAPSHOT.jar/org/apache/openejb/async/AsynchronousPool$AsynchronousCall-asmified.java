package asm.org.apache.openejb.async;
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
public class AsynchronousPool$AsynchronousCallDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Object;>;", "java/lang/Object", new String[] { "java/util/concurrent/Callable" });

classWriter.visitInnerClass("org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "org/apache/openejb/async/AsynchronousPool", "AsynchronousCall", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/async/AsynchronousPool$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "callable", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Callable<Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "asynchronousCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/async/AsynchronousPool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/async/AsynchronousPool;Ljava/util/concurrent/Callable;Ljava/util/concurrent/atomic/AtomicBoolean;)V", "(Ljava/util/concurrent/Callable<Ljava/lang/Object;>;Ljava/util/concurrent/atomic/AtomicBoolean;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "this$0", "Lorg/apache/openejb/async/AsynchronousPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "callable", "Ljava/util/concurrent/Callable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "asynchronousCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "asynchronousCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "initAsynchronousCancelled", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "callable", "Ljava/util/concurrent/Callable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Callable", "call", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/concurrent/Future");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/concurrent/Future");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "removeAsynchronousCancelled", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "removeAsynchronousCancelled", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/openejb/async/AsynchronousPool$AsynchronousCall"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ThreadContext", "removeAsynchronousCancelled", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/async/AsynchronousPool;Ljava/util/concurrent/Callable;Ljava/util/concurrent/atomic/AtomicBoolean;Lorg/apache/openejb/async/AsynchronousPool$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/async/AsynchronousPool$AsynchronousCall", "<init>", "(Lorg/apache/openejb/async/AsynchronousPool;Ljava/util/concurrent/Callable;Ljava/util/concurrent/atomic/AtomicBoolean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
