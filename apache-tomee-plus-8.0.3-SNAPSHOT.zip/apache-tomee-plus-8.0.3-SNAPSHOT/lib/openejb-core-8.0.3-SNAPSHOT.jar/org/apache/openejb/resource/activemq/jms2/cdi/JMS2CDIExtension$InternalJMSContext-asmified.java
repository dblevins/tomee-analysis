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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", null, "java/lang/Object", new String[] { "jakarta/jms/JMSContext", "java/io/Serializable" });

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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNCHRONIZED, "context", "()Ljakarta/jms/JMSContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/activemq/jms2/JMS2", "inTx", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "transactionStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "findOrCreateContext", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction;)Ljakarta/jms/JMSContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "requestStorage", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "findOrCreateContext", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction;)Ljakarta/jms/JMSContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findOrCreateContext", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction;)Ljakarta/jms/JMSContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", "find", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;)Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key", "create", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "key", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$AutoContextDestruction", "push", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;Ljakarta/jms/JMSContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"jakarta/jms/JMSContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acknowledge", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "acknowledge", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commit", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "commit", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBrowser", "(Ljakarta/jms/Queue;)Ljakarta/jms/QueueBrowser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createBrowser", "(Ljakarta/jms/Queue;)Ljakarta/jms/QueueBrowser;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBrowser", "(Ljakarta/jms/Queue;Ljava/lang/String;)Ljakarta/jms/QueueBrowser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createBrowser", "(Ljakarta/jms/Queue;Ljava/lang/String;)Ljakarta/jms/QueueBrowser;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBytesMessage", "()Ljakarta/jms/BytesMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createBytesMessage", "()Ljakarta/jms/BytesMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConsumer", "(Ljakarta/jms/Destination;)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createConsumer", "(Ljakarta/jms/Destination;)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConsumer", "(Ljakarta/jms/Destination;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createConsumer", "(Ljakarta/jms/Destination;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConsumer", "(Ljakarta/jms/Destination;Ljava/lang/String;Z)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createConsumer", "(Ljakarta/jms/Destination;Ljava/lang/String;Z)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createContext", "(I)Ljakarta/jms/JMSContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createContext", "(I)Ljakarta/jms/JMSContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;Ljava/lang/String;Z)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMapMessage", "()Ljakarta/jms/MapMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createMapMessage", "()Ljakarta/jms/MapMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createMessage", "()Ljakarta/jms/Message;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createMessage", "()Ljakarta/jms/Message;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createObjectMessage", "()Ljakarta/jms/ObjectMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createObjectMessage", "()Ljakarta/jms/ObjectMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createObjectMessage", "(Ljava/io/Serializable;)Ljakarta/jms/ObjectMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createObjectMessage", "(Ljava/io/Serializable;)Ljakarta/jms/ObjectMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProducer", "()Ljakarta/jms/JMSProducer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createProducer", "()Ljakarta/jms/JMSProducer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQueue", "(Ljava/lang/String;)Ljakarta/jms/Queue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createQueue", "(Ljava/lang/String;)Ljakarta/jms/Queue;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createSharedConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createSharedConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createSharedDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSharedDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createSharedDurableConsumer", "(Ljakarta/jms/Topic;Ljava/lang/String;Ljava/lang/String;)Ljakarta/jms/JMSConsumer;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStreamMessage", "()Ljakarta/jms/StreamMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createStreamMessage", "()Ljakarta/jms/StreamMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTemporaryQueue", "()Ljakarta/jms/TemporaryQueue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createTemporaryQueue", "()Ljakarta/jms/TemporaryQueue;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createTemporaryTopic", "()Ljakarta/jms/TemporaryTopic;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextMessage", "()Ljakarta/jms/TextMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createTextMessage", "()Ljakarta/jms/TextMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTextMessage", "(Ljava/lang/String;)Ljakarta/jms/TextMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createTextMessage", "(Ljava/lang/String;)Ljakarta/jms/TextMessage;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTopic", "(Ljava/lang/String;)Ljakarta/jms/Topic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "createTopic", "(Ljava/lang/String;)Ljakarta/jms/Topic;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoStart", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "getAutoStart", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientID", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "getClientID", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExceptionListener", "()Ljakarta/jms/ExceptionListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "getExceptionListener", "()Ljakarta/jms/ExceptionListener;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetaData", "()Ljakarta/jms/ConnectionMetaData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "getMetaData", "()Ljakarta/jms/ConnectionMetaData;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSessionMode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "getSessionMode", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransacted", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "getTransacted", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "recover", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "recover", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollback", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "rollback", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoStart", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "setAutoStart", "(Z)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClientID", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "setClientID", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExceptionListener", "(Ljakarta/jms/ExceptionListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "setExceptionListener", "(Ljakarta/jms/ExceptionListener;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "start", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "stop", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unsubscribe", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "context", "()Ljakarta/jms/JMSContext;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/jms/JMSContext", "unsubscribe", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
