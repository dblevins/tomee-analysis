package asm.org.bouncycastle.pqc.jcajce.provider.qtesla;
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
public class DigestUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/pqc/jcajce/provider/qtesla/DigestUtil", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "getDigest", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/crypto/Digest;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHA256Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHA256Digest", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha512", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHA512Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHA512Digest", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_shake128", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHAKEDigest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHAKEDigest", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_shake256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "equals", "(Lorg/bouncycastle/asn1/ASN1Primitive;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHAKEDigest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHAKEDigest", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("unrecognized digest OID: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDigestResult", "(Lorg/bouncycastle/crypto/Digest;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/jcajce/provider/qtesla/DigestUtil", "getDigestSize", "(Lorg/bouncycastle/crypto/Digest;)I", false);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/Xof");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/Xof");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Xof", "doFinal", "([BII)I", true);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "doFinal", "([BI)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getDigestSize", "(Lorg/bouncycastle/crypto/Digest;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/crypto/Xof");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/crypto/Digest", "getDigestSize", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
