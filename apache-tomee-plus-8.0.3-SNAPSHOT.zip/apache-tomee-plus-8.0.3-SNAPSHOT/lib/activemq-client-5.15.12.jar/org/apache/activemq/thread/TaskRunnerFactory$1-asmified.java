package asm.org.apache.activemq.thread;
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
public class TaskRunnerFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/thread/TaskRunnerFactory$1", null, "java/lang/Object", new String[] { "java/util/concurrent/ThreadFactory" });

classWriter.visitOuterClass("org/apache/activemq/thread/TaskRunnerFactory", "createDefaultExecutor", "()Ljava/util/concurrent/ExecutorService;");

classWriter.visitInnerClass("org/apache/activemq/thread/TaskRunnerFactory$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/thread/TaskRunnerFactory$1$1", null, null, 0);

classWriter.visitInnerClass("java/lang/Thread$UncaughtExceptionHandler", "java/lang/Thread", "UncaughtExceptionHandler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/thread/TaskRunnerFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/thread/TaskRunnerFactory$1", "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/TaskRunnerFactory$1", "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/TaskRunnerFactory", "access$000", "(Lorg/apache/activemq/thread/TaskRunnerFactory;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/TaskRunnerFactory$1", "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/TaskRunnerFactory", "access$100", "(Lorg/apache/activemq/thread/TaskRunnerFactory;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "incrementAndGet", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/Thread");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "(Ljava/lang/Runnable;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/TaskRunnerFactory$1", "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/TaskRunnerFactory", "access$200", "(Lorg/apache/activemq/thread/TaskRunnerFactory;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setDaemon", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/TaskRunnerFactory$1", "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/TaskRunnerFactory", "access$300", "(Lorg/apache/activemq/thread/TaskRunnerFactory;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setPriority", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/TaskRunnerFactory$1", "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/TaskRunnerFactory", "access$400", "(Lorg/apache/activemq/thread/TaskRunnerFactory;)Ljava/lang/ClassLoader;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/thread/TaskRunnerFactory$1", "this$0", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/TaskRunnerFactory", "access$400", "(Lorg/apache/activemq/thread/TaskRunnerFactory;)Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/Thread"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/thread/TaskRunnerFactory$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/thread/TaskRunnerFactory$1$1", "<init>", "(Lorg/apache/activemq/thread/TaskRunnerFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setUncaughtExceptionHandler", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/thread/TaskRunnerFactory", "access$500", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Created thread[{}]: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
