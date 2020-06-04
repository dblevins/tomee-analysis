package asm.org.apache.coyote.http11;
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
public class ConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/coyote/http11/Constants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_CONNECTION_TIMEOUT", "I", null, new Integer(60000));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CRLF", "Ljava/lang/String;", null, "\r\n");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CR", "B", null, new Integer(13));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LF", "B", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SP", "B", null, new Integer(32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HT", "B", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLON", "B", null, new Integer(58));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEMI_COLON", "B", null, new Integer(59));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "A", "B", null, new Integer(65));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "a", "B", null, new Integer(97));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Z", "B", null, new Integer(90));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUESTION", "B", null, new Integer(63));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LC_OFFSET", "B", null, new Integer(-32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONNECTION", "Ljava/lang/String;", null, "Connection");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLOSE", "Ljava/lang/String;", null, "close");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "CLOSE_BYTES", "[B", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "KEEPALIVE", "Ljava/lang/String;", null, "keep-alive");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEEP_ALIVE_HEADER_VALUE_TOKEN", "Ljava/lang/String;", null, "keep-alive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "KEEPALIVE_BYTES", "[B", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHUNKED", "Ljava/lang/String;", null, "chunked");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACK_BYTES", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRANSFERENCODING", "Ljava/lang/String;", null, "Transfer-Encoding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEEP_ALIVE_HEADER_NAME", "Ljava/lang/String;", null, "Keep-Alive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_200_BYTES", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_400_BYTES", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_404_BYTES", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IDENTITY_FILTER", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHUNKED_FILTER", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VOID_FILTER", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GZIP_FILTER", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BUFFERED_FILTER", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_10", "Ljava/lang/String;", null, "HTTP/1.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_11", "Ljava/lang/String;", null, "HTTP/1.1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_11_BYTES", "[B", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("close");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/ByteChunk", "convertToBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Constants", "CLOSE_BYTES", "[B");
methodVisitor.visitLdcInsn("keep-alive");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/ByteChunk", "convertToBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Constants", "KEEPALIVE_BYTES", "[B");
methodVisitor.visitLdcInsn("HTTP/1.1 100 \r\n\r\n");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/ByteChunk", "convertToBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Constants", "ACK_BYTES", "[B");
methodVisitor.visitLdcInsn("200");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/ByteChunk", "convertToBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Constants", "_200_BYTES", "[B");
methodVisitor.visitLdcInsn("400");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/ByteChunk", "convertToBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Constants", "_400_BYTES", "[B");
methodVisitor.visitLdcInsn("404");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/ByteChunk", "convertToBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Constants", "_404_BYTES", "[B");
methodVisitor.visitLdcInsn("HTTP/1.1");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/ByteChunk", "convertToBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/coyote/http11/Constants", "HTTP_11_BYTES", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
