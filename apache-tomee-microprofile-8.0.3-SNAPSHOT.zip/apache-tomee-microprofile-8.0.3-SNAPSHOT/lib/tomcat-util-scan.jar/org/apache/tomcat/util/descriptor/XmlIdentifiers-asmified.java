package asm.org.apache.tomcat.util.descriptor;
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
public class XmlIdentifiersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/tomcat/util/descriptor/XmlIdentifiers", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_2001_XSD", "Ljava/lang/String;", null, "http://www.w3.org/2001/xml.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DATATYPES_PUBLIC", "Ljava/lang/String;", null, "datatypes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XSD_10_PUBLIC", "Ljava/lang/String;", null, "-//W3C//DTD XMLSCHEMA 200102//EN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_22_PUBLIC", "Ljava/lang/String;", null, "-//Sun Microsystems, Inc.//DTD Web Application 2.2//EN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_22_SYSTEM", "Ljava/lang/String;", null, "http://java.sun.com/dtd/web-app_2_2.dtd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLD_11_PUBLIC", "Ljava/lang/String;", null, "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.1//EN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLD_11_SYSTEM", "Ljava/lang/String;", null, "http://java.sun.com/dtd/web-jsptaglibrary_1_1.dtd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_23_PUBLIC", "Ljava/lang/String;", null, "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_23_SYSTEM", "Ljava/lang/String;", null, "http://java.sun.com/dtd/web-app_2_3.dtd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLD_12_PUBLIC", "Ljava/lang/String;", null, "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.2//EN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLD_12_SYSTEM", "Ljava/lang/String;", null, "http://java.sun.com/dtd/web-jsptaglibrary_1_2.dtd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAEE_1_4_NS", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/j2ee");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_24_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLD_20_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEBSERVICES_11_XSD", "Ljava/lang/String;", null, "http://www.ibm.com/webservices/xsd/j2ee_web_services_1_1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAEE_5_NS", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaee");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_25_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TLD_21_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaee/web-jsptaglibrary_2_1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEBSERVICES_12_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaeejavaee_web_services_1_2.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAEE_6_NS", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaee");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_30_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_FRAGMENT_30_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaee/web-fragment_3_0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEBSERVICES_13_XSD", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/javaee/javaee_web_services_1_3.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAEE_7_NS", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/javaee");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_31_XSD", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_FRAGMENT_31_XSD", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/javaee/web-fragment_3_1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEBSERVICES_14_XSD", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/javaee/javaee_web_services_1_4.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAEE_8_NS", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/javaee");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_40_XSD", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEB_FRAGMENT_40_XSD", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/javaee/web-fragment_4_0.xsd");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
