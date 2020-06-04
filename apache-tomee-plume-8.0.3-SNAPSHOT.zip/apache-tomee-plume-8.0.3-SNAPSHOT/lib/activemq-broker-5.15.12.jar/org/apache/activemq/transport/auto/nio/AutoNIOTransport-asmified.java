package asm.org.apache.activemq.transport.auto.nio;
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
public class AutoNIOTransportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", null, "org/apache/activemq/transport/nio/NIOTransport", null);

classWriter.visitInnerClass("org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "org/apache/activemq/transport/tcp/TcpTransport", "InitBuffer", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "doneInitBuffer", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOTransport", "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "doneInitBuffer", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOTransport", "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljava/net/Socket;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "doneInitBuffer", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljavax/net/SocketFactory;Ljava/net/URI;Ljava/net/URI;)V", null, new String[] { "java/net/UnknownHostException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/transport/nio/NIOTransport", "<init>", "(Lorg/apache/activemq/wireformat/WireFormat;Ljavax/net/SocketFactory;Ljava/net/URI;Ljava/net/URI;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "doneInitBuffer", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "readFromBuffer", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "doneInitBuffer", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "initBuffer", "Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "initBuffer", "Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "readSize", "I");
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Protocol type could not be determined.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "nextFrameSize", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "initBuffer", "Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "buffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "initBuffer", "Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "buffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "remaining", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Protocol type could not be determined.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "currentBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "initBuffer", "Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "buffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "get", "()B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_4);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "currentBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "initBuffer", "Lorg/apache/activemq/transport/tcp/TcpTransport$InitBuffer;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/tcp/TcpTransport$InitBuffer", "buffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "get", "()B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "put", "(B)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "doneInitBuffer", "Z");
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "channel", "Ljava/nio/channels/SocketChannel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/transport/auto/nio/AutoNIOTransport", "currentBuffer", "Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/SocketChannel", "read", "(Ljava/nio/ByteBuffer;)I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
