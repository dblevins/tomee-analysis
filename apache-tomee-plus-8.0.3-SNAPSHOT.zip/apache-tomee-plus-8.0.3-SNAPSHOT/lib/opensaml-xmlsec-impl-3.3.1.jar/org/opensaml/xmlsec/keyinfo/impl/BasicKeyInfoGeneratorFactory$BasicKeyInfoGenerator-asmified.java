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
public class BasicKeyInfoGeneratorFactory$BasicKeyInfoGeneratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", null, "java/lang/Object", new String[] { "org/opensaml/xmlsec/keyinfo/KeyInfoGenerator" });

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "BasicOptions", ACC_PROTECTED);

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "BasicKeyInfoGenerator", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyInfoBuilder", "Lorg/opensaml/core/xml/XMLObjectBuilder;", "Lorg/opensaml/core/xml/XMLObjectBuilder<Lorg/opensaml/xmlsec/signature/KeyInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "this$0", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getBuilderFactory", "()Lorg/opensaml/core/xml/XMLObjectBuilderFactory;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/KeyInfo", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilderOrThrow", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "keyInfoBuilder", "Lorg/opensaml/core/xml/XMLObjectBuilder;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generate", "(Lorg/opensaml/security/credential/Credential;)Lorg/opensaml/xmlsec/signature/KeyInfo;", null, new String[] { "org/opensaml/security/SecurityException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "keyInfoBuilder", "Lorg/opensaml/core/xml/XMLObjectBuilder;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/KeyInfo", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/XMLObjectBuilder", "buildObject", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/KeyInfo");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "processKeyNames", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Lorg/opensaml/security/credential/Credential;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "processEntityID", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Lorg/opensaml/security/credential/Credential;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "processPublicKey", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Lorg/opensaml/security/credential/Credential;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "getOrderedChildren", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/xmlsec/signature/KeyInfo", "java/util/List"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processKeyNames", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Lorg/opensaml/security/credential/Credential;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$100", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/credential/Credential", "getKeyNames", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/KeyInfoSupport", "addKeyName", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processEntityID", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Lorg/opensaml/security/credential/Credential;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$000", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/credential/Credential", "getEntityId", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/KeyInfoSupport", "addKeyName", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processPublicKey", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Lorg/opensaml/security/credential/Credential;)V", null, new String[] { "org/opensaml/security/SecurityException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchAlgorithmException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/spec/InvalidKeySpecException");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/credential/Credential", "getPublicKey", "()Ljava/security/PublicKey;", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$200", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/credential/Credential", "getPublicKey", "()Ljava/security/PublicKey;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/KeyInfoSupport", "addPublicKey", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Ljava/security/PublicKey;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$300", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/credential/Credential", "getPublicKey", "()Ljava/security/PublicKey;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/KeyInfoSupport", "addDEREncodedPublicKey", "(Lorg/opensaml/xmlsec/signature/KeyInfo;Ljava/security/PublicKey;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/NoSuchAlgorithmException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Can't DER-encode key, unsupported key algorithm");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/spec/InvalidKeySpecException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Can't DER-encode key, invalid key specification");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
