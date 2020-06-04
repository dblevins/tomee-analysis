package asm.org.apache.cxf.jaxws.handler;
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
public class AbstractProtocolHandlerInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/jaxws/handler/AbstractProtocolHandlerInterceptor", "<T::Lorg/apache/cxf/message/Message;>Lorg/apache/cxf/jaxws/handler/AbstractJAXWSHandlerInterceptor<TT;>;", "org/apache/cxf/jaxws/handler/AbstractJAXWSHandlerInterceptor", null);

classWriter.visitInnerClass("javax/xml/ws/handler/MessageContext$Scope", "javax/xml/ws/handler/MessageContext", "Scope", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/xml/ws/Binding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("user-protocol");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/handler/AbstractJAXWSHandlerInterceptor", "<init>", "(Ljavax/xml/ws/Binding;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljavax/xml/ws/Binding;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/handler/AbstractJAXWSHandlerInterceptor", "<init>", "(Ljavax/xml/ws/Binding;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", "(TT;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/handler/AbstractProtocolHandlerInterceptor", "binding", "Ljavax/xml/ws/Binding;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/ws/Binding", "getHandlerChain", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/handler/AbstractProtocolHandlerInterceptor", "createProtocolMessageContext", "(Lorg/apache/cxf/message/Message;)Ljavax/xml/ws/handler/MessageContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/handler/AbstractProtocolHandlerInterceptor", "getInvoker", "(Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/jaxws/handler/HandlerChainInvoker;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/handler/HandlerChainInvoker", "setProtocolMessageContext", "(Ljavax/xml/ws/handler/MessageContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/handler/AbstractProtocolHandlerInterceptor", "isRequestor", "(Lorg/apache/cxf/message/Message;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/handler/HandlerChainInvoker", "invokeProtocolHandlers", "(ZLjavax/xml/ws/handler/MessageContext;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/handler/AbstractProtocolHandlerInterceptor", "onCompletion", "(Lorg/apache/cxf/message/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createProtocolMessageContext", "(Lorg/apache/cxf/message/Message;)Ljavax/xml/ws/handler/MessageContext;", "(TT;)Ljavax/xml/ws/handler/MessageContext;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxws/context/WrappedMessageContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/ws/handler/MessageContext$Scope", "HANDLER", "Ljavax/xml/ws/handler/MessageContext$Scope;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/context/WrappedMessageContext", "<init>", "(Lorg/apache/cxf/message/Message;Ljavax/xml/ws/handler/MessageContext$Scope;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
