package asm.javax.enterprise.event;
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
public class TransactionPhaseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/enterprise/event/TransactionPhase", "Ljava/lang/Enum<Ljavax/enterprise/event/TransactionPhase;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN_PROGRESS", "Ljavax/enterprise/event/TransactionPhase;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BEFORE_COMPLETION", "Ljavax/enterprise/event/TransactionPhase;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AFTER_COMPLETION", "Ljavax/enterprise/event/TransactionPhase;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AFTER_FAILURE", "Ljavax/enterprise/event/TransactionPhase;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AFTER_SUCCESS", "Ljavax/enterprise/event/TransactionPhase;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/enterprise/event/TransactionPhase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/enterprise/event/TransactionPhase;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/event/TransactionPhase", "$VALUES", "[Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/enterprise/event/TransactionPhase;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/enterprise/event/TransactionPhase;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/event/TransactionPhase;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/event/TransactionPhase");
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
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/event/TransactionPhase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN_PROGRESS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/event/TransactionPhase", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/enterprise/event/TransactionPhase", "IN_PROGRESS", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/event/TransactionPhase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BEFORE_COMPLETION");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/event/TransactionPhase", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/enterprise/event/TransactionPhase", "BEFORE_COMPLETION", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/event/TransactionPhase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AFTER_COMPLETION");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/event/TransactionPhase", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/enterprise/event/TransactionPhase", "AFTER_COMPLETION", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/event/TransactionPhase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AFTER_FAILURE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/event/TransactionPhase", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/enterprise/event/TransactionPhase", "AFTER_FAILURE", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/event/TransactionPhase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AFTER_SUCCESS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/event/TransactionPhase", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/enterprise/event/TransactionPhase", "AFTER_SUCCESS", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/enterprise/event/TransactionPhase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/event/TransactionPhase", "IN_PROGRESS", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/event/TransactionPhase", "BEFORE_COMPLETION", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/event/TransactionPhase", "AFTER_COMPLETION", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/event/TransactionPhase", "AFTER_FAILURE", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/enterprise/event/TransactionPhase", "AFTER_SUCCESS", "Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/enterprise/event/TransactionPhase", "$VALUES", "[Ljavax/enterprise/event/TransactionPhase;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
