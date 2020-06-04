package asm.org.bouncycastle.jce;
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
public class X509LDAPCertStoreParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jce/X509LDAPCertStoreParameters", null, "java/lang/Object", new String[] { "org/bouncycastle/x509/X509StoreParameters", "java/security/cert/CertStoreParameters" });

classWriter.visitInnerClass("org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "org/bouncycastle/jce/X509LDAPCertStoreParameters", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jce/X509LDAPCertStoreParameters$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapURL", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "baseDN", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "userCertificateAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cACertificateAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "crossCertificateAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateRevocationListAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "deltaRevocationListAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "authorityRevocationListAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeCertificateAttributeAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "aACertificateAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeDescriptorCertificateAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeCertificateRevocationListAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeAuthorityRevocationListAttribute", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapUserCertificateAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapCACertificateAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapCrossCertificateAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapCertificateRevocationListAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapDeltaRevocationListAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapAuthorityRevocationListAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapAttributeCertificateAttributeAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapAACertificateAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapAttributeDescriptorCertificateAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapAttributeCertificateRevocationListAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ldapAttributeAuthorityRevocationListAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "userCertificateSubjectAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cACertificateSubjectAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "crossCertificateSubjectAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "certificateRevocationListIssuerAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "deltaRevocationListIssuerAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "authorityRevocationListIssuerAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeCertificateAttributeSubjectAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "aACertificateSubjectAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeDescriptorCertificateSubjectAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeCertificateRevocationListIssuerAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeAuthorityRevocationListIssuerAttributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "searchForSerialNumberIn", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$100", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapURL", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$200", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "baseDN", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$300", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$400", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$500", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$600", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$700", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$800", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$900", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1000", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1100", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1200", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1300", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1400", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapUserCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1500", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1600", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCrossCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1700", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1800", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapDeltaRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$1900", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2000", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateAttributeAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2100", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2200", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeDescriptorCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2300", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2400", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2500", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2600", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2700", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2800", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$2900", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$3000", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$3100", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$3200", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$3300", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$3400", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$3500", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "access$3600", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "searchForSerialNumberIn", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clone", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equal", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/jce/X509LDAPCertStoreParameters");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jce/X509LDAPCertStoreParameters");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapURL", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapURL", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "baseDN", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "baseDN", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapUserCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapUserCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCrossCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCrossCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapDeltaRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapDeltaRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateAttributeAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateAttributeAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeDescriptorCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeDescriptorCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "searchForSerialNumberIn", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "searchForSerialNumberIn", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkField", "(Ljava/lang/Object;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapUserCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCrossCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapDeltaRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateAttributeAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeDescriptorCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "searchForSerialNumberIn", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "addHashCode", "(ILjava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addHashCode", "(ILjava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAACertificateAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAACertificateSubjectAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "aACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAuthorityRevocationListAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeAuthorityRevocationListIssuerAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeAuthorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeCertificateAttributeAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeCertificateAttributeSubjectAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateAttributeSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeCertificateRevocationListAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeCertificateRevocationListIssuerAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeCertificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeDescriptorCertificateAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeDescriptorCertificateSubjectAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "attributeDescriptorCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuthorityRevocationListAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuthorityRevocationListIssuerAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "authorityRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseDN", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "baseDN", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCACertificateAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCACertificateSubjectAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "cACertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateRevocationListAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCertificateRevocationListIssuerAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "certificateRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCrossCertificateAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCrossCertificateSubjectAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "crossCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeltaRevocationListAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDeltaRevocationListIssuerAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "deltaRevocationListIssuerAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapAACertificateAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapAttributeAuthorityRevocationListAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapAttributeCertificateAttributeAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateAttributeAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapAttributeCertificateRevocationListAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapAttributeDescriptorCertificateAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAttributeDescriptorCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapAuthorityRevocationListAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapAuthorityRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapCACertificateAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCACertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapCertificateRevocationListAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCertificateRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapCrossCertificateAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapCrossCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapDeltaRevocationListAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapDeltaRevocationListAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapURL", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapURL", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLdapUserCertificateAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "ldapUserCertificateAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSearchForSerialNumberIn", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "searchForSerialNumberIn", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserCertificateAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserCertificateSubjectAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "userCertificateSubjectAttributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/security/cert/LDAPCertStoreParameters;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("ldap://");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/LDAPCertStoreParameters", "getServerName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/LDAPCertStoreParameters", "getPort", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters$Builder", "build", "()Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509LDAPCertStoreParameters", "<init>", "(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
