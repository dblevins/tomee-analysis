package asm.org.opensaml.saml.metadata.resolver.index.impl;
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
public class SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunctionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "Ljava/lang/Object;Lcom/google/common/base/Function<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;Ljava/util/Set<Lorg/opensaml/saml/metadata/resolver/index/MetadataIndexKey;>;>;", "java/lang/Object", new String[] { "com/google/common/base/Function" });

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "SourceIDExtensionIndexingFunction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceIDMetadataIndexKey", "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "ArtifactSourceIDMetadataIndexKey", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;)Ljava/util/Set;", "(Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;)Ljava/util/Set<Lorg/opensaml/saml/metadata/resolver/index/MetadataIndexKey;>;", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/commons/codec/DecoderException");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/EntityDescriptor", "getRoleDescriptors", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"net/shibboleth/utilities/java/support/collection/LazySet", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/metadata/RoleDescriptor");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/RoleDescriptor", "getExtensions", "()Lorg/opensaml/saml/saml2/metadata/Extensions;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/ext/saml1md/SourceID", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/Extensions", "getUnknownXMLObjects", "(Ljavax/xml/namespace/QName;)Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/EntityDescriptor", "getSchemaType", "()Ljavax/xml/namespace/QName;", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/RoleDescriptor", "getSchemaType", "()Ljavax/xml/namespace/QName;", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/opensaml/saml/saml2/metadata/RoleDescriptor", "org/opensaml/saml/saml2/metadata/Extensions", "java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/RoleDescriptor", "getElementQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/namespace/QName"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Processing SourceID extensions for entityID '{}' with role '{}'");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/EntityDescriptor", "getEntityID", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label9 = new Label();
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/xml/namespace/QName", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/XMLObject");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/ext/saml1md/SourceID");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/ext/saml1md/SourceID", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/primitive/StringSupport", "trimOrNull", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/codec/binary/Hex", "decodeHex", "([C)[B", false);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceIDMetadataIndexKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceIDMetadataIndexKey", "<init>", "([B)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("For SourceID extension value '{}' produced index key: {}");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "org/opensaml/saml/saml2/metadata/EntityDescriptor", "net/shibboleth/utilities/java/support/collection/LazySet", "java/util/Iterator", "org/opensaml/saml/saml2/metadata/RoleDescriptor", "org/opensaml/saml/saml2/metadata/Extensions", "java/util/List", "javax/xml/namespace/QName", "java/util/Iterator", "org/opensaml/core/xml/XMLObject", "org/opensaml/saml/ext/saml1md/SourceID", "java/lang/String"}, 1, new Object[] {"org/apache/commons/codec/DecoderException"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error decoding hexidecimal SourceID extension value '{}' for indexing");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "org/opensaml/saml/saml2/metadata/EntityDescriptor", "net/shibboleth/utilities/java/support/collection/LazySet", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 14);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/metadata/EntityDescriptor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "apply", "(Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
