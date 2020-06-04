package asm.javax.xml.soap;
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
public class SOAPEnvelopeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/xml/soap/SOAPEnvelope", null, "java/lang/Object", new String[] { "javax/xml/soap/SOAPElement" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/soap/Name;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createName", "(Ljava/lang/String;)Ljavax/xml/soap/Name;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getHeader", "()Ljavax/xml/soap/SOAPHeader;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBody", "()Ljavax/xml/soap/SOAPBody;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addHeader", "()Ljavax/xml/soap/SOAPHeader;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addBody", "()Ljavax/xml/soap/SOAPBody;", null, new String[] { "javax/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
