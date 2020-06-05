package asm.com.ibm.wsdl.extensions.schema;
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
public class SchemaDeserializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "com/ibm/wsdl/extensions/schema/SchemaDeserializer", null, "java/lang/Object", new String[] { "javax/wsdl/extensions/ExtensionDeserializer", "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "allReferencedSchemas", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "wsdlLocator", "Ljava/lang/ThreadLocal;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/ibm/wsdl/extensions/schema/SchemaDeserializer", "allReferencedSchemas", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setLocator", "(Ljavax/wsdl/xml/WSDLLocator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaDeserializer", "wsdlLocator", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshall", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;Lorg/w3c/dom/Element;Ljavax/wsdl/Definition;Ljavax/wsdl/extensions/ExtensionRegistry;)Ljavax/wsdl/extensions/ExtensibilityElement;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/wsdl/extensions/ExtensionRegistry", "createExtension", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;)Ljavax/wsdl/extensions/ExtensibilityElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/wsdl/extensions/schema/Schema");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "setElementType", "(Ljavax/xml/namespace/QName;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "setElement", "(Lorg/w3c/dom/Element;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/Definition", "getDocumentBaseURI", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "setDocumentBaseURI", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getFirstChildElement", "(Lorg/w3c/dom/Element;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/QNameUtils", "newQName", "(Lorg/w3c/dom/Node;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "XSD_IMPORT_QNAME_LIST", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "createImport", "()Ljavax/wsdl/extensions/schema/SchemaImport;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("id");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/SchemaImport", "setId", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("namespace");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/SchemaImport", "setNamespaceURI", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("schemaLocation");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/SchemaImport", "setSchemaLocationURI", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "addImport", "(Ljavax/wsdl/extensions/schema/SchemaImport;)V", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "XSD_INCLUDE_QNAME_LIST", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "createInclude", "()Ljavax/wsdl/extensions/schema/SchemaReference;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("id");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/SchemaReference", "setId", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("schemaLocation");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/SchemaReference", "setSchemaLocationURI", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "addInclude", "(Ljavax/wsdl/extensions/schema/SchemaReference;)V", true);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "XSD_REDEFINE_QNAME_LIST", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "createRedefine", "()Ljavax/wsdl/extensions/schema/SchemaReference;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("id");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/SchemaReference", "setId", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("schemaLocation");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/SchemaReference", "setSchemaLocationURI", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/schema/Schema", "addRedefine", "(Ljavax/wsdl/extensions/schema/SchemaReference;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getNextSiblingElement", "(Lorg/w3c/dom/Element;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaDeserializer", "wsdlLocator", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
