package asm.org.jose4j.jwt.consumer;
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
public class JwtConsumerBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwt/consumer/JwtConsumerBuilder", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "verificationKeyResolver", "Lorg/jose4j/keys/resolvers/VerificationKeyResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "decryptionKeyResolver", "Lorg/jose4j/keys/resolvers/DecryptionKeyResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jwsAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jweAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jweContentEncryptionAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "skipDefaultAudienceValidation", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "audValidator", "Lorg/jose4j/jwt/consumer/AudValidator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "issValidator", "Lorg/jose4j/jwt/consumer/IssValidator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requireSubject", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expectedSubject", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requireJti", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "customValidators", "Ljava/util/List;", "Ljava/util/List<Lorg/jose4j/jwt/consumer/ErrorCodeValidator;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requireSignature", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requireEncryption", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "skipSignatureVerification", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "relaxVerificationKeyValidation", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "skipVerificationKeyResolutionOnNone", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "relaxDecryptionKeyValidation", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "skipAllValidators", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "skipAllDefaultValidators", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "liberalContentTypeHandling", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jwsProviderContext", "Lorg/jose4j/jca/ProviderContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jweProviderContext", "Lorg/jose4j/jca/ProviderContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jwsCustomizer", "Lorg/jose4j/jwt/consumer/JwsCustomizer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jweCustomizer", "Lorg/jose4j/jwt/consumer/JweCustomizer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/SimpleKeyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/SimpleKeyResolver", "<init>", "(Ljava/security/Key;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "verificationKeyResolver", "Lorg/jose4j/keys/resolvers/VerificationKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/SimpleKeyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/SimpleKeyResolver", "<init>", "(Ljava/security/Key;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "decryptionKeyResolver", "Lorg/jose4j/keys/resolvers/DecryptionKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/NumericDateValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/NumericDateValidator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "customValidators", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireSignature", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipSignatureVerification", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipAllValidators", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipAllDefaultValidators", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnableRequireEncryption", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireEncryption", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDisableRequireSignature", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireSignature", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnableLiberalContentTypeHandling", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "liberalContentTypeHandling", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSkipSignatureVerification", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipSignatureVerification", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSkipAllValidators", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipAllValidators", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSkipAllDefaultValidators", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipAllDefaultValidators", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJwsAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jwsAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJweAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJweContentEncryptionAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweContentEncryptionAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVerificationKey", "(Ljava/security/Key;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/SimpleKeyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/SimpleKeyResolver", "<init>", "(Ljava/security/Key;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setVerificationKeyResolver", "(Lorg/jose4j/keys/resolvers/VerificationKeyResolver;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVerificationKeyResolver", "(Lorg/jose4j/keys/resolvers/VerificationKeyResolver;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "verificationKeyResolver", "Lorg/jose4j/keys/resolvers/VerificationKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSkipVerificationKeyResolutionOnNone", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipVerificationKeyResolutionOnNone", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDecryptionKey", "(Ljava/security/Key;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/SimpleKeyResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/SimpleKeyResolver", "<init>", "(Ljava/security/Key;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setDecryptionKeyResolver", "(Lorg/jose4j/keys/resolvers/DecryptionKeyResolver;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDecryptionKeyResolver", "(Lorg/jose4j/keys/resolvers/DecryptionKeyResolver;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "decryptionKeyResolver", "Lorg/jose4j/keys/resolvers/DecryptionKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "setExpectedAudience", "([Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setExpectedAudience", "(Z[Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "setExpectedAudience", "(Z[Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/AudValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/AudValidator", "<init>", "(Ljava/util/Set;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "audValidator", "Lorg/jose4j/jwt/consumer/AudValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSkipDefaultAudienceValidation", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipDefaultAudienceValidation", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "setExpectedIssuers", "(Z[Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/IssValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/IssValidator", "<init>", "(Z[Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "issValidator", "Lorg/jose4j/jwt/consumer/IssValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExpectedIssuer", "(ZLjava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/IssValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/IssValidator", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "issValidator", "Lorg/jose4j/jwt/consumer/IssValidator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExpectedIssuer", "(Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setExpectedIssuer", "(ZLjava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequireSubject", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireSubject", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExpectedSubject", "(Ljava/lang/String;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "expectedSubject", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "setRequireSubject", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequireJwtId", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireJti", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequireExpirationTime", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/NumericDateValidator", "setRequireExp", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequireIssuedAt", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/NumericDateValidator", "setRequireIat", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequireNotBefore", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/NumericDateValidator", "setRequireNbf", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEvaluationTime", "(Lorg/jose4j/jwt/NumericDate;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/NumericDateValidator", "setEvaluationTime", "(Lorg/jose4j/jwt/NumericDate;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAllowedClockSkewInSeconds", "(I)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/NumericDateValidator", "setAllowedClockSkewSeconds", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxFutureValidityInMinutes", "(I)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/NumericDateValidator", "setMaxFutureValidityInMinutes", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRelaxVerificationKeyValidation", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "relaxVerificationKeyValidation", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRelaxDecryptionKeyValidation", "()Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "relaxDecryptionKeyValidation", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerValidator", "(Lorg/jose4j/jwt/consumer/Validator;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "customValidators", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/ErrorCodeValidatorAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/ErrorCodeValidatorAdapter", "<init>", "(Lorg/jose4j/jwt/consumer/Validator;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "registerValidator", "(Lorg/jose4j/jwt/consumer/ErrorCodeValidator;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "customValidators", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJwsCustomizer", "(Lorg/jose4j/jwt/consumer/JwsCustomizer;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jwsCustomizer", "Lorg/jose4j/jwt/consumer/JwsCustomizer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJweCustomizer", "(Lorg/jose4j/jwt/consumer/JweCustomizer;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweCustomizer", "Lorg/jose4j/jwt/consumer/JweCustomizer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJwsProviderContext", "(Lorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jwsProviderContext", "Lorg/jose4j/jca/ProviderContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJweProviderContext", "(Lorg/jose4j/jca/ProviderContext;)Lorg/jose4j/jwt/consumer/JwtConsumerBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweProviderContext", "Lorg/jose4j/jca/ProviderContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lorg/jose4j/jwt/consumer/JwtConsumer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipAllValidators", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipAllDefaultValidators", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipDefaultAudienceValidation", "Z");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "audValidator", "Lorg/jose4j/jwt/consumer/AudValidator;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/AudValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/AudValidator", "<init>", "(Ljava/util/Set;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "audValidator", "Lorg/jose4j/jwt/consumer/AudValidator;");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "audValidator", "Lorg/jose4j/jwt/consumer/AudValidator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "issValidator", "Lorg/jose4j/jwt/consumer/IssValidator;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/IssValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/IssValidator", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "issValidator", "Lorg/jose4j/jwt/consumer/IssValidator;");
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "issValidator", "Lorg/jose4j/jwt/consumer/IssValidator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "dateClaimsValidator", "Lorg/jose4j/jwt/consumer/NumericDateValidator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "expectedSubject", "Ljava/lang/String;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/SubValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireSubject", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/SubValidator", "<init>", "(Z)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/SubValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "expectedSubject", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/SubValidator", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/jose4j/jwt/consumer/SubValidator"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/JtiValidator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireJti", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/JtiValidator", "<init>", "(Z)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "customValidators", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwt/consumer/JwtConsumer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwt/consumer/JwtConsumer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setValidators", "(Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "verificationKeyResolver", "Lorg/jose4j/keys/resolvers/VerificationKeyResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setVerificationKeyResolver", "(Lorg/jose4j/keys/resolvers/VerificationKeyResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "decryptionKeyResolver", "Lorg/jose4j/keys/resolvers/DecryptionKeyResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setDecryptionKeyResolver", "(Lorg/jose4j/keys/resolvers/DecryptionKeyResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jwsAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setJwsAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setJweAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweContentEncryptionAlgorithmConstraints", "Lorg/jose4j/jwa/AlgorithmConstraints;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setJweContentEncryptionAlgorithmConstraints", "(Lorg/jose4j/jwa/AlgorithmConstraints;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireSignature", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setRequireSignature", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "requireEncryption", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setRequireEncryption", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "liberalContentTypeHandling", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setLiberalContentTypeHandling", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipSignatureVerification", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setSkipSignatureVerification", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "skipVerificationKeyResolutionOnNone", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setSkipVerificationKeyResolutionOnNone", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "relaxVerificationKeyValidation", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setRelaxVerificationKeyValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "relaxDecryptionKeyValidation", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setRelaxDecryptionKeyValidation", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jwsCustomizer", "Lorg/jose4j/jwt/consumer/JwsCustomizer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setJwsCustomizer", "(Lorg/jose4j/jwt/consumer/JwsCustomizer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweCustomizer", "Lorg/jose4j/jwt/consumer/JweCustomizer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setJweCustomizer", "(Lorg/jose4j/jwt/consumer/JweCustomizer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jwsProviderContext", "Lorg/jose4j/jca/ProviderContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setJwsProviderContext", "(Lorg/jose4j/jca/ProviderContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jwt/consumer/JwtConsumerBuilder", "jweProviderContext", "Lorg/jose4j/jca/ProviderContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwt/consumer/JwtConsumer", "setJweProviderContext", "(Lorg/jose4j/jca/ProviderContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
