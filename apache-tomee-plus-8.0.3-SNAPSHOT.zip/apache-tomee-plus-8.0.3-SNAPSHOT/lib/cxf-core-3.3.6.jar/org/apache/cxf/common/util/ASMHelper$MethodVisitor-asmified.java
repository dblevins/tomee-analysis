package asm.org.apache.cxf.common.util;
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
public class ASMHelper$MethodVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/common/util/ASMHelper$MethodVisitor", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/common/util/ASMHelper$Label", "org/apache/cxf/common/util/ASMHelper", "Label", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ReflectionInvokationHandler$UnwrapParam", "org/apache/cxf/common/util/ReflectionInvokationHandler", "UnwrapParam", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ReflectionInvokationHandler$Optional", "org/apache/cxf/common/util/ReflectionInvokationHandler", "Optional", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ASMHelper$AnnotationVisitor", "org/apache/cxf/common/util/ASMHelper", "AnnotationVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn", "org/apache/cxf/common/util/ReflectionInvokationHandler", "WrapReturn", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ASMHelper$MethodVisitor", "org/apache/cxf/common/util/ASMHelper", "MethodVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitEnd", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitLabel", "(Lorg/apache/cxf/common/util/ASMHelper$Label;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/cxf/common/util/ReflectionInvokationHandler$UnwrapParam;", true);
annotationVisitor0.visit("typeMethodName", "realType");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitMaxs", "(II)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitLineNumber", "(ILorg/apache/cxf/common/util/ASMHelper$Label;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/apache/cxf/common/util/ReflectionInvokationHandler$UnwrapParam;", true);
annotationVisitor0.visit("typeMethodName", "realType");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitInsn", "(I)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitVarInsn", "(II)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitCode", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitLdcInsn", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitLocalVariable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/apache/cxf/common/util/ASMHelper$Label;Lorg/apache/cxf/common/util/ASMHelper$Label;I)V", null, null);
methodVisitor.visitAnnotableParameterCount(6, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Lorg/apache/cxf/common/util/ReflectionInvokationHandler$UnwrapParam;", true);
annotationVisitor0.visit("typeMethodName", "realType");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Lorg/apache/cxf/common/util/ReflectionInvokationHandler$UnwrapParam;", true);
annotationVisitor0.visit("typeMethodName", "realType");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitTypeInsn", "(ILjava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitMethodInsn", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", null, null);
methodVisitor.visitAnnotableParameterCount(5, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Lorg/apache/cxf/common/util/ReflectionInvokationHandler$Optional;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitIntInsn", "(II)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitIincInsn", "(II)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitFieldInsn", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitJumpInsn", "(ILorg/apache/cxf/common/util/ASMHelper$Label;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Lorg/apache/cxf/common/util/ReflectionInvokationHandler$UnwrapParam;", true);
annotationVisitor0.visit("typeMethodName", "realType");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitFrame", "(II[Ljava/lang/Object;I[Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/apache/cxf/common/util/ASMHelper$AnnotationVisitor;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/common/util/ASMHelper$AnnotationVisitor;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
