package asm.org.eclipse.persistence.platform.xml.jaxp;
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
public class JAXPTransformerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", null, "java/lang/Object", new String[] { "org/eclipse/persistence/platform/xml/XMLTransformer" });

classWriter.visitInnerClass("org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer$TransformErrorListener", "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "TransformErrorListener", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer$TransformerFactoryHelper", "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "TransformerFactoryHelper", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "fragment", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NO", "Ljava/lang/String;", null, "no");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "YES", "Ljava/lang/String;", null, "yes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transformer", "Ljavax/xml/transform/Transformer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encoding", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "formatted", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "version", "Ljava/lang/String;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncoding", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "encoding", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEncoding", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "encoding", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("encoding");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFormattedOutput", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "formatted", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFormattedOutput", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "formatted", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("indent");
methodVisitor.visitLdcInsn("yes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("indent");
methodVisitor.visitLdcInsn("no");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersion", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "version", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVersion", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "version", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("version");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Lorg/w3c/dom/Node;Ljava/io/OutputStream;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamResult", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "isFragment", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "getTransformer", "()Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitLdcInsn("omit-xml-declaration");
methodVisitor.visitLdcInsn("yes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/xml/transform/dom/DOMSource", "javax/xml/transform/stream/StreamResult"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Lorg/w3c/dom/Node;Lorg/xml/sax/ContentHandler;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/sax/SAXResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/sax/SAXResult", "<init>", "(Lorg/xml/sax/ContentHandler;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Lorg/w3c/dom/Node;Ljavax/xml/transform/Result;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "isFragment", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/transform/sax/SAXResult");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/w3c/dom/Document");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/w3c/dom/Document");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/transform/dom/DOMSource"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Lorg/w3c/dom/Node;Ljava/io/Writer;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamResult", "<init>", "(Ljava/io/Writer;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "isFragment", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "getTransformer", "()Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitLdcInsn("omit-xml-declaration");
methodVisitor.visitLdcInsn("yes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/xml/transform/dom/DOMSource", "javax/xml/transform/stream/StreamResult"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/transform/TransformerException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/transform/stream/StreamResult");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "isFragment", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "getTransformer", "()Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitLdcInsn("omit-xml-declaration");
methodVisitor.visitLdcInsn("yes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "getTransformer", "()Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/transform/TransformerException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/xml/XMLPlatformException", "xmlPlatformTransformException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Lorg/w3c/dom/Document;Lorg/w3c/dom/Node;Ljava/net/URL;)V", null, new String[] { "org/eclipse/persistence/platform/xml/XMLPlatformException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/XMLHelper", "createTransformerFactory", "(Z)Ljavax/xml/transform/TransformerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer$TransformErrorListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer$TransformErrorListener", "<init>", "(Lorg/eclipse/persistence/platform/xml/jaxp/JAXPTransformer$TransformErrorListener;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/TransformerFactory", "setErrorListener", "(Ljavax/xml/transform/ErrorListener;)V", false);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "openStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamSource", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/TransformerFactory", "newTransformer", "(Ljavax/xml/transform/Source;)Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMResult", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/xml/XMLPlatformException", "xmlPlatformTransformException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFragment", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "fragment", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFragment", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "fragment", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransformer", "()Ljavax/xml/transform/Transformer;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/transform/TransformerConfigurationException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer$TransformerFactoryHelper", "getTransformerFactory", "()Ljavax/xml/transform/TransformerFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/TransformerFactory", "newTransformer", "()Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "formatted", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("indent");
methodVisitor.visitLdcInsn("yes");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("indent");
methodVisitor.visitLdcInsn("no");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "encoding", "Ljava/lang/String;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("encoding");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "encoding", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "version", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitLdcInsn("version");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "version", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "setOutputProperty", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/transform/TransformerConfigurationException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/xml/XMLPlatformException", "xmlPlatformTransformException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/platform/xml/XMLPlatformException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/xml/jaxp/JAXPTransformer", "transformer", "Ljavax/xml/transform/Transformer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
