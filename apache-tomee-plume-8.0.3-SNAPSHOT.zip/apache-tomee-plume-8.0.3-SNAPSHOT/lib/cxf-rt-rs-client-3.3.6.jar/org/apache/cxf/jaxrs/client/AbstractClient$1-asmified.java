package asm.org.apache.cxf.jaxrs.client;
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
public class AbstractClient$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/cxf/jaxrs/client/AbstractClient$1", null, "org/apache/cxf/interceptor/InFaultChainInitiatorObserver", null);

classWriter.visitOuterClass("org/apache/cxf/jaxrs/client/AbstractClient", "setupInFaultObserver", "(Lorg/apache/cxf/jaxrs/client/ClientConfiguration;)Lorg/apache/cxf/transport/MessageObserver;");

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/AbstractClient$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/AbstractClient$ConnectionFaultInterceptor", "org/apache/cxf/jaxrs/client/AbstractClient", "ConnectionFaultInterceptor", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$cfg", "Lorg/apache/cxf/jaxrs/client/ClientConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/jaxrs/client/ClientConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/client/AbstractClient$1", "val$cfg", "Lorg/apache/cxf/jaxrs/client/ClientConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/InFaultChainInitiatorObserver", "<init>", "(Lorg/apache/cxf/Bus;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeInterceptors", "(Lorg/apache/cxf/message/Exchange;Lorg/apache/cxf/phase/PhaseInterceptorChain;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/client/AbstractClient$1", "val$cfg", "Lorg/apache/cxf/jaxrs/client/ClientConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/ClientConfiguration", "getInFaultInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain", "add", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/AbstractClient$ConnectionFaultInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/AbstractClient$ConnectionFaultInterceptor", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/phase/PhaseInterceptorChain", "add", "(Lorg/apache/cxf/interceptor/Interceptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
