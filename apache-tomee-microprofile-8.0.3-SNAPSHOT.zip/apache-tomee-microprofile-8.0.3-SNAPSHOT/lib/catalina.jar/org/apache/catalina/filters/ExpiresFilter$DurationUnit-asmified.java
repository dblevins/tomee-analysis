package asm.org.apache.catalina.filters;
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
public class ExpiresFilter$DurationUnitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "Ljava/lang/Enum<Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/catalina/filters/ExpiresFilter$DurationUnit", "org/apache/catalina/filters/ExpiresFilter", "DurationUnit", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DAY", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOUR", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MINUTE", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MONTH", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SECOND", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WEEK", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "YEAR", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "calendarField", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "$VALUES", "[Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "calendarField", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCalendardField", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "calendarField", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DAY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "DAY", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOUR");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "HOUR", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MINUTE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "MINUTE", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MONTH");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "MONTH", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SECOND");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "SECOND", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WEEK");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "WEEK", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("YEAR");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "YEAR", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/filters/ExpiresFilter$DurationUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "DAY", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "HOUR", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "MINUTE", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "MONTH", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "SECOND", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "WEEK", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "YEAR", "Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/ExpiresFilter$DurationUnit", "$VALUES", "[Lorg/apache/catalina/filters/ExpiresFilter$DurationUnit;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
