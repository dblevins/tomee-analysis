package asm.org.apache.openjpa.event;
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
public class TCPRemoteCommitProvider$BroadcastWorkerThreadDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", null, "java/lang/Thread", null);

classWriter.visitInnerClass("org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "org/apache/openjpa/event/TCPRemoteCommitProvider", "BroadcastWorkerThread", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/event/TCPRemoteCommitProvider$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastQueue", "org/apache/openjpa/event/TCPRemoteCommitProvider", "BroadcastQueue", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_keepRunning", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "_keepRunning", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "_keepRunning", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider", "access$1400", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider;)Lorg/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastQueue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastQueue", "removePacket", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider", "access$1500", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider;[B)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider", "access$1400", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider;)Lorg/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastQueue;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastQueue", "isClosed", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "_keepRunning", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "remove", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRunning", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "_keepRunning", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "this$0", "Lorg/apache/openjpa/event/TCPRemoteCommitProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/event/TCPRemoteCommitProvider", "access$1600", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider;Lorg/apache/openjpa/event/TCPRemoteCommitProvider$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/event/TCPRemoteCommitProvider$BroadcastWorkerThread", "<init>", "(Lorg/apache/openjpa/event/TCPRemoteCommitProvider;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
