package asm.org.bouncycastle.pqc.asn1;
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
public class McEliecePrivateKeyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", null, "org/bouncycastle/asn1/ASN1Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "n", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "k", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encField", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encGp", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encSInv", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encP1", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encP2", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(IILorg/bouncycastle/pqc/math/linearalgebra/GF2mField;Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "k", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/GF2mField", "getEncoded", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encField", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM", "getEncoded", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encGp", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/GF2Matrix", "getEncoded", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encSInv", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/Permutation", "getEncoded", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP1", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/math/linearalgebra/Permutation", "getEncoded", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP2", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/pqc/asn1/McEliecePrivateKey;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/pqc/asn1/McEliecePrivateKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/asn1/McEliecePrivateKey");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/asn1/McEliecePrivateKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "intValueExact", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "n", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "intValueExact", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "k", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1OctetString");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1OctetString", "getOctets", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encField", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1OctetString");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1OctetString", "getOctets", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encGp", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1OctetString");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1OctetString", "getOctets", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP1", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1OctetString");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1OctetString", "getOctets", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP2", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1OctetString");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1OctetString", "getOctets", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encSInv", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getN", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "n", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getK", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "k", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getField", "()Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/math/linearalgebra/GF2mField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encField", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/math/linearalgebra/GF2mField", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGoppaPoly", "()Lorg/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "getField", "()Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encGp", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/math/linearalgebra/PolynomialGF2mSmallM", "<init>", "(Lorg/bouncycastle/pqc/math/linearalgebra/GF2mField;[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSInv", "()Lorg/bouncycastle/pqc/math/linearalgebra/GF2Matrix;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/math/linearalgebra/GF2Matrix");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encSInv", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/math/linearalgebra/GF2Matrix", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getP1", "()Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/math/linearalgebra/Permutation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP1", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/math/linearalgebra/Permutation", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getP2", "()Lorg/bouncycastle/pqc/math/linearalgebra/Permutation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/math/linearalgebra/Permutation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP2", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/math/linearalgebra/Permutation", "<init>", "([B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1EncodableVector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1EncodableVector", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "n", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "k", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DEROctetString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encField", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DEROctetString", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DEROctetString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encGp", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DEROctetString", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DEROctetString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP1", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DEROctetString", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DEROctetString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encP2", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DEROctetString", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DEROctetString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/asn1/McEliecePrivateKey", "encSInv", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DEROctetString", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERSequence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERSequence", "<init>", "(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}