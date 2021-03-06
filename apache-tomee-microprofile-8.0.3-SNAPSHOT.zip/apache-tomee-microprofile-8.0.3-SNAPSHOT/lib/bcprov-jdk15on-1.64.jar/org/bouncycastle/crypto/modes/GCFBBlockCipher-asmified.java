package asm.org.bouncycastle.crypto.modes;
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
public class GCFBBlockCipherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/modes/GCFBBlockCipher", null, "org/bouncycastle/crypto/StreamBlockCipher", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "C", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "key", "Lorg/bouncycastle/crypto/params/KeyParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "counter", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "forEncryption", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/StreamBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "counter", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/modes/CFBBlockCipher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "getBlockSize", "()I", true);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "counter", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "forEncryption", "Z");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/ParametersWithIV");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithIV", "getParameters", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/ParametersWithRandom");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ParametersWithRandom");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithRandom", "getParameters", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/params/ParametersWithSBox");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/ParametersWithSBox");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/ParametersWithSBox", "getParameters", "()Lorg/bouncycastle/crypto/CipherParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "key", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithmName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "getAlgorithmName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("/G");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBlockSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "getBlockSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processBlock", "([BI[BI)I", null, new String[] { "org/bouncycastle/crypto/DataLengthException", "java/lang/IllegalStateException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "getBlockSize", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "processBytes", "([BII[BI)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "getBlockSize", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "calculateByte", "(B)B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "counter", "J");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "counter", "J");
methodVisitor.visitLdcInsn(new Long(1024L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "getUnderlyingCipher", "()Lorg/bouncycastle/crypto/BlockCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "key", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "C", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "processBlock", "([BI[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "C", "[B");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "processBlock", "([BI[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "C", "[B");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "processBlock", "([BI[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "C", "[B");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "processBlock", "([BI[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/KeyParameter", "<init>", "([B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "key", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "key", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "getCurrentIV", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/BlockCipher", "processBlock", "([BI[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "forEncryption", "Z");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "key", "Lorg/bouncycastle/crypto/params/KeyParameter;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "counter", "J");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "counter", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "calculateByte", "(B)B", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "counter", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "cfbEngine", "Lorg/bouncycastle/crypto/modes/CFBBlockCipher;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, -55);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, -115);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, -37);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, -106);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, -23);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, -60);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitIntInsn(BIPUSH, -84);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitIntInsn(BIPUSH, -108);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitIntInsn(BIPUSH, -19);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitIntInsn(BIPUSH, -64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitIntInsn(BIPUSH, -122);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitIntInsn(BIPUSH, -36);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitIntInsn(BIPUSH, -62);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitIntInsn(BIPUSH, -17);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitIntInsn(BIPUSH, 76);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitIntInsn(BIPUSH, -87);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/modes/GCFBBlockCipher", "C", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
