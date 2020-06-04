package asm.org.bouncycastle.asn1.dvcs;
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
public class DVCSRequestInformationBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "version", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "service", "Lorg/bouncycastle/asn1/dvcs/ServiceType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nonce", "Ljava/math/BigInteger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requestTime", "Lorg/bouncycastle/asn1/dvcs/DVCSTime;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requester", "Lorg/bouncycastle/asn1/x509/GeneralNames;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requestPolicy", "Lorg/bouncycastle/asn1/x509/PolicyInformation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dvcs", "Lorg/bouncycastle/asn1/x509/GeneralNames;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "dataLocations", "Lorg/bouncycastle/asn1/x509/GeneralNames;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "extensions", "Lorg/bouncycastle/asn1/x509/Extensions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_VERSION", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_REQUESTER", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_REQUEST_POLICY", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_DVCS", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_DATA_LOCATIONS", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_EXTENSIONS", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/dvcs/ServiceType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "version", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "service", "Lorg/bouncycastle/asn1/dvcs/ServiceType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "version", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getService", "()Lorg/bouncycastle/asn1/dvcs/ServiceType;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "service", "Lorg/bouncycastle/asn1/dvcs/ServiceType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getVersion", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "version", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getNonce", "()Ljava/math/BigInteger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "nonce", "Ljava/math/BigInteger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getRequestTime", "()Lorg/bouncycastle/asn1/dvcs/DVCSTime;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requestTime", "Lorg/bouncycastle/asn1/dvcs/DVCSTime;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getRequestPolicy", "()Lorg/bouncycastle/asn1/x509/PolicyInformation;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requestPolicy", "Lorg/bouncycastle/asn1/x509/PolicyInformation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getDVCS", "()Lorg/bouncycastle/asn1/x509/GeneralNames;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "dvcs", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getDataLocations", "()Lorg/bouncycastle/asn1/x509/GeneralNames;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "dataLocations", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1EncodableVector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1EncodableVector", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "version", "I");
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "version", "I");
methodVisitor.visitInsn(I2L);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "service", "Lorg/bouncycastle/asn1/dvcs/ServiceType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "nonce", "Ljava/math/BigInteger;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1Integer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "nonce", "Ljava/math/BigInteger;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1Integer", "<init>", "(Ljava/math/BigInteger;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requestTime", "Lorg/bouncycastle/asn1/dvcs/DVCSTime;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requestTime", "Lorg/bouncycastle/asn1/dvcs/DVCSTime;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/asn1/ASN1Encodable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requester", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requestPolicy", "Lorg/bouncycastle/asn1/x509/PolicyInformation;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "dvcs", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "dataLocations", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "extensions", "Lorg/bouncycastle/asn1/x509/Extensions;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERTaggedObject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERTaggedObject", "<init>", "(ZILorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1EncodableVector", "add", "(Lorg/bouncycastle/asn1/ASN1Encodable;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/DERSequence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/DERSequence", "<init>", "(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setVersion", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cannot change version in existing DVCSRequestInformation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "version", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNonce", "(Ljava/math/BigInteger;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getNonce", "()Ljava/math/BigInteger;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "nonce", "Ljava/math/BigInteger;");
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformation", "getNonce", "()Ljava/math/BigInteger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/math/BigInteger", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/BigIntegers", "asUnsignedByteArray", "(Ljava/math/BigInteger;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/math/BigInteger");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/math/BigInteger", "<init>", "([B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "nonce", "Ljava/math/BigInteger;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "nonce", "Ljava/math/BigInteger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequestTime", "(Lorg/bouncycastle/asn1/dvcs/DVCSTime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cannot change request time in existing DVCSRequestInformation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requestTime", "Lorg/bouncycastle/asn1/dvcs/DVCSTime;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequester", "(Lorg/bouncycastle/asn1/x509/GeneralName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/GeneralNames");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/GeneralNames", "<init>", "(Lorg/bouncycastle/asn1/x509/GeneralName;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "setRequester", "(Lorg/bouncycastle/asn1/x509/GeneralNames;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequester", "(Lorg/bouncycastle/asn1/x509/GeneralNames;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requester", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequestPolicy", "(Lorg/bouncycastle/asn1/x509/PolicyInformation;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cannot change request policy in existing DVCSRequestInformation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "requestPolicy", "Lorg/bouncycastle/asn1/x509/PolicyInformation;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDVCS", "(Lorg/bouncycastle/asn1/x509/GeneralName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/GeneralNames");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/GeneralNames", "<init>", "(Lorg/bouncycastle/asn1/x509/GeneralName;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "setDVCS", "(Lorg/bouncycastle/asn1/x509/GeneralNames;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDVCS", "(Lorg/bouncycastle/asn1/x509/GeneralNames;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "dvcs", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataLocations", "(Lorg/bouncycastle/asn1/x509/GeneralName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/x509/GeneralNames");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/x509/GeneralNames", "<init>", "(Lorg/bouncycastle/asn1/x509/GeneralName;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "setDataLocations", "(Lorg/bouncycastle/asn1/x509/GeneralNames;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataLocations", "(Lorg/bouncycastle/asn1/x509/GeneralNames;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "dataLocations", "Lorg/bouncycastle/asn1/x509/GeneralNames;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExtensions", "(Lorg/bouncycastle/asn1/x509/Extensions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "initialInfo", "Lorg/bouncycastle/asn1/dvcs/DVCSRequestInformation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cannot change extensions in existing DVCSRequestInformation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/asn1/dvcs/DVCSRequestInformationBuilder", "extensions", "Lorg/bouncycastle/asn1/x509/Extensions;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
