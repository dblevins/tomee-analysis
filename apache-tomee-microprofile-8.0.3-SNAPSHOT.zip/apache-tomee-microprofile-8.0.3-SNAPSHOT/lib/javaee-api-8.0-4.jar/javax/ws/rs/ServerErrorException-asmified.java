package asm.javax.ws.rs;
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
public class ServerErrorExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/ws/rs/ServerErrorException", null, "javax/ws/rs/WebApplicationException", null);

classWriter.visitInnerClass("javax/ws/rs/core/Response$Status", "javax/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/ws/rs/core/Response$ResponseBuilder", "javax/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("javax/ws/rs/core/Response$Status$Family", "javax/ws/rs/core/Response$Status", "Family", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(4730895276505569556L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/ws/rs/core/Response$Status;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(Ljavax/ws/rs/core/Response$Status;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljavax/ws/rs/core/Response$Status;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(Ljavax/ws/rs/core/Response$Status;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Throwable");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(I)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(I)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljavax/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/ws/rs/core/Response$Status;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(Ljavax/ws/rs/core/Response$Status;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljavax/ws/rs/core/Response$Status;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(Ljavax/ws/rs/core/Response$Status;)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ILjava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(I)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;ILjava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/core/Response", "status", "(I)Ljavax/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/ws/rs/core/Response$ResponseBuilder", "build", "()Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljavax/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljavax/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/ws/rs/ServerErrorException", "validate", "(Ljavax/ws/rs/core/Response;Ljavax/ws/rs/core/Response$Status$Family;)Ljavax/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljavax/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
