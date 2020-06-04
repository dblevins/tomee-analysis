package asm.org.apache.commons.lang3.time;
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
public class DateFormatUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/lang3/time/DateFormatUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "UTC_TIME_ZONE", "Ljava/util/TimeZone;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISO_8601_EXTENDED_DATETIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_DATETIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_DATETIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISO_8601_EXTENDED_DATE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_DATE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_DATE_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_TIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_TIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISO_8601_EXTENDED_TIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_TIME_NO_T_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "ISO_TIME_NO_T_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SMTP_DATETIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "formatUTC", "(JLjava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "UTC_TIME_ZONE", "Ljava/util/TimeZone;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "formatUTC", "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "UTC_TIME_ZONE", "Ljava/util/TimeZone;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "formatUTC", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "UTC_TIME_ZONE", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "formatUTC", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "UTC_TIME_ZONE", "Ljava/util/TimeZone;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(JLjava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Calendar;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Calendar;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(JLjava/lang/String;Ljava/util/TimeZone;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Calendar;Ljava/lang/String;Ljava/util/TimeZone;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Calendar;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(JLjava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Calendar;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Calendar;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(JLjava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/lang3/time/FastDateFormat", "format", "(Ljava/util/Date;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "format", "(Ljava/util/Calendar;Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/lang3/time/FastDateFormat", "format", "(Ljava/util/Calendar;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastTimeZone", "getGmtTimeZone", "()Ljava/util/TimeZone;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "UTC_TIME_ZONE", "Ljava/util/TimeZone;");
methodVisitor.visitLdcInsn("yyyy-MM-dd'T'HH:mm:ss");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_DATETIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_DATETIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_DATETIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("yyyy-MM-dd'T'HH:mm:ssZZ");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_DATETIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("yyyy-MM-dd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_DATE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_DATE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_DATE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("yyyy-MM-ddZZ");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_DATE_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("'T'HH:mm:ss");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_TIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("'T'HH:mm:ssZZ");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_TIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("HH:mm:ss");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_TIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_TIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_TIME_NO_T_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("HH:mm:ssZZ");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "ISO_TIME_NO_T_TIME_ZONE_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitLdcInsn("EEE, dd MMM yyyy HH:mm:ss Z");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "US", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDateFormat", "getInstance", "(Ljava/lang/String;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/FastDateFormat;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/time/DateFormatUtils", "SMTP_DATETIME_FORMAT", "Lorg/apache/commons/lang3/time/FastDateFormat;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
