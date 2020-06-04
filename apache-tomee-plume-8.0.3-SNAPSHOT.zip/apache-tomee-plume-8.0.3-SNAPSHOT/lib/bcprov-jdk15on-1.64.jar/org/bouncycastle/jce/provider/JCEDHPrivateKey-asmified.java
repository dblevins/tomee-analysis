package asm.org.bouncycastle.jce.provider;
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
public class JCEDHPrivateKeyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jce/provider/JCEDHPrivateKey", null, "java/lang/Object", new String[] { "javax/crypto/interfaces/DHPrivateKey", "org/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier" });

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(311058815616901812L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "x", "Ljava/math/BigInteger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "info", "Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/crypto/interfaces/DHPrivateKey;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPrivateKey", "getX", "()Ljava/math/BigInteger;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "x", "Ljava/math/BigInteger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/interfaces/DHPrivateKey", "getParams", "()Ljavax/crypto/spec/DHParameterSpec;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/crypto/spec/DHPrivateKeySpec;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHPrivateKeySpec", "getX", "()Ljava/math/BigInteger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "x", "Ljava/math/BigInteger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHPrivateKeySpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHPrivateKeySpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/DHParameterSpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/PrivateKeyInfo", "getPrivateKeyAlgorithm", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getParameters", "()Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/PrivateKeyInfo", "parsePrivateKey", "()Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Integer", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Integer;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/PrivateKeyInfo", "getPrivateKeyAlgorithm", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getAlgorithm", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "info", "Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "getValue", "()Ljava/math/BigInteger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "x", "Ljava/math/BigInteger;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "dhKeyAgreement", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/pkcs/DHParameter", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/pkcs/DHParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/DHParameter", "getL", "()Ljava/math/BigInteger;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/DHParameter", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/DHParameter", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/DHParameter", "getL", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/DHParameterSpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/DHParameter", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/DHParameter", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/DHParameterSpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitLabel(label2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/x9/X9ObjectIdentifiers", "dhpublicnumber", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x9/DHDomainParameters", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x9/DHDomainParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/DHDomainParameters", "getP", "()Lorg/bouncycastle/asn1/ASN1Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "getValue", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x9/DHDomainParameters", "getG", "()Lorg/bouncycastle/asn1/ASN1Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "getValue", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/DHParameterSpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("unknown algorithm type: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/PKCS12BagAttributeCarrierImpl", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHPrivateKeyParameters", "getX", "()Ljava/math/BigInteger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "x", "Ljava/math/BigInteger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/DHParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHParameters", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/DHParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHParameters", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHPrivateKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/DHParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHParameters", "getL", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/DHParameterSpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithm", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("DH");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFormat", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("PKCS#8");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoded", "()[B", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "info", "Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "info", "Lorg/bouncycastle/asn1/pkcs/PrivateKeyInfo;");
methodVisitor.visitLdcInsn("DER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/PrivateKeyInfo", "getEncoded", "(Ljava/lang/String;)[B", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/pkcs/PrivateKeyInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/AlgorithmIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "dhKeyAgreement", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/pkcs/DHParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getL", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/pkcs/DHParameter", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "<init>", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "getX", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/pkcs/PrivateKeyInfo", "<init>", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("DER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/pkcs/PrivateKeyInfo", "getEncoded", "(Ljava/lang/String;)[B", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParams", "()Ljavax/crypto/spec/DHParameterSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX", "()Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "x", "Ljava/math/BigInteger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readObject", "(Ljava/io/ObjectInputStream;)V", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigInteger");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "x", "Ljava/math/BigInteger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/DHParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigInteger");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readObject", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigInteger");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "readInt", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/DHParameterSpec", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeObject", "(Ljava/io/ObjectOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "getX", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getP", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getG", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeObject", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "dhSpec", "Ljavax/crypto/spec/DHParameterSpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/spec/DHParameterSpec", "getL", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectOutputStream", "writeInt", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBagAttribute", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier", "setBagAttribute", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBagAttribute", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier", "getBagAttribute", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/ASN1Encodable;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBagAttributeKeys", "()Ljava/util/Enumeration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/provider/JCEDHPrivateKey", "attrCarrier", "Lorg/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jce/interfaces/PKCS12BagAttributeCarrier", "getBagAttributeKeys", "()Ljava/util/Enumeration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
