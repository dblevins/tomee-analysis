package asm.org.apache.tomcat.websocket;
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
public class AsyncChannelWrapperSecure$WriteTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture", "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "WrapperFuture", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "WriteTask", ACC_PRIVATE);

classWriter.visitInnerClass("javax/net/ssl/SSLEngineResult$Status", "javax/net/ssl/SSLEngineResult", "Status", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/net/ssl/SSLEngineResult$HandshakeStatus", "javax/net/ssl/SSLEngineResult", "HandshakeStatus", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "srcs", "[Ljava/nio/ByteBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "offset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "length", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "future", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture;", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture<Ljava/lang/Long;*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;[Ljava/nio/ByteBuffer;IILorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture;)V", "([Ljava/nio/ByteBuffer;IILorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture<Ljava/lang/Long;*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "srcs", "[Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "future", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "length", "I");
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "offset", "I");
methodVisitor.visitVarInsn(ISTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "length", "I");
methodVisitor.visitInsn(IADD);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "srcs", "[Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/nio/ByteBuffer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "hasRemaining", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$100", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "clear", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$200", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljavax/net/ssl/SSLEngine;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$100", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "wrap", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngineResult", "bytesConsumed", "()I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitVarInsn(LSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngineResult", "getStatus", "()Ljavax/net/ssl/SSLEngineResult$Status;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/net/ssl/SSLEngineResult$Status", "OK", "Ljavax/net/ssl/SSLEngineResult$Status;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/net/ssl/SSLEngineResult$Status", "BUFFER_OVERFLOW", "Ljavax/net/ssl/SSLEngineResult$Status;");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label8);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/net/ssl/SSLEngineResult", "javax/net/ssl/SSLEngineResult$Status"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$300", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitLdcInsn("asyncChannelWrapperSecure.statusWrap");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngineResult", "getHandshakeStatus", "()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/net/ssl/SSLEngineResult$HandshakeStatus", "NEED_TASK", "Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$200", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljavax/net/ssl/SSLEngine;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "getDelegatedTask", "()Ljava/lang/Runnable;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Runnable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Runnable", "run", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$200", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljavax/net/ssl/SSLEngine;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngine", "getDelegatedTask", "()Ljava/lang/Runnable;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$100", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/ByteBuffer", "flip", "()Ljava/nio/Buffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLEngineResult", "bytesProduced", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label11 = new Label();
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFLE, label12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$400", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljava/nio/channels/AsynchronousSocketChannel;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$100", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/channels/AsynchronousSocketChannel", "write", "(Ljava/nio/ByteBuffer;)Ljava/util/concurrent/Future;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Future", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$500", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljava/util/concurrent/atomic/AtomicBoolean;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "compareAndSet", "(ZZ)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "future", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture", "complete", "(Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "future", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture;");
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$300", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitLdcInsn("asyncChannelWrapperSecure.wrongStateWrite");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture", "fail", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label14 = new Label();
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "this$0", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure", "access$500", "(Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure;)Ljava/util/concurrent/atomic/AtomicBoolean;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicBoolean", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WriteTask", "future", "Lorg/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/websocket/AsyncChannelWrapperSecure$WrapperFuture", "fail", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
