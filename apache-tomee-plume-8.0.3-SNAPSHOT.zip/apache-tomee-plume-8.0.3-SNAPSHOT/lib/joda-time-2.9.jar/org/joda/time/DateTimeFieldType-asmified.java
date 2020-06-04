package asm.org.joda.time;
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
public class DateTimeFieldTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/joda/time/DateTimeFieldType", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "org/joda/time/DateTimeFieldType", "StandardDateTimeFieldType", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-42615285973990L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ERA", "B", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "YEAR_OF_ERA", "B", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CENTURY_OF_ERA", "B", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "YEAR_OF_CENTURY", "B", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "YEAR", "B", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAY_OF_YEAR", "B", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MONTH_OF_YEAR", "B", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAY_OF_MONTH", "B", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEKYEAR_OF_CENTURY", "B", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEKYEAR", "B", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEK_OF_WEEKYEAR", "B", null, new Integer(11));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAY_OF_WEEK", "B", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HALFDAY_OF_DAY", "B", null, new Integer(13));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HOUR_OF_HALFDAY", "B", null, new Integer(14));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLOCKHOUR_OF_HALFDAY", "B", null, new Integer(15));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CLOCKHOUR_OF_DAY", "B", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HOUR_OF_DAY", "B", null, new Integer(17));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MINUTE_OF_DAY", "B", null, new Integer(18));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MINUTE_OF_HOUR", "B", null, new Integer(19));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SECOND_OF_DAY", "B", null, new Integer(20));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SECOND_OF_MINUTE", "B", null, new Integer(21));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MILLIS_OF_DAY", "B", null, new Integer(22));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MILLIS_OF_SECOND", "B", null, new Integer(23));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "YEAR_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CENTURY_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "YEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DAY_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MONTH_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DAY_OF_MONTH_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WEEKYEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WEEK_OF_WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DAY_OF_WEEK_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HALFDAY_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLOCKHOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CLOCKHOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MINUTE_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MINUTE_OF_HOUR_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SECOND_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SECOND_OF_MINUTE_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MILLIS_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MILLIS_OF_SECOND_TYPE", "Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/DateTimeFieldType", "iName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "millisOfSecond", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MILLIS_OF_SECOND_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "millisOfDay", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MILLIS_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "secondOfMinute", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "SECOND_OF_MINUTE_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "secondOfDay", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "SECOND_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "minuteOfHour", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MINUTE_OF_HOUR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "minuteOfDay", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MINUTE_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hourOfDay", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "HOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "clockhourOfDay", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "CLOCKHOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hourOfHalfday", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "HOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "clockhourOfHalfday", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "CLOCKHOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "halfdayOfDay", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "HALFDAY_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "dayOfWeek", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_WEEK_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "dayOfMonth", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_MONTH_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "dayOfYear", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "weekOfWeekyear", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "WEEK_OF_WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "weekyear", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "weekyearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "WEEKYEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "monthOfYear", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MONTH_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "year", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "yearOfEra", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "yearOfCentury", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "centuryOfEra", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "CENTURY_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "era", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/DateTimeFieldType", "iName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDurationType", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRangeDurationType", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getField", "(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSupported", "(Lorg/joda/time/Chronology;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeFieldType", "getField", "(Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "isSupported", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeFieldType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "CENTURY_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MONTH_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_MONTH_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "WEEKYEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "WEEK_OF_WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_WEEK_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "HALFDAY_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1300", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "HOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1400", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "CLOCKHOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1500", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "CLOCKHOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1600", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "HOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1700", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MINUTE_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1800", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MINUTE_OF_HOUR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1900", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "SECOND_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2000", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "SECOND_OF_MINUTE_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2100", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MILLIS_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2200", "()Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeFieldType", "MILLIS_OF_SECOND_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("era");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "eras", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("yearOfEra");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "years", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "eras", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("centuryOfEra");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "centuries", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "eras", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "CENTURY_OF_ERA_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("yearOfCentury");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "years", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "centuries", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("year");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "years", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dayOfYear");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "years", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("monthOfYear");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "months", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "years", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "MONTH_OF_YEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dayOfMonth");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "months", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_MONTH_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("weekyearOfCentury");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "weekyears", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "centuries", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "WEEKYEAR_OF_CENTURY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("weekyear");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "weekyears", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("weekOfWeekyear");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "weeks", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "weekyears", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "WEEK_OF_WEEKYEAR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dayOfWeek");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "weeks", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "DAY_OF_WEEK_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("halfdayOfDay");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "halfdays", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "HALFDAY_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("hourOfHalfday");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "hours", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "halfdays", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "HOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("clockhourOfHalfday");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "hours", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "halfdays", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "CLOCKHOUR_OF_HALFDAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("clockhourOfDay");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "hours", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "CLOCKHOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("hourOfDay");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "hours", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "HOUR_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("minuteOfDay");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "minutes", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "MINUTE_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("minuteOfHour");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "minutes", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "hours", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "MINUTE_OF_HOUR_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("secondOfDay");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "seconds", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "SECOND_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("secondOfMinute");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "seconds", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "minutes", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "SECOND_OF_MINUTE_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("millisOfDay");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "millis", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "MILLIS_OF_DAY_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("millisOfSecond");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "millis", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "seconds", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTimeFieldType$StandardDateTimeFieldType", "<init>", "(Ljava/lang/String;BLorg/joda/time/DurationFieldType;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DateTimeFieldType", "MILLIS_OF_SECOND_TYPE", "Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
