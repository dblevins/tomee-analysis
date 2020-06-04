package asm.org.apache.activemq.broker.region.policy;
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
public class QueryBasedSubscriptionRecoveryPolicy$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", null, "java/lang/Object", new String[] { "javax/jms/MessageListener" });

classWriter.visitOuterClass("org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy", "recover", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/Topic;Lorg/apache/activemq/broker/region/SubscriptionRecovery;)V");

classWriter.visitInnerClass("org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$topic", "Lorg/apache/activemq/broker/region/Topic;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$context", "Lorg/apache/activemq/broker/ConnectionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$sub", "Lorg/apache/activemq/broker/region/SubscriptionRecovery;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy;Lorg/apache/activemq/broker/region/Topic;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/SubscriptionRecovery;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "this$0", "Lorg/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "val$topic", "Lorg/apache/activemq/broker/region/Topic;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "val$context", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "val$sub", "Lorg/apache/activemq/broker/region/SubscriptionRecovery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onMessage", "(Ljavax/jms/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "this$0", "Lorg/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "val$topic", "Lorg/apache/activemq/broker/region/Topic;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "val$context", "Lorg/apache/activemq/broker/ConnectionContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy$1", "val$sub", "Lorg/apache/activemq/broker/region/SubscriptionRecovery;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/region/policy/QueryBasedSubscriptionRecoveryPolicy", "dispatchInitialMessage", "(Ljavax/jms/Message;Lorg/apache/activemq/broker/region/Destination;Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/broker/region/SubscriptionRecovery;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
