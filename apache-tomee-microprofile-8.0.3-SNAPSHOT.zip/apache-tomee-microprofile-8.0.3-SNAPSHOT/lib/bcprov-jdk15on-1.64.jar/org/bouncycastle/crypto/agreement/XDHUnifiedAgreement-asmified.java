package asm.org.bouncycastle.crypto.agreement;
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
public class XDHUnifiedAgreementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/RawAgreement" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "privParams", "Lorg/bouncycastle/crypto/params/XDHUPrivateParameters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/RawAgreement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/XDHUPrivateParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "privParams", "Lorg/bouncycastle/crypto/params/XDHUPrivateParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAgreementSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/RawAgreement", "getAgreementSize", "()I", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "calculateAgreement", "(Lorg/bouncycastle/crypto/CipherParameters;[BI)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/XDHUPublicParameters");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "privParams", "Lorg/bouncycastle/crypto/params/XDHUPrivateParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/XDHUPrivateParameters", "getEphemeralPrivateKey", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/RawAgreement", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/XDHUPublicParameters", "getEphemeralPublicKey", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/RawAgreement", "calculateAgreement", "(Lorg/bouncycastle/crypto/CipherParameters;[BI)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "privParams", "Lorg/bouncycastle/crypto/params/XDHUPrivateParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/XDHUPrivateParameters", "getStaticPrivateKey", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/RawAgreement", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/XDHUPublicParameters", "getStaticPublicKey", "()Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/agreement/XDHUnifiedAgreement", "xAgreement", "Lorg/bouncycastle/crypto/RawAgreement;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/RawAgreement", "getAgreementSize", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/RawAgreement", "calculateAgreement", "(Lorg/bouncycastle/crypto/CipherParameters;[BI)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
