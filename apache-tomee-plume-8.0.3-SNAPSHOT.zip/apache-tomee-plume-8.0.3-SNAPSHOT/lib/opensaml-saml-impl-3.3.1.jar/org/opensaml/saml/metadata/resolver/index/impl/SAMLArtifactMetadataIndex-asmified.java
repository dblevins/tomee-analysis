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
public class SAMLArtifactMetadataIndexDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", null, "java/lang/Object", new String[] { "org/opensaml/saml/metadata/resolver/index/MetadataIndex" });

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceLocationMetadataIndexKey", "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "ArtifactSourceLocationMetadataIndexKey", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceIDMetadataIndexKey", "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "ArtifactSourceIDMetadataIndexKey", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceLocationIndexingFunction", "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "SourceLocationIndexingFunction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "SourceIDExtensionIndexingFunction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$EntityIDToSHA1SourceIDIndexingFunction", "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "EntityIDToSHA1SourceIDIndexingFunction", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "indexingFunctions", "Ljava/util/List;", "Ljava/util/List<Lcom/google/common/base/Function<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;Ljava/util/Set<Lorg/opensaml/saml/metadata/resolver/index/MetadataIndexKey;>;>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/google/common/base/Function");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$EntityIDToSHA1SourceIDIndexingFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$EntityIDToSHA1SourceIDIndexingFunction", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceIDExtensionIndexingFunction", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceLocationIndexingFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$SourceLocationIndexingFunction", "<init>", "()V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Lists", "newArrayList", "([Ljava/lang/Object;)Ljava/util/ArrayList;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;)V", "(Ljava/util/List<Lcom/google/common/base/Function<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;Ljava/util/Set<Lorg/opensaml/saml/metadata/resolver/index/MetadataIndexKey;>;>;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("EntityDescriptor indexing functions list may not be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Predicates", "notNull", "()Lcom/google/common/base/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Collections2", "filter", "(Ljava/util/Collection;Lcom/google/common/base/Predicate;)Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "indexingFunctions", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "indexingFunctions", "Ljava/util/List;");
methodVisitor.visitLdcInsn("EntityDescriptor indexing functions list may not be empty");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotEmpty", "(Ljava/util/Collection;Ljava/lang/String;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateKeys", "(Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;)Ljava/util/Set;", "(Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;)Ljava/util/Set<Lorg/opensaml/saml/metadata/resolver/index/MetadataIndexKey;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("EntityDescriptor was null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex", "indexingFunctions", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/HashSet", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateKeys", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/util/Set;", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/util/Set<Lorg/opensaml/saml/metadata/resolver/index/MetadataIndexKey;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("CriteriaSet was null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/criterion/ArtifactCriterion;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/criterion/ArtifactCriterion");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/collection/LazySet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/collection/LazySet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/criterion/ArtifactCriterion", "getArtifact", "()Lorg/opensaml/saml/common/binding/artifact/SAMLArtifact;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/saml/common/binding/artifact/SAMLSourceIDArtifact");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceIDMetadataIndexKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/binding/artifact/SAMLSourceIDArtifact");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/common/binding/artifact/SAMLSourceIDArtifact", "getSourceID", "()[B", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceIDMetadataIndexKey", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/opensaml/saml/criterion/ArtifactCriterion", "net/shibboleth/utilities/java/support/collection/LazySet", "org/opensaml/saml/common/binding/artifact/SAMLArtifact"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/opensaml/saml/common/binding/artifact/SAMLSourceLocationArtifact");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceLocationMetadataIndexKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/binding/artifact/SAMLSourceLocationArtifact");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/common/binding/artifact/SAMLSourceLocationArtifact", "getSourceLocation", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/index/impl/SAMLArtifactMetadataIndex$ArtifactSourceLocationMetadataIndexKey", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/collection/LazySet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
