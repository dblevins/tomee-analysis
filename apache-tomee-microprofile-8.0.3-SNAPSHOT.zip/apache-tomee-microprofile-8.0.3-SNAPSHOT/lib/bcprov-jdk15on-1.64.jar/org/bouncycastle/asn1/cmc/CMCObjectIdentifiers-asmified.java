package asm.org.bouncycastle.asn1.cmc;
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
public class CMCObjectIdentifiersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_pkix", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cct", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_identityProof", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_dataReturn", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_regInfo", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_responseInfo", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_queryPending", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_popLinkRandom", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_popLinkWitness", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_identification", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_transactionId", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_senderNonce", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_recipientNonce", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cct_PKIData", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cct_PKIResponse", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_statusInfo", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_addExtensions", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_encryptedPOP", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_decryptedPOP", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_lraPOPWitness", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_getCert", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_getCRL", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_revokeRequest", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_confirmCertAcceptance", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_statusInfoV2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_trustedAnchors", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_authData", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_batchRequests", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_batchResponses", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_publishCert", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_modCertTemplate", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_controlProcessed", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_identityProofV2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "id_cmc_popLinkWitnessV2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_pkix", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_pkix", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("7");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_pkix", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("12");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cct", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("3");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_identityProof", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("4");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_dataReturn", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("18");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_regInfo", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("19");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_responseInfo", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("21");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_queryPending", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("22");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_popLinkRandom", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("23");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_popLinkWitness", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_identification", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("5");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_transactionId", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("6");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_senderNonce", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("7");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_recipientNonce", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cct", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cct_PKIData", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cct", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("3");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cct_PKIResponse", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_statusInfo", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_addExtensions", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("9");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_encryptedPOP", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("10");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_decryptedPOP", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("11");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_lraPOPWitness", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("15");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_getCert", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("16");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_getCRL", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("17");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_revokeRequest", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("24");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_confirmCertAcceptance", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("25");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_statusInfoV2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("26");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_trustedAnchors", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("27");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_authData", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("28");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_batchRequests", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("29");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_batchResponses", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("30");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_publishCert", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("31");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_modCertTemplate", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("32");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_controlProcessed", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("34");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_identityProofV2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("33");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "branch", "(Ljava/lang/String;)Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CMCObjectIdentifiers", "id_cmc_popLinkWitnessV2", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
