package asm.org.opensaml.saml.metadata.resolver.impl;
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
public class AbstractBatchMetadataResolver$BatchEntityBackingStoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", null, "org/opensaml/saml/metadata/resolver/impl/AbstractMetadataResolver$EntityBackingStore", null);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver", "BatchEntityBackingStore", ACC_PROTECTED);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager$IdentityExtractionFunction", "org/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager", "IdentityExtractionFunction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/AbstractMetadataResolver$EntityBackingStore", "org/opensaml/saml/metadata/resolver/impl/AbstractMetadataResolver", "EntityBackingStore", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cachedOriginalMetadata", "Lorg/opensaml/core/xml/XMLObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cachedFilteredMetadata", "Lorg/opensaml/core/xml/XMLObject;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "secondaryIndexManager", "Lorg/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager;", "Lorg/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver;Ljava/util/Set;)V", "(Ljava/util/Set<Lorg/opensaml/saml/metadata/resolver/index/MetadataIndex;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullElements;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/Unmodifiable;", false);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotLive;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/impl/AbstractMetadataResolver$EntityBackingStore", "<init>", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractMetadataResolver;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager$IdentityExtractionFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager$IdentityExtractionFunction", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager", "<init>", "(Ljava/util/Set;Lcom/google/common/base/Function;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "secondaryIndexManager", "Lorg/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCachedOriginalMetadata", "()Lorg/opensaml/core/xml/XMLObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "cachedOriginalMetadata", "Lorg/opensaml/core/xml/XMLObject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCachedOriginalMetadata", "(Lorg/opensaml/core/xml/XMLObject;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "cachedOriginalMetadata", "Lorg/opensaml/core/xml/XMLObject;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCachedFilteredMetadata", "()Lorg/opensaml/core/xml/XMLObject;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "cachedFilteredMetadata", "Lorg/opensaml/core/xml/XMLObject;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCachedFilteredMetadata", "(Lorg/opensaml/core/xml/XMLObject;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "cachedFilteredMetadata", "Lorg/opensaml/core/xml/XMLObject;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecondaryIndexManager", "()Lorg/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager;", "()Lorg/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractBatchMetadataResolver$BatchEntityBackingStore", "secondaryIndexManager", "Lorg/opensaml/saml/metadata/resolver/index/impl/MetadataIndexManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
