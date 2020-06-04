package asm.jakarta.xml.soap;
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
public class SOAPBodyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/xml/soap/SOAPBody", null, "java/lang/Object", new String[] { "jakarta/xml/soap/SOAPElement" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFault", "()Ljakarta/xml/soap/SOAPFault;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasFault", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFault", "()Ljakarta/xml/soap/SOAPFault;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addBodyElement", "(Ljakarta/xml/soap/Name;)Ljakarta/xml/soap/SOAPBodyElement;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFault", "(Ljakarta/xml/soap/Name;Ljava/lang/String;Ljava/util/Locale;)Ljakarta/xml/soap/SOAPFault;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFault", "(Ljakarta/xml/soap/Name;Ljava/lang/String;)Ljakarta/xml/soap/SOAPFault;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDocument", "(Lorg/w3c/dom/Document;)Ljakarta/xml/soap/SOAPBodyElement;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addBodyElement", "(Ljavax/xml/namespace/QName;)Ljakarta/xml/soap/SOAPBodyElement;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljakarta/xml/soap/SOAPFault;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/util/Locale;)Ljakarta/xml/soap/SOAPFault;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "extractContentAsDocument", "()Lorg/w3c/dom/Document;", null, new String[] { "jakarta/xml/soap/SOAPException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
