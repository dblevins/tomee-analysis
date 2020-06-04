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
public class WSSSignatureInputHandler$WSSSignatureVerifierDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler$WSSSignatureVerifier", null, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler$WSSSignatureVerifier", "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler", "WSSSignatureVerifier", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler", "SignatureVerifier", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenUsage", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler;Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler$WSSSignatureVerifier", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureInputHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler$SignatureVerifier", "<init>", "(Lorg/apache/xml/security/stax/impl/processor/input/AbstractSignatureInputHandler;Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "retrieveSecurityToken", "(Lorg/apache/xml/security/binding/xmldsig/SignatureType;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;)Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/securityToken/SecurityTokenFactory", "getInstance", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getKeyInfo", "()Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "KeyUsage_Signature_Verification", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/securityToken/SecurityTokenFactory", "getSecurityToken", "(Lorg/apache/xml/security/binding/xmldsig/KeyInfoType;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyUsage;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/stax/ext/InboundSecurityContext;)Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSSecurityProperties");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants", "TAG_dsig_Signature", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSSecurityProperties", "getValidator", "(Ljavax/xml/namespace/QName;)Lorg/apache/wss4j/stax/validate/Validator;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/validate/SignatureTokenValidator");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/validate/SignatureTokenValidatorImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/validate/SignatureTokenValidatorImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/xml/security/stax/securityToken/InboundSecurityToken", "org/apache/wss4j/stax/validate/SignatureTokenValidator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSSecurityProperties");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/validate/SignatureTokenValidator", "validate", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "TokenUsage_Signature", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "addTokenUsage", "(Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenUsage;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/binding/xmldsig/SignatureType", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/utils/WSSUtils", "createTokenSecurityEvent", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Ljava/lang/String;)Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InboundSecurityContext", "registerSecurityEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
