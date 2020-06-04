package asm.org.apache.coyote.http2;
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
public class Http2Parser$OutputDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/apache/coyote/http2/Http2Parser$Output", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/coyote/http2/HpackDecoder$HeaderEmitter", "org/apache/coyote/http2/HpackDecoder", "HeaderEmitter", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/coyote/http2/Http2Parser$Output", "org/apache/coyote/http2/Http2Parser", "Output", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHpackDecoder", "()Lorg/apache/coyote/http2/HpackDecoder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startRequestBodyFrame", "(IIZ)Ljava/nio/ByteBuffer;", null, new String[] { "org/apache/coyote/http2/Http2Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endRequestBodyFrame", "(I)V", null, new String[] { "org/apache/coyote/http2/Http2Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "receivedEndOfStream", "(I)V", null, new String[] { "org/apache/coyote/http2/ConnectionException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "swallowedPadding", "(II)V", null, new String[] { "org/apache/coyote/http2/ConnectionException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "headersStart", "(IZ)Lorg/apache/coyote/http2/HpackDecoder$HeaderEmitter;", null, new String[] { "org/apache/coyote/http2/Http2Exception", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "headersContinue", "(IZ)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "headersEnd", "(I)V", null, new String[] { "org/apache/coyote/http2/ConnectionException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "reprioritise", "(IIZI)V", null, new String[] { "org/apache/coyote/http2/Http2Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "reset", "(IJ)V", null, new String[] { "org/apache/coyote/http2/Http2Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setting", "(Lorg/apache/coyote/http2/Setting;J)V", null, new String[] { "org/apache/coyote/http2/ConnectionException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "settingsEnd", "(Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pingReceive", "([BZ)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "goaway", "(IJLjava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "incrementWindowSize", "(II)V", null, new String[] { "org/apache/coyote/http2/Http2Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "swallowed", "(ILorg/apache/coyote/http2/FrameType;II)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
