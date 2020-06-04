package asm.org.apache.openejb.terracotta.quartz;
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
public class TransactionControllingLock$HoldStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "HoldState", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "txnHandle", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransaction;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "holdCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "holdCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "lock", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "holdCount", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "holdCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "txnHandle", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransaction;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "access$100", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionController;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "access$000", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionType;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionController", "beginTransaction", "(Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionType;)Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransaction;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "txnHandle", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransaction;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "unlock", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "holdCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "holdCount", "I");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFGT, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "txnHandle", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransaction;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/atomic/ToolkitTransaction", "commit", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "access$200", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)Ljava/lang/ThreadLocal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "remove", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Exception caught during commit, transaction may or may not have committed.");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "this$0", "Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "access$200", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)Ljava/lang/ThreadLocal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "remove", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
