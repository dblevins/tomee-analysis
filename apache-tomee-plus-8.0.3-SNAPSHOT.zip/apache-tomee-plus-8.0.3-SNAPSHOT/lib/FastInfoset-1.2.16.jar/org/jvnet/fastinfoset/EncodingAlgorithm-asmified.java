package asm.org.jvnet.fastinfoset;
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
public class EncodingAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/jvnet/fastinfoset/EncodingAlgorithm", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "decodeFromBytes", "([BII)Ljava/lang/Object;", null, new String[] { "org/jvnet/fastinfoset/EncodingAlgorithmException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "decodeFromInputStream", "(Ljava/io/InputStream;)Ljava/lang/Object;", null, new String[] { "org/jvnet/fastinfoset/EncodingAlgorithmException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "encodeToOutputStream", "(Ljava/lang/Object;Ljava/io/OutputStream;)V", null, new String[] { "org/jvnet/fastinfoset/EncodingAlgorithmException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertFromCharacters", "([CII)Ljava/lang/Object;", null, new String[] { "org/jvnet/fastinfoset/EncodingAlgorithmException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "convertToCharacters", "(Ljava/lang/Object;Ljava/lang/StringBuffer;)V", null, new String[] { "org/jvnet/fastinfoset/EncodingAlgorithmException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
