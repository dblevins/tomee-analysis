package asm.org.apache.xml.security.utils;
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
public class JDKXPathAPIDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/utils/JDKXPathAPI", null, "java/lang/Object", new String[] { "org/apache/xml/security/utils/XPathAPI" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xpf", "Ljavax/xml/xpath/XPathFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xpathStr", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xpathExpression", "Ljavax/xml/xpath/XPathExpression;", null, null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectNodeList", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/w3c/dom/NodeList;", null, new String[] { "javax/xml/transform/TransformerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/xpath/XPathFactoryConfigurationException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "javax/xml/xpath/XPathExpressionException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "javax/xml/xpath/XPathExpressionException");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathExpression", "Ljavax/xml/xpath/XPathExpression;");
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/xpath/XPathFactory", "newInstance", "()Ljavax/xml/xpath/XPathFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitLdcInsn("http://javax.xml.XMLConstants/feature/secure-processing");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/xpath/XPathFactory", "setFeature", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/xpath/XPathFactoryConfigurationException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/TransformerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/TransformerException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/xpath/XPathFactory", "newXPath", "()Ljavax/xml/xpath/XPath;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/utils/DOMNamespaceContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/DOMNamespaceContext", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPath", "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPath", "compile", "(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathExpression", "Ljavax/xml/xpath/XPathExpression;");
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/xml/security/utils/JDKXPathAPI", "org/w3c/dom/Node", "org/w3c/dom/Node", "java/lang/String", "org/w3c/dom/Node", "javax/xml/xpath/XPath"}, 1, new Object[] {"javax/xml/xpath/XPathExpressionException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/TransformerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/TransformerException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathExpression", "Ljavax/xml/xpath/XPathExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/xpath/XPathConstants", "NODESET", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPathExpression", "evaluate", "(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/NodeList");
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/xpath/XPathExpressionException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/TransformerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/TransformerException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/w3c/dom/Node;)Z", null, new String[] { "javax/xml/transform/TransformerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/xpath/XPathFactoryConfigurationException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "javax/xml/xpath/XPathExpressionException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "javax/xml/xpath/XPathExpressionException");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathExpression", "Ljavax/xml/xpath/XPathExpression;");
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/xpath/XPathFactory", "newInstance", "()Ljavax/xml/xpath/XPathFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitLdcInsn("http://javax.xml.XMLConstants/feature/secure-processing");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/xpath/XPathFactory", "setFeature", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/xpath/XPathFactoryConfigurationException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/TransformerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/TransformerException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/xpath/XPathFactory", "newXPath", "()Ljavax/xml/xpath/XPath;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/utils/DOMNamespaceContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/DOMNamespaceContext", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPath", "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPath", "compile", "(Ljava/lang/String;)Ljavax/xml/xpath/XPathExpression;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathExpression", "Ljavax/xml/xpath/XPathExpression;");
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/xml/security/utils/JDKXPathAPI", "org/w3c/dom/Node", "org/w3c/dom/Node", "java/lang/String", "org/w3c/dom/Node", "javax/xml/xpath/XPath"}, 1, new Object[] {"javax/xml/xpath/XPathExpressionException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/TransformerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/TransformerException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathExpression", "Ljavax/xml/xpath/XPathExpression;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/xpath/XPathConstants", "BOOLEAN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPathExpression", "evaluate", "(Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/xpath/XPathExpressionException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/TransformerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/TransformerException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpathExpression", "Ljavax/xml/xpath/XPathExpression;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/JDKXPathAPI", "xpf", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
