package asm.org.apache.wss4j.stax.impl.processor.input;
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
public class WSSSignatureInputHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler", null, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler$WSSSignatureVerifier", "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler", "WSSSignatureVerifier", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler", "SignatureVerifier", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "org/apache/wss4j/common/ext/WSSecurityException", "ErrorCode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_TRANSIENT, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newSignatureVerifier", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/binding/xmldsig/SignatureType;)Lorg/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getKeyInfo", "()Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler", "checkBSPCompliance", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/binding/xmldsig/SignatureType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignedInfo", "()Lorg/apache/xml/security/binding/xmldsig/SignedInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignedInfoType", "getSignatureMethod", "()Lorg/apache/xml/security/binding/xmldsig/SignatureMethodType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureMethodType", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityProperties", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/XMLSecurityProperties", "getSignatureAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("The Signature method does not match the requirement");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/ext/WSSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/ext/WSSecurityException$ErrorCode", "INVALID_SECURITY", "Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/ext/WSSecurityException", "<init>", "(Lorg/apache/wss4j/common/ext/WSSecurityException$ErrorCode;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSInboundSecurityContext");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/SignatureValueSecurityEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/SignatureValueSecurityEvent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignatureValue", "()Lorg/apache/xml/security/binding/xmldsig/SignatureValueType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureValueType", "getValue", "()[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/SignatureValueSecurityEvent", "setSignatureValue", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/SignatureValueSecurityEvent", "setCorrelationID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignedInfo", "()Lorg/apache/xml/security/binding/xmldsig/SignedInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignedInfoType", "getCanonicalizationMethod", "()Lorg/apache/xml/security/binding/xmldsig/CanonicalizationMethodType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/CanonicalizationMethodType", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmURI", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "SigC14n", "Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setAlgorithmUsage", "(Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityEvent/AlgorithmSuiteSecurityEvent", "setCorrelationID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler$WSSSignatureVerifier");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler$WSSSignatureVerifier", "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler;Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkBSPCompliance", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/binding/xmldsig/SignatureType;)V", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignedInfo", "()Lorg/apache/xml/security/binding/xmldsig/SignedInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignedInfoType", "getSignatureMethod", "()Lorg/apache/xml/security/binding/xmldsig/SignatureMethodType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureMethodType", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getSecurityContext", "()Lorg/apache/xml/security/stax/ext/InboundSecurityContext;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSInboundSecurityContext");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5421", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "handleBSPRule", "(Lorg/apache/wss4j/common/bsp/BSPRule;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "org/apache/wss4j/stax/ext/WSInboundSecurityContext"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignedInfo", "()Lorg/apache/xml/security/binding/xmldsig/SignedInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignedInfoType", "getSignatureMethod", "()Lorg/apache/xml/security/binding/xmldsig/SignatureMethodType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureMethodType", "getContent", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_dsig_HMACOutputLength", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "getQNameType", "(Ljava/util/List;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/math/BigInteger");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5401", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "handleBSPRule", "(Lorg/apache/wss4j/common/bsp/BSPRule;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/math/BigInteger"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getKeyInfo", "()Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/KeyInfoType", "getContent", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5402", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "handleBSPRule", "(Lorg/apache/wss4j/common/bsp/BSPRule;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_WSSE_SECURITY_TOKEN_REFERENCE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "getQNameType", "(Ljava/util/List;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/binding/wss10/SecurityTokenReferenceType");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5417", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "handleBSPRule", "(Lorg/apache/wss4j/common/bsp/BSPRule;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/binding/wss10/SecurityTokenReferenceType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getObject", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/binding/xmldsig/ObjectType");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/ObjectType", "getContent", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_dsig_Manifest", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "getQNameType", "(Ljava/util/List;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/binding/xmldsig/ManifestType");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5403", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "handleBSPRule", "(Lorg/apache/wss4j/common/bsp/BSPRule;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getSignedInfo", "()Lorg/apache/xml/security/binding/xmldsig/SignedInfoType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignedInfoType", "getCanonicalizationMethod", "()Lorg/apache/xml/security/binding/xmldsig/CanonicalizationMethodType;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/10/xml-exc-c14n#");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/CanonicalizationMethodType", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5404", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "handleBSPRule", "(Lorg/apache/wss4j/common/bsp/BSPRule;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/binding/xmldsig/CanonicalizationMethodType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/CanonicalizationMethodType", "getContent", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_c14nExcl_InclusiveNamespaces", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/XMLSecurityUtils", "getQNameType", "(Ljava/util/List;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/binding/excc14n/InclusiveNamespaces");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/excc14n/InclusiveNamespaces", "getPrefixList", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/common/bsp/BSPRule", "R5406", "Lorg/apache/wss4j/common/bsp/BSPRule;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/ext/WSInboundSecurityContext", "handleBSPRule", "(Lorg/apache/wss4j/common/bsp/BSPRule;)V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/binding/excc14n/InclusiveNamespaces"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "addSignatureReferenceInputProcessorToChain", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor", "<init>", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "addProcessor", "(Lorg/apache/xml/security/stax/ext/InputProcessor;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
