package asm.org.apache.tomcat.util.net;
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
public class NioBlockingSelector$BlockPoller$RunnableAddDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper", "org/apache/tomcat/util/net/NioEndpoint", "NioSocketWrapper", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/net/NioBlockingSelector$KeyReference", "org/apache/tomcat/util/net/NioBlockingSelector", "KeyReference", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller", "org/apache/tomcat/util/net/NioBlockingSelector", "BlockPoller", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller", "RunnableAdd", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ch", "Ljava/nio/channels/SocketChannel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "key", "Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ops", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ref", "Lorg/apache/tomcat/util/net/NioBlockingSelector$KeyReference;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;Ljava/nio/channels/SocketChannel;Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;ILorg/apache/tomcat/util/net/NioBlockingSelector$KeyReference;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "this$0", "Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ch", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "key", "Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ops", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ref", "Lorg/apache/tomcat/util/net/NioBlockingSelector$KeyReference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
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
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/nio/channels/ClosedChannelException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ch", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "this$0", "Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller", "selector", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "keyFor", "(Ljava/nio/channels/Selector;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ch", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "this$0", "Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller", "selector", "Ljava/nio/channels/Selector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ops", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "key", "Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "register", "(Ljava/nio/channels/Selector;ILjava/lang/Object;)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ref", "Lorg/apache/tomcat/util/net/NioBlockingSelector$KeyReference;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$KeyReference", "key", "Ljava/nio/channels/SelectionKey;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/nio/channels/SelectionKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SelectionKey", "isValid", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "this$0", "Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "key", "Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ops", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller", "cancel", "(Ljava/nio/channels/SelectionKey;Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;I)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SelectionKey", "interestOps", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ops", "I");
methodVisitor.visitInsn(IOR);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SelectionKey", "interestOps", "(I)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/CancelledKeyException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "this$0", "Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "key", "Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ops", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller", "cancel", "(Ljava/nio/channels/SelectionKey;Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;I)V", false);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/ClosedChannelException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "this$0", "Lorg/apache/tomcat/util/net/NioBlockingSelector$BlockPoller;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "key", "Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller$RunnableAdd", "ops", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/NioBlockingSelector$BlockPoller", "cancel", "(Ljava/nio/channels/SelectionKey;Lorg/apache/tomcat/util/net/NioEndpoint$NioSocketWrapper;I)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
