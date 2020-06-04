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
public class JAXBUtils$SchemaCompilerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/common/jaxb/JAXBUtils$SchemaCompiler", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/common/jaxb/JAXBUtils$S2JJAXBModel", "org/apache/cxf/common/jaxb/JAXBUtils", "S2JJAXBModel", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn", "org/apache/cxf/common/util/ReflectionInvokationHandler", "WrapReturn", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/jaxb/JAXBUtils$Options", "org/apache/cxf/common/jaxb/JAXBUtils", "Options", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/cxf/common/jaxb/JAXBUtils$SchemaCompiler", "org/apache/cxf/common/jaxb/JAXBUtils", "SchemaCompiler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setErrorListener", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setClassNameAllocator", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "bind", "()Lorg/apache/cxf/common/jaxb/JAXBUtils$S2JJAXBModel;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/common/jaxb/JAXBUtils$S2JJAXBModel;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parseSchema", "(Lorg/xml/sax/InputSource;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parseSchema", "(Ljava/lang/String;Lorg/w3c/dom/Element;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parseSchema", "(Ljava/lang/String;Ljavax/xml/stream/XMLStreamReader;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOptions", "()Lorg/apache/cxf/common/jaxb/JAXBUtils$Options;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lorg/apache/cxf/common/util/ReflectionInvokationHandler$WrapReturn;", true);
annotationVisitor0.visit("value", Type.getType("Lorg/apache/cxf/common/jaxb/JAXBUtils$Options;"));
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
