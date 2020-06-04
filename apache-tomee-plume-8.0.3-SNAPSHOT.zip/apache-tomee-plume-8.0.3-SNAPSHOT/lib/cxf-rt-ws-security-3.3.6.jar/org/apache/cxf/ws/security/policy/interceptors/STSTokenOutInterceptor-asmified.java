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
public class STSTokenOutInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "Lorg/apache/cxf/phase/AbstractPhaseInterceptor<Lorg/apache/cxf/message/Message;>;", "org/apache/cxf/phase/AbstractPhaseInterceptor", null);

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor$AuthParams", "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "AuthParams", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor$AuthMode", "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "AuthMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams", "org/apache/cxf/ws/security/trust/STSTokenRetriever", "TokenRequestParams", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "KEY_TYPE_X509", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/PublicKey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WS_TRUST_NS", "Ljava/lang/String;", null, "http://docs.oasis-open.org/ws-sx/ws-trust/200512/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "X509_ENDPOINT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRANSPORT_ENDPOINT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "UT_ENDPOINT", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stsClient", "Lorg/apache/cxf/ws/security/trust/STSClient;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tokenParams", "Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tokenCacher", "Lorg/apache/cxf/ws/security/trust/STSTokenCacher;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/ws/security/trust/STSAuthParams;Ljava/lang/String;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("prepare-send");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "<init>", "(Ljava/lang/String;Lorg/apache/cxf/ws/security/trust/STSAuthParams;Ljava/lang/String;Lorg/apache/cxf/Bus;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/cxf/ws/security/trust/STSAuthParams;Ljava/lang/String;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/phase/AbstractPhaseInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/trust/DefaultSTSTokenCacher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/trust/DefaultSTSTokenCacher", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenCacher", "Lorg/apache/cxf/ws/security/trust/STSTokenCacher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/trust/STSUtils", "createSTSClient", "(Lorg/apache/cxf/ws/security/trust/STSAuthParams;Ljava/lang/String;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/ws/security/trust/STSClient;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "stsClient", "Lorg/apache/cxf/ws/security/trust/STSClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenParams", "Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/ws/security/trust/STSClient;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("prepare-send");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "<init>", "(Ljava/lang/String;Lorg/apache/cxf/ws/security/trust/STSClient;Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/ws/security/trust/STSClient;Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("prepare-send");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "<init>", "(Ljava/lang/String;Lorg/apache/cxf/ws/security/trust/STSClient;Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/cxf/ws/security/trust/STSClient;Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/phase/AbstractPhaseInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/trust/DefaultSTSTokenCacher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/trust/DefaultSTSTokenCacher", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenCacher", "Lorg/apache/cxf/ws/security/trust/STSTokenCacher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "stsClient", "Lorg/apache/cxf/ws/security/trust/STSClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenParams", "Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "stsClient", "Lorg/apache/cxf/ws/security/trust/STSClient;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("security.sts.client");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "stsClient", "Lorg/apache/cxf/ws/security/trust/STSClient;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenParams", "Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenCacher", "Lorg/apache/cxf/ws/security/trust/STSTokenCacher;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/trust/STSTokenRetriever", "getToken", "(Lorg/apache/cxf/message/Message;Lorg/apache/cxf/ws/security/trust/STSTokenRetriever$TokenRequestParams;Lorg/apache/cxf/ws/security/trust/STSTokenCacher;)Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Security token was not retrieved from STS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "warning", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/ws/security/tokenstore/SecurityToken"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "processToken", "(Lorg/apache/cxf/message/Message;Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processToken", "(Lorg/apache/cxf/message/Message;Lorg/apache/cxf/ws/security/tokenstore/SecurityToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSTSClient", "()Lorg/apache/cxf/ws/security/trust/STSClient;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "stsClient", "Lorg/apache/cxf/ws/security/trust/STSClient;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenCacher", "()Lorg/apache/cxf/ws/security/trust/STSTokenCacher;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenCacher", "Lorg/apache/cxf/ws/security/trust/STSTokenCacher;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTokenCacher", "(Lorg/apache/cxf/ws/security/trust/STSTokenCacher;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "tokenCacher", "Lorg/apache/cxf/ws/security/trust/STSTokenCacher;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "X509_ENDPOINT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "TRANSPORT_ENDPOINT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "UT_ENDPOINT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512/");
methodVisitor.visitLdcInsn("X509_Port");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "X509_ENDPOINT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512/");
methodVisitor.visitLdcInsn("Transport_Port");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "TRANSPORT_ENDPOINT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://docs.oasis-open.org/ws-sx/ws-trust/200512/");
methodVisitor.visitLdcInsn("UT_Port");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/policy/interceptors/STSTokenOutInterceptor", "UT_ENDPOINT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
