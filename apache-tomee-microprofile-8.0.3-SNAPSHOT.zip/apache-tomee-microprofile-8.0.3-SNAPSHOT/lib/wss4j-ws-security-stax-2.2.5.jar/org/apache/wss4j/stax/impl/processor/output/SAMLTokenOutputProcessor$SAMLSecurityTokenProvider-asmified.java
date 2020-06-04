package asm.org.apache.wss4j.stax.impl.processor.output;
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
public class SAMLTokenOutputProcessor$SAMLSecurityTokenProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "Ljava/lang/Object;Lorg/apache/xml/security/stax/securityToken/SecurityTokenProvider<Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;>;", "java/lang/Object", new String[] { "org/apache/xml/security/stax/securityToken/SecurityTokenProvider" });

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor", "SAMLSecurityTokenProvider", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider$1", null, null, 0);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$FinalSAMLTokenOutputProcessor", "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor", "FinalSAMLTokenOutputProcessor", 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "samlKeyInfo", "Lorg/apache/wss4j/common/saml/SAMLKeyInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "samlCallback", "Lorg/apache/wss4j/common/saml/SAMLCallback;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tokenId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ref", "Lorg/w3c/dom/Element;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "finalSAMLTokenOutputProcessor", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$FinalSAMLTokenOutputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/common/saml/SAMLKeyInfo;Lorg/apache/wss4j/common/saml/SAMLCallback;Ljava/lang/String;Lorg/w3c/dom/Element;Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$FinalSAMLTokenOutputProcessor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlKeyInfo", "Lorg/apache/wss4j/common/saml/SAMLKeyInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlCallback", "Lorg/apache/wss4j/common/saml/SAMLCallback;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "tokenId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "ref", "Lorg/w3c/dom/Element;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "finalSAMLTokenOutputProcessor", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$FinalSAMLTokenOutputProcessor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlCallback", "Lorg/apache/wss4j/common/saml/SAMLCallback;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getSamlVersion", "()Lorg/opensaml/saml/common/SAMLVersion;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/SAMLVersion", "VERSION_10", "Lorg/opensaml/saml/common/SAMLVersion;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SAML_10_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlCallback", "Lorg/apache/wss4j/common/saml/SAMLCallback;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLCallback", "getSamlVersion", "()Lorg/opensaml/saml/common/SAMLVersion;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/SAMLVersion", "VERSION_11", "Lorg/opensaml/saml/common/SAMLVersion;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SAML_11_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityToken/WSSecurityTokenConstants", "SAML_20_TOKEN", "Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlKeyInfo", "Lorg/apache/wss4j/common/saml/SAMLKeyInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLKeyInfo", "getPrivateKey", "()Ljava/security/PrivateKey;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "tokenId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlKeyInfo", "Lorg/apache/wss4j/common/saml/SAMLKeyInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLKeyInfo", "getPrivateKey", "()Ljava/security/PrivateKey;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlKeyInfo", "Lorg/apache/wss4j/common/saml/SAMLKeyInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SAMLKeyInfo", "getCerts", "()[Ljava/security/cert/X509Certificate;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken", "<init>", "(Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;Ljava/security/Key;[Ljava/security/cert/X509Certificate;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "tokenId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider$1", "<init>", "(Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "finalSAMLTokenOutputProcessor", "Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$FinalSAMLTokenOutputProcessor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken", "setProcessor", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "ref", "Lorg/w3c/dom/Element;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken", "setCustomTokenReference", "(Lorg/w3c/dom/Element;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlSecurityToken", "Lorg/apache/xml/security/stax/impl/securityToken/GenericOutboundSecurityToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "tokenId", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSecurityToken", "()Ljava/lang/Object;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/OutboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider;)Lorg/apache/wss4j/common/saml/SAMLKeyInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/processor/output/SAMLTokenOutputProcessor$SAMLSecurityTokenProvider", "samlKeyInfo", "Lorg/apache/wss4j/common/saml/SAMLKeyInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
