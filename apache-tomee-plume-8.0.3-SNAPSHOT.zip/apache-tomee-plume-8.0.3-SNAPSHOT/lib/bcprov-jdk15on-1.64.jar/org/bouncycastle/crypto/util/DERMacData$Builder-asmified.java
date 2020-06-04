package asm.org.bouncycastle.crypto.util;
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
public class DERMacData$BuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/crypto/util/DERMacData$Builder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/DERMacData$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/DERMacData$Builder", "org/bouncycastle/crypto/util/DERMacData", "Builder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/crypto/util/DERMacData$Type", "org/bouncycastle/crypto/util/DERMacData", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Lorg/bouncycastle/crypto/util/DERMacData$Type;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "idU", "Lorg/bouncycastle/asn1/ASN1OctetString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "idV", "Lorg/bouncycastle/asn1/ASN1OctetString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ephemDataU", "Lorg/bouncycastle/asn1/ASN1OctetString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ephemDataV", "Lorg/bouncycastle/asn1/ASN1OctetString;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "text", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/crypto/util/DERMacData$Type;[B[B[B[B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "type", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "getOctetString", "([B)Lorg/bouncycastle/asn1/ASN1OctetString;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "idU", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "getOctetString", "([B)Lorg/bouncycastle/asn1/ASN1OctetString;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "idV", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "getOctetString", "([B)Lorg/bouncycastle/asn1/ASN1OctetString;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "ephemDataU", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "getOctetString", "([B)Lorg/bouncycastle/asn1/ASN1OctetString;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "ephemDataV", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withText", "([B)Lorg/bouncycastle/crypto/util/DERMacData$Builder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERTaggedObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "getOctetString", "([B)Lorg/bouncycastle/asn1/ASN1OctetString;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERTaggedObject", "<init>", "(ZILorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "text", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lorg/bouncycastle/crypto/util/DERMacData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/util/DERMacData$1", "$SwitchMap$org$bouncycastle$crypto$util$DERMacData$Type", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "type", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/DERMacData$Type", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTableSwitchInsn(1, 4, label2, new Label[] { label0, label0, label1, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/DERMacData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "type", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/DERMacData$Type", "getHeader", "()[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "idU", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "idV", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "ephemDataU", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "ephemDataV", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "text", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData$Builder", "concatenate", "([B[B[B[B[B[B)[B", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData", "<init>", "([BLorg/bouncycastle/crypto/util/DERMacData$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/util/DERMacData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "type", "Lorg/bouncycastle/crypto/util/DERMacData$Type;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/crypto/util/DERMacData$Type", "getHeader", "()[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "idV", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "idU", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "ephemDataV", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "ephemDataU", "Lorg/bouncycastle/asn1/ASN1OctetString;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/crypto/util/DerUtil", "toByteArray", "(Lorg/bouncycastle/asn1/ASN1Primitive;)[B", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/util/DERMacData$Builder", "text", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData$Builder", "concatenate", "([B[B[B[B[B[B)[B", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/util/DERMacData", "<init>", "([BLorg/bouncycastle/crypto/util/DERMacData$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unknown type encountered in build");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(9, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "concatenate", "([B[B[B[B[B[B)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "concatenate", "([B[B[B)[B", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "concatenate", "([B[B[B)[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/Arrays", "concatenate", "([B[B)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
