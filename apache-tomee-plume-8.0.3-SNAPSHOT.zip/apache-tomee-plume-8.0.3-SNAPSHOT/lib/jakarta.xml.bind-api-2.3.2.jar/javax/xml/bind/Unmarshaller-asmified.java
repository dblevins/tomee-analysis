package asm.javax.xml.bind;
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
public class UnmarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/bind/Unmarshaller", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/xml/bind/Unmarshaller$Listener", "javax/xml/bind/Unmarshaller", "Listener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljava/io/File;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljava/io/InputStream;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljava/io/Reader;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljava/net/URL;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Lorg/xml/sax/InputSource;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Lorg/w3c/dom/Node;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Lorg/w3c/dom/Node;Ljava/lang/Class;)Ljavax/xml/bind/JAXBElement;", "<T:Ljava/lang/Object;>(Lorg/w3c/dom/Node;Ljava/lang/Class<TT;>;)Ljavax/xml/bind/JAXBElement<TT;>;", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/transform/Source;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/transform/Source;Ljava/lang/Class;)Ljavax/xml/bind/JAXBElement;", "<T:Ljava/lang/Object;>(Ljavax/xml/transform/Source;Ljava/lang/Class<TT;>;)Ljavax/xml/bind/JAXBElement<TT;>;", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/stream/XMLStreamReader;Ljava/lang/Class;)Ljavax/xml/bind/JAXBElement;", "<T:Ljava/lang/Object;>(Ljavax/xml/stream/XMLStreamReader;Ljava/lang/Class<TT;>;)Ljavax/xml/bind/JAXBElement<TT;>;", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/stream/XMLEventReader;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "unmarshal", "(Ljavax/xml/stream/XMLEventReader;Ljava/lang/Class;)Ljavax/xml/bind/JAXBElement;", "<T:Ljava/lang/Object;>(Ljavax/xml/stream/XMLEventReader;Ljava/lang/Class<TT;>;)Ljavax/xml/bind/JAXBElement<TT;>;", new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUnmarshallerHandler", "()Ljavax/xml/bind/UnmarshallerHandler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "setValidating", "(Z)V", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "isValidating", "()Z", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEventHandler", "(Ljavax/xml/bind/ValidationEventHandler;)V", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEventHandler", "()Ljavax/xml/bind/ValidationEventHandler;", null, new String[] { "javax/xml/bind/JAXBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "javax/xml/bind/PropertyException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "javax/xml/bind/PropertyException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setSchema", "(Ljavax/xml/validation/Schema;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSchema", "()Ljavax/xml/validation/Schema;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAdapter", "(Ljavax/xml/bind/annotation/adapters/XmlAdapter;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAdapter", "(Ljava/lang/Class;Ljavax/xml/bind/annotation/adapters/XmlAdapter;)V", "<A:Ljavax/xml/bind/annotation/adapters/XmlAdapter;>(Ljava/lang/Class<TA;>;TA;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAdapter", "(Ljava/lang/Class;)Ljavax/xml/bind/annotation/adapters/XmlAdapter;", "<A:Ljavax/xml/bind/annotation/adapters/XmlAdapter;>(Ljava/lang/Class<TA;>;)TA;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAttachmentUnmarshaller", "(Ljavax/xml/bind/attachment/AttachmentUnmarshaller;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttachmentUnmarshaller", "()Ljavax/xml/bind/attachment/AttachmentUnmarshaller;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setListener", "(Ljavax/xml/bind/Unmarshaller$Listener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getListener", "()Ljavax/xml/bind/Unmarshaller$Listener;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
