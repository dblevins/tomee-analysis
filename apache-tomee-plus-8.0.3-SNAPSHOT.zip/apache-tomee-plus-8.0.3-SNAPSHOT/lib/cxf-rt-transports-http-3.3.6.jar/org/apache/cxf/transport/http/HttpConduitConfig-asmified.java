package asm.org.apache.cxf.transport.http;
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
public class HttpConduitConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/http/HttpConduitConfig", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tlsClientParameters", "Lorg/apache/cxf/configuration/jsse/TLSClientParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "clientPolicy", "Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "authSupplier", "Lorg/apache/cxf/transport/http/auth/HttpAuthSupplier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "proxyAuthorizationPolicy", "Lorg/apache/cxf/configuration/security/ProxyAuthorizationPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "authorizationPolicy", "Lorg/apache/cxf/configuration/security/AuthorizationPolicy;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTlsClientParameters", "(Lorg/apache/cxf/configuration/jsse/TLSClientParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "tlsClientParameters", "Lorg/apache/cxf/configuration/jsse/TLSClientParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientPolicy", "()Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "clientPolicy", "Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClientPolicy", "(Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "clientPolicy", "Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAuthSupplier", "(Lorg/apache/cxf/transport/http/auth/HttpAuthSupplier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "authSupplier", "Lorg/apache/cxf/transport/http/auth/HttpAuthSupplier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProxyAuthorizationPolicy", "(Lorg/apache/cxf/configuration/security/ProxyAuthorizationPolicy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "proxyAuthorizationPolicy", "Lorg/apache/cxf/configuration/security/ProxyAuthorizationPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAuthorizationPolicy", "(Lorg/apache/cxf/configuration/security/AuthorizationPolicy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "authorizationPolicy", "Lorg/apache/cxf/configuration/security/AuthorizationPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/apache/cxf/transport/http/HTTPConduit;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "tlsClientParameters", "Lorg/apache/cxf/configuration/jsse/TLSClientParameters;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "tlsClientParameters", "Lorg/apache/cxf/configuration/jsse/TLSClientParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/HTTPConduit", "setTlsClientParameters", "(Lorg/apache/cxf/configuration/jsse/TLSClientParameters;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "clientPolicy", "Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "clientPolicy", "Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/HTTPConduit", "setClient", "(Lorg/apache/cxf/transports/http/configuration/HTTPClientPolicy;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "authSupplier", "Lorg/apache/cxf/transport/http/auth/HttpAuthSupplier;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "authSupplier", "Lorg/apache/cxf/transport/http/auth/HttpAuthSupplier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/HTTPConduit", "setAuthSupplier", "(Lorg/apache/cxf/transport/http/auth/HttpAuthSupplier;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "proxyAuthorizationPolicy", "Lorg/apache/cxf/configuration/security/ProxyAuthorizationPolicy;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "proxyAuthorizationPolicy", "Lorg/apache/cxf/configuration/security/ProxyAuthorizationPolicy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/HTTPConduit", "setProxyAuthorization", "(Lorg/apache/cxf/configuration/security/ProxyAuthorizationPolicy;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "authorizationPolicy", "Lorg/apache/cxf/configuration/security/AuthorizationPolicy;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/HttpConduitConfig", "authorizationPolicy", "Lorg/apache/cxf/configuration/security/AuthorizationPolicy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/HTTPConduit", "setAuthorization", "(Lorg/apache/cxf/configuration/security/AuthorizationPolicy;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
