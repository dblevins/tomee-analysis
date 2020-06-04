package asm.org.bouncycastle.math.ec.custom.djb;
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
public class Curve25519FieldElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", null, "org/bouncycastle/math/ec/ECFieldElement$AbstractFp", null);

classWriter.visitInnerClass("org/bouncycastle/math/ec/ECFieldElement$AbstractFp", "org/bouncycastle/math/ec/ECFieldElement", "AbstractFp", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q", "Ljava/math/BigInteger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PRECOMP_POW2", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "x", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/math/BigInteger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/ECFieldElement$AbstractFp", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "signum", "()I", false);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "Q", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "compareTo", "(Ljava/math/BigInteger;)I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("x value invalid for Curve25519FieldElement");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "fromBigInteger", "(Ljava/math/BigInteger;)[I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/ECFieldElement$AbstractFp", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "([I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/ECFieldElement$AbstractFp", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isZero", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "isZero", "([I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOne", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "isOne", "([I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "testBitZero", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "getBit", "([II)I", false);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toBigInteger", "()Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "toBigInteger", "([I)Ljava/math/BigInteger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFieldName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("Curve25519Field");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFieldSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "Q", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "bitLength", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "add", "([I[I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addOne", "()Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "addOne", "([I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subtract", "(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "subtract", "([I[I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "multiply", "(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "divide", "(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "P", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Mod", "invert", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "negate", "()Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "negate", "([I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "square", "()Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "square", "([I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invert", "()Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "P", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Mod", "invert", "([I[I[I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sqrt", "()Lorg/bouncycastle/math/ec/ECFieldElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "isZero", "([I)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "isOne", "([I)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "square", "([I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "square", "([I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "square", "([I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "squareN", "([II[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "square", "([I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "square", "([I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "eq", "([I[I)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "PRECOMP_POW2", "[I");
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "multiply", "([I[I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "square", "([I[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "eq", "([I[I)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "eq", "([I[I)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "Q", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "hashCode", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "x", "[I");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "hashCode", "([III)I", false);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519Field", "P", "[I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "toBigInteger", "([I)Ljava/math/BigInteger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "Q", "Ljava/math/BigInteger;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(new Integer(1242472624));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(new Integer(-991028441));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(new Integer(-1389370248));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(new Integer(792926214));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(new Integer(1039914919));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(new Integer(726466713));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn(new Integer(1338105611));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn(new Integer(730014848));
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "PRECOMP_POW2", "[I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
