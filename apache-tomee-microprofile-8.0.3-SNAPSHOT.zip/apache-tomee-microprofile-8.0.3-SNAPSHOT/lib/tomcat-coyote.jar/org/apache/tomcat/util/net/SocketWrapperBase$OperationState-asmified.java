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
public class SocketWrapperBase$OperationStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "<A:Ljava/lang/Object;>Ljava/lang/Object;Ljava/lang/Runnable;", "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$BlockingMode", "org/apache/tomcat/util/net/SocketWrapperBase", "BlockingMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck", "org/apache/tomcat/util/net/SocketWrapperBase", "CompletionCheck", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler", "org/apache/tomcat/util/net/SocketWrapperBase", "VectoredIOCompletionHandler", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$CompletionState", "org/apache/tomcat/util/net/SocketWrapperBase", "CompletionState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "org/apache/tomcat/util/net/SocketWrapperBase", "OperationState", ACC_PROTECTED | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "read", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "buffers", "[Ljava/nio/ByteBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "offset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "length", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "attachment", "Ljava/lang/Object;", "TA;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "timeout", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "unit", "Ljava/util/concurrent/TimeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "block", "Lorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "check", "Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "handler", "Ljava/nio/channels/CompletionHandler;", "Ljava/nio/channels/CompletionHandler<Ljava/lang/Long;-TA;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "semaphore", "Ljava/util/concurrent/Semaphore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "completion", "Lorg/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler;", "Lorg/apache/tomcat/util/net/SocketWrapperBase<TE;>.VectoredIOCompletionHandler<TA;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "callHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_VOLATILE, "nBytes", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_VOLATILE, "state", "Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "completionDone", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/net/SocketWrapperBase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/tomcat/util/net/SocketWrapperBase;Z[Ljava/nio/ByteBuffer;IILorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;JLjava/util/concurrent/TimeUnit;Ljava/lang/Object;Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;Ljava/nio/channels/CompletionHandler;Ljava/util/concurrent/Semaphore;Lorg/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler;)V", "(Z[Ljava/nio/ByteBuffer;IILorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;JLjava/util/concurrent/TimeUnit;TA;Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;Ljava/nio/channels/CompletionHandler<Ljava/lang/Long;-TA;>;Ljava/util/concurrent/Semaphore;Lorg/apache/tomcat/util/net/SocketWrapperBase<TE;>.VectoredIOCompletionHandler<TA;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "this$0", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "nBytes", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketWrapperBase$CompletionState", "PENDING", "Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionState;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "state", "Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "completionDone", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "read", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "buffers", "[Ljava/nio/ByteBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "length", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "block", "Lorg/apache/tomcat/util/net/SocketWrapperBase$BlockingMode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "timeout", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "unit", "Ljava/util/concurrent/TimeUnit;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "attachment", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "check", "Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "handler", "Ljava/nio/channels/CompletionHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "semaphore", "Ljava/util/concurrent/Semaphore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "completion", "Lorg/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 12);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicBoolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicBoolean", "<init>", "(Z)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 14, new Object[] {"org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "org/apache/tomcat/util/net/SocketWrapperBase", Opcodes.INTEGER, "[Ljava/nio/ByteBuffer;", Opcodes.INTEGER, Opcodes.INTEGER, "org/apache/tomcat/util/net/SocketWrapperBase$BlockingMode", Opcodes.LONG, "java/util/concurrent/TimeUnit", "java/lang/Object", "org/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck", "java/nio/channels/CompletionHandler", "java/util/concurrent/Semaphore", "org/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler"}, 1, new Object[] {"org/apache/tomcat/util/net/SocketWrapperBase$OperationState"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 14, new Object[] {"org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "org/apache/tomcat/util/net/SocketWrapperBase", Opcodes.INTEGER, "[Ljava/nio/ByteBuffer;", Opcodes.INTEGER, Opcodes.INTEGER, "org/apache/tomcat/util/net/SocketWrapperBase$BlockingMode", Opcodes.LONG, "java/util/concurrent/TimeUnit", "java/lang/Object", "org/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck", "java/nio/channels/CompletionHandler", "java/util/concurrent/Semaphore", "org/apache/tomcat/util/net/SocketWrapperBase$VectoredIOCompletionHandler"}, 2, new Object[] {"org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "java/util/concurrent/atomic/AtomicBoolean"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "callHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "isInline", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "process", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/util/concurrent/RejectedExecutionException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "this$0", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase", "getEndpoint", "()Lorg/apache/tomcat/util/net/AbstractEndpoint;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/AbstractEndpoint", "getExecutor", "()Ljava/util/concurrent/Executor;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Executor", "execute", "(Ljava/lang/Runnable;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/concurrent/RejectedExecutionException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/SocketWrapperBase", "access$000", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketWrapperBase", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("endpoint.executor.fail");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "this$0", "Lorg/apache/tomcat/util/net/SocketWrapperBase;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/ExceptionUtils", "handleThrowable", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/SocketWrapperBase", "access$000", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SocketWrapperBase", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("endpoint.process.fail");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "start", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SocketWrapperBase$OperationState", "run", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "end", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
