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
public class TopicRequestorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "jakarta/jms/TopicRequestor", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "session", "Ljakarta/jms/TopicSession;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "topic", "Ljakarta/jms/Topic;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "temporaryTopic", "Ljakarta/jms/TemporaryTopic;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "publisher", "Ljakarta/jms/TopicPublisher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "subscriber", "Ljakarta/jms/TopicSubscriber;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/jms/TopicSession;Ljakarta/jms/Topic;)V", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "setSession", "(Ljakarta/jms/TopicSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "setTopic", "(Ljakarta/jms/Topic;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TopicSession", "createTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "setTemporaryTopic", "(Ljakarta/jms/TemporaryTopic;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TopicSession", "createPublisher", "(Ljakarta/jms/Topic;)Ljakarta/jms/TopicPublisher;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "setPublisher", "(Ljakarta/jms/TopicPublisher;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "getTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TopicSession", "createSubscriber", "(Ljakarta/jms/Topic;)Ljakarta/jms/TopicSubscriber;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "setSubscriber", "(Ljakarta/jms/TopicSubscriber;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "request", "(Ljakarta/jms/Message;)Ljakarta/jms/Message;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "getTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/Message", "setJMSReplyTo", "(Ljakarta/jms/Destination;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "getPublisher", "()Ljakarta/jms/TopicPublisher;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TopicPublisher", "publish", "(Ljakarta/jms/Message;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "getSubscriber", "()Ljakarta/jms/TopicSubscriber;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TopicSubscriber", "receive", "()Ljakarta/jms/Message;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "getSession", "()Ljakarta/jms/TopicSession;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TopicSession", "close", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/TopicRequestor", "getTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/TemporaryTopic", "delete", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setPublisher", "(Ljakarta/jms/TopicPublisher;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/TopicRequestor", "publisher", "Ljakarta/jms/TopicPublisher;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getPublisher", "()Ljakarta/jms/TopicPublisher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/TopicRequestor", "publisher", "Ljakarta/jms/TopicPublisher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setSession", "(Ljakarta/jms/TopicSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/TopicRequestor", "session", "Ljakarta/jms/TopicSession;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSession", "()Ljakarta/jms/TopicSession;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/TopicRequestor", "session", "Ljakarta/jms/TopicSession;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setSubscriber", "(Ljakarta/jms/TopicSubscriber;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/TopicRequestor", "subscriber", "Ljakarta/jms/TopicSubscriber;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getSubscriber", "()Ljakarta/jms/TopicSubscriber;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/TopicRequestor", "subscriber", "Ljakarta/jms/TopicSubscriber;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setTemporaryTopic", "(Ljakarta/jms/TemporaryTopic;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/TopicRequestor", "temporaryTopic", "Ljakarta/jms/TemporaryTopic;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/TopicRequestor", "temporaryTopic", "Ljakarta/jms/TemporaryTopic;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setTopic", "(Ljakarta/jms/Topic;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/jms/TopicRequestor", "topic", "Ljakarta/jms/Topic;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTopic", "()Ljakarta/jms/Topic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/jms/TopicRequestor", "topic", "Ljakarta/jms/Topic;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
