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
public class AssembledChronologyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/joda/time/chrono/AssembledChronology", null, "org/joda/time/chrono/BaseChronology", null);

classWriter.visitInnerClass("org/joda/time/chrono/AssembledChronology$Fields", "org/joda/time/chrono/AssembledChronology", "Fields", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-6728465968995518215L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iBase", "Lorg/joda/time/Chronology;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iParam", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMillis", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iSeconds", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMinutes", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iHours", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iHalfdays", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iDays", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iWeeks", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iWeekyears", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMonths", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iYears", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iCenturies", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iEras", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMillisOfSecond", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMillisOfDay", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iSecondOfMinute", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iSecondOfDay", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMinuteOfHour", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMinuteOfDay", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iHourOfDay", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iClockhourOfDay", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iHourOfHalfday", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iClockhourOfHalfday", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iHalfdayOfDay", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iDayOfWeek", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iDayOfMonth", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iDayOfYear", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iWeekOfWeekyear", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iWeekyear", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iWeekyearOfCentury", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iMonthOfYear", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iYear", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iYearOfEra", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iYearOfCentury", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iCenturyOfEra", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iEra", "Lorg/joda/time/DateTimeField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iBaseFlags", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iParam", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/AssembledChronology", "setFields", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getZone", "()Lorg/joda/time/DateTimeZone;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDateTimeMillis", "(IIII)J", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBaseFlags", "I");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IAND);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getDateTimeMillis", "(IIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "getDateTimeMillis", "(IIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDateTimeMillis", "(IIIIIII)J", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBaseFlags", "I");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "getDateTimeMillis", "(IIIIIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(8, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDateTimeMillis", "(JIIII)J", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBaseFlags", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getDateTimeMillis", "(JIIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "getDateTimeMillis", "(JIIII)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "millis", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMillis", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "millisOfSecond", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMillisOfSecond", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "millisOfDay", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMillisOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "seconds", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iSeconds", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "secondOfMinute", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iSecondOfMinute", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "secondOfDay", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iSecondOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "minutes", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMinutes", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "minuteOfHour", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMinuteOfHour", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "minuteOfDay", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMinuteOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hours", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iHours", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hourOfDay", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iHourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "clockhourOfDay", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iClockhourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "halfdays", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iHalfdays", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "hourOfHalfday", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iHourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "clockhourOfHalfday", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iClockhourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "halfdayOfDay", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iHalfdayOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "days", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iDays", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "dayOfWeek", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iDayOfWeek", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "dayOfMonth", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iDayOfMonth", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "dayOfYear", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iDayOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "weeks", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iWeeks", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "weekOfWeekyear", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekOfWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "weekyears", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekyears", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "weekyear", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "weekyearOfCentury", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekyearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "months", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMonths", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "monthOfYear", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMonthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "years", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iYears", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "year", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "yearOfEra", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iYearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "yearOfCentury", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iYearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "centuries", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iCenturies", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "centuryOfEra", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iCenturyOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "eras", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iEras", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "era", "()Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "assemble", "(Lorg/joda/time/chrono/AssembledChronology$Fields;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "getBase", "()Lorg/joda/time/Chronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "getParam", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iParam", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setFields", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/AssembledChronology$Fields");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/AssembledChronology$Fields", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/AssembledChronology$Fields", "copyFieldsFrom", "(Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/AssembledChronology", "assemble", "(Lorg/joda/time/chrono/AssembledChronology$Fields;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millis", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "millis", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMillis", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "seconds", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "seconds", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iSeconds", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minutes", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "minutes", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMinutes", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hours", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "hours", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iHours", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "halfdays", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "halfdays", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iHalfdays", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "days", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "days", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iDays", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weeks", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "weeks", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iWeeks", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyears", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "weekyears", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label16);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekyears", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "months", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label17);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label18 = new Label();
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "months", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label18);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMonths", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "years", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label19);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "years", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label20);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iYears", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuries", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label21);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label22 = new Label();
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label21);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "centuries", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label22);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iCenturies", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "eras", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label23);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label24 = new Label();
methodVisitor.visitJumpInsn(GOTO, label24);
methodVisitor.visitLabel(label23);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "eras", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitLabel(label24);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iEras", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfSecond", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label25 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label25);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label26 = new Label();
methodVisitor.visitJumpInsn(GOTO, label26);
methodVisitor.visitLabel(label25);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "millisOfSecond", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label26);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMillisOfSecond", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label27 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label27);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label28 = new Label();
methodVisitor.visitJumpInsn(GOTO, label28);
methodVisitor.visitLabel(label27);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "millisOfDay", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label28);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMillisOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfMinute", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label29 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label29);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label30 = new Label();
methodVisitor.visitJumpInsn(GOTO, label30);
methodVisitor.visitLabel(label29);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "secondOfMinute", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label30);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iSecondOfMinute", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label31 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label31);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label32 = new Label();
methodVisitor.visitJumpInsn(GOTO, label32);
methodVisitor.visitLabel(label31);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "secondOfDay", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label32);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iSecondOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfHour", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label33 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label33);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label34 = new Label();
methodVisitor.visitJumpInsn(GOTO, label34);
methodVisitor.visitLabel(label33);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "minuteOfHour", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label34);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMinuteOfHour", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label35 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label35);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label36 = new Label();
methodVisitor.visitJumpInsn(GOTO, label36);
methodVisitor.visitLabel(label35);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "minuteOfDay", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label36);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMinuteOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label37 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label37);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label38 = new Label();
methodVisitor.visitJumpInsn(GOTO, label38);
methodVisitor.visitLabel(label37);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "hourOfDay", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label38);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iHourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label39 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label39);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label40 = new Label();
methodVisitor.visitJumpInsn(GOTO, label40);
methodVisitor.visitLabel(label39);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "clockhourOfDay", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label40);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iClockhourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label41 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label41);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label42 = new Label();
methodVisitor.visitJumpInsn(GOTO, label42);
methodVisitor.visitLabel(label41);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "hourOfHalfday", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label42);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iHourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label43 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label43);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label44 = new Label();
methodVisitor.visitJumpInsn(GOTO, label44);
methodVisitor.visitLabel(label43);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "clockhourOfHalfday", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label44);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iClockhourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "halfdayOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label45 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label45);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label46 = new Label();
methodVisitor.visitJumpInsn(GOTO, label46);
methodVisitor.visitLabel(label45);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "halfdayOfDay", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label46);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iHalfdayOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfWeek", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label47 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label47);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label48 = new Label();
methodVisitor.visitJumpInsn(GOTO, label48);
methodVisitor.visitLabel(label47);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "dayOfWeek", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label48);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iDayOfWeek", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfMonth", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label49 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label49);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label50 = new Label();
methodVisitor.visitJumpInsn(GOTO, label50);
methodVisitor.visitLabel(label49);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "dayOfMonth", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label50);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iDayOfMonth", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label51 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label51);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label52 = new Label();
methodVisitor.visitJumpInsn(GOTO, label52);
methodVisitor.visitLabel(label51);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "dayOfYear", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label52);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iDayOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekOfWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label53 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label53);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label54 = new Label();
methodVisitor.visitJumpInsn(GOTO, label54);
methodVisitor.visitLabel(label53);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "weekOfWeekyear", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label54);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekOfWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label55 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label55);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label56 = new Label();
methodVisitor.visitJumpInsn(GOTO, label56);
methodVisitor.visitLabel(label55);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "weekyear", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label56);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label57 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label57);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label58 = new Label();
methodVisitor.visitJumpInsn(GOTO, label58);
methodVisitor.visitLabel(label57);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "weekyearOfCentury", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label58);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iWeekyearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "monthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label59 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label59);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label60 = new Label();
methodVisitor.visitJumpInsn(GOTO, label60);
methodVisitor.visitLabel(label59);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "monthOfYear", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label60);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iMonthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label61 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label61);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label62 = new Label();
methodVisitor.visitJumpInsn(GOTO, label62);
methodVisitor.visitLabel(label61);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "year", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label62);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label63 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label63);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label64 = new Label();
methodVisitor.visitJumpInsn(GOTO, label64);
methodVisitor.visitLabel(label63);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "yearOfEra", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label64);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iYearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label65 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label65);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label66 = new Label();
methodVisitor.visitJumpInsn(GOTO, label66);
methodVisitor.visitLabel(label65);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "yearOfCentury", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label66);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iYearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label67 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label67);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label68 = new Label();
methodVisitor.visitJumpInsn(GOTO, label68);
methodVisitor.visitLabel(label67);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "centuryOfEra", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label68);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iCenturyOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "era", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label69 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label69);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label70 = new Label();
methodVisitor.visitJumpInsn(GOTO, label70);
methodVisitor.visitLabel(label69);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/BaseChronology", "era", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitLabel(label70);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
Label label71 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label71);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label72 = new Label();
methodVisitor.visitJumpInsn(GOTO, label72);
methodVisitor.visitLabel(label71);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iHourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "hourOfDay", "()Lorg/joda/time/DateTimeField;", false);
Label label73 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label73);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMinuteOfHour", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "minuteOfHour", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label73);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iSecondOfMinute", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "secondOfMinute", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label73);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMillisOfSecond", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "millisOfSecond", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label73);
methodVisitor.visitInsn(ICONST_1);
Label label74 = new Label();
methodVisitor.visitJumpInsn(GOTO, label74);
methodVisitor.visitLabel(label73);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label74);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMillisOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "millisOfDay", "()Lorg/joda/time/DateTimeField;", false);
Label label75 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label75);
methodVisitor.visitInsn(ICONST_2);
Label label76 = new Label();
methodVisitor.visitJumpInsn(GOTO, label76);
methodVisitor.visitLabel(label75);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label76);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "year", "()Lorg/joda/time/DateTimeField;", false);
Label label77 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label77);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iMonthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "monthOfYear", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label77);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iDayOfMonth", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology", "iBase", "Lorg/joda/time/Chronology;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "dayOfMonth", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitJumpInsn(IF_ACMPNE, label77);
methodVisitor.visitInsn(ICONST_4);
Label label78 = new Label();
methodVisitor.visitJumpInsn(GOTO, label78);
methodVisitor.visitLabel(label77);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label78);
methodVisitor.visitInsn(IOR);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitLabel(label72);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology", "iBaseFlags", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readObject", "(Ljava/io/ObjectInputStream;)V", null, new String[] { "java/io/IOException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ObjectInputStream", "defaultReadObject", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/AssembledChronology", "setFields", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
