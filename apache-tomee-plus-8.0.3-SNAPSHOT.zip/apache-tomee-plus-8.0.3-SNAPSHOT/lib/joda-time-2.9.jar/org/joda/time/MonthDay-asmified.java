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
public class MonthDayDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/joda/time/MonthDay", null, "org/joda/time/base/BasePartial", new String[] { "org/joda/time/ReadablePartial", "java/io/Serializable" });

classWriter.visitInnerClass("org/joda/time/MonthDay$Property", "org/joda/time/MonthDay", "Property", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(2954560699050434609L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FIELD_TYPES", "[Lorg/joda/time/DateTimeFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PARSER", "Lorg/joda/time/format/DateTimeFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MONTH_OF_YEAR", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DAY_OF_MONTH", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "now", "()Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "now", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Zone must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/DateTimeZone;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "now", "(Lorg/joda/time/Chronology;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Chronology must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parse", "(Ljava/lang/String;)Lorg/joda/time/MonthDay;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/joda/convert/FromString;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/MonthDay", "PARSER", "Lorg/joda/time/format/DateTimeFormatter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/MonthDay", "parse", "(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/MonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parse", "(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatter", "parseLocalDate", "(Ljava/lang/String;)Lorg/joda/time/LocalDate;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getMonthOfYear", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/LocalDate", "getDayOfMonth", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromCalendarFields", "(Ljava/util/Calendar;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The calendar must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "get", "(I)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "get", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromDateFields", "(Ljava/util/Date;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The date must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getMonth", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getDate", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/joda/time/DateTimeZone;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/ISOChronology", "getInstance", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/chrono/ISOChronology;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/joda/time/Chronology;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(JLorg/joda/time/Chronology;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(JLorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/ISODateTimeFormat", "localDateParser", "()Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(Ljava/lang/Object;Lorg/joda/time/Chronology;Lorg/joda/time/format/DateTimeFormatter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;Lorg/joda/time/Chronology;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeUtils", "getChronology", "(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/ISODateTimeFormat", "localDateParser", "()Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(Ljava/lang/Object;Lorg/joda/time/Chronology;Lorg/joda/time/format/DateTimeFormatter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(IILorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(IILorg/joda/time/Chronology;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "([ILorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/MonthDay;[I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(Lorg/joda/time/base/BasePartial;[I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/MonthDay;Lorg/joda/time/Chronology;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/base/BasePartial", "<init>", "(Lorg/joda/time/base/BasePartial;Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "readResolve", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeZone", "UTC", "Lorg/joda/time/DateTimeZone;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeZone", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "withUTC", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/MonthDay;Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getField", "(ILorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 0, 1 }, new Label[] { label0, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "monthOfYear", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "dayOfMonth", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid index: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFieldType", "(I)Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/MonthDay", "FIELD_TYPES", "[Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFieldTypes", "()[Lorg/joda/time/DateTimeFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/MonthDay", "FIELD_TYPES", "[Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/joda/time/DateTimeFieldType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withChronologyRetainFields", "(Lorg/joda/time/Chronology;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeUtils", "getChronology", "(Lorg/joda/time/Chronology;)Lorg/joda/time/Chronology;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "withUTC", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getChronology", "()Lorg/joda/time/Chronology;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/MonthDay;Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValues", "()[I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "validate", "(Lorg/joda/time/ReadablePartial;[I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withField", "(Lorg/joda/time/DateTimeFieldType;I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "indexOfSupported", "(Lorg/joda/time/DateTimeFieldType;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValue", "(I)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getField", "(I)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/MonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withFieldAdded", "(Lorg/joda/time/DurationFieldType;I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "indexOfSupported", "(Lorg/joda/time/DurationFieldType;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getField", "(I)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/MonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withPeriodAdded", "(Lorg/joda/time/ReadablePeriod;I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/joda/time/ReadablePeriod", "size", "()I", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/joda/time/ReadablePeriod", "getFieldType", "(I)Lorg/joda/time/DurationFieldType;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "indexOf", "(Lorg/joda/time/DurationFieldType;)I", false);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLT, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getField", "(I)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/joda/time/ReadablePeriod", "getValue", "(I)I", true);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "safeMultiply", "(II)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/MonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "plus", "(Lorg/joda/time/ReadablePeriod;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "withPeriodAdded", "(Lorg/joda/time/ReadablePeriod;I)Lorg/joda/time/MonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "plusMonths", "(I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "months", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "withFieldAdded", "(Lorg/joda/time/DurationFieldType;I)Lorg/joda/time/MonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "plusDays", "(I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "withFieldAdded", "(Lorg/joda/time/DurationFieldType;I)Lorg/joda/time/MonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "minus", "(Lorg/joda/time/ReadablePeriod;)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "withPeriodAdded", "(Lorg/joda/time/ReadablePeriod;I)Lorg/joda/time/MonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "minusMonths", "(I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "months", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "safeNegate", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "withFieldAdded", "(Lorg/joda/time/DurationFieldType;I)Lorg/joda/time/MonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "minusDays", "(I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DurationFieldType", "days", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "safeNegate", "(I)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "withFieldAdded", "(Lorg/joda/time/DurationFieldType;I)Lorg/joda/time/MonthDay;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toLocalDate", "(I)Lorg/joda/time/LocalDate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/LocalDate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getMonthOfYear", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getDayOfMonth", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/LocalDate", "<init>", "(IIILorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMonthOfYear", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValue", "(I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDayOfMonth", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValue", "(I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMonthOfYear", "(I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "monthOfYear", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/MonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withDayOfMonth", "(I)Lorg/joda/time/MonthDay;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getValues", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "getChronology", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "dayOfMonth", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(Lorg/joda/time/ReadablePartial;I[II)[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay", "<init>", "(Lorg/joda/time/MonthDay;[I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "property", "(Lorg/joda/time/DateTimeFieldType;)Lorg/joda/time/MonthDay$Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay$Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "indexOfSupported", "(Lorg/joda/time/DateTimeFieldType;)I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay$Property", "<init>", "(Lorg/joda/time/MonthDay;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "monthOfYear", "()Lorg/joda/time/MonthDay$Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay$Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay$Property", "<init>", "(Lorg/joda/time/MonthDay;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dayOfMonth", "()Lorg/joda/time/MonthDay$Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/MonthDay$Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/MonthDay$Property", "<init>", "(Lorg/joda/time/MonthDay;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/joda/convert/ToString;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "monthOfYear", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "dayOfMonth", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/ISODateTimeFormat", "forFields", "(Ljava/util/Collection;ZZ)Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatter", "print", "(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeFormat", "forPattern", "(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatter", "print", "(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/MonthDay", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeFormat", "forPattern", "(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatter", "withLocale", "(Ljava/util/Locale;)Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatter", "print", "(Lorg/joda/time/ReadablePartial;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/joda/time/DateTimeFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "monthOfYear", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "dayOfMonth", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/MonthDay", "FIELD_TYPES", "[Lorg/joda/time/DateTimeFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/format/DateTimeFormatterBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/format/DateTimeFormatterBuilder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/ISODateTimeFormat", "localDateParser", "()Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatter", "getParser", "()Lorg/joda/time/format/DateTimeParser;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatterBuilder", "appendOptional", "(Lorg/joda/time/format/DateTimeParser;)Lorg/joda/time/format/DateTimeFormatterBuilder;", false);
methodVisitor.visitLdcInsn("--MM-dd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/format/DateTimeFormat", "forPattern", "(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatter", "getParser", "()Lorg/joda/time/format/DateTimeParser;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatterBuilder", "appendOptional", "(Lorg/joda/time/format/DateTimeParser;)Lorg/joda/time/format/DateTimeFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/DateTimeFormatterBuilder", "toFormatter", "()Lorg/joda/time/format/DateTimeFormatter;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/MonthDay", "PARSER", "Lorg/joda/time/format/DateTimeFormatter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
