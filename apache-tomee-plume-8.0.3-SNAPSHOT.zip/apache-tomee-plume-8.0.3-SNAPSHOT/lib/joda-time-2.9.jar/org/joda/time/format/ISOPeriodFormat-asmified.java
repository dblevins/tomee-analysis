package asm.org.joda.time.format;
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
public class ISOPeriodFormatDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/joda/time/format/ISOPeriodFormat", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cStandard", "Lorg/joda/time/format/PeriodFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cAlternate", "Lorg/joda/time/format/PeriodFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cAlternateExtended", "Lorg/joda/time/format/PeriodFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cAlternateWithWeeks", "Lorg/joda/time/format/PeriodFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "cAlternateExtendedWihWeeks", "Lorg/joda/time/format/PeriodFormatter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "standard", "()Lorg/joda/time/format/PeriodFormatter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cStandard", "Lorg/joda/time/format/PeriodFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/format/PeriodFormatterBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/format/PeriodFormatterBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("P");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendLiteral", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendYears", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("Y");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSuffix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMonths", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("M");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSuffix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendWeeks", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("W");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSuffix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendDays", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("D");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSuffix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("T");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendHours", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("H");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSuffix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMinutes", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("M");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSuffix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("S");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSuffix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "toFormatter", "()Lorg/joda/time/format/PeriodFormatter;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/format/ISOPeriodFormat", "cStandard", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cStandard", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "alternate", "()Lorg/joda/time/format/PeriodFormatter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternate", "Lorg/joda/time/format/PeriodFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/format/PeriodFormatterBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/format/PeriodFormatterBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("P");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendLiteral", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "printZeroAlways", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendYears", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMonths", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendDays", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("T");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendHours", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMinutes", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "toFormatter", "()Lorg/joda/time/format/PeriodFormatter;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternate", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternate", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "alternateExtended", "()Lorg/joda/time/format/PeriodFormatter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateExtended", "Lorg/joda/time/format/PeriodFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/format/PeriodFormatterBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/format/PeriodFormatterBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("P");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendLiteral", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "printZeroAlways", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendYears", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMonths", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendDays", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("T");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendHours", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMinutes", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "toFormatter", "()Lorg/joda/time/format/PeriodFormatter;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateExtended", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateExtended", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "alternateWithWeeks", "()Lorg/joda/time/format/PeriodFormatter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateWithWeeks", "Lorg/joda/time/format/PeriodFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/format/PeriodFormatterBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/format/PeriodFormatterBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("P");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendLiteral", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "printZeroAlways", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendYears", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("W");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendPrefix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendWeeks", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendDays", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("T");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendHours", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMinutes", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "toFormatter", "()Lorg/joda/time/format/PeriodFormatter;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateWithWeeks", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateWithWeeks", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "alternateExtendedWithWeeks", "()Lorg/joda/time/format/PeriodFormatter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateExtendedWihWeeks", "Lorg/joda/time/format/PeriodFormatter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/format/PeriodFormatterBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/format/PeriodFormatterBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("P");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendLiteral", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "printZeroAlways", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendYears", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "minimumPrintedDigits", "(I)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("W");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendPrefix", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendWeeks", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendDays", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn("T");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparatorIfFieldsAfter", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendHours", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendMinutes", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSeparator", "(Ljava/lang/String;)Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "appendSecondsWithOptionalMillis", "()Lorg/joda/time/format/PeriodFormatterBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/format/PeriodFormatterBuilder", "toFormatter", "()Lorg/joda/time/format/PeriodFormatter;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateExtendedWihWeeks", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/format/ISOPeriodFormat", "cAlternateExtendedWihWeeks", "Lorg/joda/time/format/PeriodFormatter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
