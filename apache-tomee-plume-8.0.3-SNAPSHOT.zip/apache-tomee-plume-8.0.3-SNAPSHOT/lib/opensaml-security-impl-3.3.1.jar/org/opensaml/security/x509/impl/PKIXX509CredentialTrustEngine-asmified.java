package asm.org.opensaml.security.x509.impl;
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
public class PKIXX509CredentialTrustEngineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "Ljava/lang/Object;Lorg/opensaml/security/x509/PKIXTrustEngine<Lorg/opensaml/security/x509/X509Credential;>;", "java/lang/Object", new String[] { "org/opensaml/security/x509/PKIXTrustEngine" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pkixResolver", "Lorg/opensaml/security/x509/PKIXValidationInformationResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pkixTrustEvaluator", "Lorg/opensaml/security/x509/PKIXTrustEvaluator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "credNameEvaluator", "Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/security/x509/PKIXValidationInformationResolver;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("PKIX trust information resolver cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/x509/PKIXValidationInformationResolver");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixResolver", "Lorg/opensaml/security/x509/PKIXValidationInformationResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/x509/impl/CertPathPKIXTrustEvaluator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/x509/impl/CertPathPKIXTrustEvaluator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixTrustEvaluator", "Lorg/opensaml/security/x509/PKIXTrustEvaluator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/x509/impl/BasicX509CredentialNameEvaluator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/x509/impl/BasicX509CredentialNameEvaluator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "credNameEvaluator", "Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/security/x509/PKIXValidationInformationResolver;Lorg/opensaml/security/x509/PKIXTrustEvaluator;Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;)V", null, null);
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("PKIX trust information resolver cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/x509/PKIXValidationInformationResolver");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixResolver", "Lorg/opensaml/security/x509/PKIXValidationInformationResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("PKIX trust evaluator may not be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/x509/PKIXTrustEvaluator");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixTrustEvaluator", "Lorg/opensaml/security/x509/PKIXTrustEvaluator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "credNameEvaluator", "Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPKIXResolver", "()Lorg/opensaml/security/x509/PKIXValidationInformationResolver;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixResolver", "Lorg/opensaml/security/x509/PKIXValidationInformationResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPKIXTrustEvaluator", "()Lorg/opensaml/security/x509/PKIXTrustEvaluator;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixTrustEvaluator", "Lorg/opensaml/security/x509/PKIXTrustEvaluator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX509CredentialNameEvaluator", "()Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "credNameEvaluator", "Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Lorg/opensaml/security/x509/X509Credential;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Z", null, new String[] { "org/opensaml/security/SecurityException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/UnsupportedOperationException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "net/shibboleth/utilities/java/support/resolver/ResolverException");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, "net/shibboleth/utilities/java/support/resolver/ResolverException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Attempting PKIX validation of untrusted credential");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("X.509 credential was null, unable to perform validation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/X509Credential", "getEntityCertificate", "()Ljava/security/cert/X509Certificate;", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Untrusted X.509 credential's entity certificate was null, unable to perform validation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "getPKIXResolver", "()Lorg/opensaml/security/x509/PKIXValidationInformationResolver;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/PKIXValidationInformationResolver", "supportsTrustedNameResolution", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixResolver", "Lorg/opensaml/security/x509/PKIXValidationInformationResolver;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/PKIXValidationInformationResolver", "resolveTrustedNames", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "org/opensaml/security/x509/X509Credential", "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "java/util/Set"}, 1, new Object[] {"java/lang/UnsupportedOperationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error resolving trusted names");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"net/shibboleth/utilities/java/support/resolver/ResolverException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error resolving trusted names");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("PKIX resolver does not support resolution of trusted names, skipping name checking");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "pkixResolver", "Lorg/opensaml/security/x509/PKIXValidationInformationResolver;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/PKIXValidationInformationResolver", "resolve", "(Ljava/lang/Object;)Ljava/lang/Iterable;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "validate", "(Lorg/opensaml/security/x509/X509Credential;Ljava/util/Set;Ljava/lang/Iterable;)Z", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"net/shibboleth/utilities/java/support/resolver/ResolverException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error resolving trusted credentials");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "validate", "(Lorg/opensaml/security/x509/X509Credential;Ljava/util/Set;Ljava/lang/Iterable;)Z", "(Lorg/opensaml/security/x509/X509Credential;Ljava/util/Set<Ljava/lang/String;>;Ljava/lang/Iterable<Lorg/opensaml/security/x509/PKIXValidationInformation;>;)Z", new String[] { "org/opensaml/security/SecurityException" });
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/security/SecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Beginning PKIX validation using trusted validation information");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "checkNames", "(Ljava/util/Set;Lorg/opensaml/security/x509/X509Credential;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Evaluation of credential against trusted names failed. Aborting PKIX validation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/x509/PKIXValidationInformation");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "getPKIXTrustEvaluator", "()Lorg/opensaml/security/x509/PKIXTrustEvaluator;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/PKIXTrustEvaluator", "validate", "(Lorg/opensaml/security/x509/PKIXValidationInformation;Lorg/opensaml/security/x509/X509Credential;)Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Credential trust established via PKIX validation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/security/x509/PKIXValidationInformation"}, 0, null);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/security/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error performing PKIX validation on untrusted credential");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Trust of untrusted credential could not be established via PKIX validation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkNames", "(Ljava/util/Set;Lorg/opensaml/security/x509/X509Credential;)Z", "(Ljava/util/Set<Ljava/lang/String;>;Lorg/opensaml/security/x509/X509Credential;)Z", new String[] { "org/opensaml/security/SecurityException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "getX509CredentialNameEvaluator", "()Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("No credential name evaluator was available, skipping trusted name evaluation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Trusted names was null, signalling PKIX resolver does not support trusted names resolution, skipping trusted name evaluation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "credNameEvaluator", "Lorg/opensaml/security/x509/impl/X509CredentialNameEvaluator;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/impl/X509CredentialNameEvaluator", "evaluate", "(Lorg/opensaml/security/x509/X509Credential;Ljava/util/Set;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "validate", "(Ljava/lang/Object;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Z", null, new String[] { "org/opensaml/security/SecurityException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/x509/X509Credential");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/impl/PKIXX509CredentialTrustEngine", "validate", "(Lorg/opensaml/security/x509/X509Credential;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
