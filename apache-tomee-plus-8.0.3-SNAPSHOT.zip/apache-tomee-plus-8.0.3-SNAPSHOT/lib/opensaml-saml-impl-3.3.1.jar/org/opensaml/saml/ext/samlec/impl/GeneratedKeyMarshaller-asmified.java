package asm.org.opensaml.saml.ext.samlec.impl;
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
public class GeneratedKeyMarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/ext/samlec/impl/GeneratedKeyMarshaller", null, "org/opensaml/core/xml/schema/impl/XSBase64BinaryMarshaller", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/schema/impl/XSBase64BinaryMarshaller", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "marshallAttributes", "(Lorg/opensaml/core/xml/XMLObject;Lorg/w3c/dom/Element;)V", null, new String[] { "org/opensaml/core/xml/io/MarshallingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/ext/samlec/GeneratedKey");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/ext/samlec/GeneratedKey", "isSOAP11MustUnderstandXSBoolean", "()Lorg/opensaml/core/xml/schema/XSBooleanValue;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/ext/samlec/GeneratedKey", "SOAP11_MUST_UNDERSTAND_ATTR_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/ext/samlec/GeneratedKey", "isSOAP11MustUnderstandXSBoolean", "()Lorg/opensaml/core/xml/schema/XSBooleanValue;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/schema/XSBooleanValue", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/util/XMLObjectSupport", "marshallAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Lorg/w3c/dom/Element;Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/saml/ext/samlec/GeneratedKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/ext/samlec/GeneratedKey", "getSOAP11Actor", "()Ljava/lang/String;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/ext/samlec/GeneratedKey", "SOAP11_ACTOR_ATTR_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/ext/samlec/GeneratedKey", "getSOAP11Actor", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/util/XMLObjectSupport", "marshallAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Lorg/w3c/dom/Element;Z)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
