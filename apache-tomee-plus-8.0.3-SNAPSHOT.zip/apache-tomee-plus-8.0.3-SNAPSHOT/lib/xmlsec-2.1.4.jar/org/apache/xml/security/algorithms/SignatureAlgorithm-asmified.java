package asm.org.apache.xml.security.algorithms;
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
public class SignatureAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/algorithms/SignatureAlgorithm", null, "org/apache/xml/security/algorithms/Algorithm", null);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureDSA$SHA256", "org/apache/xml/security/algorithms/implementations/SignatureDSA", "SHA256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA1", "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "IntegrityHmacSHA1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSAMD5", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSAMD5", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSARIPEMD160", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSARIPEMD160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA224", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA256", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA384", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA512", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA1MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA1MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA224MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA224MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA256MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA256MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA384MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA384MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA512MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA512MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_224MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA3_224MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_256MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA3_256MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_384MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA3_384MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_512MGF1", "org/apache/xml/security/algorithms/implementations/SignatureBaseRSA", "SignatureRSASHA3_512MGF1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA1", "org/apache/xml/security/algorithms/implementations/SignatureECDSA", "SignatureECDSASHA1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA224", "org/apache/xml/security/algorithms/implementations/SignatureECDSA", "SignatureECDSASHA224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA256", "org/apache/xml/security/algorithms/implementations/SignatureECDSA", "SignatureECDSASHA256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA384", "org/apache/xml/security/algorithms/implementations/SignatureECDSA", "SignatureECDSASHA384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA512", "org/apache/xml/security/algorithms/implementations/SignatureECDSA", "SignatureECDSASHA512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSARIPEMD160", "org/apache/xml/security/algorithms/implementations/SignatureECDSA", "SignatureECDSARIPEMD160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacMD5", "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "IntegrityHmacMD5", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacRIPEMD160", "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "IntegrityHmacRIPEMD160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA224", "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "IntegrityHmacSHA224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA256", "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "IntegrityHmacSHA256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA384", "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "IntegrityHmacSHA384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA512", "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "IntegrityHmacSHA512", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "algorithmHash", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Class<+Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "algorithmURI", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Document;Ljava/lang/String;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/algorithms/Algorithm", "<init>", "(Lorg/w3c/dom/Document;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getSignatureAlgorithmSpi", "(Ljava/lang/String;)Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineGetContextFromElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Document;Ljava/lang/String;I)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/algorithms/Algorithm", "<init>", "(Lorg/w3c/dom/Document;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getSignatureAlgorithmSpi", "(Ljava/lang/String;)Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineGetContextFromElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineSetHMACOutputLength", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/algorithms/implementations/IntegrityHmac");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/implementations/IntegrityHmac", "engineAddContextToElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Element;Ljava/lang/String;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/algorithms/SignatureAlgorithm", "<init>", "(Lorg/w3c/dom/Element;Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Element;Ljava/lang/String;Z)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/algorithms/Algorithm", "<init>", "(Lorg/w3c/dom/Element;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getURI", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmURI", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn("Id");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttributeNodeNS", "(Ljava/lang/String;Ljava/lang/String;)Lorg/w3c/dom/Attr;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "setIdAttributeNode", "(Lorg/w3c/dom/Attr;Z)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/xml/security/algorithms/SignatureAlgorithm", "org/w3c/dom/Element", "java/lang/String", Opcodes.INTEGER, "org/w3c/dom/Attr"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmURI", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-md5");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmURI", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmURI", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("signature.signatureAlgorithm");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmURI", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getSignatureAlgorithmSpi", "(Ljava/lang/String;)Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineGetContextFromElement", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getSignatureAlgorithmSpi", "(Ljava/lang/String;)Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalAccessException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InstantiationException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NullPointerException");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Create URI \"{}\" class \"{}\"");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("algorithms.NoSuchAlgorithmNoEx");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"java/lang/String"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Exception", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("algorithms.NoSuchAlgorithm");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureException", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sign", "()[B", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineSign", "()[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJCEAlgorithmString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineGetJCEAlgorithmString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJCEProviderName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineGetJCEProviderName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "([B)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineUpdate", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "(B)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineUpdate", "(B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "update", "([BII)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineUpdate", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initSign", "(Ljava/security/Key;)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineInitSign", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initSign", "(Ljava/security/Key;Ljava/security/SecureRandom;)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineInitSign", "(Ljava/security/Key;Ljava/security/SecureRandom;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initSign", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineInitSign", "(Ljava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParameter", "(Ljava/security/spec/AlgorithmParameterSpec;)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineSetParameter", "(Ljava/security/spec/AlgorithmParameterSpec;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initVerify", "(Ljava/security/Key;)V", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineInitVerify", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "([B)Z", null, new String[] { "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/algorithms/SignatureAlgorithm", "signatureAlgorithm", "Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithmSpi", "engineVerify", "([B)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Algorithm");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/algorithms/SignatureAlgorithm", "getLocalAttribute", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "register", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException", "java/lang/ClassNotFoundException", "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NullPointerException");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/JavaUtils", "checkRegisterPermission", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Try to register {} {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("algorithm.alreadyRegistered");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/SignatureAlgorithm;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/ClassLoaderUtils", "loadClass", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NullPointerException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/NullPointerException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/signature/XMLSignatureException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("algorithms.NoSuchAlgorithm");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/signature/XMLSignatureException", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "register", "(Ljava/lang/String;Ljava/lang/Class;)V", "(Ljava/lang/String;Ljava/lang/Class<+Lorg/apache/xml/security/algorithms/SignatureAlgorithmSpi;>;)V", new String[] { "org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException", "java/lang/ClassNotFoundException", "org/apache/xml/security/signature/XMLSignatureException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/JavaUtils", "checkRegisterPermission", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Try to register {} {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("algorithm.alreadyRegistered");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/AlgorithmAlreadyRegisteredException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "registerDefaultAlgorithms", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#dsa-sha1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureDSA;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2009/xmldsig11#dsa-sha256");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureDSA$SHA256;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-md5");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSAMD5;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSARIPEMD160;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-sha224");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA224;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA256;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA384;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA512;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha1-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA1MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha224-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA224MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha256-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA256MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha384-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA384MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha512-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA512MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha3-224-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_224MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha3-256-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_256MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha3-384-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_384MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#sha3-512-rsa-MGF1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureBaseRSA$SignatureRSASHA3_512MGF1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha1");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA1;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha224");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA224;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha256");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA256;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha384");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA384;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#ecdsa-sha512");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSASHA512;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2007/05/xmldsig-more#ecdsa-ripemd160");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/SignatureECDSA$SignatureECDSARIPEMD160;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacMD5;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacRIPEMD160;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-sha224");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA224;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA256;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA384;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/implementations/IntegrityHmac$IntegrityHmacSHA512;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseNamespace", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseLocalName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("SignatureMethod");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/algorithms/SignatureAlgorithm;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xml/security/algorithms/SignatureAlgorithm", "algorithmHash", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
