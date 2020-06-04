package asm.com.sun.xml.messaging.saaj.util;
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
public class LogDomainConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/messaging/saaj/util/LogDomainConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE_TOPLEVEL_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.client");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.soap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UTIL_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.util");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_CONN_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.client.p2p");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMING_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.soap.name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_IMPL_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.soap.impl");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_VER1_1_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.soap.ver1_1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_VER1_2_DOMAIN", "Ljava/lang/String;", null, "com.sun.xml.messaging.saaj.soap.ver1_2");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
