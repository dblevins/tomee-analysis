package asm.org.bouncycastle.jcajce;
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
public class BCFKSLoadStoreParameterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", null, "org/bouncycastle/jcajce/BCLoadStoreParameter", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "CertChainValidator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "EncryptionAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "MacAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm", "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "SignatureAlgorithm", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/jcajce/BCFKSLoadStoreParameter$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("java/security/KeyStore$ProtectionParameter", "java/security/KeyStore", "ProtectionParameter", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sigKey", "Ljava/security/Key;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "certificates", "[Ljava/security/cert/X509Certificate;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validator", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$100", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$200", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/io/OutputStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$300", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/security/KeyStore$ProtectionParameter;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCLoadStoreParameter", "<init>", "(Ljava/io/InputStream;Ljava/io/OutputStream;Ljava/security/KeyStore$ProtectionParameter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$400", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/crypto/util/PBKDFConfig;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$500", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$600", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$700", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$800", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Ljava/security/Key;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "sigKey", "Ljava/security/Key;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$900", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "certificates", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder", "access$1000", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "validator", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStorePBKDFConfig", "()Lorg/bouncycastle/crypto/util/PBKDFConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "storeConfig", "Lorg/bouncycastle/crypto/util/PBKDFConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreEncryptionAlgorithm", "()Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "encAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$EncryptionAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreMacAlgorithm", "()Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "macAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$MacAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreSignatureAlgorithm", "()Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "sigAlg", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$SignatureAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreSignatureKey", "()Ljava/security/Key;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "sigKey", "Ljava/security/Key;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreCertificates", "()[Ljava/security/cert/X509Certificate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "certificates", "[Ljava/security/cert/X509Certificate;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertChainValidator", "()Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "validator", "Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$CertChainValidator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/BCFKSLoadStoreParameter", "<init>", "(Lorg/bouncycastle/jcajce/BCFKSLoadStoreParameter$Builder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
