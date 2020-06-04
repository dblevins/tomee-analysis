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
public class ManagedTaskListenerTask$NoopManagedTaskListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener", null, "java/lang/Object", new String[] { "javax/enterprise/concurrent/ManagedTaskListener" });

classWriter.visitInnerClass("org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener", "org/apache/openejb/threads/task/ManagedTaskListenerTask", "NoopManagedTaskListener", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener;", null, null);
fieldVisitor.visitEnd();
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
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskSubmitted", "(Ljava/util/concurrent/Future;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", "(Ljava/util/concurrent/Future<*>;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskAborted", "(Ljava/util/concurrent/Future;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", "(Ljava/util/concurrent/Future<*>;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskDone", "(Ljava/util/concurrent/Future;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", "(Ljava/util/concurrent/Future<*>;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;Ljava/lang/Throwable;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "taskStarting", "(Ljava/util/concurrent/Future;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", "(Ljava/util/concurrent/Future<*>;Ljavax/enterprise/concurrent/ManagedExecutorService;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Lorg/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener", "INSTANCE", "Lorg/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener", "INSTANCE", "Lorg/apache/openejb/threads/task/ManagedTaskListenerTask$NoopManagedTaskListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
