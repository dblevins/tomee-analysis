package asm.jakarta.jms;
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
public class QueueRequestorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "jakarta/jms/QueueRequestor", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "session", "Ljakarta/jms/QueueSession;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "temporaryQueue", "Ljakarta/jms/TemporaryQueue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sender", "Ljakarta/jms/QueueSender;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "receiver", "Ljakarta/jms/QueueReceiver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/jms/QueueSession;Ljakarta/jms/Queue;)V", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/jms/InvalidDestinationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid queue");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/InvalidDestinationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"jakarta/jms/QueueRequestor", "jakarta/jms/QueueSession", "jakarta/jms/Queue"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "setSession", "(Ljakarta/jms/QueueSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/QueueSession", "createTemporaryQueue", "()Ljakarta/jms/TemporaryQueue;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "setTemporaryQueue", "(Ljakarta/jms/TemporaryQueue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/QueueSession", "createSender", "(Ljakarta/jms/Queue;)Ljakarta/jms/QueueSender;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "setSender", "(Ljakarta/jms/QueueSender;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "getTemporaryQueue", "()Ljakarta/jms/TemporaryQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/QueueSession", "createReceiver", "(Ljakarta/jms/Queue;)Ljakarta/jms/QueueReceiver;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "setReceiver", "(Ljakarta/jms/QueueReceiver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "request", "(Ljakarta/jms/Message;)Ljakarta/jms/Message;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "getTemporaryQueue", "()Ljakarta/jms/TemporaryQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/Message", "setJMSReplyTo", "(Ljakarta/jms/Destination;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "getSender", "()Ljakarta/jms/QueueSender;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/QueueSender", "send", "(Ljakarta/jms/Message;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "getReceiver", "()Ljakarta/jms/QueueReceiver;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/QueueReceiver", "receive", "()Ljakarta/jms/Message;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "getSession", "()Ljakarta/jms/QueueSession;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/QueueSession", "close", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/QueueRequestor", "getTemporaryQueue", "()Ljakarta/jms/TemporaryQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TemporaryQueue", "delete", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setReceiver", "(Ljakarta/jms/QueueReceiver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/QueueRequestor", "receiver", "Ljakarta/jms/QueueReceiver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getReceiver", "()Ljakarta/jms/QueueReceiver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/QueueRequestor", "receiver", "Ljakarta/jms/QueueReceiver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setSender", "(Ljakarta/jms/QueueSender;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/QueueRequestor", "sender", "Ljakarta/jms/QueueSender;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSender", "()Ljakarta/jms/QueueSender;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/QueueRequestor", "sender", "Ljakarta/jms/QueueSender;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setSession", "(Ljakarta/jms/QueueSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/QueueRequestor", "session", "Ljakarta/jms/QueueSession;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSession", "()Ljakarta/jms/QueueSession;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/QueueRequestor", "session", "Ljakarta/jms/QueueSession;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setTemporaryQueue", "(Ljakarta/jms/TemporaryQueue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/QueueRequestor", "temporaryQueue", "Ljakarta/jms/TemporaryQueue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTemporaryQueue", "()Ljakarta/jms/TemporaryQueue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/QueueRequestor", "temporaryQueue", "Ljakarta/jms/TemporaryQueue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
