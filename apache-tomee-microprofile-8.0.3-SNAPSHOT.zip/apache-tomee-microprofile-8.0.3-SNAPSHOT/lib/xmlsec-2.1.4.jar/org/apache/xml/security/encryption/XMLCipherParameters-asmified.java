package asm.org.apache.xml.security.encryption;
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
public class XMLCipherParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/xml/security/encryption/XMLCipherParameters", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES_128", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes128-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES_256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes256-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES_192", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#aes192-cbc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSA_1_5", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RSA_OAEP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIFFIE_HELLMAN", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#dh");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TRIPLEDES_KEYWRAP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-tripledes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES_128_KEYWRAP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes128");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES_256_KEYWRAP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AES_192_KEYWRAP", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#kw-aes192");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHA1", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#sha1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHA256", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#sha256");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHA512", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#sha512");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RIPEMD_160", "Ljava/lang/String;", null, "http://www.w3.org/2001/04/xmlenc#ripemd160");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XML_DSIG", "Ljava/lang/String;", null, "http://www.w3.org/2000/09/xmldsig#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "N14C_XML", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "N14C_XML_CMMNTS", "Ljava/lang/String;", null, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCL_XML_N14C", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCL_XML_N14C_CMMNTS", "Ljava/lang/String;", null, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
