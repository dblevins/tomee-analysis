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
public class WsRemoteEndpointImplServer$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "Ljava/lang/Object;Ljava/nio/channels/CompletionHandler<Ljava/lang/Long;Ljava/lang/Void;>;", "java/lang/Object", new String[] { "java/nio/channels/CompletionHandler" });

classWriter.visitOuterClass("org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "doWrite", "(Ljavax/websocket/SendHandler;J[Ljava/nio/ByteBuffer;)V");

classWriter.visitInnerClass("org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$block", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$blockingWriteTimeoutExpiry", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$handler", "Ljavax/websocket/SendHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;ZJLjavax/websocket/SendHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$block", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$blockingWriteTimeoutExpiry", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$handler", "Ljavax/websocket/SendHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "completed", "(Ljava/lang/Long;Ljava/lang/Void;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$block", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$blockingWriteTimeoutExpiry", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGT, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/net/SocketTimeoutException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/SocketTimeoutException", "<init>", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "failed", "(Ljava/lang/Throwable;Ljava/lang/Void;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$handler", "Ljavax/websocket/SendHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "access$000", "()Ljavax/websocket/SendResult;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/websocket/SendHandler", "onResult", "(Ljavax/websocket/SendResult;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "access$100", "(Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;)Lorg/apache/tomcat/websocket/server/WsWriteTimeout;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/server/WsWriteTimeout", "unregister", "(Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "access$200", "(Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;Ljava/lang/Throwable;Z)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "failed", "(Ljava/lang/Throwable;Ljava/lang/Void;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$block", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "javax/websocket/SendResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/websocket/SendResult", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "val$handler", "Ljavax/websocket/SendHandler;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/websocket/SendHandler", "onResult", "(Ljavax/websocket/SendResult;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "access$100", "(Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;)Lorg/apache/tomcat/websocket/server/WsWriteTimeout;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/server/WsWriteTimeout", "unregister", "(Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "access$200", "(Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;Ljava/lang/Throwable;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "this$0", "Lorg/apache/tomcat/websocket/server/WsRemoteEndpointImplServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "failed", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Void");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "failed", "(Ljava/lang/Throwable;Ljava/lang/Void;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "completed", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Void");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/server/WsRemoteEndpointImplServer$1", "completed", "(Ljava/lang/Long;Ljava/lang/Void;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
