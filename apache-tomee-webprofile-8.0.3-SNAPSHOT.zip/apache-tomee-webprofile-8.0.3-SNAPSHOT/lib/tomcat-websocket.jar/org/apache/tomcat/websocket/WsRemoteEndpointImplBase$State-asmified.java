package asm.org.apache.tomcat.websocket;
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
public class WsRemoteEndpointImplBase$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "Ljava/lang/Enum<Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "State", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STREAM_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRITER_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINARY_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINARY_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BINARY_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEXT_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEXT_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEXT_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "$VALUES", "[Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPEN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STREAM_WRITING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "STREAM_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRITER_WRITING");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "WRITER_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARY_PARTIAL_WRITING");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARY_PARTIAL_READY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BINARY_FULL_WRITING");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEXT_PARTIAL_WRITING");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEXT_PARTIAL_READY");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEXT_FULL_WRITING");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "OPEN", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "STREAM_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "WRITER_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "BINARY_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_PARTIAL_READY", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "TEXT_FULL_WRITING", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase$State", "$VALUES", "[Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
