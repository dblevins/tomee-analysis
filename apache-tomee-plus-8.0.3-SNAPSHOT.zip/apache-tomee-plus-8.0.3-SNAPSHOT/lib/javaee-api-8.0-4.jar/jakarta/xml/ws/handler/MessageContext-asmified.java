package asm.jakarta.xml.ws.handler;
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
public class MessageContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/xml/ws/handler/MessageContext", "Ljava/lang/Object;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", "java/lang/Object", new String[] { "java/util/Map" });

classWriter.visitInnerClass("jakarta/xml/ws/handler/MessageContext$Scope", "jakarta/xml/ws/handler/MessageContext", "Scope", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_OUTBOUND_PROPERTY", "Ljava/lang/String;", null, "jakarta.xml.ws.handler.message.outbound");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDL_DESCRIPTION", "Ljava/lang/String;", null, "jakarta.xml.ws.wsdl.description");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDL_SERVICE", "Ljava/lang/String;", null, "jakarta.xml.ws.wsdl.service");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDL_PORT", "Ljava/lang/String;", null, "jakarta.xml.ws.wsdl.port");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDL_INTERFACE", "Ljava/lang/String;", null, "jakarta.xml.ws.wsdl.interface");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSDL_OPERATION", "Ljava/lang/String;", null, "jakarta.xml.ws.wsdl.operation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_RESPONSE_CODE", "Ljava/lang/String;", null, "jakarta.xml.ws.http.response.code");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_PARAMETERS", "Ljava/lang/String;", null, "jakarta.xml.ws.reference.parameters");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_REQUEST_HEADERS", "Ljava/lang/String;", null, "jakarta.xml.ws.http.request.headers");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_RESPONSE_HEADERS", "Ljava/lang/String;", null, "jakarta.xml.ws.http.response.headers");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_REQUEST_METHOD", "Ljava/lang/String;", null, "jakarta.xml.ws.http.request.method");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_REQUEST", "Ljava/lang/String;", null, "jakarta.xml.ws.servlet.request");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_RESPONSE", "Ljava/lang/String;", null, "jakarta.xml.ws.servlet.response");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_CONTEXT", "Ljava/lang/String;", null, "jakarta.xml.ws.servlet.context");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INBOUND_MESSAGE_ATTACHMENTS", "Ljava/lang/String;", null, "jakarta.xml.ws.binding.attachments.inbound");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUTBOUND_MESSAGE_ATTACHMENTS", "Ljava/lang/String;", null, "jakarta.xml.ws.binding.attachments.outbound");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "QUERY_STRING", "Ljava/lang/String;", null, "jakarta.xml.ws.http.request.querystring");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PATH_INFO", "Ljava/lang/String;", null, "jakarta.xml.ws.http.request.pathinfo");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setScope", "(Ljava/lang/String;Ljakarta/xml/ws/handler/MessageContext$Scope;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getScope", "(Ljava/lang/String;)Ljakarta/xml/ws/handler/MessageContext$Scope;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
