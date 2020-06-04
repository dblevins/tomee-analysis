package asm.org.apache.activemq.thread;
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
public class DedicatedTaskRunner$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/thread/DedicatedTaskRunner$1", null, "java/lang/Thread", null);

classWriter.visitOuterClass("org/apache/activemq/thread/DedicatedTaskRunner", "<init>", "(Lorg/apache/activemq/thread/Task;Ljava/lang/String;IZ)V");

classWriter.visitInnerClass("org/apache/activemq/thread/DedicatedTaskRunner$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$task", "Lorg/apache/activemq/thread/Task;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/thread/DedicatedTaskRunner;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/thread/DedicatedTaskRunner;Ljava/lang/String;Lorg/apache/activemq/thread/Task;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/thread/DedicatedTaskRunner$1", "this$0", "Lorg/apache/activemq/thread/DedicatedTaskRunner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/thread/DedicatedTaskRunner$1", "val$task", "Lorg/apache/activemq/thread/Task;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/DedicatedTaskRunner$1", "this$0", "Lorg/apache/activemq/thread/DedicatedTaskRunner;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/thread/DedicatedTaskRunner", "runTask", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/DedicatedTaskRunner", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Run task done: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/DedicatedTaskRunner$1", "val$task", "Lorg/apache/activemq/thread/Task;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/DedicatedTaskRunner", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Run task done: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/DedicatedTaskRunner$1", "val$task", "Lorg/apache/activemq/thread/Task;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
