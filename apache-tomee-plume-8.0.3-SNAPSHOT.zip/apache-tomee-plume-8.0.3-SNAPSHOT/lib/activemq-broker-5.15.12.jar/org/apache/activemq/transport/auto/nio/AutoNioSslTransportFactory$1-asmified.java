package asm.org.apache.activemq.transport.auto.nio;
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
public class AutoNioSslTransportFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", null, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", null);

classWriter.visitOuterClass("org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "createTcpTransportServer", "(Ljava/net/URI;Ljavax/net/ServerSocketFactory;)Lorg/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer;");

classWriter.visitInnerClass("org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "org/apache/activemq/transport/tcp/TcpTransport", "InitBuffer", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;Ljavax/net/ssl/SSLContext;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Ljava/net/URI;Ljavax/net/ServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "this$0", "Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "<init>", "(Ljavax/net/ssl/SSLContext;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Ljava/net/URI;Ljavax/net/ServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;Ljavax/net/ssl/SSLEngine;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;Ljava/nio/ByteBuffer;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportFactory", "createTransport", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;Ljavax/net/ssl/SSLEngine;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;Ljava/nio/ByteBuffer;)Lorg/apache/activemq/transport/tcp/TcpTransport;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/transport/nio/NIOSSLTransport");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("MQTT");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "this$0", "Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "allowLinkStealingSet", "Z");
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "setAllowLinkStealing", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/transport/nio/NIOSSLTransport"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "this$0", "Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "access$000", "(Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;)Ljavax/net/ssl/SSLContext;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "this$0", "Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "access$100", "(Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;)Ljavax/net/ssl/SSLContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "isNeedClientAuth", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "setNeedClientAuth", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "isWantClientAuth", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "setWantClientAuth", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
