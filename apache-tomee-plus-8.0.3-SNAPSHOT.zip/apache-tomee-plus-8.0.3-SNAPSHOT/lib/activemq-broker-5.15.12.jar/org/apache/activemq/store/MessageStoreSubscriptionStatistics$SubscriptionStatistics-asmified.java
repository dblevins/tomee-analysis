package asm.org.apache.activemq.store;
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
public class MessageStoreSubscriptionStatistics$SubscriptionStatisticsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/MessageStoreSubscriptionStatistics$SubscriptionStatistics", null, "org/apache/activemq/store/AbstractMessageStoreStatistics", null);

classWriter.visitInnerClass("org/apache/activemq/store/MessageStoreSubscriptionStatistics$SubscriptionStatistics", "org/apache/activemq/store/MessageStoreSubscriptionStatistics", "SubscriptionStatistics", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/MessageStoreSubscriptionStatistics;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/MessageStoreSubscriptionStatistics;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/MessageStoreSubscriptionStatistics", "access$000", "(Lorg/apache/activemq/store/MessageStoreSubscriptionStatistics;)Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/MessageStoreSubscriptionStatistics$SubscriptionStatistics", "<init>", "(Lorg/apache/activemq/store/MessageStoreSubscriptionStatistics;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/MessageStoreSubscriptionStatistics;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/MessageStoreSubscriptionStatistics$SubscriptionStatistics", "this$0", "Lorg/apache/activemq/store/MessageStoreSubscriptionStatistics;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLdcInsn("The number of messages or this subscription in the message store");
methodVisitor.visitLdcInsn("Size of messages contained by this subscription in the message store");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/AbstractMessageStoreStatistics", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/MessageStoreSubscriptionStatistics$SubscriptionStatistics", "setParent", "(Lorg/apache/activemq/store/AbstractMessageStoreStatistics;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
