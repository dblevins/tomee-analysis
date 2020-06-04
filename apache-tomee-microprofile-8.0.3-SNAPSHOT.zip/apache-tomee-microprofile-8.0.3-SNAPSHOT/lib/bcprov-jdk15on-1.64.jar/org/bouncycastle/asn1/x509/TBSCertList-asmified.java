package asm.org.bouncycastle.asn1.x509;
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
public class TBSCertListDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/x509/TBSCertList", null, "org/bouncycastle/asn1/ASN1Object", null);

classWriter.visitInnerClass("org/bouncycastle/asn1/x509/TBSCertList$CRLEntry", "org/bouncycastle/asn1/x509/TBSCertList", "CRLEntry", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/asn1/x509/TBSCertList$EmptyEnumeration", "org/bouncycastle/asn1/x509/TBSCertList", "EmptyEnumeration", ACC_PRIVATE);

classWriter.visitInnerClass("org/bouncycastle/asn1/x509/TBSCertList$RevokedCertificatesEnumeration", "org/bouncycastle/asn1/x509/TBSCertList", "RevokedCertificatesEnumeration", ACC_PRIVATE);

classWriter.visitInnerClass("org/bouncycastle/asn1/x509/TBSCertList$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(0, "version", "Lorg/bouncycastle/asn1/ASN1Integer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "signature", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "issuer", "Lorg/bouncycastle/asn1/x500/X500Name;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "thisUpdate", "Lorg/bouncycastle/asn1/x509/Time;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextUpdate", "Lorg/bouncycastle/asn1/x509/Time;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "crlExtensions", "Lorg/bouncycastle/asn1/x509/Extensions;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/x509/TBSCertList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/TBSCertList", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertList;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/x509/TBSCertList");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/x509/TBSCertList");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/TBSCertList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/TBSCertList", "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
methodVisitor.visitInsn(ICONST_3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
methodVisitor.visitIntInsn(BIPUSH, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Bad sequence size: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1Integer");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Integer", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Integer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "signature", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x500/X500Name", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x500/X500Name;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "issuer", "Lorg/bouncycastle/asn1/x500/X500Name;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/Time", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Time;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "thisUpdate", "Lorg/bouncycastle/asn1/x509/Time;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1UTCTime");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1GeneralizedTime");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/x509/Time");
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/Time", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Time;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "nextUpdate", "Lorg/bouncycastle/asn1/x509/Time;");
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1TaggedObject");
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1TaggedObject");
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1TaggedObject");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Sequence", "getInstance", "(Lorg/bouncycastle/asn1/ASN1TaggedObject;Z)Lorg/bouncycastle/asn1/ASN1Sequence;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/Extensions", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/Extensions;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "crlExtensions", "Lorg/bouncycastle/asn1/x509/Extensions;");
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersionNumber", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Integer", "intValueExact", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersion", "()Lorg/bouncycastle/asn1/ASN1Integer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSignature", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "signature", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIssuer", "()Lorg/bouncycastle/asn1/x500/X500Name;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "issuer", "Lorg/bouncycastle/asn1/x500/X500Name;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getThisUpdate", "()Lorg/bouncycastle/asn1/x509/Time;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "thisUpdate", "Lorg/bouncycastle/asn1/x509/Time;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNextUpdate", "()Lorg/bouncycastle/asn1/x509/Time;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "nextUpdate", "Lorg/bouncycastle/asn1/x509/Time;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRevokedCertificates", "()[Lorg/bouncycastle/asn1/x509/TBSCertList$CRLEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/asn1/x509/TBSCertList$CRLEntry");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/asn1/x509/TBSCertList$CRLEntry");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/TBSCertList$CRLEntry", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/TBSCertList$CRLEntry;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRevokedCertificateEnumeration", "()Ljava/util/Enumeration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/TBSCertList$EmptyEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/TBSCertList$EmptyEnumeration", "<init>", "(Lorg/bouncycastle/asn1/x509/TBSCertList;Lorg/bouncycastle/asn1/x509/TBSCertList$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/TBSCertList$RevokedCertificatesEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjects", "()Ljava/util/Enumeration;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/TBSCertList$RevokedCertificatesEnumeration", "<init>", "(Lorg/bouncycastle/asn1/x509/TBSCertList;Ljava/util/Enumeration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExtensions", "()Lorg/bouncycastle/asn1/x509/Extensions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "crlExtensions", "Lorg/bouncycastle/asn1/x509/Extensions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1EncodableVector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1EncodableVector", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "version", "Lorg/bouncycastle/asn1/ASN1Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "signature", "Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "issuer", "Lorg/bouncycastle/asn1/x500/X500Name;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "thisUpdate", "Lorg/bouncycastle/asn1/x509/Time;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "nextUpdate", "Lorg/bouncycastle/asn1/x509/Time;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "nextUpdate", "Lorg/bouncycastle/asn1/x509/Time;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "revokedCertificates", "Lorg/bouncycastle/asn1/ASN1Sequence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "crlExtensions", "Lorg/bouncycastle/asn1/x509/Extensions;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERTaggedObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/x509/TBSCertList", "crlExtensions", "Lorg/bouncycastle/asn1/x509/Extensions;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERTaggedObject", "<init>", "(ILorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERSequence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERSequence", "<init>", "(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
