package asm.org.apache.openejb.core.ivm;
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
public class IntraVmCopyMonitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "State", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "threadMonitor", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "state", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "NONE", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "state", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "exists", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "threadMonitor", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "threadMonitor", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getMonitor", "()Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "threadMonitor", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/ivm/IntraVmCopyMonitor");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/ivm/IntraVmCopyMonitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "threadMonitor", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/core/ivm/IntraVmCopyMonitor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "pre", "(Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "getMonitor", "()Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "state", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "post", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "NONE", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "pre", "(Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "state", "()Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "getMonitor", "()Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "state", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "prePassivationOperation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "PASSIVATION", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "pre", "(Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "postPassivationOperation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "post", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "preCrossClassLoaderOperation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "CLASSLOADER_COPY", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "pre", "(Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "postCrossClassLoaderOperation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "post", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "preCopyOperation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "COPY", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "pre", "(Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "postCopyOperation", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "post", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isIntraVmCopyOperation", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "state", "()Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "COPY", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isStatefulPassivationOperation", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "state", "()Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "PASSIVATION", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isCrossClassLoaderOperation", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "state", "()Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor$State", "CLASSLOADER_COPY", "Lorg/apache/openejb/core/ivm/IntraVmCopyMonitor$State;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/ivm/IntraVmCopyMonitor", "threadMonitor", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
