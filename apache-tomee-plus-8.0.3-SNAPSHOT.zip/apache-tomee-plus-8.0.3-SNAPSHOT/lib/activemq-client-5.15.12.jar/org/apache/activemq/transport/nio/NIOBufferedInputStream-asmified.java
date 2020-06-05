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
public class NIOBufferedInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/transport/nio/NIOBufferedInputStream", null, "java/io/InputStream", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BUFFER_SIZE", "I", null, new Integer(8192));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sc", "Ljava/nio/channels/SocketChannel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bb", "Ljava/nio/ByteBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rs", "Ljava/nio/channels/Selector;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/nio/channels/ReadableByteChannel;I)V", null, new String[] { "java/nio/channels/ClosedChannelException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Buffer size <= 0");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/activemq/transport/nio/NIOBufferedInputStream", "java/nio/channels/ReadableByteChannel", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/ByteBuffer", "allocateDirect", "(I)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/nio/channels/SocketChannel");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "configureBlocking", "(Z)Ljava/nio/channels/SelectableChannel;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/channels/Selector", "open", "()Ljava/nio/channels/Selector;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "register", "(Ljava/nio/channels/Selector;I)Ljava/nio/channels/SelectionKey;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/nio/channels/ReadableByteChannel;)V", null, new String[] { "java/nio/channels/ClosedChannelException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 8192);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "<init>", "(Ljava/nio/channels/ReadableByteChannel;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "available", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "isOpen", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Input Stream Closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "isOpen", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "isOpen", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "socket", "()Ljava/net/Socket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/Socket", "shutdownInput", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "socket", "()Ljava/net/Socket;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/Socket", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/nio/channels/ClosedChannelException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "isOpen", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Input Stream Closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "hasRemaining", "()Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "fill", "(I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/ClosedChannelException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "close", "()V", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "get", "()B", false);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "([BII)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/nio/channels/ClosedChannelException");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "isOpen", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Input Stream Closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_M1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "hasRemaining", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "get", "([BII)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "fill", "(I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/ClosedChannelException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "close", "()V", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skip", "(J)J", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/nio/channels/ClosedChannelException");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "isOpen", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Input Stream Closed");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LCMP);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFGT, label5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "()I", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(L2I);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "limit", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "position", "(I)Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(L2I);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "fill", "(I)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/nio/channels/ClosedChannelException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "close", "()V", false);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fill", "(I)V", null, new String[] { "java/io/IOException", "java/nio/channels/ClosedChannelException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "compact", "()Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 1);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "sc", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "read", "(Ljava/nio/ByteBuffer;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitTypeInsn(NEW, "java/nio/channels/ClosedChannelException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/nio/channels/ClosedChannelException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFGT, label6);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "select", "(J)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "rs", "Ljava/nio/channels/Selector;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/Selector", "selectedKeys", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "clear", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/nio/NIOBufferedInputStream", "bb", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}