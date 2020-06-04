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
public class AutoNioSslTransportFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", null, "org/apache/activemq/transport/nio/NIOSSLTransportFactory", new String[] { "org/apache/activemq/broker/BrokerServiceAware" });

classWriter.visitInnerClass("org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "brokerService", "Lorg/apache/activemq/broker/BrokerService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "allowLinkStealingSet", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "enabledProtocols", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOSSLTransportFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "allowLinkStealingSet", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBrokerService", "(Lorg/apache/activemq/broker/BrokerService;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTcpTransportServer", "(Ljava/net/URI;Ljavax/net/ServerSocketFactory;)Lorg/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer;", null, new String[] { "java/io/IOException", "java/net/URISyntaxException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "context", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "brokerService", "Lorg/apache/activemq/broker/BrokerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "enabledProtocols", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory$1", "<init>", "(Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;Ljavax/net/ssl/SSLContext;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Ljava/net/URI;Ljavax/net/ServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doBind", "(Ljava/net/URI;)Lorg/apache/activemq/transport/TransportServer;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/net/URISyntaxException");
methodVisitor.visitLabel(label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/SslContext", "getCurrentSslContext", "()Lorg/apache/activemq/broker/SslContext;", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/SslContext", "getCurrentSslContext", "()Lorg/apache/activemq/broker/SslContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/SslContext", "getSSLContext", "()Ljavax/net/ssl/SSLContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "context", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/URISupport", "parseParameters", "(Ljava/net/URI;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("auto.");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "extractProperties", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("protocols");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/auto/AutoTransportUtils", "parseProtocols", "(Ljava/lang/String;)Ljava/util/Set;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "enabledProtocols", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "createServerSocketFactory", "()Ljavax/net/ServerSocketFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "createTcpTransportServer", "(Ljava/net/URI;Ljavax/net/ServerSocketFactory;)Lorg/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/OpenWireFormatFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/OpenWireFormatFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/AutoTcpTransportServer", "setWireFormatFactory", "(Lorg/apache/activemq/wireformat/WireFormatFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("allowLinkStealing");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "allowLinkStealingSet", "Z");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "java/net/URI", "java/util/Map", "java/util/Map", "javax/net/ServerSocketFactory", "org/apache/activemq/transport/auto/AutoTcpTransportServer"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "setProperties", "(Ljava/lang/Object;Ljava/util/Map;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("auto.");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "extractProperties", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/AutoTcpTransportServer", "setAutoTransportOptions", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("transport.");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "extractProperties", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/AutoTcpTransportServer", "setTransportOption", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/auto/AutoTransportUtils", "extractWireFormatOptions", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/AutoTcpTransportServer", "setWireFormatOptions", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/AutoTcpTransportServer", "bind", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "java/net/URI"}, 1, new Object[] {"java/net/URISyntaxException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IOExceptionSupport", "create", "(Ljava/lang/Exception;)Ljava/io/IOException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createTcpTransportServer", "(Ljava/net/URI;Ljavax/net/ServerSocketFactory;)Lorg/apache/activemq/transport/tcp/TcpTransportServer;", null, new String[] { "java/io/IOException", "java/net/URISyntaxException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "createTcpTransportServer", "(Ljava/net/URI;Ljavax/net/ServerSocketFactory;)Lorg/apache/activemq/transport/auto/nio/AutoNIOSSLTransportServer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;)Ljavax/net/ssl/SSLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "context", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory;)Ljavax/net/ssl/SSLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNioSslTransportFactory", "context", "Ljavax/net/ssl/SSLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
