package asm.com.sun.xml.messaging.saaj.packaging.mime.internet;
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
public class SharedInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/messaging/saaj/packaging/mime/internet/SharedInputStream", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPosition", "()J", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newStream", "(JJ)Ljava/io/InputStream;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeTo", "(JJLjava/io/OutputStream;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
