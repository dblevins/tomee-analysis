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
public class SecondMomentDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", null, "org/apache/openejb/math/stat/descriptive/moment/FirstMoment", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1232403127395076445L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "m2", "D", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/FirstMoment", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/FirstMoment", "<init>", "(Lorg/apache/openejb/math/stat/descriptive/moment/FirstMoment;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "increment", "(D)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "n", "J");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m1", "D");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/FirstMoment", "increment", "(D)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "n", "J");
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DSUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "dev", "D");
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "nDev", "D");
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(DADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/FirstMoment", "clear", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResult", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "copy", "(Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "copy", "(Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/moment/FirstMoment", "copy", "(Lorg/apache/openejb/math/stat/descriptive/moment/FirstMoment;Lorg/apache/openejb/math/stat/descriptive/moment/FirstMoment;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "m2", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/FirstMoment;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/StorelessUnivariateStatistic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/UnivariateStatistic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/moment/SecondMoment", "copy", "()Lorg/apache/openejb/math/stat/descriptive/moment/SecondMoment;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
