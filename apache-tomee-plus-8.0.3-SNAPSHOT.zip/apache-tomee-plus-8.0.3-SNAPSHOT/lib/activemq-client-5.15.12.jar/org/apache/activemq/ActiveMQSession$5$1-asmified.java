package asm.org.apache.activemq;
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
public class ActiveMQSession$5$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/ActiveMQSession$5$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/ActiveMQSession$5", "afterRollback", "()V");

classWriter.visitInnerClass("org/apache/activemq/ActiveMQSession$5", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/ActiveMQSession$5$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/activemq/ActiveMQSession$5;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/ActiveMQSession$5;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "this$0", "Lorg/apache/activemq/ActiveMQSession;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession", "redeliveryGuard", "Ljava/lang/Object;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "this$0", "Lorg/apache/activemq/ActiveMQSession;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession", "connection", "Lorg/apache/activemq/ActiveMQConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQConnection", "isNonBlockingRedelivery", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "val$md", "Lorg/apache/activemq/command/MessageDispatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageDispatch", "getConsumer", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/ActiveMQDispatcher");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "val$md", "Lorg/apache/activemq/command/MessageDispatch;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/ActiveMQDispatcher", "dispatch", "(Lorg/apache/activemq/command/MessageDispatch;)V", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "val$afterDeliveryError", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "get", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "val$md", "Lorg/apache/activemq/command/MessageDispatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/command/MessageDispatch", "getConsumer", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/ActiveMQDispatcher");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "val$md", "Lorg/apache/activemq/command/MessageDispatch;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/activemq/ActiveMQDispatcher", "dispatch", "(Lorg/apache/activemq/command/MessageDispatch;)V", true);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "this$0", "Lorg/apache/activemq/ActiveMQSession;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession", "executor", "Lorg/apache/activemq/ActiveMQSessionExecutor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "val$md", "Lorg/apache/activemq/command/MessageDispatch;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQSessionExecutor", "executeFirst", "(Lorg/apache/activemq/command/MessageDispatch;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5$1", "this$1", "Lorg/apache/activemq/ActiveMQSession$5;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession$5", "this$0", "Lorg/apache/activemq/ActiveMQSession;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/ActiveMQSession", "executor", "Lorg/apache/activemq/ActiveMQSessionExecutor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ActiveMQSessionExecutor", "start", "()V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
