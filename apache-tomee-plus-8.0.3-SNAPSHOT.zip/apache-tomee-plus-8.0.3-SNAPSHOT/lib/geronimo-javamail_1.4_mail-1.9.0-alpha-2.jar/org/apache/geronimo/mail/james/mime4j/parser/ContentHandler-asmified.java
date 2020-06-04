package asm.org.apache.geronimo.mail.james.mime4j.parser;
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
public class ContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/geronimo/mail/james/mime4j/parser/ContentHandler", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startMessage", "()V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endMessage", "()V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startBodyPart", "()V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endBodyPart", "()V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startHeader", "()V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "field", "(Lorg/apache/geronimo/mail/james/mime4j/stream/Field;)V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endHeader", "()V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preamble", "(Ljava/io/InputStream;)V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "epilogue", "(Ljava/io/InputStream;)V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startMultipart", "(Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;)V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endMultipart", "()V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "body", "(Lorg/apache/geronimo/mail/james/mime4j/stream/BodyDescriptor;Ljava/io/InputStream;)V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "raw", "(Ljava/io/InputStream;)V", null, new String[] { "org/apache/geronimo/mail/james/mime4j/MimeException", "java/io/IOException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
