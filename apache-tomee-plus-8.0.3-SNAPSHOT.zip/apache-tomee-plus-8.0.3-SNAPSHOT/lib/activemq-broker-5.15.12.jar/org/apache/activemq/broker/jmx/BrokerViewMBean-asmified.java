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
public class BrokerViewMBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/broker/jmx/BrokerViewMBean", null, "java/lang/Object", new String[] { "org/apache/activemq/Service" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBrokerId", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The unique id of the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBrokerName", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The name of the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBrokerVersion", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The version of the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUptime", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Uptime of the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUptimeMillis", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Uptime of the broker in milliseconds.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentConnectionsCount", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTotalConnectionsCount", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "gc", "()V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Runs the Garbage Collector.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resetStatistics", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Reset all broker statistics.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "enableStatistics", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Enable broker statistics.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "disableStatistics", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Disable broker statistics.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isStatisticsEnabled", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Broker statistics enabled.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTotalEnqueueCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that have been sent to the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTotalDequeueCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that have been acknowledged on the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTotalConsumerCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of message consumers subscribed to destinations on the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTotalProducerCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of message producers active on destinations on the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTotalMessageCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of unacknowledged messages on the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAverageMessageSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Average message size on this broker");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMaxMessageSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Max message size on this broker");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMinMessageSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Min message size on this broker");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMemoryPercentUsage", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Percent of memory limit used.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMemoryLimit", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Memory limit, in bytes, used for holding undelivered messages before paging to temporary storage.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMemoryLimit", "(J)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "bytes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStorePercentUsage", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Percent of store limit used.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStoreLimit", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Disk limit, in bytes, used for persistent messages before producers are blocked.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setStoreLimit", "(J)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "bytes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTempPercentUsage", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Percent of temp limit used.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTempLimit", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Disk limit, in bytes, used for non-persistent messages and temporary data before producers are blocked.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTempLimit", "(J)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "bytes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobSchedulerStorePercentUsage", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Percent of job store limit used.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJobSchedulerStoreLimit", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Disk limit, in bytes, used for scheduled messages before producers are blocked.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJobSchedulerStoreLimit", "(J)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "bytes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPersistent", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Messages are synchronized to disk.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isSlave", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Slave broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "terminateJVM", "(I)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Shuts down the JVM.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "exitCode");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stop", "()V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Stop the broker and all its components.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restart", "()V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Restart the broker and all its components.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stopGracefully", "(Ljava/lang/String;Ljava/lang/String;JJ)V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Poll for queues matching queueName are empty before stopping");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTopics", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Topics (broadcasted 'queues'); generally system information.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getQueues", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Standard Queues containing AIE messages.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "queryQueues", "(Ljava/lang/String;II)Ljava/lang/String;", null, new String[] { "java/io/IOException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Query queues");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "queryTopics", "(Ljava/lang/String;II)Ljava/lang/String;", null, new String[] { "java/io/IOException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Query topics");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "browseQueue", "(Ljava/lang/String;)[Ljavax/management/openmbean/CompositeData;", null, new String[] { "javax/management/openmbean/OpenDataException", "javax/management/MalformedObjectNameException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTemporaryTopics", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Temporary Topics; generally unused.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTemporaryQueues", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Temporary Queues; generally temporary message response holders.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTopicSubscribers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Topic Subscribers");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDurableTopicSubscribers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Durable (persistent) topic subscribers");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInactiveDurableTopicSubscribers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Inactive (disconnected persistent) topic subscribers");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getQueueSubscribers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Queue Subscribers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTemporaryTopicSubscribers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Temporary Topic Subscribers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTemporaryQueueSubscribers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Temporary Queue Subscribers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTopicProducers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Topic Producers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getQueueProducers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Queue Producers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTemporaryTopicProducers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Temporary Topic Producers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTemporaryQueueProducers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Temporary Queue Producers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDynamicDestinationProducers", "()[Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Dynamic Destination Producers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addConnector", "(Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Adds a Connector to the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "discoveryAddress");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNetworkConnector", "(Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Adds a Network Connector to the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "discoveryAddress");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeConnector", "(Ljava/lang/String;)Z", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Removes a Connector from the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "connectorName");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeNetworkConnector", "(Ljava/lang/String;)Z", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Removes a Network Connector from the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "connectorName");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTopic", "(Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Adds a Topic destination to the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "name");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addQueue", "(Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Adds a Queue destination to the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "name");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeTopic", "(Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Removes a Topic destination from the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "name");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeQueue", "(Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Removes a Queue destination from the broker.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "name");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDurableSubscriber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Creates a new durable topic subscriber.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "clientId");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "subscriberName");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "topicName");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "selector");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "destroyDurableSubscriber", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Destroys a durable subscriber.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "clientId");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "subscriberName");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "reloadLog4jProperties", "()V", null, new String[] { "java/lang/Throwable" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Reloads log4j.properties from the classpath.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVMURL", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The url of the VM connector");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransportConnectors", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The map of all defined transport connectors, with transport name as a key");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTransportConnectorByType", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The url of transport connector by it's type; e.g. tcp, stomp, ssl, etc.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDataDirectory", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The location of the data directory");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJMSJobScheduler", "()Ljavax/management/ObjectName;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "JMSJobScheduler");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
