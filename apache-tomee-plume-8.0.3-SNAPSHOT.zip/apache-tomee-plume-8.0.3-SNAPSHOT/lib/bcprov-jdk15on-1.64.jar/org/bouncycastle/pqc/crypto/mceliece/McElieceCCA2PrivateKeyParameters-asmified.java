package asm.org.bouncycastle.pqc.crypto.mceliece;
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
public class McElieceCCA2PrivateKeyParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", null, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "n", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "k", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "field", "Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "goppaPoly", "Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "p", "Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "h", "Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "qInv", "[Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(IILorg/bouncycastle/pqc/math/linearalgebra/GF2mField;Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/math/linearalgebra/GoppaCode", "createCanonicalCheckMatrix", "(Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;)Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "<init>", "(IILorg/bouncycastle/pqc/math/linearalgebra/GF2mField;Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(IILorg/bouncycastle/pqc/math/linearalgebra/GF2mField;Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2KeyParameters", "<init>", "(ZLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "k", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "field", "Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "goppaPoly", "Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "h", "Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "p", "Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/math/linearalgebra/PolynomialRingGF2m");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/math/linearalgebra/PolynomialRingGF2m", "<init>", "(Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/PolynomialRingGF2m", "getSquareRootMatrix", "()[Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "qInv", "[Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getN", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "n", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getK", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "k", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getT", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "goppaPoly", "Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM", "getDegree", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getField", "()Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "field", "Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGoppaPoly", "()Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "goppaPoly", "Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getP", "()Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "p", "Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getH", "()Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "h", "Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQInv", "()[Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/mceliece/McElieceCCA2PrivateKeyParameters", "qInv", "[Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
