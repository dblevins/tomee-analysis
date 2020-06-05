package asm.org.joda.time.field;
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
public class FieldUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/joda/time/field/FieldUtils", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeNegate", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitLdcInsn(new Integer(-2147483648));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Integer.MIN_VALUE cannot be negated");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(INEG);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeAdd", "(II)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IXOR);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The calculation caused an overflow: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" + ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeAdd", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The calculation caused an overflow: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" + ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeSubtract", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LXOR);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The calculation caused an overflow: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" - ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeMultiply", "(II)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(-2147483648L));
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(2147483647L));
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Multiplication overflows an int: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" * ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeMultiply", "(JI)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(-1, 1, label3, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Multiplication overflows a long: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" * ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LNEG);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LDIV);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Multiplication overflows a long: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" * ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeMultiply", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LDIV);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LCMP);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Multiplication overflows a long: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" * ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeDivide", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Multiplication overflows a long: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" / ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeToInt", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(new Long(-2147483648L));
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitLdcInsn(new Long(2147483647L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ArithmeticException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Value cannot fit in an int: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ArithmeticException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "safeMultiplyToInt", "(JJ)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "safeMultiply", "(JJ)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "safeToInt", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "verifyValueBounds", "(Lorg/joda/time/DateTimeField;III)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/IllegalFieldValueException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getType", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/IllegalFieldValueException", "<init>", "(Lorg/joda/time/DateTimeFieldType;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/IllegalFieldValueException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/IllegalFieldValueException", "<init>", "(Lorg/joda/time/DateTimeFieldType;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "verifyValueBounds", "(Ljava/lang/String;III)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/IllegalFieldValueException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/IllegalFieldValueException", "<init>", "(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getWrappedValue", "(IIII)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "getWrappedValue", "(III)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getWrappedValue", "(III)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MIN > MAX");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 0);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(INEG);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IREM);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}