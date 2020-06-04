package asm.org.apache.openejb.math.stat.descriptive.moment;
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
public class ThirdMomentDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", null, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-1238711964045118679L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "m3", "D", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "nDevSq", "D", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDevSq", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "copy", "(Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "increment", "(D)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "n", "J");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m1", "D");
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m2", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m2", "D");
methodVisitor.visitVarInsn(DSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "increment", "(D)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDev", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDev", "D");
methodVisitor.visitInsn(DMUL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDevSq", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "n", "J");
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(DSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitLdcInsn(new Double("3.0"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDev", "D");
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(DLOAD, 3);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(DSUB);
methodVisitor.visitVarInsn(DLOAD, 5);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DSUB);
methodVisitor.visitVarInsn(DLOAD, 5);
methodVisitor.visitLdcInsn(new Double("2.0"));
methodVisitor.visitInsn(DSUB);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDevSq", "D");
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "dev", "D");
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResult", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "clear", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDevSq", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "copy", "(Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "copy", "(Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "copy", "(Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "m3", "D");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDevSq", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "nDevSq", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/FirstMoment;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/StorelessUnivariateStatistic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/UnivariateStatistic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/moment/ThirdMoment", "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/ThirdMoment;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
