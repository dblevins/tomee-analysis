package asm.org.apache.activemq.network;
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
public class DiscoveryNetworkConnector$1DiscoverNetworkBridgeListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/network/DiscoveryNetworkConnector$1DiscoverNetworkBridgeListener", null, "org/apache/activemq/network/MBeanNetworkListener", null);

classWriter.visitOuterClass("org/apache/activemq/network/DiscoveryNetworkConnector", "createBridge", "(Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/transport/Transport;Lorg/apache/activemq/command/DiscoveryEvent;)Lorg/apache/activemq/network/NetworkBridge;");

classWriter.visitInnerClass("org/apache/activemq/network/DiscoveryNetworkConnector$1DiscoverNetworkBridgeListener", null, "DiscoverNetworkBridgeListener", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$event", "Lorg/apache/activemq/command/DiscoveryEvent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/network/DiscoveryNetworkConnector;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/network/DiscoveryNetworkConnector;Lorg/apache/activemq/broker/BrokerService;Ljakarta/management/ObjectName;Lorg/apache/activemq/command/DiscoveryEvent;)V", "(Lorg/apache/activemq/broker/BrokerService;Ljakarta/management/ObjectName;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/DiscoveryNetworkConnector$1DiscoverNetworkBridgeListener", "this$0", "Lorg/apache/activemq/network/DiscoveryNetworkConnector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/DiscoveryNetworkConnector$1DiscoverNetworkBridgeListener", "val$event", "Lorg/apache/activemq/command/DiscoveryEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/network/MBeanNetworkListener", "<init>", "(Lorg/apache/activemq/broker/BrokerService;Lorg/apache/activemq/network/NetworkBridgeConfiguration;Ljakarta/management/ObjectName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "bridgeFailed", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DiscoveryNetworkConnector$1DiscoverNetworkBridgeListener", "this$0", "Lorg/apache/activemq/network/DiscoveryNetworkConnector;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DiscoveryNetworkConnector", "serviceSupport", "Lorg/apache/activemq/util/ServiceSupport;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/util/ServiceSupport", "isStopped", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DiscoveryNetworkConnector$1DiscoverNetworkBridgeListener", "this$0", "Lorg/apache/activemq/network/DiscoveryNetworkConnector;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DiscoveryNetworkConnector", "access$000", "(Lorg/apache/activemq/network/DiscoveryNetworkConnector;)Lorg/apache/activemq/transport/discovery/DiscoveryAgent;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DiscoveryNetworkConnector$1DiscoverNetworkBridgeListener", "val$event", "Lorg/apache/activemq/command/DiscoveryEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/discovery/DiscoveryAgent", "serviceFailed", "(Lorg/apache/activemq/command/DiscoveryEvent;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
