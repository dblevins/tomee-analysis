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
public class X509KeyInfoGeneratorFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", null, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", null);

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "X509Options", ACC_PROTECTED);

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509KeyInfoGenerator", "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "X509KeyInfoGenerator", ACC_PUBLIC);

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "BasicOptions", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "getOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCredentialType", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Lorg/opensaml/security/credential/Credential;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/x509/X509Credential;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handles", "(Lorg/opensaml/security/credential/Credential;)Z", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/security/x509/X509Credential");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "()Lorg/opensaml/xmlsec/keyinfo/KeyInfoGenerator;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509KeyInfoGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509KeyInfoGenerator", "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory;Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitCRLs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$000", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitCRLs", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$002", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitEntityCertificate", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$100", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitEntityCertificate", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$102", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitEntityCertificateChain", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$200", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitEntityCertificateChain", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$202", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitSubjectAltNamesAsKeyNames", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$300", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitSubjectAltNamesAsKeyNames", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$302", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitSubjectCNAsKeyName", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$400", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitSubjectCNAsKeyName", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$402", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitSubjectDNAsKeyName", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$500", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitSubjectDNAsKeyName", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$502", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitX509IssuerSerial", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$600", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitX509IssuerSerial", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$602", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitX509SKI", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$700", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitX509SKI", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$702", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitX509Digest", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$800", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitX509Digest", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$802", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX509DigestAlgorithmURI", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$900", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setX509DigestAlgorithmURI", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Algorithm cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$902", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitX509SubjectName", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1000", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitX509SubjectName", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1002", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubjectAltNames", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/Integer;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1100", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX500DNHandler", "()Lorg/opensaml/security/x509/X500DNHandler;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1200", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Lorg/opensaml/security/x509/X500DNHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setX500DNHandler", "(Lorg/opensaml/security/x509/X500DNHandler;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("X500DNHandler cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/x509/X500DNHandler");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1202", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Lorg/opensaml/security/x509/X500DNHandler;)Lorg/opensaml/security/x509/X500DNHandler;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX500SubjectDNFormat", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1300", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setX500SubjectDNFormat", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1302", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX500IssuerDNFormat", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1400", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setX500IssuerDNFormat", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "access$1402", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options", "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "getOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "getOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "newOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory", "newOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/X509KeyInfoGeneratorFactory$X509Options;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
