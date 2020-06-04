package asm.org.apache.activemq.ra;
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
public class ActiveMQConnectionFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/ra/ActiveMQConnectionFactory", null, "java/lang/Object", new String[] { "javax/jms/ConnectionFactory", "javax/jms/QueueConnectionFactory", "javax/jms/TopicConnectionFactory", "javax/resource/Referenceable", "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-5754338187296859149L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "manager", "Ljavax/resource/spi/ConnectionManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "factory", "Lorg/apache/activemq/ra/ActiveMQManagedConnectionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "reference", "Ljavax/naming/Reference;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "info", "Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/ra/ActiveMQManagedConnectionFactory;Ljavax/resource/spi/ConnectionManager;Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "factory", "Lorg/apache/activemq/ra/ActiveMQManagedConnectionFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "manager", "Ljavax/resource/spi/ConnectionManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "info", "Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConnection", "()Ljavax/jms/Connection;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "info", "Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo", "copy", "()Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/ActiveMQConnectionFactory", "createConnection", "(Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;)Ljavax/jms/Connection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/Connection;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "info", "Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo", "copy", "()Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo", "setUserName", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo", "setPassword", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/ActiveMQConnectionFactory", "createConnection", "(Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;)Ljavax/jms/Connection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createConnection", "(Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;)Ljavax/jms/Connection;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/resource/ResourceException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "javax/resource/ResourceException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo", "isUseInboundSessionEnabled", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/ra/InboundConnectionProxy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/InboundConnectionProxy", "<init>", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "manager", "Ljavax/resource/spi/ConnectionManager;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitTypeInsn(NEW, "javax/jms/JMSException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No JCA ConnectionManager configured! Either enable UseInboundSessionEnabled or get your JCA container to configure one.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/JMSException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "manager", "Ljavax/resource/spi/ConnectionManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "factory", "Lorg/apache/activemq/ra/ActiveMQManagedConnectionFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/resource/spi/ConnectionManager", "allocateConnection", "(Ljavax/resource/spi/ManagedConnectionFactory;Ljavax/resource/spi/ConnectionRequestInfo;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/Connection");
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/resource/ResourceException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/resource/ResourceException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/jms/JMSException");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/resource/ResourceException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/JMSException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/resource/ResourceException"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/ra/ActiveMQConnectionFactory", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Connection could not be created:");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "javax/jms/JMSException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/resource/ResourceException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jms/JMSException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/jms/JMSException", "setLinkedException", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReference", "()Ljavax/naming/Reference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "reference", "Ljavax/naming/Reference;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReference", "(Ljavax/naming/Reference;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/ActiveMQConnectionFactory", "reference", "Ljavax/naming/Reference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueueConnection", "()Ljavax/jms/QueueConnection;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionFactory", "createConnection", "()Ljavax/jms/Connection;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/QueueConnection");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueueConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/QueueConnection;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionFactory", "createConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/Connection;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/QueueConnection");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTopicConnection", "()Ljavax/jms/TopicConnection;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionFactory", "createConnection", "()Ljavax/jms/Connection;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/TopicConnection");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTopicConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/TopicConnection;", null, new String[] { "javax/jms/JMSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionFactory", "createConnection", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/Connection;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/TopicConnection");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/ra/ActiveMQConnectionFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/ra/ActiveMQConnectionFactory", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
