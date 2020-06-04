package asm.org.eclipse.persistence.oxm.record;
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
public class NodeRecord$NodeRecordContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", null, "org/eclipse/persistence/internal/oxm/MarshalRecordContentHandler", new String[] { "org/xml/sax/ext/LexicalHandler" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "org/eclipse/persistence/oxm/record/NodeRecord", "NodeRecordContentHandler", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(0, "prefixMappings", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;Lorg/eclipse/persistence/oxm/record/NodeRecord;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/MarshalRecordContentHandler", "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$0", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createElement", "(Ljava/lang/String;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$0", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createElementNS", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Element"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$1", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$2", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "marshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getURI", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLocalName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getQName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(I)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "attribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLength", "()I", true);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "isEmpty", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "java/lang/String", "java/lang/String", "java/lang/String", "org/xml/sax/Attributes", "org/w3c/dom/Element", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("xmlns:");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "marshalRecord", "Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "closeStartElement", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startPrefixMapping", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/record/NodeRecord", "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NamespaceResolver", "resolveNamespacePrefix", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "prefixMappings", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startDTD", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endDTD", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startEntity", "(Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$0", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createEntityReference", "(Ljava/lang/String;)Lorg/w3c/dom/EntityReference;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$1", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$2", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endEntity", "(Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$1", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getParentNode", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$2", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startCDATA", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$0", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createCDATASection", "(Ljava/lang/String;)Lorg/w3c/dom/CDATASection;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$1", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$2", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endCDATA", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$1", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getParentNode", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$2", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "comment", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$0", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([CII)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createComment", "(Ljava/lang/String;)Lorg/w3c/dom/Comment;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/record/NodeRecord$NodeRecordContentHandler", "this$0", "Lorg/eclipse/persistence/oxm/record/NodeRecord;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/oxm/record/NodeRecord", "access$1", "(Lorg/eclipse/persistence/oxm/record/NodeRecord;)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
