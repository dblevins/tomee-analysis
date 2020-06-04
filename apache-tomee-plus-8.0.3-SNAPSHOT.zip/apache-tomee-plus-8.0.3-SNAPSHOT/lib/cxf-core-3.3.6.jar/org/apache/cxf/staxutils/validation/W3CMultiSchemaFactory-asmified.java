package asm.org.apache.cxf.staxutils.validation;
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
public class W3CMultiSchemaFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", null, "com/ctc/wstx/msv/BaseSchemaFactory", null);

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "RecursiveAllowedXMLSchemaReader", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "multiSchemaReader", "Lcom/sun/msv/reader/xmlschema/MultiSchemaReader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parserFactory", "Ljavax/xml/parsers/SAXParserFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlSchemaReader", "Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/msv/BaseSchemaFactory", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadSchemas", "(Ljava/lang/String;Ljava/util/Map;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Lorg/apache/cxf/staxutils/validation/EmbeddedSchema;>;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "getSaxFactory", "()Ljavax/xml/parsers/SAXParserFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "parserFactory", "Ljavax/xml/parsers/SAXParserFactory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/validation/ResolvingGrammarReaderController");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/validation/ResolvingGrammarReaderController", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "parserFactory", "Ljavax/xml/parsers/SAXParserFactory;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "<init>", "(Lcom/sun/msv/reader/GrammarReaderController;Ljavax/xml/parsers/SAXParserFactory;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "xmlSchemaReader", "Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/msv/reader/xmlschema/MultiSchemaReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "xmlSchemaReader", "Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/reader/xmlschema/MultiSchemaReader", "<init>", "(Lcom/sun/msv/reader/xmlschema/XMLSchemaReader;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "multiSchemaReader", "Lcom/sun/msv/reader/xmlschema/MultiSchemaReader;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/staxutils/validation/ResolvingGrammarReaderController", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/staxutils/validation/EmbeddedSchema");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/EmbeddedSchema", "getSchemaElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/EmbeddedSchema", "getSystemId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/dom/DOMSource", "setSystemId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "multiSchemaReader", "Lcom/sun/msv/reader/xmlschema/MultiSchemaReader;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/msv/reader/xmlschema/MultiSchemaReader", "parse", "(Ljavax/xml/transform/Source;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "multiSchemaReader", "Lcom/sun/msv/reader/xmlschema/MultiSchemaReader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/msv/reader/xmlschema/MultiSchemaReader", "getResult", "()Lcom/sun/msv/grammar/xmlschema/XMLSchemaGrammar;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Failed to load schemas");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/msv/grammar/xmlschema/XMLSchemaGrammar"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/ctc/wstx/msv/W3CSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/ctc/wstx/msv/W3CSchema", "<init>", "(Lcom/sun/msv/grammar/xmlschema/XMLSchemaGrammar;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "loadSchema", "(Lorg/xml/sax/InputSource;Ljava/lang/Object;)Lorg/codehaus/stax2/validation/XMLValidationSchema;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("W3CMultiSchemaFactory does not support the provider API.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
