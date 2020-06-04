package asm.org.jvnet.fastinfoset.sax;
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
public class FastInfosetReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/jvnet/fastinfoset/sax/FastInfosetReader", null, "java/lang/Object", new String[] { "org/xml/sax/XMLReader", "org/jvnet/fastinfoset/FastInfosetParser" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCODING_ALGORITHM_CONTENT_HANDLER_PROPERTY", "Ljava/lang/String;", null, "http://jvnet.org/fastinfoset/sax/properties/encoding-algorithm-content-handler");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRIMITIVE_TYPE_CONTENT_HANDLER_PROPERTY", "Ljava/lang/String;", null, "http://jvnet.org/fastinfoset/sax/properties/primitive-type-content-handler");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parse", "(Ljava/io/InputStream;)V", null, new String[] { "java/io/IOException", "org/jvnet/fastinfoset/FastInfosetException", "org/xml/sax/SAXException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLexicalHandler", "(Lorg/xml/sax/ext/LexicalHandler;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLexicalHandler", "()Lorg/xml/sax/ext/LexicalHandler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDeclHandler", "(Lorg/xml/sax/ext/DeclHandler;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclHandler", "()Lorg/xml/sax/ext/DeclHandler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEncodingAlgorithmContentHandler", "(Lorg/jvnet/fastinfoset/sax/EncodingAlgorithmContentHandler;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEncodingAlgorithmContentHandler", "()Lorg/jvnet/fastinfoset/sax/EncodingAlgorithmContentHandler;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPrimitiveTypeContentHandler", "(Lorg/jvnet/fastinfoset/sax/PrimitiveTypeContentHandler;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimitiveTypeContentHandler", "()Lorg/jvnet/fastinfoset/sax/PrimitiveTypeContentHandler;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
