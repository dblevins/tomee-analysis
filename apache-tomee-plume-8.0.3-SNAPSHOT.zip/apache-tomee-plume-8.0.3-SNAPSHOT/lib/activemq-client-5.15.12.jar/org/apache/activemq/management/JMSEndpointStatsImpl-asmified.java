package asm.org.apache.activemq.management;
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
public class JMSEndpointStatsImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/management/JMSEndpointStatsImpl", null, "org/apache/activemq/management/StatsImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/management/JMSSessionStatsImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSSessionStatsImpl", "getMessageCount", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSSessionStatsImpl", "getPendingMessageCount", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSSessionStatsImpl", "getExpiredMessageCount", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSSessionStatsImpl", "getMessageWaitTime", "()Lorg/apache/activemq/management/TimeStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSSessionStatsImpl", "getMessageRateTime", "()Lorg/apache/activemq/management/TimeStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("messageCount");
methodVisitor.visitLdcInsn("Number of messages processed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/CountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("pendingMessageCount");
methodVisitor.visitLdcInsn("Number of pending messages");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/CountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("expiredMessageCount");
methodVisitor.visitLdcInsn("Number of expired messages");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/CountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/TimeStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("messageWaitTime");
methodVisitor.visitLdcInsn("Time spent by a message before being delivered");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/TimeStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/TimeStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("messageRateTime");
methodVisitor.visitLdcInsn("Time taken to process a message (thoughtput rate)");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/TimeStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "<init>", "(Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/TimeStatisticImpl;Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/TimeStatisticImpl;Lorg/apache/activemq/management/TimeStatisticImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("messageCount");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pendingMessageCount");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("expiredMessageCount");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("messageWaitTime");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("messageRateTime");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/JMSEndpointStatsImpl", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageCount", "()Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPendingMessageCount", "()Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpiredMessageCount", "()Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageRateTime", "()Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageWaitTime", "()Lorg/apache/activemq/management/TimeStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onMessage", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "enabled", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "getLastSampleTime", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "increment", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "getLastSampleTime", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "addTime", "(J)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnabled", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dump", "(Lorg/apache/activemq/util/IndentPrinter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "printIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "println", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "printIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "println", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "printIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "pendingMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "println", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "printIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageRateTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "println", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "printIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "expiredMessageCount", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "println", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "printIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/management/JMSEndpointStatsImpl", "messageWaitTime", "Lorg/apache/activemq/management/TimeStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/IndentPrinter", "println", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;Lorg/apache/activemq/management/CountStatisticImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/management/CountStatisticImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/management/JMSEndpointStatsImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot associate endpoint counters with session level counters as they are not both CountStatisticImpl clases. Endpoint: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" session: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;Lorg/apache/activemq/management/TimeStatisticImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/management/TimeStatisticImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/management/TimeStatisticImpl");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/TimeStatisticImpl", "setParent", "(Lorg/apache/activemq/management/TimeStatisticImpl;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/management/JMSEndpointStatsImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot associate endpoint counters with session level counters as they are not both TimeStatisticImpl clases. Endpoint: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" session: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/management/JMSEndpointStatsImpl;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/management/JMSEndpointStatsImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
