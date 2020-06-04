package asm.org.bouncycastle.asn1.ocsp;
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
public class OCSPObjectIdentifiersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_basic", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_nonce", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_crl", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_response", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_nocheck", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_archive_cutoff", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_service_locator", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_pref_sig_algs", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix_ocsp_extended_revoke", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_basic", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1.2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_nonce", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1.3");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_crl", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1.4");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_response", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1.5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_nocheck", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1.6");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_archive_cutoff", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.48.1.7");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_service_locator", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_pref_sig_algs", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("9");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/ocsp/OCSPObjectIdentifiers", "id_pkix_ocsp_extended_revoke", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
