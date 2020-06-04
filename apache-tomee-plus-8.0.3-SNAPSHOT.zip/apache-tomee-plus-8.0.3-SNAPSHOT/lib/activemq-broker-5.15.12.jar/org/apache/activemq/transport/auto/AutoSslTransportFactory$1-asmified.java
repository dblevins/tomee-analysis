package asm.org.apache.activemq.transport.auto;
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
public class AutoSslTransportFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/auto/AutoSslTransportFactory$1", null, "org/apache/activemq/transport/auto/AutoSslTransportServer", null);

classWriter.visitOuterClass("org/apache/activemq/transport/auto/AutoSslTransportFactory", "createAutoSslTransportServer", "(Ljava/net/URI;Ljavax/net/ssl/SSLServerSocketFactory;)Lorg/apache/activemq/transport/auto/AutoSslTransportServer;");

classWriter.visitInnerClass("org/apache/activemq/transport/auto/AutoSslTransportFactory$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "org/apache/activemq/transport/tcp/TcpTransport", "InitBuffer", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/auto/AutoSslTransportFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/auto/AutoSslTransportFactory;Lorg/apache/activemq/transport/tcp/SslTransportFactory;Ljava/net/URI;Ljavax/net/ssl/SSLServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/AutoSslTransportFactory$1", "this$0", "Lorg/apache/activemq/transport/auto/AutoSslTransportFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/auto/AutoSslTransportServer", "<init>", "(Lorg/apache/activemq/transport/tcp/SslTransportFactory;Ljava/net/URI;Ljavax/net/ssl/SSLServerSocketFactory;Lorg/apache/activemq/broker/BrokerService;Ljava/util/Set;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;)Lorg/apache/activemq/transport/tcp/TcpTransport;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/AutoSslTransportFactory$1", "this$0", "Lorg/apache/activemq/transport/auto/AutoSslTransportFactory;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/auto/AutoSslTransportFactory", "access$000", "(Lorg/apache/activemq/transport/auto/AutoSslTransportFactory;Lorg/apache/activemq/wireformat/WireFormat;Lorg/apache/activemq/transport/tcp/TcpTransportServer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/auto/AutoSslTransportServer", "createTransport", "(Ljava/net/Socket;Lorg/apache/activemq/wireformat/WireFormat;Lorg/apache/activemq/transport/tcp/TcpTransportFactory;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;)Lorg/apache/activemq/transport/tcp/TcpTransport;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
