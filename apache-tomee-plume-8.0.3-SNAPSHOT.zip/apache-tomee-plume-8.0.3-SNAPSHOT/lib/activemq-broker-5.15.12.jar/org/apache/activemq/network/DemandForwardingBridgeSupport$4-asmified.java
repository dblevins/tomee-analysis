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
public class DemandForwardingBridgeSupport$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/network/DemandForwardingBridgeSupport", "stop", "()V");

classWriter.visitInnerClass("org/apache/activemq/network/DemandForwardingBridgeSupport$4", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$sendShutdown", "Ljava/util/concurrent/CountDownLatch;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;Ljava/util/concurrent/CountDownLatch;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "val$sendShutdown", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$300", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "shutdown", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$300", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitLdcInsn(new Long(5L));
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$300", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "shutdownNow", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$100", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("pending tasks on stop {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport", "staticDestinationsLatch", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$400", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "shutdown", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$400", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitLdcInsn(new Long(5L));
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$400", "(Lorg/apache/activemq/network/DemandForwardingBridgeSupport;)Ljava/util/concurrent/ExecutorService;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ExecutorService", "shutdownNow", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$100", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("pending tasks on stop {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport", "localBroker", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/ShutdownInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/ShutdownInfo", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/Transport", "oneway", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "this$0", "Lorg/apache/activemq/network/DemandForwardingBridgeSupport;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport", "remoteBroker", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/command/ShutdownInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/command/ShutdownInfo", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/Transport", "oneway", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "val$sendShutdown", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/network/DemandForwardingBridgeSupport", "access$100", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Caught exception sending shutdown");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "val$sendShutdown", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/network/DemandForwardingBridgeSupport$4", "val$sendShutdown", "Ljava/util/concurrent/CountDownLatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
