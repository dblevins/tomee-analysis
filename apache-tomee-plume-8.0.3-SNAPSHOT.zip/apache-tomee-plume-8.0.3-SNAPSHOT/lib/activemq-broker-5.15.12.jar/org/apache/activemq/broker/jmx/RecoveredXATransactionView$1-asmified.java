package asm.org.apache.activemq.broker.jmx;
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
public class RecoveredXATransactionView$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", null, "org/apache/activemq/transaction/Synchronization", null);

classWriter.visitOuterClass("org/apache/activemq/broker/jmx/RecoveredXATransactionView", "<init>", "(Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;Lorg/apache/activemq/transaction/XATransaction;)V");

classWriter.visitInnerClass("org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$managedRegionBroker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$transaction", "Lorg/apache/activemq/transaction/XATransaction;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/jmx/RecoveredXATransactionView;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/jmx/RecoveredXATransactionView;Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;Lorg/apache/activemq/transaction/XATransaction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "this$0", "Lorg/apache/activemq/broker/jmx/RecoveredXATransactionView;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "val$managedRegionBroker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "val$transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transaction/Synchronization", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCommit", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "val$managedRegionBroker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "val$transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "unregister", "(Lorg/apache/activemq/transaction/XATransaction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterRollback", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "val$managedRegionBroker", "Lorg/apache/activemq/broker/jmx/ManagedRegionBroker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/jmx/RecoveredXATransactionView$1", "val$transaction", "Lorg/apache/activemq/transaction/XATransaction;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/jmx/ManagedRegionBroker", "unregister", "(Lorg/apache/activemq/transaction/XATransaction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
