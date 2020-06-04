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
public class TlsExtensionsUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_encrypt_then_mac", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_extended_master_secret", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_heartbeat", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_max_fragment_length", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_padding", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_server_name", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_status_request", "Ljava/lang/Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXT_truncated_hmac", "Ljava/lang/Integer;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "ensureExtensionsInitialised", "(Ljava/util/Hashtable;)Ljava/util/Hashtable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addEncryptThenMACExtension", "(Ljava/util/Hashtable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_encrypt_then_mac", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createEncryptThenMACExtension", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addExtendedMasterSecretExtension", "(Ljava/util/Hashtable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_extended_master_secret", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createExtendedMasterSecretExtension", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addHeartbeatExtension", "(Ljava/util/Hashtable;Lorg/bouncycastle/crypto/tls/HeartbeatExtension;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_heartbeat", "Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createHeartbeatExtension", "(Lorg/bouncycastle/crypto/tls/HeartbeatExtension;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addMaxFragmentLengthExtension", "(Ljava/util/Hashtable;S)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_max_fragment_length", "Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createMaxFragmentLengthExtension", "(S)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addPaddingExtension", "(Ljava/util/Hashtable;I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_padding", "Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createPaddingExtension", "(I)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addServerNameExtension", "(Ljava/util/Hashtable;Lorg/bouncycastle/crypto/tls/ServerNameList;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_server_name", "Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createServerNameExtension", "(Lorg/bouncycastle/crypto/tls/ServerNameList;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addStatusRequestExtension", "(Ljava/util/Hashtable;Lorg/bouncycastle/crypto/tls/CertificateStatusRequest;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_status_request", "Ljava/lang/Integer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createStatusRequestExtension", "(Lorg/bouncycastle/crypto/tls/CertificateStatusRequest;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "addTruncatedHMacExtension", "(Ljava/util/Hashtable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_truncated_hmac", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createTruncatedHMacExtension", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getHeartbeatExtension", "(Ljava/util/Hashtable;)Lorg/bouncycastle/crypto/tls/HeartbeatExtension;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_heartbeat", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readHeartbeatExtension", "([B)Lorg/bouncycastle/crypto/tls/HeartbeatExtension;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMaxFragmentLengthExtension", "(Ljava/util/Hashtable;)S", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_max_fragment_length", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readMaxFragmentLengthExtension", "([B)S", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPaddingExtension", "(Ljava/util/Hashtable;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_padding", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readPaddingExtension", "([B)I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getServerNameExtension", "(Ljava/util/Hashtable;)Lorg/bouncycastle/crypto/tls/ServerNameList;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_server_name", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readServerNameExtension", "([B)Lorg/bouncycastle/crypto/tls/ServerNameList;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getStatusRequestExtension", "(Ljava/util/Hashtable;)Lorg/bouncycastle/crypto/tls/CertificateStatusRequest;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_status_request", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readStatusRequestExtension", "([B)Lorg/bouncycastle/crypto/tls/CertificateStatusRequest;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasEncryptThenMACExtension", "(Ljava/util/Hashtable;)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_encrypt_then_mac", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readEncryptThenMACExtension", "([B)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasExtendedMasterSecretExtension", "(Ljava/util/Hashtable;)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_extended_master_secret", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readExtendedMasterSecretExtension", "([B)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasTruncatedHMacExtension", "(Ljava/util/Hashtable;)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_truncated_hmac", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "getExtensionData", "(Ljava/util/Hashtable;Ljava/lang/Integer;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readTruncatedHMacExtension", "([B)Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createEmptyExtensionData", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "EMPTY_BYTES", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createEncryptThenMACExtension", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createEmptyExtensionData", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createExtendedMasterSecretExtension", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createEmptyExtensionData", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createHeartbeatExtension", "(Lorg/bouncycastle/crypto/tls/HeartbeatExtension;)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/HeartbeatExtension", "encode", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMaxFragmentLengthExtension", "(S)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "checkUint8", "(S)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "writeUint8", "(S[BI)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createPaddingExtension", "(I)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "checkUint16", "(I)V", false);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createServerNameExtension", "(Lorg/bouncycastle/crypto/tls/ServerNameList;)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/ServerNameList", "encode", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createStatusRequestExtension", "(Lorg/bouncycastle/crypto/tls/CertificateStatusRequest;)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/tls/CertificateStatusRequest", "encode", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createTruncatedHMacExtension", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "createEmptyExtensionData", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "readEmptyExtensionData", "([B)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("'extensionData' cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readEncryptThenMACExtension", "([B)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readEmptyExtensionData", "([B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readExtendedMasterSecretExtension", "([B)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readEmptyExtensionData", "([B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readHeartbeatExtension", "([B)Lorg/bouncycastle/crypto/tls/HeartbeatExtension;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("'extensionData' cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/HeartbeatExtension", "parse", "(Ljava/io/InputStream;)Lorg/bouncycastle/crypto/tls/HeartbeatExtension;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsProtocol", "assertEmpty", "(Ljava/io/ByteArrayInputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readMaxFragmentLengthExtension", "([B)S", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("'extensionData' cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "readUint8", "([BI)S", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readPaddingExtension", "([B)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("'extensionData' cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(BALOAD);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsFatalAlert");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsFatalAlert", "<init>", "(S)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readServerNameExtension", "([B)Lorg/bouncycastle/crypto/tls/ServerNameList;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("'extensionData' cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/ServerNameList", "parse", "(Ljava/io/InputStream;)Lorg/bouncycastle/crypto/tls/ServerNameList;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsProtocol", "assertEmpty", "(Ljava/io/ByteArrayInputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readStatusRequestExtension", "([B)Lorg/bouncycastle/crypto/tls/CertificateStatusRequest;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("'extensionData' cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/CertificateStatusRequest", "parse", "(Ljava/io/InputStream;)Lorg/bouncycastle/crypto/tls/CertificateStatusRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsProtocol", "assertEmpty", "(Ljava/io/ByteArrayInputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readTruncatedHMacExtension", "([B)Z", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "readEmptyExtensionData", "([B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_encrypt_then_mac", "Ljava/lang/Integer;");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_extended_master_secret", "Ljava/lang/Integer;");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_heartbeat", "Ljava/lang/Integer;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_max_fragment_length", "Ljava/lang/Integer;");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_padding", "Ljava/lang/Integer;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_server_name", "Ljava/lang/Integer;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_status_request", "Ljava/lang/Integer;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Integers", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/TlsExtensionsUtils", "EXT_truncated_hmac", "Ljava/lang/Integer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
