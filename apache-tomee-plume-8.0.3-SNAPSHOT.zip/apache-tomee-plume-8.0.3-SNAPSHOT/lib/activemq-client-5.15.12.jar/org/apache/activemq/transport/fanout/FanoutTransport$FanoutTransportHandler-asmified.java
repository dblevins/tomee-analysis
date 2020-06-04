package asm.org.apache.activemq.transport.fanout;
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
public class FanoutTransport$FanoutTransportHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", null, "org/apache/activemq/transport/DefaultTransportListener", null);

classWriter.visitInnerClass("org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "org/apache/activemq/transport/fanout/FanoutTransport", "FanoutTransportHandler", 0);

classWriter.visitInnerClass("org/apache/activemq/transport/fanout/FanoutTransport$RequestCounter", "org/apache/activemq/transport/fanout/FanoutTransport", "RequestCounter", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "uri", "Ljava/net/URI;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transport", "Lorg/apache/activemq/transport/Transport;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "connectFailures", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "reconnectDelay", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "reconnectDate", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;Ljava/net/URI;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/DefaultTransportListener", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$000", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)J", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "reconnectDelay", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "uri", "Ljava/net/URI;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onCommand", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/Command");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/command/Command", "isResponse", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/command/Response");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/Response", "getCorrelationId", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Integer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$100", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)Ljava/util/concurrent/ConcurrentMap;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/transport/fanout/FanoutTransport$RequestCounter");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$RequestCounter", "ackCount", "Ljava/util/concurrent/atomic/AtomicInteger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicInteger", "decrementAndGet", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFGT, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$100", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)Ljava/util/concurrent/ConcurrentMap;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/fanout/FanoutTransport", "transportListenerOnCommand", "(Lorg/apache/activemq/command/Command;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/activemq/command/Command", "java/lang/Integer", "org/apache/activemq/transport/fanout/FanoutTransport$RequestCounter"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/fanout/FanoutTransport", "transportListenerOnCommand", "(Lorg/apache/activemq/command/Command;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/fanout/FanoutTransport", "transportListenerOnCommand", "(Lorg/apache/activemq/command/Command;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onException", "(Ljava/io/IOException;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label2, null);
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label1, label7, "java/lang/InterruptedException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label3, label8, label7, "java/lang/InterruptedException");
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$200", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "transport", "Lorg/apache/activemq/transport/Transport;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "transport", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/Transport", "isConnected", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$300", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Transport failed, starting up reconnect task");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "transport", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/util/ServiceSupport", "dispose", "(Lorg/apache/activemq/Service;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "transport", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$410", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$500", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$502", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;)Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$600", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)Lorg/apache/activemq/thread/TaskRunner;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/thread/TaskRunner", "wakeup", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "interrupt", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$700", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)Lorg/apache/activemq/transport/TransportListener;", false);
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "this$0", "Lorg/apache/activemq/transport/fanout/FanoutTransport;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/fanout/FanoutTransport", "access$700", "(Lorg/apache/activemq/transport/fanout/FanoutTransport;)Lorg/apache/activemq/transport/TransportListener;", false);
methodVisitor.visitTypeInsn(NEW, "java/io/InterruptedIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InterruptedIOException", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/transport/TransportListener", "onException", "(Ljava/io/IOException;)V", true);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;)Lorg/apache/activemq/transport/Transport;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "transport", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "reconnectDate", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;)Ljava/net/URI;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "uri", "Ljava/net/URI;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$902", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;Lorg/apache/activemq/transport/Transport;)Lorg/apache/activemq/transport/Transport;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "transport", "Lorg/apache/activemq/transport/Transport;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1202", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "reconnectDelay", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1302", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "connectFailures", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1304", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "connectFailures", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "connectFailures", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1300", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "connectFailures", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "reconnectDelay", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1002", "(Lorg/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler;J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/fanout/FanoutTransport$FanoutTransportHandler", "reconnectDate", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
