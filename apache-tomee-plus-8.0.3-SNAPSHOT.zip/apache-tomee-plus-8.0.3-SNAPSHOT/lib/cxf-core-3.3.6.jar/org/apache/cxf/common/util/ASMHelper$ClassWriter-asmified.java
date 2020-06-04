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
public class ASMHelper$ClassWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/common/util/ASMHelper$ClassWriter", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/common/util/ASMHelper$AnnotationVisitor", "org/apache/cxf/common/util/ASMHelper", "AnnotationVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn", "org/apache/cxf/common/util/ReflectionInvokationHandler", "WrapReturn", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ASMHelper$FieldVisitor", "org/apache/cxf/common/util/ASMHelper", "FieldVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ASMHelper$MethodVisitor", "org/apache/cxf/common/util/ASMHelper", "MethodVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ASMHelper$ClassWriter", "org/apache/cxf/common/util/ASMHelper", "ClassWriter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/apache/cxf/common/util/ASMHelper$AnnotationVisitor;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/common/util/ASMHelper$AnnotationVisitor;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitField", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/cxf/common/util/ASMHelper$FieldVisitor;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/common/util/ASMHelper$FieldVisitor;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitEnd", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toByteArray", "()[B", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitMethod", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/cxf/common/util/ASMHelper$MethodVisitor;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/common/util/ASMHelper$MethodVisitor;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visit", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "visitSource", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
