package asm.org.apache.activemq.broker.region;
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
public class ConnectorStatisticsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/region/ConnectorStatistics", null, "org/apache/activemq/management/StatsImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "messages", "Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("enqueues");
methodVisitor.visitLdcInsn("The number of messages that have been sent to the destination");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/CountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dequeues");
methodVisitor.visitLdcInsn("The number of messages that have been dispatched from the destination");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/CountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("consumers");
methodVisitor.visitLdcInsn("The number of consumers that that are subscribing to messages from the destination");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/CountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/CountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("messages");
methodVisitor.visitLdcInsn("The number of messages that that are being held by the destination");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/CountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messages", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/management/PollCountStatisticImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("messagesCached");
methodVisitor.visitLdcInsn("The number of messages that are held in the destination's memory cache");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/PollCountStatisticImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("enqueues");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/ConnectorStatistics", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("dequeues");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/ConnectorStatistics", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("consumers");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/ConnectorStatistics", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("messages");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messages", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/ConnectorStatistics", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("messagesCached");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/ConnectorStatistics", "addStatistic", "(Ljava/lang/String;Lorg/apache/activemq/management/StatisticImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEnqueues", "()Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDequeues", "()Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConsumers", "()Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessagesCached", "()Lorg/apache/activemq/management/PollCountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessages", "()Lorg/apache/activemq/management/CountStatisticImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messages", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnabled", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/management/StatsImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messages", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/PollCountStatisticImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParent", "(Lorg/apache/activemq/broker/region/ConnectorStatistics;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/PollCountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/PollCountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messages", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messages", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "enqueues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "dequeues", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "consumers", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/PollCountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/PollCountStatisticImpl;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messages", "Lorg/apache/activemq/management/CountStatisticImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "setParent", "(Lorg/apache/activemq/management/CountStatisticImpl;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMessagesCached", "(Lorg/apache/activemq/management/PollCountStatisticImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/ConnectorStatistics", "messagesCached", "Lorg/apache/activemq/management/PollCountStatisticImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
