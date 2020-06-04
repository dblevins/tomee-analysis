package asm.org.apache.activemq.broker.util;
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
public class UDPTraceBrokerPluginDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", null, "org/apache/activemq/broker/BrokerPluginSupport", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "wireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "maxTraceDatagramSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "destination", "Ljava/net/URI;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "socket", "Ljava/net/DatagramSocket;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "brokerId", "Lorg/apache/activemq/command/BrokerId;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "address", "Ljava/net/SocketAddress;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "broadcast", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/URISyntaxException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "maxTraceDatagramSize", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/net/URI");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("udp://127.0.0.1:61616");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URI", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "destination", "Ljava/net/URI;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/activemq/broker/util/UDPTraceBrokerPlugin"}, 1, new Object[] {"java/net/URISyntaxException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "start", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "getWireFormat", "()Lorg/apache/activemq/wireformat/WireFormat;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Wireformat must be specifed.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "address", "Ljava/net/SocketAddress;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "destination", "Ljava/net/URI;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "createSocketAddress", "(Ljava/net/URI;)Ljava/net/SocketAddress;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "address", "Ljava/net/SocketAddress;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "createSocket", "()Ljava/net/DatagramSocket;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "socket", "Ljava/net/DatagramSocket;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "getBrokerId", "()Lorg/apache/activemq/command/BrokerId;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "brokerId", "Lorg/apache/activemq/command/BrokerId;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/JournalTrace");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("START");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/JournalTrace", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createSocket", "()Ljava/net/DatagramSocket;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/net/DatagramSocket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/DatagramSocket", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "maxTraceDatagramSize", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/DatagramSocket", "setSendBufferSize", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "broadcast", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/DatagramSocket", "setBroadcast", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/JournalTrace");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOP");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/JournalTrace", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "socket", "Ljava/net/DatagramSocket;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/DatagramSocket", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "stop", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "trace", "(Lorg/apache/activemq/command/DataStructure;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/util/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "maxTraceDatagramSize", "I");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/util/ByteArrayOutputStream", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/io/DataOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/DataOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "brokerId", "Lorg/apache/activemq/command/BrokerId;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormat", "marshal", "(Ljava/lang/Object;Ljava/io/DataOutput;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormat", "marshal", "(Ljava/lang/Object;Ljava/io/DataOutput;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/DataOutputStream", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/ByteArrayOutputStream", "toByteSequence", "()Lorg/apache/activemq/util/ByteSequence;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/net/DatagramPacket");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/ByteSequence", "getData", "()[B", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/ByteSequence", "getOffset", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/ByteSequence", "getLength", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "address", "Ljava/net/SocketAddress;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/DatagramPacket", "<init>", "([BIILjava/net/SocketAddress;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "socket", "Ljava/net/DatagramSocket;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/DatagramSocket", "send", "(Ljava/net/DatagramPacket;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Failed to trace: {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "send", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "send", "(Lorg/apache/activemq/broker/ProducerBrokerExchange;Lorg/apache/activemq/command/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acknowledge", "(Lorg/apache/activemq/broker/ConsumerBrokerExchange;Lorg/apache/activemq/command/MessageAck;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "acknowledge", "(Lorg/apache/activemq/broker/ConsumerBrokerExchange;Lorg/apache/activemq/command/MessageAck;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConnection", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConnectionInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "addConnection", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConnectionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConsumer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConsumerInfo;)Lorg/apache/activemq/broker/region/Subscription;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "addConsumer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConsumerInfo;)Lorg/apache/activemq/broker/region/Subscription;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addDestinationInfo", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/DestinationInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "addDestinationInfo", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/DestinationInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addProducer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ProducerInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "addProducer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ProducerInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSession", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/SessionInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "addSession", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/SessionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/TransactionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/TransactionInfo", "<init>", "(Lorg/apache/activemq/command/ConnectionId;Lorg/apache/activemq/command/TransactionId;B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "beginTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "commitTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;Z)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/TransactionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "org/apache/activemq/broker/ConnectionContext", "org/apache/activemq/command/TransactionId", Opcodes.INTEGER}, 5, new Object[] {"org/apache/activemq/broker/util/UDPTraceBrokerPlugin", label0, label0, "org/apache/activemq/command/ConnectionId", "org/apache/activemq/command/TransactionId"});
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "org/apache/activemq/broker/ConnectionContext", "org/apache/activemq/command/TransactionId", Opcodes.INTEGER}, 6, new Object[] {"org/apache/activemq/broker/util/UDPTraceBrokerPlugin", label0, label0, "org/apache/activemq/command/ConnectionId", "org/apache/activemq/command/TransactionId", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/TransactionInfo", "<init>", "(Lorg/apache/activemq/command/ConnectionId;Lorg/apache/activemq/command/TransactionId;B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "commitTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forgetTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/TransactionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/TransactionInfo", "<init>", "(Lorg/apache/activemq/command/ConnectionId;Lorg/apache/activemq/command/TransactionId;B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "forgetTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "messagePull", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessagePull;)Lorg/apache/activemq/command/Response;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "messagePull", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/MessagePull;)Lorg/apache/activemq/command/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)I", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/TransactionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/TransactionInfo", "<init>", "(Lorg/apache/activemq/command/ConnectionId;Lorg/apache/activemq/command/TransactionId;B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "prepareTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "postProcessDispatch", "(Lorg/apache/activemq/command/MessageDispatch;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "postProcessDispatch", "(Lorg/apache/activemq/command/MessageDispatch;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processDispatchNotification", "(Lorg/apache/activemq/command/MessageDispatchNotification;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "processDispatchNotification", "(Lorg/apache/activemq/command/MessageDispatchNotification;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeConnection", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConnectionInfo;Ljava/lang/Throwable;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConnectionInfo", "createRemoveCommand", "()Lorg/apache/activemq/command/RemoveInfo;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "removeConnection", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConnectionInfo;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeConsumer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConsumerInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ConsumerInfo", "createRemoveCommand", "()Lorg/apache/activemq/command/RemoveInfo;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "removeConsumer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ConsumerInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeDestination", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ActiveMQDestination;J)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "removeDestination", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ActiveMQDestination;J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeDestinationInfo", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/DestinationInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "removeDestinationInfo", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/DestinationInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeProducer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ProducerInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ProducerInfo", "createRemoveCommand", "()Lorg/apache/activemq/command/RemoveInfo;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "removeProducer", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/ProducerInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeSession", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/SessionInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/SessionInfo", "createRemoveCommand", "()Lorg/apache/activemq/command/RemoveInfo;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "removeSession", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/SessionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeSubscription", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/RemoveSubscriptionInfo;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "removeSubscription", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/RemoveSubscriptionInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rollbackTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/TransactionInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/ConnectionContext", "getConnectionId", "()Lorg/apache/activemq/command/ConnectionId;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/TransactionInfo", "<init>", "(Lorg/apache/activemq/command/ConnectionId;Lorg/apache/activemq/command/TransactionId;B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "trace", "(Lorg/apache/activemq/command/DataStructure;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/broker/BrokerPluginSupport", "rollbackTransaction", "(Lorg/apache/activemq/broker/ConnectionContext;Lorg/apache/activemq/command/TransactionId;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWireFormat", "()Lorg/apache/activemq/wireformat/WireFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "createWireFormat", "()Lorg/apache/activemq/wireformat/WireFormat;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createWireFormat", "()Lorg/apache/activemq/wireformat/WireFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "getWireFormatFactory", "()Lorg/apache/activemq/wireformat/WireFormatFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/wireformat/WireFormatFactory", "createWireFormat", "()Lorg/apache/activemq/wireformat/WireFormat;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWireFormat", "(Lorg/apache/activemq/wireformat/WireFormat;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormat", "Lorg/apache/activemq/wireformat/WireFormat;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWireFormatFactory", "()Lorg/apache/activemq/wireformat/WireFormatFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "createWireFormatFactory", "()Lorg/apache/activemq/openwire/OpenWireFormatFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createWireFormatFactory", "()Lorg/apache/activemq/openwire/OpenWireFormatFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/openwire/OpenWireFormatFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/openwire/OpenWireFormatFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/OpenWireFormatFactory", "setCacheEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/OpenWireFormatFactory", "setVersion", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/OpenWireFormatFactory", "setTightEncodingEnabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/openwire/OpenWireFormatFactory", "setSizePrefixDisabled", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWireFormatFactory", "(Lorg/apache/activemq/wireformat/WireFormatFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "wireFormatFactory", "Lorg/apache/activemq/wireformat/WireFormatFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createSocketAddress", "(Ljava/net/URI;)Ljava/net/SocketAddress;", null, new String[] { "java/net/UnknownHostException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getHost", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/InetAddress", "getByName", "(Ljava/lang/String;)Ljava/net/InetAddress;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getPort", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/net/InetSocketAddress");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/InetSocketAddress", "<init>", "(Ljava/net/InetAddress;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDestination", "()Ljava/net/URI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "destination", "Ljava/net/URI;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDestination", "(Ljava/net/URI;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "destination", "Ljava/net/URI;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxTraceDatagramSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "maxTraceDatagramSize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxTraceDatagramSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "maxTraceDatagramSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isBroadcast", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "broadcast", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBroadcast", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "broadcast", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAddress", "()Ljava/net/SocketAddress;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "address", "Ljava/net/SocketAddress;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAddress", "(Ljava/net/SocketAddress;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "address", "Ljava/net/SocketAddress;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/broker/util/UDPTraceBrokerPlugin;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/broker/util/UDPTraceBrokerPlugin", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
