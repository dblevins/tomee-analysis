package asm.org.joda.time.tz;
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
public class DateTimeZoneBuilder$DSTZoneDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", null, "org/joda/time/DateTimeZone", null);

classWriter.visitInnerClass("org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "org/joda/time/tz/DateTimeZoneBuilder", "Recurrence", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "org/joda/time/tz/DateTimeZoneBuilder", "DSTZone", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(6941492635554961361L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iStandardOffset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "readFrom", "(Ljava/io/DataInput;Ljava/lang/String;)Lorg/joda/time/tz/DateTimeZoneBuilder$DSTZone;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/tz/DateTimeZoneBuilder", "readMillis", "(Ljava/io/DataInput;)J", false);
methodVisitor.visitInsn(L2I);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "readFrom", "(Ljava/io/DataInput;)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "readFrom", "(Ljava/io/DataInput;)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "<init>", "(Ljava/lang/String;ILorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;ILorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeZone", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameKey", "(J)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "findMatchingRecurrence", "(J)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getNameKey", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOffset", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "findMatchingRecurrence", "(J)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStandardOffset", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFixed", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextTransition", "(J)J", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/ArithmeticException");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "java/lang/IllegalArgumentException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label7, "java/lang/ArithmeticException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "next", "(JII)J", false);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "next", "(JII)J", false);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label5);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label5);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitLabel(label5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(LCMP);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFLE, label9);
methodVisitor.visitVarInsn(LLOAD, 8);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitLabel(label10);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousTransition", "(J)J", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/ArithmeticException");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "java/lang/IllegalArgumentException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label7, "java/lang/ArithmeticException");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "previous", "(JII)J", false);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "previous", "(JII)J", false);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label5);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label5);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitLabel(label5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(LCMP);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFLE, label9);
methodVisitor.visitVarInsn(LLOAD, 6);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitLabel(label10);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "getID", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "getID", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTo", "(Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/tz/DateTimeZoneBuilder", "writeMillis", "(Ljava/io/DataOutput;J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "writeTo", "(Ljava/io/DataOutput;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "writeTo", "(Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findMatchingRecurrence", "(J)Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/ArithmeticException");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "java/lang/IllegalArgumentException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label7, "java/lang/ArithmeticException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStandardOffset", "I");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iStartRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$DSTZone", "iEndRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "next", "(JII)J", false);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "next", "(JII)J", false);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitLabel(label5);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(LCMP);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFLE, label9);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label10);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 11);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
