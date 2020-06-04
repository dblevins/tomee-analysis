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
public class BasicChronology$HalfdayFieldDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/joda/time/chrono/BasicChronology$HalfdayField", null, "org/joda/time/field/PreciseDateTimeField", null);

classWriter.visitInnerClass("org/joda/time/chrono/BasicChronology$HalfdayField", "org/joda/time/chrono/BasicChronology", "HalfdayField", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(581601443656929254L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/DateTimeFieldType", "halfdayOfDay", "()Lorg/joda/time/DateTimeFieldType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/BasicChronology", "access$000", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/BasicChronology", "access$100", "()Lorg/joda/time/DurationField;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/field/PreciseDateTimeField", "<init>", "(Lorg/joda/time/DateTimeFieldType;Lorg/joda/time/DurationField;Lorg/joda/time/DurationField;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAsText", "(ILjava/util/Locale;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/GJLocaleSymbols", "forLocale", "(Ljava/util/Locale;)Lorg/joda/time/chrono/GJLocaleSymbols;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/GJLocaleSymbols", "halfdayValueToText", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(JLjava/lang/String;Ljava/util/Locale;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/GJLocaleSymbols", "forLocale", "(Ljava/util/Locale;)Lorg/joda/time/chrono/GJLocaleSymbols;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/GJLocaleSymbols", "halfdayTextToValue", "(Ljava/lang/String;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/BasicChronology$HalfdayField", "set", "(JI)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaximumTextLength", "(Ljava/util/Locale;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/joda/time/chrono/GJLocaleSymbols", "forLocale", "(Ljava/util/Locale;)Lorg/joda/time/chrono/GJLocaleSymbols;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/chrono/GJLocaleSymbols", "getHalfdayMaxTextLength", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
