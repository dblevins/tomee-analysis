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
public class ResponseTimeMessageOutInterceptor$EndingInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor$EndingInterceptor", "Lorg/apache/cxf/phase/AbstractPhaseInterceptor<Lorg/apache/cxf/message/Message;>;", "org/apache/cxf/phase/AbstractPhaseInterceptor", null);

classWriter.visitInnerClass("org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor$EndingInterceptor", "org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor", "EndingInterceptor", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor$EndingInterceptor", "this$0", "Lorg/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("prepare-send-ending");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/phase/AbstractPhaseInterceptor", "<init>", "(Ljava/lang/String;)V", false);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor$EndingInterceptor", "this$0", "Lorg/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor", "endHandlingMessage", "(Lorg/apache/cxf/message/Exchange;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleFault", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor$EndingInterceptor", "this$0", "Lorg/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/management/interceptor/ResponseTimeMessageOutInterceptor", "endHandlingMessage", "(Lorg/apache/cxf/message/Exchange;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
