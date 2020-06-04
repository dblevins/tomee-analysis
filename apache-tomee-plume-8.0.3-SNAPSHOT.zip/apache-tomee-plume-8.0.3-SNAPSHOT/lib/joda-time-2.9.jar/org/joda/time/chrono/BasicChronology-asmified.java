package asm.org.joda.time.chrono;
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
public class BasicChronologyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER | ACC_ABSTRACT, "org/joda/time/chrono/BasicChronology", null, "org/joda/time/chrono/AssembledChronology", null);

classWriter.visitInnerClass("org/joda/time/chrono/BasicChronology$YearInfo", "org/joda/time/chrono/BasicChronology", "YearInfo", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/joda/time/chrono/BasicChronology$HalfdayField", "org/joda/time/chrono/BasicChronology", "HalfdayField", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/joda/time/chrono/AssembledChronology$Fields", "org/joda/time/chrono/AssembledChronology", "Fields", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(8283225332206808863L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cMillisField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cSecondsField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cMinutesField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cHoursField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cHalfdaysField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cDaysField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cWeeksField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cMillisOfSecondField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cMillisOfDayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cSecondOfMinuteField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cSecondOfDayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cMinuteOfHourField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cMinuteOfDayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cHourOfDayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cHourOfHalfdayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cClockhourOfDayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cClockhourOfHalfdayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "cHalfdayOfDayField", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CACHE_SIZE", "I", null, new Integer(1024));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CACHE_MASK", "I", null, new Integer(1023));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_TRANSIENT, "iYearInfoCache", "[Lorg/joda/time/chrono/BasicChronology$YearInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iMinDaysInFirstWeek", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/AssembledChronology", "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 1024);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/joda/time/chrono/BasicChronology$YearInfo");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/BasicChronology", "iYearInfoCache", "[Lorg/joda/time/chrono/BasicChronology$YearInfo;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid min days in first week: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/BasicChronology", "iMinDaysInFirstWeek", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getZone", "()Lorg/joda/time/DateTimeZone;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeZone", "UTC", "Lorg/joda/time/DateTimeZone;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDateTimeMillis", "(IIII)J", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getDateTimeMillis", "(IIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "millisOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(new Integer(86399999));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicChronology", "getDateTimeMillis0", "(IIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDateTimeMillis", "(IIIIIII)J", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getDateTimeMillis", "(IIIIIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "hourOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "minuteOfHour", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "secondOfMinute", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "millisOfSecond", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 999);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitLdcInsn(new Integer(3600000));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitLdcInsn(new Integer(60000));
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(SIPUSH, 1000);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(I2L);
methodVisitor.visitVarInsn(LSTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 9);
methodVisitor.visitInsn(L2I);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicChronology", "getDateTimeMillis0", "(IIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(8, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getDateTimeMillis0", "(IIII)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDateMidnightMillis", "(III)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDateMidnightMillis", "(III)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitLdcInsn(new Integer(86400000));
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 7);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label2);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMinimumDaysInFirstWeek", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/BasicChronology", "iMinDaysInFirstWeek", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
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
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/chrono/BasicChronology");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMinimumDaysInFirstWeek", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMinimumDaysInFirstWeek", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeZone", "equals", "(Ljava/lang/Object;)Z", false);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeZone", "hashCode", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMinimumDaysInFirstWeek", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeZone", "getID", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMinimumDaysInFirstWeek", "()I", false);
methodVisitor.visitInsn(ICONST_4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(",mdfw=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMinimumDaysInFirstWeek", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "assemble", "(Lorg/joda/time/chrono/AssembledChronology$Fields;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millis", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondsField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "seconds", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMinutesField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minutes", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHoursField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hours", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHalfdaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "halfdays", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cDaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "days", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cWeeksField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weeks", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisOfSecondField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfSecond", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondOfMinuteField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfMinute", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMinuteOfHourField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfHour", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMinuteOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHourOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHourOfHalfdayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cClockhourOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cClockhourOfHalfdayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHalfdayOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "halfdayOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicYearDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicYearDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/GJYearOfEraDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/GJYearOfEraDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/chrono/BasicChronology;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/DividedDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "centuryOfEra", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/DividedDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getDurationField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuries", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/RemainderDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/field/DividedDateTimeField");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/RemainderDateTimeField", "<init>", "(Lorg/joda/time/field/DividedDateTimeField;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "yearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/GJEraDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/GJEraDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "era", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/GJDayOfWeekDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "days", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/GJDayOfWeekDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfWeek", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicDayOfMonthDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "days", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicDayOfMonthDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfMonth", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicDayOfYearDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "days", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicDayOfYearDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/GJMonthOfYearDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/GJMonthOfYearDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "monthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicWeekyearDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicWeekyearDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicWeekOfWeekyearDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weeks", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicWeekOfWeekyearDateTimeField", "<init>", "(Lorg/joda/time/chrono/BasicChronology;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekOfWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/RemainderDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuries", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "weekyearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/RemainderDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/OffsetDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "weekyearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/OffsetDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getDurationField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "years", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "monthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getDurationField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "months", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getDurationField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyears", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDaysInYearMax", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 366);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDaysInYear", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "isLeapYear", "(I)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitIntInsn(SIPUSH, 366);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitIntInsn(SIPUSH, 365);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getWeeksInYear", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getFirstWeekOfYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getFirstWeekOfYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitLdcInsn(new Long(604800000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getFirstWeekOfYearMillis", "(I)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDayOfWeek", "(J)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/BasicChronology", "iMinDaysInFirstWeek", "I");
methodVisitor.visitInsn(ISUB);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getYearMillis", "(I)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicChronology", "getYearInfo", "(I)Lorg/joda/time/chrono/BasicChronology$YearInfo;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/BasicChronology$YearInfo", "iFirstDayMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getYearMonthMillis", "(II)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getTotalMillisByYearMonth", "(II)J", false);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getYearMonthDayMillis", "(III)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getTotalMillisByYearMonth", "(II)J", false);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2L);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getYear", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getAverageMillisPerYearDividedByTwo", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(LSHR);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getApproxMillisAtEpochDividedByTwo", "()J", false);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2I);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 10);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitIincInsn(7, -1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitLdcInsn(new Long(31536000000L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLT, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "isLeapYear", "(I)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLdcInsn(new Long(31622400000L));
methodVisitor.visitVarInsn(LSTORE, 12);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitLdcInsn(new Long(31536000000L));
methodVisitor.visitVarInsn(LSTORE, 12);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitVarInsn(LLOAD, 12);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 8);
methodVisitor.visitVarInsn(LLOAD, 8);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGT, label2);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMonthOfYear", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMonthOfYear", "(JI)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getMonthOfYear", "(JI)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDayOfMonth", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMonthOfYear", "(JI)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDayOfMonth", "(JII)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDayOfMonth", "(JI)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMonthOfYear", "(JI)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDayOfMonth", "(JII)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDayOfMonth", "(JII)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getTotalMillisByYearMonth", "(II)J", false);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDayOfYear", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDayOfYear", "(JI)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDayOfYear", "(JI)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getWeekyear", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getWeekOfWeekyear", "(JI)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn(new Long(604800000L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 51);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn(new Long(1209600000L));
methodVisitor.visitInsn(LSUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getWeekOfWeekyear", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getWeekOfWeekyear", "(JI)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getWeekOfWeekyear", "(JI)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getFirstWeekOfYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getWeeksInYear", "(I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getFirstWeekOfYearMillis", "(I)J", false);
methodVisitor.visitVarInsn(LSTORE, 6);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 6);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLT, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitLdcInsn(new Long(604800000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDayOfWeek", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitVarInsn(LSTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn(new Long(86399999L));
methodVisitor.visitInsn(LSUB);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LDIV);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn(new Long(-3L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn(new Long(4L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitLdcInsn(new Long(7L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn(new Long(3L));
methodVisitor.visitInsn(LADD);
methodVisitor.visitLdcInsn(new Long(7L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMillisOfDay", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(new Integer(86399999));
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitInsn(LREM);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDaysInMonthMax", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDaysInMonthMax", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYear", "(J)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMonthOfYear", "(JI)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDaysInYearMonth", "(II)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDaysInMonthMaxForSet", "(JI)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDaysInMonthMax", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDateMidnightMillis", "(III)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "year", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMinYear", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMaxYear", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "monthOfYear", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMaxMonth", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "dayOfMonth", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getDaysInYearMonth", "(II)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "verifyValueBounds", "(Lorg/joda/time/DateTimeFieldType;III)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getYearMonthDayMillis", "(III)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMaxYear", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMinYear", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getYearDifference", "(JJ)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "isLeapYear", "(I)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "isLeapDay", "(J)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getDaysInYearMonth", "(II)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getDaysInMonthMax", "(I)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getTotalMillisByYearMonth", "(II)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "calculateFirstDayOfYearMillis", "(I)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getMinYear", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getMaxYear", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMaxMonth", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "getMaxMonth", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getMaxMonth", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getAverageMillisPerYear", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getAverageMillisPerYearDividedByTwo", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getAverageMillisPerMonth", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getApproxMillisAtEpochDividedByTwo", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "setYear", "(JI)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getYearInfo", "(I)Lorg/joda/time/chrono/BasicChronology$YearInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/BasicChronology", "iYearInfoCache", "[Lorg/joda/time/chrono/BasicChronology$YearInfo;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 1023);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/BasicChronology$YearInfo", "iYear", "I");
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicChronology$YearInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology", "calculateFirstDayOfYearMillis", "(I)J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicChronology$YearInfo", "<init>", "(IJ)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/BasicChronology", "iYearInfoCache", "[Lorg/joda/time/chrono/BasicChronology$YearInfo;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 1023);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHalfdaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cDaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/field/MillisDurationField", "INSTANCE", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisField", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDurationField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "seconds", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDurationField", "<init>", "(Lorg/joda/time/DurationFieldType;J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondsField", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDurationField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "minutes", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitLdcInsn(new Long(60000L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDurationField", "<init>", "(Lorg/joda/time/DurationFieldType;J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cMinutesField", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDurationField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "hours", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitLdcInsn(new Long(3600000L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDurationField", "<init>", "(Lorg/joda/time/DurationFieldType;J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cHoursField", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDurationField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "halfdays", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitLdcInsn(new Long(43200000L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDurationField", "<init>", "(Lorg/joda/time/DurationFieldType;J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cHalfdaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDurationField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitLdcInsn(new Long(86400000L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDurationField", "<init>", "(Lorg/joda/time/DurationFieldType;J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cDaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDurationField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "weeks", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitLdcInsn(new Long(604800000L));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDurationField", "<init>", "(Lorg/joda/time/DurationFieldType;J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cWeeksField", "Lorg/joda/time/DurationField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "millisOfSecond", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondsField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisOfSecondField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "millisOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cDaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cMillisOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "secondOfMinute", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondsField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMinutesField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondOfMinuteField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "secondOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondsField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cDaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cSecondOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "minuteOfHour", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMinutesField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHoursField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cMinuteOfHourField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "minuteOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cMinutesField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cDaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cMinuteOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "hourOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHoursField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cDaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cHourOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/PreciseDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "hourOfHalfday", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHoursField", "Lorg/joda/time/DurationField;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHalfdaysField", "Lorg/joda/time/DurationField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cHourOfHalfdayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/ZeroIsMaxDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHourOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "clockhourOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/ZeroIsMaxDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cClockhourOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/ZeroIsMaxDateTimeField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/chrono/BasicChronology", "cHourOfHalfdayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "clockhourOfHalfday", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/ZeroIsMaxDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cClockhourOfHalfdayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/BasicChronology$HalfdayField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BasicChronology$HalfdayField", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/chrono/BasicChronology", "cHalfdayOfDayField", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
