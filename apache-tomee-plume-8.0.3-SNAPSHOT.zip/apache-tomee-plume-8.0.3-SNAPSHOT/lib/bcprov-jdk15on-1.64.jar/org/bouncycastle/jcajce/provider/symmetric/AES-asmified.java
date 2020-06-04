package asm.org.bouncycastle.jcajce.provider.symmetric;
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
public class AESDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/AES", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AESCCMMAC", "org/bouncycastle/jcajce/provider/symmetric/AES", "AESCCMMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AESCMAC", "org/bouncycastle/jcajce/provider/symmetric/AES", "AESCMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AESGMAC", "org/bouncycastle/jcajce/provider/symmetric/AES", "AESGMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/AES", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AlgParamGenCCM", "org/bouncycastle/jcajce/provider/symmetric/AES", "AlgParamGenCCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AlgParamGenGCM", "org/bouncycastle/jcajce/provider/symmetric/AES", "AlgParamGenGCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AlgParams", "org/bouncycastle/jcajce/provider/symmetric/AES", "AlgParams", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AlgParamsCCM", "org/bouncycastle/jcajce/provider/symmetric/AES", "AlgParamsCCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$AlgParamsGCM", "org/bouncycastle/jcajce/provider/symmetric/AES", "AlgParamsGCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$CBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "CBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$CCM", "org/bouncycastle/jcajce/provider/symmetric/AES", "CCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$CFB", "org/bouncycastle/jcajce/provider/symmetric/AES", "CFB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$ECB", "org/bouncycastle/jcajce/provider/symmetric/AES", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$GCM", "org/bouncycastle/jcajce/provider/symmetric/AES", "GCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/AES", "KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$KeyGen", "org/bouncycastle/jcajce/provider/symmetric/AES", "KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$KeyGen128", "org/bouncycastle/jcajce/provider/symmetric/AES", "KeyGen128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$KeyGen192", "org/bouncycastle/jcajce/provider/symmetric/AES", "KeyGen192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$KeyGen256", "org/bouncycastle/jcajce/provider/symmetric/AES", "KeyGen256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$Mappings", "org/bouncycastle/jcajce/provider/symmetric/AES", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$OFB", "org/bouncycastle/jcajce/provider/symmetric/AES", "OFB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithAESCBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithAESCBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithMD5And128BitAESCBCOpenSSL", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithMD5And128BitAESCBCOpenSSL", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithMD5And192BitAESCBCOpenSSL", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithMD5And192BitAESCBCOpenSSL", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithMD5And256BitAESCBCOpenSSL", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithMD5And256BitAESCBCOpenSSL", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA1AESCBC128", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA1AESCBC128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA1AESCBC192", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA1AESCBC192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA1AESCBC256", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA1AESCBC256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256AESCBC128", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA256AESCBC128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256AESCBC192", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA256AESCBC192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256AESCBC256", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA256AESCBC256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256And128BitAESBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA256And128BitAESBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256And192BitAESBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA256And192BitAESBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256And256BitAESBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA256And256BitAESBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHAAnd128BitAESBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHAAnd128BitAESBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHAAnd192BitAESBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHAAnd192BitAESBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHAAnd256BitAESBC", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHAAnd256BitAESBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$Poly1305", "org/bouncycastle/jcajce/provider/symmetric/AES", "Poly1305", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$Poly1305KeyGen", "org/bouncycastle/jcajce/provider/symmetric/AES", "Poly1305KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$RFC3211Wrap", "org/bouncycastle/jcajce/provider/symmetric/AES", "RFC3211Wrap", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$RFC5649Wrap", "org/bouncycastle/jcajce/provider/symmetric/AES", "RFC5649Wrap", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$Wrap", "org/bouncycastle/jcajce/provider/symmetric/AES", "Wrap", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$WrapPad", "org/bouncycastle/jcajce/provider/symmetric/AES", "WrapPad", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "generalAesAttributes", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/provider/symmetric/AES", "generalAesAttributes", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/jcajce/provider/symmetric/AES", "generalAesAttributes", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/provider/symmetric/AES", "generalAesAttributes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("SupportedKeyClasses");
methodVisitor.visitLdcInsn("javax.crypto.SecretKey");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/jcajce/provider/symmetric/AES", "generalAesAttributes", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("SupportedKeyFormats");
methodVisitor.visitLdcInsn("RAW");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
