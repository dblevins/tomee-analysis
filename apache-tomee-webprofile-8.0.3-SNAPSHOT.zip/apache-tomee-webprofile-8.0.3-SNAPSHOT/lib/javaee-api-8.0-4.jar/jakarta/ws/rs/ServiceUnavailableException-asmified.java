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
public class ServiceUnavailableExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/ws/rs/ServiceUnavailableException", null, "jakarta/ws/rs/ServerErrorException", null);

classWriter.visitInnerClass("jakarta/ws/rs/ext/RuntimeDelegate$HeaderDelegate", "jakarta/ws/rs/ext/RuntimeDelegate", "HeaderDelegate", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status", "jakarta/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$ResponseBuilder", "jakarta/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(3821068205617492633L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Long;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Date;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServiceUnavailableException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
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
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServiceUnavailableException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Date;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Long;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServiceUnavailableException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
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
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ServiceUnavailableException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ServerErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasRetryAfter", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/ServiceUnavailableException", "getResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response", "getHeaders", "()Ljakarta/ws/rs/core/MultivaluedMap;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/MultivaluedMap", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRetryTime", "(Ljava/util/Date;)Ljava/util/Date;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NumberFormatException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/ServiceUnavailableException", "getResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitLdcInsn("Retry-After");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response", "getHeaderString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "parseLong", "(Ljava/lang/String;)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/Date");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "getTime", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitLdcInsn(new Long(1000L));
methodVisitor.visitInsn(LMUL);
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Date", "<init>", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NumberFormatException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/ext/RuntimeDelegate", "getInstance", "()Ljakarta/ws/rs/ext/RuntimeDelegate;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Date;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/ext/RuntimeDelegate", "createHeaderDelegate", "(Ljava/lang/Class;)Ljakarta/ws/rs/ext/RuntimeDelegate$HeaderDelegate;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/ext/RuntimeDelegate$HeaderDelegate", "fromString", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Date");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
