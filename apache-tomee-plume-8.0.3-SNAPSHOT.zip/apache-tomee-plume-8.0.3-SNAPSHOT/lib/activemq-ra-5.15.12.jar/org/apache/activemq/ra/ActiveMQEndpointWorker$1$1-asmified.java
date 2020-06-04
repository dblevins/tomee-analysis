package asm.org.apache.activemq.ra;
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
public class ActiveMQEndpointWorker$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", null, "java/lang/Object", new String[] { "jakarta/jms/ExceptionListener" });

classWriter.visitOuterClass("org/apache/activemq/ra/ActiveMQEndpointWorker$1", "run", "()V");

classWriter.visitInnerClass("org/apache/activemq/ra/ActiveMQEndpointWorker$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "onException", "(Ljakarta/jms/JMSException;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1", "this$0", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$400", "(Lorg/apache/activemq/ra/ActiveMQEndpointWorker;)Lorg/apache/activemq/ra/ServerSessionPoolImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ServerSessionPoolImpl", "isClosing", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Connection to broker failed: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/jms/JMSException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1", "this$0", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$100", "(Lorg/apache/activemq/ra/ActiveMQEndpointWorker;)Ljava/util/concurrent/atomic/AtomicBoolean;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "compareAndSet", "(ZZ)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1", "this$0", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$500", "(Lorg/apache/activemq/ra/ActiveMQEndpointWorker;)Ljakarta/resource/spi/work/Work;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1", "this$0", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$600", "(Lorg/apache/activemq/ra/ActiveMQEndpointWorker;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1", "this$0", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$400", "(Lorg/apache/activemq/ra/ActiveMQEndpointWorker;)Lorg/apache/activemq/ra/ServerSessionPoolImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ServerSessionPoolImpl", "closeSessions", "()I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "this$1", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ra/ActiveMQEndpointWorker$1", "this$0", "Lorg/apache/activemq/ra/ActiveMQEndpointWorker;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$700", "(Lorg/apache/activemq/ra/ActiveMQEndpointWorker;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/activemq/ra/ActiveMQEndpointWorker$1$1", "jakarta/jms/JMSException", "java/lang/Object"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/ra/ActiveMQEndpointWorker", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Connection attempt already in progress, ignoring connection exception");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
