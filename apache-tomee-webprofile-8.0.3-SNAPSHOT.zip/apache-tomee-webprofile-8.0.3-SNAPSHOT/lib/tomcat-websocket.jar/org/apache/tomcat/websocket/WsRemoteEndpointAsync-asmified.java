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
public class WsRemoteEndpointAsyncDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", null, "org/apache/tomcat/websocket/WsRemoteEndpointBase", new String[] { "javax/websocket/RemoteEndpoint$Async" });

classWriter.visitInnerClass("javax/websocket/RemoteEndpoint$Async", "javax/websocket/RemoteEndpoint", "Async", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/WsRemoteEndpointBase", "<init>", "(Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSendTimeout", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "getSendTimeout", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSendTimeout", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "setSendTimeout", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendText", "(Ljava/lang/String;Ljavax/websocket/SendHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "sendStringByCompletion", "(Ljava/lang/String;Ljavax/websocket/SendHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendText", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "(Ljava/lang/String;)Ljava/util/concurrent/Future<Ljava/lang/Void;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "sendStringByFuture", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendBinary", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future;", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future<Ljava/lang/Void;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "sendBytesByFuture", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendBinary", "(Ljava/nio/ByteBuffer;Ljavax/websocket/SendHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "sendBytesByCompletion", "(Ljava/nio/ByteBuffer;Ljavax/websocket/SendHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendObject", "(Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/lang/Object;)Ljava/util/concurrent/Future<Ljava/lang/Void;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "sendObjectByFuture", "(Ljava/lang/Object;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sendObject", "(Ljava/lang/Object;Ljavax/websocket/SendHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/WsRemoteEndpointAsync", "base", "Lorg/apache/tomcat/websocket/WsRemoteEndpointImplBase;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/WsRemoteEndpointImplBase", "sendObjectByCompletion", "(Ljava/lang/Object;Ljavax/websocket/SendHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
