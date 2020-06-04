package asm.org.bouncycastle.pqc.crypto.util;
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
public class PublicKeyFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/util/PublicKeyFactory$NHConverter", "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "NHConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/util/PublicKeyFactory$QTeslaConverter", "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "QTeslaConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/util/PublicKeyFactory$SPHINCSConverter", "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "SPHINCSConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter", "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "SubjectPublicKeyInfoConverter", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/util/PublicKeyFactory$XMSSConverter", "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "XMSSConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/util/PublicKeyFactory$XMSSMTConverter", "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "XMSSMTConverter", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/util/PublicKeyFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "converters", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createKey", "([B)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/ASN1Primitive", "fromByteArray", "([B)Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/SubjectPublicKeyInfo", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "createKey", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createKey", "(Ljava/io/InputStream;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/asn1/ASN1InputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/asn1/ASN1InputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/ASN1InputStream", "readObject", "()Lorg/bouncycastle/asn1/ASN1Primitive;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/asn1/x509/SubjectPublicKeyInfo", "getInstance", "(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "createKey", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createKey", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "createKey", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;Ljava/lang/Object;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createKey", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;Ljava/lang/Object;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/SubjectPublicKeyInfo", "getAlgorithm", "()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getAlgorithm", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$SubjectPublicKeyInfoConverter", "getPublicKeyParameters", "(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;Ljava/lang/Object;)Lorg/bouncycastle/crypto/params/AsymmetricKeyParameter;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("algorithm identifier in public key not recognised: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/asn1/x509/AlgorithmIdentifier", "getAlgorithm", "()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "qTESLA_p_I", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$QTeslaConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$QTeslaConverter", "<init>", "(Lorg/bouncycastle/pqc/crypto/util/PublicKeyFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "qTESLA_p_III", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$QTeslaConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$QTeslaConverter", "<init>", "(Lorg/bouncycastle/pqc/crypto/util/PublicKeyFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "sphincs256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$SPHINCSConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$SPHINCSConverter", "<init>", "(Lorg/bouncycastle/pqc/crypto/util/PublicKeyFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "newHope", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$NHConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$NHConverter", "<init>", "(Lorg/bouncycastle/pqc/crypto/util/PublicKeyFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "xmss", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$XMSSConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$XMSSConverter", "<init>", "(Lorg/bouncycastle/pqc/crypto/util/PublicKeyFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory", "converters", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "xmss_mt", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$XMSSMTConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/crypto/util/PublicKeyFactory$XMSSMTConverter", "<init>", "(Lorg/bouncycastle/pqc/crypto/util/PublicKeyFactory$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
