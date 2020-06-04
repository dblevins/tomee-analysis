package asm.org.apache.tomcat.util.net;
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
public class SecureNio2Channel$HandshakeReadCompletionHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "Ljava/lang/Object;Ljava/nio/channels/CompletionHandler<Ljava/lang/Integer;Lorg/apache/tomcat/util/net/SocketWrapperBase<Lorg/apache/tomcat/util/net/Nio2Channel;>;>;", "java/lang/Object", new String[] { "java/nio/channels/CompletionHandler" });

classWriter.visitInnerClass("org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "org/apache/tomcat/util/net/SecureNio2Channel", "HandshakeReadCompletionHandler", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SecureNio2Channel$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/net/SecureNio2Channel;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/tomcat/util/net/SecureNio2Channel;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "this$0", "Lorg/apache/tomcat/util/net/SecureNio2Channel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "completed", "(Ljava/lang/Integer;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", "(Ljava/lang/Integer;Lorg/apache/tomcat/util/net/SocketWrapperBase<Lorg/apache/tomcat/util/net/Nio2Channel;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/EOFException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/EOFException", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "failed", "(Ljava/lang/Throwable;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "this$0", "Lorg/apache/tomcat/util/net/SecureNio2Channel;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SecureNio2Channel", "endpoint", "Lorg/apache/tomcat/util/net/Nio2Endpoint;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "OPEN_READ", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint", "processSocket", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "failed", "(Ljava/lang/Throwable;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", "(Ljava/lang/Throwable;Lorg/apache/tomcat/util/net/SocketWrapperBase<Lorg/apache/tomcat/util/net/Nio2Channel;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "this$0", "Lorg/apache/tomcat/util/net/SecureNio2Channel;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SecureNio2Channel", "endpoint", "Lorg/apache/tomcat/util/net/Nio2Endpoint;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketEvent", "ERROR", "Lorg/apache/tomcat/util/net/SocketEvent;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint", "processSocket", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Lorg/apache/tomcat/util/net/SocketEvent;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "failed", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/SocketWrapperBase");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "failed", "(Ljava/lang/Throwable;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "completed", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/SocketWrapperBase");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "completed", "(Ljava/lang/Integer;Lorg/apache/tomcat/util/net/SocketWrapperBase;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/tomcat/util/net/SecureNio2Channel;Lorg/apache/tomcat/util/net/SecureNio2Channel$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SecureNio2Channel$HandshakeReadCompletionHandler", "<init>", "(Lorg/apache/tomcat/util/net/SecureNio2Channel;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
