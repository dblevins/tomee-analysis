package asm.jakarta.enterprise.concurrent;
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
public class ManagedExecutorsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "jakarta/enterprise/concurrent/ManagedExecutors", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/enterprise/concurrent/ManagedExecutors$Adapter", "jakarta/enterprise/concurrent/ManagedExecutors", "Adapter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("jakarta/enterprise/concurrent/ManagedExecutors$CallableAdapter", "jakarta/enterprise/concurrent/ManagedExecutors", "CallableAdapter", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("jakarta/enterprise/concurrent/ManagedExecutors$RunnableAdapter", "jakarta/enterprise/concurrent/ManagedExecutors", "RunnableAdapter", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_TASK_ERROR_MSG", "Ljava/lang/String;", null, "Task cannot be null");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isCurrentThreadShutdown", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/enterprise/concurrent/ManageableThread");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/concurrent/ManageableThread;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/enterprise/concurrent/ManageableThread");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/concurrent/ManageableThread", "isShutdown", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Thread"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "managedTask", "(Ljava/lang/Runnable;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/lang/Runnable;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/enterprise/concurrent/ManagedExecutors", "managedTask", "(Ljava/lang/Runnable;Ljava/util/Map;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/lang/Runnable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "managedTask", "(Ljava/lang/Runnable;Ljava/util/Map;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/lang/Runnable;", "(Ljava/lang/Runnable;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/lang/Runnable;", new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Task cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/concurrent/ManagedExecutors$RunnableAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/concurrent/ManagedExecutors$RunnableAdapter", "<init>", "(Ljava/lang/Runnable;Ljava/util/Map;Ljakarta/enterprise/concurrent/ManagedTaskListener;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "managedTask", "(Ljava/util/concurrent/Callable;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/util/concurrent/Callable;", "<V:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TV;>;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/util/concurrent/Callable<TV;>;", new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/enterprise/concurrent/ManagedExecutors", "managedTask", "(Ljava/util/concurrent/Callable;Ljava/util/Map;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/util/concurrent/Callable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "managedTask", "(Ljava/util/concurrent/Callable;Ljava/util/Map;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/util/concurrent/Callable;", "<V:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TV;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljakarta/enterprise/concurrent/ManagedTaskListener;)Ljava/util/concurrent/Callable<TV;>;", new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Task cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/concurrent/ManagedExecutors$CallableAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/concurrent/ManagedExecutors$CallableAdapter", "<init>", "(Ljava/util/concurrent/Callable;Ljava/util/Map;Ljakarta/enterprise/concurrent/ManagedTaskListener;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
