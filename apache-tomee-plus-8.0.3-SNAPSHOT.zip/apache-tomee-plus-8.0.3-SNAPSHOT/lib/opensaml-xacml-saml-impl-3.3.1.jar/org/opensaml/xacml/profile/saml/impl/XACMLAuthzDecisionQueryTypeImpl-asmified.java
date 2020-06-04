package asm.org.opensaml.xacml.profile.saml.impl;
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
public class XACMLAuthzDecisionQueryTypeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", null, "org/opensaml/saml/saml2/core/impl/RequestAbstractTypeImpl", new String[] { "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "policies", "Ljava/util/List;", "Ljava/util/List<Lorg/opensaml/xacml/policy/PolicyType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "policySets", "Ljava/util/List;", "Ljava/util/List<Lorg/opensaml/xacml/policy/PolicySetType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "referencedPolicies", "Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "request", "Lorg/opensaml/xacml/ctx/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/core/impl/RequestAbstractTypeImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "setElementNamespacePrefix", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/util/XMLObjectChildrenList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/util/XMLObjectChildrenList", "<init>", "(Lorg/opensaml/core/xml/XMLObject;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policies", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/util/XMLObjectChildrenList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/util/XMLObjectChildrenList", "<init>", "(Lorg/opensaml/core/xml/XMLObject;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policySets", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCombinePoliciesXSBooleanValue", "()Lorg/opensaml/core/xml/schema/XSBooleanValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInputContextOnlyXSBooleanValue", "()Lorg/opensaml/core/xml/schema/XSBooleanValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrderedChildren", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/core/xml/XMLObject;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/core/impl/RequestAbstractTypeImpl", "getOrderedChildren", "()Ljava/util/List;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/core/impl/RequestAbstractTypeImpl", "getOrderedChildren", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/ArrayList"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "request", "Lorg/opensaml/xacml/ctx/RequestType;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "request", "Lorg/opensaml/xacml/ctx/RequestType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policies", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policies", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policySets", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policySets", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "referencedPolicies", "Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "referencedPolicies", "Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRequest", "()Lorg/opensaml/xacml/ctx/RequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "request", "Lorg/opensaml/xacml/ctx/RequestType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReturnContextXSBooleanValue", "()Lorg/opensaml/core/xml/schema/XSBooleanValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCombinePolicies", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/schema/XSBooleanValue", "getValue", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInputContextOnly", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/schema/XSBooleanValue", "getValue", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReturnContext", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/schema/XSBooleanValue", "getValue", "()Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCombinePolicies", "(Lorg/opensaml/core/xml/schema/XSBooleanValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCombinePolicies", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/schema/XSBooleanValue", "<init>", "(Ljava/lang/Boolean;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "combinePolicies", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInputContextOnly", "(Lorg/opensaml/core/xml/schema/XSBooleanValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInputContextOnly", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/schema/XSBooleanValue", "<init>", "(Ljava/lang/Boolean;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "inputContextOnly", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequest", "(Lorg/opensaml/xacml/ctx/RequestType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "request", "Lorg/opensaml/xacml/ctx/RequestType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/XMLObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/RequestType");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "request", "Lorg/opensaml/xacml/ctx/RequestType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReturnContext", "(Lorg/opensaml/core/xml/schema/XSBooleanValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReturnContext", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/schema/XSBooleanValue", "<init>", "(Ljava/lang/Boolean;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/schema/XSBooleanValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "returnContext", "Lorg/opensaml/core/xml/schema/XSBooleanValue;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPolicies", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/xacml/policy/PolicyType;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policies", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPolicySets", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/xacml/policy/PolicySetType;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "policySets", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReferencedPolicies", "()Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "referencedPolicies", "Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReferencedPolicies", "(Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "referencedPolicies", "Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "prepareForAssignment", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/XMLObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/profile/saml/ReferencedPoliciesType");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xacml/profile/saml/impl/XACMLAuthzDecisionQueryTypeImpl", "referencedPolicies", "Lorg/opensaml/xacml/profile/saml/ReferencedPoliciesType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
