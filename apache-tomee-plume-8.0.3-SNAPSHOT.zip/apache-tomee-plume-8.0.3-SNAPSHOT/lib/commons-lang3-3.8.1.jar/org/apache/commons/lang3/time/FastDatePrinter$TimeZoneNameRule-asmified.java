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
public class FastDatePrinter$TimeZoneNameRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", null, "java/lang/Object", new String[] { "org/apache/commons/lang3/time/FastDatePrinter$Rule" });

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "org/apache/commons/lang3/time/FastDatePrinter", "TimeZoneNameRule", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/time/FastDatePrinter$Rule", "org/apache/commons/lang3/time/FastDatePrinter", "Rule", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mLocale", "Ljava/util/Locale;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mStyle", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mStandard", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mDaylight", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/util/TimeZone;Ljava/util/Locale;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mLocale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mStyle", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDatePrinter", "getTimeZoneDisplay", "(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mStandard", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDatePrinter", "getTimeZoneDisplay", "(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mDaylight", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "estimateLength", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mStandard", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mDaylight", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendTo", "(Ljava/lang/Appendable;Ljava/util/Calendar;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "getTimeZone", "()Ljava/util/TimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Calendar", "get", "(I)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mStyle", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mLocale", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDatePrinter", "getTimeZoneDisplay", "(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Appendable", "append", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", true);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/TimeZone"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mStyle", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/lang3/time/FastDatePrinter$TimeZoneNameRule", "mLocale", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/time/FastDatePrinter", "getTimeZoneDisplay", "(Ljava/util/TimeZone;ZILjava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Appendable", "append", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
