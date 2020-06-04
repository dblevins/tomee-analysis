package asm.org.apache.wss4j.stax.securityEvent;
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
public class SamlTokenSecurityEventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/stax/securityEvent/SamlTokenSecurityEvent", "Lorg/apache/wss4j/stax/securityEvent/IssuedTokenSecurityEvent<Lorg/apache/wss4j/stax/securityToken/SamlSecurityToken;>;", "org/apache/wss4j/stax/securityEvent/IssuedTokenSecurityEvent", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "Event", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "SAML_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/securityEvent/IssuedTokenSecurityEvent", "<init>", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIssuerName", "()Ljava/lang/String;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/securityEvent/SamlTokenSecurityEvent", "getSamlAssertionWrapper", "()Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "getIssuerString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSamlAssertionWrapper", "()Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", null, new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/securityEvent/SamlTokenSecurityEvent", "getSecurityToken", "()Lorg/apache/xml/security/stax/securityToken/SecurityToken;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/securityToken/SamlSecurityToken");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/stax/securityToken/SamlSecurityToken", "getPrincipal", "()Ljava/security/Principal;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/common/principal/SAMLTokenPrincipal");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/common/principal/SAMLTokenPrincipal", "getToken", "()Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
