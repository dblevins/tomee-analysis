package asm.org.apache.activemq.transport;
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
public class TransportServerFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/transport/TransportServerFilter", null, "java/lang/Object", new String[] { "org/apache/activemq/transport/TransportServer" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "next", "Lorg/apache/activemq/transport/TransportServer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/transport/TransportServer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectURI", "()Ljava/net/URI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "getConnectURI", "()Ljava/net/URI;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAcceptListener", "(Lorg/apache/activemq/transport/TransportAcceptListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "setAcceptListener", "(Lorg/apache/activemq/transport/TransportAcceptListener;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBrokerInfo", "(Lorg/apache/activemq/command/BrokerInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "setBrokerInfo", "(Lorg/apache/activemq/command/BrokerInfo;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "start", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "stop", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSocketAddress", "()Ljava/net/InetSocketAddress;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "getSocketAddress", "()Ljava/net/InetSocketAddress;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSslServer", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "isSslServer", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAllowLinkStealing", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/TransportServerFilter", "next", "Lorg/apache/activemq/transport/TransportServer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportServer", "isAllowLinkStealing", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
