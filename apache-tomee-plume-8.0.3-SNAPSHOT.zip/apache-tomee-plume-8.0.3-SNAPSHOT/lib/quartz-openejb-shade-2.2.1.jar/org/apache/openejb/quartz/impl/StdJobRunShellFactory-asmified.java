package asm.org.apache.openejb.quartz.impl;
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
public class StdJobRunShellFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/impl/StdJobRunShellFactory", null, "java/lang/Object", new String[] { "org/apache/openejb/quartz/core/JobRunShellFactory" });

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/openejb/quartz/Scheduler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/impl/StdJobRunShellFactory", "scheduler", "Lorg/apache/openejb/quartz/Scheduler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createJobRunShell", "(Lorg/apache/openejb/quartz/spi/TriggerFiredBundle;)Lorg/apache/openejb/quartz/core/JobRunShell;", null, new String[] { "org/apache/openejb/quartz/SchedulerException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/core/JobRunShell");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/impl/StdJobRunShellFactory", "scheduler", "Lorg/apache/openejb/quartz/Scheduler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/JobRunShell", "<init>", "(Lorg/apache/openejb/quartz/Scheduler;Lorg/apache/openejb/quartz/spi/TriggerFiredBundle;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
