package asm.org.apache.activemq.transport.udp;
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
public class UdpTransportFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/apache/activemq/transport/udp/UdpTransportFactory", null, "org/apache/activemq/transport/TransportFactory", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/TransportFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doBind", "(Ljava/net/URI;)Lorg/apache/activemq/transport/TransportServer;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/URISyntaxException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/URISupport", "parseParameters", "(Ljava/net/URI;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("port");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsKey", "(Ljava/lang/Object;)Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The port property cannot be specified on a UDP server transport - please use the port in the URI syntax");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "createWireFormat", "(Ljava/util/Map;)Lorg/apache/activemq/wireformat/WireFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getPort", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "asOpenWireFormat", "(Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/openwire/OpenWireFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getPort", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "createTransport", "(ILorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/transport/udp/UdpTransport");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "configure", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Ljava/util/Map;Z)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/udp/UdpTransportServer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "createReplayStrategy", "()Lorg/apache/activemq/transport/reliable/ReplayStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/udp/UdpTransportServer", "<init>", "(Ljava/net/URI;Lorg/apache/activemq/transport/udp/UdpTransport;Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/transport/reliable/ReplayStrategy;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/transport/udp/UdpTransportFactory", "java/net/URI"}, 1, new Object[] {"java/net/URISyntaxException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IOExceptionSupport", "create", "(Ljava/lang/Exception;)Ljava/io/IOException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IOExceptionSupport", "create", "(Ljava/lang/Exception;)Ljava/io/IOException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Ljava/util/Map;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "configure", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Ljava/util/Map;Z)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compositeConfigure", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Ljava/util/Map;)Lorg/apache/activemq/transport/Transport;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "setProperties", "(Ljava/lang/Object;Ljava/util/Map;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/transport/udp/UdpTransport");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/CommandJoiner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "asOpenWireFormat", "(Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/openwire/OpenWireFormat;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/CommandJoiner", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/openwire/OpenWireFormat;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransport", "isTrace", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/TransportLoggerSupport", "createTransportLogger", "(Lorg/apache/activemq/transport/Transport;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/activemq/transport/udp/UdpTransportFactory", "org/apache/activemq/transport/Transport", "org/apache/activemq/wireformat/WireFormat", "java/util/Map", "org/apache/activemq/transport/udp/UdpTransport"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/transport/udp/UdpTransportFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not create TransportLogger, reason: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/InactivityMonitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/InactivityMonitor", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/openwire/OpenWireFormat");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "configureClientSideNegotiator", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Lorg/apache/activemq/transport/udp/UdpTransport;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTransport", "(Ljava/net/URI;Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/net/UnknownHostException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "asOpenWireFormat", "(Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/openwire/OpenWireFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/udp/UdpTransport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/udp/UdpTransport", "<init>", "(Lorg/apache/activemq/openwire/OpenWireFormat;Ljava/net/URI;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createTransport", "(ILorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/net/UnknownHostException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "asOpenWireFormat", "(Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/openwire/OpenWireFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/udp/UdpTransport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/udp/UdpTransport", "<init>", "(Lorg/apache/activemq/openwire/OpenWireFormat;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "configure", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Ljava/util/Map;Z)Lorg/apache/activemq/transport/Transport;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/IntrospectionSupport", "setProperties", "(Ljava/lang/Object;Ljava/util/Map;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/transport/udp/UdpTransport");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "asOpenWireFormat", "(Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/openwire/OpenWireFormat;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransport", "isTrace", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/TransportLoggerSupport", "createTransportLogger", "(Lorg/apache/activemq/transport/Transport;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/activemq/transport/udp/UdpTransport", "org/apache/activemq/openwire/OpenWireFormat"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/InactivityMonitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/InactivityMonitor", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/activemq/openwire/OpenWireFormat");
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "configureClientSideNegotiator", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Lorg/apache/activemq/transport/udp/UdpTransport;)Lorg/apache/activemq/transport/Transport;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransport", "setReplayEnabled", "(Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/CommandJoiner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/CommandJoiner", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/openwire/OpenWireFormat;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/reliable/ReliableTransport");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/reliable/ReliableTransport", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/transport/udp/UdpTransport;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/reliable/ReliableTransport", "getReplayer", "()Lorg/apache/activemq/transport/reliable/Replayer;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/udp/UdpTransportFactory", "createReplayStrategy", "(Lorg/apache/activemq/transport/reliable/Replayer;)Lorg/apache/activemq/transport/reliable/ReplayStrategy;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/reliable/ReliableTransport", "setReplayStrategy", "(Lorg/apache/activemq/transport/reliable/ReplayStrategy;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/CommandJoiner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/CommandJoiner", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/openwire/OpenWireFormat;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createReplayStrategy", "(Lorg/apache/activemq/transport/reliable/Replayer;)Lorg/apache/activemq/transport/reliable/ReplayStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/reliable/DefaultReplayStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/reliable/DefaultReplayStrategy", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/reliable/ExceptionIfDroppedReplayStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/reliable/ExceptionIfDroppedReplayStrategy", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createReplayStrategy", "()Lorg/apache/activemq/transport/reliable/ReplayStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/reliable/DefaultReplayStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/reliable/DefaultReplayStrategy", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "configureClientSideNegotiator", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/wireformat/WireFormat;Lorg/apache/activemq/transport/udp/UdpTransport;)Lorg/apache/activemq/transport/Transport;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/transport/udp/ResponseRedirectInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/udp/ResponseRedirectInterceptor", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/transport/udp/UdpTransport;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "asOpenWireFormat", "(Lorg/apache/activemq/wireformat/WireFormat;)Lorg/apache/activemq/openwire/OpenWireFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/openwire/OpenWireFormat");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/transport/tcp/TcpTransportFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/transport/udp/UdpTransportFactory", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}