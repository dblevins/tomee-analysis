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
public class XMLPlatformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/platform/xml/XMLPlatform", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDocument", "()Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDocumentWithPublicIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createDocumentWithSystemIdentifier", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Document;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isWhitespaceNode", "(Lorg/w3c/dom/Text;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveNamespacePrefix", "(Lorg/w3c/dom/Node;Ljava/lang/String;)Ljava/lang/String;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectNodesAdvanced", "(Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/eclipse/persistence/platform/xml/XMLNamespaceResolver;)Lorg/w3c/dom/NodeList;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectSingleNodeAdvanced", "(Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/eclipse/persistence/platform/xml/XMLNamespaceResolver;)Lorg/w3c/dom/Node;", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newXMLParser", "()Lorg/eclipse/persistence/platform/xml/XMLParser;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newXMLParser", "(Ljava/util/Map;)Lorg/eclipse/persistence/platform/xml/XMLParser;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Boolean;>;)Lorg/eclipse/persistence/platform/xml/XMLParser;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newXMLTransformer", "()Lorg/eclipse/persistence/platform/xml/XMLTransformer;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validateDocument", "(Lorg/w3c/dom/Document;Ljava/net/URL;Lorg/xml/sax/ErrorHandler;)Z", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validate", "(Lorg/w3c/dom/Element;Lorg/eclipse/persistence/oxm/XMLDescriptor;Lorg/xml/sax/ErrorHandler;)Z", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "namespaceQualifyFragment", "(Lorg/w3c/dom/Element;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDisableSecureProcessing", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isSecureProcessingDisabled", "()Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
