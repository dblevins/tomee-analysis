package asm.org.apache.activemq.transport.discovery.multicast;
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
public class MulticastDiscoveryAgent$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$2", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent", "fireServiceAddEvent", "(Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$RemoteBrokerData;)V");

classWriter.visitInnerClass("org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$RemoteBrokerData", "org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent", "RemoteBrokerData", 0);

classWriter.visitInnerClass("org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$data", "Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$RemoteBrokerData;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent;Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$RemoteBrokerData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$2", "this$0", "Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$2", "val$data", "Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$RemoteBrokerData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$2", "this$0", "Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent", "access$600", "(Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent;)Lorg/apache/activemq/transport/discovery/DiscoveryListener;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$2", "val$data", "Lorg/apache/activemq/transport/discovery/multicast/MulticastDiscoveryAgent$RemoteBrokerData;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/discovery/DiscoveryListener", "onServiceAdd", "(Lorg/apache/activemq/command/DiscoveryEvent;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/transport/discovery/DiscoveryListener"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
