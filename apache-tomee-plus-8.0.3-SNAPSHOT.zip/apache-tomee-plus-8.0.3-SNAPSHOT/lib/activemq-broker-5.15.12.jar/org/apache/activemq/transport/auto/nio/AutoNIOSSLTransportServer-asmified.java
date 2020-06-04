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
public class AutoNIOSSLTransportServerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", null, "org/apache/activemq/transport/auto/AutoTcpTransportServer", null);

classWriter.visitInnerClass("org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "org/apache/activemq/transport/tcp/TcpTransport", "InitBuffer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/transport/tcp/TcpTransportServer$TransportInfo", "org/apache/activemq/transport/tcp/TcpTransportServer", "TransportInfo", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "org/apache/activemq/transport/auto/AutoTcpTransportServer", "ProtocolInfo", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "context", "Ljavax/net/ssl/SSLContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "needClientAuth", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wantClientAuth", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/net/ssl/SSLContext;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Ljava/net/URI;Ljavax/net/ServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set;)V", "(Ljavax/net/ssl/SSLContext;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Ljava/net/URI;Ljavax/net/ServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set<Ljava/lang/String;>;)V", new String[] { "java/io/IOException", "java/net/URISyntaxException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/auto/AutoTcpTransportServer", "<init>", "(Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Ljava/net/URI;Ljavax/net/ServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "context", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;Ljavax/net/ssl/SSLEngine;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;Ljava/nio/ByteBuffer;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/nio/NIOSSLTransport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;Ljavax/net/ssl/SSLEngine;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "context", "Ljavax/net/ssl/SSLContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "context", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/transport/nio/NIOSSLTransport"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "needClientAuth", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "setNeedClientAuth", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "wantClientAuth", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "setWantClientAuth", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/transport/tcp/TcpTransport;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("method not supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSslServer", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNeedClientAuth", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "needClientAuth", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNeedClientAuth", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "needClientAuth", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWantClientAuth", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "wantClientAuth", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWantClientAuth", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "wantClientAuth", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "configureTransport", "(Lorg/apache/activemq/transport/tcp/TcpTransportServer;Ljava/net/Socket;)Lorg/apache/activemq/transport/tcp/TcpTransportServer$TransportInfo;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "wireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormatFactory", "createWireFormat", "()Lorg/apache/activemq/wireformat/WireFormat;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "context", "Ljavax/net/ssl/SSLContext;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "context", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/transport/nio/AutoInitNioSSLTransport"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "transportOptions", "Ljava/util/Map;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "transportOptions", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "setProperties", "(Ljava/lang/Object;Ljava/util/Map;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "protocolDetectionExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer$1", "<init>", "(Lorg/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer;Lorg/apache/activemq/transport/nio/AutoInitNioSSLTransport;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/ThreadPoolExecutor", "submit", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getReadSize", "()Ljava/util/concurrent/atomic/AtomicInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "waitForProtocolDetectionFinish", "(Ljava/util/concurrent/Future;Ljava/util/concurrent/atomic/AtomicInteger;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "cancel", "(Z)Z", true);
methodVisitor.visitInsn(POP);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "org/apache/activemq/transport/tcp/TcpTransportServer", "java/net/Socket", "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "java/util/concurrent/Future"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "cancel", "(Z)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "stop", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getReadSize", "()Ljava/util/concurrent/atomic/AtomicInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "get", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getReadData", "()[B", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "<init>", "(ILjava/nio/ByteBuffer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "buffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getReadData", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "([B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getReadData", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "detectProtocol", "([B)Lorg/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "detectedTransportFactory", "Lorg/apache/activemq/transport/tcp/TcpTransportFactory;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/broker/BrokerServiceAware");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "detectedTransportFactory", "Lorg/apache/activemq/transport/tcp/TcpTransportFactory;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/broker/BrokerServiceAware");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/broker/BrokerServiceAware", "setBrokerService", "(Lorg/apache/activemq/broker/BrokerService;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "detectedWireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormatFactory", "createWireFormat", "()Lorg/apache/activemq/wireformat/WireFormat;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getSslSession", "()Ljavax/net/ssl/SSLEngine;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getInputBuffer", "()Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "detectedTransportFactory", "Lorg/apache/activemq/transport/tcp/TcpTransportFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;Ljavax/net/ssl/SSLEngine;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;Ljava/nio/ByteBuffer;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/tcp/TcpTransportServer$TransportInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/AutoTcpTransportServer$ProtocolInfo", "detectedTransportFactory", "Lorg/apache/activemq/transport/tcp/TcpTransportFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/tcp/TcpTransportServer$TransportInfo", "<init>", "(Lorg/apache/activemq/transport/tcp/TcpTransportServer;Lorg/apache/activemq/wireformat/WireFormat;Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/transport/TransportFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer", "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/transport/tcp/TcpTransport;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
