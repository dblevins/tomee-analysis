package asm.org.apache.cxf.ws.security.policy.interceptors;
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
public class HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor$1", null, "org/apache/cxf/transport/http/MessageTrustDecider", null);

classWriter.visitOuterClass("org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor", "assertHttps", "(Lorg/apache/cxf/ws/policy/AssertionInfoMap;Ljava/util/Collection;Lorg/apache/cxf/message/Message;)V");

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor", "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider", "HttpsTokenOutInterceptor", ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor;Lorg/apache/cxf/transport/http/MessageTrustDecider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor$1", "this$0", "Lorg/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor$1", "val$orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/MessageTrustDecider", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "establishTrust", "(Ljava/lang/String;Lorg/apache/cxf/transport/http/URLConnectionInfo;Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/transport/http/UntrustedURLConnectionIOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor$1", "val$orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenOutInterceptor$1", "val$orig", "Lorg/apache/cxf/transport/http/MessageTrustDecider;");
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/HttpsURLConnectionInfo", "getLocalCertificates", "()[Ljava/security/cert/Certificate;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/HttpsURLConnectionInfo", "getLocalCertificates", "()[Ljava/security/cert/Certificate;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/transport/https/HttpsURLConnectionInfo"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/UntrustedURLConnectionIOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RequireClientCertificate is set, but no local certificates were negotiated.  Is the server set to ask for client authorization?");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/UntrustedURLConnectionIOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
