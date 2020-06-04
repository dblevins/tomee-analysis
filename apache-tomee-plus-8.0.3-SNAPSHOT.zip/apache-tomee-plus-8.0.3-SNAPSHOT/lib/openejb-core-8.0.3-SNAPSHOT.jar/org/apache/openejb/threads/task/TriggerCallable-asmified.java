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
public class TriggerCallableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/threads/task/TriggerCallable", "<V:Ljava/lang/Object;>Lorg/apache/openejb/threads/task/TriggerTask<TV;>;Ljava/util/concurrent/Callable<TV;>;", "org/apache/openejb/threads/task/TriggerTask", new String[] { "java/util/concurrent/Callable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Callable<TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/threads/impl/ManagedScheduledExecutorServiceImpl;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;Ljavax/enterprise/concurrent/Trigger;Ljava/util/Date;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;)V", "(Lorg/apache/openejb/threads/impl/ManagedScheduledExecutorServiceImpl;Ljava/util/concurrent/Callable<TV;>;Ljava/util/concurrent/Callable<TV;>;Ljavax/enterprise/concurrent/Trigger;Ljava/util/Date;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference<Ljava/util/concurrent/Future<TV;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/threads/task/TriggerTask", "<init>", "(Ljava/lang/Object;Lorg/apache/openejb/threads/impl/ManagedScheduledExecutorServiceImpl;Ljavax/enterprise/concurrent/Trigger;Ljava/util/Date;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/threads/task/TriggerCallable", "delegate", "Ljava/util/concurrent/Callable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Ljava/lang/Object;", "()TV;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/threads/task/TriggerCallable", "invoke", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInvoke", "()Ljava/lang/Object;", "()TV;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/threads/task/TriggerCallable", "delegate", "Ljava/util/concurrent/Callable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Callable", "call", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
