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
public class PublicKeyFactory$GOST3410_2012ConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/crypto/util/PublicKeyFactory$GOST3410_2012Converter", null, "org/bouncycastle/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/PublicKeyFactory$GOST3410_2012Converter", "org/bouncycastle/crypto/util/PublicKeyFactory", "GOST3410_2012Converter", ACC_PRIVATE | ACC_STATIC);

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
methodVisitor = classWriter.visitMethod(0, "getPublicKeyParameters", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;Ljava/lang/Object;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/SubjectPublicKeyInfo", "getAlgorithm", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getAlgorithm", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getParameters", "()Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters", "getPublicKeyParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECGOST3410Parameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECNamedDomainParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cryptopro/ECGOST3410NamedCurves", "getByOID", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/params/ECDomainParameters;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECNamedDomainParameters", "<init>", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters", "getDigestParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/cryptopro/GOST3410PublicKeyAlgParameters", "getEncryptionParamSet", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECGOST3410Parameters", "<init>", "(Lorg/bouncycastle/crypto/params/ECDomainParameters;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/SubjectPublicKeyInfo", "parsePublicKey", "()Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1OctetString");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("error recovering GOST3410_2012 public key");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/rosstandart/RosstandartObjectIdentifiers", "id_tc26_gost_3410_12_512", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1OctetString", "getOctets", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("invalid length for GOST3410_2012 public key");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 13);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label7);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 13);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(13, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ECGOST3410Parameters", "getCurve", "()Lorg/bouncycastle/math/ec/ECCurve;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECCurve", "decodePoint", "([B)Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ECPublicKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ECPublicKeyParameters", "<init>", "(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/bouncycastle/crypto/util/PublicKeyFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/PublicKeyFactory$GOST3410_2012Converter", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
