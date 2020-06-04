package asm.org.apache.openejb.quartz.core;
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
public class QuartzSchedulerMBeanImpl$EmitterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl$Emitter", null, "jakarta/management/NotificationBroadcasterSupport", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl$Emitter", "org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl", "Emitter", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl$1", "org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl", null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl$Emitter", "this$0", "Lorg/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/management/NotificationBroadcasterSupport", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNotificationInfo", "()[Ljakarta/management/MBeanNotificationInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl$Emitter", "this$0", "Lorg/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl", "getNotificationInfo", "()[Ljakarta/management/MBeanNotificationInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl;Lorg/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl$Emitter", "<init>", "(Lorg/apache/openejb/quartz/core/QuartzSchedulerMBeanImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
