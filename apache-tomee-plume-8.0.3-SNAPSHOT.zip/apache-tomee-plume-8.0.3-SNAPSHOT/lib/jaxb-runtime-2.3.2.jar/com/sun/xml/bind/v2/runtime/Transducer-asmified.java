package asm.com.sun.xml.bind.v2.runtime;
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
public class TransducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "<ValueT:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "useNamespace", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "declareNamespace", "(Ljava/lang/Object;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", "(TValueT;Lcom/sun/xml/bind/v2/runtime/XMLSerializer;)V", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "print", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", "(TValueT;)Ljava/lang/CharSequence;", new String[] { "com/sun/xml/bind/api/AccessorException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", "(Ljava/lang/CharSequence;)TValueT;", new String[] { "com/sun/xml/bind/api/AccessorException", "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeText", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;Ljava/lang/String;)V", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;TValueT;Ljava/lang/String;)V", new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException", "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeLeafElement", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;Ljava/lang/String;)V", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;TValueT;Ljava/lang/String;)V", new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException", "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitAnnotableParameterCount(4, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypeName", "(Ljava/lang/Object;)Ljavax/xml/namespace/QName;", "(TValueT;)Ljavax/xml/namespace/QName;", null);
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lcom/sun/istack/NotNull;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
