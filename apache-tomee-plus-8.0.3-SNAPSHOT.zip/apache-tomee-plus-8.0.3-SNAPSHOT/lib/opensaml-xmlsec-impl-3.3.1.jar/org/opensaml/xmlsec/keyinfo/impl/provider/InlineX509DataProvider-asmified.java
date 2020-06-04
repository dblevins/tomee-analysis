package asm.org.opensaml.xmlsec.keyinfo.impl.provider;
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
public class InlineX509DataProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", null, "org/opensaml/xmlsec/keyinfo/impl/provider/AbstractKeyInfoProvider", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/provider/AbstractKeyInfoProvider", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/x509/InternalX500DNHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/x509/InternalX500DNHandler", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX500DNHandler", "()Lorg/opensaml/security/x509/X500DNHandler;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setX500DNHandler", "(Lorg/opensaml/security/x509/X500DNHandler;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("X500DNHandler cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/x509/X500DNHandler");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handles", "(Lorg/opensaml/core/xml/XMLObject;)Z", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/xmlsec/signature/X509Data");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "process", "(Lorg/opensaml/xmlsec/keyinfo/KeyInfoCredentialResolver;Lorg/opensaml/core/xml/XMLObject;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Lorg/opensaml/xmlsec/keyinfo/impl/KeyInfoResolutionContext;)Ljava/util/Collection;", "(Lorg/opensaml/xmlsec/keyinfo/KeyInfoCredentialResolver;Lorg/opensaml/core/xml/XMLObject;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Lorg/opensaml/xmlsec/keyinfo/impl/KeyInfoResolutionContext;)Ljava/util/Collection<Lorg/opensaml/security/credential/Credential;>;", new String[] { "org/opensaml/security/SecurityException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, true);
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
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "handles", "(Lorg/opensaml/core/xml/XMLObject;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/X509Data");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Attempting to extract credential from an X509Data");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "extractCertificates", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("The X509Data contained no X509Certificate elements, skipping credential extraction");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/xmlsec/signature/X509Data", "java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "extractCRLs", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/KeyInfoResolutionContext", "getKey", "()Ljava/security/Key;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/KeyInfoResolutionContext", "getKey", "()Ljava/security/Key;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/PublicKey");
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/KeyInfoResolutionContext", "getKey", "()Ljava/security/Key;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/PublicKey");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/security/PublicKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "findEntityCert", "(Ljava/util/List;Lorg/opensaml/xmlsec/signature/X509Data;Ljava/security/PublicKey;)Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("The end-entity cert could not be identified, skipping credential extraction");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/cert/X509Certificate"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/x509/BasicX509Credential");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/x509/BasicX509Credential", "<init>", "(Ljava/security/cert/X509Certificate;)V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/BasicX509Credential", "setCRLs", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/BasicX509Credential", "setEntityCertificateChain", "(Ljava/util/Collection;)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/BasicX509Credential", "getKeyNames", "()Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/KeyInfoResolutionContext", "getKeyNames", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "buildCredentialContext", "(Lorg/opensaml/xmlsec/keyinfo/impl/KeyInfoResolutionContext;)Lorg/opensaml/xmlsec/keyinfo/impl/KeyInfoCredentialContext;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/x509/BasicX509Credential", "getCredentialContextSet", "()Lorg/opensaml/security/credential/CredentialContextSet;", false);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/credential/CredentialContextSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/security/x509/BasicX509Credential", "org/opensaml/security/credential/CredentialContext"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "extractCRLs", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List;", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List<Ljava/security/cert/X509CRL;>;", new String[] { "org/opensaml/security/SecurityException" });
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/cert/CRLException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/KeyInfoSupport", "getCRLs", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "org/opensaml/xmlsec/signature/X509Data", "java/util/List"}, 1, new Object[] {"java/security/cert/CRLException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error extracting CRLs from X509Data");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error extracting CRLs from X509Data");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Found {} X509CRLs");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "extractCertificates", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List;", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List<Ljava/security/cert/X509Certificate;>;", new String[] { "org/opensaml/security/SecurityException" });
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/cert/CertificateException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/KeyInfoSupport", "getCertificates", "(Lorg/opensaml/xmlsec/signature/X509Data;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "org/opensaml/xmlsec/signature/X509Data", "java/util/List"}, 1, new Object[] {"java/security/cert/CertificateException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error extracting certificates from X509Data");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error extracting certificates from X509Data");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Found {} X509Certificates");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findEntityCert", "(Ljava/util/List;Lorg/opensaml/xmlsec/signature/X509Data;Ljava/security/PublicKey;)Ljava/security/cert/X509Certificate;", "(Ljava/util/List<Ljava/security/cert/X509Certificate;>;Lorg/opensaml/xmlsec/signature/X509Data;Ljava/security/PublicKey;)Ljava/security/cert/X509Certificate;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
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
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Single certificate was present, treating as end-entity certificate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "findCertFromKey", "(Ljava/util/List;Ljava/security/PublicKey;)Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("End-entity certificate resolved by matching previously resolved public key");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/cert/X509Certificate"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Data", "getX509SubjectNames", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "findCertFromSubjectNames", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("End-entity certificate resolved by matching X509SubjectName");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Data", "getX509IssuerSerials", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "findCertFromIssuerSerials", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("End-entity certificate resolved by matching X509IssuerSerial");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Data", "getX509SKIs", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "findCertFromSubjectKeyIdentifier", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("End-entity certificate resolved by matching X509SKI");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Data", "getX509Digests", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "findCertFromDigest", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("End-entity certificate resolved by matching X509Digest");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Treating the first certificate in the X509Data as the end-entity certificate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findCertFromKey", "(Ljava/util/List;Ljava/security/PublicKey;)Ljava/security/cert/X509Certificate;", "(Ljava/util/List<Ljava/security/cert/X509Certificate;>;Ljava/security/PublicKey;)Ljava/security/cert/X509Certificate;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
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
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getPublicKey", "()Ljava/security/PublicKey;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findCertFromSubjectNames", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", "(Ljava/util/List<Ljava/security/cert/X509Certificate;>;Ljava/util/List<Lorg/opensaml/xmlsec/signature/X509SubjectName;>;)Ljava/security/cert/X509Certificate;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/X509SubjectName");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509SubjectName", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509SubjectName", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/X500DNHandler", "parse", "(Ljava/lang/String;)Ljavax/security/auth/x500/X500Principal;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "java/util/List", "java/util/List", "java/util/Iterator", "org/opensaml/xmlsec/signature/X509SubjectName", "javax/security/auth/x500/X500Principal"}, 1, new Object[] {"java/lang/IllegalArgumentException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("X500 subject name '{}' could not be parsed by configured X500DNHandler '{}'");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509SubjectName", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getSubjectX500Principal", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/x500/X500Principal", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findCertFromIssuerSerials", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", "(Ljava/util/List<Ljava/security/cert/X509Certificate;>;Ljava/util/List<Lorg/opensaml/xmlsec/signature/X509IssuerSerial;>;)Ljava/security/cert/X509Certificate;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/X509IssuerSerial");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509IssuerSerial", "getX509IssuerName", "()Lorg/opensaml/xmlsec/signature/X509IssuerName;", true);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509IssuerSerial", "getX509SerialNumber", "()Lorg/opensaml/xmlsec/signature/X509SerialNumber;", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xmlsec/signature/X509IssuerSerial"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509IssuerSerial", "getX509IssuerName", "()Lorg/opensaml/xmlsec/signature/X509IssuerName;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509IssuerName", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509IssuerSerial", "getX509SerialNumber", "()Lorg/opensaml/xmlsec/signature/X509SerialNumber;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509SerialNumber", "getValue", "()Ljava/math/BigInteger;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/X500DNHandler", "parse", "(Ljava/lang/String;)Ljavax/security/auth/x500/X500Principal;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "java/util/List", "java/util/List", "java/util/Iterator", "org/opensaml/xmlsec/signature/X509IssuerSerial", "java/lang/String", "java/math/BigInteger", "javax/security/auth/x500/X500Principal"}, 1, new Object[] {"java/lang/IllegalArgumentException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("X500 issuer name '{}' could not be parsed by configured X500DNHandler '{}'");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getIssuerX500Principal", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/x500/X500Principal", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getSerialNumber", "()Ljava/math/BigInteger;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "java/util/List", "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findCertFromSubjectKeyIdentifier", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", "(Ljava/util/List<Ljava/security/cert/X509Certificate;>;Ljava/util/List<Lorg/opensaml/xmlsec/signature/X509SKI;>;)Ljava/security/cert/X509Certificate;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/X509SKI");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509SKI", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509SKI", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/codec/Base64Support", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/opensaml/xmlsec/signature/X509SKI", "[B", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/x509/X509Support", "getSubjectKeyIdentifier", "(Ljava/security/cert/X509Certificate;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "equals", "([B[B)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findCertFromDigest", "(Ljava/util/List;Ljava/util/List;)Ljava/security/cert/X509Certificate;", "(Ljava/util/List<Ljava/security/cert/X509Certificate;>;Ljava/util/List<Lorg/opensaml/xmlsec/signature/X509Digest;>;)Ljava/security/cert/X509Certificate;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/security/SecurityException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/X509Digest");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Digest", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Digest", "getAlgorithm", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Digest", "getAlgorithm", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmSupport", "getAlgorithmID", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Algorithm {} not supported");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Digest", "getAlgorithm", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/xmlsec/signature/X509Digest", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/X509Digest", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/codec/Base64Support", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[B", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/x509/X509Support", "getX509Digest", "(Ljava/security/cert/X509Certificate;Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "equals", "([B[B)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/cert/X509Certificate"}, 0, null);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/security/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/provider/InlineX509DataProvider", "java/util/List", "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
