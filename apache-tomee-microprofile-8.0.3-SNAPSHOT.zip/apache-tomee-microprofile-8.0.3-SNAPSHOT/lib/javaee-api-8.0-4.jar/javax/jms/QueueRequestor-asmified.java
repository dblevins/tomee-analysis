package asm.javax.jms;
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

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "javax/jms/QueueRequestor", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "session", "Ljavax/jms/QueueSession;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "temporaryQueue", "Ljavax/jms/TemporaryQueue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sender", "Ljavax/jms/QueueSender;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "receiver", "Ljavax/jms/QueueReceiver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/jms/QueueSession;Ljavax/jms/Queue;)V", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "javax/jms/InvalidDestinationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid queue");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/InvalidDestinationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"javax/jms/QueueRequestor", "javax/jms/QueueSession", "javax/jms/Queue"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "setSession", "(Ljavax/jms/QueueSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/QueueSession", "createTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "setTemporaryQueue", "(Ljavax/jms/TemporaryQueue;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/QueueSession", "createSender", "(Ljavax/jms/Queue;)Ljavax/jms/QueueSender;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "setSender", "(Ljavax/jms/QueueSender;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "getTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/QueueSession", "createReceiver", "(Ljavax/jms/Queue;)Ljavax/jms/QueueReceiver;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "setReceiver", "(Ljavax/jms/QueueReceiver;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "request", "(Ljavax/jms/Message;)Ljavax/jms/Message;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "getTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/Message", "setJMSReplyTo", "(Ljavax/jms/Destination;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "getSender", "()Ljavax/jms/QueueSender;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/QueueSender", "send", "(Ljavax/jms/Message;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "getReceiver", "()Ljavax/jms/QueueReceiver;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/QueueReceiver", "receive", "()Ljavax/jms/Message;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "getSession", "()Ljavax/jms/QueueSession;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/QueueSession", "close", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/QueueRequestor", "getTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/TemporaryQueue", "delete", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setReceiver", "(Ljavax/jms/QueueReceiver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/jms/QueueRequestor", "receiver", "Ljavax/jms/QueueReceiver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getReceiver", "()Ljavax/jms/QueueReceiver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/jms/QueueRequestor", "receiver", "Ljavax/jms/QueueReceiver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setSender", "(Ljavax/jms/QueueSender;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/jms/QueueRequestor", "sender", "Ljavax/jms/QueueSender;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSender", "()Ljavax/jms/QueueSender;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/jms/QueueRequestor", "sender", "Ljavax/jms/QueueSender;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setSession", "(Ljavax/jms/QueueSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/jms/QueueRequestor", "session", "Ljavax/jms/QueueSession;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSession", "()Ljavax/jms/QueueSession;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/jms/QueueRequestor", "session", "Ljavax/jms/QueueSession;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setTemporaryQueue", "(Ljavax/jms/TemporaryQueue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/jms/QueueRequestor", "temporaryQueue", "Ljavax/jms/TemporaryQueue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/jms/QueueRequestor", "temporaryQueue", "Ljavax/jms/TemporaryQueue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
