package asm.org.apache.commons.digester;
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
public class NodeCreateRule$NodeBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_2, ACC_SUPER, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", null, "org/xml/sax/helpers/DefaultHandler", null);

classWriter.visitInnerClass("org/apache/commons/digester/NodeCreateRule$NodeBuilder", "org/apache/commons/digester/NodeCreateRule", "NodeBuilder", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "oldContentHandler", "Lorg/xml/sax/ContentHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "depth", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "doc", "Lorg/w3c/dom/Document;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "root", "Lorg/w3c/dom/Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "top", "Lorg/w3c/dom/Node;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/digester/NodeCreateRule;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/digester/NodeCreateRule;Lorg/w3c/dom/Document;Lorg/w3c/dom/Node;)V", null, new String[] { "javax/xml/parsers/ParserConfigurationException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/helpers/DefaultHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "this$0", "Lorg/apache/commons/digester/NodeCreateRule;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "oldContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "depth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "root", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "root", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "getCustomContentHandler", "()Lorg/xml/sax/ContentHandler;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "oldContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "characters", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/w3c/dom/DOMException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([CII)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createTextNode", "(Ljava/lang/String;)Lorg/w3c/dom/Text;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/SAXException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/w3c/dom/DOMException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/SAXException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/w3c/dom/DOMException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "depth", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "this$0", "Lorg/apache/commons/digester/NodeCreateRule;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/NodeCreateRule", "getDigester", "()Lorg/apache/commons/digester/Digester;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "oldContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "setCustomContentHandler", "(Lorg/xml/sax/ContentHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "this$0", "Lorg/apache/commons/digester/NodeCreateRule;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/NodeCreateRule", "getDigester", "()Lorg/apache/commons/digester/Digester;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "root", "Lorg/w3c/dom/Node;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "this$0", "Lorg/apache/commons/digester/NodeCreateRule;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/NodeCreateRule", "getDigester", "()Lorg/apache/commons/digester/Digester;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getParentNode", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "depth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "depth", "I");
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/SAXException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/w3c/dom/DOMException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/SAXException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processingInstruction", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/w3c/dom/DOMException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createProcessingInstruction", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/ProcessingInstruction;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/SAXException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/w3c/dom/DOMException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/SAXException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/w3c/dom/DOMException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createElement", "(Ljava/lang/String;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createElementNS", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLocalName", "(I)Ljava/lang/String;", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLocalName", "(I)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNE, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getQName", "(I)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createAttribute", "(Ljava/lang/String;)Lorg/w3c/dom/Attr;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(I)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "setNodeValue", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNode", "(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;", true);
methodVisitor.visitInsn(POP);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "doc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getURI", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLocalName", "(I)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Attr;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(I)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "setNodeValue", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNodeNS", "(Lorg/w3c/dom/Attr;)Lorg/w3c/dom/Attr;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLength", "()I", true);
methodVisitor.visitJumpInsn(IF_ICMPLT, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "top", "Lorg/w3c/dom/Node;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "depth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/NodeCreateRule$NodeBuilder", "depth", "I");
methodVisitor.visitLabel(label1);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/SAXException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/w3c/dom/DOMException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/SAXException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
