package asm.org.eclipse.persistence.internal.oxm.record;
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
public class DomToXMLStreamWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", null, "java/lang/Object", null);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeToStream", "(Lorg/w3c/dom/Node;Ljava/lang/String;Ljava/lang/String;Ljavax/xml/stream/XMLStreamWriter;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitIntInsn(BIPUSH, 9);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Document");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getXmlEncoding", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getXmlVersion", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartDocument", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "writeElement", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;Ljavax/xml/stream/XMLStreamWriter;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Attr");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Attr"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getNamespaceURI", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Text", "getNodeValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitIntInsn(BIPUSH, 9);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndDocument", "()V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeElement", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;Ljavax/xml/stream/XMLStreamWriter;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/NamespaceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "setDOM", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "resolveNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "org/w3c/dom/Element", "java/lang/String", "java/lang/String", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "org/eclipse/persistence/internal/oxm/NamespaceResolver"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributeNS", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "generatePrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "generatePrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getNamespaceURI", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getNodeName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "getNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;", true);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "getNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeDefaultNamespace", "(Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getChildNodes", "()Lorg/w3c/dom/NodeList;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributes", "()Lorg/w3c/dom/NamedNodeMap;", true);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 14);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_FULL, 15, new Object[] {"org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "org/w3c/dom/Element", "java/lang/String", "java/lang/String", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", Opcodes.INTEGER, "org/w3c/dom/NodeList", "org/w3c/dom/NamedNodeMap", "java/util/ArrayList", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NamedNodeMap", "item", "(I)Lorg/w3c/dom/Node;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Attr");
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_2);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label11);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "getNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;", true);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitVarInsn(ALOAD, 17);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/w3c/dom/Attr", "org/w3c/dom/Attr", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeDefaultNamespace", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitIincInsn(14, 1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NamedNodeMap", "getLength", "()I", true);
methodVisitor.visitJumpInsn(IF_ICMPLT, label10);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label16);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label15);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeDefaultNamespace", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 15);
Label label17 = new Label();
methodVisitor.visitJumpInsn(GOTO, label17);
Label label18 = new Label();
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_FULL, 16, new Object[] {"org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "org/w3c/dom/Element", "java/lang/String", "java/lang/String", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", Opcodes.INTEGER, "org/w3c/dom/NodeList", "org/w3c/dom/NamedNodeMap", "java/util/ArrayList", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Attr");
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label17);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_FULL, 16, new Object[] {"org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "org/w3c/dom/Element", "java/lang/String", "java/lang/String", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", Opcodes.INTEGER, "org/w3c/dom/NodeList", "org/w3c/dom/NamedNodeMap", "java/util/ArrayList", "org/w3c/dom/Attr", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getNamespaceURI", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_FULL, 16, new Object[] {"org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "org/w3c/dom/Element", "java/lang/String", "java/lang/String", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", Opcodes.INTEGER, "org/w3c/dom/NodeList", "org/w3c/dom/NamedNodeMap", "java/util/ArrayList", Opcodes.TOP, "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label18);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 14);
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
Label label21 = new Label();
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_FULL, 15, new Object[] {"org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "org/w3c/dom/Element", "java/lang/String", "java/lang/String", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", Opcodes.INTEGER, "org/w3c/dom/NodeList", "org/w3c/dom/NamedNodeMap", "java/util/ArrayList", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NodeList", "item", "(I)Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_3);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label22);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Text");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Text", "getNodeValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
Label label23 = new Label();
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_4);
Label label24 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label24);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCData", "(Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label24);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label25 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label25);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeComment", "(Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label23);
methodVisitor.visitLabel(label25);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label23);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Element");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/DomToXMLStreamWriter", "writeElement", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;Ljavax/xml/stream/XMLStreamWriter;)V", false);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(14, 1);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NodeList", "getLength", "()I", true);
methodVisitor.visitJumpInsn(IF_ICMPLT, label21);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 18);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getPrefix", "(Ljavax/xml/namespace/NamespaceContext;Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/NamespaceResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "setDOM", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "resolveNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/internal/oxm/NamespaceResolver", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "generatePrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}