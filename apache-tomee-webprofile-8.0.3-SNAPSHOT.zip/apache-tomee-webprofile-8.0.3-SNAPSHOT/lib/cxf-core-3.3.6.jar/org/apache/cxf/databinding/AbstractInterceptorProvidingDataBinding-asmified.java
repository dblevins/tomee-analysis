package asm.org.apache.cxf.databinding;
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
public class AbstractInterceptorProvidingDataBindingDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", null, "org/apache/cxf/databinding/AbstractDataBinding", new String[] { "org/apache/cxf/interceptor/InterceptorProvider" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "inInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "outInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "outFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "inFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/databinding/AbstractDataBinding", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "inInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "outInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "outFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/util/ModCountCopyOnWriteArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "inFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInInterceptors", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "inInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOutInterceptors", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "outInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInFaultInterceptors", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "inFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOutFaultInterceptors", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/cxf/interceptor/Interceptor<+Lorg/apache/cxf/message/Message;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/databinding/AbstractInterceptorProvidingDataBinding", "outFaultInterceptors", "Lorg/apache/cxf/common/util/ModCountCopyOnWriteArrayList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
