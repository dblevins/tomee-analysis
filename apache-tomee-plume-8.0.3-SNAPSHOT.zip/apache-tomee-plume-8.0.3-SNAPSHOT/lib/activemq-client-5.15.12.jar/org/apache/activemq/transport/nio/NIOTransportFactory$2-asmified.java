package asm.org.apache.activemq.transport.nio;
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
public class NIOTransportFactory$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/nio/NIOTransportFactory$2", null, "javax/net/ServerSocketFactory", null);

classWriter.visitOuterClass("org/apache/activemq/transport/nio/NIOTransportFactory", "createServerSocketFactory", "()Ljavax/net/ServerSocketFactory;");

classWriter.visitInnerClass("org/apache/activemq/transport/nio/NIOTransportFactory$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/nio/NIOTransportFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/nio/NIOTransportFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOTransportFactory$2", "this$0", "Lorg/apache/activemq/transport/nio/NIOTransportFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/net/ServerSocketFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServerSocket", "(I)Ljava/net/ServerSocket;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/channels/ServerSocketChannel", "open", "()Ljava/nio/channels/ServerSocketChannel;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/ServerSocketChannel", "socket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitTypeInsn(NEW, "java/net/InetSocketAddress");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/InetSocketAddress", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "bind", "(Ljava/net/SocketAddress;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/ServerSocketChannel", "socket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServerSocket", "(II)Ljava/net/ServerSocket;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/channels/ServerSocketChannel", "open", "()Ljava/nio/channels/ServerSocketChannel;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/ServerSocketChannel", "socket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitTypeInsn(NEW, "java/net/InetSocketAddress");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/InetSocketAddress", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "bind", "(Ljava/net/SocketAddress;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/ServerSocketChannel", "socket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createServerSocket", "(IILjava/net/InetAddress;)Ljava/net/ServerSocket;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/channels/ServerSocketChannel", "open", "()Ljava/nio/channels/ServerSocketChannel;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/ServerSocketChannel", "socket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitTypeInsn(NEW, "java/net/InetSocketAddress");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/InetSocketAddress", "<init>", "(Ljava/net/InetAddress;I)V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/ServerSocket", "bind", "(Ljava/net/SocketAddress;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/ServerSocketChannel", "socket", "()Ljava/net/ServerSocket;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
