package asm.org.apache.tomcat.util.net.openssl;
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
public class OpenSSLContext$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/net/openssl/OpenSSLContext$1", null, "java/lang/Object", new String[] { "org/apache/tomcat/jni/CertificateVerifier" });

classWriter.visitOuterClass("org/apache/tomcat/util/net/openssl/OpenSSLContext", "init", "([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V");

classWriter.visitInnerClass("org/apache/tomcat/util/net/openssl/OpenSSLContext$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/net/openssl/OpenSSLContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomcat/util/net/openssl/OpenSSLContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/net/openssl/OpenSSLContext$1", "this$0", "Lorg/apache/tomcat/util/net/openssl/OpenSSLContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "(J[[BLjava/lang/String;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLContext", "access$000", "([[B)[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/net/openssl/OpenSSLContext$1", "this$0", "Lorg/apache/tomcat/util/net/openssl/OpenSSLContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLContext", "access$100", "(Lorg/apache/tomcat/util/net/openssl/OpenSSLContext;)Ljavax/net/ssl/X509TrustManager;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/net/ssl/X509TrustManager", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/tomcat/util/net/openssl/OpenSSLContext$1", Opcodes.LONG, "[[B", "java/lang/String", "[Ljava/security/cert/X509Certificate;"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLContext", "access$300", "()Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLContext", "access$200", "()Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitLdcInsn("openssl.certificateVerificationFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "debug", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
