package asm.org.apache.tomcat.util.net;
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
public class SSLHostConfigCertificateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/net/SSLHostConfigCertificate", null, "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "org/apache/tomcat/util/net/SSLHostConfigCertificate", "StoreType", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "org/apache/tomcat/util/net/SSLHostConfigCertificate", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SSLHostConfig$Type", "org/apache/tomcat/util/net/SSLHostConfig", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_TYPE", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEFAULT_KEYSTORE_PROVIDER", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "DEFAULT_KEYSTORE_TYPE", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "oname", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "sslContext", "Lorg/apache/tomcat/util/net/SSLContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateKeyPassword", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateKeyAlias", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateKeystorePassword", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateKeystoreFile", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateKeystoreProvider", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateKeystoreType", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "certificateKeystore", "Ljava/security/KeyStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "certificateKeyManager", "Ljavax/net/ssl/X509KeyManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateChainFile", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateFile", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateKeyFile", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "storeType", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "UNDEFINED", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "<init>", "(Lorg/apache/tomcat/util/net/SSLHostConfig;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/util/net/SSLHostConfig;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyPassword", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("changeit");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystorePassword", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("user.home");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("/.keystore");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreFile", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "DEFAULT_KEYSTORE_PROVIDER", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreProvider", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "DEFAULT_KEYSTORE_TYPE", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreType", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystore", "Ljava/security/KeyStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyManager", "Ljavax/net/ssl/X509KeyManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "storeType", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "type", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSslContext", "()Lorg/apache/tomcat/util/net/SSLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslContext", "Lorg/apache/tomcat/util/net/SSLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSslContext", "(Lorg/apache/tomcat/util/net/SSLContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslContext", "Lorg/apache/tomcat/util/net/SSLContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSSLHostConfig", "()Lorg/apache/tomcat/util/net/SSLHostConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObjectName", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setObjectName", "(Ljavax/management/ObjectName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "oname", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "type", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeyPassword", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyPassword", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeyPassword", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyPassword", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeyAlias", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitLdcInsn("Certificate.certificateKeyAlias");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfig$Type", "JSSE", "Lorg/apache/tomcat/util/net/SSLHostConfig$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfig", "setProperty", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfig$Type;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyAlias", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeyAlias", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyAlias", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeystoreFile", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitLdcInsn("Certificate.certificateKeystoreFile");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfig$Type", "JSSE", "Lorg/apache/tomcat/util/net/SSLHostConfig$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfig", "setProperty", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfig$Type;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Certificate.certificateKeystoreFile");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "KEYSTORE", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreFile", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeystoreFile", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreFile", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeystorePassword", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitLdcInsn("Certificate.certificateKeystorePassword");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfig$Type", "JSSE", "Lorg/apache/tomcat/util/net/SSLHostConfig$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfig", "setProperty", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfig$Type;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Certificate.certificateKeystorePassword");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "KEYSTORE", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystorePassword", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeystorePassword", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystorePassword", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeystoreProvider", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitLdcInsn("Certificate.certificateKeystoreProvider");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfig$Type", "JSSE", "Lorg/apache/tomcat/util/net/SSLHostConfig$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfig", "setProperty", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfig$Type;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Certificate.certificateKeystoreProvider");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "KEYSTORE", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreProvider", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeystoreProvider", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreProvider", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeystoreType", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitLdcInsn("Certificate.certificateKeystoreType");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfig$Type", "JSSE", "Lorg/apache/tomcat/util/net/SSLHostConfig$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfig", "setProperty", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfig$Type;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Certificate.certificateKeystoreType");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "KEYSTORE", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeystoreType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystoreType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeystore", "(Ljava/security/KeyStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystore", "Ljava/security/KeyStore;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeystore", "()Ljava/security/KeyStore;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeystore", "Ljava/security/KeyStore;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "storeType", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "KEYSTORE", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "getCertificateKeystoreType", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "getCertificateKeystoreProvider", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "getCertificateKeystoreFile", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "getCertificateKeystorePassword", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/SSLUtilBase", "getStore", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyStore;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/KeyStore"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeyManager", "(Ljavax/net/ssl/X509KeyManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyManager", "Ljavax/net/ssl/X509KeyManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeyManager", "()Ljavax/net/ssl/X509KeyManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyManager", "Ljavax/net/ssl/X509KeyManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateChainFile", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Certificate.certificateChainFile");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "PEM", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateChainFile", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateChainFile", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateChainFile", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateFile", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Certificate.certificateFile");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "PEM", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateFile", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateFile", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateFile", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCertificateKeyFile", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Certificate.certificateKeyFile");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType", "PEM", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyFile", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateKeyFile", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "certificateKeyFile", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setStoreType", "(Ljava/lang/String;Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "storeType", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "storeType", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "storeType", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("sslHostConfigCertificate.mismatch");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sslHostConfig", "Lorg/apache/tomcat/util/net/SSLHostConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/SSLHostConfig", "getHostName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "storeType", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$StoreType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/SSLHostConfigCertificate;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/SSLHostConfigCertificate;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate$Type", "UNDEFINED", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "DEFAULT_TYPE", "Lorg/apache/tomcat/util/net/SSLHostConfigCertificate$Type;");
methodVisitor.visitLdcInsn("javax.net.ssl.keyStoreProvider");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "DEFAULT_KEYSTORE_PROVIDER", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("javax.net.ssl.keyStoreType");
methodVisitor.visitLdcInsn("JKS");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/SSLHostConfigCertificate", "DEFAULT_KEYSTORE_TYPE", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
