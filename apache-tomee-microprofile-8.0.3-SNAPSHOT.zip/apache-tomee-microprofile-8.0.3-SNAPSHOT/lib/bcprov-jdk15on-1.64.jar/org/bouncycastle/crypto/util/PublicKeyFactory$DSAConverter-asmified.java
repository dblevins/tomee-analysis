package asm.org.bouncycastle.crypto.util;
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
public class PublicKeyFactory$DSAConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/crypto/util/PublicKeyFactory$DSAConverter", null, "org/bouncycastle/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/PublicKeyFactory$DSAConverter", "org/bouncycastle/crypto/util/PublicKeyFactory", "DSAConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter", "org/bouncycastle/crypto/util/PublicKeyFactory", "SubjectPublicKeyInfoConverter", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/PublicKeyFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter", "<init>", "(Lorg/bouncycastle/crypto/util/PublicKeyFactory$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getPublicKeyParameters", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;Ljava/lang/Object;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/SubjectPublicKeyInfo", "parsePublicKey", "()Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/SubjectPublicKeyInfo", "getAlgorithm", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getParameters", "()Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/asn1/ASN1Encodable", "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/DSAParameter", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/DSAParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/DSAParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/DSAParameter", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/DSAParameter", "getQ", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/DSAParameter", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/DSAParameters", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/DSAPublicKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "getValue", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/DSAPublicKeyParameters", "<init>", "(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DSAParameters;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/bouncycastle/crypto/util/PublicKeyFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PublicKeyFactory$DSAConverter", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
