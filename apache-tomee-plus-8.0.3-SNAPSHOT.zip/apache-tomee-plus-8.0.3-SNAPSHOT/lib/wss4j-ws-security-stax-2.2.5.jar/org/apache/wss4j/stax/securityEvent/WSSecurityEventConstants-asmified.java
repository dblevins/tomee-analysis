package asm.org.apache.wss4j.stax.securityEvent;
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
public class WSSecurityEventConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", null, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "Event", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SECURITY", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPERATION", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNED_PART", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTED_PART", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRED_ELEMENT", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRED_PART", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISSUED_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_CONTEXT_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REL_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTPS_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DERIVED_KEY_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_CONFIRMATION", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NoSecurity");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "NO_SECURITY", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Operation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "OPERATION", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Timestamp");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "TIMESTAMP", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignedPart");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "SIGNED_PART", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptedPart");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "ENCRYPTED_PART", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RequiredElement");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "REQUIRED_ELEMENT", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RequiredPart");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "REQUIRED_PART", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IssuedToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "ISSUED_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KerberosToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "KERBEROS_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SamlToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "SAML_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SecurityContextToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "SECURITY_CONTEXT_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RelToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "REL_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UsernameToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "USERNAME_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HttpsToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "HTTPS_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DerivedKeyToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "DERIVED_KEY_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SignatureConfirmation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "SIGNATURE_CONFIRMATION", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
