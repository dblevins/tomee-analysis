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
public class TlsStreamCipherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/bouncycastle/crypto/tls/TlsStreamCipher", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/tls/TlsCipher" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "context", "Lorg/bouncycastle/crypto/tls/TlsContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "decryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "writeMac", "Lorg/bouncycastle/crypto/tls/TlsMac;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "readMac", "Lorg/bouncycastle/crypto/tls/TlsMac;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "usesNonce", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/StreamCipher;Lorg/bouncycastle/crypto/StreamCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;IZ)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/tls/TlsContext", "isServer", "()Z", true);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "context", "Lorg/bouncycastle/crypto/tls/TlsContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "usesNonce", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "decryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "calculateKeyBlock", "(Lorg/bouncycastle/crypto/tls/TlsContext;I)[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsMac");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsMac", "<init>", "(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/Digest;[BII)V", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsMac");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsMac", "<init>", "(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/Digest;[BII)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/KeyParameter", "<init>", "([BII)V", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/KeyParameter", "<init>", "([BII)V", false);
methodVisitor.visitVarInsn(ASTORE, 15);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 11);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "writeMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "readMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "decryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ASTORE, 17);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "writeMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "readMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "decryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitVarInsn(ALOAD, 15);
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 18);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 16);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitVarInsn(ALOAD, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitVarInsn(ASTORE, 17);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 16);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/StreamCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "decryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 17);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/StreamCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 19);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPlaintextLimit", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "writeMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsMac", "getSize", "()I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encodePlaintext", "(JS[BII)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "usesNonce", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsStreamCipher", "updateIV", "(Lorg/bouncycastle/crypto/StreamCipher;ZJ)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "writeMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsMac", "getSize", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/StreamCipher", "processBytes", "([BII[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "writeMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsMac", "calculateMac", "(JS[BII)[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "encryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/StreamCipher", "processBytes", "([BII[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decodeCiphertext", "(JS[BII)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "usesNonce", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "decryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsStreamCipher", "updateIV", "(Lorg/bouncycastle/crypto/StreamCipher;ZJ)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "readMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsMac", "getSize", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "decryptCipher", "Lorg/bouncycastle/crypto/StreamCipher;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/StreamCipher", "processBytes", "([BII[BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsStreamCipher", "checkMAC", "(JS[BII[BII)V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "copyOfRange", "([BII)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(10, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkMAC", "(JS[BII[BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "copyOfRange", "([BII)[B", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/TlsStreamCipher", "readMac", "Lorg/bouncycastle/crypto/tls/TlsMac;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/TlsMac", "calculateMac", "(JS[BII)[B", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "constantTimeAreEqual", "([B[B)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "updateIV", "(Lorg/bouncycastle/crypto/StreamCipher;ZJ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "writeUint64", "(J[BI)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/ParametersWithIV");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/ParametersWithIV", "<init>", "(Lorg/bouncycastle/crypto/CipherParameters;[B)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/StreamCipher", "init", "(ZLorg/bouncycastle/crypto/CipherParameters;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
