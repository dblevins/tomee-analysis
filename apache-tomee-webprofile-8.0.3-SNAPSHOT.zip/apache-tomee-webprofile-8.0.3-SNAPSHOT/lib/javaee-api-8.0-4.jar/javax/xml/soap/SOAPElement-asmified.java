package asm.javax.xml.soap;
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
public class SOAPElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/soap/SOAPElement", null, "java/lang/Object", new String[] { "javax/xml/soap/Node", "org/w3c/dom/Element" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChildElement", "(Ljavax/xml/soap/Name;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChildElement", "(Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChildElement", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChildElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChildElement", "(Ljavax/xml/soap/SOAPElement;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addTextNode", "(Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAttribute", "(Ljavax/xml/soap/Name;Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamespaceDeclaration", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeValue", "(Ljavax/xml/soap/Name;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllAttributes", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNamespacePrefixes", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementName", "()Ljavax/xml/soap/Name;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeAttribute", "(Ljavax/xml/soap/Name;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeNamespaceDeclaration", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChildElements", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChildElements", "(Ljavax/xml/soap/Name;)Ljava/util/Iterator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEncodingStyle", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncodingStyle", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeContents", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVisibleNamespacePrefixes", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addChildElement", "(Ljavax/xml/namespace/QName;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQName", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllAttributesAsQNames", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeValue", "(Ljavax/xml/namespace/QName;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChildElements", "(Ljavax/xml/namespace/QName;)Ljava/util/Iterator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementQName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeAttribute", "(Ljavax/xml/namespace/QName;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setElementQName", "(Ljavax/xml/namespace/QName;)Ljavax/xml/soap/SOAPElement;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
