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
public class Zuc256CoreEngineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", null, "org/bouncycastle/crypto/engines/Zuc128CoreEngine", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EK_d", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EK_d32", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EK_d64", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EK_d128", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "theD", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/Zuc128CoreEngine", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d", "[B");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/Zuc128CoreEngine", "<init>", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitLookupSwitchInsn(label3, new int[] { 32, 64, 128 }, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d32", "[B");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d64", "[B");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d128", "[B");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unsupported length: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/bouncycastle/crypto/engines/Zuc256CoreEngine;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/Zuc128CoreEngine", "<init>", "(Lorg/bouncycastle/crypto/engines/Zuc128CoreEngine;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getMaxIterations", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 625);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithmName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("Zuc-256");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "MAKEU31", "(BBBB)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setKeyAndIV", "([I[B[B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 32);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("A key of 32 bytes is needed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 25);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("An IV of 25 bytes is needed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "MAKEU31", "(BBBB)I", false);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copy", "()Lorg/bouncycastle/util/Memoable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/Zuc256CoreEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "<init>", "(Lorg/bouncycastle/crypto/engines/Zuc256CoreEngine;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "(Lorg/bouncycastle/util/Memoable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/engines/Zuc256CoreEngine");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/Zuc128CoreEngine", "reset", "(Lorg/bouncycastle/util/Memoable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "theD", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d", "[B");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d32", "[B");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d64", "[B");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/engines/Zuc256CoreEngine", "EK_d128", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
