package asm.org.apache.xml.security.stax.securityToken;
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
public class SecurityTokenConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TokenUsage_Signature", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TokenUsage_Encryption", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyUsage_Signature_Verification", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyUsage_Decryption", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_KeyValue", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_KeyName", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_IssuerSerial", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_SkiKeyIdentifier", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_X509KeyIdentifier", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_X509SubjectName", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_NoKeyInfo", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyIdentifier_EncryptedKey", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EncryptedKeyToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X509V3Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X509V1Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X509Pkcs7Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X509PkiPathV1Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyValueToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KeyNameToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DefaultToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DerivedKeyToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
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
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Signature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage_Signature", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Encryption");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage_Encryption", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Signature_Verification");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyUsage_Signature_Verification", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Decryption");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyUsage_Decryption", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyValue");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_KeyValue", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyName");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_KeyName", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IssuerSerial");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_IssuerSerial", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SkiKeyIdentifier");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_SkiKeyIdentifier", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X509KeyIdentifier");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_X509KeyIdentifier", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X509SubjectName");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_X509SubjectName", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NoKeyInfo");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_NoKeyInfo", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptedKey");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier_EncryptedKey", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptedKeyToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "EncryptedKeyToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X509V3Token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "X509V3Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X509V1Token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "X509V1Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X509Pkcs7Token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "X509Pkcs7Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("X509PkiPathV1Token");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "X509PkiPathV1Token", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyValueToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyValueToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyNameToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyNameToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DefaultToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "DefaultToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DerivedKeyToken");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "DerivedKeyToken", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
