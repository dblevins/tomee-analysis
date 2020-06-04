package asm.org.apache.tomcat.dbcp.pool2.impl;
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
public class EvictionTimerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/EvictionTimer$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/EvictionTimer$EvictorThreadFactory", "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "EvictorThreadFactory", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor", "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool", "Evictor", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("EvictionTimer []");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNCHRONIZED, "schedule", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;JJ)V", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool<*>.Evictor;JJ)V", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ScheduledThreadPoolExecutor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer$EvictorThreadFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer$EvictorThreadFactory", "<init>", "(Lorg/apache/tomcat/dbcp/pool2/impl/EvictionTimer$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ScheduledThreadPoolExecutor", "<init>", "(ILjava/util/concurrent/ThreadFactory;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ScheduledThreadPoolExecutor", "setRemoveOnCancelPolicy", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ScheduledThreadPoolExecutor", "scheduleWithFixedDelay", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor", "setScheduledFuture", "(Ljava/util/concurrent/ScheduledFuture;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNCHRONIZED, "cancel", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor;JLjava/util/concurrent/TimeUnit;)V", "(Lorg/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool<*>.Evictor;JLjava/util/concurrent/TimeUnit;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitVarInsn(ALOAD, 0);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/pool2/impl/BaseGenericObjectPool$Evictor", "cancel", "()V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ScheduledThreadPoolExecutor", "getQueue", "()Ljava/util/concurrent/BlockingQueue;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ScheduledThreadPoolExecutor", "shutdown", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ScheduledThreadPoolExecutor", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ScheduledThreadPoolExecutor", "setCorePoolSize", "(I)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/dbcp/pool2/impl/EvictionTimer", "executor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
