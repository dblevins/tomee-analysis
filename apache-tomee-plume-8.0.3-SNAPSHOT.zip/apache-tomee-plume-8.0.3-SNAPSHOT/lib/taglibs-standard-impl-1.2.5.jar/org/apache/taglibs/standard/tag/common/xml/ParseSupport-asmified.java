package asm.org.apache.taglibs.standard.tag.common.xml;
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
public class ParseSupportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", null, "javax/servlet/jsp/tagext/BodyTagSupport", null);

classWriter.visitInnerClass("org/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver", "org/apache/taglibs/standard/util/XmlUtil", "JstlEntityResolver", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "xml", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "systemId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "filter", "Lorg/xml/sax/XMLFilter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "var", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "varDom", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "scope", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "scopeDom", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entityResolver", "Lorg/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/tagext/BodyTagSupport", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "init", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "init", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "varDom", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "xml", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "systemId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "filter", "Lorg/xml/sax/XMLFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "scope", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "scopeDom", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doEndTag", "()I", null, new String[] { "javax/servlet/jsp/JspException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "xml", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "bodyContent", "Ljavax/servlet/jsp/tagext/BodyContent;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "bodyContent", "Ljavax/servlet/jsp/tagext/BodyContent;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/tagext/BodyContent", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "bodyContent", "Ljavax/servlet/jsp/tagext/BodyContent;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/tagext/BodyContent", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "java/io/StringReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/StringReader", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/io/Reader");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspTagException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PARSE_INVALID_SOURCE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/resources/Resources", "getMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspTagException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/Reader");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "systemId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/util/XmlUtil", "newInputSource", "(Ljava/io/Reader;Ljava/lang/String;)Lorg/xml/sax/InputSource;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "filter", "Lorg/xml/sax/XMLFilter;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "filter", "Lorg/xml/sax/XMLFilter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "parseInputSourceWithFilter", "(Lorg/xml/sax/InputSource;Lorg/xml/sax/XMLFilter;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "parseInputSource", "(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "var", "Ljava/lang/String;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "pageContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "var", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "scope", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;I)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "varDom", "Ljava/lang/String;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "pageContext", "Ljavax/servlet/jsp/PageContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "varDom", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "scopeDom", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/jsp/PageContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;I)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "release", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "init", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "parseInputSourceWithFilter", "(Lorg/xml/sax/InputSource;Lorg/xml/sax/XMLFilter;)Lorg/w3c/dom/Document;", null, new String[] { "javax/servlet/jsp/JspException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "org/xml/sax/SAXException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "javax/xml/transform/TransformerConfigurationException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label5, "javax/xml/parsers/ParserConfigurationException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "entityResolver", "Lorg/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/util/XmlUtil", "newXMLReader", "(Lorg/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver;)Lorg/xml/sax/XMLReader;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/XMLFilter", "setParent", "(Lorg/xml/sax/XMLReader;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/util/XmlUtil", "newTransformerHandler", "()Ljavax/xml/transform/sax/TransformerHandler;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/util/XmlUtil", "newEmptyDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMResult", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/transform/sax/TransformerHandler", "setResult", "(Ljavax/xml/transform/Result;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/XMLFilter", "setContentHandler", "(Lorg/xml/sax/ContentHandler;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/XMLFilter", "parse", "(Lorg/xml/sax/InputSource;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "parseInputSource", "(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;", null, new String[] { "javax/servlet/jsp/JspException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/xml/sax/SAXException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/util/XmlUtil", "newDocumentBuilder", "()Ljavax/xml/parsers/DocumentBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "entityResolver", "Lorg/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/servlet/jsp/JspException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/JspException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPageContext", "(Ljavax/servlet/jsp/PageContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/jsp/tagext/BodyTagSupport", "setPageContext", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver", "<init>", "(Ljavax/servlet/jsp/PageContext;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "entityResolver", "Lorg/apache/taglibs/standard/util/XmlUtil$JstlEntityResolver;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVar", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "var", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVarDom", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "varDom", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setScope", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tag/common/core/Util", "getScope", "(Ljava/lang/String;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "scope", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setScopeDom", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tag/common/core/Util", "getScope", "(Ljava/lang/String;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/taglibs/standard/tag/common/xml/ParseSupport", "scopeDom", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
