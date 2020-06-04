package asm.jakarta.servlet.jsp.jstl.core;
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
public class IteratedExpression$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER | ACC_SYNTHETIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("javax/servlet/jsp/jstl/core/IteratedExpression", null, null);

classWriter.visitInnerClass("jakarta/servlet/jsp/jstl/core/IteratedExpression$1", "jakarta/servlet/jsp/jstl/core/IteratedExpression", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "jakarta/servlet/jsp/jstl/core/IteratedExpression", "TypesEnum", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$javax$servlet$jsp$jstl$core$IteratedExpression$TypesEnum", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchFieldError");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/NoSuchFieldError");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/NoSuchFieldError");
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label12, label13, label14, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "values", "()[Ljakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$1", "$SwitchMap$javax$servlet$jsp$jstl$core$IteratedExpression$TypesEnum", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$1", "$SwitchMap$javax$servlet$jsp$jstl$core$IteratedExpression$TypesEnum", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ACollection", "Ljakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$1", "$SwitchMap$javax$servlet$jsp$jstl$core$IteratedExpression$TypesEnum", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AnIterator", "Ljakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$1", "$SwitchMap$javax$servlet$jsp$jstl$core$IteratedExpression$TypesEnum", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AnEnumeration", "Ljakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label9);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$1", "$SwitchMap$javax$servlet$jsp$jstl$core$IteratedExpression$TypesEnum", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AMap", "Ljakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label12);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$1", "$SwitchMap$javax$servlet$jsp$jstl$core$IteratedExpression$TypesEnum", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "AString", "Ljakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/jstl/core/IteratedExpression$TypesEnum", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label13);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label15);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
