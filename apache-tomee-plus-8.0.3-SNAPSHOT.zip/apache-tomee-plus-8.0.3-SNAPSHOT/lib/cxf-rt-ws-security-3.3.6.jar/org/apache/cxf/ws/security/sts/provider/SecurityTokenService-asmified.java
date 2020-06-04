package asm.org.apache.cxf.ws.security.sts.provider;
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
public class SecurityTokenServiceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/ws/security/sts/provider/SecurityTokenService", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/jws/WebService;", true);
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/wsdl");
annotationVisitor0.visit("name", "SecurityTokenService");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlSeeAlso;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/ObjectFactory;"));
annotationVisitor1.visit(null, Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/wstrust14/ObjectFactory;"));
annotationVisitor1.visit(null, Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/secext/ObjectFactory;"));
annotationVisitor1.visit(null, Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/utility/ObjectFactory;"));
annotationVisitor1.visit(null, Type.getType("Lorg/apache/cxf/ws/security/sts/provider/model/xmldsig/ObjectFactory;"));
annotationVisitor1.visit(null, Type.getType("Lorg/apache/cxf/ws/addressing/ObjectFactory;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/jws/soap/SOAPBinding;", true);
annotationVisitor0.visitEnum("parameterStyle", "Ljakarta/jws/soap/SOAPBinding$ParameterStyle;", "BARE");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("jakarta/jws/soap/SOAPBinding$ParameterStyle", "jakarta/jws/soap/SOAPBinding", "ParameterStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "keyExchangeToken", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebResult;", true);
annotationVisitor0.visit("name", "RequestSecurityTokenResponse");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visit("partName", "response");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/xml/ws/Action;", true);
annotationVisitor0.visit("input", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/KET");
annotationVisitor0.visit("output", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/KETFinal");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebMethod;", true);
annotationVisitor0.visit("operationName", "KeyExchangeToken");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/jws/WebParam;", true);
annotationVisitor0.visit("partName", "request");
annotationVisitor0.visit("name", "RequestSecurityToken");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "issue", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseCollectionType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebResult;", true);
annotationVisitor0.visit("name", "RequestSecurityTokenResponseCollection");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visit("partName", "responseCollection");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/xml/ws/Action;", true);
annotationVisitor0.visit("input", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue");
annotationVisitor0.visit("output", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTRC/IssueFinal");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebMethod;", true);
annotationVisitor0.visit("operationName", "Issue");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/jws/WebParam;", true);
annotationVisitor0.visit("partName", "request");
annotationVisitor0.visit("name", "RequestSecurityToken");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "issueSingle", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebResult;", true);
annotationVisitor0.visit("name", "RequestSecurityTokenResponse");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visit("partName", "response");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/xml/ws/Action;", true);
annotationVisitor0.visit("input", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue");
annotationVisitor0.visit("output", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTRC/IssueFinal");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebMethod;", true);
annotationVisitor0.visit("operationName", "Issue");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/jws/WebParam;", true);
annotationVisitor0.visit("partName", "request");
annotationVisitor0.visit("name", "RequestSecurityToken");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cancel", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebResult;", true);
annotationVisitor0.visit("name", "RequestSecurityTokenResponse");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visit("partName", "response");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/xml/ws/Action;", true);
annotationVisitor0.visit("input", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Cancel");
annotationVisitor0.visit("output", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/CancelFinal");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebMethod;", true);
annotationVisitor0.visit("operationName", "Cancel");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/jws/WebParam;", true);
annotationVisitor0.visit("partName", "request");
annotationVisitor0.visit("name", "RequestSecurityToken");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validate", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebResult;", true);
annotationVisitor0.visit("name", "RequestSecurityTokenResponse");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visit("partName", "response");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/xml/ws/Action;", true);
annotationVisitor0.visit("input", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Validate");
annotationVisitor0.visit("output", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/ValidateFinal");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebMethod;", true);
annotationVisitor0.visit("operationName", "Validate");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/jws/WebParam;", true);
annotationVisitor0.visit("partName", "request");
annotationVisitor0.visit("name", "RequestSecurityToken");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "requestCollection", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenCollectionType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseCollectionType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebResult;", true);
annotationVisitor0.visit("name", "RequestSecurityTokenResponseCollection");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visit("partName", "responseCollection");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebMethod;", true);
annotationVisitor0.visit("operationName", "RequestCollection");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/jws/WebParam;", true);
annotationVisitor0.visit("partName", "requestCollection");
annotationVisitor0.visit("name", "RequestSecurityTokenCollection");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "renew", "(Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenType;)Lorg/apache/cxf/ws/security/sts/provider/model/RequestSecurityTokenResponseType;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebResult;", true);
annotationVisitor0.visit("name", "RequestSecurityTokenResponse");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visit("partName", "response");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/xml/ws/Action;", true);
annotationVisitor0.visit("input", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Renew");
annotationVisitor0.visit("output", "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/RenewFinal");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/jws/WebMethod;", true);
annotationVisitor0.visit("operationName", "Renew");
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/jws/WebParam;", true);
annotationVisitor0.visit("partName", "request");
annotationVisitor0.visit("name", "RequestSecurityToken");
annotationVisitor0.visit("targetNamespace", "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
