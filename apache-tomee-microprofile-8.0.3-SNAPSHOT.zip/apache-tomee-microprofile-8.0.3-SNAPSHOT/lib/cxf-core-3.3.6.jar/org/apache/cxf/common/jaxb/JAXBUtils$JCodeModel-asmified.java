package asm.org.apache.cxf.common.jaxb;
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
public class JAXBUtils$JCodeModelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/common/jaxb/JAXBUtils$JCodeModel", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/common/jaxb/JAXBUtils$JPackage", "org/apache/cxf/common/jaxb/JAXBUtils", "JPackage", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn", "org/apache/cxf/common/util/ReflectionInvokationHandler", "WrapReturn", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/jaxb/JAXBUtils$JCodeModel", "org/apache/cxf/common/jaxb/JAXBUtils", "JCodeModel", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "build", "(Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "packages", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/apache/cxf/common/jaxb/JAXBUtils$JPackage;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/common/jaxb/JAXBUtils$JPackage;"));
annotationVisitor0.visit("iterator", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
