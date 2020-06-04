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
public class PrincipalUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jce/PrincipalUtil", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIssuerX509Principal", "(Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/jce/X509Principal;", null, new String[] { "java/security/cert/CertificateEncodingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getTBSCertificate", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Primitive", "fromByteArray", "([B)Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/TBSCertificateStructure", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jce/X509Principal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/TBSCertificateStructure", "getIssuer", "()Lorg/bouncycastle/asn1/x500/X500Name;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/X509Name", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509Principal", "<init>", "(Lorg/bouncycastle/asn1/x509/X509Name;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/cert/CertificateEncodingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/cert/CertificateEncodingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSubjectX509Principal", "(Ljava/security/cert/X509Certificate;)Lorg/bouncycastle/jce/X509Principal;", null, new String[] { "java/security/cert/CertificateEncodingException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getTBSCertificate", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Primitive", "fromByteArray", "([B)Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/TBSCertificateStructure", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertificateStructure;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jce/X509Principal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/TBSCertificateStructure", "getSubject", "()Lorg/bouncycastle/asn1/x500/X500Name;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/X509Name", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509Principal", "<init>", "(Lorg/bouncycastle/asn1/x509/X509Name;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/cert/CertificateEncodingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/cert/CertificateEncodingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIssuerX509Principal", "(Ljava/security/cert/X509CRL;)Lorg/bouncycastle/jce/X509Principal;", null, new String[] { "java/security/cert/CRLException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509CRL", "getTBSCertList", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Primitive", "fromByteArray", "([B)Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/TBSCertList", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertList;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jce/X509Principal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/TBSCertList", "getIssuer", "()Lorg/bouncycastle/asn1/x500/X500Name;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/X509Name", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/X509Name;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jce/X509Principal", "<init>", "(Lorg/bouncycastle/asn1/x509/X509Name;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/security/cert/CRLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/IOException", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/cert/CRLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
