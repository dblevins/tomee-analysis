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
public class Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "Ljava/lang/Object;Ljava/nio/channels/CompletionHandler<Ljava/lang/Long;[Ljava/nio/ByteBuffer;>;", "java/lang/Object", new String[] { "java/nio/channels/CompletionHandler" });

classWriter.visitOuterClass("org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState", "run", "()V");

classWriter.visitInnerClass("org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper", "org/apache/tomcat/util/net/Nio2Endpoint", "Nio2SocketWrapper", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState", "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper", "Nio2OperationState", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", null, null, 0);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler", "org/apache/tomcat/util/net/SocketWrapperBase", "VectoredIOCompletionHandler", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "org/apache/tomcat/util/net/SocketWrapperBase", "OperationState", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "this$1", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "completed", "(Ljava/lang/Long;[Ljava/nio/ByteBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Long", "longValue", "()J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/io/EOFException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/EOFException", "<init>", "()V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "failed", "(Ljava/lang/Throwable;[Ljava/nio/ByteBuffer;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/SocketWrapperBase", "buffersArrayHasRemaining", "([Ljava/nio/ByteBuffer;II)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "this$1", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState", "this$0", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper", "getSocket", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/net/Nio2Channel");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "this$1", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState", "this$0", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper", "getWriteTimeout", "()J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/AbstractEndpoint", "toTimeout", "(J)J", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/concurrent/TimeUnit", "MILLISECONDS", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Channel", "write", "([Ljava/nio/ByteBuffer;IIJLjava/util/concurrent/TimeUnit;Ljava/lang/Object;Ljava/nio/channels/CompletionHandler;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "this$1", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState", "process", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "failed", "(Ljava/lang/Throwable;[Ljava/nio/ByteBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "this$1", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState", "completion", "Lorg/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "this$1", "Lorg/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler", "failed", "(Ljava/lang/Throwable;Lorg/apache/tomcat/util/net/SocketWrapperBase$OperationState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "failed", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "failed", "(Ljava/lang/Throwable;[Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "completed", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Long");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/nio/ByteBuffer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/Nio2Endpoint$Nio2SocketWrapper$Nio2OperationState$1", "completed", "(Ljava/lang/Long;[Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
