package asm.org.apache.cxf.jaxrs.ext.xml;
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
public class XSLTTransformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/jaxrs/ext/xml/XSLTTransform", null, "java/lang/Object", new String[] { "java/lang/annotation/Annotation" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Target;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "METHOD");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "PARAMETER");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Retention;", true);
annotationVisitor0.visitEnum("value", "Ljava/lang/annotation/RetentionPolicy;", "RUNTIME");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/jaxrs/ext/xml/XSLTTransform$TransformType", "org/apache/cxf/jaxrs/ext/xml/XSLTTransform", "TransformType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "value", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mediaTypes", "()[Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray(null);
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "type", "()Lorg/apache/cxf/jaxrs/ext/xml/XSLTTransform$TransformType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visitEnum(null, "Lorg/apache/cxf/jaxrs/ext/xml/XSLTTransform$TransformType;", "SERVER");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
