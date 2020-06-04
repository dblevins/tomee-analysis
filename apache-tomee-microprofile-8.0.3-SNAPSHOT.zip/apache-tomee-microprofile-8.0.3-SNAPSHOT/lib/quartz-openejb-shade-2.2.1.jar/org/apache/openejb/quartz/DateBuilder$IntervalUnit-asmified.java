package asm.org.apache.openejb.quartz;
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
public class DateBuilder$IntervalUnitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "Ljava/lang/Enum<Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/DateBuilder$IntervalUnit", "org/apache/openejb/quartz/DateBuilder", "IntervalUnit", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MILLISECOND", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SECOND", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MINUTE", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOUR", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DAY", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WEEK", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MONTH", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "YEAR", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "$VALUES", "[Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MILLISECOND");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "MILLISECOND", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SECOND");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "SECOND", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MINUTE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "MINUTE", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOUR");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "HOUR", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DAY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "DAY", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WEEK");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "WEEK", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MONTH");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "MONTH", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("YEAR");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "YEAR", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/quartz/DateBuilder$IntervalUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "MILLISECOND", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "SECOND", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "MINUTE", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "HOUR", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "DAY", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "WEEK", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "MONTH", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "YEAR", "Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/DateBuilder$IntervalUnit", "$VALUES", "[Lorg/apache/openejb/quartz/DateBuilder$IntervalUnit;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
