package asm.org.apache.catalina.valves;
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
public class SSLValveDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/valves/SSLValve", null, "org/apache/catalina/valves/ValveBase", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sslClientCertHeader", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sslCipherHeader", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sslSessionIdHeader", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sslCipherUserKeySizeHeader", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/ValveBase", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ssl_client_cert");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslClientCertHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ssl_cipher");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ssl_session_id");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslSessionIdHeader", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ssl_cipher_usekeysize");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherUserKeySizeHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSslClientCertHeader", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslClientCertHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSslClientCertHeader", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslClientCertHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSslCipherHeader", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSslCipherHeader", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSslSessionIdHeader", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslSessionIdHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSslSessionIdHeader", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslSessionIdHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSslCipherUserKeySizeHeader", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherUserKeySizeHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSslCipherUserKeySizeHeader", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherUserKeySizeHeader", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mygetHeader", "(Lorg/apache/catalina/connector/Request;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitLdcInsn("(null)");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;)V", null, new String[] { "java/io/IOException", "jakarta/servlet/ServletException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/cert/CertificateException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/NoSuchProviderException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslClientCertHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/SSLValve", "mygetHeader", "(Lorg/apache/catalina/connector/Request;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitJumpInsn(IF_ICMPLE, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn("-----BEGIN CERTIFICATE-----\n");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "ISO_8859_1", "Ljava/nio/charset/Charset;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "getConnector", "()Lorg/apache/catalina/connector/Connector;", false);
methodVisitor.visitLdcInsn("clientCertProvider");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLdcInsn("X.509");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/cert/CertificateFactory", "getInstance", "(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/catalina/valves/SSLValve", "org/apache/catalina/connector/Request", "org/apache/catalina/connector/Response", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/io/ByteArrayInputStream", "[Ljava/security/cert/X509Certificate;", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitLdcInsn("X.509");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/cert/CertificateFactory", "getInstance", "(Ljava/lang/String;Ljava/lang/String;)Ljava/security/cert/CertificateFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/cert/CertificateFactory"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/CertificateFactory", "generateCertificate", "(Ljava/io/InputStream;)Ljava/security/cert/Certificate;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/catalina/valves/SSLValve", "org/apache/catalina/connector/Request", "org/apache/catalina/connector/Response", "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/String", "java/io/ByteArrayInputStream", "[Ljava/security/cert/X509Certificate;", "java/lang/String"}, 1, new Object[] {"java/security/cert/CertificateException"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/SSLValve", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/SSLValve", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("sslValve.certError");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "warn", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/NoSuchProviderException"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/SSLValve", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/SSLValve", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("sslValve.invalidProvider");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.servlet.request.X509Certificate");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/catalina/valves/SSLValve", "org/apache/catalina/connector/Request", "org/apache/catalina/connector/Response", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/SSLValve", "mygetHeader", "(Lorg/apache/catalina/connector/Request;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.servlet.request.cipher_suite");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslSessionIdHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/SSLValve", "mygetHeader", "(Lorg/apache/catalina/connector/Request;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.servlet.request.ssl_session_id");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/SSLValve", "sslCipherUserKeySizeHeader", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/SSLValve", "mygetHeader", "(Lorg/apache/catalina/connector/Request;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.servlet.request.key_size");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(Ljava/lang/String;)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/SSLValve", "getNext", "()Lorg/apache/catalina/Valve;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Valve", "invoke", "(Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/valves/SSLValve;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/SSLValve", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
