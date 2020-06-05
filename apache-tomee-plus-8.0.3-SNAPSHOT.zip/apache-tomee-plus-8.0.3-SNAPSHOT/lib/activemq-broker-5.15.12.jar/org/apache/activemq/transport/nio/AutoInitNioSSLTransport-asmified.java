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
public class AutoInitNioSSLTransportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", null, "org/apache/activemq/transport/nio/NIOSSLTransport", null);

classWriter.visitInnerClass("org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "org/apache/activemq/transport/tcp/TcpTransport", "InitBuffer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/net/ssl/SSLEngineResult$HandshakeStatus", "javax/net/ssl/SSLEngineResult", "HandshakeStatus", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/net/ssl/SSLEngineResult$Status", "javax/net/ssl/SSLEngineResult", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "readData", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "readSize", "Ljava/util/concurrent/atomic/AtomicInteger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljavax/net/SocketFactory;Ljava/net/URI;Ljava/net/URI;)V", null, new String[] { "java/net/UnknownHostException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljavax/net/SocketFactory;Ljava/net/URI;Ljava/net/URI;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicInteger", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;Ljavax/net/ssl/SSLEngine;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicInteger", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSslContext", "(Ljavax/net/ssl/SSLContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslContext", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInputBuffer", "()Ljava/nio/ByteBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeStreams", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "socket", "Ljava/net/Socket;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/Socket", "getChannel", "()Ljava/nio/channels/SocketChannel;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "channel", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "channel", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "configureBlocking", "(Z)Ljava/nio/channels/SelectableChannel;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslContext", "Ljavax/net/ssl/SSLContext;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/SSLContext", "getDefault", "()Ljavax/net/ssl/SSLContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslContext", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/transport/nio/NIOOutputStream"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/net/URI");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "getRemoteAddress", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URI", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getHost", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getPort", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label1);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "org/apache/activemq/transport/nio/NIOOutputStream", "java/lang/String", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslContext", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLContext", "createSSLEngine", "(Ljava/lang/String;I)Ljavax/net/ssl/SSLEngine;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslContext", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLContext", "createSSLEngine", "()Ljavax/net/ssl/SSLEngine;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "verifyHostName", "Z");
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitTypeInsn(NEW, "javax/net/ssl/SSLParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/net/ssl/SSLParameters", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("HTTPS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLParameters", "setEndpointIdentificationAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "setSSLParameters", "(Ljavax/net/ssl/SSLParameters;)V", false);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "setUseClientMode", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "enabledCipherSuites", "[Ljava/lang/String;");
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "enabledCipherSuites", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "setEnabledCipherSuites", "([Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "enabledProtocols", "[Ljava/lang/String;");
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "enabledProtocols", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "setEnabledProtocols", "([Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "wantClientAuth", "Z");
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label16);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "wantClientAuth", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "setWantClientAuth", "(Z)V", false);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "needClientAuth", "Z");
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "needClientAuth", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "setNeedClientAuth", "(Z)V", false);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "getSession", "()Ljavax/net/ssl/SSLSession;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslSession", "Ljavax/net/ssl/SSLSession;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslSession", "Ljavax/net/ssl/SSLSession;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/net/ssl/SSLSession", "getPacketBufferSize", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "inputBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "clear", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/nio/NIOOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "channel", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOOutputStream", "<init>", "(Ljava/nio/channels/WritableByteChannel;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOOutputStream", "setEngine", "(Ljavax/net/ssl/SSLEngine;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/DataOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/DataOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "dataOut", "Ljava/io/DataOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "buffOut", "Lorg/apache/activemq/transport/tcp/TimeStampStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "beginHandshake", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "getHandshakeStatus", "()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "handshakeStatus", "Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "doHandshake", "()V", false);
methodVisitor.visitLabel(label4);
Label label18 = new Label();
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "org/apache/activemq/transport/nio/NIOOutputStream"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Exception"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOSSLTransport", "closeStreams", "()V", false);
methodVisitor.visitLabel(label7);
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doOpenWireInit", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSslSession", "()Ljavax/net/ssl/SSLEngine;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslEngine", "Ljavax/net/ssl/SSLEngine;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadData", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readData", "[B");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readData", "[B");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"[B"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadSize", "()Ljava/util/concurrent/atomic/AtomicInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serviceRead", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "handshakeInProgress", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "doHandshake", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "sslSession", "Ljavax/net/ssl/SSLSession;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/net/ssl/SSLSession", "getApplicationBufferSize", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/nio/ByteBuffer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "hasRemaining", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "secureRead", "(Ljava/nio/ByteBuffer;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/EOFException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/EOFException", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "onException", "(Ljava/io/IOException;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "receiveCounter", "I");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "receiveCounter", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readSize", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "addAndGet", "(I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "status", "Ljavax/net/ssl/SSLEngineResult$Status;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/net/ssl/SSLEngineResult$Status", "OK", "Ljavax/net/ssl/SSLEngineResult$Status;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "handshakeStatus", "Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;");
methodVisitor.visitFieldInsn(GETSTATIC, "javax/net/ssl/SSLEngineResult$HandshakeStatus", "NEED_UNWRAP", "Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "processCommand", "(Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "receiveCounter", "I");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitJumpInsn(IF_ICMPLT, label5);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "onException", "(Ljava/io/IOException;)V", false);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IOExceptionSupport", "create", "(Ljava/lang/Throwable;)Ljava/io/IOException;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "onException", "(Ljava/io/IOException;)V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processCommand", "(Ljava/nio/ByteBuffer;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "receiveCounter", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocate", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readData", "[B");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readData", "[B");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "([B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/nio/ByteBuffer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "array", "()[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "readData", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doStart", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/thread/TaskRunnerFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ActiveMQ NIOSSLTransport Task");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/thread/TaskRunnerFactory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "connect", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doStop", "(Lorg/apache/activemq/util/ServiceStopper;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/thread/TaskRunnerFactory", "shutdownNow", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/AutoInitNioSSLTransport", "taskRunnerFactory", "Lorg/apache/activemq/thread/TaskRunnerFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}