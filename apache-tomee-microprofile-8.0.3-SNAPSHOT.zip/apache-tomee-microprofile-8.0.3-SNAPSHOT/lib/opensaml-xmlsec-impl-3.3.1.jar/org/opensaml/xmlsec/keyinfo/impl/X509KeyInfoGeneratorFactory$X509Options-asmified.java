package asm.org.opensaml.xmlsec.keyinfo.impl;
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
public class X509KeyInfoGeneratorFactory$X509OptionsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", null, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", null);

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "X509Options", ACC_PROTECTED);

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "BasicOptions", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitEntityCertificate", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitEntityCertificateChain", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitCRLs", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitX509SubjectName", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitX509IssuerSerial", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitX509SKI", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitX509Digest", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "x509DigestAlgorithmURI", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitSubjectDNAsKeyName", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitSubjectCNAsKeyName", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitSubjectAltNamesAsKeyNames", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "subjectAltNames", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/Integer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "x500SubjectDNFormat", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "x500IssuerDNFormat", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "this$0", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#sha256");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x509DigestAlgorithmURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "subjectAltNames", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/x509/InternalX500DNHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/x509/InternalX500DNHandler", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RFC2253");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500SubjectDNFormat", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RFC2253");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500IssuerDNFormat", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "subjectAltNames", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "subjectAltNames", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "subjectAltNames", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/x509/X500DNHandler", "clone", "()Lorg/opensaml/security/x509/X500DNHandler;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitCRLs", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$002", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitCRLs", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitEntityCertificate", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitEntityCertificate", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitEntityCertificateChain", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitEntityCertificateChain", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitSubjectAltNamesAsKeyNames", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$302", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitSubjectAltNamesAsKeyNames", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitSubjectCNAsKeyName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$402", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitSubjectCNAsKeyName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitSubjectDNAsKeyName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$502", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitSubjectDNAsKeyName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509IssuerSerial", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$602", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509IssuerSerial", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509SKI", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$702", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509SKI", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509Digest", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$802", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509Digest", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x509DigestAlgorithmURI", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$902", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x509DigestAlgorithmURI", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1000", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509SubjectName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1002", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "emitX509SubjectName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1100", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "subjectAltNames", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1200", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Lorg/opensaml/security/x509/X500DNHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1202", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Lorg/opensaml/security/x509/X500DNHandler;)Lorg/opensaml/security/x509/X500DNHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500DNHandler", "Lorg/opensaml/security/x509/X500DNHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1300", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500SubjectDNFormat", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1302", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500SubjectDNFormat", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1400", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500IssuerDNFormat", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1402", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "x500IssuerDNFormat", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
