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
public class LenientChronologyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/joda/time/chrono/LenientChronology", null, "org/joda/time/chrono/AssembledChronology", null);

classWriter.visitInnerClass("org/joda/time/chrono/AssembledChronology$Fields", "org/joda/time/chrono/AssembledChronology", "Fields", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-3148237568046877177L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "iWithUTC", "Lorg/joda/time/Chronology;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Lorg/joda/time/Chronology;)Lorg/joda/time/chrono/LenientChronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Must supply a chronology");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/chrono/LenientChronology");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "<init>", "(Lorg/joda/time/Chronology;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/joda/time/Chronology;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/AssembledChronology", "<init>", "(Lorg/joda/time/Chronology;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withUTC", "()Lorg/joda/time/Chronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LenientChronology", "iWithUTC", "Lorg/joda/time/Chronology;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeZone", "UTC", "Lorg/joda/time/DateTimeZone;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/LenientChronology", "iWithUTC", "Lorg/joda/time/Chronology;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "withUTC", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/LenientChronology", "getInstance", "(Lorg/joda/time/Chronology;)Lorg/joda/time/chrono/LenientChronology;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/LenientChronology", "iWithUTC", "Lorg/joda/time/Chronology;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LenientChronology", "iWithUTC", "Lorg/joda/time/Chronology;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withZone", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/Chronology;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeZone", "getDefault", "()Lorg/joda/time/DateTimeZone;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DateTimeZone", "UTC", "Lorg/joda/time/DateTimeZone;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "withUTC", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getZone", "()Lorg/joda/time/DateTimeZone;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "withZone", "(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/LenientChronology", "getInstance", "(Lorg/joda/time/Chronology;)Lorg/joda/time/chrono/LenientChronology;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "assemble", "(Lorg/joda/time/chrono/AssembledChronology$Fields;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "year", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "yearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "centuryOfEra", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "era", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "era", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfWeek", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfWeek", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfMonth", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfMonth", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "dayOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "monthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "monthOfYear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekOfWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekOfWeekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyear", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "weekyearOfCentury", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfSecond", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfSecond", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "millisOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfMinute", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfMinute", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "secondOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfHour", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfHour", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "minuteOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "hourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "clockhourOfHalfday", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "halfdayOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/chrono/LenientChronology", "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/AssembledChronology$Fields", "halfdayOfDay", "Lorg/joda/time/DateTimeField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL, "convertField", "(Lorg/joda/time/DateTimeField;)Lorg/joda/time/DateTimeField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/LenientDateTimeField", "getInstance", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/Chronology;)Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
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
methodVisitor.visitTypeInsn(INSTANCEOF, "org/joda/time/chrono/LenientChronology");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/joda/time/chrono/LenientChronology");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(new Integer(236548278));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("LenientChronology[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LenientChronology", "getBase", "()Lorg/joda/time/Chronology;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/Chronology", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
