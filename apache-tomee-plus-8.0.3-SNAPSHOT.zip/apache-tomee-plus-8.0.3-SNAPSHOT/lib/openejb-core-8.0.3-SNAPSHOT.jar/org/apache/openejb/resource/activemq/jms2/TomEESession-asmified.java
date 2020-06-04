package asm.org.apache.openejb.resource.activemq.jms2;
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
public class TomEESessionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/activemq/jms2/TomEESession", null, "org/apache/activemq/ActiveMQSession", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/ActiveMQConnection;Lorg/apache/activemq/command/SessionId;IZZ)V", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ActiveMQSession", "<init>", "(Lorg/apache/activemq/ActiveMQConnection;Lorg/apache/activemq/command/SessionId;IZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProducer", "(Ljavax/jms/Destination;)Ljavax/jms/MessageProducer;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "checkClosed", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/CustomDestination;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/CustomDestination;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/CustomDestination");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/CustomDestination", "createProducer", "(Lorg/apache/activemq/ActiveMQSession;)Ljavax/jms/MessageProducer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/activemq/jms2/TomEEProducer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "getNextProducerId", "()Lorg/apache/activemq/command/ProducerId;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ActiveMQMessageTransformation", "transformDestination", "(Ljavax/jms/Destination;)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEESession", "connection", "Lorg/apache/activemq/ActiveMQConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQConnection", "getSendTimeout", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/TomEEProducer", "<init>", "(Lorg/apache/activemq/ActiveMQSession;Lorg/apache/activemq/command/ProducerId;Lorg/apache/activemq/command/ActiveMQDestination;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/MessageConsumer;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "createDurableSubscriber", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/TopicSubscriber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljavax/jms/MessageConsumer;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "createDurableSubscriber", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljavax/jms/TopicSubscriber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/MessageConsumer;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "createConsumer", "(Ljavax/jms/Destination;)Ljavax/jms/MessageConsumer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/MessageConsumer;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "createConsumer", "(Ljavax/jms/Destination;Ljava/lang/String;)Ljavax/jms/MessageConsumer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/MessageConsumer;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "createDurableSubscriber", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/TopicSubscriber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/MessageConsumer;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEESession", "createDurableSubscriber", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljavax/jms/TopicSubscriber;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
