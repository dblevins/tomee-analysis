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
public class InternalServerErrorExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/ws/rs/InternalServerErrorException", null, "jakarta/ws/rs/ServerErrorException", null);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status", "jakarta/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-6515710697540553309L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response$Status;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response$Status;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/InternalServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/InternalServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response$Status;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response$Status;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/InternalServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/InternalServerErrorException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
