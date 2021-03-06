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
public class XalanXPathAPIDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/utils/XalanXPathAPI", null, "java/lang/Object", new String[] { "org/apache/xml/security/utils/XPathAPI" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xpathStr", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xpath", "Lorg/apache/xpath/XPath;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "funcTable", "Lorg/apache/xpath/compiler/FunctionTable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "installed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "context", "Lorg/apache/xpath/XPathContext;", null, null);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/XalanXPathAPI", "eval", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/apache/xpath/objects/XObject;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xpath/objects/XObject", "nodelist", "()Lorg/w3c/dom/NodeList;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/w3c/dom/Node;)Z", null, new String[] { "javax/xml/transform/TransformerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/XalanXPathAPI", "eval", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/apache/xpath/objects/XObject;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xpath/objects/XObject", "bool", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "xpath", "Lorg/apache/xpath/XPath;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "context", "Lorg/apache/xpath/XPathContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_SYNCHRONIZED, "isInstalled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "installed", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "eval", "(Lorg/w3c/dom/Node;Lorg/w3c/dom/Node;Ljava/lang/String;Lorg/w3c/dom/Node;)Lorg/apache/xpath/objects/XObject;", null, new String[] { "javax/xml/transform/TransformerException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "context", "Lorg/apache/xpath/XPathContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xpath/XPathContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xpath/XPathContext", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "context", "Lorg/apache/xpath/XPathContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "context", "Lorg/apache/xpath/XPathContext;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xpath/XPathContext", "setSecureProcessing", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNodeType", "()S", true);
methodVisitor.visitIntInsn(BIPUSH, 9);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Document");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/w3c/dom/Node"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/utils/PrefixResolverDefault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/utils/PrefixResolverDefault", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("here()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "context", "Lorg/apache/xpath/XPathContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xpath/XPathContext", "reset", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/w3c/dom/Node", "org/apache/xml/utils/PrefixResolverDefault"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/XalanXPathAPI", "createXPath", "(Ljava/lang/String;Lorg/apache/xml/utils/PrefixResolver;)Lorg/apache/xpath/XPath;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "xpath", "Lorg/apache/xpath/XPath;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "xpathStr", "Ljava/lang/String;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "context", "Lorg/apache/xpath/XPathContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xpath/XPathContext", "getDTMHandleFromNode", "(Lorg/w3c/dom/Node;)I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "xpath", "Lorg/apache/xpath/XPath;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/utils/XalanXPathAPI", "context", "Lorg/apache/xpath/XPathContext;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xpath/XPath", "execute", "(Lorg/apache/xpath/XPathContext;ILorg/apache/xml/utils/PrefixResolver;)Lorg/apache/xpath/objects/XObject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createXPath", "(Ljava/lang/String;Lorg/apache/xml/utils/PrefixResolver;)Lorg/apache/xpath/XPath;", null, new String[] { "javax/xml/transform/TransformerException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/transform/SourceLocator;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/utils/PrefixResolver;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Integer", "TYPE", "Ljava/lang/Class;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/transform/ErrorListener;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xpath/compiler/FunctionTable;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "funcTable", "Lorg/apache/xpath/compiler/FunctionTable;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xpath/XPath;"));
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getConstructor", "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xpath/XPath");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/xml/security/utils/XalanXPathAPI", "java/lang/String", "org/apache/xml/utils/PrefixResolver", "org/apache/xpath/XPath", "[Ljava/lang/Class;", "[Ljava/lang/Object;"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/xpath/XPath");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xpath/XPath", "<init>", "(Ljava/lang/String;Ljavax/xml/transform/SourceLocator;Lorg/apache/xml/utils/PrefixResolver;ILjavax/xml/transform/ErrorListener;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNCHRONIZED, "fixupFunctionTable", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "installed", "Z");
methodVisitor.visitTypeInsn(NEW, "org/apache/xpath/compiler/FunctionTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xpath/compiler/FunctionTable", "<init>", "()V", false);
methodVisitor.visitLdcInsn("here");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xpath/compiler/FunctionTable", "functionAvailable", "(Ljava/lang/String;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Here function already registered");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "installed", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Registering Here function");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xpath/Expression;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xpath/compiler/FunctionTable;"));
methodVisitor.visitLdcInsn("installFunction");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "getModifiers", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IAND);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("here");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/transforms/implementations/FuncHere");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/transforms/implementations/FuncHere", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "installed", "Z");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error installing function using the static installFunction method");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "installed", "Z");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/xpath/compiler/FunctionTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xpath/compiler/FunctionTable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "funcTable", "Lorg/apache/xpath/compiler/FunctionTable;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xpath/compiler/FunctionTable;"));
methodVisitor.visitLdcInsn("installFunction");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("here");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/transforms/implementations/FuncHere;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "funcTable", "Lorg/apache/xpath/compiler/FunctionTable;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "installed", "Z");
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error installing function using the static installFunction method");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "installed", "Z");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Registered class {} for XPath function 'here()' function in internal table");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/transforms/implementations/FuncHere;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Unable to register class {} for XPath function 'here()' function in internal table");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/transforms/implementations/FuncHere;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/utils/XalanXPathAPI;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XalanXPathAPI", "fixupFunctionTable", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
