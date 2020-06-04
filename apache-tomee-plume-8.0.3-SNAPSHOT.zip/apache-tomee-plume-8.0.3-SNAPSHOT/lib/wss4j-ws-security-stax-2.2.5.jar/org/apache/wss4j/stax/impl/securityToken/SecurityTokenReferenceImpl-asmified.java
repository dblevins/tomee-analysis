package asm.org.apache.wss4j.stax.impl.securityToken;
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
public class SecurityTokenReferenceImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", null, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", new String[] { "org/apache/wss4j/stax/securityToken/SecurityTokenReference" });

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "KeyIdentifier", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage", "org/apache/xml/security/stax/ext/XMLSecurityConstants", "AlgorithmUsage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType", "org/apache/xml/security/stax/securityToken/SecurityTokenConstants", "TokenType", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xmlSecEvents", "Ljava/util/Deque;", "Ljava/util/Deque<Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Ljava/util/Deque;Lorg/apache/wss4j/stax/ext/WSInboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;)V", "(Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Ljava/util/Deque<Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;>;Lorg/apache/wss4j/stax/ext/WSInboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/securityToken/AbstractInboundSecurityToken", "<init>", "(Lorg/apache/xml/security/stax/ext/InboundSecurityContext;Ljava/lang/String;Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$KeyIdentifier;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "xmlSecEvents", "Ljava/util/Deque;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlSecEvents", "()Ljava/util/Deque;", "()Ljava/util/Deque<Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "xmlSecEvents", "Ljava/util/Deque;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAsymmetric", "()Z", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "isAsymmetric", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecretKey", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/security/Key;>;", new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getSecretKey", "()Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getSecretKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/Key;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPublicKey", "()Ljava/security/PublicKey;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getPublicKey", "()Ljava/security/PublicKey;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getPubKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/PublicKey;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getPublicKey", "(Ljava/lang/String;Lorg/apache/xml/security/stax/ext/XMLSecurityConstants$AlgorithmUsage;Ljava/lang/String;)Ljava/security/PublicKey;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getX509Certificates", "()[Ljava/security/cert/X509Certificate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verify", "()V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "verify", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/securityToken/InboundSecurityToken");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIncludedInMessage", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "isIncludedInMessage", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenType", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/securityToken/InboundSecurityToken", "getTokenType", "()Lorg/apache/xml/security/stax/securityToken/SecurityTokenConstants$TokenType;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/securityToken/SecurityTokenReferenceImpl", "getKeyWrappingToken", "()Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
