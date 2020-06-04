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
public class AsyncChannelWrapperNonSecureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", null, "java/lang/Object", new String[] { "org/apache/tomcat/websocket/AsyncChannelWrapper" });

classWriter.visitInnerClass("org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure$NoOpFuture", "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "NoOpFuture", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NOOP_FUTURE", "Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Future<Ljava/lang/Void;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "socketChannel", "Ljava/nio/channels/AsynchronousSocketChannel;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/nio/channels/AsynchronousSocketChannel;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "socketChannel", "Ljava/nio/channels/AsynchronousSocketChannel;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future;", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "socketChannel", "Ljava/nio/channels/AsynchronousSocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/AsynchronousSocketChannel", "read", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljava/nio/ByteBuffer;Ljava/lang/Object;Ljava/nio/channels/CompletionHandler;)V", "<B:Ljava/lang/Object;A:TB;>(Ljava/nio/ByteBuffer;TA;Ljava/nio/channels/CompletionHandler<Ljava/lang/Integer;TB;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "socketChannel", "Ljava/nio/channels/AsynchronousSocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/AsynchronousSocketChannel", "read", "(Ljava/nio/ByteBuffer;Ljava/lang/Object;Ljava/nio/channels/CompletionHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future;", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "socketChannel", "Ljava/nio/channels/AsynchronousSocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/AsynchronousSocketChannel", "write", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([Ljava/nio/ByteBuffer;IIJLjava/util/concurrent/TimeUnit;Ljava/lang/Object;Ljava/nio/channels/CompletionHandler;)V", "<B:Ljava/lang/Object;A:TB;>([Ljava/nio/ByteBuffer;IIJLjava/util/concurrent/TimeUnit;TA;Ljava/nio/channels/CompletionHandler<Ljava/lang/Long;TB;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "socketChannel", "Ljava/nio/channels/AsynchronousSocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/AsynchronousSocketChannel", "write", "([Ljava/nio/ByteBuffer;IIJLjava/util/concurrent/TimeUnit;Ljava/lang/Object;Ljava/nio/channels/CompletionHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "socketChannel", "Ljava/nio/channels/AsynchronousSocketChannel;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/AsynchronousSocketChannel", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handshake", "()Ljava/util/concurrent/Future;", "()Ljava/util/concurrent/Future<Ljava/lang/Void;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "NOOP_FUTURE", "Ljava/util/concurrent/Future;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure$NoOpFuture");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure$NoOpFuture", "<init>", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperNonSecure$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperNonSecure", "NOOP_FUTURE", "Ljava/util/concurrent/Future;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
