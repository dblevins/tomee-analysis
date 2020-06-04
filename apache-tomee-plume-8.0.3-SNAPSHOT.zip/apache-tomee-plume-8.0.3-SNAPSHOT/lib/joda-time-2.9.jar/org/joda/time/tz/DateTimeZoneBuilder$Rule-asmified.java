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
public class DateTimeZoneBuilder$RuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_FINAL | ACC_SUPER, "org/joda/time/tz/DateTimeZoneBuilder$Rule", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "org/joda/time/tz/DateTimeZoneBuilder", "Recurrence", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/joda/time/tz/DateTimeZoneBuilder$OfYear", "org/joda/time/tz/DateTimeZoneBuilder", "OfYear", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/joda/time/tz/DateTimeZoneBuilder$Rule", "org/joda/time/tz/DateTimeZoneBuilder", "Rule", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iFromYear", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iToYear", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iFromYear", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iToYear", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFromYear", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iFromYear", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getToYear", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iToYear", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOfYear", "()Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getOfYear", "()Lorg/joda/time/tz/DateTimeZoneBuilder$OfYear;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getNameKey", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSaveMillis", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "getSaveMillis", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "(JII)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/ISOChronology", "getInstanceUTC", "()Lorg/joda/time/chrono/ISOChronology;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 7);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn(new Integer(-2147483648));
methodVisitor.visitVarInsn(ISTORE, 9);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "year", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "get", "(J)I", false);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iFromYear", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "year", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iFromYear", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(JI)J", false);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 7);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 7);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iRecurrence", "Lorg/joda/time/tz/DateTimeZoneBuilder$Recurrence;");
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/tz/DateTimeZoneBuilder$Recurrence", "next", "(JII)J", false);
methodVisitor.visitVarInsn(LSTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "year", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "get", "(J)I", false);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/tz/DateTimeZoneBuilder$Rule", "iToYear", "I");
methodVisitor.visitJumpInsn(IF_ICMPLE, label3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LSTORE, 10);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 12);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
