package asm.org.apache.wss4j.common.saml.builder;
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
public class SAML1ConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/wss4j/common/saml/builder/SAML1Constants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_UNSPECIFIED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_EMAIL_ADDRESS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_X509_SUBJECT_NAME", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMEID_FORMAT_WINDOWS_DQN", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONF_BEARER", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:cm:bearer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONF_HOLDER_KEY", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:cm:holder-of-key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONF_SENDER_VOUCHES", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:cm:sender-vouches");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_PASSWORD", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:am:password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_KERBEROS", "Ljava/lang/String;", null, "urn:ietf:rfc:1510");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_SRP", "Ljava/lang/String;", null, "urn:ietf:rfc:2945");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_HARDWARE_TOKEN", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:am:HardwareToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_TLS_CLIENT", "Ljava/lang/String;", null, "urn:ietf:rfc:2246");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_X509", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:am:X509-PKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_PGP", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:am:PGP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_SPKI", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:am:SPKI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_XKMS", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:am:XKMS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_DSIG", "Ljava/lang/String;", null, "urn:ietf:rfc:3075");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTH_METHOD_UNSPECIFIED", "Ljava/lang/String;", null, "urn:oasis:names:tc:SAML:1.0:am:unspecified");
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
