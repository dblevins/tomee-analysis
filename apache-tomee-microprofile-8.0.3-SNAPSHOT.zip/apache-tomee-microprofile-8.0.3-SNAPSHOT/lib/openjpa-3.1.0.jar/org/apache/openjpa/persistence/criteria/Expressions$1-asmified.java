package asm.org.apache.openjpa.persistence.criteria;
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
public class Expressions$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_SYNTHETIC, "org/apache/openjpa/persistence/criteria/Expressions$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/openjpa/persistence/criteria/Expressions", null, null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "jakarta/persistence/criteria/CriteriaBuilder", "Trimspec", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor", "TraversalStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$org$apache$openjpa$persistence$criteria$CriteriaExpressionVisitor$TraversalStyle", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$javax$persistence$criteria$CriteriaBuilder$Trimspec", "[I", null, null);
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
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
methodVisitor.visitTryCatchBlock(label15, label16, label17, "java/lang/NoSuchFieldError");
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
methodVisitor.visitTryCatchBlock(label18, label19, label20, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "values", "()[Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$javax$persistence$criteria$CriteriaBuilder$Trimspec", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$javax$persistence$criteria$CriteriaBuilder$Trimspec", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "LEADING", "Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$javax$persistence$criteria$CriteriaBuilder$Trimspec", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "TRAILING", "Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$javax$persistence$criteria$CriteriaBuilder$Trimspec", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "BOTH", "Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
Label label21 = new Label();
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "values", "()[Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$org$apache$openjpa$persistence$criteria$CriteriaExpressionVisitor$TraversalStyle", "[I");
methodVisitor.visitLabel(label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$org$apache$openjpa$persistence$criteria$CriteriaExpressionVisitor$TraversalStyle", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "INFIX", "Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$org$apache$openjpa$persistence$criteria$CriteriaExpressionVisitor$TraversalStyle", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "POSTFIX", "Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label13);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$org$apache$openjpa$persistence$criteria$CriteriaExpressionVisitor$TraversalStyle", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "PREFIX", "Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label16);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/Expressions$1", "$SwitchMap$org$apache$openjpa$persistence$criteria$CriteriaExpressionVisitor$TraversalStyle", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "FUNCTION", "Lorg/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaExpressionVisitor$TraversalStyle", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label19);
Label label22 = new Label();
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
