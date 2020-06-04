package asm.net.shibboleth.utilities.java.support.security;
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
public class SelfSignedCertificateGenerator$CommandLineArgsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", null, "java/lang/Object", null);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$FileConverter", "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator", "FileConverter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator", "CommandLineArgs", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$1", "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator", null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HELP", "Ljava/lang/String;", null, "--help");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_TYPE", "Ljava/lang/String;", null, "--type");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_SIZE", "Ljava/lang/String;", null, "--size");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CERT_LIFETIME", "Ljava/lang/String;", null, "--lifetime");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CERT_ALG", "Ljava/lang/String;", null, "--certAlg");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HOSTNAME", "Ljava/lang/String;", null, "--hostname");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DNS_ALTNAMES", "Ljava/lang/String;", null, "--dnsAltName");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "URI_ALTNAMES", "Ljava/lang/String;", null, "--uriAltName");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KEY_FILE", "Ljava/lang/String;", null, "--keyfile");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CERT_FILE", "Ljava/lang/String;", null, "--certfile");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STORE_TYPE", "Ljava/lang/String;", null, "--storetype");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STORE_FILE", "Ljava/lang/String;", null, "--storefile");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STORE_PASS", "Ljava/lang/String;", null, "--storepass");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "help", "Z", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--help");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Display program usage");
annotationVisitor0.visit("help", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyType", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--type");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Type of key to generate (default: RSA)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keySize", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--size");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Size of key to generate (default: 2048)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/Positive;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateLifetime", "I", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--lifetime");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Certificate lifetime in years (default: 20)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/Positive;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certAlg", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--certAlg");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Certificate algorithm (default: SHA256withRSA)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "hostname", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--hostname");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visit("description", "Hostname for certificate subject");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dnsSubjectAltNames", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/String;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--dnsAltName");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "DNS subjectAltNames for certificate");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "uriSubjectAltNames", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/String;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--uriAltName");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "URI subjectAltNames for certificate");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "privateKeyFile", "Ljava/io/File;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--keyfile");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("converter", Type.getType("Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$FileConverter;"));
annotationVisitor0.visit("description", "Path to private key file");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateFile", "Ljava/io/File;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--certfile");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("converter", Type.getType("Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$FileConverter;"));
annotationVisitor0.visit("description", "Path to certificate file");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keystoreType", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--storetype");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Type of keystore to generate (default: PKCS12)");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keystoreFile", "Ljava/io/File;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--storefile");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("converter", Type.getType("Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$FileConverter;"));
annotationVisitor0.visit("description", "Path to keystore");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keystorePassword", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lcom/beust/jcommander/Parameter;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("names");
annotationVisitor1.visit(null, "--storepass");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visit("description", "Password for keystore");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RSA");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keyType", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 2048);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keySize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certificateLifetime", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SHA256withRSA");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certAlg", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PKCS12");
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keyType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keySize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$302", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certificateLifetime", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$402", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certAlg", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$502", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "hostname", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$602", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/io/File;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "privateKeyFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$702", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/io/File;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certificateFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$802", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$902", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/io/File;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keystoreFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1002", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keystorePassword", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1102", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/util/List;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "dnsSubjectAltNames", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1202", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;Ljava/util/List;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "uriSubjectAltNames", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "privateKeyFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certificateFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/io/File;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keystoreFile", "Ljava/io/File;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "hostname", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keystorePassword", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keySize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "keyType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certificateLifetime", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "certAlg", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "dnsSubjectAltNames", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "uriSubjectAltNames", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1300", "(Lnet/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "net/shibboleth/utilities/java/support/security/SelfSignedCertificateGenerator$CommandLineArgs", "help", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
