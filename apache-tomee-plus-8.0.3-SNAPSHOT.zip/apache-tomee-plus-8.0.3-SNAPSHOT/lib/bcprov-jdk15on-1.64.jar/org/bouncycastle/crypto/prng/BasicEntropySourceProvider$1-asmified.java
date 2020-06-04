package asm.org.bouncycastle.crypto.prng;
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
public class BasicEntropySourceProvider$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/prng/EntropySource" });

classWriter.visitOuterClass("org/bouncycastle/crypto/prng/BasicEntropySourceProvider", "get", "(I)Lorg/bouncycastle/crypto/prng/EntropySource;");

classWriter.visitInnerClass("org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$bitsRequired", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "this$0", "Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "val$bitsRequired", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPredictionResistant", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "this$0", "Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider", "access$000", "(Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntropy", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "this$0", "Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider", "access$100", "(Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;)Ljava/security/SecureRandom;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/prng/SP800SecureRandom");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "this$0", "Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider", "access$100", "(Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;)Ljava/security/SecureRandom;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/prng/X931SecureRandom");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "val$bitsRequired", "I");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "this$0", "Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider", "access$100", "(Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;)Ljava/security/SecureRandom;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/SecureRandom", "nextBytes", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "this$0", "Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider", "access$100", "(Lorg/bouncycastle/crypto/prng/BasicEntropySourceProvider;)Ljava/security/SecureRandom;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "val$bitsRequired", "I");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/SecureRandom", "generateSeed", "(I)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "entropySize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/prng/BasicEntropySourceProvider$1", "val$bitsRequired", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
