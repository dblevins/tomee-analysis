package asm.org.opensaml.saml.saml2.wssecurity.messaging.impl;
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
public class DefaultSAML20AssertionValidationContextBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "Ljava/lang/Object;Lcom/google/common/base/Function<Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;Lorg/opensaml/saml/common/assertion/ValidationContext;>;", "java/lang/Object", new String[] { "com/google/common/base/Function" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signatureCriteriaSetFunction", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lnet/shibboleth/utilities/java/support/collection/Pair<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signatureRequired", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "signatureRequired", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSignatureRequired", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "signatureRequired", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSignatureRequired", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "signatureRequired", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSignatureCriteriaSetFunction", "()Lcom/google/common/base/Function;", "()Lcom/google/common/base/Function<Lnet/shibboleth/utilities/java/support/collection/Pair<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "signatureCriteriaSetFunction", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSignatureCriteriaSetFunction", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lnet/shibboleth/utilities/java/support/collection/Pair<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/saml/saml2/core/Assertion;>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "signatureCriteriaSetFunction", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Lorg/opensaml/saml/common/assertion/ValidationContext;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/common/assertion/ValidationContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "buildStaticParameters", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/assertion/ValidationContext", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildStaticParameters", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Map;", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("saml2.SignatureRequired");
methodVisitor.visitTypeInsn(NEW, "java/lang/Boolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "isSignatureRequired", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Boolean", "<init>", "(Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("saml2.SignatureValidationCriteriaSet");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getSignatureCriteriaSet", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getAttesterCertificate", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("saml2.SubjectConfirmation.HoK.PresenterCertificate");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/HashMap", "java/security/cert/X509Certificate"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getAttesterPublicKey", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/security/PublicKey;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("saml2.SubjectConfirmation.HoK.PresenterKey");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/PublicKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("saml2.SubjectConfirmation.ValidRecipients");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getValidRecipients", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("saml2.SubjectConfirmation.ValidAddresses");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getValidAddresses", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("saml2.Conditions.ValidAudiences");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getValidAudiences", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Built static parameters map: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getSignatureCriteriaSet", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getSignatureCriteriaSetFunction", "()Lcom/google/common/base/Function;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getSignatureCriteriaSetFunction", "()Lcom/google/common/base/Function;", false);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/Pair");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/Pair", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"net/shibboleth/utilities/java/support/resolver/CriteriaSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/core/criterion/EntityIdCriterion;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "contains", "(Ljava/lang/Class;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "getAssertion", "()Lorg/opensaml/saml/saml2/core/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Assertion", "getIssuer", "()Lorg/opensaml/saml/saml2/core/Issuer;", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "getAssertion", "()Lorg/opensaml/saml/saml2/core/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Assertion", "getIssuer", "()Lorg/opensaml/saml/saml2/core/Issuer;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Issuer", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/primitive/StringSupport", "trimOrNull", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Adding internally-generated EntityIdCriterion with value of: {}");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/criterion/EntityIdCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/criterion/EntityIdCriterion", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/criteria/UsageCriterion;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "contains", "(Ljava/lang/Class;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Adding internally-generated UsageCriterion with value of: {}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/security/credential/UsageType", "SIGNING", "Lorg/opensaml/security/credential/UsageType;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/criteria/UsageCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/security/credential/UsageType", "SIGNING", "Lorg/opensaml/security/credential/UsageType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/criteria/UsageCriterion", "<init>", "(Lorg/opensaml/security/credential/UsageType;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved Signature validation CriteriaSet: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAttesterCertificate", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/security/cert/X509Certificate;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/security/SecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/messaging/ServletRequestX509CredentialAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/messaging/ServletRequestX509CredentialAdapter", "<init>", "(Ljavax/servlet/ServletRequest;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/X509Credential", "getEntityCertificate", "()Ljava/security/cert/X509Certificate;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/security/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Peer TLS X.509 certificate was not present. Holder-of-key proof-of-possession via client TLS cert will not be possible");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAttesterPublicKey", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/security/PublicKey;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValidRecipients", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set;", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set<Ljava/lang/String;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getRequestURL", "()Ljava/lang/StringBuffer;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "getMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLSelfEntityContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext", "getEntityId", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext", "getEntityId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"net/shibboleth/utilities/java/support/collection/LazySet", "java/lang/String", "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved valid subject confirmation recipients set: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValidAddresses", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set;", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set<Ljava/net/InetAddress;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/UnknownHostException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/net/UnknownHostException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "getAttesterIPAddress", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Saw attester IP address: {}");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/net/InetAddress", "getAllByName", "(Ljava/lang/String;)[Ljava/net/InetAddress;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved valid subject confirmation InetAddress set: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"net/shibboleth/utilities/java/support/collection/LazySet", "[Ljava/net/InetAddress;", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Could not determine attester IP address. Validation of Assertion may or may not succeed");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput"}, 1, new Object[] {"java/net/UnknownHostException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Processing of attester IP address failed. Validation of Assertion may or may not succeed");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAttesterIPAddress", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "getHttpServletRequest", "()Ljavax/servlet/http/HttpServletRequest;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/servlet/http/HttpServletRequest", "getRemoteAddr", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValidAudiences", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set;", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Ljava/util/Set<Ljava/lang/String;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput", "getMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLSelfEntityContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext", "getEntityId", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext", "getEntityId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"net/shibboleth/utilities/java/support/collection/LazySet", "org/opensaml/saml/common/messaging/context/SAMLSelfEntityContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved valid audiences set: {}");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/wssecurity/messaging/impl/DefaultSAML20AssertionValidationContextBuilder", "apply", "(Lorg/opensaml/saml/saml2/wssecurity/messaging/impl/SAML20AssertionTokenValidationInput;)Lorg/opensaml/saml/common/assertion/ValidationContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
