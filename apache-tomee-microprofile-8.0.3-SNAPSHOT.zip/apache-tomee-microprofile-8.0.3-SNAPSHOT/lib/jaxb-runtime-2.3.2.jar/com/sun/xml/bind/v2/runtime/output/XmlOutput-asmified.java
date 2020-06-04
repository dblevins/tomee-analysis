package asm.com.sun.xml.bind.v2.runtime.output;
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
public class XmlOutputDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/runtime/output/XmlOutput", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startDocument", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Z[ILcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endDocument", "(Z)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beginStartTag", "(Lcom/sun/xml/bind/v2/runtime/Name;)V", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beginStartTag", "(ILjava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "attribute", "(Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "attribute", "(ILjava/lang/String;Ljava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endStartTag", "()V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endTag", "(Lcom/sun/xml/bind/v2/runtime/Name;)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endTag", "(ILjava/lang/String;)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "text", "(Ljava/lang/String;Z)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "text", "(Lcom/sun/xml/bind/v2/runtime/output/Pcdata;Z)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
