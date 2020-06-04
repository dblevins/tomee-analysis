package asm.javax.ws.rs.core;
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
public class Response$Status$FamilyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/ws/rs/core/Response$Status$Family", "Ljava/lang/Enum<Ljavax/ws/rs/core/Response$Status$Family;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/ws/rs/core/Response$Status", "javax/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/ws/rs/core/Response$Status$Family", "javax/ws/rs/core/Response$Status", "Family", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INFORMATIONAL", "Ljavax/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUCCESSFUL", "Ljavax/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REDIRECTION", "Ljavax/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLIENT_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OTHER", "Ljavax/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/ws/rs/core/Response$Status$Family;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "$VALUES", "[Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/ws/rs/core/Response$Status$Family;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/ws/rs/core/Response$Status$Family;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Response$Status$Family;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ws/rs/core/Response$Status$Family");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "familyOf", "(I)Ljavax/ws/rs/core/Response$Status$Family;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitInsn(IDIV);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTableSwitchInsn(1, 5, label5, new Label[] { label0, label1, label2, label3, label4 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "INFORMATIONAL", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SUCCESSFUL", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "REDIRECTION", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "CLIENT_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "OTHER", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/core/Response$Status$Family");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INFORMATIONAL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/core/Response$Status$Family", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/ws/rs/core/Response$Status$Family", "INFORMATIONAL", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/core/Response$Status$Family");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUCCESSFUL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/core/Response$Status$Family", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/ws/rs/core/Response$Status$Family", "SUCCESSFUL", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/core/Response$Status$Family");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REDIRECTION");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/core/Response$Status$Family", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/ws/rs/core/Response$Status$Family", "REDIRECTION", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/core/Response$Status$Family");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLIENT_ERROR");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/core/Response$Status$Family", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/ws/rs/core/Response$Status$Family", "CLIENT_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/core/Response$Status$Family");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVER_ERROR");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/core/Response$Status$Family", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitTypeInsn(NEW, "javax/ws/rs/core/Response$Status$Family");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OTHER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/core/Response$Status$Family", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/ws/rs/core/Response$Status$Family", "OTHER", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/ws/rs/core/Response$Status$Family");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "INFORMATIONAL", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SUCCESSFUL", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "REDIRECTION", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "CLIENT_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "OTHER", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/ws/rs/core/Response$Status$Family", "$VALUES", "[Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
