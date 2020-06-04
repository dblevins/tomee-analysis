package asm.com.sun.xml.messaging.saaj.soap;
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
public class SOAPDocumentFragmentDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", null, "java/lang/Object", new String[] { "org/w3c/dom/DocumentFragment" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "documentFragment", "Lorg/w3c/dom/DocumentFragment;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "getDomDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createDocumentFragment", "()Lorg/w3c/dom/DocumentFragment;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/DocumentFragment;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasAttributes", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "hasAttributes", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSameNode", "(Lorg/w3c/dom/Node;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "isSameNode", "(Lorg/w3c/dom/Node;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookupNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "lookupNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParentNode", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getParentNode", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFirstChild", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getFirstChild", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserData", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getUserData", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTextContent", "()Ljava/lang/String;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getTextContent", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNodeType", "()S", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getNodeType", "()S", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "importNode", "(Lorg/w3c/dom/Node;Z)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "removeChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "()Lorg/w3c/dom/NamedNodeMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getAttributes", "()Lorg/w3c/dom/NamedNodeMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compareDocumentPosition", "(Lorg/w3c/dom/Node;)S", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "compareDocumentPosition", "(Lorg/w3c/dom/Node;)S", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTextContent", "(Ljava/lang/String;)V", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "setTextContent", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "insertBefore", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "importNode", "(Lorg/w3c/dom/Node;Z)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "insertBefore", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUserData", "(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "setUserData", "(Ljava/lang/String;Ljava/lang/Object;Lorg/w3c/dom/UserDataHandler;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDefaultNamespace", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "isDefaultNamespace", "(Ljava/lang/String;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLastChild", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getLastChild", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPrefix", "(Ljava/lang/String;)V", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "setPrefix", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNodeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getNodeName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNodeValue", "(Ljava/lang/String;)V", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "setNodeValue", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replaceChild", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "importNode", "(Lorg/w3c/dom/Node;Z)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "replaceChild", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "normalize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "normalize", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cloneNode", "(Z)Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "cloneNode", "(Z)Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "registerChildNodes", "(Lorg/w3c/dom/Node;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSupported", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "isSupported", "(Ljava/lang/String;Ljava/lang/String;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEqualNode", "(Lorg/w3c/dom/Node;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "getDomNode", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "isEqualNode", "(Lorg/w3c/dom/Node;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasChildNodes", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "hasChildNodes", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookupPrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "lookupPrefix", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNodeValue", "()Ljava/lang/String;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getNodeValue", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOwnerDocument", "()Lorg/w3c/dom/Document;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFeature", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getFeature", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPreviousSibling", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getPreviousSibling", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChildNodes", "()Lorg/w3c/dom/NodeList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/soap/impl/NodeListImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getChildNodes", "()Lorg/w3c/dom/NodeList;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/NodeListImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/NodeList;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getBaseURI", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextSibling", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getNextSibling", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "findIfPresent", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/DocumentFragment", "getNamespaceURI", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSoapDocument", "()Lorg/w3c/dom/Document;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "soapDocument", "Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDomNode", "()Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/messaging/saaj/soap/SOAPDocumentFragment", "documentFragment", "Lorg/w3c/dom/DocumentFragment;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
