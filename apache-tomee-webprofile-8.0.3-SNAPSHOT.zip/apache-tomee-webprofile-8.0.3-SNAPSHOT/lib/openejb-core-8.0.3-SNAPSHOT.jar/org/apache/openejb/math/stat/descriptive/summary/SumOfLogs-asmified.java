package asm.org.apache.openejb.math.stat.descriptive.summary;
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
public class SumOfLogsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", null, "org/apache/openejb/math/stat/descriptive/AbstractStorelessUnivariateStatistic", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-123076995648386763L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "n", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "D", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/AbstractStorelessUnivariateStatistic", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "value", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/AbstractStorelessUnivariateStatistic", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "copy", "(Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "increment", "(D)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "value", "D");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "log", "(D)D", false);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "value", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResult", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "value", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getN", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "value", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "([DII)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitVarInsn(DSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "test", "([DII)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitVarInsn(DSTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.DOUBLE, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(DLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(DALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "log", "(D)D", false);
methodVisitor.visitInsn(DADD);
methodVisitor.visitVarInsn(DSTORE, 4);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(DLOAD, 4);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "copy", "(Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "copy", "(Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "value", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "value", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/StorelessUnivariateStatistic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "copy", "()Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/UnivariateStatistic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/summary/SumOfLogs", "copy", "()Lorg/apache/openejb/math/stat/descriptive/summary/SumOfLogs;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
