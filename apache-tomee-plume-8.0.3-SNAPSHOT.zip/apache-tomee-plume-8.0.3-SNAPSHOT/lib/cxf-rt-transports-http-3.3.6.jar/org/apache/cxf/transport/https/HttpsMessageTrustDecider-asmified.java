package asm.org.apache.cxf.transport.https;
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
public class HttpsMessageTrustDeciderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/cxf/transport/https/HttpsMessageTrustDecider", null, "org/apache/cxf/transport/http/MessageTrustDecider", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "certConstraints", "Lorg/apache/cxf/transport/https/CertConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/https/CertConstraints;Lorg/apache/cxf/transport/http/MessageTrustDecider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/MessageTrustDecider", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/https/HttpsMessageTrustDecider", "certConstraints", "Lorg/apache/cxf/transport/https/CertConstraints;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/https/HttpsMessageTrustDecider", "orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "establishTrust", "(Ljava/lang/String;Lorg/apache/cxf/transport/http/URLConnectionInfo;Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/transport/http/UntrustedURLConnectionIOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/https/HttpsMessageTrustDecider", "orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/https/HttpsMessageTrustDecider", "orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/MessageTrustDecider", "establishTrust", "(Ljava/lang/String;Lorg/apache/cxf/transport/http/URLConnectionInfo;Lorg/apache/cxf/message/Message;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/transport/https/HttpsURLConnectionInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/HttpsURLConnectionInfo", "getServerCertificates", "()[Ljava/security/cert/Certificate;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/HttpsURLConnectionInfo", "getServerCertificates", "()[Ljava/security/cert/Certificate;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/transport/https/HttpsURLConnectionInfo"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/UntrustedURLConnectionIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No server certificates were found");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/UntrustedURLConnectionIOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/HttpsURLConnectionInfo", "getServerCertificates", "()[Ljava/security/cert/Certificate;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/https/HttpsMessageTrustDecider", "certConstraints", "Lorg/apache/cxf/transport/https/CertConstraints;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/CertConstraints", "matches", "(Ljava/security/cert/X509Certificate;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/UntrustedURLConnectionIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("The server certificate(s) do not match the defined cert constraints");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/UntrustedURLConnectionIOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/security/cert/X509Certificate;"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
