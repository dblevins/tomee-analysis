package asm.org.bouncycastle.math.ec;
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
public class WNafUtil$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/bouncycastle/math/ec/WNafUtil$4", null, "java/lang/Object", new String[] { "org/bouncycastle/math/ec/PreCompCallback" });

classWriter.visitOuterClass("org/bouncycastle/math/ec/WNafUtil", "precomputeWithPointMap", "(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/math/ec/ECPointMap;Lorg/bouncycastle/math/ec/WNafPreCompInfo;Z)Lorg/bouncycastle/math/ec/WNafPreCompInfo;");

classWriter.visitInnerClass("org/bouncycastle/math/ec/WNafUtil$4", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$fromWNaf", "Lorg/bouncycastle/math/ec/WNafPreCompInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$includeNegated", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$pointMap", "Lorg/bouncycastle/math/ec/ECPointMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/math/ec/WNafPreCompInfo;ZLorg/bouncycastle/math/ec/ECPointMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$fromWNaf", "Lorg/bouncycastle/math/ec/WNafPreCompInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$includeNegated", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$pointMap", "Lorg/bouncycastle/math/ec/ECPointMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "precompute", "(Lorg/bouncycastle/math/ec/PreCompInfo;)Lorg/bouncycastle/math/ec/PreCompInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/math/ec/WNafPreCompInfo");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/math/ec/WNafPreCompInfo");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$fromWNaf", "Lorg/bouncycastle/math/ec/WNafPreCompInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getWidth", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$fromWNaf", "Lorg/bouncycastle/math/ec/WNafPreCompInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getPreComp", "()[Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$includeNegated", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/WNafUtil$4", "checkExisting", "(Lorg/bouncycastle/math/ec/WNafPreCompInfo;IIZ)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "decrementPromotionCountdown", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/WNafPreCompInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$fromWNaf", "Lorg/bouncycastle/math/ec/WNafPreCompInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getPromotionCountdown", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "setPromotionCountdown", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$fromWNaf", "Lorg/bouncycastle/math/ec/WNafPreCompInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getTwice", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$pointMap", "Lorg/bouncycastle/math/ec/ECPointMap;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/math/ec/ECPointMap", "map", "(Lorg/bouncycastle/math/ec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "setTwice", "(Lorg/bouncycastle/math/ec/ECPoint;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$fromWNaf", "Lorg/bouncycastle/math/ec/WNafPreCompInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getPreComp", "()[Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/math/ec/ECPoint");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$pointMap", "Lorg/bouncycastle/math/ec/ECPointMap;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/math/ec/ECPointMap", "map", "(Lorg/bouncycastle/math/ec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;", true);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "setPreComp", "([Lorg/bouncycastle/math/ec/ECPoint;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "setWidth", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/WNafUtil$4", "val$includeNegated", "Z");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/math/ec/ECPoint");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/ECPoint", "negate", "()Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "setPreCompNeg", "([Lorg/bouncycastle/math/ec/ECPoint;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkExisting", "(Lorg/bouncycastle/math/ec/WNafPreCompInfo;IIZ)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getWidth", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getPreComp", "()[Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/WNafUtil$4", "checkTable", "([Lorg/bouncycastle/math/ec/ECPoint;I)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/WNafPreCompInfo", "getPreCompNeg", "()[Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/WNafUtil$4", "checkTable", "([Lorg/bouncycastle/math/ec/ECPoint;I)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkTable", "([Lorg/bouncycastle/math/ec/ECPoint;I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
