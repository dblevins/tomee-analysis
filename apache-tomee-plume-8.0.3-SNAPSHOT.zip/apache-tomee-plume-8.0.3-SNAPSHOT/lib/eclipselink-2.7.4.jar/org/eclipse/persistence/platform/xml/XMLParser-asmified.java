package asm.org.eclipse.persistence.platform.xml;
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
public class XMLParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/platform/xml/XMLParser", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONVALIDATING", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DTD_VALIDATION", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCHEMA_VALIDATION", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setNamespaceAware", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setWhitespacePreserving", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getValidationMode", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setValidationMode", "(I)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEntityResolver", "()Lorg/xml/sax/EntityResolver;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getErrorHandler", "()Lorg/xml/sax/ErrorHandler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setXMLSchema", "(Ljava/net/URL;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setXMLSchemas", "([Ljava/lang/Object;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setXMLSchema", "(Ljavax/xml/validation/Schema;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXMLSchema", "()Ljavax/xml/validation/Schema;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Ljava/io/File;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Ljava/io/InputStream;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Ljava/io/Reader;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Ljavax/xml/transform/Source;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Ljava/net/URL;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
