package asm.org.apache.cxf.phase;
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
public class PhaseInterceptorChain$InterceptorHolderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "org/apache/cxf/phase/PhaseInterceptorChain", "InterceptorHolder", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "interceptor", "Lorg/apache/cxf/phase/PhaseInterceptor;", "Lorg/apache/cxf/phase/PhaseInterceptor<+Lorg/apache/cxf/message/Message;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "next", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "prev", "Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "phaseIdx", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/phase/PhaseInterceptor;I)V", "(Lorg/apache/cxf/phase/PhaseInterceptor<+Lorg/apache/cxf/message/Message;>;I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "interceptor", "Lorg/apache/cxf/phase/PhaseInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "phaseIdx", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "interceptor", "Lorg/apache/cxf/phase/PhaseInterceptor;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "interceptor", "Lorg/apache/cxf/phase/PhaseInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "phaseIdx", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/phase/PhaseInterceptorChain$InterceptorHolder", "phaseIdx", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
