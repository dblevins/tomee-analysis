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
public class DurationFieldTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/joda/time/DurationFieldType", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/joda/time/DurationFieldType$StandardDurationFieldType", "org/joda/time/DurationFieldType", "StandardDurationFieldType", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(8765135187319L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ERAS", "B", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CENTURIES", "B", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEKYEARS", "B", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "YEARS", "B", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MONTHS", "B", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEKS", "B", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAYS", "B", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HALFDAYS", "B", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HOURS", "B", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MINUTES", "B", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SECONDS", "B", null, new Integer(11));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MILLIS", "B", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "ERAS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "CENTURIES_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEKYEARS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "YEARS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MONTHS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "WEEKS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DAYS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HALFDAYS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "HOURS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MINUTES_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "SECONDS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "MILLIS_TYPE", "Lorg/joda/time/DurationFieldType;", null, null);
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/joda/time/DurationFieldType", "iName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "millis", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "MILLIS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "seconds", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "SECONDS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "minutes", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "MINUTES_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hours", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "HOURS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "halfdays", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "HALFDAYS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "days", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "DAYS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "weeks", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "WEEKS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "weekyears", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "WEEKYEARS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "months", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "MONTHS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "years", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "YEARS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "centuries", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "CENTURIES_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "eras", "()Lorg/joda/time/DurationFieldType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/joda/time/DurationFieldType", "ERAS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/joda/time/DurationFieldType", "iName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getField", "(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSupported", "(Lorg/joda/time/Chronology;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationFieldType", "getField", "(Lorg/joda/time/Chronology;)Lorg/joda/time/DurationField;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationField", "isSupported", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/joda/time/DurationFieldType", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("eras");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "ERAS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("centuries");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "CENTURIES_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("weekyears");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "WEEKYEARS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("years");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "YEARS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("months");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "MONTHS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("weeks");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "WEEKS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("days");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "DAYS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("halfdays");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "HALFDAYS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("hours");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "HOURS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("minutes");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "MINUTES_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("seconds");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "SECONDS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DurationFieldType$StandardDurationFieldType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("millis");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DurationFieldType$StandardDurationFieldType", "<init>", "(Ljava/lang/String;B)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/joda/time/DurationFieldType", "MILLIS_TYPE", "Lorg/joda/time/DurationFieldType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
