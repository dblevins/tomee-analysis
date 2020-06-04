package asm.org.opensaml.core.metrics;
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
public class LoggerDrivenMetricFilter$LevelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "Ljava/lang/Enum<Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "org/opensaml/core/metrics/LoggerDrivenMetricFilter", "Level", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRACE", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEBUG", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INFO", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WARN", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ERROR", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "$VALUES", "[Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level");
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
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "TRACE", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEBUG");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "DEBUG", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INFO");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "INFO", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WARN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "WARN", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ERROR");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "ERROR", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "TRACE", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "DEBUG", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "INFO", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "WARN", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "ERROR", "Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/core/metrics/LoggerDrivenMetricFilter$Level", "$VALUES", "[Lorg/opensaml/core/metrics/LoggerDrivenMetricFilter$Level;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
