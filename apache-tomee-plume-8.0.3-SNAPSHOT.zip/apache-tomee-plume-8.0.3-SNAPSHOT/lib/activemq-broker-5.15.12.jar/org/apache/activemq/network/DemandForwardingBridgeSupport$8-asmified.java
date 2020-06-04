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
public class DemandForwardingBridgeSupport$8Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", null, "java/lang/Object", new String[] { "org/apache/activemq/transport/ResponseCallback" });

classWriter.visitOuterClass("org/apache/activemq/network/DemandForwardingBridgeSupport", "serviceRemoteCommand", "(Lorg/apache/activemq/command/Command;)V");

classWriter.visitInnerClass("org/apache/activemq/network/DemandForwardingBridgeSupport$8", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "correlationId", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$message", "Lorg/apache/activemq/command/ActiveMQMessage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;Lorg/apache/activemq/command/ActiveMQMessage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "val$message", "Lorg/apache/activemq/command/ActiveMQMessage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "val$message", "Lorg/apache/activemq/command/ActiveMQMessage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/ActiveMQMessage", "getCommandId", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "correlationId", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onCompletion", "(Lorg/apache/activemq/transport/FutureResponse;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/FutureResponse", "getResult", "()Lorg/apache/activemq/command/Response;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "correlationId", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Response", "setCorrelationId", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport", "remoteBroker", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/Transport", "oneway", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport", "networkBridgeStatistics", "Lorg/apache/activemq/network/NetworkBridgeStatistics;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/NetworkBridgeStatistics", "getReceivedCount", "()Lorg/apache/activemq/management/CountStatisticImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/management/CountStatisticImpl", "increment", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$100", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Exception: {} on duplex forward of: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "val$message", "Lorg/apache/activemq/command/ActiveMQMessage;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$8", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/network/DemandForwardingBridgeSupport", "serviceRemoteException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
