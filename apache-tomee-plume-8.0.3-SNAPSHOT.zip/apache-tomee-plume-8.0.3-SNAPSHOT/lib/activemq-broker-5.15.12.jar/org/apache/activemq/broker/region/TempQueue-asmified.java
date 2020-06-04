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
public class TempQueueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/region/TempQueue", null, "org/apache/activemq/broker/region/Queue", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tempDest", "Lorg/apache/activemq/command/ActiveMQTempDestination;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/broker/region/DestinationStatistics;Lorg/apache/activemq/thread/TaskRunnerFactory;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/Queue", "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/store/MessageStore;Lorg/apache/activemq/broker/region/DestinationStatistics;Lorg/apache/activemq/thread/TaskRunnerFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/ActiveMQTempDestination");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TempQueue", "tempDest", "Lorg/apache/activemq/command/ActiveMQTempDestination;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/region/cursors/VMPendingMessageCursor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/cursors/VMPendingMessageCursor", "<init>", "(Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TempQueue", "messages", "Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "messages", "Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/TempQueue", "getCursorMemoryHighWaterMark", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "setMemoryUsageHighWaterMark", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getSystemUsage", "()Lorg/apache/activemq/usage/SystemUsage;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TempQueue", "systemUsage", "Lorg/apache/activemq/usage/SystemUsage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "memoryUsage", "Lorg/apache/activemq/usage/MemoryUsage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "systemUsage", "Lorg/apache/activemq/usage/SystemUsage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/SystemUsage", "getMemoryUsage", "()Lorg/apache/activemq/usage/MemoryUsage;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/MemoryUsage", "setParent", "(Lorg/apache/activemq/usage/Usage;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "taskFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("TempQueue:  ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "destination", "Lorg/apache/activemq/command/ActiveMQDestination;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "getPhysicalName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/thread/TaskRunnerFactory", "createTaskRunner", "(Lorg/apache/activemq/thread/Task;Ljava/lang/String;)Lorg/apache/activemq/thread/TaskRunner;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/TempQueue", "taskRunner", "Lorg/apache/activemq/thread/TaskRunner;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSubscription", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/Subscription;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "isFaultTolerant", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "isNetworkConnection", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "tempDest", "Lorg/apache/activemq/command/ActiveMQTempDestination;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQTempDestination", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Subscription", "getConsumerInfo", "()Lorg/apache/activemq/command/ConsumerInfo;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerInfo", "getConsumerId", "()Lorg/apache/activemq/command/ConsumerId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerId", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "tempDest", "Lorg/apache/activemq/command/ActiveMQTempDestination;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Subscription", "getConsumerInfo", "()Lorg/apache/activemq/command/ConsumerInfo;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerInfo", "getConsumerId", "()Lorg/apache/activemq/command/ConsumerId;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerId", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQTempDestination", "setConnectionId", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/region/TempQueue", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("changed ownership of {} to {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "tempDest", "Lorg/apache/activemq/command/ActiveMQTempDestination;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQTempDestination", "getConnectionId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/Queue", "addSubscription", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/Subscription;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dispose", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "destinationStatistics", "Lorg/apache/activemq/broker/region/DestinationStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationStatistics", "getMessages", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "getCount", "()J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/region/TempQueue", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} on dispose, purge of {} pending messages: {}");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/TempQueue", "getActiveMQDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "getQualifiedName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "destinationStatistics", "Lorg/apache/activemq/broker/region/DestinationStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationStatistics", "getMessages", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "getCount", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "messages", "Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;[Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/TempQueue", "purge", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/region/TempQueue", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Caught an exception purging Queue: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/TempQueue", "destination", "Lorg/apache/activemq/command/ActiveMQDestination;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/region/Queue", "dispose", "(Lorg/apache/activemq/broker/ConnectionContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/region/TempQueue;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/region/TempQueue", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
