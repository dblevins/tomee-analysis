package asm.jakarta.batch.runtime;
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

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/batch/runtime/Metric$MetricType", "Ljava/lang/Enum<Ljakarta/batch/runtime/Metric$MetricType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/batch/runtime/Metric$MetricType", "jakarta/batch/runtime/Metric", "MetricType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMIT_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ROLLBACK_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROCESS_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FILTER_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITE_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/batch/runtime/Metric$MetricType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/batch/runtime/Metric$MetricType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "$VALUES", "[Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/batch/runtime/Metric$MetricType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/batch/runtime/Metric$MetricType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/batch/runtime/Metric$MetricType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/batch/runtime/Metric$MetricType");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_COUNT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "READ_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_COUNT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "WRITE_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMIT_COUNT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "COMMIT_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ROLLBACK_COUNT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "ROLLBACK_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_SKIP_COUNT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "READ_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROCESS_SKIP_COUNT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "PROCESS_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FILTER_COUNT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "FILTER_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITE_SKIP_COUNT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/batch/runtime/Metric$MetricType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "WRITE_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/batch/runtime/Metric$MetricType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "READ_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "WRITE_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "COMMIT_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "ROLLBACK_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "READ_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "PROCESS_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "FILTER_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/batch/runtime/Metric$MetricType", "WRITE_SKIP_COUNT", "Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/batch/runtime/Metric$MetricType", "$VALUES", "[Ljakarta/batch/runtime/Metric$MetricType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
