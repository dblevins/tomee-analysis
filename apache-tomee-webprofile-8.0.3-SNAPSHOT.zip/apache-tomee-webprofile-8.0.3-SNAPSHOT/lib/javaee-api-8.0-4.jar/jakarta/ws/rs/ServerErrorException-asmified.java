package asm.jakarta.ws.rs;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/ws/rs/ServerErrorException", null, "jakarta/ws/rs/WebApplicationException", null);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status", "jakarta/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$ResponseBuilder", "jakarta/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status$Family", "jakarta/ws/rs/core/Response$Status", "Family", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(4730895276505569556L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response$Status;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response$Status;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(I)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(I)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response$Status;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response$Status;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(I)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(I)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status$Family", "SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status$Family;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/WebApplicationException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
