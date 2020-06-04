package asm.org.bouncycastle.jcajce.provider.asymmetric;
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
public class DSTU4145$MappingsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", null, "org/bouncycastle/jcajce/provider/util/AsymmetricAlgorithmProvider", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145", "Mappings", ACC_PUBLIC | ACC_STATIC);

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
methodVisitor.visitLdcInsn("KeyFactory.DSTU4145");
methodVisitor.visitLdcInsn("org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Alg.Alias.KeyFactory.DSTU-4145-2002");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Alg.Alias.KeyFactory.DSTU4145-3410");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ua/UAObjectIdentifiers", "dstu4145le", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/dstu/KeyFactorySpi");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/KeyFactorySpi", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", "registerOid", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ua/UAObjectIdentifiers", "dstu4145le", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", "registerOidAlgorithmParameters", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ua/UAObjectIdentifiers", "dstu4145be", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/asymmetric/dstu/KeyFactorySpi");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/asymmetric/dstu/KeyFactorySpi", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", "registerOid", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/util/AsymmetricKeyInfoConverter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ua/UAObjectIdentifiers", "dstu4145be", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", "registerOidAlgorithmParameters", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("KeyPairGenerator.DSTU4145");
methodVisitor.visitLdcInsn("org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyPairGeneratorSpi");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Alg.Alias.KeyPairGenerator.DSTU-4145");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Alg.Alias.KeyPairGenerator.DSTU-4145-2002");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Signature.DSTU4145");
methodVisitor.visitLdcInsn("org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Alg.Alias.Signature.DSTU-4145");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Alg.Alias.Signature.DSTU-4145-2002");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/jcajce/provider/config/ConfigurableProvider", "addAlgorithm", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("GOST3411");
methodVisitor.visitLdcInsn("DSTU4145LE");
methodVisitor.visitLdcInsn("org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpiLe");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ua/UAObjectIdentifiers", "dstu4145le", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", "addSignatureAlgorithm", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("GOST3411");
methodVisitor.visitLdcInsn("DSTU4145");
methodVisitor.visitLdcInsn("org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/asn1/ua/UAObjectIdentifiers", "dstu4145be", "Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/jcajce/provider/asymmetric/DSTU4145$Mappings", "addSignatureAlgorithm", "(Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
