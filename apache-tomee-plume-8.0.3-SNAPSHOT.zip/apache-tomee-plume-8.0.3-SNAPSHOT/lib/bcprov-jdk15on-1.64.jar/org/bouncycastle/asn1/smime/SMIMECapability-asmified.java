package asm.org.bouncycastle.asn1.smime;
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
public class SMIMECapabilityDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/smime/SMIMECapability", null, "org/bouncycastle/asn1/ASN1Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "preferSignedData", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "canNotDecryptAny", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "sMIMECapabilitiesVersions", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "dES_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "dES_EDE3_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "rC2_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "aES128_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "aES192_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "aES256_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "capabilityID", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parameters", "Lorg/bouncycastle/asn1/ASN1Encodable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "capabilityID", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1Sequence", "getObjectAt", "(I)Lorg/bouncycastle/asn1/ASN1Encodable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1Primitive");
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "parameters", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "capabilityID", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "parameters", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/smime/SMIMECapability;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/smime/SMIMECapability");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/smime/SMIMECapability");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/bouncycastle/asn1/ASN1Sequence");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/smime/SMIMECapability");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/asn1/ASN1Sequence");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/smime/SMIMECapability", "<init>", "(Lorg/bouncycastle/asn1/ASN1Sequence;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid SMIMECapability");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCapabilityID", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "capabilityID", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameters", "()Lorg/bouncycastle/asn1/ASN1Encodable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "parameters", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toASN1Primitive", "()Lorg/bouncycastle/asn1/ASN1Primitive;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1EncodableVector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1EncodableVector", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "capabilityID", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "parameters", "Lorg/bouncycastle/asn1/ASN1Encodable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/smime/SMIMECapability", "parameters", "Lorg/bouncycastle/asn1/ASN1Encodable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERSequence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERSequence", "<init>", "(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "preferSignedData", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "preferSignedData", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "canNotDecryptAny", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "canNotDecryptAny", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "sMIMECapabilitiesVersions", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "sMIMECapabilitiesVersions", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1ObjectIdentifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1.3.14.3.2.7");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1ObjectIdentifier", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "dES_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "des_EDE3_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "dES_EDE3_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/pkcs/PKCSObjectIdentifiers", "RC2_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "rC2_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_aes128_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "aES128_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_aes192_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "aES192_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/nist/NISTObjectIdentifiers", "id_aes256_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/asn1/smime/SMIMECapability", "aES256_CBC", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
