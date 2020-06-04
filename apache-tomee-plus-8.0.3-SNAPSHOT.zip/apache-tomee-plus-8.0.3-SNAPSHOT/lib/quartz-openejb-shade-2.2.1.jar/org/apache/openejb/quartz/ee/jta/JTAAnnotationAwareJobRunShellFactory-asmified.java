package asm.org.apache.openejb.quartz.ee.jta;
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
public class JTAAnnotationAwareJobRunShellFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/ee/jta/JTAAnnotationAwareJobRunShellFactory", null, "java/lang/Object", new String[] { "org/apache/openejb/quartz/core/JobRunShellFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "scheduler", "Lorg/apache/openejb/quartz/Scheduler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/openejb/quartz/Scheduler;)V", null, new String[] { "org/apache/openejb/quartz/SchedulerConfigException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/ee/jta/JTAAnnotationAwareJobRunShellFactory", "scheduler", "Lorg/apache/openejb/quartz/Scheduler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createJobRunShell", "(Lorg/apache/openejb/quartz/spi/TriggerFiredBundle;)Lorg/apache/openejb/quartz/core/JobRunShell;", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/spi/TriggerFiredBundle", "getJobDetail", "()Lorg/apache/openejb/quartz/JobDetail;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/JobDetail", "getJobClass", "()Ljava/lang/Class;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/quartz/ExecuteInJTATransaction;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/utils/ClassUtils", "getAnnotation", "(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/ExecuteInJTATransaction");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/core/JobRunShell");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/ee/jta/JTAAnnotationAwareJobRunShellFactory", "scheduler", "Lorg/apache/openejb/quartz/Scheduler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/JobRunShell", "<init>", "(Lorg/apache/openejb/quartz/Scheduler;Lorg/apache/openejb/quartz/spi/TriggerFiredBundle;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/quartz/ExecuteInJTATransaction"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/quartz/ExecuteInJTATransaction", "timeout", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/ee/jta/JTAJobRunShell");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/ee/jta/JTAAnnotationAwareJobRunShellFactory", "scheduler", "Lorg/apache/openejb/quartz/Scheduler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/ee/jta/JTAJobRunShell", "<init>", "(Lorg/apache/openejb/quartz/Scheduler;Lorg/apache/openejb/quartz/spi/TriggerFiredBundle;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/ee/jta/JTAJobRunShell");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/ee/jta/JTAAnnotationAwareJobRunShellFactory", "scheduler", "Lorg/apache/openejb/quartz/Scheduler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/ee/jta/JTAJobRunShell", "<init>", "(Lorg/apache/openejb/quartz/Scheduler;Lorg/apache/openejb/quartz/spi/TriggerFiredBundle;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
