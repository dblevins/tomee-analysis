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
public class LimitChronology$LimitDateTimeFieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", null, "org/joda/time/field/DecoratedDateTimeField", null);

classWriter.visitInnerClass("org/joda/time/chrono/LimitChronology$LimitDateTimeField", "org/joda/time/chrono/LimitChronology", "LimitDateTimeField", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-2435306746995699312L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iDurationField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iRangeDurationField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iLeapDurationField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/joda/time/chrono/LimitChronology;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/chrono/LimitChronology;Lorg/joda/time/DateTimeField;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getType", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/DecoratedDateTimeField", "<init>", "(Lorg/joda/time/DateTimeField;Lorg/joda/time/DateTimeFieldType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "iDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "iRangeDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "iLeapDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "get", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAsText", "(JLjava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getAsText", "(JLjava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAsShortText", "(JLjava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getAsShortText", "(JLjava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(JI)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(JI)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "add", "(JJ)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addWrapField", "(JI)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "addWrapField", "(JI)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDifference", "(JJ)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn("minuend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("subtrahend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getDifference", "(JJ)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDifferenceAsLong", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn("minuend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("subtrahend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getDifferenceAsLong", "(JJ)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(JI)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(JI)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(JLjava/lang/String;Ljava/util/Locale;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "set", "(JLjava/lang/String;Ljava/util/Locale;)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDurationField", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "iDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getRangeDurationField", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "iRangeDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLeap", "(J)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "isLeap", "(J)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLeapAmount", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getLeapAmount", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getLeapDurationField", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "iLeapDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundFloor", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundFloor", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundCeiling", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundCeiling", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfFloor", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfFloor", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfCeiling", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfCeiling", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "roundHalfEven", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "roundHalfEven", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remainder", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "remainder", "(J)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMinimumValue", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getMinimumValue", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaximumValue", "(J)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getMaximumValue", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaximumTextLength", "(Ljava/util/Locale;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getMaximumTextLength", "(Ljava/util/Locale;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaximumShortTextLength", "(Ljava/util/Locale;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDateTimeField", "getWrappedField", "()Lorg/joda/time/DateTimeField;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeField", "getMaximumShortTextLength", "(Ljava/util/Locale;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
