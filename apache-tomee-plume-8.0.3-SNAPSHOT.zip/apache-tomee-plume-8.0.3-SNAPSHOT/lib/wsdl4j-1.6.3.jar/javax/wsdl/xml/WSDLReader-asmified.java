package asm.javax.wsdl.xml;
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
public class WSDLReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/wsdl/xml/WSDLReader", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFeature", "(Ljava/lang/String;Z)V", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFeature", "(Ljava/lang/String;)Z", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExtensionRegistry", "(Ljavax/wsdl/extensions/ExtensionRegistry;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExtensionRegistry", "()Ljavax/wsdl/extensions/ExtensionRegistry;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setFactoryImplName", "(Ljava/lang/String;)V", null, new String[] { "java/lang/UnsupportedOperationException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFactoryImplName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readWSDL", "(Ljava/lang/String;)Ljavax/wsdl/Definition;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readWSDL", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/wsdl/Definition;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readWSDL", "(Ljava/lang/String;Lorg/w3c/dom/Element;)Ljavax/wsdl/Definition;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readWSDL", "(Ljavax/wsdl/xml/WSDLLocator;Lorg/w3c/dom/Element;)Ljavax/wsdl/Definition;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readWSDL", "(Ljava/lang/String;Lorg/w3c/dom/Document;)Ljavax/wsdl/Definition;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readWSDL", "(Ljava/lang/String;Lorg/xml/sax/InputSource;)Ljavax/wsdl/Definition;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "readWSDL", "(Ljavax/wsdl/xml/WSDLLocator;)Ljavax/wsdl/Definition;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
