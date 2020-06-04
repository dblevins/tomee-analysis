package asm.org.apache.cxf.rt.security.saml.xacml2;
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
public class SamlRequestComponentBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "xacmlAuthzDecisionQueryTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "issuerBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;", "Lorg/opensaml/saml/common/SAMLObjectBuilder<Lorg/opensaml/saml/saml2/core/Issuer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAuthzDecisionQuery", "(Ljava/lang/String;Lorg/opensaml/xacml/ctx/RequestType;Ljava/lang/String;)Lorg/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "createAuthzDecisionQuery", "(ZZLjava/lang/String;Lorg/opensaml/xacml/ctx/RequestType;Ljava/lang/String;)Lorg/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAuthzDecisionQuery", "(ZZLjava/lang/String;Lorg/opensaml/xacml/ctx/RequestType;Ljava/lang/String;)Lorg/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "xacmlAuthzDecisionQueryTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "DEFAULT_ELEMENT_NAME_XACML20", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "xacmlAuthzDecisionQueryTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "xacmlAuthzDecisionQueryTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("XACMLAuthzDecisionQuery");
methodVisitor.visitLdcInsn("xacml-samlp");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/UUID", "randomUUID", "()Ljava/util/UUID;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/UUID", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "setID", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/SAMLVersion", "VERSION_20", "Lorg/opensaml/saml/common/SAMLVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "setVersion", "(Lorg/opensaml/saml/common/SAMLVersion;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/joda/time/DateTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/joda/time/DateTime", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "setIssueInstant", "(Lorg/joda/time/DateTime;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "setInputContextOnly", "(Ljava/lang/Boolean;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "setReturnContext", "(Ljava/lang/Boolean;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "createIssuer", "(Ljava/lang/String;)Lorg/opensaml/saml/saml2/core/Issuer;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "setIssuer", "(Lorg/opensaml/saml/saml2/core/Issuer;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/profile/saml/XACMLAuthzDecisionQueryType", "setRequest", "(Lorg/opensaml/xacml/ctx/RequestType;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createIssuer", "(Ljava/lang/String;)Lorg/opensaml/saml/saml2/core/Issuer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "issuerBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/saml2/core/Issuer", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/SAMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "issuerBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "issuerBuilder", "Lorg/opensaml/saml/common/SAMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/common/SAMLObjectBuilder", "buildObject", "()Lorg/opensaml/saml/common/SAMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/core/Issuer");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/core/Issuer", "setValue", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getBuilderFactory", "()Lorg/opensaml/core/xml/XMLObjectBuilderFactory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/SamlRequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
