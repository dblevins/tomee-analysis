package asm.org.apache.cxf.ws.addressing;
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
public class JAXWSAConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/ws/addressing/JAXWSAConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAW_PREFIX", "Ljava/lang/String;", null, "wsaw");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSAW", "Ljava/lang/String;", null, "http://www.w3.org/2006/05/addressing/wsdl");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAM_PREFIX", "Ljava/lang/String;", null, "wsam");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSAM", "Ljava/lang/String;", null, "http://www.w3.org/2007/05/addressing/metadata");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAW_ACTION_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAM_ACTION_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAW_USINGADDRESSING_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSA", "Ljava/lang/String;", null, "http://www.w3.org/2005/08/addressing");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_PREFIX", "Ljava/lang/String;", null, "wsa");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_XSD", "Ljava/lang/String;", null, "http://www.w3.org/2006/03/addressing/ws-addr.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ERF_NAME", "Ljava/lang/String;", null, "EndpointReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_REFERENCEPARAMETERS_NAME", "Ljava/lang/String;", null, "ReferenceParameters");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_METADATA_NAME", "Ljava/lang/String;", null, "Metadata");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ADDRESS_NAME", "Ljava/lang/String;", null, "Address");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAM_SERVICENAME_NAME", "Ljava/lang/String;", null, "ServiceName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAM_INTERFACE_NAME", "Ljava/lang/String;", null, "InterfaceName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSAM_ENDPOINT_NAME", "Ljava/lang/String;", null, "EndpointName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDLI_PFX", "Ljava/lang/String;", null, "wsdli");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDLI_WSDLLOCATION", "Ljava/lang/String;", null, "wsdlLocation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_WSDLI", "Ljava/lang/String;", null, "http://www.w3.org/ns/wsdl-instance");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLIENT_ADDRESSING_PROPERTIES", "Ljava/lang/String;", null, "jakarta.xml.ws.addressing.context");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADDRESSING_PROPERTIES_INBOUND", "Ljava/lang/String;", null, "jakarta.xml.ws.addressing.context.inbound");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADDRESSING_PROPERTIES_OUTBOUND", "Ljava/lang/String;", null, "jakarta.xml.ws.addressing.context.outbound");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "CLIENT_ADDRESSING_PROPERTIES_INBOUND", "Ljava/lang/String;", null, "jakarta.xml.ws.addressing.context.inbound");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "CLIENT_ADDRESSING_PROPERTIES_OUTBOUND", "Ljava/lang/String;", null, "jakarta.xml.ws.addressing.context.outbound");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SERVER_ADDRESSING_PROPERTIES_INBOUND", "Ljava/lang/String;", null, "jakarta.xml.ws.addressing.context.inbound");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "SERVER_ADDRESSING_PROPERTIES_OUTBOUND", "Ljava/lang/String;", null, "jakarta.xml.ws.addressing.context.outbound");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
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
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2006/05/addressing/wsdl");
methodVisitor.visitLdcInsn("Action");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/addressing/JAXWSAConstants", "WSAW_ACTION_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/addressing/metadata");
methodVisitor.visitLdcInsn("Action");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/addressing/JAXWSAConstants", "WSAM_ACTION_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2006/05/addressing/wsdl");
methodVisitor.visitLdcInsn("UsingAddressing");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/addressing/JAXWSAConstants", "WSAW_USINGADDRESSING_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
