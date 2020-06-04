package asm.net.shibboleth.utilities.java.support.xml;
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
public class BasicParserPool$DocumentBuilderProxyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", null, "javax/xml/parsers/DocumentBuilder", null);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "net/shibboleth/utilities/java/support/xml/BasicParserPool", "DocumentBuilderProxy", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "builder", "Ljavax/xml/parsers/DocumentBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "owningPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "returned", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lnet/shibboleth/utilities/java/support/xml/BasicParserPool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lnet/shibboleth/utilities/java/support/xml/BasicParserPool;Ljavax/xml/parsers/DocumentBuilder;Lnet/shibboleth/utilities/java/support/xml/BasicParserPool;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "this$0", "Lnet/shibboleth/utilities/java/support/xml/BasicParserPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/parsers/DocumentBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "owningPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "returned", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDOMImplementation", "()Lorg/w3c/dom/DOMImplementation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "getDOMImplementation", "()Lorg/w3c/dom/DOMImplementation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSchema", "()Ljavax/xml/validation/Schema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "getSchema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNamespaceAware", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "isNamespaceAware", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isValidating", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "isValidating", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isXIncludeAware", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "isXIncludeAware", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newDocument", "()Lorg/w3c/dom/Document;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "newDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/File;)Lorg/w3c/dom/Document;", null, new String[] { "org/xml/sax/SAXException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Ljava/io/File;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;", null, new String[] { "org/xml/sax/SAXException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/InputStream;)Lorg/w3c/dom/Document;", null, new String[] { "org/xml/sax/SAXException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Ljava/io/InputStream;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/InputStream;Ljava/lang/String;)Lorg/w3c/dom/Document;", null, new String[] { "org/xml/sax/SAXException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Ljava/io/InputStream;Ljava/lang/String;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/lang/String;)Lorg/w3c/dom/Document;", null, new String[] { "org/xml/sax/SAXException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Ljava/lang/String;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "checkValidState", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getOwningPool", "()Lnet/shibboleth/utilities/java/support/xml/ParserPool;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "owningPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getProxiedBuilder", "()Ljavax/xml/parsers/DocumentBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isReturned", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "returned", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "setReturned", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "returned", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkValidState", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "isReturned", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DocumentBuilderProxy has already been returned to its owning pool");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "finalize", "()V", null, new String[] { "java/lang/Throwable" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "finalize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/xml/BasicParserPool$DocumentBuilderProxy", "owningPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "net/shibboleth/utilities/java/support/xml/ParserPool", "returnBuilder", "(Ljavax/xml/parsers/DocumentBuilder;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
