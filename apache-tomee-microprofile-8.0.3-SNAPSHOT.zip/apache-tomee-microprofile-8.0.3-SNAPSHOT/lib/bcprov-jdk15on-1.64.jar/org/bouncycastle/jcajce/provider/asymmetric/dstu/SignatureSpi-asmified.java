package asm.org.bouncycastle.jcajce.provider.asymmetric.dstu;
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
public class SignatureSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", null, "java/security/SignatureSpi", new String[] { "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "org/bouncycastle/asn1/x509/X509ObjectIdentifiers" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "digest", "Lorg/bouncycastle/crypto/Digest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signer", "Lorg/bouncycastle/crypto/DSAExt;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/SignatureSpi", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/signers/DSTU4145Signer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/DSTU4145Signer", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInitVerify", "(Ljava/security/PublicKey;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/provider/asymmetric/dstu/BCDSTU4145PublicKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/provider/asymmetric/dstu/BCDSTU4145PublicKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/BCDSTU4145PublicKey", "engineGetKeyParameters", "()Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/GOST3411Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/provider/asymmetric/dstu/BCDSTU4145PublicKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/BCDSTU4145PublicKey", "getSbox", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "expandSbox", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/GOST3411Digest", "<init>", "([B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePublicKeyParameter", "(Ljava/security/PublicKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/GOST3411Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ua/DSTU4145Params", "getDefaultDKE", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "expandSbox", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/GOST3411Digest", "<init>", "([B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "expandSbox", "([B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInitSign", "(Ljava/security/PrivateKey;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jcajce/provider/asymmetric/dstu/BCDSTU4145PrivateKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/GOST3411Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ua/DSTU4145Params", "getDefaultDKE", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "expandSbox", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/GOST3411Digest", "<init>", "([B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/interfaces/ECKey");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/provider/asymmetric/util/ECUtil", "generatePrivateKeyParameter", "(Ljava/security/PrivateKey;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/GOST3411Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ua/DSTU4145Params", "getDefaultDKE", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "expandSbox", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/GOST3411Digest", "<init>", "([B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "appRandom", "Ljava/security/SecureRandom;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "appRandom", "Ljava/security/SecureRandom;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineUpdate", "(B)V", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "update", "(B)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineUpdate", "([BII)V", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "update", "([BII)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineSign", "()[B", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "generateSignature", "([B)[Ljava/math/BigInteger;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitLabel(label4);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DEROctetString");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DEROctetString", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/DEROctetString", "getEncoded", "()[B", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/security/SignatureException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/SignatureException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineVerify", "([B)Z", null, new String[] { "java/security/SignatureException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1OctetString", "fromByteArray", "([B)Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1OctetString");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1OctetString", "getOctets", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/math/BigInteger");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(I[B)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "(I[B)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/security/SignatureException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("error decoding signature bytes.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/SignatureException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/asymmetric/dstu/SignatureSpi", "signer", "Lorg/bouncycastle/crypto/DSAExt;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/DSAExt", "verifySignature", "([BLjava/math/BigInteger;Ljava/math/BigInteger;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineSetParameter", "(Ljava/security/spec/AlgorithmParameterSpec;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("engineSetParameter unsupported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_DEPRECATED, "engineSetParameter", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("engineSetParameter unsupported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_DEPRECATED, "engineGetParameter", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("engineSetParameter unsupported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}