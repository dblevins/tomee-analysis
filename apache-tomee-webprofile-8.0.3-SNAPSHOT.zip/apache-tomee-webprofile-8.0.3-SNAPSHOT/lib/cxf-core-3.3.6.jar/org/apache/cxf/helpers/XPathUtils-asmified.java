package asm.org.apache.cxf.helpers;
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
public class XPathUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/helpers/XPathUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/helpers/XPathUtils$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "org/apache/cxf/common/classloader/ClassLoaderUtils", "ClassLoaderHolder", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "xpathFactory", "Ljavax/xml/xpath/XPathFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xpath", "Ljavax/xml/xpath/XPath;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/helpers/XPathUtils", "xpathFactory", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/xpath/XPathFactory", "newXPath", "()Ljavax/xml/xpath/XPath;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/helpers/XPathUtils", "xpath", "Ljavax/xml/xpath/XPath;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/helpers/XPathUtils", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/helpers/XPathUtils", "xpath", "Ljavax/xml/xpath/XPath;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/helpers/MapNamespaceContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/helpers/MapNamespaceContext", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPath", "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/helpers/XPathUtils", "java/util/Map"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/namespace/NamespaceContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/helpers/XPathUtils", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/helpers/XPathUtils", "xpath", "Ljavax/xml/xpath/XPath;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPath", "setNamespaceContext", "(Ljavax/xml/namespace/NamespaceContext;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(Ljava/lang/String;Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label5, label3, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/helpers/XPathUtils", "xpath", "Ljavax/xml/xpath/XPath;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/XPathUtils", "getClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/classloader/ClassLoaderUtils", "setThreadContextClassloader", "(Ljava/lang/ClassLoader;)Lorg/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/helpers/XPathUtils", "xpath", "Ljavax/xml/xpath/XPath;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/xpath/XPath", "evaluate", "(Ljava/lang/String;Ljava/lang/Object;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "reset", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/helpers/XPathUtils", "java/lang/String", "org/w3c/dom/Node", "javax/xml/namespace/QName", "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "reset", "()V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Exception", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/helpers/XPathUtils", "java/lang/String", "org/w3c/dom/Node", "javax/xml/namespace/QName", "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/classloader/ClassLoaderUtils$ClassLoaderHolder", "reset", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueList", "(Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/w3c/dom/NodeList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/xpath/XPathConstants", "NODESET", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/helpers/XPathUtils", "getValue", "(Ljava/lang/String;Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/NodeList");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueString", "(Ljava/lang/String;Lorg/w3c/dom/Node;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/xpath/XPathConstants", "STRING", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/helpers/XPathUtils", "getValue", "(Ljava/lang/String;Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValueNode", "(Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/w3c/dom/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/xml/xpath/XPathConstants", "NODE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/helpers/XPathUtils", "getValue", "(Ljava/lang/String;Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Node");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isExist", "(Ljava/lang/String;Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/helpers/XPathUtils", "getValue", "(Ljava/lang/String;Lorg/w3c/dom/Node;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "(Ljava/lang/Class<*>;)Ljava/lang/ClassLoader;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getSecurityManager", "()Ljava/lang/SecurityManager;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/helpers/XPathUtils$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/helpers/XPathUtils$1", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ClassLoader");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/SecurityManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/xpath/XPathFactoryConfigurationException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/xpath/XPathFactory", "newInstance", "()Ljavax/xml/xpath/XPathFactory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/helpers/XPathUtils", "xpathFactory", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/helpers/XPathUtils", "xpathFactory", "Ljavax/xml/xpath/XPathFactory;");
methodVisitor.visitLdcInsn("http://javax.xml.XMLConstants/feature/secure-processing");
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/xpath/XPathFactory", "setFeature", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/xpath/XPathFactoryConfigurationException"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
