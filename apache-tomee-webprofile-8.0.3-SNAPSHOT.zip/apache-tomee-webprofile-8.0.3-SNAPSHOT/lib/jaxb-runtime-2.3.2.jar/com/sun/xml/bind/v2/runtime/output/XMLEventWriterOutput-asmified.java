package asm.com.sun.xml.bind.v2.runtime.output;
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
public class XMLEventWriterOutputDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", null, "com/sun/xml/bind/v2/runtime/output/XmlOutputAbstractImpl", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element", "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "Element", ACC_PUBLIC | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "out", "Ljavax/xml/stream/XMLEventWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ef", "Ljavax/xml/stream/XMLEventFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sp", "Ljavax/xml/stream/events/Characters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/stream/XMLEventWriter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/output/XmlOutputAbstractImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/XMLEventFactory", "newInstance", "()Ljavax/xml/stream/XMLEventFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createCharacters", "(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "sp", "Ljavax/xml/stream/events/Characters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startDocument", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Z[ILcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/output/XmlOutputAbstractImpl", "startDocument", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Z[ILcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;)V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createStartDocument", "()Ljavax/xml/stream/events/StartDocument;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endDocument", "(Z)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createEndDocument", "()Ljavax/xml/stream/events/EndDocument;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "flush", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/output/XmlOutputAbstractImpl", "endDocument", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginStartTag", "(ILjava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "nsContext", "Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "getPrefix", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "nsContext", "Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "getNamespaceURI", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/StartElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "nsContext", "Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "getCurrent", "()Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element", "count", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element", "count", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element", "getNsUri", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element", "getBase", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl$Element", "getPrefix", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createNamespace", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/Namespace;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(4, -1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "attribute", "(ILjava/lang/String;Ljava/lang/String;)V", null, new String[] { "java/io/IOException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createAttribute", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/Attribute;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "nsContext", "Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "getPrefix", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "nsContext", "Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "getNamespaceURI", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/Attribute;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/stream/events/Attribute"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endStartTag", "()V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endTag", "(ILjava/lang/String;)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "nsContext", "Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "getPrefix", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "nsContext", "Lcom/sun/xml/bind/v2/runtime/output/NamespaceContextImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/NamespaceContextImpl", "getNamespaceURI", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createEndElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/EndElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "text", "(Ljava/lang/String;Z)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "sp", "Ljavax/xml/stream/events/Characters;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "out", "Ljavax/xml/stream/XMLEventWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "ef", "Ljavax/xml/stream/XMLEventFactory;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLEventFactory", "createCharacters", "(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLEventWriter", "add", "(Ljavax/xml/stream/events/XMLEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "text", "(Lcom/sun/xml/bind/v2/runtime/output/Pcdata;Z)V", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/Pcdata", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/output/XMLEventWriterOutput", "text", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
