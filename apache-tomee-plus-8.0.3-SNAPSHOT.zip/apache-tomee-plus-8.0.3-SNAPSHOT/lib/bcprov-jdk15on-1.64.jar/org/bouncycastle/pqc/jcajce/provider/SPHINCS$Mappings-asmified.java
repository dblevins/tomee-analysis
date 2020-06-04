package asm.org.bouncycastle.pqc.jcajce.provider;
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
public class SPHINCS$MappingsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/jcajce/provider/SPHINCS$Mappings", null, "org/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider", null);

classWriter.visitInnerClass("org/bouncycastle/pqc/jcajce/provider/SPHINCS$Mappings", "org/bouncycastle/pqc/jcajce/provider/SPHINCS", "Mappings", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "configure", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("KeyFactory.SPHINCS256");
methodVisitor.visitLdcInsn("org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("KeyPairGenerator.SPHINCS256");
methodVisitor.visitLdcInsn("org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyPairGeneratorSpi");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("SHA512");
methodVisitor.visitLdcInsn("SPHINCS256");
methodVisitor.visitLdcInsn("org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi$withSha512");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "sphincs256_with_SHA512", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/SPHINCS$Mappings", "addSignatureAlgorithm", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("SHA3-512");
methodVisitor.visitLdcInsn("SPHINCS256");
methodVisitor.visitLdcInsn("org.bouncycastle.pqc.jcajce.provider.sphincs.SignatureSpi$withSha3_512");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "sphincs256_with_SHA3_512", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/SPHINCS$Mappings", "addSignatureAlgorithm", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/pqc/jcajce/provider/sphincs/Sphincs256KeyFactorySpi");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/pqc/jcajce/provider/sphincs/Sphincs256KeyFactorySpi", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "sphincs256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("SPHINCS256");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/SPHINCS$Mappings", "registerOid", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/pqc/asn1/PQCObjectIdentifiers", "sphincs256", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("SPHINCS256");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/jcajce/provider/SPHINCS$Mappings", "registerOidAlgorithmParameters", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
