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
public class UsernameTokenPolicyValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/wss4j/policyvalidators/UsernameTokenPolicyValidator", null, "org/apache/cxf/ws/security/wss4j/policyvalidators/AbstractSecurityPolicyValidator", null);

classWriter.visitInnerClass("org/apache/wss4j/policy/model/UsernameToken$PasswordType", "org/apache/wss4j/policy/model/UsernameToken", "PasswordType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/wss4j/policy/model/UsernameToken$UsernameTokenType", "org/apache/wss4j/policy/model/UsernameToken", "UsernameTokenType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canValidatePolicy", "(Lorg/apache/cxf/ws/policy/AssertionInfo;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP12Constants", "USERNAME_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/Assertion", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP11Constants", "USERNAME_TOKEN", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/neethi/Assertion", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validatePolicies", "(Lorg/apache/cxf/ws/security/wss4j/policyvalidators/PolicyValidatorParameters;Ljava/util/Collection;)V", "(Lorg/apache/cxf/ws/security/wss4j/policyvalidators/PolicyValidatorParameters;Ljava/util/Collection<Lorg/apache/cxf/ws/policy/AssertionInfo;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/ws/policy/AssertionInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "getAssertion", "()Lorg/apache/neethi/Assertion;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/UsernameToken");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "setAsserted", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/PolicyValidatorParameters", "getAssertionInfoMap", "()Lorg/apache/cxf/ws/policy/AssertionInfoMap;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/UsernameTokenPolicyValidator", "assertToken", "(Lorg/apache/wss4j/policy/model/UsernameToken;Lorg/apache/cxf/ws/policy/AssertionInfoMap;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/PolicyValidatorParameters", "getMessage", "()Lorg/apache/cxf/message/Message;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/UsernameTokenPolicyValidator", "isTokenRequired", "(Lorg/apache/wss4j/policy/model/AbstractToken;Lorg/apache/cxf/message/Message;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/ws/policy/AssertionInfo", "org/apache/wss4j/policy/model/UsernameToken"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/PolicyValidatorParameters", "getUsernameTokenResults", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("The received token does not match the token inclusion requirement");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "setNotAsserted", "(Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/PolicyValidatorParameters", "getUsernameTokenResults", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/UsernameTokenPolicyValidator", "checkTokens", "(Lorg/apache/wss4j/policy/model/UsernameToken;Lorg/apache/cxf/ws/policy/AssertionInfo;Ljava/util/List;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "assertToken", "(Lorg/apache/wss4j/policy/model/UsernameToken;Lorg/apache/cxf/ws/policy/AssertionInfoMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "isCreated", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP13Constants", "CREATED", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/policy/PolicyUtils", "assertPolicy", "(Lorg/apache/cxf/ws/policy/AssertionInfoMap;Ljavax/xml/namespace/QName;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "isNonce", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP13Constants", "NONCE", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/policy/PolicyUtils", "assertPolicy", "(Lorg/apache/cxf/ws/policy/AssertionInfoMap;Ljavax/xml/namespace/QName;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "getPasswordType", "()Lorg/apache/wss4j/policy/model/UsernameToken$PasswordType;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken$PasswordType", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/policy/PolicyUtils", "assertPolicy", "(Lorg/apache/cxf/ws/policy/AssertionInfoMap;Ljavax/xml/namespace/QName;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/policy/model/UsernameToken$PasswordType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "getUsernameTokenType", "()Lorg/apache/wss4j/policy/model/UsernameToken$UsernameTokenType;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken$UsernameTokenType", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/security/policy/PolicyUtils", "assertPolicy", "(Lorg/apache/cxf/ws/policy/AssertionInfoMap;Ljavax/xml/namespace/QName;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/wss4j/policy/model/UsernameToken$UsernameTokenType"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkTokens", "(Lorg/apache/wss4j/policy/model/UsernameToken;Lorg/apache/cxf/ws/policy/AssertionInfo;Ljava/util/List;)Z", "(Lorg/apache/wss4j/policy/model/UsernameToken;Lorg/apache/cxf/ws/policy/AssertionInfo;Ljava/util/List<Lorg/apache/wss4j/dom/engine/WSSecurityEngineResult;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/dom/engine/WSSecurityEngineResult");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("username-token");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/engine/WSSecurityEngineResult", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/dom/message/token/UsernameToken");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "getPasswordType", "()Lorg/apache/wss4j/policy/model/UsernameToken$PasswordType;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/UsernameToken$PasswordType", "HashPassword", "Lorg/apache/wss4j/policy/model/UsernameToken$PasswordType;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/wss4j/dom/engine/WSSecurityEngineResult", "org/apache/wss4j/dom/message/token/UsernameToken", "org/apache/wss4j/policy/model/UsernameToken$PasswordType"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/model/UsernameToken$PasswordType", "NoPassword", "Lorg/apache/wss4j/policy/model/UsernameToken$PasswordType;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "isHashed", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Password hashing policy not enforced");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "setNotAsserted", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Username Token NoPassword policy not enforced");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "setNotAsserted", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "getPassword", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/wss4j/policyvalidators/UsernameTokenPolicyValidator", "isNonEndorsingSupportingToken", "(Lorg/apache/wss4j/policy/model/UsernameToken;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Username Token No Password supplied");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "setNotAsserted", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "isCreated", "()Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "getCreated", "()Ljava/lang/String;", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "isHashed", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Username Token Created policy not enforced");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "setNotAsserted", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "isNonce", "()Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "getNonce", "()Ljava/lang/String;", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/UsernameToken", "isHashed", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Username Token Nonce policy not enforced");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/AssertionInfo", "setNotAsserted", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/ws/security/wss4j/policyvalidators/UsernameTokenPolicyValidator", "org/apache/wss4j/policy/model/UsernameToken", "org/apache/cxf/ws/policy/AssertionInfo", "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "isNonEndorsingSupportingToken", "(Lorg/apache/wss4j/policy/model/UsernameToken;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/UsernameToken", "getParentAssertion", "()Lorg/apache/wss4j/policy/model/AbstractSecurityAssertion;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/wss4j/policy/model/SupportingTokens");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/policy/model/SupportingTokens");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/policy/model/SupportingTokens", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("SupportingTokens");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("SignedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("EncryptedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("SignedEncryptedSupportingTokens");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/wss4j/policy/model/AbstractSecurityAssertion", "org/apache/wss4j/policy/model/SupportingTokens", "java/lang/String"}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}