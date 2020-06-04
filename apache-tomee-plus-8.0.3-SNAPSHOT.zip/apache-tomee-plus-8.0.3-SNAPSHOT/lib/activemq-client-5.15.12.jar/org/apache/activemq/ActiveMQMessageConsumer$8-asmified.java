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
public class ActiveMQMessageConsumer$8Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/ActiveMQMessageConsumer$8", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/ActiveMQMessageConsumer", "setOptimizedAckScheduledAckInterval", "(J)V");

classWriter.visitInnerClass("org/apache/activemq/ActiveMQMessageConsumer$8", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/ActiveMQMessageConsumer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/ActiveMQMessageConsumer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ActiveMQMessageConsumer$8", "this$0", "Lorg/apache/activemq/ActiveMQMessageConsumer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQMessageConsumer$8", "this$0", "Lorg/apache/activemq/ActiveMQMessageConsumer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ActiveMQMessageConsumer", "access$800", "(Lorg/apache/activemq/ActiveMQMessageConsumer;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQMessageConsumer$8", "this$0", "Lorg/apache/activemq/ActiveMQMessageConsumer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQMessageConsumer", "unconsumedMessages", "Lorg/apache/activemq/MessageDispatchChannel;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/MessageDispatchChannel", "isClosed", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ActiveMQMessageConsumer", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Consumer:{} is performing scheduled delivery of outstanding optimized Acks");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQMessageConsumer$8", "this$0", "Lorg/apache/activemq/ActiveMQMessageConsumer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQMessageConsumer", "info", "Lorg/apache/activemq/command/ConsumerInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerInfo", "getConsumerId", "()Lorg/apache/activemq/command/ConsumerId;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQMessageConsumer$8", "this$0", "Lorg/apache/activemq/ActiveMQMessageConsumer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQMessageConsumer", "deliverAcks", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ActiveMQMessageConsumer", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Optimized Ack Task caught exception during ack");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
