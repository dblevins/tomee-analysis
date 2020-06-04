package asm.net.shibboleth.utilities.java.support.httpclient;
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
public class HttpClientSupportDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "net/shibboleth/utilities/java/support/httpclient/HttpClientSupport", null, "java/lang/Object", null);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/httpclient/HttpClientSupport$1", null, null, ACC_STATIC);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildStrictTLSSocketFactory", "()Lorg/apache/http/conn/socket/LayeredConnectionSocketFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/http/conn/ssl/StrictHostnameVerifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/conn/ssl/StrictHostnameVerifier", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder", "setHostnameVerifier", "(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)Lnet/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder", "build", "()Lnet/shibboleth/utilities/java/support/httpclient/TLSSocketFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildNoTrustTLSSocketFactory", "()Lorg/apache/http/conn/socket/LayeredConnectionSocketFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/httpclient/HttpClientSupport", "buildNoTrustX509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder", "setTrustManagers", "(Ljava/util/List;)Lnet/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/http/conn/ssl/AllowAllHostnameVerifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/conn/ssl/AllowAllHostnameVerifier", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder", "setHostnameVerifier", "(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)Lnet/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/httpclient/TLSSocketFactoryBuilder", "build", "()Lnet/shibboleth/utilities/java/support/httpclient/TLSSocketFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "buildStrictSSLConnectionSocketFactory", "()Lorg/apache/http/conn/ssl/SSLConnectionSocketFactory;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/http/conn/ssl/SSLConnectionSocketFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/http/conn/ssl/SSLContexts", "createDefault", "()Ljavax/net/ssl/SSLContext;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/http/conn/ssl/SSLConnectionSocketFactory", "STRICT_HOSTNAME_VERIFIER", "Lorg/apache/http/conn/ssl/X509HostnameVerifier;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/conn/ssl/SSLConnectionSocketFactory", "<init>", "(Ljavax/net/ssl/SSLContext;Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_DEPRECATED, "buildNoTrustSSLConnectionSocketFactory", "()Lorg/apache/http/conn/ssl/SSLConnectionSocketFactory;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchAlgorithmException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/KeyManagementException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/httpclient/HttpClientSupport", "buildNoTrustX509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("TLS");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/net/ssl/SSLContext", "getInstance", "(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/net/ssl/TrustManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/net/ssl/SSLContext", "init", "([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/http/conn/ssl/SSLConnectionSocketFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/http/conn/ssl/SSLConnectionSocketFactory", "ALLOW_ALL_HOSTNAME_VERIFIER", "Lorg/apache/http/conn/ssl/X509HostnameVerifier;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/conn/ssl/SSLConnectionSocketFactory", "<init>", "(Ljavax/net/ssl/SSLContext;Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"javax/net/ssl/X509TrustManager"}, 1, new Object[] {"java/security/NoSuchAlgorithmException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TLS SSLContext type is required to be supported by the JVM but is not");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/KeyManagementException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Some how the trust everything trust manager didn't trust everything");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildNoTrustX509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/httpclient/HttpClientSupport$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/httpclient/HttpClientSupport$1", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
