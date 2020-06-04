package asm.org.cryptacular.bean;
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
public class BufferedBlockCipherBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/cryptacular/bean/BufferedBlockCipherBean", null, "org/cryptacular/bean/AbstractBlockCipherBean", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "blockCipherSpec", "Lorg/cryptacular/spec/Spec;", "Lorg/cryptacular/spec/Spec<Lorg/bouncycastle/crypto/BufferedBlockCipher;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/bean/AbstractBlockCipherBean", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/cryptacular/spec/Spec;Ljava/security/KeyStore;Ljava/lang/String;Ljava/lang/String;Lorg/cryptacular/generator/Nonce;)V", "(Lorg/cryptacular/spec/Spec<Lorg/bouncycastle/crypto/BufferedBlockCipher;>;Ljava/security/KeyStore;Ljava/lang/String;Ljava/lang/String;Lorg/cryptacular/generator/Nonce;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/bean/AbstractBlockCipherBean", "<init>", "(Ljava/security/KeyStore;Ljava/lang/String;Ljava/lang/String;Lorg/cryptacular/generator/Nonce;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/BufferedBlockCipherBean", "setBlockCipherSpec", "(Lorg/cryptacular/spec/Spec;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBlockCipherSpec", "()Lorg/cryptacular/spec/Spec;", "()Lorg/cryptacular/spec/Spec<Lorg/bouncycastle/crypto/BufferedBlockCipher;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/BufferedBlockCipherBean", "blockCipherSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBlockCipherSpec", "(Lorg/cryptacular/spec/Spec;)V", "(Lorg/cryptacular/spec/Spec<Lorg/bouncycastle/crypto/BufferedBlockCipher;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/bean/BufferedBlockCipherBean", "blockCipherSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newCipher", "(Lorg/cryptacular/CiphertextHeader;Z)Lorg/cryptacular/adapter/BufferedBlockCipherAdapter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/bean/BufferedBlockCipherBean", "blockCipherSpec", "Lorg/cryptacular/spec/Spec;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/spec/Spec", "newInstance", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/BufferedBlockCipher");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/CiphertextHeader", "getKeyName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/BufferedBlockCipherBean", "lookupKey", "(Ljava/lang/String;)Ljavax/crypto/SecretKey;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/crypto/SecretKey", "getEncoded", "()[B", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/KeyParameter", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/BufferedBlockCipher", "getUnderlyingCipher", "()Lorg/bouncycastle/crypto/BlockCipher;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "getAlgorithmName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("OFB");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("CFB");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/bouncycastle/crypto/BufferedBlockCipher", "org/bouncycastle/crypto/CipherParameters", "java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/CiphertextHeader", "getNonce", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/BufferedBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/adapter/BufferedBlockCipherAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/adapter/BufferedBlockCipherAdapter", "<init>", "(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "newCipher", "(Lorg/cryptacular/CiphertextHeader;Z)Lorg/cryptacular/adapter/BlockCipherAdapter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/bean/BufferedBlockCipherBean", "newCipher", "(Lorg/cryptacular/CiphertextHeader;Z)Lorg/cryptacular/adapter/BufferedBlockCipherAdapter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
