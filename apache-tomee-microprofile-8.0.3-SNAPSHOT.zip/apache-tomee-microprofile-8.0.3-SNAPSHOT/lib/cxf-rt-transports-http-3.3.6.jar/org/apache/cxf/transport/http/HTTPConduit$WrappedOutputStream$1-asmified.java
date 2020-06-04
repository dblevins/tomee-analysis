package asm.org.apache.cxf.transport.http;
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
public class HTTPConduit$WrappedOutputStream$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "handleResponseOnWorkqueue", "(ZZ)V");

classWriter.visitInnerClass("org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "org/apache/cxf/transport/http/HTTPConduit", "WrappedOutputStream", ACC_PROTECTED | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "handleResponseInternal", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getInterceptorChain", "()Lorg/apache/cxf/interceptor/InterceptorChain;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/phase/PhaseInterceptorChain");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain", "abort", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Exception;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "setContent", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getInterceptorChain", "()Lorg/apache/cxf/interceptor/InterceptorChain;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/phase/PhaseInterceptorChain");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain", "unwind", "(Lorg/apache/cxf/message/Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getInterceptorChain", "()Lorg/apache/cxf/interceptor/InterceptorChain;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/interceptor/InterceptorChain", "getFaultObserver", "()Lorg/apache/cxf/transport/MessageObserver;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transport/MessageObserver;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/MessageObserver");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Throwable", "org/apache/cxf/transport/MessageObserver"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream$1", "this$1", "Lorg/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HTTPConduit$WrappedOutputStream", "outMessage", "Lorg/apache/cxf/message/Message;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/transport/MessageObserver", "onMessage", "(Lorg/apache/cxf/message/Message;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
