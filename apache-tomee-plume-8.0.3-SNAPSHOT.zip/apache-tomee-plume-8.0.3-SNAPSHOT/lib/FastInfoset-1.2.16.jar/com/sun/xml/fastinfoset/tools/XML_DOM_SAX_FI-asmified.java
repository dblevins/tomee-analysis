package asm.com.sun.xml.fastinfoset.tools;
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
public class XML_DOM_SAX_FIDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "com/sun/xml/fastinfoset/tools/XML_DOM_SAX_FI", null, "com/sun/xml/fastinfoset/tools/TransformInputOutput", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/tools/TransformInputOutput", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/parsers/DocumentBuilderFactory", "newInstance", "()Ljavax/xml/parsers/DocumentBuilderFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilderFactory", "setNamespaceAware", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilderFactory", "newDocumentBuilder", "()Ljavax/xml/parsers/DocumentBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/tools/XML_DOM_SAX_FI", "createRelativePathResolver", "(Ljava/lang/String;)Lorg/xml/sax/EntityResolver;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "setEntityResolver", "(Lorg/xml/sax/EntityResolver;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/xml/parsers/DocumentBuilderFactory", "javax/xml/parsers/DocumentBuilder"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Ljava/io/InputStream;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/transform/TransformerFactory", "newInstance", "()Ljavax/xml/transform/TransformerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/TransformerFactory", "newTransformer", "()Ljavax/xml/transform/Transformer;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/dom/DOMSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/dom/DOMSource", "<init>", "(Lorg/w3c/dom/Node;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/fastinfoset/FastInfosetResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/fastinfoset/FastInfosetResult", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/transform/Transformer", "transform", "(Ljavax/xml/transform/Source;Ljavax/xml/transform/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/XML_DOM_SAX_FI", "parse", "(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "main", "([Ljava/lang/String;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/fastinfoset/tools/XML_DOM_SAX_FI");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/fastinfoset/tools/XML_DOM_SAX_FI", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/tools/XML_DOM_SAX_FI", "parse", "([Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
