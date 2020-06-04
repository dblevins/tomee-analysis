package asm.org.apache.wss4j.common;
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
public class ConfigurationConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/common/ConfigurationConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION", "Ljava/lang/String;", null, "action");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN", "Ljava/lang/String;", null, "UsernameToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN_SIGNATURE", "Ljava/lang/String;", null, "UsernameTokenSignature");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USERNAME_TOKEN_NO_PASSWORD", "Ljava/lang/String;", null, "UsernameTokenNoPassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_TOKEN_UNSIGNED", "Ljava/lang/String;", null, "SAMLTokenUnsigned");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_TOKEN_SIGNED", "Ljava/lang/String;", null, "SAMLTokenSigned");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE", "Ljava/lang/String;", null, "Signature");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPT", "Ljava/lang/String;", null, "Encrypt");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP", "Ljava/lang/String;", null, "Timestamp");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_DERIVED", "Ljava/lang/String;", null, "SignatureDerived");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPT_DERIVED", "Ljava/lang/String;", null, "EncryptDerived");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_WITH_KERBEROS_TOKEN", "Ljava/lang/String;", null, "SignatureWithKerberosToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPT_WITH_KERBEROS_TOKEN", "Ljava/lang/String;", null, "EncryptWithKerberosToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KERBEROS_TOKEN", "Ljava/lang/String;", null, "KerberosToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CUSTOM_TOKEN", "Ljava/lang/String;", null, "CustomToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTOR", "Ljava/lang/String;", null, "actor");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USER", "Ljava/lang/String;", null, "user");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTION_USER", "Ljava/lang/String;", null, "encryptionUser");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_USER", "Ljava/lang/String;", null, "signatureUser");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USE_REQ_SIG_CERT", "Ljava/lang/String;", null, "useReqSigCert");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PW_CALLBACK_CLASS", "Ljava/lang/String;", null, "passwordCallbackClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PW_CALLBACK_REF", "Ljava/lang/String;", null, "passwordCallbackRef");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_CALLBACK_CLASS", "Ljava/lang/String;", null, "samlCallbackClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_CALLBACK_REF", "Ljava/lang/String;", null, "samlCallbackRef");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_PROP_FILE", "Ljava/lang/String;", null, "signaturePropFile");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_PROP_REF_ID", "Ljava/lang/String;", null, "signaturePropRefId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_VER_PROP_FILE", "Ljava/lang/String;", null, "signatureVerificationPropFile");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_VER_PROP_REF_ID", "Ljava/lang/String;", null, "signatureVerificationPropRefId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEC_PROP_FILE", "Ljava/lang/String;", null, "decryptionPropFile");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEC_PROP_REF_ID", "Ljava/lang/String;", null, "decryptionPropRefId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_PROP_FILE", "Ljava/lang/String;", null, "encryptionPropFile");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_PROP_REF_ID", "Ljava/lang/String;", null, "encryptionPropRefId");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENABLE_SIGNATURE_CONFIRMATION", "Ljava/lang/String;", null, "enableSignatureConfirmation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MUST_UNDERSTAND", "Ljava/lang/String;", null, "mustUnderstand");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_BSP_COMPLIANT", "Ljava/lang/String;", null, "isBSPCompliant");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADD_INCLUSIVE_PREFIXES", "Ljava/lang/String;", null, "addInclusivePrefixes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADD_USERNAMETOKEN_NONCE", "Ljava/lang/String;", null, "addUsernameTokenNonce");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADD_USERNAMETOKEN_CREATED", "Ljava/lang/String;", null, "addUsernameTokenCreated");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HANDLE_CUSTOM_PASSWORD_TYPES", "Ljava/lang/String;", null, "handleCustomPasswordTypes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOW_USERNAMETOKEN_NOPASSWORD", "Ljava/lang/String;", null, "allowUsernameTokenNoPassword");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOW_NAMESPACE_QUALIFIED_PASSWORD_TYPES", "Ljava/lang/String;", null, "allowNamespaceQualifiedPasswordTypes");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENABLE_REVOCATION", "Ljava/lang/String;", null, "enableRevocation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USE_SINGLE_CERTIFICATE", "Ljava/lang/String;", null, "useSingleCertificate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USE_DERIVED_KEY_FOR_MAC", "Ljava/lang/String;", null, "useDerivedKeyForMAC");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP_PRECISION", "Ljava/lang/String;", null, "precisionInMilliseconds");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP_STRICT", "Ljava/lang/String;", null, "timestampStrict");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_TIMESTAMP_EXPIRES", "Ljava/lang/String;", null, "requireTimestampExpires");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_SYM_ENC_KEY", "Ljava/lang/String;", null, "encryptSymmetricEncryptionKey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_SIGNED_ENCRYPTED_DATA_ELEMENTS", "Ljava/lang/String;", null, "requireSignedEncryptedDataElements");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOW_RSA15_KEY_TRANSPORT_ALGORITHM", "Ljava/lang/String;", null, "allowRSA15KeyTransportAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATE_SAML_SUBJECT_CONFIRMATION", "Ljava/lang/String;", null, "validateSamlSubjectConfirmation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_SIGNATURE_TOKEN", "Ljava/lang/String;", null, "includeSignatureToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCLUDE_ENCRYPTION_TOKEN", "Ljava/lang/String;", null, "includeEncryptionToken");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USE_2005_12_NAMESPACE", "Ljava/lang/String;", null, "use200512Namespace");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GET_SECRET_KEY_FROM_CALLBACK_HANDLER", "Ljava/lang/String;", null, "getSecretKeyFromCallbackHandler");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STORE_BYTES_IN_ATTACHMENT", "Ljava/lang/String;", null, "storeBytesInAttachment");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_DEPRECATED, "EXPAND_XOP_INCLUDE_FOR_SIGNATURE", "Ljava/lang/String;", null, "expandXOPIncludeForSignature");
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXPAND_XOP_INCLUDE", "Ljava/lang/String;", null, "expandXOPInclude");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PASSWORD_TYPE", "Ljava/lang/String;", null, "passwordType");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_KEY_ID", "Ljava/lang/String;", null, "signatureKeyIdentifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_ALGO", "Ljava/lang/String;", null, "signatureAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_DIGEST_ALGO", "Ljava/lang/String;", null, "signatureDigestAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_C14N_ALGO", "Ljava/lang/String;", null, "signatureC14nAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIGNATURE_PARTS", "Ljava/lang/String;", null, "signatureParts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPTIONAL_SIGNATURE_PARTS", "Ljava/lang/String;", null, "optionalSignatureParts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DERIVED_KEY_ITERATIONS", "Ljava/lang/String;", null, "derivedKeyIterations");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_KEY_ID", "Ljava/lang/String;", null, "encryptionKeyIdentifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_SYM_ALGO", "Ljava/lang/String;", null, "encryptionSymAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_KEY_TRANSPORT", "Ljava/lang/String;", null, "encryptionKeyTransportAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCRYPTION_PARTS", "Ljava/lang/String;", null, "encryptionParts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPTIONAL_ENCRYPTION_PARTS", "Ljava/lang/String;", null, "optionalEncryptionParts");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_DIGEST_ALGO", "Ljava/lang/String;", null, "encryptionDigestAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENC_MGF_ALGO", "Ljava/lang/String;", null, "encryptionMGFAlgorithm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTL_USERNAMETOKEN", "Ljava/lang/String;", null, "utTimeToLive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTL_FUTURE_USERNAMETOKEN", "Ljava/lang/String;", null, "utFutureTimeToLive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_SUBJECT_CERT_CONSTRAINTS", "Ljava/lang/String;", null, "sigSubjectCertConstraints");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_ISSUER_CERT_CONSTRAINTS", "Ljava/lang/String;", null, "sigIssuerCertConstraints");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIG_CERT_CONSTRAINTS_SEPARATOR", "Ljava/lang/String;", null, "sigCertConstraintsSeparator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTL_TIMESTAMP", "Ljava/lang/String;", null, "timeToLive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TTL_FUTURE_TIMESTAMP", "Ljava/lang/String;", null, "futureTimeToLive");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATOR_MAP", "Ljava/lang/String;", null, "validatorMap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NONCE_CACHE_INSTANCE", "Ljava/lang/String;", null, "nonceCacheInstance");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TIMESTAMP_CACHE_INSTANCE", "Ljava/lang/String;", null, "timestampCacheInstance");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAML_ONE_TIME_USE_CACHE_INSTANCE", "Ljava/lang/String;", null, "samlOneTimeUseCacheInstance");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PASSWORD_ENCRYPTOR_INSTANCE", "Ljava/lang/String;", null, "passwordEncryptorInstance");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DERIVED_TOKEN_REFERENCE", "Ljava/lang/String;", null, "derivedTokenReference");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DERIVED_TOKEN_KEY_ID", "Ljava/lang/String;", null, "derivedTokenKeyIdentifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DERIVED_SIGNATURE_KEY_LENGTH", "Ljava/lang/String;", null, "derivedSignatureKeyLength");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DERIVED_ENCRYPTION_KEY_LENGTH", "Ljava/lang/String;", null, "derivedEncryptionKeyLength");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
