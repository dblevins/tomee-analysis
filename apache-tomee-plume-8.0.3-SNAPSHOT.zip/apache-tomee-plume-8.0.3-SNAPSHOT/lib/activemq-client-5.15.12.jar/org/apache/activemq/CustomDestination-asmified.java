package asm.org.apache.activemq;
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
public class CustomDestinationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/CustomDestination", null, "java/lang/Object", new String[] { "jakarta/jms/Destination" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConsumer", "(Lorg/apache/activemq/ActiveMQSession;Ljava/lang/String;)Ljakarta/jms/MessageConsumer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConsumer", "(Lorg/apache/activemq/ActiveMQSession;Ljava/lang/String;Z)Ljakarta/jms/MessageConsumer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSubscriber", "(Lorg/apache/activemq/ActiveMQSession;Ljava/lang/String;Z)Ljakarta/jms/TopicSubscriber;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDurableSubscriber", "(Lorg/apache/activemq/ActiveMQSession;Ljava/lang/String;Ljava/lang/String;Z)Ljakarta/jms/TopicSubscriber;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createReceiver", "(Lorg/apache/activemq/ActiveMQSession;Ljava/lang/String;)Ljakarta/jms/QueueReceiver;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createProducer", "(Lorg/apache/activemq/ActiveMQSession;)Ljakarta/jms/MessageProducer;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createPublisher", "(Lorg/apache/activemq/ActiveMQSession;)Ljakarta/jms/TopicPublisher;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSender", "(Lorg/apache/activemq/ActiveMQSession;)Ljakarta/jms/QueueSender;", null, new String[] { "jakarta/jms/JMSException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
