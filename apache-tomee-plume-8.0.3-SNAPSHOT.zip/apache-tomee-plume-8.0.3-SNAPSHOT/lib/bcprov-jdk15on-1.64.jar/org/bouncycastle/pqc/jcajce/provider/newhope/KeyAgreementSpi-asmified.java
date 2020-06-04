package asm.org.bouncycastle.pqc.jcajce.provider.newhope;
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
public class KeyAgreementSpiDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", null, "org/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "otherPartyKey", "Lorg/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "exchangePairGenerator", "Lorg/bouncycastle/pqc/crypto/newhope/NHExchangePairGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "shared", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NH");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/util/BaseAgreementSpi", "<init>", "(Ljava/lang/String;Lorg/bouncycastle/crypto/DerivationFunction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInit", "(Ljava/security/Key;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/newhope/NHAgreement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/newhope/NHAgreement", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPrivateKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPrivateKey", "getKeyParams", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHAgreement", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/newhope/NHExchangePairGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/newhope/NHExchangePairGenerator", "<init>", "(Ljava/security/SecureRandom;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "exchangePairGenerator", "Lorg/bouncycastle/pqc/crypto/newhope/NHExchangePairGenerator;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineInit", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;Ljava/security/SecureRandom;)V", null, new String[] { "java/security/InvalidKeyException", "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NewHope does not require parameters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineDoPhase", "(Ljava/security/Key;Z)Ljava/security/Key;", null, new String[] { "java/security/InvalidKeyException", "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NewHope can only be between two parties.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "otherPartyKey", "Lorg/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "exchangePairGenerator", "Lorg/bouncycastle/pqc/crypto/newhope/NHExchangePairGenerator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "exchangePairGenerator", "Lorg/bouncycastle/pqc/crypto/newhope/NHExchangePairGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "otherPartyKey", "Lorg/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey", "getKeyParams", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/AsymmetricKeyParameter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHExchangePairGenerator", "generateExchange", "(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Lorg/bouncycastle/pqc/crypto/ExchangePair;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/ExchangePair", "getSharedValue", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/ExchangePair", "getPublicKey", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/newhope/NHPublicKeyParameters");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey", "<init>", "(Lorg/bouncycastle/pqc/crypto/newhope/NHPublicKeyParameters;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "otherPartyKey", "Lorg/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/newhope/BCNHPublicKey", "getKeyParams", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHAgreement", "calculateAgreement", "(Lorg/bouncycastle/crypto/CipherParameters;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineGenerateSecret", "()[B", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "clone", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "fill", "([BB)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "engineGenerateSecret", "([BI)I", null, new String[] { "java/lang/IllegalStateException", "javax/crypto/ShortBufferException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "fill", "([BB)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "shared", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "calcSecret", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/newhope/KeyAgreementSpi", "engineGenerateSecret", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
