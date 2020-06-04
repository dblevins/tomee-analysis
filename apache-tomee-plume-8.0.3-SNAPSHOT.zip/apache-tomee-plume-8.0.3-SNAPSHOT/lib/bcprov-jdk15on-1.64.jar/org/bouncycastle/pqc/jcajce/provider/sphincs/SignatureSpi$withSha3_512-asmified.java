package asm.org.bouncycastle.pqc.jcajce.provider.sphincs;
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
public class SignatureSpi$withSha3_512Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/jcajce/provider/sphincs/SignatureSpi$withSha3_512", null, "org/bouncycastle/pqc/jcajce/provider/sphincs/SignatureSpi", null);

classWriter.visitInnerClass("org/bouncycastle/pqc/jcajce/provider/sphincs/SignatureSpi$withSha3_512", "org/bouncycastle/pqc/jcajce/provider/sphincs/SignatureSpi", "withSha3_512", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHA3Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHA3Digest", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_sha3_256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHA3Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHA3Digest", "<init>", "(I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/SHA3Digest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/SHA3Digest", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer", "<init>", "(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/jcajce/provider/sphincs/SignatureSpi", "<init>", "(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
