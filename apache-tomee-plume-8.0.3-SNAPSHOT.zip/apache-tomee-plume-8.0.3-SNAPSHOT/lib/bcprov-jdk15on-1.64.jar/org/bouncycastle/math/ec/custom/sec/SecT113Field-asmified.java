package asm.org.bouncycastle.math.ec.custom.sec;
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
public class SecT113FieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/math/ec/custom/sec/SecT113Field", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "M49", "J", null, new Long(562949953421311L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "M57", "J", null, new Long(144115188075855871L));
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "add", "([J[J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addExt", "([J[J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addOne", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "addTo", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromBigInteger", "(Ljava/math/BigInteger;)[J", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat", "fromBigInteger64", "(ILjava/math/BigInteger;)[J", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "halfTrace", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "createExt64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "copy64", "([J[J)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 113);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implSquare", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "reduce", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implSquare", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "reduce", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "addTo", "([J[J)V", false);
methodVisitor.visitIincInsn(3, 2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invert", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "isZero64", "([J)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "create64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "create64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "square", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "square", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "squareN", "([JI[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "square", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "squareN", "([JI[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "squareN", "([JI[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "squareN", "([JI[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "squareN", "([JI[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "multiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "square", "([J[J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "multiply", "([J[J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "createExt64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implMultiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "reduce", "([J[J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "multiplyAddToExt", "([J[J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "createExt64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implMultiply", "([J[J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "addExt", "([J[J[J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "reduce", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LSTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitLdcInsn(new Long(562949953421311L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "reduce15", "([JI)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(562949953421311L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "sqrt", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Interleave", "unshuffle", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Interleave", "unshuffle", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(4294967295L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LOR);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitLdcInsn(new Long(-4294967296L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitInsn(LOR);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "square", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "createExt64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implSquare", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "reduce", "([J[J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "squareAddToExt", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "createExt64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implSquare", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "addExt", "([J[J[J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "squareN", "([JI[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat128", "createExt64", "()[J", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implSquare", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "reduce", "([J[J)V", false);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitIincInsn(1, -1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implSquare", "([J[J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "reduce", "([J[J)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "trace", "([J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "implMultiply", "([J[J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitLdcInsn(new Long(144115188075855871L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn(new Long(144115188075855871L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 9);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitLdcInsn(new Long(144115188075855871L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitVarInsn(LSTORE, 9);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitLdcInsn(new Long(144115188075855871L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitVarInsn(LSTORE, 7);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_LONG);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implMulw", "(JJ[JI)V", false);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implMulw", "(JJ[JI)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/sec/SecT113Field", "implMulw", "(JJ[JI)V", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LLOAD, 14);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LLOAD, 12);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 18);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LLOAD, 16);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LLOAD, 12);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 20);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(LLOAD, 14);
methodVisitor.visitVarInsn(LLOAD, 18);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 18);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 20);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(LLOAD, 20);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 16);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(LLOAD, 16);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 22);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "implMulw", "(JJ[JI)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_LONG);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(L2I);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(LSTORE, 12);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitVarInsn(ISTORE, 14);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(L2I);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(LLOAD, 12);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 12);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitInsn(INEG);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 10);
methodVisitor.visitIincInsn(14, -9);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(72198606942111744L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(LSHR);
methodVisitor.visitInsn(LAND);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitVarInsn(LSTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 12);
methodVisitor.visitLdcInsn(new Long(144115188075855871L));
methodVisitor.visitInsn(LAND);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(LLOAD, 12);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(LUSHR);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(LSHL);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "implSquare", "([J[J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Interleave", "expand64To128", "(J[JI)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Interleave", "expand64To128", "(J[JI)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
