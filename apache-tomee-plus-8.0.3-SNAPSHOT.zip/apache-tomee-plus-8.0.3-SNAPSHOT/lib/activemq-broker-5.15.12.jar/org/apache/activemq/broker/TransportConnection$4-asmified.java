package asm.org.apache.activemq.broker;
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
public class TransportConnection$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/broker/TransportConnection$4", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/broker/TransportConnection", "stopAsync", "()V");

classWriter.visitInnerClass("org/apache/activemq/broker/TransportConnection$4", null, null, 0);

classWriter.visitInnerClass("java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "java/util/concurrent/locks/ReentrantReadWriteLock", "WriteLock", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/broker/TransportConnection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/broker/TransportConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
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
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$000", "(Lorg/apache/activemq/broker/TransportConnection;)Ljava/util/concurrent/locks/ReentrantReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/broker/TransportConnection", "doStop", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$300", "(Lorg/apache/activemq/broker/TransportConnection;)Ljava/util/concurrent/CountDownLatch;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$000", "(Lorg/apache/activemq/broker/TransportConnection;)Ljava/util/concurrent/locks/ReentrantReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$200", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Error occurred while shutting down a connection {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$300", "(Lorg/apache/activemq/broker/TransportConnection;)Ljava/util/concurrent/CountDownLatch;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$000", "(Lorg/apache/activemq/broker/TransportConnection;)Ljava/util/concurrent/locks/ReentrantReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$300", "(Lorg/apache/activemq/broker/TransportConnection;)Ljava/util/concurrent/CountDownLatch;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/CountDownLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/broker/TransportConnection$4", "this$0", "Lorg/apache/activemq/broker/TransportConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/broker/TransportConnection", "access$000", "(Lorg/apache/activemq/broker/TransportConnection;)Ljava/util/concurrent/locks/ReentrantReadWriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock", "writeLock", "()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
