package asm.javax.batch.runtime;
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
public class Metric$MetricTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/batch/runtime/Metric$MetricType", "Ljava/lang/Enum<Ljavax/batch/runtime/Metric$MetricType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/batch/runtime/Metric$MetricType", "javax/batch/runtime/Metric", "MetricType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMIT_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ROLLBACK_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROCESS_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FILTER_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/batch/runtime/Metric$MetricType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "$VALUES", "[Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/batch/runtime/Metric$MetricType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/batch/runtime/Metric$MetricType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/batch/runtime/Metric$MetricType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/batch/runtime/Metric$MetricType");
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
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_COUNT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "READ_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_COUNT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "WRITE_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMIT_COUNT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "COMMIT_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ROLLBACK_COUNT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "ROLLBACK_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_SKIP_COUNT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "READ_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROCESS_SKIP_COUNT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "PROCESS_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FILTER_COUNT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "FILTER_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_SKIP_COUNT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "WRITE_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "READ_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "WRITE_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "COMMIT_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "ROLLBACK_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "READ_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "PROCESS_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "FILTER_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/Metric$MetricType", "WRITE_SKIP_COUNT", "Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/Metric$MetricType", "$VALUES", "[Ljavax/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
