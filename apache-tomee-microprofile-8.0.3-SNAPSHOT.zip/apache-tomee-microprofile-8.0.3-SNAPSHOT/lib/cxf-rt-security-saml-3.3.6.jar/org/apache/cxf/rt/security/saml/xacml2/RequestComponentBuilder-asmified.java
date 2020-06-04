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
public class RequestComponentBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "attributeValueTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/ctx/AttributeValueType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "attributeTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/ctx/AttributeType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "subjectTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/ctx/SubjectType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "resourceTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/ctx/ResourceType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "actionTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/ctx/ActionType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "environmentTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/ctx/EnvironmentType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "requestTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;", "Lorg/opensaml/xacml/XACMLObjectBuilder<Lorg/opensaml/xacml/ctx/RequestType;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAttributeValueType", "(Ljava/lang/String;)Lorg/opensaml/xacml/ctx/AttributeValueType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "attributeValueTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/ctx/AttributeValueType", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "attributeValueTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "attributeValueTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/AttributeValueType");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/AttributeValueType", "setValue", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createAttributeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lorg/opensaml/xacml/ctx/AttributeType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lorg/opensaml/xacml/ctx/AttributeValueType;>;)Lorg/opensaml/xacml/ctx/AttributeType;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "attributeTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/ctx/AttributeType", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "attributeTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "attributeTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/AttributeType");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/AttributeType", "setAttributeID", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/AttributeType", "setDataType", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/AttributeType", "setIssuer", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/AttributeType", "getAttributeValues", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createSubjectType", "(Ljava/util/List;Ljava/lang/String;)Lorg/opensaml/xacml/ctx/SubjectType;", "(Ljava/util/List<Lorg/opensaml/xacml/ctx/AttributeType;>;Ljava/lang/String;)Lorg/opensaml/xacml/ctx/SubjectType;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "subjectTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/ctx/SubjectType", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "subjectTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "subjectTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/SubjectType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/SubjectType", "getAttributes", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xacml/ctx/SubjectType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/SubjectType", "setSubjectCategory", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createResourceType", "(Ljava/util/List;Lorg/opensaml/xacml/ctx/ResourceContentType;)Lorg/opensaml/xacml/ctx/ResourceType;", "(Ljava/util/List<Lorg/opensaml/xacml/ctx/AttributeType;>;Lorg/opensaml/xacml/ctx/ResourceContentType;)Lorg/opensaml/xacml/ctx/ResourceType;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "resourceTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/ctx/ResourceType", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "resourceTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "resourceTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/ResourceType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/ResourceType", "getAttributes", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xacml/ctx/ResourceType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/ResourceType", "setResourceContent", "(Lorg/opensaml/xacml/ctx/ResourceContentType;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createActionType", "(Ljava/util/List;)Lorg/opensaml/xacml/ctx/ActionType;", "(Ljava/util/List<Lorg/opensaml/xacml/ctx/AttributeType;>;)Lorg/opensaml/xacml/ctx/ActionType;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "actionTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/ctx/ActionType", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "actionTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "actionTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/ActionType");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/ActionType", "getAttributes", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xacml/ctx/ActionType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createEnvironmentType", "(Ljava/util/List;)Lorg/opensaml/xacml/ctx/EnvironmentType;", "(Ljava/util/List<Lorg/opensaml/xacml/ctx/AttributeType;>;)Lorg/opensaml/xacml/ctx/EnvironmentType;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "environmentTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/ctx/EnvironmentType", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "environmentTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "environmentTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/EnvironmentType");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/EnvironmentType", "getAttributes", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/xacml/ctx/EnvironmentType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createRequestType", "(Ljava/util/List;Ljava/util/List;Lorg/opensaml/xacml/ctx/ActionType;Lorg/opensaml/xacml/ctx/EnvironmentType;)Lorg/opensaml/xacml/ctx/RequestType;", "(Ljava/util/List<Lorg/opensaml/xacml/ctx/SubjectType;>;Ljava/util/List<Lorg/opensaml/xacml/ctx/ResourceType;>;Lorg/opensaml/xacml/ctx/ActionType;Lorg/opensaml/xacml/ctx/EnvironmentType;)Lorg/opensaml/xacml/ctx/RequestType;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "requestTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xacml/ctx/RequestType", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/XACMLObjectBuilder");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "requestTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "requestTypeBuilder", "Lorg/opensaml/xacml/XACMLObjectBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/XACMLObjectBuilder", "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xacml/ctx/RequestType");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/RequestType", "getSubjects", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/RequestType", "getResources", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/RequestType", "setAction", "(Lorg/opensaml/xacml/ctx/ActionType;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xacml/ctx/RequestType", "setEnvironment", "(Lorg/opensaml/xacml/ctx/EnvironmentType;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getBuilderFactory", "()Lorg/opensaml/core/xml/XMLObjectBuilderFactory;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/rt/security/saml/xacml2/RequestComponentBuilder", "builderFactory", "Lorg/opensaml/core/xml/XMLObjectBuilderFactory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
