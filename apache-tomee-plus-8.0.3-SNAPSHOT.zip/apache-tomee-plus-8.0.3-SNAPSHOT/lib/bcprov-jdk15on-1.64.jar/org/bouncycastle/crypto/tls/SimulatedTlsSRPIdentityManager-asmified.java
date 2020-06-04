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
public class SimulatedTlsSRPIdentityManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_DEPRECATED, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/tls/TlsSRPIdentityManager" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PREFIX_PASSWORD", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PREFIX_SALT", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "group", "Lorg/bouncycastle/crypto/params/SRP6GroupParameters;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "verifierGenerator", "Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mac", "Lorg/bouncycastle/crypto/Mac;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getRFC5054Default", "(Lorg/bouncycastle/crypto/params/SRP6GroupParameters;[B)Lorg/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "createHash", "(S)Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator", "init", "(Lorg/bouncycastle/crypto/params/SRP6GroupParameters;Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/macs/HMac");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/tls/TlsUtils", "createHash", "(S)Lorg/bouncycastle/crypto/Digest;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/macs/HMac", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/params/KeyParameter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/params/KeyParameter", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/macs/HMac", "init", "(Lorg/bouncycastle/crypto/CipherParameters;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "<init>", "(Lorg/bouncycastle/crypto/params/SRP6GroupParameters;Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;Lorg/bouncycastle/crypto/Mac;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/params/SRP6GroupParameters;Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;Lorg/bouncycastle/crypto/Mac;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "group", "Lorg/bouncycastle/crypto/params/SRP6GroupParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "verifierGenerator", "Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoginParameters", "([B)Lorg/bouncycastle/crypto/tls/TlsSRPLoginParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "PREFIX_SALT", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "PREFIX_SALT", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "update", "([BII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "update", "([BII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "getMacSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "PREFIX_PASSWORD", "[B");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "PREFIX_PASSWORD", "[B");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "update", "([BII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "update", "([BII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "getMacSize", "()I", true);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "mac", "Lorg/bouncycastle/crypto/Mac;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Mac", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "verifierGenerator", "Lorg/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/agreement/srp/SRP6VerifierGenerator", "generateVerifier", "([B[B[B)Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/tls/TlsSRPLoginParameters");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "group", "Lorg/bouncycastle/crypto/params/SRP6GroupParameters;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/tls/TlsSRPLoginParameters", "<init>", "(Lorg/bouncycastle/crypto/params/SRP6GroupParameters;Ljava/math/BigInteger;[B)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("password");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toByteArray", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "PREFIX_PASSWORD", "[B");
methodVisitor.visitLdcInsn("salt");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Strings", "toByteArray", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/tls/SimulatedTlsSRPIdentityManager", "PREFIX_SALT", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
