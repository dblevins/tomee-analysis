package asm.org.apache.wss4j.stax.validate;
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
public class SamlTokenValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/wss4j/stax/validate/SamlTokenValidator", null, "java/lang/Object", new String[] { "org/apache/wss4j/stax/validate/SignatureTokenValidator" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validate", "(Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/wss4j/stax/validate/TokenContext;)Lorg/apache/wss4j/stax/securityToken/SamlSecurityToken;", "<T::Lorg/apache/wss4j/stax/securityToken/SamlSecurityToken;:Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;>(Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/wss4j/stax/validate/TokenContext;)TT;", new String[] { "org/apache/wss4j/common/ext/WSSecurityException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
