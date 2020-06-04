package asm.org.apache.openejb.resource.activemq.jms2.cdi;
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
public class JMS2CDIExtension$InternalJMSContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", null, "java/lang/Object", new String[] { "javax/jms/JMSContext", "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "Key", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "RequestAutoContextDestruction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "TransactionAutoContextDestruction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "InternalJMSContext", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "AutoContextDestruction", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "requestStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "transactionStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "requestStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "transactionStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNCHRONIZED, "context", "()Ljavax/jms/JMSContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/activemq/jms2/JMS2", "inTx", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "transactionStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "findOrCreateContext", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction;)Ljavax/jms/JMSContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "requestStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "findOrCreateContext", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction;)Ljavax/jms/JMSContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findOrCreateContext", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction;)Ljavax/jms/JMSContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", "find", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;)Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key", "create", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", "push", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;Ljavax/jms/JMSContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/jms/JMSContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acknowledge", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "acknowledge", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "commit", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBrowser", "(Ljavax/jms/Queue;)Ljavax/jms/QueueBrowser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createBrowser", "(Ljavax/jms/Queue;)Ljavax/jms/QueueBrowser;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBrowser", "(Ljavax/jms/Queue;Ljava/lang/String;)Ljavax/jms/QueueBrowser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createBrowser", "(Ljavax/jms/Queue;Ljava/lang/String;)Ljavax/jms/QueueBrowser;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBytesMessage", "()Ljavax/jms/BytesMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createBytesMessage", "()Ljavax/jms/BytesMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConsumer", "(Ljavax/jms/Destination;)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createConsumer", "(Ljavax/jms/Destination;)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConsumer", "(Ljavax/jms/Destination;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createConsumer", "(Ljavax/jms/Destination;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConsumer", "(Ljavax/jms/Destination;Ljava/lang/String;Z)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createConsumer", "(Ljavax/jms/Destination;Ljava/lang/String;Z)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContext", "(I)Ljavax/jms/JMSContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createContext", "(I)Ljavax/jms/JMSContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMapMessage", "()Ljavax/jms/MapMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createMapMessage", "()Ljavax/jms/MapMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMessage", "()Ljavax/jms/Message;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createMessage", "()Ljavax/jms/Message;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createObjectMessage", "()Ljavax/jms/ObjectMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createObjectMessage", "()Ljavax/jms/ObjectMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createObjectMessage", "(Ljava/io/Serializable;)Ljavax/jms/ObjectMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createObjectMessage", "(Ljava/io/Serializable;)Ljavax/jms/ObjectMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProducer", "()Ljavax/jms/JMSProducer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createProducer", "()Ljavax/jms/JMSProducer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueue", "(Ljava/lang/String;)Ljavax/jms/Queue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createQueue", "(Ljava/lang/String;)Ljavax/jms/Queue;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createSharedConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createSharedConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createSharedDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createSharedDurableConsumer", "(Ljavax/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStreamMessage", "()Ljavax/jms/StreamMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createStreamMessage", "()Ljavax/jms/StreamMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createTemporaryQueue", "()Ljavax/jms/TemporaryQueue;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTemporaryTopic", "()Ljavax/jms/TemporaryTopic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createTemporaryTopic", "()Ljavax/jms/TemporaryTopic;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextMessage", "()Ljavax/jms/TextMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createTextMessage", "()Ljavax/jms/TextMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextMessage", "(Ljava/lang/String;)Ljavax/jms/TextMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createTextMessage", "(Ljava/lang/String;)Ljavax/jms/TextMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTopic", "(Ljava/lang/String;)Ljavax/jms/Topic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "createTopic", "(Ljava/lang/String;)Ljavax/jms/Topic;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoStart", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "getAutoStart", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientID", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "getClientID", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionListener", "()Ljavax/jms/ExceptionListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "getExceptionListener", "()Ljavax/jms/ExceptionListener;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetaData", "()Ljavax/jms/ConnectionMetaData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "getMetaData", "()Ljavax/jms/ConnectionMetaData;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSessionMode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "getSessionMode", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransacted", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "getTransacted", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "recover", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "recover", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "rollback", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoStart", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "setAutoStart", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClientID", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "setClientID", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExceptionListener", "(Ljavax/jms/ExceptionListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "setExceptionListener", "(Ljavax/jms/ExceptionListener;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "start", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "stop", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unsubscribe", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljavax/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSContext", "unsubscribe", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
