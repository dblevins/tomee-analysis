package asm.org.opensaml.soap.wstrust;
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
public class WSTrustConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/opensaml/soap/wstrust/WSTrustConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WST_VERSION", "Ljava/lang/String;", null, "1.3");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WST_PREFIX", "Ljava/lang/String;", null, "wst");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WST_NS", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RST_ISSUE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Issue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RST_CANCEL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Cancel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RST_STSCANCEL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/STSCancel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RST_VALIDATE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Validate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RST_RENEW", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/Renew");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RST_KET", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RST/KET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_ISSUE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/Issue");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_CANCEL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/Cancel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_CANCEL_FINAL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/CancelFinal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_VALIDATE", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/Validate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_VALIDATE_FINAL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/ValidateFinal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_RENEW", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/Renew");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_RENEW_FINAL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/RenewFinal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_KET", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/KET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTR_KET_FINAL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTR/KETFinal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WSA_ACTION_RSTRC_ISSUE_FINAL", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RSTRC/IssueFinal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_INVALID_REQUEST", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_FAILED_AUTHENTICATION", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_REQUEST_FAILED", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_INVALID_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_AUTHENTICATION_BAD_ELEMENTS", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_BAD_REQUEST", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_EXPIRED_DATA", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_INVALID_TIME_RANGE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_INVALID_SCOPE", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_RENEW_NEEDED", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SOAP_FAULT_UNABLE_TO_RENEW", "Ljavax/xml/namespace/QName;", null, null);
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
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("InvalidRequest");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_INVALID_REQUEST", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("FailedAuthentication");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_FAILED_AUTHENTICATION", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("RequestFailed");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_REQUEST_FAILED", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("InvalidSecurityToken");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_INVALID_SECURITY_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("AuthenticationBadElements");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_AUTHENTICATION_BAD_ELEMENTS", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("BadRequest");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_BAD_REQUEST", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("ExpiredData");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_EXPIRED_DATA", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("InvalidTimeRange");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_INVALID_TIME_RANGE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("InvalidScope");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_INVALID_SCOPE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("RenewNeeded");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_RENEW_NEEDED", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512");
methodVisitor.visitLdcInsn("UnableToRenew");
methodVisitor.visitLdcInsn("wst");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/soap/wstrust/WSTrustConstants", "SOAP_FAULT_UNABLE_TO_RENEW", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
