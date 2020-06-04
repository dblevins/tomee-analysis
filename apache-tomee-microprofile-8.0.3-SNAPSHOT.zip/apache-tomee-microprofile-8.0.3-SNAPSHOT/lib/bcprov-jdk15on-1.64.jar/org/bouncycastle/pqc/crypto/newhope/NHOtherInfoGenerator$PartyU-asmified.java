package asm.org.bouncycastle.pqc.crypto.newhope;
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
public class NHOtherInfoGenerator$PartyUDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", null, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/DEROtherInfo$Builder", "org/bouncycastle/crypto/util/DEROtherInfo", "Builder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator", "PartyU", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "aKp", "Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[BLjava/security/SecureRandom;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator", "<init>", "(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B[BLjava/security/SecureRandom;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/newhope/NHAgreement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/newhope/NHAgreement", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/KeyGenerationParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 2048);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/KeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator", "init", "(Lorg/bouncycastle/crypto/KeyGenerationParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHKeyPairGenerator", "generateKeyPair", "()Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "aKp", "Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "aKp", "Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPrivate", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHAgreement", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withSuppPubInfo", "([B)Lorg/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "otherInfoBuilder", "Lorg/bouncycastle/crypto/util/DEROtherInfo$Builder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/DEROtherInfo$Builder", "withSuppPubInfo", "([B)Lorg/bouncycastle/crypto/util/DEROtherInfo$Builder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSuppPrivInfoPartA", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "aKp", "Lorg/bouncycastle/crypto/AsymmetricCipherKeyPair;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/AsymmetricCipherKeyPair", "getPublic", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/newhope/NHPublicKeyParameters");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator", "access$000", "(Lorg/bouncycastle/pqc/crypto/newhope/NHPublicKeyParameters;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generate", "([B)Lorg/bouncycastle/crypto/util/DEROtherInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "used", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("builder already used");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "used", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "otherInfoBuilder", "Lorg/bouncycastle/crypto/util/DEROtherInfo$Builder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "agreement", "Lorg/bouncycastle/pqc/crypto/newhope/NHAgreement;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator", "access$100", "([B)Lorg/bouncycastle/pqc/crypto/newhope/NHPublicKeyParameters;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/newhope/NHAgreement", "calculateAgreement", "(Lorg/bouncycastle/crypto/CipherParameters;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/DEROtherInfo$Builder", "withSuppPrivInfo", "([B)Lorg/bouncycastle/crypto/util/DEROtherInfo$Builder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/newhope/NHOtherInfoGenerator$PartyU", "otherInfoBuilder", "Lorg/bouncycastle/crypto/util/DEROtherInfo$Builder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/DEROtherInfo$Builder", "build", "()Lorg/bouncycastle/crypto/util/DEROtherInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
