package asm.jakarta.ws.rs.core;
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
public class Response$StatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/ws/rs/core/Response$Status", "Ljava/lang/Enum<Ljakarta/ws/rs/core/Response$Status;>;Ljakarta/ws/rs/core/Response$StatusType;", "java/lang/Enum", new String[] { "jakarta/ws/rs/core/Response$StatusType" });

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status", "jakarta/ws/rs/core/Response", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$Status$Family", "jakarta/ws/rs/core/Response$Status", "Family", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$StatusType", "jakarta/ws/rs/core/Response", "StatusType", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OK", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CREATED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCEPTED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NO_CONTENT", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESET_CONTENT", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PARTIAL_CONTENT", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MOVED_PERMANENTLY", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FOUND", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SEE_OTHER", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_MODIFIED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USE_PROXY", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEMPORARY_REDIRECT", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BAD_REQUEST", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNAUTHORIZED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PAYMENT_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FORBIDDEN", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_FOUND", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_ACCEPTABLE", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROXY_AUTHENTICATION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST_TIMEOUT", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONFLICT", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GONE", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LENGTH_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRECONDITION_FAILED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST_ENTITY_TOO_LARGE", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST_URI_TOO_LONG", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSUPPORTED_MEDIA_TYPE", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUESTED_RANGE_NOT_SATISFIABLE", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXPECTATION_FAILED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRECONDITION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOO_MANY_REQUESTS", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST_HEADER_FIELDS_TOO_LARGE", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_IMPLEMENTED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BAD_GATEWAY", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GATEWAY_TIMEOUT", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HTTP_VERSION_NOT_SUPPORTED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NETWORK_AUTHENTICATION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "code", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "reason", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "family", "Ljakarta/ws/rs/core/Response$Status$Family;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/ws/rs/core/Response$Status;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/ws/rs/core/Response$Status;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "$VALUES", "[Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/ws/rs/core/Response$Status;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/ws/rs/core/Response$Status;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ws/rs/core/Response$Status;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "(ILjava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/ws/rs/core/Response$Status", "code", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/ws/rs/core/Response$Status", "reason", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response$Status$Family", "familyOf", "(I)Ljakarta/ws/rs/core/Response$Status$Family;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/ws/rs/core/Response$Status", "family", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFamily", "()Ljakarta/ws/rs/core/Response$Status$Family;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/ws/rs/core/Response$Status", "family", "Ljakarta/ws/rs/core/Response$Status$Family;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatusCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/ws/rs/core/Response$Status", "code", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReasonPhrase", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$Status", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/ws/rs/core/Response$Status", "reason", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromStatusCode", "(I)Ljakarta/ws/rs/core/Response$Status;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/ws/rs/core/Response$Status", "values", "()[Ljakarta/ws/rs/core/Response$Status;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljakarta/ws/rs/core/Response$Status;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/ws/rs/core/Response$Status", "code", "I");
methodVisitor.visitVarInsn(ILOAD, 0);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OK");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(SIPUSH, 200);
methodVisitor.visitLdcInsn("OK");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "OK", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CREATED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitLdcInsn("Created");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "CREATED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCEPTED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(SIPUSH, 202);
methodVisitor.visitLdcInsn("Accepted");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "ACCEPTED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_CONTENT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(SIPUSH, 204);
methodVisitor.visitLdcInsn("No Content");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "NO_CONTENT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESET_CONTENT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(SIPUSH, 205);
methodVisitor.visitLdcInsn("Reset Content");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "RESET_CONTENT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARTIAL_CONTENT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(SIPUSH, 206);
methodVisitor.visitLdcInsn("Partial Content");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "PARTIAL_CONTENT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MOVED_PERMANENTLY");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(SIPUSH, 301);
methodVisitor.visitLdcInsn("Moved Permanently");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "MOVED_PERMANENTLY", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FOUND");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(SIPUSH, 302);
methodVisitor.visitLdcInsn("Found");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "FOUND", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEE_OTHER");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(SIPUSH, 303);
methodVisitor.visitLdcInsn("See Other");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "SEE_OTHER", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_MODIFIED");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(SIPUSH, 304);
methodVisitor.visitLdcInsn("Not Modified");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_MODIFIED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USE_PROXY");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(SIPUSH, 305);
methodVisitor.visitLdcInsn("Use Proxy");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "USE_PROXY", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEMPORARY_REDIRECT");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(SIPUSH, 307);
methodVisitor.visitLdcInsn("Temporary Redirect");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "TEMPORARY_REDIRECT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BAD_REQUEST");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(SIPUSH, 400);
methodVisitor.visitLdcInsn("Bad Request");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "BAD_REQUEST", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNAUTHORIZED");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(SIPUSH, 401);
methodVisitor.visitLdcInsn("Unauthorized");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "UNAUTHORIZED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PAYMENT_REQUIRED");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(SIPUSH, 402);
methodVisitor.visitLdcInsn("Payment Required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "PAYMENT_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FORBIDDEN");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(SIPUSH, 403);
methodVisitor.visitLdcInsn("Forbidden");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "FORBIDDEN", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_FOUND");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(SIPUSH, 404);
methodVisitor.visitLdcInsn("Not Found");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_FOUND", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("METHOD_NOT_ALLOWED");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitIntInsn(SIPUSH, 405);
methodVisitor.visitLdcInsn("Method Not Allowed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_ACCEPTABLE");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitIntInsn(SIPUSH, 406);
methodVisitor.visitLdcInsn("Not Acceptable");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_ACCEPTABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROXY_AUTHENTICATION_REQUIRED");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitIntInsn(SIPUSH, 407);
methodVisitor.visitLdcInsn("Proxy Authentication Required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "PROXY_AUTHENTICATION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST_TIMEOUT");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitIntInsn(SIPUSH, 408);
methodVisitor.visitLdcInsn("Request Timeout");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_TIMEOUT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONFLICT");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitIntInsn(SIPUSH, 409);
methodVisitor.visitLdcInsn("Conflict");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "CONFLICT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GONE");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitIntInsn(SIPUSH, 410);
methodVisitor.visitLdcInsn("Gone");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "GONE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LENGTH_REQUIRED");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitIntInsn(SIPUSH, 411);
methodVisitor.visitLdcInsn("Length Required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "LENGTH_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRECONDITION_FAILED");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitIntInsn(SIPUSH, 412);
methodVisitor.visitLdcInsn("Precondition Failed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "PRECONDITION_FAILED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST_ENTITY_TOO_LARGE");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitIntInsn(SIPUSH, 413);
methodVisitor.visitLdcInsn("Request Entity Too Large");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_ENTITY_TOO_LARGE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST_URI_TOO_LONG");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitIntInsn(SIPUSH, 414);
methodVisitor.visitLdcInsn("Request-URI Too Long");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_URI_TOO_LONG", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_MEDIA_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitIntInsn(SIPUSH, 415);
methodVisitor.visitLdcInsn("Unsupported Media Type");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "UNSUPPORTED_MEDIA_TYPE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUESTED_RANGE_NOT_SATISFIABLE");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitIntInsn(SIPUSH, 416);
methodVisitor.visitLdcInsn("Requested Range Not Satisfiable");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUESTED_RANGE_NOT_SATISFIABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXPECTATION_FAILED");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitIntInsn(SIPUSH, 417);
methodVisitor.visitLdcInsn("Expectation Failed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "EXPECTATION_FAILED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRECONDITION_REQUIRED");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitIntInsn(SIPUSH, 428);
methodVisitor.visitLdcInsn("Precondition Required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "PRECONDITION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOO_MANY_REQUESTS");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitIntInsn(SIPUSH, 429);
methodVisitor.visitLdcInsn("Too Many Requests");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "TOO_MANY_REQUESTS", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST_HEADER_FIELDS_TOO_LARGE");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitIntInsn(SIPUSH, 431);
methodVisitor.visitLdcInsn("Request Header Fields Too Large");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_HEADER_FIELDS_TOO_LARGE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTERNAL_SERVER_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitIntInsn(SIPUSH, 500);
methodVisitor.visitLdcInsn("Internal Server Error");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_IMPLEMENTED");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitIntInsn(SIPUSH, 501);
methodVisitor.visitLdcInsn("Not Implemented");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_IMPLEMENTED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BAD_GATEWAY");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitIntInsn(SIPUSH, 502);
methodVisitor.visitLdcInsn("Bad Gateway");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "BAD_GATEWAY", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICE_UNAVAILABLE");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitIntInsn(SIPUSH, 503);
methodVisitor.visitLdcInsn("Service Unavailable");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GATEWAY_TIMEOUT");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitIntInsn(SIPUSH, 504);
methodVisitor.visitLdcInsn("Gateway Timeout");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "GATEWAY_TIMEOUT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HTTP_VERSION_NOT_SUPPORTED");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitIntInsn(SIPUSH, 505);
methodVisitor.visitLdcInsn("HTTP Version Not Supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "HTTP_VERSION_NOT_SUPPORTED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitTypeInsn(NEW, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NETWORK_AUTHENTICATION_REQUIRED");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitIntInsn(SIPUSH, 511);
methodVisitor.visitLdcInsn("Network Authentication Required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/ws/rs/core/Response$Status", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "NETWORK_AUTHENTICATION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/ws/rs/core/Response$Status");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "OK", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "CREATED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "ACCEPTED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "NO_CONTENT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "RESET_CONTENT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "PARTIAL_CONTENT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "MOVED_PERMANENTLY", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "FOUND", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SEE_OTHER", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_MODIFIED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "USE_PROXY", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "TEMPORARY_REDIRECT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "BAD_REQUEST", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "UNAUTHORIZED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "PAYMENT_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "FORBIDDEN", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_FOUND", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "METHOD_NOT_ALLOWED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_ACCEPTABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "PROXY_AUTHENTICATION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_TIMEOUT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "CONFLICT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "GONE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "LENGTH_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "PRECONDITION_FAILED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_ENTITY_TOO_LARGE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_URI_TOO_LONG", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "UNSUPPORTED_MEDIA_TYPE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUESTED_RANGE_NOT_SATISFIABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "EXPECTATION_FAILED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "PRECONDITION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "TOO_MANY_REQUESTS", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "REQUEST_HEADER_FIELDS_TOO_LARGE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "INTERNAL_SERVER_ERROR", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "NOT_IMPLEMENTED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "BAD_GATEWAY", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "SERVICE_UNAVAILABLE", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "GATEWAY_TIMEOUT", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "HTTP_VERSION_NOT_SUPPORTED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/ws/rs/core/Response$Status", "NETWORK_AUTHENTICATION_REQUIRED", "Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/ws/rs/core/Response$Status", "$VALUES", "[Ljakarta/ws/rs/core/Response$Status;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
