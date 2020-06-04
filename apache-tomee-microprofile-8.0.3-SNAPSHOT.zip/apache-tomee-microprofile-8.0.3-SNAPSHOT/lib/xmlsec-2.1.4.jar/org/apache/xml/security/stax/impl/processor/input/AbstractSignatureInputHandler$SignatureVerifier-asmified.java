package asm.org.apache.xml.security.stax.impl.processor.input;
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
public class AbstractSignatureInputHandler$SignatureVerifierDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler", "SignatureVerifier", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$DIRECTION", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "DIRECTION", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "signatureType", "Lorg/apache/xml/security/binding/xmldsig/SignatureType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signerOutputStream", "Lorg/apache/xml/security/stax/impl/util/SignerOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bufferedSignerOutputStream", "Ljava/io/OutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler;Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "this$0", "Lorg/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "signatureType", "Lorg/apache/xml/security/binding/xmldsig/SignatureType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "retrieveSecurityToken", "(Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;)Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "createSignatureAlgorithm", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/binding/xmldsig/SignatureType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "retrieveSecurityToken", "(Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;)Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInboundSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createSignatureAlgorithm", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/binding/xmldsig/SignatureType;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchAlgorithmException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/NoSuchProviderException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignedInfo", "()Lorg/apache/xml/security/binding/xmldsig/SignedInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignedInfoType", "getSignatureMethod", "()Lorg/apache/xml/security/binding/xmldsig/SignatureMethodType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureMethodType", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "isAsymmetric", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants", "Asym_Sig", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getPublicKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/PublicKey;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants", "Sym_Sig", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getSecretKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/Key", "getEncoded", "()[B", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "prepareSecretKey", "(Ljava/lang/String;[B)Ljavax/crypto/SecretKey;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "org/apache/xml/security/binding/xmldsig/SignatureType", "java/security/Key", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyInfo.nokey");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("the inbound security token");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithmFactory", "getInstance", "()Lorg/apache/xml/security/stax/impl/algorithms/SignatureAlgorithmFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithmFactory", "getSignatureAlgorithm", "(Ljava/lang/String;)Lorg/apache/xml/security/stax/impl/algorithms/SignatureAlgorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithm", "engineInitVerify", "(Ljava/security/Key;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/impl/util/SignerOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/util/SignerOutputStream", "<init>", "(Lorg/apache/xml/security/stax/impl/algorithms/SignatureAlgorithm;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "signerOutputStream", "Lorg/apache/xml/security/stax/impl/util/SignerOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/utils/UnsyncBufferedOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "signerOutputStream", "Lorg/apache/xml/security/stax/impl/util/SignerOutputStream;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/UnsyncBufferedOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "bufferedSignerOutputStream", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignedInfo", "()Lorg/apache/xml/security/binding/xmldsig/SignedInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignedInfoType", "getCanonicalizationMethod", "()Lorg/apache/xml/security/binding/xmldsig/CanonicalizationMethodType;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/CanonicalizationMethodType", "getContent", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants", "TAG_c14nExcl_InclusiveNamespaces", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "getQNameType", "(Ljava/util/List;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/binding/excc14n/InclusiveNamespaces");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitLdcInsn("inclusiveNamespacePrefixList");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/excc14n/InclusiveNamespaces", "getPrefixList", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "org/apache/xml/security/binding/xmldsig/SignatureType", "java/security/Key", "java/lang/String", "org/apache/xml/security/stax/impl/algorithms/SignatureAlgorithm", "org/apache/xml/security/binding/xmldsig/CanonicalizationMethodType", "org/apache/xml/security/binding/excc14n/InclusiveNamespaces", "java/util/Map"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "bufferedSignerOutputStream", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/CanonicalizationMethodType", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants$DIRECTION", "IN", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$DIRECTION;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "getTransformer", "(Lorg/apache/xml/security/stax/ext/Transformer;Ljava/io/OutputStream;Ljava/util/Map;Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$DIRECTION;)Lorg/apache/xml/security/stax/ext/Transformer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;");
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "org/apache/xml/security/binding/xmldsig/SignatureType", "java/security/Key", "java/lang/String"}, 1, new Object[] {"java/security/NoSuchAlgorithmException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/NoSuchProviderException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/Transformer", "transform", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doFinal", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "javax/xml/stream/XMLStreamException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/Transformer", "doFinal", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "bufferedSignerOutputStream", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "signerOutputStream", "Lorg/apache/xml/security/stax/impl/util/SignerOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "signatureType", "Lorg/apache/xml/security/binding/xmldsig/SignatureType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignatureValue", "()Lorg/apache/xml/security/binding/xmldsig/SignatureValueType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureValueType", "getValue", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/util/SignerOutputStream", "verify", "([B)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("errorMessages.InvalidSignatureValueException");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
