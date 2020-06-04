package asm.org.eclipse.microprofile.metrics;
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
public class MetricRegistry$TypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "Ljava/lang/Enum<Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/microprofile/metrics/MetricRegistry$Type", "org/eclipse/microprofile/metrics/MetricRegistry", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPLICATION", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BASE", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VENDOR", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "$VALUES", "[Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/metrics/MetricRegistry$Type");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricRegistry$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPLICATION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("application");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "APPLICATION", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricRegistry$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BASE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("base");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "BASE", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/metrics/MetricRegistry$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VENDOR");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("vendor");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "VENDOR", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/microprofile/metrics/MetricRegistry$Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "APPLICATION", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "BASE", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "VENDOR", "Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/metrics/MetricRegistry$Type", "$VALUES", "[Lorg/eclipse/microprofile/metrics/MetricRegistry$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
