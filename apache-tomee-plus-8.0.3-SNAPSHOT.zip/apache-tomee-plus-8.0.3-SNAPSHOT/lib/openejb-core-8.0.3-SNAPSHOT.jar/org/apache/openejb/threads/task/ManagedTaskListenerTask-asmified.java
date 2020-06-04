package asm.org.apache.openejb.threads.task;
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
public class ManagedTaskListenerTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openejb/threads/task/ManagedTaskListenerTask", null, "java/lang/Object", new String[] { "jakarta/enterprise/concurrent/ManagedTaskListener" });

classWriter.visitInnerClass("org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener", "org/apache/openejb/threads/task/ManagedTaskListenerTask", "NoopManagedTaskListener", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "future", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "delegate", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "executor", "Ljakarta/enterprise/concurrent/ManagedExecutorService;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/concurrent/ManagedTask;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/concurrent/ManagedTask;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/enterprise/concurrent/ManagedTask");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/concurrent/ManagedTask", "getManagedTaskListener", "()Ljakarta/enterprise/concurrent/ManagedTaskListener;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openejb/threads/task/ManagedTaskListenerTask", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener", "access$000", "()Lorg/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "delegate", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskSubmitted", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", "(Ljava/util/concurrent/Future<*>;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "future", "Ljava/util/concurrent/Future;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "executor", "Ljakarta/enterprise/concurrent/ManagedExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/concurrent/ManagedTaskListener", "taskSubmitted", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskAborted", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", "(Ljava/util/concurrent/Future<*>;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "future", "Ljava/util/concurrent/Future;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "executor", "Ljakarta/enterprise/concurrent/ManagedExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "delegate", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/concurrent/ManagedTaskListener", "taskAborted", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskDone", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", "(Ljava/util/concurrent/Future<*>;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/concurrent/ManagedTaskListener", "taskDone", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskStarting", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", "(Ljava/util/concurrent/Future<*>;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "listener", "Ljakarta/enterprise/concurrent/ManagedTaskListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/concurrent/ManagedTaskListener", "taskStarting", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskAborted", "(Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "future", "Ljava/util/concurrent/Future;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "executor", "Ljakarta/enterprise/concurrent/ManagedExecutorService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "delegate", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "taskAborted", "(Ljava/util/concurrent/Future;Ljakarta/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegate", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/ManagedTaskListenerTask", "delegate", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
