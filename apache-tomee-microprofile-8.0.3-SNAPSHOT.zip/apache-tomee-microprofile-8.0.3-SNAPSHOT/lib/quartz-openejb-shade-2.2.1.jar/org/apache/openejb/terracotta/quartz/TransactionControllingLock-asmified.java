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
public class TransactionControllingLockDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", null, "java/lang/Object", new String[] { "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock" });

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "HoldState", 0);

classWriter.visitInnerClass("org/apache/openejb/terracotta/quartz/TransactionControllingLock$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "threadState", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "txnController", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionController;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "txnType", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/terracotta/toolkit/internal/ToolkitInternal;Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$1", "<init>", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "threadState", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/terracotta/toolkit/ToolkitFeatureTypeInternal", "TRANSACTION", "Lorg/apache/openejb/terracotta/toolkit/ToolkitFeatureTypeInternal;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/internal/ToolkitInternal", "getFeature", "(Lorg/apache/openejb/terracotta/toolkit/ToolkitFeatureTypeInternal;)Lorg/apache/openejb/terracotta/toolkit/ToolkitFeature;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionController");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "txnController", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionController;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "txnType", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newCondition", "()Ljava/util/concurrent/locks/Condition;", null, new String[] { "java/lang/UnsupportedOperationException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCondition", "()Ljava/util/concurrent/locks/Condition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLockType", "()Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLockType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "getLockType", "()Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLockType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isHeldByCurrentThread", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "isHeldByCurrentThread", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lock", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "lock", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "threadState", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "lock", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "unlock", "()V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lockInterruptibly", "()V", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "lockInterruptibly", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "threadState", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "lock", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "unlock", "()V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tryLock", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "tryLock", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "threadState", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "lock", "()V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "unlock", "()V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tryLock", "(JLjava/util/concurrent/TimeUnit;)Z", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/terracotta/toolkit/rejoin/RejoinException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "tryLock", "(JLjava/util/concurrent/TimeUnit;)Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "threadState", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "lock", "()V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/terracotta/toolkit/rejoin/RejoinException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "unlock", "()V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unlock", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "threadState", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/terracotta/quartz/TransactionControllingLock$HoldState", "unlock", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "unlock", "()V", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "unlock", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "delegate", "Lorg/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/terracotta/toolkit/concurrent/locks/ToolkitLock", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "txnType", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "txnController", "Lorg/apache/openejb/terracotta/toolkit/atomic/ToolkitTransactionController;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/openejb/terracotta/quartz/TransactionControllingLock;)Ljava/lang/ThreadLocal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/terracotta/quartz/TransactionControllingLock", "threadState", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
