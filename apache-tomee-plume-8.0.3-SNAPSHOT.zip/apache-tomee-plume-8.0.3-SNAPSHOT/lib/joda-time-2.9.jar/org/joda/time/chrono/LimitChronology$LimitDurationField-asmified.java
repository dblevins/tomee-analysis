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
public class LimitChronology$LimitDurationFieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/joda/time/chrono/LimitChronology$LimitDurationField", null, "org/joda/time/field/DecoratedDurationField", null);

classWriter.visitInnerClass("org/joda/time/chrono/LimitChronology$LimitDurationField", "org/joda/time/chrono/LimitChronology", "LimitDurationField", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(8049297699408782284L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/joda/time/chrono/LimitChronology;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/joda/time/chrono/LimitChronology;Lorg/joda/time/DurationField;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "getType", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/DecoratedDurationField", "<init>", "(Lorg/joda/time/DurationField;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(JJ)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "getValue", "(JJ)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueAsLong", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "getValueAsLong", "(JJ)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMillis", "(IJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "getMillis", "(IJ)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMillis", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "getMillis", "(JJ)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(JI)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "add", "(JI)J", false);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "add", "(JJ)J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitLdcInsn("resulting");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDifference", "(JJ)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn("minuend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("subtrahend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "getDifference", "(JJ)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDifferenceAsLong", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitLdcInsn("minuend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/chrono/LimitChronology$LimitDurationField", "this$0", "Lorg/joda/time/chrono/LimitChronology;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitLdcInsn("subtrahend");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology", "checkLimits", "(JLjava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/LimitChronology$LimitDurationField", "getWrappedField", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "getDifferenceAsLong", "(JJ)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
