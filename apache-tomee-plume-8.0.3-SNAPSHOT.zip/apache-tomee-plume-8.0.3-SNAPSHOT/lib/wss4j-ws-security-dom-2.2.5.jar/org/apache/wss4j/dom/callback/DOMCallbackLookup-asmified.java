package asm.org.apache.wss4j.dom.callback;
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
public class DOMCallbackLookupDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/dom/callback/DOMCallbackLookup", null, "java/lang/Object", new String[] { "org/apache/wss4j/dom/callback/CallbackLookup" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "doc", "Lorg/w3c/dom/Document;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Document;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElement", "(Ljava/lang/String;Ljava/lang/String;Z)Lorg/w3c/dom/Element;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "getAndRegisterElement", "(Ljava/lang/String;Ljava/lang/String;ZLjavax/xml/crypto/dom/DOMCryptoContext;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAndRegisterElement", "(Ljava/lang/String;Ljava/lang/String;ZLjavax/xml/crypto/dom/DOMCryptoContext;)Lorg/w3c/dom/Element;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/util/XMLUtils", "getIDFromReference", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "getSOAPBody", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dom/DOMCryptoContext", "setIdAttributeNS", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "org/w3c/dom/Element", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/util/XMLUtils", "findElementById", "(Lorg/w3c/dom/Node;Ljava/lang/String;Z)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "hasAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dom/DOMCryptoContext", "setIdAttributeNS", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Element"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "hasAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dom/DOMCryptoContext", "setIdAttributeNS", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.0#SAMLAssertionID");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLID");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/util/XMLUtils", "findSAMLAssertionElementById", "(Lorg/w3c/dom/Node;Ljava/lang/String;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("ID");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "hasAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Z", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("ID");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("ID");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dom/DOMCryptoContext", "setIdAttributeNS", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("AssertionID");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "hasAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("AssertionID");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("AssertionID");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dom/DOMCryptoContext", "setIdAttributeNS", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElements", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lorg/w3c/dom/Element;>;", new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "getSOAPBody", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn("Body");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getNamespaceURI", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Element"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/common/util/XMLUtils", "findElements", "(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSOAPBody", "()Lorg/w3c/dom/Element;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/callback/DOMCallbackLookup", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/util/WSSecurityUtil", "findBodyElement", "(Lorg/w3c/dom/Document;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
