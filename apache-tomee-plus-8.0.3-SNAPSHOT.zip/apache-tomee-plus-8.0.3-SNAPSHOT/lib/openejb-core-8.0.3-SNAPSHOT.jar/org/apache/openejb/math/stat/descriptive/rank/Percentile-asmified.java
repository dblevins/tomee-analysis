package asm.org.apache.openejb.math.stat.descriptive.rank;
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
public class PercentileDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/math/stat/descriptive/rank/Percentile", null, "org/apache/openejb/math/stat/descriptive/AbstractUnivariateStatistic", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-1231216485095130416L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "quantile", "D", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Double("50.0"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "<init>", "(D)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(D)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/AbstractUnivariateStatistic", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "setQuantile", "(D)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/AbstractUnivariateStatistic", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "copy", "(Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "([DD)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "test", "([DII)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(DLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "evaluate", "([DIID)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "([DII)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "quantile", "D");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "evaluate", "([DIID)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "([DIID)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "test", "([DII)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(DLOAD, 4);
methodVisitor.visitLdcInsn(new Double("100.0"));
methodVisitor.visitInsn(DCMPL);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(DLOAD, 4);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DCMPG);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGT, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("out of bounds quantile value: {0}, must be in (0, 100]");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(DLOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/MathRuntimeException", "createIllegalArgumentException", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLdcInsn(new Double("NaN"));
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(DALOAD);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(I2D);
methodVisitor.visitVarInsn(DSTORE, 6);
methodVisitor.visitVarInsn(DLOAD, 4);
methodVisitor.visitVarInsn(DLOAD, 6);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DADD);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitLdcInsn(new Double("100.0"));
methodVisitor.visitInsn(DDIV);
methodVisitor.visitVarInsn(DSTORE, 8);
methodVisitor.visitVarInsn(DLOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "floor", "(D)D", false);
methodVisitor.visitVarInsn(DSTORE, 10);
methodVisitor.visitVarInsn(DLOAD, 10);
methodVisitor.visitInsn(D2I);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitVarInsn(DLOAD, 8);
methodVisitor.visitVarInsn(DLOAD, 10);
methodVisitor.visitInsn(DSUB);
methodVisitor.visitVarInsn(DSTORE, 13);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_DOUBLE);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "sort", "([D)V", false);
methodVisitor.visitVarInsn(DLOAD, 8);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DCMPG);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFGE, label4);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(DALOAD);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/openejb/math/stat/descriptive/rank/Percentile", "[D", Opcodes.INTEGER, Opcodes.INTEGER, Opcodes.DOUBLE, Opcodes.DOUBLE, Opcodes.DOUBLE, Opcodes.DOUBLE, Opcodes.INTEGER, Opcodes.DOUBLE, "[D"}, 0, new Object[] {});
methodVisitor.visitVarInsn(DLOAD, 8);
methodVisitor.visitVarInsn(DLOAD, 6);
methodVisitor.visitInsn(DCMPL);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFLT, label5);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(DALOAD);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(DALOAD);
methodVisitor.visitVarInsn(DSTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitInsn(DALOAD);
methodVisitor.visitVarInsn(DSTORE, 18);
methodVisitor.visitVarInsn(DLOAD, 16);
methodVisitor.visitVarInsn(DLOAD, 13);
methodVisitor.visitVarInsn(DLOAD, 18);
methodVisitor.visitVarInsn(DLOAD, 16);
methodVisitor.visitInsn(DSUB);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(DADD);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(8, 20);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQuantile", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "quantile", "D");
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQuantile", "(D)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DCMPG);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitLdcInsn(new Double("100.0"));
methodVisitor.visitInsn(DCMPL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("out of bounds quantile value: {0}, must be in (0, 100]");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/MathRuntimeException", "createIllegalArgumentException", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "quantile", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/math/stat/descriptive/rank/Percentile");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "copy", "(Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "copy", "(Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "quantile", "D");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "quantile", "D");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "copy", "()Lorg/apache/openejb/math/stat/descriptive/UnivariateStatistic;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/math/stat/descriptive/rank/Percentile", "copy", "()Lorg/apache/openejb/math/stat/descriptive/rank/Percentile;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
