package asm.org.apache.activemq.transport.tcp;
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
public class TcpTransportServer$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/tcp/TcpTransportServer$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/transport/tcp/TcpTransportServer", "doStart", "()V");

classWriter.visitInnerClass("org/apache/activemq/transport/tcp/TcpTransportServer$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/tcp/TcpTransportServer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
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
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/InterruptedException");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportServer", "isStopped", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportServer", "isStopping", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer", "socketQueue", "Ljava/util/concurrent/BlockingQueue;");
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "SECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "poll", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/Socket");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportServer", "handleSocket", "(Ljava/net/Socket;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/activemq/transport/tcp/TcpTransportServer$1", "java/net/Socket"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportServer", "isStopping", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitTypeInsn(NEW, "java/lang/Exception");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Exception", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/tcp/TcpTransportServer", "access$000", "(Lorg/apache/activemq/transport/tcp/TcpTransportServer;Ljava/lang/Exception;)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportServer", "isStopped", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/tcp/TcpTransportServer", "access$100", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Unexpected error thrown during accept handling: ");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitTypeInsn(NEW, "java/lang/Exception");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Exception", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/tcp/TcpTransportServer", "access$200", "(Lorg/apache/activemq/transport/tcp/TcpTransportServer;Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportServer", "isStopped", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/tcp/TcpTransportServer", "isStopping", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/InterruptedException"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/tcp/TcpTransportServer", "access$100", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("socketQueue interrupted - stopping");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransportServer$1", "this$0", "Lorg/apache/activemq/transport/tcp/TcpTransportServer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/tcp/TcpTransportServer", "access$300", "(Lorg/apache/activemq/transport/tcp/TcpTransportServer;Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
