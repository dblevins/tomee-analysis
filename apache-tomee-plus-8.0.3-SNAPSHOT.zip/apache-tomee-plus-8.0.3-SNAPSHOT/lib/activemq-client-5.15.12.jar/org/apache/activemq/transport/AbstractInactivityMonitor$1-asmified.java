package asm.org.apache.activemq.transport;
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
public class AbstractInactivityMonitor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/AbstractInactivityMonitor$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/transport/AbstractInactivityMonitor", null, null);

classWriter.visitInnerClass("org/apache/activemq/transport/AbstractInactivityMonitor$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/transport/AbstractInactivityMonitor$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "startTime", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/AbstractInactivityMonitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "startTime", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/util/concurrent/RejectedExecutionException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "startTime", "J");
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$000", "(Lorg/apache/activemq/transport/AbstractInactivityMonitor;)J", false);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFLT, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$100", "(Lorg/apache/activemq/transport/AbstractInactivityMonitor;)Lorg/apache/activemq/thread/SchedulerTimerTask;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$200", "()Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "isShutdown", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$300", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("No connection attempt made in time for {}! Throwing InactivityIOException.");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/AbstractInactivityMonitor$1", "this$0", "Lorg/apache/activemq/transport/AbstractInactivityMonitor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/AbstractInactivityMonitor", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$200", "()Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/AbstractInactivityMonitor$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/AbstractInactivityMonitor$1$1", "<init>", "(Lorg/apache/activemq/transport/AbstractInactivityMonitor$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "execute", "(Ljava/lang/Runnable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/transport/AbstractInactivityMonitor$1", Opcodes.LONG}, 1, new Object[] {"java/util/concurrent/RejectedExecutionException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$200", "()Ljava/util/concurrent/ThreadPoolExecutor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "isShutdown", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/AbstractInactivityMonitor", "access$300", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Async connection timeout task was rejected from the executor: ");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
