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
public class TlsDHKeyExchangeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", null, "org/bouncycastle/crypto/tls/AbstractTlsKeyExchange", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dhVerifier", "Lorg/bouncycastle/crypto/tls/TlsDHVerifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "serverPublicKey", "Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "agreementCredentials", "Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dhAgreePrivateKey", "Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "<init>", "(ILjava/util/Vector;Lorg/bouncycastle/crypto/params/DHParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/DefaultTlsDHVerifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/DefaultTlsDHVerifier", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "<init>", "(ILjava/util/Vector;Lorg/bouncycastle/crypto/tls/TlsDHVerifier;Lorg/bouncycastle/crypto/params/DHParameters;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ILjava/util/Vector;Lorg/bouncycastle/crypto/tls/TlsDHVerifier;Lorg/bouncycastle/crypto/params/DHParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/AbstractTlsKeyExchange", "<init>", "(ILjava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(3, 11, label1, new Label[] { label0, label1, label2, label1, label3, label1, label3, label1, label3 });
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsRSASigner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsRSASigner", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;");
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsDSSSigner");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsDSSSigner", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;");
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unsupported key exchange algorithm");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhVerifier", "Lorg/bouncycastle/crypto/tls/TlsDHVerifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Lorg/bouncycastle/crypto/tls/TlsContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/AbstractTlsKeyExchange", "init", "(Lorg/bouncycastle/crypto/tls/TlsContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/tls/TlsSigner", "init", "(Lorg/bouncycastle/crypto/tls/TlsContext;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skipServerCredentials", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "keyExchange", "I");
methodVisitor.visitIntInsn(BIPUSH, 11);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processServerCertificate", "(Lorg/bouncycastle/crypto/tls/Certificate;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/RuntimeException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/ClassCastException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "keyExchange", "I");
methodVisitor.visitIntInsn(BIPUSH, 11);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label6);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/Certificate", "isEmpty", "()Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/Certificate", "getCertificateAt", "(I)Lorg/bouncycastle/asn1/x509/Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/Certificate", "getSubjectPublicKeyInfo", "()Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/PublicKeyFactory", "createKey", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "serverPublicKey", "Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;");
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(SLjava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "serverPublicKey", "Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/params/DHPublicKeyParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/params/DHPublicKeyParameters", "getParameters", "()Lorg/bouncycastle/crypto/params/DHParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;");
methodVisitor.visitLabel(label4);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(SLjava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "validateKeyUsage", "(Lorg/bouncycastle/asn1/x509/Certificate;I)V", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "tlsSigner", "Lorg/bouncycastle/crypto/tls/TlsSigner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "serverPublicKey", "Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/tls/TlsSigner", "isValidPublicKey", "(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)Z", true);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNE, label12);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "validateKeyUsage", "(Lorg/bouncycastle/asn1/x509/Certificate;I)V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/AbstractTlsKeyExchange", "processServerCertificate", "(Lorg/bouncycastle/crypto/tls/Certificate;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requiresServerKeyExchange", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "keyExchange", "I");
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitLookupSwitchInsn(label1, new int[] { 3, 5, 11 }, new Label[] { label0, label0, label0 });
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateServerKeyExchange", "()[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "requiresServerKeyExchange", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "context", "Lorg/bouncycastle/crypto/tls/TlsContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/tls/TlsContext", "getSecureRandom", "()Ljava/security/SecureRandom;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsDHUtils", "generateEphemeralServerKeyExchange", "(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/DHParameters;Ljava/io/OutputStream;)Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePrivateKey", "Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processServerKeyExchange", "(Ljava/io/InputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "requiresServerKeyExchange", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhVerifier", "Lorg/bouncycastle/crypto/tls/TlsDHVerifier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsDHUtils", "receiveDHParameters", "(Lorg/bouncycastle/crypto/tls/TlsDHVerifier;Ljava/io/InputStream;)Lorg/bouncycastle/crypto/params/DHParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/DHPublicKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsDHUtils", "readDHParameter", "(Ljava/io/InputStream;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/DHPublicKeyParameters", "<init>", "(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DHParameters;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validateCertificateRequest", "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "keyExchange", "I");
methodVisitor.visitIntInsn(BIPUSH, 11);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/CertificateRequest", "getCertificateTypes", "()[S", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(SALOAD);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitLookupSwitchInsn(label4, new int[] { 1, 2, 3, 4, 64 }, new Label[] { label3, label3, label3, label3, label3 });
methodVisitor.visitLabel(label3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processClientCredentials", "(Lorg/bouncycastle/crypto/tls/TlsCredentials;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "keyExchange", "I");
methodVisitor.visitIntInsn(BIPUSH, 11);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/tls/TlsAgreementCredentials");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/tls/TlsAgreementCredentials");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "agreementCredentials", "Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/tls/TlsSignerCredentials");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateClientKeyExchange", "(Ljava/io/OutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "agreementCredentials", "Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "context", "Lorg/bouncycastle/crypto/tls/TlsContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/tls/TlsContext", "getSecureRandom", "()Ljava/security/SecureRandom;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsDHUtils", "generateEphemeralClientKeyExchange", "(Ljava/security/SecureRandom;Lorg/bouncycastle/crypto/params/DHParameters;Ljava/io/OutputStream;)Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePrivateKey", "Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processClientCertificate", "(Lorg/bouncycastle/crypto/tls/Certificate;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "keyExchange", "I");
methodVisitor.visitIntInsn(BIPUSH, 11);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processClientKeyExchange", "(Ljava/io/InputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/DHPublicKeyParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsDHUtils", "readDHParameter", "(Ljava/io/InputStream;)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhParameters", "Lorg/bouncycastle/crypto/params/DHParameters;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/DHPublicKeyParameters", "<init>", "(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/DHParameters;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generatePremasterSecret", "()[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "agreementCredentials", "Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "agreementCredentials", "Lorg/bouncycastle/crypto/tls/TlsAgreementCredentials;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/tls/TlsAgreementCredentials", "generateAgreement", "(Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePrivateKey", "Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePublicKey", "Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsDHKeyExchange", "dhAgreePrivateKey", "Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsDHUtils", "calculateDHBasicAgreement", "(Lorg/bouncycastle/crypto/params/DHPublicKeyParameters;Lorg/bouncycastle/crypto/params/DHPrivateKeyParameters;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}