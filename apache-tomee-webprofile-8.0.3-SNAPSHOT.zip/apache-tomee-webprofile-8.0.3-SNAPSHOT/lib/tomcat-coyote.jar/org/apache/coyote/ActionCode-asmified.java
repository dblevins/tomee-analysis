package asm.org.apache.coyote;
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
public class ActionCodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/coyote/ActionCode", "Ljava/lang/Enum<Lorg/apache/coyote/ActionCode;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACK", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMIT", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSE_NOW", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLIENT_FLUSH", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IS_ERROR", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IS_IO_ALLOWED", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISABLE_SWALLOW_INPUT", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_HOST_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_HOST_ADDR_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_SSL_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_SSL_CERTIFICATE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_REMOTEPORT_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_LOCALPORT_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_LOCAL_ADDR_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_LOCAL_NAME_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQ_SET_BODY_REPLAY", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AVAILABLE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_START", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_DISPATCH", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_DISPATCHED", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_RUN", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_COMPLETE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_TIMEOUT", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_ERROR", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_SETTIMEOUT", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_IS_ASYNC", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_IS_STARTED", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_IS_COMPLETING", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_IS_DISPATCHING", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_IS_TIMINGOUT", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_IS_ERROR", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASYNC_POST_PROCESS", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UPGRADE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NB_READ_INTEREST", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NB_WRITE_INTEREST", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST_BODY_FULLY_READ", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISPATCH_READ", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISPATCH_WRITE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISPATCH_EXECUTE", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IS_PUSH_SUPPORTED", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PUSH_REQUEST", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IS_TRAILER_FIELDS_READY", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IS_TRAILER_FIELDS_SUPPORTED", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONNECTION_ID", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STREAM_ID", "Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/coyote/ActionCode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/coyote/ActionCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "$VALUES", "[Lorg/apache/coyote/ActionCode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/coyote/ActionCode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/coyote/ActionCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/coyote/ActionCode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/ActionCode");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACK");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ACK", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "CLOSE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMIT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "COMMIT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSE_NOW");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "CLOSE_NOW", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLIENT_FLUSH");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "CLIENT_FLUSH", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IS_ERROR");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "IS_ERROR", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IS_IO_ALLOWED");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "IS_IO_ALLOWED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISABLE_SWALLOW_INPUT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "DISABLE_SWALLOW_INPUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_HOST_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_HOST_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_HOST_ADDR_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_HOST_ADDR_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_SSL_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_SSL_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_SSL_CERTIFICATE");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_SSL_CERTIFICATE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_REMOTEPORT_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_REMOTEPORT_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_LOCALPORT_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_LOCALPORT_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_LOCAL_ADDR_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_LOCAL_ADDR_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_LOCAL_NAME_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_LOCAL_NAME_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQ_SET_BODY_REPLAY");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQ_SET_BODY_REPLAY", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AVAILABLE");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "AVAILABLE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_START");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_START", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_DISPATCH");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_DISPATCH", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_DISPATCHED");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_DISPATCHED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_RUN");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_RUN", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_COMPLETE");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_COMPLETE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_TIMEOUT");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_TIMEOUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_ERROR", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_SETTIMEOUT");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_SETTIMEOUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_IS_ASYNC");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_ASYNC", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_IS_STARTED");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_STARTED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_IS_COMPLETING");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_COMPLETING", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_IS_DISPATCHING");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_DISPATCHING", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_IS_TIMINGOUT");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_TIMINGOUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_IS_ERROR");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_ERROR", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASYNC_POST_PROCESS");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "ASYNC_POST_PROCESS", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UPGRADE");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "UPGRADE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NB_READ_INTEREST");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "NB_READ_INTEREST", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NB_WRITE_INTEREST");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "NB_WRITE_INTEREST", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST_BODY_FULLY_READ");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "REQUEST_BODY_FULLY_READ", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISPATCH_READ");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "DISPATCH_READ", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISPATCH_WRITE");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "DISPATCH_WRITE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISPATCH_EXECUTE");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "DISPATCH_EXECUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IS_PUSH_SUPPORTED");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "IS_PUSH_SUPPORTED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PUSH_REQUEST");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "PUSH_REQUEST", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IS_TRAILER_FIELDS_READY");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "IS_TRAILER_FIELDS_READY", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IS_TRAILER_FIELDS_SUPPORTED");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "IS_TRAILER_FIELDS_SUPPORTED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONNECTION_ID");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "CONNECTION_ID", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STREAM_ID");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/coyote/ActionCode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "STREAM_ID", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/coyote/ActionCode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ACK", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "CLOSE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "COMMIT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "CLOSE_NOW", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "CLIENT_FLUSH", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "IS_ERROR", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "IS_IO_ALLOWED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "DISABLE_SWALLOW_INPUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_HOST_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_HOST_ADDR_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_SSL_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_SSL_CERTIFICATE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_REMOTEPORT_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_LOCALPORT_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_LOCAL_ADDR_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_LOCAL_NAME_ATTRIBUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQ_SET_BODY_REPLAY", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "AVAILABLE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_START", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_DISPATCH", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_DISPATCHED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_RUN", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_COMPLETE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_TIMEOUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_ERROR", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_SETTIMEOUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_ASYNC", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_STARTED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_COMPLETING", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_DISPATCHING", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_TIMINGOUT", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_IS_ERROR", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "ASYNC_POST_PROCESS", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "UPGRADE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "NB_READ_INTEREST", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "NB_WRITE_INTEREST", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "REQUEST_BODY_FULLY_READ", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "DISPATCH_READ", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "DISPATCH_WRITE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "DISPATCH_EXECUTE", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "IS_PUSH_SUPPORTED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "PUSH_REQUEST", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "IS_TRAILER_FIELDS_READY", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "IS_TRAILER_FIELDS_SUPPORTED", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "CONNECTION_ID", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/coyote/ActionCode", "STREAM_ID", "Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/ActionCode", "$VALUES", "[Lorg/apache/coyote/ActionCode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
