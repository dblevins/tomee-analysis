package asm.org.apache.openejb.util;
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
public class Pool$StatsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/util/Pool$Stats", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/openejb/util/Pool$Stats", "org/apache/openejb/util/Pool", "Stats", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Overdraft", "org/apache/openejb/util/Pool", "Overdraft", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sweeps", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "flushes", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "accessTimeouts", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "garbageCollected", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "idleTimeouts", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "aged", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "flushed", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "overdrafts", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "replaced", "Lorg/apache/openejb/monitoring/Event;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "minSize", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "maxSize", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "idleTimeout", "J", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/util/Pool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/util/Pool;IIJ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "sweeps", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "flushes", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "accessTimeouts", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "garbageCollected", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "idleTimeouts", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "aged", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "flushed", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "overdrafts", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/monitoring/Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/monitoring/Event", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "replaced", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "minSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "maxSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Stats", "idleTimeout", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getStrictPooling", "()Z", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$4100", "(Lorg/apache/openejb/util/Pool;)Ljava/util/concurrent/Semaphore;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openejb/util/Pool$Overdraft");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getAvailablePermits", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$4100", "(Lorg/apache/openejb/util/Pool;)Ljava/util/concurrent/Semaphore;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "availablePermits", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getInstancesPooled", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "maxSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$4200", "(Lorg/apache/openejb/util/Pool;)Ljava/util/concurrent/Semaphore;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "availablePermits", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getInstancesIdle", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Stats", "getInstancesPooled", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Stats", "getInstancesActive", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getInstancesInitializing", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Stats", "getInstancesActive", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Stats", "getInstancesPooled", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getInstancesActive", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "maxSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Stats", "getAvailablePermits", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getMinimumInstances", "()I", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/openejb/monitoring/Managed;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "minSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$4300", "(Lorg/apache/openejb/util/Pool;)Ljava/util/concurrent/Semaphore;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/Semaphore", "availablePermits", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/util/Pool;IIJLorg/apache/openejb/util/Pool$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Stats", "<init>", "(Lorg/apache/openejb/util/Pool;IIJ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "flushes", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "accessTimeouts", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2100", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "sweeps", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$3400", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "replaced", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$3600", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "aged", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$3700", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "flushed", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$3800", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "overdrafts", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$3900", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "idleTimeouts", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$4000", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Stats", "garbageCollected", "Lorg/apache/openejb/monitoring/Event;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
