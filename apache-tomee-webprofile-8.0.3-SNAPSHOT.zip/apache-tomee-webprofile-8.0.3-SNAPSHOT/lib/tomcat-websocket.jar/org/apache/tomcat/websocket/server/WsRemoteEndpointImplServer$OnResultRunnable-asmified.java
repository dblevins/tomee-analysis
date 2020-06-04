package asm.org.apache.tomcat.websocket.server;
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
public class WsRemoteEndpointImplServer$OnResultRunnableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "OnResultRunnable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sh", "Ljavax/websocket/SendHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "t", "Ljava/lang/Throwable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljavax/websocket/SendHandler;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "sh", "Ljavax/websocket/SendHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "t", "Ljava/lang/Throwable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "t", "Ljava/lang/Throwable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "sh", "Ljavax/websocket/SendHandler;");
methodVisitor.visitTypeInsn(NEW, "javax/websocket/SendResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/websocket/SendResult", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/websocket/SendHandler", "onResult", "(Ljavax/websocket/SendResult;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "sh", "Ljavax/websocket/SendHandler;");
methodVisitor.visitTypeInsn(NEW, "javax/websocket/SendResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "t", "Ljava/lang/Throwable;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/websocket/SendResult", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/websocket/SendHandler", "onResult", "(Ljavax/websocket/SendResult;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljavax/websocket/SendHandler;Ljava/lang/Throwable;Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$OnResultRunnable", "<init>", "(Ljavax/websocket/SendHandler;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
