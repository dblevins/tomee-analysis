package asm.org.opensaml.saml.saml2.core;
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
public class StatusCodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/opensaml/saml/saml2/core/StatusCode", null, "java/lang/Object", new String[] { "org/opensaml/saml/common/SAMLObject" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_LOCAL_NAME", "Ljava/lang/String;", null, "StatusCode");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_LOCAL_NAME", "Ljava/lang/String;", null, "StatusCodeType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_NAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_ATTRIB_NAME", "Ljava/lang/String;", null, "Value");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUCCESS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:Success");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUESTER", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:Requester");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESPONDER", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:Responder");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERSION_MISMATCH", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:VersionMismatch");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTHN_FAILED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:AuthnFailed");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_ATTR_NAME_OR_VALUE", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:InvalidAttrNameOrValue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_NAMEID_POLICY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:InvalidNameIDPolicy");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_AUTHN_CONTEXT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:NoAuthnContext");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_AVAILABLE_IDP", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:NoAvailableIDP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_PASSIVE", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:NoPassive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUPPORTED_IDP", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:NoSupportedIDP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTIAL_LOGOUT", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:PartialLogout");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROXY_COUNT_EXCEEDED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:ProxyCountExceeded");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_DENIED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:RequestDenied");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_UNSUPPORTED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:RequestUnsupported");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_VERSION_DEPRECATED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:RequestVersionDeprecated");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_VERSION_TOO_HIGH", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:RequestVersionTooHigh");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_VERSION_TOO_LOW", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:RequestVersionTooLow");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_NOT_RECOGNIZED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:ResourceNotRecognized");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TOO_MANY_RESPONSES", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:TooManyResponses");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNKNOWN_ATTR_PROFILE", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:UnknownAttrProfile");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNKNOWN_PRINCIPAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:UnknownPrincipal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSUPPORTED_BINDING", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:2.0:status:UnsupportedBinding");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStatusCode", "()Lorg/opensaml/saml/saml2/core/StatusCode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setStatusCode", "(Lorg/opensaml/saml/saml2/core/StatusCode;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setValue", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:protocol");
methodVisitor.visitLdcInsn("StatusCode");
methodVisitor.visitLdcInsn("saml2p");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/StatusCode", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:2.0:protocol");
methodVisitor.visitLdcInsn("StatusCodeType");
methodVisitor.visitLdcInsn("saml2p");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/StatusCode", "TYPE_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
