package asm.org.apache.cxf.management.interceptor;
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
public class ResponseTimeMessageInvokerInterceptor$ResponseTimeMessageInvokerEndingInteceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor$ResponseTimeMessageInvokerEndingInteceptor", null, "org/apache/cxf/management/interceptor/AbstractMessageResponseTimeInterceptor", null);

classWriter.visitInnerClass("org/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor$ResponseTimeMessageInvokerEndingInteceptor", "org/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor", "ResponseTimeMessageInvokerEndingInteceptor", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor$ResponseTimeMessageInvokerEndingInteceptor", "this$0", "Lorg/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("invoke");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/management/interceptor/AbstractMessageResponseTimeInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/interceptor/ServiceInvokerInterceptor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor$ResponseTimeMessageInvokerEndingInteceptor", "addAfter", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "isOneWay", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor$ResponseTimeMessageInvokerEndingInteceptor", "isClient", "(Lorg/apache/cxf/message/Message;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/management/interceptor/ResponseTimeMessageInvokerInterceptor$ResponseTimeMessageInvokerEndingInteceptor", "setOneWayMessage", "(Lorg/apache/cxf/message/Exchange;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/message/Exchange"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
