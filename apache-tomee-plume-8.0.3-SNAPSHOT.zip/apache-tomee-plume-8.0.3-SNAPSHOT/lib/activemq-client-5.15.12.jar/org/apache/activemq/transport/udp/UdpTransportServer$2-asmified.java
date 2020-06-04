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
public class UdpTransportServer$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/udp/UdpTransportServer$2", null, "org/apache/activemq/transport/CommandJoiner", null);

classWriter.visitOuterClass("org/apache/activemq/transport/udp/UdpTransportServer", "createTransport", "(Lorg/apache/activemq/command/Command;Lorg/apache/activemq/transport/udp/DatagramEndpoint;)Lorg/apache/activemq/transport/Transport;");

classWriter.visitInnerClass("org/apache/activemq/transport/udp/UdpTransportServer$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$reliableTransport", "Lorg/apache/activemq/transport/reliable/ReliableTransport;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$command", "Lorg/apache/activemq/command/Command;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/udp/UdpTransportServer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/udp/UdpTransportServer;Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/openwire/OpenWireFormat;Lorg/apache/activemq/transport/reliable/ReliableTransport;Lorg/apache/activemq/command/Command;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/udp/UdpTransportServer$2", "this$0", "Lorg/apache/activemq/transport/udp/UdpTransportServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/udp/UdpTransportServer$2", "val$reliableTransport", "Lorg/apache/activemq/transport/reliable/ReliableTransport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/udp/UdpTransportServer$2", "val$command", "Lorg/apache/activemq/command/Command;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/CommandJoiner", "<init>", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/openwire/OpenWireFormat;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/CommandJoiner", "start", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/udp/UdpTransportServer$2", "val$reliableTransport", "Lorg/apache/activemq/transport/reliable/ReliableTransport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/udp/UdpTransportServer$2", "val$command", "Lorg/apache/activemq/command/Command;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/reliable/ReliableTransport", "onCommand", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
