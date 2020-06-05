package asm.org.apache.activemq.broker.jmx;
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
public class QueueViewDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/jmx/QueueView", null, "org/apache/activemq/broker/jmx/DestinationView", new String[] { "org/apache/activemq/broker/jmx/QueueViewMBean" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;Lorg/apache/activemq/broker/region/Queue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/jmx/DestinationView", "<init>", "(Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;Lorg/apache/activemq/broker/region/Destination;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessage", "(Ljava/lang/String;)Ljavax/management/openmbean/CompositeData;", null, new String[] { "javax/management/openmbean/OpenDataException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessage", "(Ljava/lang/String;)Lorg/apache/activemq/broker/region/QueueMessageReference;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/QueueMessageReference", "getMessage", "()Lorg/apache/activemq/command/Message;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"javax/management/openmbean/CompositeData", "org/apache/activemq/broker/region/QueueMessageReference", "org/apache/activemq/command/Message"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/jmx/OpenTypeSupport", "convert", "(Ljava/lang/Object;)Ljavax/management/openmbean/CompositeData;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "purge", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getDestinationStatistics", "()Lorg/apache/activemq/broker/region/DestinationStatistics;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/DestinationStatistics", "getMessages", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "getCount", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "purge", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/jmx/QueueView", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("{} purge of {} messages");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/Destination", "getActiveMQDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQDestination", "getQualifiedName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessage", "(Ljava/lang/String;)Z", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "removeMessage", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "removeMatchingMessages", "(Ljava/lang/String;)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "removeMatchingMessages", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "removeMatchingMessages", "(Ljava/lang/String;I)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "removeMatchingMessages", "(Ljava/lang/String;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyMessageTo", "(Ljava/lang/String;Ljava/lang/String;)Z", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "copyMessageTo", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Lorg/apache/activemq/command/ActiveMQDestination;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyMatchingMessagesTo", "(Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "copyMatchingMessagesTo", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Lorg/apache/activemq/command/ActiveMQDestination;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyMatchingMessagesTo", "(Ljava/lang/String;Ljava/lang/String;I)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "copyMatchingMessagesTo", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Lorg/apache/activemq/command/ActiveMQDestination;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "moveMessageTo", "(Ljava/lang/String;Ljava/lang/String;)Z", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "moveMessageTo", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Lorg/apache/activemq/command/ActiveMQDestination;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "moveMatchingMessagesTo", "(Ljava/lang/String;Ljava/lang/String;)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "moveMatchingMessagesTo", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Lorg/apache/activemq/command/ActiveMQDestination;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "moveMatchingMessagesTo", "(Ljava/lang/String;Ljava/lang/String;I)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "moveMatchingMessagesTo", "(Lorg/apache/activemq/broker/ConnectionContext;Ljava/lang/String;Lorg/apache/activemq/command/ActiveMQDestination;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "retryMessages", "()I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(new Integer(2147483647));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "retryMessages", "(Lorg/apache/activemq/broker/ConnectionContext;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "retryMessage", "(Ljava/lang/String;)Z", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessage", "(Ljava/lang/String;)Lorg/apache/activemq/broker/region/QueueMessageReference;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/QueueMessageReference", "getMessage", "()Lorg/apache/activemq/command/Message;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getOriginalDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "broker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "getContextBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/BrokerSupport", "getConnectionContext", "(Lorg/apache/activemq/broker/Broker;)Lorg/apache/activemq/broker/ConnectionContext;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "moveMessageTo", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/QueueMessageReference;Lorg/apache/activemq/command/ActiveMQDestination;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/activemq/broker/jmx/QueueView", "java/lang/String", "org/apache/activemq/broker/region/Queue", "org/apache/activemq/broker/region/QueueMessageReference", "org/apache/activemq/command/Message", "org/apache/activemq/command/ActiveMQDestination"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "jakarta/jms/JMSException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("No original destination for message: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/JMSException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/jms/JMSException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not find message: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jms/JMSException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cursorSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/region/Queue"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doesCursorHaveMessagesBuffered", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "hasMessagesBufferedToDeliver", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/region/Queue"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doesCursorHaveSpace", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "hasSpace", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/region/Queue"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCursorMemoryUsage", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "getSystemUsage", "()Lorg/apache/activemq/usage/SystemUsage;", true);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "getSystemUsage", "()Lorg/apache/activemq/usage/SystemUsage;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/SystemUsage", "getMemoryUsage", "()Lorg/apache/activemq/usage/MemoryUsage;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/MemoryUsage", "getUsage", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/region/Queue"}, 0, null);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCursorPercentUsage", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "getSystemUsage", "()Lorg/apache/activemq/usage/SystemUsage;", true);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "getSystemUsage", "()Lorg/apache/activemq/usage/SystemUsage;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/SystemUsage", "getMemoryUsage", "()Lorg/apache/activemq/usage/MemoryUsage;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/MemoryUsage", "getPercentUsage", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/region/Queue"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCursorFull", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "isFull", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/region/Queue"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCacheEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessages", "()Lorg/apache/activemq/broker/region/cursors/PendingMessageCursor;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/cursors/PendingMessageCursor", "isCacheEnabled", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/region/Queue"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageGroups", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessageGroupOwners", "()Lorg/apache/activemq/broker/region/group/MessageGroupMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/group/MessageGroupMap", "getGroups", "()Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageGroupType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessageGroupOwners", "()Lorg/apache/activemq/broker/region/group/MessageGroupMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/group/MessageGroupMap", "getType", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessageGroup", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "groupName");
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessageGroupOwners", "()Lorg/apache/activemq/broker/region/group/MessageGroupMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/group/MessageGroupMap", "removeGroup", "(Ljava/lang/String;)Lorg/apache/activemq/command/ConsumerId;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeAllMessageGroups", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "getMessageGroupOwners", "()Lorg/apache/activemq/broker/region/group/MessageGroupMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/region/group/MessageGroupMap", "removeAll", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pause", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "pauseDispatch", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resume", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "resumeDispatch", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPaused", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/QueueView", "destination", "Lorg/apache/activemq/broker/region/Destination;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/region/Queue");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/Queue", "isDispatchPaused", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/jmx/QueueView;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/jmx/QueueView", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
