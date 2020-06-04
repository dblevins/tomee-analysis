package asm.org.apache.activemq.broker.region.virtual;
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
public class CompositeDestinationFilter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/broker/region/virtual/CompositeDestinationFilter", "send", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V");

classWriter.visitInnerClass("org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$exceptionAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$context", "Lorg/apache/activemq/broker/ProducerBrokerExchange;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$message", "Lorg/apache/activemq/command/Message;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$brokerService", "Lorg/apache/activemq/broker/BrokerService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$destination", "Lorg/apache/activemq/command/ActiveMQDestination;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$concurrent", "Ljava/util/concurrent/CountDownLatch;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/region/virtual/CompositeDestinationFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/region/virtual/CompositeDestinationFilter;Ljava/util/concurrent/atomic/AtomicReference;Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/command/ActiveMQDestination;Ljava/util/concurrent/CountDownLatch;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "this$0", "Lorg/apache/activemq/broker/region/virtual/CompositeDestinationFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$exceptionAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$context", "Lorg/apache/activemq/broker/ProducerBrokerExchange;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$destination", "Lorg/apache/activemq/command/ActiveMQDestination;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$concurrent", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$exceptionAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "this$0", "Lorg/apache/activemq/broker/region/virtual/CompositeDestinationFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$context", "Lorg/apache/activemq/broker/ProducerBrokerExchange;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ProducerBrokerExchange", "copy", "()Lorg/apache/activemq/broker/ProducerBrokerExchange;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$message", "Lorg/apache/activemq/command/Message;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/BrokerService", "getRegionBroker", "()Lorg/apache/activemq/broker/Broker;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$destination", "Lorg/apache/activemq/command/ActiveMQDestination;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter", "access$000", "(Lorg/apache/activemq/broker/region/virtual/CompositeDestinationFilter;Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;Lorg/apache/activemq/broker/Broker;Lorg/apache/activemq/command/ActiveMQDestination;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$concurrent", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$exceptionAtomicReference", "Ljava/util/concurrent/atomic/AtomicReference;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicReference", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$concurrent", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/virtual/CompositeDestinationFilter$1", "val$concurrent", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
