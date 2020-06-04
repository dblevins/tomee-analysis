package asm.org.apache.openejb.core.transaction;
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
public class JtaTransactionPolicy$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/transaction/JtaTransactionPolicy$1", null, "java/lang/Object", new String[] { "jakarta/transaction/Synchronization" });

classWriter.visitOuterClass("org/apache/openejb/core/transaction/JtaTransactionPolicy", "registerSynchronization", "(Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization;)V");

classWriter.visitInnerClass("org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization", "org/apache/openejb/core/transaction/TransactionPolicy", "TransactionSynchronization", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/core/transaction/JtaTransactionPolicy$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status", "org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$synchronization", "Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/transaction/JtaTransactionPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/core/transaction/JtaTransactionPolicy;Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/JtaTransactionPolicy$1", "this$0", "Lorg/apache/openejb/core/transaction/JtaTransactionPolicy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/transaction/JtaTransactionPolicy$1", "val$synchronization", "Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeCompletion", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/JtaTransactionPolicy$1", "val$synchronization", "Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization", "beforeCompletion", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCompletion", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status", "COMMITTED", "Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status;");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status", "ROLLEDBACK", "Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status", "UNKNOWN", "Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/transaction/JtaTransactionPolicy$1", "val$synchronization", "Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization", "afterCompletion", "(Lorg/apache/openejb/core/transaction/TransactionPolicy$TransactionSynchronization$Status;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
