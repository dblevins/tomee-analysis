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
public class SpnegoContextTokenAssertionStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", null, "org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event", "org/apache/xml/security/stax/securityEvent/SecurityEventConstants", "Event", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/wss4j/policy/model/AbstractSecurityAssertion;ZLorg/apache/wss4j/policy/stax/PolicyAsserter;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/policy/stax/assertionStates/TokenAssertionState", "<init>", "(Lorg/apache/wss4j/policy/model/AbstractSecurityAssertion;ZLorg/apache/wss4j/policy/stax/PolicyAsserter;Z)V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "getPolicyAsserter", "()Lorg/apache/wss4j/policy/stax/PolicyAsserter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/policy/stax/PolicyAsserter", "assertPolicy", "(Lorg/apache/neethi/Assertion;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "org/apache/wss4j/policy/model/AbstractSecurityAssertion", Opcodes.INTEGER, "org/apache/wss4j/policy/stax/PolicyAsserter", Opcodes.INTEGER}, 0, new Object[] {});
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
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/securityEvent/WSSecurityEventConstants", "SECURITY_CONTEXT_TOKEN", "Lorg/apache/xml/security/stax/securityEvent/SecurityEventConstants$Event;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "assertToken", "(Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent;Lorg/apache/wss4j/policy/model/AbstractToken;)Z", "(Lorg/apache/xml/security/stax/securityEvent/TokenSecurityEvent<+Lorg/apache/xml/security/stax/securityToken/SecurityToken;>;Lorg/apache/wss4j/policy/model/AbstractToken;)Z", new String[] { "org/apache/wss4j/common/WSSPolicyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/wss4j/stax/securityEvent/SecurityContextTokenSecurityEvent");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/common/WSSPolicyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Expected a SecurityContextTokenSecurityEvent but got ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/common/WSSPolicyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/SpnegoContextToken");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/securityEvent/SecurityContextTokenSecurityEvent");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/SpnegoContextToken", "getIssuerName", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/SpnegoContextToken", "getIssuerName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/securityEvent/SecurityContextTokenSecurityEvent", "getIssuerName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("IssuerName in Policy (");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/SpnegoContextToken", "getIssuerName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(") didn't match with the one in the IssuedToken (");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/securityEvent/SecurityContextTokenSecurityEvent", "getIssuerName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(")");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "setErrorMessage", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "getPolicyAsserter", "()Lorg/apache/wss4j/policy/stax/PolicyAsserter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "getErrorMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/policy/stax/PolicyAsserter", "unassertPolicy", "(Lorg/apache/neethi/Assertion;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/wss4j/policy/model/SpnegoContextToken", "org/apache/wss4j/stax/securityEvent/SecurityContextTokenSecurityEvent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "getPolicyAsserter", "()Lorg/apache/wss4j/policy/stax/PolicyAsserter;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/stax/assertionStates/SpnegoContextTokenAssertionState", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/policy/stax/PolicyAsserter", "assertPolicy", "(Lorg/apache/neethi/Assertion;)V", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
