package asm.com.sun.xml.messaging.saaj.soap.impl;
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
public class SOAPTextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "Lcom/sun/xml/messaging/saaj/soap/impl/TextImpl<Lorg/w3c/dom/Text;>;Lorg/w3c/dom/Text;", "com/sun/xml/messaging/saaj/soap/impl/TextImpl", new String[] { "org/w3c/dom/Text" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/TextImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/CharacterData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/impl/TextImpl", "<init>", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/CharacterData;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createN", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;)Lorg/w3c/dom/Text;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "getDomDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createTextNode", "(Ljava/lang/String;)Lorg/w3c/dom/Text;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createN", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/CharacterData;)Lorg/w3c/dom/Text;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "splitText", "(I)Lorg/w3c/dom/Text;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "getDomElement", "()Lorg/w3c/dom/CharacterData;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Text", "splitText", "(I)Lorg/w3c/dom/Text;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "getSoapDocument", "()Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "registerChildNodes", "(Lorg/w3c/dom/Node;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isElementContentWhitespace", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "getDomElement", "()Lorg/w3c/dom/CharacterData;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Text", "isElementContentWhitespace", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWholeText", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "getDomElement", "()Lorg/w3c/dom/CharacterData;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Text", "getWholeText", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "replaceWholeText", "(Ljava/lang/String;)Lorg/w3c/dom/Text;", null, new String[] { "org/w3c/dom/DOMException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "getDomElement", "()Lorg/w3c/dom/CharacterData;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Text", "replaceWholeText", "(Ljava/lang/String;)Lorg/w3c/dom/Text;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "getSoapDocument", "()Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/SOAPDocumentImpl", "registerChildNodes", "(Lorg/w3c/dom/Node;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isComment", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "getNodeValue", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("<!--");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("-->");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createN", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;)Lorg/w3c/dom/CharacterData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "createN", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Ljava/lang/String;)Lorg/w3c/dom/Text;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "createN", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/CharacterData;)Lorg/w3c/dom/CharacterData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/messaging/saaj/soap/impl/SOAPTextImpl", "createN", "(Lcom/sun/xml/messaging/saaj/soap/SOAPDocumentImpl;Lorg/w3c/dom/CharacterData;)Lorg/w3c/dom/Text;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
