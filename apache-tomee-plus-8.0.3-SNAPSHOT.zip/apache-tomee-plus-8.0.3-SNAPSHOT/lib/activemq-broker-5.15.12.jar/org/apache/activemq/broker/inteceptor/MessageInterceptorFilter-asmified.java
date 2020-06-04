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
public class MessageInterceptorFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", null, "org/apache/activemq/broker/BrokerFilter", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/Broker;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerFilter", "<init>", "(Lorg/apache/activemq/broker/Broker;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/filter/DestinationMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/filter/DestinationMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "addMessageInterceptor", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "put", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "removeMessageInterceptor", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "remove", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "addMessageInterceptorForQueue", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "put", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "removeMessageInterceptorForQueue", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "remove", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "addMessageInterceptorForTopic", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "put", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "removeMessageInterceptorForTopic", "(Ljava/lang/String;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/command/ActiveMQDestination", "createDestination", "(Ljava/lang/String;B)Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "remove", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "addMessageInterceptor", "(Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "put", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "removeMessageInterceptor", "(Lorg/apache/activemq/command/ActiveMQDestination;Lorg/apache/activemq/broker/inteceptor/MessageInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "remove", "(Lorg/apache/activemq/command/ActiveMQDestination;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "injectMessage", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/ProducerBrokerExchange");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/ProducerBrokerExchange", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/broker/ConnectionContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/ConnectionContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "getRoot", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "setBroker", "(Lorg/apache/activemq/broker/Broker;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange", "setConnectionContext", "(Lorg/apache/activemq/broker/ConnectionContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange", "setMutable", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/state/ProducerState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/ProducerInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/ProducerInfo", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/state/ProducerState", "<init>", "(Lorg/apache/activemq/command/ProducerInfo;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange", "setProducerState", "(Lorg/apache/activemq/state/ProducerState;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/broker/ProducerBrokerExchange"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerFilter", "send", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "send", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Message", "getDestination", "()Lorg/apache/activemq/command/ActiveMQDestination;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "isEmpty", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/inteceptor/MessageInterceptorFilter", "interceptorMap", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "get", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/activemq/command/ActiveMQDestination", "java/util/Set", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/inteceptor/MessageInterceptor");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/inteceptor/MessageInterceptor", "intercept", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", true);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerFilter", "send", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerFilter", "send", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
