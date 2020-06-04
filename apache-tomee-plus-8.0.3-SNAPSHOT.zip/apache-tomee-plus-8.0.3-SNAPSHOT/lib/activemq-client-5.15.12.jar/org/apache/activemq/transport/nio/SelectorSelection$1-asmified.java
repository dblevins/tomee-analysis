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
public class SelectorSelection$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/transport/nio/SelectorSelection$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/transport/nio/SelectorSelection", "<init>", "(Lorg/apache/activemq/transport/nio/SelectorWorker;Ljava/nio/channels/spi/AbstractSelectableChannel;Lorg/apache/activemq/transport/nio/SelectorManager$Listener;)V");

classWriter.visitInnerClass("org/apache/activemq/transport/nio/SelectorSelection$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/transport/nio/SelectorManager$Listener", "org/apache/activemq/transport/nio/SelectorManager", "Listener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$selectable", "Ljava/nio/channels/spi/AbstractSelectableChannel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$worker", "Lorg/apache/activemq/transport/nio/SelectorWorker;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/transport/nio/SelectorSelection;Ljava/nio/channels/spi/AbstractSelectableChannel;Lorg/apache/activemq/transport/nio/SelectorWorker;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "val$selectable", "Ljava/nio/channels/spi/AbstractSelectableChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "val$worker", "Lorg/apache/activemq/transport/nio/SelectorWorker;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "val$selectable", "Ljava/nio/channels/spi/AbstractSelectableChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "val$worker", "Lorg/apache/activemq/transport/nio/SelectorWorker;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorWorker", "selector", "Ljava/nio/channels/Selector;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/spi/AbstractSelectableChannel", "register", "(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/transport/nio/SelectorSelection", "access$002", "(Lorg/apache/activemq/transport/nio/SelectorSelection;Ljava/nio/channels/SelectionKey;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/SelectorSelection$1", "this$0", "Lorg/apache/activemq/transport/nio/SelectorSelection;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/SelectorSelection", "onError", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
