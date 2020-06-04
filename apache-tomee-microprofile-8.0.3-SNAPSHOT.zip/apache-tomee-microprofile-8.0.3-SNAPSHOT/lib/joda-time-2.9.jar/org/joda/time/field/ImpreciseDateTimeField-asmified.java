package asm.org.joda.time.field;
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
public class ImpreciseDateTimeFieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/joda/time/field/ImpreciseDateTimeField", null, "org/joda/time/field/BaseDateTimeField", null);

classWriter.visitInnerClass("org/joda/time/field/ImpreciseDateTimeField$LinkedDurationField", "org/joda/time/field/ImpreciseDateTimeField", "LinkedDurationField", ACC_PRIVATE | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(7190739608550251860L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "iUnitMillis", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iDurationField", "Lorg/joda/time/DurationField;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/joda/time/DateTimeFieldType;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/BaseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/field/ImpreciseDateTimeField", "iUnitMillis", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/field/ImpreciseDateTimeField$LinkedDurationField");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DateTimeFieldType", "getDurationType", "()Lorg/joda/time/DurationFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/ImpreciseDateTimeField$LinkedDurationField", "<init>", "(Lorg/joda/time/field/ImpreciseDateTimeField;Lorg/joda/time/DurationFieldType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/field/ImpreciseDateTimeField", "iDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(J)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(JI)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(JI)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(JJ)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDifference", "(JJ)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/field/ImpreciseDateTimeField", "getDifferenceAsLong", "(JJ)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/field/FieldUtils", "safeToInt", "(J)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDifferenceAsLong", "(JJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/field/ImpreciseDateTimeField", "getDifferenceAsLong", "(JJ)J", false);
methodVisitor.visitInsn(LNEG);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/field/ImpreciseDateTimeField", "iUnitMillis", "J");
methodVisitor.visitInsn(LDIV);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/field/ImpreciseDateTimeField", "add", "(JJ)J", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/field/ImpreciseDateTimeField", "add", "(JJ)J", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/field/ImpreciseDateTimeField", "add", "(JJ)J", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/field/ImpreciseDateTimeField", "add", "(JJ)J", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFGT, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getDurationField", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/field/ImpreciseDateTimeField", "iDurationField", "Lorg/joda/time/DurationField;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRangeDurationField", "()Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "roundFloor", "(J)J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "getDurationUnitMillis", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/field/ImpreciseDateTimeField", "iUnitMillis", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
