package asm.org.apache.activemq.broker;
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
public class TransactionBroker$PreparedDestinationCompletionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", null, "org/apache/activemq/transaction/Synchronization", null);

classWriter.visitInnerClass("org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "org/apache/activemq/broker/TransactionBroker", "PreparedDestinationCompletion", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "destination", "Lorg/apache/activemq/broker/region/Destination;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "messageSend", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "opCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/region/Destination;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transaction/Synchronization", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "opCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "messageSend", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "incrementOpCount", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "opCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "opCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "messageSend", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "messageSend", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "messageSend", "Z");
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterRollback", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "messageSend", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "clearPendingMessages", "()V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransactionBroker", "access$200", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("cleared pending from afterRollback: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCommit", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "messageSend", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "clearPendingMessages", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getDestinationStatistics", "()Lorg/apache/activemq/broker/region/DestinationStatistics;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationStatistics", "getEnqueues", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "opCount", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "add", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getDestinationStatistics", "()Lorg/apache/activemq/broker/region/DestinationStatistics;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationStatistics", "getMessages", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "opCount", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "add", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransactionBroker", "access$200", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("cleared pending from afterCommit: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getDestinationStatistics", "()Lorg/apache/activemq/broker/region/DestinationStatistics;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationStatistics", "getDequeues", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "opCount", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "add", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getDestinationStatistics", "()Lorg/apache/activemq/broker/region/DestinationStatistics;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationStatistics", "getMessages", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransactionBroker$PreparedDestinationCompletion", "opCount", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "subtract", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
