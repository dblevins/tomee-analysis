package asm.org.bouncycastle.crypto.engines;
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
public class DESedeWrapEngineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/engines/DESedeWrapEngine", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/Wrapper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "param", "Lorg/bouncycastle/crypto/params/KeyParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "iv", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "forWrapping", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "IV2", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sha1", "Lorg/bouncycastle/crypto/Digest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "digest", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DigestFactory", "createSHA1", "()Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "sha1", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "digest", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "forWrapping", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/modes/CBCBlockCipher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/DESedeEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/DESedeEngine", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/ParametersWithRandom");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "getParameters", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "getRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/CryptoServicesRegistrar", "getSecureRandom", "()Ljava/security/SecureRandom;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/KeyParameter");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "param", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "forWrapping", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/SecureRandom", "nextBytes", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "param", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;");
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithIV", "getIV", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithIV", "getParameters", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "param", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "forWrapping", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitLabel(label5);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IV is not 8 octets");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("You should not supply an IV for unwrapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithmName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("DESede");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "wrap", "([BII)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "forWrapping", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not initialized for wrapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "calculateCMSKeyChecksum", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "getBlockSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IREM);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not multiple of block length");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "processBlock", "([BI[BI)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "reverse", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "param", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "IV2", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 12);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "processBlock", "([BI[BI)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 12);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unwrap", "([BII)[B", null, new String[] { "org/bouncycastle/crypto/InvalidCipherTextException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "forWrapping", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Not set for unwrapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/InvalidCipherTextException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Null pointer as ciphertext");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/InvalidCipherTextException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "getBlockSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IREM);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/InvalidCipherTextException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Ciphertext not multiple of ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/InvalidCipherTextException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "param", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "IV2", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "processBlock", "([BI[BI)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "reverse", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "param", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "iv", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "paramPlusIV", "Lorg/bouncycastle/crypto/params/ParametersWithIV;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "engine", "Lorg/bouncycastle/crypto/modes/CBCBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "processBlock", "([BI[BI)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "checkCMSKeyChecksum", "([B[B)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/InvalidCipherTextException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Checksum inside ciphertext is corrupted");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/InvalidCipherTextException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "calculateCMSKeyChecksum", "([B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "sha1", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "update", "([BII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "sha1", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "digest", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "digest", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkCMSKeyChecksum", "([B[B)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "calculateCMSKeyChecksum", "([B)[B", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "constantTimeAreEqual", "([B[B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "reverse", "([B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, -35);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, -94);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, -24);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/DESedeWrapEngine", "IV2", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
