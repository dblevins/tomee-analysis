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
public class FastInfosetWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/jvnet/fastinfoset/sax/FastInfosetWriter", null, "java/lang/Object", new String[] { "org/xml/sax/ContentHandler", "org/xml/sax/ext/LexicalHandler", "org/jvnet/fastinfoset/sax/EncodingAlgorithmContentHandler", "org/jvnet/fastinfoset/sax/PrimitiveTypeContentHandler", "org/jvnet/fastinfoset/sax/RestrictedAlphabetContentHandler", "org/jvnet/fastinfoset/sax/ExtendedContentHandler", "org/jvnet/fastinfoset/FastInfosetSerializer" });

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
