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
public class PolyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/pqc/crypto/newhope/Poly", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "add", "([S[S[S)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 1024);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2S);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Reduce", "barrett", "(S)S", false);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "fromBytes", "([S[B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 256);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2S);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2S);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2S);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2S);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "fromNTT", "([S)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/NTT", "bitReverse", "([S)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/newhope/Precomp", "OMEGAS_INV_MONTGOMERY", "[S");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/NTT", "core", "([S[S)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/newhope/Precomp", "PSIS_INV_MONTGOMERY", "[S");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/NTT", "mulCoefficients", "([S[S)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getNoise", "([S[BB)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/ChaCha20", "process", "([B[B[BII)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 1024);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Pack", "bigEndianToInt", "([BI)I", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitLdcInsn(new Integer(16843009));
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(SIPUSH, 12289);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2S);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "pointWise", "([S[S[S)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 1024);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitLdcInsn(new Integer(65535));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitLdcInsn(new Integer(65535));
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitIntInsn(SIPUSH, 3186);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Reduce", "montgomery", "(I)S", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitLdcInsn(new Integer(65535));
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Reduce", "montgomery", "(I)S", false);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "toBytes", "([B[S)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 256);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Poly", "normalize", "(S)S", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Poly", "normalize", "(S)S", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Poly", "normalize", "(S)S", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(SALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Poly", "normalize", "(S)S", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "toNTT", "([S)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/newhope/Precomp", "PSIS_BITREV_MONTGOMERY", "[S");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/NTT", "mulCoefficients", "([S[S)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/newhope/Precomp", "OMEGAS_MONTGOMERY", "[S");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/NTT", "core", "([S[S)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "uniform", "([S[B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHAKEDigest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHAKEDigest", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/digests/SHAKEDigest", "update", "([BII)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/digests/SHAKEDigest", "doOutput", "([BII)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitLdcInsn(new Integer(61445));
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(I2S);
methodVisitor.visitInsn(SASTORE);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitIincInsn(5, 2);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "normalize", "(S)S", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/newhope/Reduce", "barrett", "(S)S", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 12289);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2S);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}