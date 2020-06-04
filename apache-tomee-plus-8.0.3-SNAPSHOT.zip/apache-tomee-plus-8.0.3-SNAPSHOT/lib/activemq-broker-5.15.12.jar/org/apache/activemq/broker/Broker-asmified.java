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
public class BrokerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/broker/Broker", null, "java/lang/Object", new String[] { "org/apache/activemq/broker/region/Region", "org/apache/activemq/Service" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAdaptor", "(Ljava/lang/Class;)Lorg/apache/activemq/broker/Broker;", "(Ljava/lang/Class<*>;)Lorg/apache/activemq/broker/Broker;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBrokerId", "()Lorg/apache/activemq/command/BrokerId;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBrokerName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addBroker", "(Lorg/apache/activemq/broker/Connection;Lorg/apache/activemq/command/BrokerInfo;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeBroker", "(Lorg/apache/activemq/broker/Connection;Lorg/apache/activemq/command/BrokerInfo;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addConnection", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConnectionInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeConnection", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConnectionInfo;Ljava/lang/Throwable;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSession", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/SessionInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeSession", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/SessionInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addProducer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ProducerInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeProducer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ProducerInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClients", "()[Lorg/apache/activemq/broker/Connection;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDestinations", "()[Lorg/apache/activemq/command/ActiveMQDestination;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDestinationMap", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Map;", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Map<Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/region/Destination;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPreparedTransactions", "(Lorg/apache/activemq/broker/ConnectionContext;)[Lorg/apache/activemq/command/TransactionId;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beginTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prepareTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rollbackTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "commitTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;Z)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "forgetTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPeerBrokerInfos", "()[Lorg/apache/activemq/command/BrokerInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preProcessDispatch", "(Lorg/apache/activemq/command/MessageDispatch;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postProcessDispatch", "(Lorg/apache/activemq/command/MessageDispatch;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStopped", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDurableDestinations", "()Ljava/util/Set;", "()Ljava/util/Set<Lorg/apache/activemq/command/ActiveMQDestination;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDestinationInfo", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/DestinationInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeDestinationInfo", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/DestinationInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isFaultTolerantConfiguration", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAdminConnectionContext", "()Lorg/apache/activemq/broker/ConnectionContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAdminConnectionContext", "(Lorg/apache/activemq/broker/ConnectionContext;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTempDataStore", "()Lorg/apache/activemq/store/PListStore;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVmConnectorURI", "()Ljava/net/URI;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "brokerServiceStarted", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBrokerService", "()Lorg/apache/activemq/broker/BrokerService;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRoot", "()Lorg/apache/activemq/broker/Broker;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isExpired", "(Lorg/apache/activemq/broker/region/MessageReference;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "messageExpired", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/MessageReference;Lorg/apache/activemq/broker/region/Subscription;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sendToDeadLetterQueue", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/MessageReference;Lorg/apache/activemq/broker/region/Subscription;Ljava/lang/Throwable;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBrokerSequenceId", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "messageConsumed", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/MessageReference;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "messageDelivered", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/MessageReference;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "messageDiscarded", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/Subscription;Lorg/apache/activemq/broker/region/MessageReference;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "slowConsumer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/Destination;Lorg/apache/activemq/broker/region/Subscription;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fastProducer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ProducerInfo;Lorg/apache/activemq/command/ActiveMQDestination;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isFull", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/Destination;Lorg/apache/activemq/usage/Usage;)V", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/Destination;Lorg/apache/activemq/usage/Usage<*>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "virtualDestinationAdded", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/virtual/VirtualDestination;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "virtualDestinationRemoved", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/virtual/VirtualDestination;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nowMasterBroker", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getScheduler", "()Lorg/apache/activemq/thread/Scheduler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "networkBridgeStarted", "(Lorg/apache/activemq/command/BrokerInfo;ZLjava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "networkBridgeStopped", "(Lorg/apache/activemq/command/BrokerInfo;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
