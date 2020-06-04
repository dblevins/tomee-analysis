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
public class NotAllowedExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/ws/rs/NotAllowedException", null, "jakarta/ws/rs/ClientErrorException", null);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status", "jakarta/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$ResponseBuilder", "jakarta/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-586776054369626119L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "createNotAllowedResponse", "(Ljava/lang/String;[Ljava/lang/String;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validateAllow", "(Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "createNotAllowedResponse", "(Ljava/lang/String;[Ljava/lang/String;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validateAllow", "(Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_VARARGS, "createNotAllowedResponse", "(Ljava/lang/String;[Ljava/lang/String;)Ljakarta/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No allowed method specified.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "addAll", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singleton", "(Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Set"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "allow", "(Ljava/util/Set;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;)V", false);
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
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/Throwable;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "allow", "([Ljava/lang/String;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validateAllow", "(Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response", "status", "(Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "allow", "([Ljava/lang/String;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validateAllow", "(Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validateAllow", "(Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
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
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validate", "(Ljakarta/ws/rs/core/Response;Ljakarta/ws/rs/core/Response$Status;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/NotAllowedException", "validateAllow", "(Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/ClientErrorException", "<init>", "(Ljava/lang/String;Ljakarta/ws/rs/core/Response;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "validateAllow", "(Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response", "getHeaders", "()Ljakarta/ws/rs/core/MultivaluedMap;", false);
methodVisitor.visitLdcInsn("Allow");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/MultivaluedMap", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Response does not contain required 'Allow' HTTP header.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
