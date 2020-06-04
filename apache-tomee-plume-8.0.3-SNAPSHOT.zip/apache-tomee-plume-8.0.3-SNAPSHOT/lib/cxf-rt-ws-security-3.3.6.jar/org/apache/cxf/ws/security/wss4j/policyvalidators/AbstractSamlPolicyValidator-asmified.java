package asm.org.apache.cxf.ws.security.wss4j.policyvalidators;
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
public class AbstractSamlPolicyValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSamlPolicyValidator", null, "org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSecurityPolicyValidator", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSecurityPolicyValidator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkHolderOfKey", "(Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;Ljava/util/List;[Ljava/security/cert/Certificate;)Z", "(Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;Ljava/util/List<Lorg/apache/wss4j/dom/engine/WSSecurityEngineResult;>;[Ljava/security/cert/Certificate;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/saml/DOMSAMLUtil", "checkHolderOfKey", "(Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;Ljava/util/List;[Ljava/security/cert/Certificate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "compareCredentials", "(Lorg/apache/wss4j/common/saml/SAMLKeyInfo;Ljava/util/List;[Ljava/security/cert/Certificate;)Z", "(Lorg/apache/wss4j/common/saml/SAMLKeyInfo;Ljava/util/List<Lorg/apache/wss4j/dom/engine/WSSecurityEngineResult;>;[Ljava/security/cert/Certificate;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/saml/DOMSAMLUtil", "compareCredentials", "(Lorg/apache/wss4j/common/saml/SAMLKeyInfo;Ljava/util/List;[Ljava/security/cert/Certificate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
