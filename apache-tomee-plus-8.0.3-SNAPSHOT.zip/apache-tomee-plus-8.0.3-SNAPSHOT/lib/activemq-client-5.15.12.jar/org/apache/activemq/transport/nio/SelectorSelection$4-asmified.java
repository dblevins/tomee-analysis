package asm.org.apache.activemq.transport.nio;
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
public class SelectorSelection$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/nio/SelectorSelection$4", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/transport/nio/SelectorSelection", "close", "()V");

classWriter.visitInnerClass("org/apache/activemq/transport/nio/SelectorSelection$4", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/nio/SelectorSelection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/SelectorSelection$4", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/nio/channels/CancelledKeyException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$4", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/nio/SelectorSelection", "access$000", "(Lorg/apache/activemq/transport/nio/SelectorSelection;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SelectionKey", "cancel", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$4", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/nio/SelectorSelection", "access$200", "(Lorg/apache/activemq/transport/nio/SelectorSelection;)Lorg/apache/activemq/transport/nio/SelectorWorker;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/SelectorWorker", "release", "()V", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/CancelledKeyException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$4", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/nio/SelectorSelection", "access$200", "(Lorg/apache/activemq/transport/nio/SelectorSelection;)Lorg/apache/activemq/transport/nio/SelectorWorker;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/SelectorWorker", "release", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$4", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/nio/SelectorSelection", "access$200", "(Lorg/apache/activemq/transport/nio/SelectorSelection;)Lorg/apache/activemq/transport/nio/SelectorWorker;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/SelectorWorker", "release", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
