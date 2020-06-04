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
public class BatchStatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/batch/runtime/BatchStatus", "Ljava/lang/Enum<Ljavax/batch/runtime/BatchStatus;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTING", "Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTED", "Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOPPING", "Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOPPED", "Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FAILED", "Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMPLETED", "Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ABANDONED", "Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/batch/runtime/BatchStatus;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/batch/runtime/BatchStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "$VALUES", "[Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/batch/runtime/BatchStatus;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/batch/runtime/BatchStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/batch/runtime/BatchStatus;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/batch/runtime/BatchStatus");
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
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTING");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/BatchStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "STARTING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/BatchStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "STARTED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOPPING");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/BatchStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "STOPPING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOPPED");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/BatchStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "STOPPED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FAILED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/BatchStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "FAILED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMPLETED");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/BatchStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "COMPLETED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitTypeInsn(NEW, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ABANDONED");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/batch/runtime/BatchStatus", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "ABANDONED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/batch/runtime/BatchStatus");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STARTING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STARTED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STOPPING", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "STOPPED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "FAILED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "COMPLETED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/batch/runtime/BatchStatus", "ABANDONED", "Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/batch/runtime/BatchStatus", "$VALUES", "[Ljavax/batch/runtime/BatchStatus;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
