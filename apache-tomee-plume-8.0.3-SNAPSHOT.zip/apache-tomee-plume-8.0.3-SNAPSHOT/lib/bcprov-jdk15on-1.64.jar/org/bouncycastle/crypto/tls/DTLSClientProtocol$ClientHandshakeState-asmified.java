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
public class DTLSClientProtocol$ClientHandshakeStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "org/bouncycastle/crypto/tls/DTLSClientProtocol", "ClientHandshakeState", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/tls/SessionParameters$Builder", "org/bouncycastle/crypto/tls/SessionParameters", "Builder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "client", "Lorg/bouncycastle/crypto/tls/TlsClient;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "clientContext", "Lorg/bouncycastle/crypto/tls/TlsClientContextImpl;", null, null);
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
fieldVisitor = classWriter.visitField(0, "clientExtensions", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "serverExtensions", "Ljava/util/Hashtable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "selectedSessionID", "[B", null, null);
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
fieldVisitor = classWriter.visitField(0, "authentication", "Lorg/bouncycastle/crypto/tls/TlsAuthentication;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "certificateStatus", "Lorg/bouncycastle/crypto/tls/CertificateStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "certificateRequest", "Lorg/bouncycastle/crypto/tls/CertificateRequest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "clientCredentials", "Lorg/bouncycastle/crypto/tls/TlsCredentials;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "client", "Lorg/bouncycastle/crypto/tls/TlsClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "clientContext", "Lorg/bouncycastle/crypto/tls/TlsClientContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "tlsSession", "Lorg/bouncycastle/crypto/tls/TlsSession;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "sessionParameters", "Lorg/bouncycastle/crypto/tls/SessionParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "sessionParametersBuilder", "Lorg/bouncycastle/crypto/tls/SessionParameters$Builder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "offeredCipherSuites", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "clientExtensions", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "serverExtensions", "Ljava/util/Hashtable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "selectedSessionID", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "resumedSession", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "secure_renegotiation", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "allowCertificateStatus", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "expectSessionTicket", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "keyExchange", "Lorg/bouncycastle/crypto/tls/TlsKeyExchange;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "authentication", "Lorg/bouncycastle/crypto/tls/TlsAuthentication;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "certificateStatus", "Lorg/bouncycastle/crypto/tls/CertificateStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "certificateRequest", "Lorg/bouncycastle/crypto/tls/CertificateRequest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/DTLSClientProtocol$ClientHandshakeState", "clientCredentials", "Lorg/bouncycastle/crypto/tls/TlsCredentials;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
