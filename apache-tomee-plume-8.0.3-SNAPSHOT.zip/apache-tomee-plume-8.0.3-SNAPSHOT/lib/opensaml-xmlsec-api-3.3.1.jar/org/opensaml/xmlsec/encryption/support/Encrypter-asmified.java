package asm.org.opensaml.xmlsec.encryption.support;
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
public class EncrypterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/encryption/support/Encrypter", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encryptedDataUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encryptedKeyUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "keyInfoBuilder", "Lorg/opensaml/xmlsec/signature/XMLSignatureBuilder;", "Lorg/opensaml/xmlsec/signature/XMLSignatureBuilder<Lorg/opensaml/xmlsec/signature/KeyInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "jcaProviderName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/encryption/support/Encrypter;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getUnmarshallerFactory", "()Lorg/opensaml/core/xml/io/UnmarshallerFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/encryption/EncryptedData", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/io/UnmarshallerFactory", "getUnmarshaller", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/io/Unmarshaller;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptedDataUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/encryption/EncryptedKey", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/io/UnmarshallerFactory", "getUnmarshaller", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/io/Unmarshaller;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptedKeyUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptedDataUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitLdcInsn("EncryptedData unmarshaller not configured");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptedKeyUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitLdcInsn("EncryptedKey unmarshaller not configured");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getBuilderFactory", "()Lorg/opensaml/core/xml/XMLObjectBuilderFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/signature/KeyInfo", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/XMLObjectBuilderFactory", "getBuilder", "(Ljavax/xml/namespace/QName;)Lorg/opensaml/core/xml/XMLObjectBuilder;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/XMLSignatureBuilder");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "keyInfoBuilder", "Lorg/opensaml/xmlsec/signature/XMLSignatureBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "keyInfoBuilder", "Lorg/opensaml/xmlsec/signature/XMLSignatureBuilder;");
methodVisitor.visitLdcInsn("KeyInfo builder not configured");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJCAProviderName", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "jcaProviderName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJCAProviderName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "jcaProviderName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
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
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List<Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;>;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptElementContent", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
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
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptElementContent", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptElementContent", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List<Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;>;)Lorg/opensaml/xmlsec/encryption/EncryptedData;", new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptKey", "(Ljava/security/Key;Ljava/util/List;Lorg/w3c/dom/Document;)Ljava/util/List;", "(Ljava/security/Key;Ljava/util/List<Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;>;Lorg/w3c/dom/Document;)Ljava/util/List<Lorg/opensaml/xmlsec/encryption/EncryptedKey;>;", new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "checkParams", "(Ljava/util/List;Z)V", false);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/List", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptKey", "(Ljava/security/Key;Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;Lorg/w3c/dom/Document;)Lorg/opensaml/xmlsec/encryption/EncryptedKey;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encryptKey", "(Ljava/security/Key;Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;Lorg/w3c/dom/Document;)Lorg/opensaml/xmlsec/encryption/EncryptedKey;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/security/SecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "checkParams", "(Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getEncryptionCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/credential/CredentialSupport", "extractEncryptionKey", "(Lorg/opensaml/security/credential/Credential;)Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getRSAOAEPParameters", "()Lorg/opensaml/xmlsec/encryption/support/RSAOAEPParameters;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptKey", "(Ljava/security/Key;Ljava/security/Key;Ljava/lang/String;Lorg/opensaml/xmlsec/encryption/support/RSAOAEPParameters;Lorg/w3c/dom/Document;)Lorg/opensaml/xmlsec/encryption/EncryptedKey;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getKeyInfoGenerator", "()Lorg/opensaml/xmlsec/keyinfo/KeyInfoGenerator;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getKeyInfoGenerator", "()Lorg/opensaml/xmlsec/keyinfo/KeyInfoGenerator;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Dynamically generating KeyInfo from Credential for EncryptedKey using generator: {}");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getEncryptionCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/keyinfo/KeyInfoGenerator", "generate", "(Lorg/opensaml/security/credential/Credential;)Lorg/opensaml/xmlsec/signature/KeyInfo;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/encryption/EncryptedKey", "setKeyInfo", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/opensaml/xmlsec/encryption/support/Encrypter", "java/security/Key", "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "org/w3c/dom/Document", "java/security/Key", "org/opensaml/xmlsec/encryption/EncryptedKey", "org/opensaml/xmlsec/keyinfo/KeyInfoGenerator"}, 1, new Object[] {"org/opensaml/security/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error during EncryptedKey KeyInfo generation");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error during EncryptedKey KeyInfo generation");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getRecipient", "()Ljava/lang/String;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getRecipient", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/encryption/EncryptedKey", "setRecipient", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "encryptKey", "(Ljava/security/Key;Ljava/security/Key;Ljava/lang/String;Lorg/opensaml/xmlsec/encryption/support/RSAOAEPParameters;Lorg/w3c/dom/Document;)Lorg/opensaml/xmlsec/encryption/EncryptedKey;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(5, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/xml/security/encryption/XMLEncryptionException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "org/apache/xml/security/encryption/XMLEncryptionException");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "org/opensaml/core/xml/io/UnmarshallingException");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("Encryption algorithm URI cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("Containing document cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Target key for key encryption was null");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Target key was null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Encryption key for key encryption was null");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Encryption key was null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Encrypting encryption key with algorithm: {}");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "buildXMLCipher", "(Ljava/security/Key;Ljava/lang/String;Lorg/opensaml/xmlsec/encryption/support/RSAOAEPParameters;)Lorg/apache/xml/security/encryption/XMLCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/xml/security/encryption/XMLEncryptionException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error initializing cipher instance on key encryption");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error initializing cipher instance on key encryption");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/XMLCipher"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmSupport", "isRSAOAEP", "(Ljava/lang/String;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "getEffectiveMGF", "(Ljava/lang/String;Lorg/opensaml/xmlsec/encryption/support/RSAOAEPParameters;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/RSAOAEPParameters", "getOAEPParams", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "decodeOAEPParams", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher", "encryptKey", "(Lorg/w3c/dom/Document;Ljava/security/Key;Ljava/lang/String;[B)Lorg/apache/xml/security/encryption/EncryptedKey;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher", "encryptKey", "(Lorg/w3c/dom/Document;Ljava/security/Key;)Lorg/apache/xml/security/encryption/EncryptedKey;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/EncryptedKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "postProcessApacheEncryptedKey", "(Lorg/apache/xml/security/encryption/EncryptedKey;Ljava/security/Key;Ljava/security/Key;Ljava/lang/String;Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/opensaml/xmlsec/encryption/support/Encrypter", "java/security/Key", "java/security/Key", "java/lang/String", "org/opensaml/xmlsec/encryption/support/RSAOAEPParameters", "org/w3c/dom/Document", "org/apache/xml/security/encryption/XMLCipher"}, 1, new Object[] {"org/apache/xml/security/encryption/XMLEncryptionException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error encrypting element on key encryption");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error encrypting element on key encryption");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/EncryptedKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher", "martial", "(Lorg/w3c/dom/Document;Lorg/apache/xml/security/encryption/EncryptedKey;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptedKeyUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Unmarshaller", "unmarshall", "(Lorg/w3c/dom/Element;)Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/encryption/EncryptedKey");
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/core/xml/io/UnmarshallingException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error unmarshalling EncryptedKey element");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error unmarshalling EncryptedKey element");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildXMLCipher", "(Ljava/security/Key;Ljava/lang/String;Lorg/opensaml/xmlsec/encryption/support/RSAOAEPParameters;)Lorg/apache/xml/security/encryption/XMLCipher;", null, new String[] { "org/apache/xml/security/encryption/XMLEncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "getJCAProviderName", "()Ljava/lang/String;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmSupport", "isRSAOAEP", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/RSAOAEPParameters", "getDigestMethod", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "getJCAProviderName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/RSAOAEPParameters", "getDigestMethod", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "getProviderInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/xml/security/encryption/XMLCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "getJCAProviderName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "getProviderInstance", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/xml/security/encryption/XMLCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmSupport", "isRSAOAEP", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/RSAOAEPParameters", "getDigestMethod", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/RSAOAEPParameters", "getDigestMethod", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "getInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/xml/security/encryption/XMLCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "getInstance", "(Ljava/lang/String;)Lorg/apache/xml/security/encryption/XMLCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/XMLCipher"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher", "init", "(ILjava/security/Key;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getEffectiveMGF", "(Ljava/lang/String;Lorg/opensaml/xmlsec/encryption/support/RSAOAEPParameters;)Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("http://www.w3.org/2009/xmlenc11#rsa-oaep");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/RSAOAEPParameters", "getMaskGenerationFunction", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "decodeOAEPParams", "(Ljava/lang/String;)[B", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
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
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/RuntimeException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/RuntimeException");
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label2, "java/lang/RuntimeException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/codec/Base64Support", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error decoding OAEPParams data '%s'");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "postProcessApacheEncryptedKey", "(Lorg/apache/xml/security/encryption/EncryptedKey;Ljava/security/Key;Ljava/security/Key;Ljava/lang/String;Lorg/w3c/dom/Document;)V", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
methodVisitor.visitAnnotableParameterCount(5, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(3, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(4, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmSupport", "isRSAOAEP", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/encryption/EncryptedKey", "getEncryptionMethod", "()Lorg/apache/xml/security/encryption/EncryptionMethod;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/encryption/EncryptionMethod", "getDigestAlgorithm", "()Ljava/lang/String;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/09/xmldsig#sha1");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/encryption/EncryptionMethod", "setDigestAlgorithm", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/EncryptionMethod"}, 0, null);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/encryption/EncryptionMethod", "getMGFAlgorithm", "()Ljava/lang/String;", true);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("http://www.w3.org/2009/xmlenc11#mgf1sha1");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/encryption/EncryptionMethod", "setMGFAlgorithm", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Ljava/security/Key;Ljava/lang/String;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/xml/security/encryption/XMLEncryptionException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "org/opensaml/core/xml/io/UnmarshallingException");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("XMLObject for encryption was null");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XMLObject cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Encryption key for key encryption was null");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Encryption key cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Encrypting XMLObject using algorithm URI {} with content mode {}");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "checkAndMarshall", "(Lorg/opensaml/core/xml/XMLObject;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/XMLObject", "getDOM", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getOwnerDocument", "()Lorg/w3c/dom/Document;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "getJCAProviderName", "()Ljava/lang/String;", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "getJCAProviderName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "getProviderInstance", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/xml/security/encryption/XMLCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/w3c/dom/Element", "org/w3c/dom/Document"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/encryption/XMLCipher", "getInstance", "(Ljava/lang/String;)Lorg/apache/xml/security/encryption/XMLCipher;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/XMLCipher"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher", "init", "(ILjava/security/Key;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/opensaml/xmlsec/encryption/support/Encrypter", "org/opensaml/core/xml/XMLObject", "java/security/Key", "java/lang/String", Opcodes.INTEGER, "org/w3c/dom/Element", "org/w3c/dom/Document"}, 1, new Object[] {"org/apache/xml/security/encryption/XMLEncryptionException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error initializing cipher instance on XMLObject encryption");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error initializing cipher instance");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/XMLCipher"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher", "encryptData", "(Lorg/w3c/dom/Document;Lorg/w3c/dom/Element;Z)Lorg/apache/xml/security/encryption/EncryptedData;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error encrypting XMLObject");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error encrypting XMLObject");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/encryption/EncryptedData"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/encryption/XMLCipher", "martial", "(Lorg/w3c/dom/Document;Lorg/apache/xml/security/encryption/EncryptedData;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptedDataUnmarshaller", "Lorg/opensaml/core/xml/io/Unmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Unmarshaller", "unmarshall", "(Lorg/w3c/dom/Element;)Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/encryption/EncryptedData");
methodVisitor.visitLabel(label7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/core/xml/io/UnmarshallingException"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error unmarshalling EncryptedData element");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error unmarshalling EncryptedData element");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", "(Lorg/opensaml/core/xml/XMLObject;Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List<Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;>;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(4, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/security/SecurityException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "checkParams", "(Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "getEncryptionCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/credential/CredentialSupport", "extractEncryptionKey", "(Lorg/opensaml/security/credential/Credential;)Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "generateEncryptionKey", "(Ljava/lang/String;)Ljavax/crypto/SecretKey;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/security/Key"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptElement", "(Lorg/opensaml/core/xml/XMLObject;Ljava/security/Key;Ljava/lang/String;Z)Lorg/opensaml/xmlsec/encryption/EncryptedData;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/encryption/EncryptedData", "getDOM", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getOwnerDocument", "()Lorg/w3c/dom/Document;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "getKeyInfoGenerator", "()Lorg/opensaml/xmlsec/keyinfo/KeyInfoGenerator;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "getKeyInfoGenerator", "()Lorg/opensaml/xmlsec/keyinfo/KeyInfoGenerator;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Dynamically generating KeyInfo from Credential for EncryptedData using generator: {}");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "getEncryptionCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/keyinfo/KeyInfoGenerator", "generate", "(Lorg/opensaml/security/credential/Credential;)Lorg/opensaml/xmlsec/signature/KeyInfo;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/encryption/EncryptedData", "setKeyInfo", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/opensaml/xmlsec/encryption/support/Encrypter", "org/opensaml/core/xml/XMLObject", "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "java/util/List", Opcodes.INTEGER, "java/lang/String", "java/security/Key", "org/opensaml/xmlsec/encryption/EncryptedData", "org/w3c/dom/Document", "org/opensaml/xmlsec/keyinfo/KeyInfoGenerator"}, 1, new Object[] {"org/opensaml/security/SecurityException"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error during EncryptedData KeyInfo generation");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error during EncryptedData KeyInfo generation");
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "encryptKey", "(Ljava/security/Key;Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;Lorg/w3c/dom/Document;)Lorg/opensaml/xmlsec/encryption/EncryptedKey;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/encryption/EncryptedData", "getKeyInfo", "()Lorg/opensaml/xmlsec/signature/KeyInfo;", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "keyInfoBuilder", "Lorg/opensaml/xmlsec/signature/XMLSignatureBuilder;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/XMLSignatureBuilder", "buildObject", "()Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/signature/KeyInfo");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/encryption/EncryptedData", "setKeyInfo", "(Lorg/opensaml/xmlsec/signature/KeyInfo;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "org/opensaml/xmlsec/encryption/EncryptedKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/encryption/EncryptedData", "getKeyInfo", "()Lorg/opensaml/xmlsec/signature/KeyInfo;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/xmlsec/signature/KeyInfo", "getEncryptedKeys", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkAndMarshall", "(Lorg/opensaml/core/xml/XMLObject;)V", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
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
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/XMLObject", "getDOM", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getMarshallerFactory", "()Lorg/opensaml/core/xml/io/MarshallerFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/io/MarshallerFactory", "getMarshaller", "(Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/io/Marshaller;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/core/xml/io/MarshallingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("No marshaller available for ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/XMLObject", "getElementQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/io/MarshallingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/w3c/dom/Element", "org/opensaml/core/xml/io/Marshaller"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Marshaller", "marshall", "(Lorg/opensaml/core/xml/XMLObject;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/xmlsec/encryption/support/Encrypter", "org/opensaml/core/xml/XMLObject", "org/w3c/dom/Element"}, 1, new Object[] {"org/opensaml/core/xml/io/MarshallingException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error marshalling target XMLObject");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error marshalling target XMLObject");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkParams", "(Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;)V", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Data encryption parameters are required");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Data encryption parameters are required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Data encryption algorithm URI is required");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Data encryption algorithm URI is required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkParams", "(Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;Z)V", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Key encryption parameters are required");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key encryption parameters are required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getEncryptionCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/credential/CredentialSupport", "extractEncryptionKey", "(Lorg/opensaml/security/credential/Credential;)Ljava/security/Key;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Key encryption credential and contained key are required");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key encryption credential and contained key are required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/security/Key"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/DSAPublicKey");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Attempt made to use DSA key for encrypted key transport");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DSA keys may not be used for encrypted key transport");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/ECPublicKey");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Attempt made to use EC key for encrypted key transport");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EC keys may not be used for encrypted key transport");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters", "getAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Strings", "isNullOrEmpty", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Key encryption algorithm URI is required");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key encryption algorithm URI is required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkParams", "(Ljava/util/List;Z)V", "(Ljava/util/List<Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;>;Z)V", new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Key encryption parameters list may not be empty");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key encryption parameters list may not be empty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/encryption/support/KeyEncryptionParameters");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "checkParams", "(Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;Z)V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "checkParams", "(Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List;)V", "(Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;Ljava/util/List<Lorg/opensaml/xmlsec/encryption/support/KeyEncryptionParameters;>;)V", new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "checkParams", "(Lorg/opensaml/xmlsec/encryption/support/DataEncryptionParameters;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/Encrypter", "checkParams", "(Ljava/util/List;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/encryption/support/DataEncryptionParameters", "getEncryptionCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/credential/CredentialSupport", "extractEncryptionKey", "(Lorg/opensaml/security/credential/Credential;)Ljava/security/Key;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Using a generated encryption key requires a KeyEncryptionParameters object and key encryption key");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Using a generated encryption key requires a KeyEncryptionParameters object and key encryption key");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "generateEncryptionKey", "(Ljava/lang/String;)Ljavax/crypto/SecretKey;", null, new String[] { "org/opensaml/xmlsec/encryption/support/EncryptionException" });
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/security/NoSuchAlgorithmException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/security/KeyException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Generating random symmetric data encryption key from algorithm URI: {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/algorithm/AlgorithmSupport", "generateSymmetricKey", "(Ljava/lang/String;)Ljavax/crypto/SecretKey;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/NoSuchAlgorithmException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not generate encryption key, algorithm URI was invalid: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not generate encryption key, algorithm URI was invalid: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/KeyException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/Encrypter", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not generate encryption key from algorithm URI: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/EncryptionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not generate encryption key from algorithm URI: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/EncryptionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/Init", "isInitialized", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/Init", "init", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
