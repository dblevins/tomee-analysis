package asm.org.apache.activemq.broker.inteceptor;
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
public class MessageInterceptorRegistryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "brokerService", "Lorg/apache/activemq/broker/BrokerService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "filter", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "messageInterceptorRegistryMap", "Ljava/util/Map;", "Ljava/util/Map<Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "INSTANCE", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/String;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/BrokerRegistry", "getInstance", "()Lorg/apache/activemq/broker/BrokerRegistry;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerRegistry", "lookup", "(Ljava/lang/String;)Lorg/apache/activemq/broker/BrokerService;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "get", "(Lorg/apache/activemq/broker/BrokerService;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "get", "(Lorg/apache/activemq/broker/BrokerService;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "messageInterceptorRegistryMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "<init>", "(Lorg/apache/activemq/broker/BrokerService;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "messageInterceptorRegistryMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "messageInterceptorRegistryMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/BrokerRegistry", "getInstance", "()Lorg/apache/activemq/broker/BrokerRegistry;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerRegistry", "findFirst", "()Lorg/apache/activemq/broker/BrokerService;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "messageInterceptorRegistryMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/activemq/broker/BrokerService;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "messageInterceptorRegistryMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessageInterceptor", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "addMessageInterceptor", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessageInterceptor", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "removeMessageInterceptor", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessageInterceptorForQueue", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "addMessageInterceptorForQueue", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessageInterceptorForQueue", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "addMessageInterceptorForQueue", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessageInterceptorForTopic", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "addMessageInterceptorForTopic", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessageInterceptorForTopic", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "removeMessageInterceptorForTopic", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMessageInterceptor", "(Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "addMessageInterceptor", "(Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMessageInterceptor", "(Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "removeMessageInterceptor", "(Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "injectMessage", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "injectMessage", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNCHRONIZED, "getFilter", "()Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "filter", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/MutableBrokerFilter;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/Broker", "getAdaptor", "(Ljava/lang/Class;)Lorg/apache/activemq/broker/Broker;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/MutableBrokerFilter");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/MutableBrokerFilter", "getNext", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "<init>", "(Lorg/apache/activemq/broker/Broker;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "filter", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "filter", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/MutableBrokerFilter", "setNext", "(Lorg/apache/activemq/broker/Broker;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Failed to create MessageInterceptorFilter");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "filter", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorFilter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/inteceptor/MessageInterceptorRegistry", "INSTANCE", "Lorg/apache/activemq/broker/inteceptor/MessageInterceptorRegistry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
