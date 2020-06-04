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
public class CertificationRequestDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/cmc/CertificationRequest", null, "org/bouncycastle/asn1/ASN1Object", null);

classWriter.visitInnerClass("org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "org/bouncycastle/asn1/cmc/CertificationRequest", "CertificationRequestInfo", ACC_PRIVATE);

classWriter.visitInnerClass("org/bouncycastle/asn1/cmc/CertificationRequest$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ZERO", "Lorg/bouncycastle/asn1/ASN1Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "signatureAlgorithm", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "signature", "Lorg/bouncycastle/asn1/DERBitString;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/x500/X500Name;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DERBitString;Lorg/bouncycastle/asn1/ASN1Set;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DERBitString;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "<init>", "(Lorg/bouncycastle/asn1/cmc/CertificationRequest;Lorg/bouncycastle/asn1/x500/X500Name;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/DERBitString;Lorg/bouncycastle/asn1/ASN1Set;Lorg/bouncycastle/asn1/cmc/CertificationRequest$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signatureAlgorithm", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signature", "Lorg/bouncycastle/asn1/DERBitString;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
methodVisitor.visitInsn(ICONST_3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("incorrect sequence size");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "<init>", "(Lorg/bouncycastle/asn1/cmc/CertificationRequest;Lorg/bouncycastle/asn1/ASN1Sequence;Lorg/bouncycastle/asn1/cmc/CertificationRequest$1;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signatureAlgorithm", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/DERBitString", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signature", "Lorg/bouncycastle/asn1/DERBitString;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/cmc/CertificationRequest;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/cmc/CertificationRequest");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/cmc/CertificationRequest");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/cmc/CertificationRequest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/cmc/CertificationRequest", "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersion", "()Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "access$200", "(Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;)Lorg/bouncycastle/asn1/ASN1Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "getValue", "()Ljava/math/BigInteger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubject", "()Lorg/bouncycastle/asn1/x500/X500Name;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "access$300", "(Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;)Lorg/bouncycastle/asn1/x500/X500Name;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "()Lorg/bouncycastle/asn1/ASN1Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "access$400", "(Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;)Lorg/bouncycastle/asn1/ASN1Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubjectPublicKeyAlgorithm", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "access$500", "(Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubjectPublicKey", "()Lorg/bouncycastle/asn1/DERBitString;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo", "access$500", "(Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/DERBitString", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/DERBitString;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parsePublicKey", "()Lorg/bouncycastle/asn1/ASN1Primitive;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/cmc/CertificationRequest", "getSubjectPublicKey", "()Lorg/bouncycastle/asn1/DERBitString;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/DERBitString", "getOctets", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Primitive", "fromByteArray", "([B)Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSignatureAlgorithm", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signatureAlgorithm", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSignature", "()Lorg/bouncycastle/asn1/DERBitString;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signature", "Lorg/bouncycastle/asn1/DERBitString;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1EncodableVector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1EncodableVector", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "certificationRequestInfo", "Lorg/bouncycastle/asn1/cmc/CertificationRequest$CertificationRequestInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signatureAlgorithm", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/cmc/CertificationRequest", "signature", "Lorg/bouncycastle/asn1/DERBitString;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERSequence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERSequence", "<init>", "(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "()Lorg/bouncycastle/asn1/ASN1Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/cmc/CertificationRequest", "ZERO", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/cmc/CertificationRequest", "ZERO", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
