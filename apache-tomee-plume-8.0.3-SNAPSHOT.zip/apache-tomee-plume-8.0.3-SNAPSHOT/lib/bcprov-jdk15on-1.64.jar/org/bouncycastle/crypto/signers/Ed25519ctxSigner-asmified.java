package asm.org.bouncycastle.crypto.signers;
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
public class Ed25519ctxSignerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/Signer" });

classWriter.visitInnerClass("org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer", "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "Buffer", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/signers/Ed25519ctxSigner$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "buffer", "Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "context", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "forSigning", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "privateKey", "Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "publicKey", "Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer", "<init>", "(Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "buffer", "Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "clone", "([B)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "context", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "forSigning", "Z");
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/Ed25519PrivateKeyParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "privateKey", "Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "privateKey", "Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/Ed25519PrivateKeyParameters", "generatePublicKey", "()Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "publicKey", "Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "privateKey", "Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/Ed25519PublicKeyParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "publicKey", "Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "(B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "buffer", "Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer", "write", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "([BII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "buffer", "Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer", "write", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateSignature", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "forSigning", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "privateKey", "Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Ed25519ctxSigner not initialised for signature generation.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "buffer", "Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "privateKey", "Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "publicKey", "Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "context", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer", "generateSignature", "(Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;[B)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verifySignature", "([B)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "forSigning", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "publicKey", "Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Ed25519ctxSigner not initialised for verification");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "buffer", "Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "publicKey", "Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "context", "[B");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer", "verifySignature", "(Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;[B[B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/signers/Ed25519ctxSigner", "buffer", "Lorg/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/signers/Ed25519ctxSigner$Buffer", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
