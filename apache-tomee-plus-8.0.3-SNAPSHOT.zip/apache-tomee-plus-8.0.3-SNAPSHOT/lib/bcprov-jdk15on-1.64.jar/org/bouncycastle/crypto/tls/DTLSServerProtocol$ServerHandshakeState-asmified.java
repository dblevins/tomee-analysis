package asm.org.bouncycastle.crypto.tls;
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
public class DTLSServerProtocol$ServerHandshakeStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "org/bouncycastle/crypto/tls/DTLSServerProtocol", "ServerHandshakeState", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/tls/SessionParameters$Builder", "org/bouncycastle/crypto/tls/SessionParameters", "Builder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "server", "Lorg/bouncycastle/crypto/tls/TlsServer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "serverContext", "Lorg/bouncycastle/crypto/tls/TlsServerContextImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "tlsSession", "Lorg/bouncycastle/crypto/tls/TlsSession;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sessionParameters", "Lorg/bouncycastle/crypto/tls/SessionParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "sessionParametersBuilder", "Lorg/bouncycastle/crypto/tls/SessionParameters$Builder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "offeredCipherSuites", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "offeredCompressionMethods", "[S", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "clientExtensions", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "serverExtensions", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "resumedSession", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "secure_renegotiation", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "allowCertificateStatus", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "expectSessionTicket", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "keyExchange", "Lorg/bouncycastle/crypto/tls/TlsKeyExchange;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "serverCredentials", "Lorg/bouncycastle/crypto/tls/TlsCredentials;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "certificateRequest", "Lorg/bouncycastle/crypto/tls/CertificateRequest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "clientCertificateType", "S", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "clientCertificate", "Lorg/bouncycastle/crypto/tls/Certificate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "server", "Lorg/bouncycastle/crypto/tls/TlsServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "serverContext", "Lorg/bouncycastle/crypto/tls/TlsServerContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "tlsSession", "Lorg/bouncycastle/crypto/tls/TlsSession;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "sessionParameters", "Lorg/bouncycastle/crypto/tls/SessionParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "sessionParametersBuilder", "Lorg/bouncycastle/crypto/tls/SessionParameters$Builder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "offeredCipherSuites", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "offeredCompressionMethods", "[S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "clientExtensions", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "serverExtensions", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "resumedSession", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "secure_renegotiation", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "allowCertificateStatus", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "expectSessionTicket", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "keyExchange", "Lorg/bouncycastle/crypto/tls/TlsKeyExchange;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "serverCredentials", "Lorg/bouncycastle/crypto/tls/TlsCredentials;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "certificateRequest", "Lorg/bouncycastle/crypto/tls/CertificateRequest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "clientCertificateType", "S");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSServerProtocol$ServerHandshakeState", "clientCertificate", "Lorg/bouncycastle/crypto/tls/Certificate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
