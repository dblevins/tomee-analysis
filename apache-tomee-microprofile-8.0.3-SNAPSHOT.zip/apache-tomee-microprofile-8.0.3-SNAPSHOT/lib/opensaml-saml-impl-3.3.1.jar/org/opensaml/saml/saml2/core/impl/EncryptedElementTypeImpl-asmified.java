package asm.org.opensaml.saml.saml2.core.impl;
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
public class EncryptedElementTypeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", null, "org/opensaml/saml/common/AbstractSAMLObject", new String[] { "org/opensaml/saml/saml2/core/EncryptedElementType" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encryptedKeys", "Lorg/opensaml/core/xml/util/XMLObjectChildrenList;", "Lorg/opensaml/core/xml/util/XMLObjectChildrenList<Lorg/opensaml/xmlsec/encryption/EncryptedKey;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/AbstractSAMLObject", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/util/XMLObjectChildrenList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/util/XMLObjectChildrenList", "<init>", "(Lorg/opensaml/core/xml/XMLObject;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedKeys", "Lorg/opensaml/core/xml/util/XMLObjectChildrenList;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptedData", "()Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEncryptedData", "(Lorg/opensaml/xmlsec/encryption/EncryptedData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "prepareForAssignment", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/XMLObject;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/encryption/EncryptedData");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptedKeys", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/xmlsec/encryption/EncryptedKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedKeys", "Lorg/opensaml/core/xml/util/XMLObjectChildrenList;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/ArrayList"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/core/impl/EncryptedElementTypeImpl", "encryptedKeys", "Lorg/opensaml/core/xml/util/XMLObjectChildrenList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "size", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
