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
public class WsFrameBase$ReadStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "Ljava/lang/Enum<Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomcat/websocket/WsFrameBase$ReadState", "org/apache/tomcat/websocket/WsFrameBase", "ReadState", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WAITING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROCESSING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUSPENDING_WAIT", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUSPENDING_PROCESS", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUSPENDED", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLOSING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "isSuspended", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "$VALUES", "[Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZ)V", "(Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "isSuspended", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSuspended", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "isSuspended", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WAITING");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "WAITING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROCESSING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "PROCESSING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUSPENDING_WAIT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDING_WAIT", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUSPENDING_PROCESS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDING_PROCESS", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUSPENDED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDED", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLOSING");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "CLOSING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomcat/websocket/WsFrameBase$ReadState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "WAITING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "PROCESSING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDING_WAIT", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDING_PROCESS", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "SUSPENDED", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "CLOSING", "Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/WsFrameBase$ReadState", "$VALUES", "[Lorg/apache/tomcat/websocket/WsFrameBase$ReadState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
