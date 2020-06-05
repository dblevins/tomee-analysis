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
public class DestinationViewMBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/broker/jmx/DestinationViewMBean", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getName", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Name of this destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resetStatistics", "()V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Resets statistics.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEnqueueCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that have been sent to the destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDispatchCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that has been delivered to consumers, including those not acknowledged");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDequeueCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that has been acknowledged (and removed) from the destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getForwardCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that have been forwarded (to a networked broker) from the destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInFlightCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that have been dispatched to, but not acknowledged by, consumers.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExpiredCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages that have been expired.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConsumerCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of consumers subscribed to this destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProducerCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of producers attached to this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getQueueSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages on this destination, including any that have been dispatched but not acknowledged");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStoreMessageSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The memory size of all messages in this destination's store.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "browse", "()[Ljavax/management/openmbean/CompositeData;", null, new String[] { "javax/management/openmbean/OpenDataException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "An array of all messages in the destination. Not HTML friendly.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "browseAsTable", "()Ljavax/management/openmbean/TabularData;", null, new String[] { "javax/management/openmbean/OpenDataException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "A list of all messages in the destination. Not HTML friendly.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "browse", "(Ljava/lang/String;)[Ljavax/management/openmbean/CompositeData;", null, new String[] { "javax/management/openmbean/OpenDataException", "jakarta/jms/InvalidSelectorException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "An array of all messages in the destination based on an SQL-92 selection on the message headers or XPATH on the body. Not HTML friendly.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "selector");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "browseAsTable", "(Ljava/lang/String;)Ljavax/management/openmbean/TabularData;", null, new String[] { "javax/management/openmbean/OpenDataException", "jakarta/jms/InvalidSelectorException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "A list of all messages in the destination based on an SQL-92 selection on the message headers or XPATH on the body. Not HTML friendly.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "selector");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sendTextMessage", "(Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Sends a TextMessage to the destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "body");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sendTextMessageWithProperties", "(Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Sends a TextMessage to the destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sendTextMessage", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/util/Map<**>;Ljava/lang/String;)Ljava/lang/String;", new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Sends a TextMessage to the destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "headers");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "body");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sendTextMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Sends a TextMessage to a password-protected destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "body");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "user");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "password");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sendTextMessage", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", new String[] { "java/lang/Exception" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Sends a TextMessage to a password-protected destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "headers");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "body");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "user");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "password");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMemoryPercentUsage", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The percentage of the memory limit used");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMemoryUsageByteCount", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Memory used by undelivered messages in bytes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMemoryLimit", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Memory limit, in bytes, used by undelivered messages before paging to temporary storage.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMemoryLimit", "(J)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTempUsagePercentUsage", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The percentage of the temp usage limit used");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTempUsageLimit", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Temp usage limit, in bytes, assigned to this destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setTempUsageLimit", "(J)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMemoryUsagePortion", "()F", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Portion of memory from the broker memory limit for this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMemoryUsagePortion", "(F)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "bytes");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "browseMessages", "()Ljava/util/List;", "()Ljava/util/List<*>;", new String[] { "jakarta/jms/InvalidSelectorException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "A list of all messages in the destination. Not HTML friendly.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "browseMessages", "(Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List<*>;", new String[] { "jakarta/jms/InvalidSelectorException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "A list of all messages in the destination based on an SQL-92 selection on the message headers or XPATH on the body. Not HTML friendly.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMaxEnqueueTime", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The longest time a message was held on this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMinEnqueueTime", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "The shortest time a message was held on this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAverageEnqueueTime", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Average time a message was held on this destination.");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAverageMessageSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Average message size on this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMaxMessageSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Max message size on this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMinMessageSize", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Min message size on this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isProducerFlowControl", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Flow control is enabled for producers");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProducerFlowControl", "(Z)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "producerFlowControl");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAlwaysRetroactive", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Always treat consumers as retroactive");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAlwaysRetroactive", "(Z)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "alwaysRetroactive");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setBlockedProducerWarningInterval", "(J)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "blockedProducerWarningInterval");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBlockedProducerWarningInterval", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Blocked Producer Warning Interval");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMaxProducersToAudit", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Maximum number of producers to audit");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMaxProducersToAudit", "(I)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "maxProducersToAudit");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMaxAuditDepth", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Max audit depth");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMaxAuditDepth", "(I)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "maxAuditDepth");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMaxPageSize", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Maximum number of messages to be paged in");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMaxPageSize", "(I)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "pageSize");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isUseCache", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Caching is allowed");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPrioritizedMessages", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Prioritized messages is enabled");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setUseCache", "(Z)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "cache");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSubscriptions", "()[Ljavax/management/ObjectName;", null, new String[] { "java/io/IOException", "javax/management/MalformedObjectNameException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Subscription MBeans matching this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSlowConsumerStrategy", "()Ljavax/management/ObjectName;", null, new String[] { "java/io/IOException", "javax/management/MalformedObjectNameException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Optional slowConsumer handler MBean for this destination");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOptions", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Destination options as name value pairs in a URL queryString");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isDLQ", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Dead Letter Queue");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDLQ", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBlockedSends", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Number of messages blocked for flow control");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAverageBlockedTime", "()D", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Average time (ms) messages have been blocked by flow control");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTotalBlockedTime", "()J", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/activemq/broker/jmx/MBeanInfo;", true);
annotationVisitor0.visit("value", "Total time (ms) messages have been blocked by flow control");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
