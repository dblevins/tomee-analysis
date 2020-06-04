package asm.org.apache.wss4j.policy.stax.assertionStates;
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
public class SignatureConfirmationAssertionStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", null, "org/apache/wss4j/policy/AssertionState", new String[] { "org/apache/wss4j/policy/stax/Assertable" });

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "Event", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "policyAsserter", "Lorg/apache/wss4j/policy/stax/PolicyAsserter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/wss4j/policy/model/AbstractSecurityAssertion;Lorg/apache/wss4j/policy/stax/PolicyAsserter;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/AssertionState", "<init>", "(Lorg/apache/neethi/Assertion;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "policyAsserter", "Lorg/apache/wss4j/policy/stax/PolicyAsserter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "policyAsserter", "Lorg/apache/wss4j/policy/stax/PolicyAsserter;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/policy/stax/DummyPolicyAsserter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/stax/DummyPolicyAsserter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "policyAsserter", "Lorg/apache/wss4j/policy/stax/PolicyAsserter;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "org/apache/wss4j/policy/model/AbstractSecurityAssertion", "org/apache/wss4j/policy/stax/PolicyAsserter", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/Assertion", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("RequireSignatureConfirmation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/policy/stax/PolicyAsserter", "assertPolicy", "(Ljavax/xml/namespace/QName;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecurityEventType", "()[Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "SIGNATURE_CONFIRMATION", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "assertEvent", "(Lorg/apache/xml/security/stax/securityEvent/SecurityEvent;)Z", null, new String[] { "org/apache/wss4j/common/WSSPolicyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/Wss11");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/Assertion", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/Wss11", "isRequireSignatureConfirmation", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "policyAsserter", "Lorg/apache/wss4j/policy/stax/PolicyAsserter;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("RequireSignatureConfirmation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/policy/stax/PolicyAsserter", "assertPolicy", "(Ljavax/xml/namespace/QName;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "setAsserted", "(Z)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/policy/model/Wss11", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "setAsserted", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Signature confirmation elements must not be used");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "setErrorMessage", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "policyAsserter", "Lorg/apache/wss4j/policy/stax/PolicyAsserter;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("RequireSignatureConfirmation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "getErrorMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/policy/stax/PolicyAsserter", "unassertPolicy", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SignatureConfirmationAssertionState", "isAsserted", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
