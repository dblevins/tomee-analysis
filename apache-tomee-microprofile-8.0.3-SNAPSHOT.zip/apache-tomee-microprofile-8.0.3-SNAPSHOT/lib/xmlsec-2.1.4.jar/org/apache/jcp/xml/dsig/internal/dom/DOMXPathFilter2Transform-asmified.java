package asm.org.apache.jcp.xml.dsig.internal.dom;
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
public class DOMXPathFilter2TransformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", null, "org/apache/jcp/xml/dsig/internal/dom/ApacheTransform", null);

classWriter.visitInnerClass("javax/xml/crypto/dsig/spec/XPathType$Filter", "javax/xml/crypto/dsig/spec/XPathType", "Filter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/ApacheTransform", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Ljavax/xml/crypto/dsig/spec/TransformParameterSpec;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("params are required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("params must be of type XPathFilter2ParameterSpec");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "params", "Ljavax/xml/crypto/dsig/spec/TransformParameterSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Ljavax/xml/crypto/XMLStructure;Ljavax/xml/crypto/XMLCryptoContext;)V", null, new String[] { "java/security/InvalidAlgorithmParameterException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/crypto/MarshalException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/ApacheTransform", "init", "(Ljavax/xml/crypto/XMLStructure;Ljavax/xml/crypto/XMLCryptoContext;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "transformElem", "Lorg/w3c/dom/Element;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "getFirstChildElement", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "unmarshalParams", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/crypto/MarshalException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/security/InvalidAlgorithmParameterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/InvalidAlgorithmParameterException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "unmarshalParams", "(Lorg/w3c/dom/Element;)V", null, new String[] { "javax/xml/crypto/MarshalException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "org/w3c/dom/Element"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getFirstChild", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeValue", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("Filter");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "getAttributeValue", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/crypto/MarshalException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("filter cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/crypto/MarshalException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLdcInsn("intersect");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/crypto/dsig/spec/XPathType$Filter", "INTERSECT", "Ljavax/xml/crypto/dsig/spec/XPathType$Filter;");
methodVisitor.visitVarInsn(ASTORE, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/crypto/dsig/spec/XPathType$Filter"}, 0, null);
methodVisitor.visitLdcInsn("subtract");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/crypto/dsig/spec/XPathType$Filter", "SUBTRACT", "Ljavax/xml/crypto/dsig/spec/XPathType$Filter;");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("union");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/crypto/dsig/spec/XPathType$Filter", "UNION", "Ljavax/xml/crypto/dsig/spec/XPathType$Filter;");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/xml/crypto/MarshalException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unknown XPathType filter type");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/crypto/MarshalException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributes", "()Lorg/w3c/dom/NamedNodeMap;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NamedNodeMap", "getLength", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "org/w3c/dom/Element", "java/util/List", "org/w3c/dom/Element", "java/lang/String", "java/lang/String", "javax/xml/crypto/dsig/spec/XPathType$Filter", "org/w3c/dom/NamedNodeMap", Opcodes.INTEGER, "java/util/Map", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/NamedNodeMap", "item", "(I)Lorg/w3c/dom/Node;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Attr");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getPrefix", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitLdcInsn("xmlns");
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Attr", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/crypto/dsig/spec/XPathType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/crypto/dsig/spec/XPathType", "<init>", "(Ljava/lang/String;Ljavax/xml/crypto/dsig/spec/XPathType$Filter;Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/crypto/dsig/spec/XPathType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/crypto/dsig/spec/XPathType", "<init>", "(Ljava/lang/String;Ljavax/xml/crypto/dsig/spec/XPathType$Filter;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "getNextSiblingElement", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "org/w3c/dom/Element", "java/util/List", "org/w3c/dom/Element"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "params", "Ljavax/xml/crypto/dsig/spec/TransformParameterSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshalParams", "(Ljavax/xml/crypto/XMLStructure;Ljavax/xml/crypto/XMLCryptoContext;)V", null, new String[] { "javax/xml/crypto/MarshalException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jcp/xml/dsig/internal/dom/ApacheTransform", "marshalParams", "(Ljavax/xml/crypto/XMLStructure;Ljavax/xml/crypto/XMLCryptoContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "getParameterSpec", "()Ljava/security/spec/AlgorithmParameterSpec;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("http://www.w3.org/2002/06/xmldsig-filter2");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "getNSPrefix", "(Ljavax/xml/crypto/XMLCryptoContext;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec", "java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("xmlns");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("xmlns:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec", "getXPathList", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/crypto/dsig/spec/XPathType");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "ownerDoc", "Lorg/w3c/dom/Document;");
methodVisitor.visitLdcInsn("XPath");
methodVisitor.visitLdcInsn("http://www.w3.org/2002/06/xmldsig-filter2");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "createElement", "(Lorg/w3c/dom/Document;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "ownerDoc", "Lorg/w3c/dom/Document;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dsig/spec/XPathType", "getExpression", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "createTextNode", "(Ljava/lang/String;)Lorg/w3c/dom/Text;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn("Filter");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dsig/spec/XPathType", "getFilter", "()Ljavax/xml/crypto/dsig/spec/XPathType$Filter;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dsig/spec/XPathType$Filter", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jcp/xml/dsig/internal/dom/DOMUtils", "setAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("http://www.w3.org/2002/06/xmldsig-filter2");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/crypto/dsig/spec/XPathType", "getNamespaceMap", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "javax/xml/crypto/XMLStructure", "javax/xml/crypto/XMLCryptoContext", "javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec", "java/lang/String", "java/lang/String", "java/util/List", "java/util/Iterator", "javax/xml/crypto/dsig/spec/XPathType", "org/w3c/dom/Element", "java/util/Set", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/xmlns/");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("xmlns:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setAttributeNS", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "transformElem", "Lorg/w3c/dom/Element;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "appendChild", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/jcp/xml/dsig/internal/dom/DOMXPathFilter2Transform", "javax/xml/crypto/XMLStructure", "javax/xml/crypto/XMLCryptoContext", "javax/xml/crypto/dsig/spec/XPathFilter2ParameterSpec", "java/lang/String", "java/lang/String", "java/util/List"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 13);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}