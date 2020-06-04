package asm.org.opensaml.xmlsec.keyinfo.impl;
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
public class StaticKeyInfoGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", null, "java/lang/Object", new String[] { "org/opensaml/xmlsec/keyinfo/KeyInfoGenerator" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyInfo", "Lorg/opensaml/xmlsec/signature/KeyInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyInfoUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyInfoMarshaller", "Lorg/opensaml/core/xml/io/Marshaller;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "setKeyInfo", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generate", "(Lorg/opensaml/security/credential/Credential;)Lorg/opensaml/xmlsec/signature/KeyInfo;", null, new String[] { "org/opensaml/security/SecurityException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfo", "Lorg/opensaml/xmlsec/signature/KeyInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "getParent", "()Lorg/opensaml/core/xml/XMLObject;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfo", "Lorg/opensaml/xmlsec/signature/KeyInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfo", "Lorg/opensaml/xmlsec/signature/KeyInfo;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "clone", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)Lorg/opensaml/xmlsec/signature/KeyInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyInfo", "()Lorg/opensaml/xmlsec/signature/KeyInfo;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfo", "Lorg/opensaml/xmlsec/signature/KeyInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setKeyInfo", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("KeyInfo cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/KeyInfo");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfo", "Lorg/opensaml/xmlsec/signature/KeyInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "clone", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)Lorg/opensaml/xmlsec/signature/KeyInfo;", null, new String[] { "org/opensaml/security/SecurityException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/core/xml/io/MarshallingException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "org/opensaml/core/xml/io/UnmarshallingException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "getDOM", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "getMarshaller", "()Lorg/opensaml/core/xml/io/Marshaller;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Marshaller", "marshall", "(Lorg/opensaml/core/xml/XMLObject;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "org/opensaml/xmlsec/signature/KeyInfo", "org/w3c/dom/Element"}, 1, new Object[] {"org/opensaml/core/xml/io/MarshallingException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error marshalling the original KeyInfo during cloning");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "getUnmarshaller", "()Lorg/opensaml/core/xml/io/Unmarshaller;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "getDOM", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Unmarshaller", "unmarshall", "(Lorg/w3c/dom/Element;)Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/KeyInfo");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "org/opensaml/xmlsec/signature/KeyInfo", "org/w3c/dom/Element", "org/opensaml/xmlsec/signature/KeyInfo"}, 1, new Object[] {"org/opensaml/core/xml/io/UnmarshallingException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error unmarshalling the new KeyInfo during cloning");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "releaseChildrenDOM", "(Z)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "releaseDOM", "()V", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "releaseChildrenDOM", "(Z)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "releaseDOM", "()V", true);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getMarshaller", "()Lorg/opensaml/core/xml/io/Marshaller;", null, new String[] { "org/opensaml/security/SecurityException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoMarshaller", "Lorg/opensaml/core/xml/io/Marshaller;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getMarshallerFactory", "()Lorg/opensaml/core/xml/io/MarshallerFactory;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/KeyInfo", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/io/MarshallerFactory", "getMarshaller", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/io/Marshaller;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoMarshaller", "Lorg/opensaml/core/xml/io/Marshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoMarshaller", "Lorg/opensaml/core/xml/io/Marshaller;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Could not obtain KeyInfo marshaller from the configuration");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoMarshaller", "Lorg/opensaml/core/xml/io/Marshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getUnmarshaller", "()Lorg/opensaml/core/xml/io/Unmarshaller;", null, new String[] { "org/opensaml/security/SecurityException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getUnmarshallerFactory", "()Lorg/opensaml/core/xml/io/UnmarshallerFactory;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/KeyInfo", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/io/UnmarshallerFactory", "getUnmarshaller", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/io/Unmarshaller;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Could not obtain KeyInfo unmarshaller from the configuration");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/StaticKeyInfoGenerator", "keyInfoUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
