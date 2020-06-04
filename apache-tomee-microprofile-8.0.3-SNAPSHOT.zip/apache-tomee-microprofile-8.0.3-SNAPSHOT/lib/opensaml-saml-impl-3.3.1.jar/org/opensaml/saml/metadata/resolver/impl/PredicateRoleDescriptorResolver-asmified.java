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
public class PredicateRoleDescriptorResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", null, "net/shibboleth/utilities/java/support/component/AbstractIdentifiedInitializableComponent", new String[] { "org/opensaml/saml/metadata/resolver/RoleDescriptorResolver" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "IS_VALID_PREDICATE", "Lcom/google/common/base/Predicate;", "Lcom/google/common/base/Predicate<Lorg/opensaml/core/xml/XMLObject;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requireValidMetadata", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entityDescriptorResolver", "Lorg/opensaml/saml/metadata/resolver/MetadataResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "satisfyAnyPredicates", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "criterionPredicateRegistry", "Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;", "Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "useDefaultPredicateRegistry", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resolveViaPredicatesOnly", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/saml/metadata/resolver/MetadataResolver;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/AbstractIdentifiedInitializableComponent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Resolver for EntityDescriptors may not be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/metadata/resolver/MetadataResolver");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "entityDescriptorResolver", "Lorg/opensaml/saml/metadata/resolver/MetadataResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/UUID", "randomUUID", "()Ljava/util/UUID;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/UUID", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "setId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "requireValidMetadata", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "useDefaultPredicateRegistry", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRequireValidMetadata", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "requireValidMetadata", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequireValidMetadata", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "requireValidMetadata", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSatisfyAnyPredicates", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "satisfyAnyPredicates", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSatisfyAnyPredicates", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "satisfyAnyPredicates", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCriterionPredicateRegistry", "()Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;", "()Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "criterionPredicateRegistry", "Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCriterionPredicateRegistry", "(Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;)V", "(Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "criterionPredicateRegistry", "Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isUseDefaultPredicateRegistry", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "useDefaultPredicateRegistry", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUseDefaultPredicateRegistry", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "useDefaultPredicateRegistry", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isResolveViaPredicatesOnly", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "resolveViaPredicatesOnly", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResolveViaPredicatesOnly", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "resolveViaPredicatesOnly", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInitialize", "()V", null, new String[] { "net/shibboleth/utilities/java/support/component/ComponentInitializationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/AbstractIdentifiedInitializableComponent", "doInitialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "getCriterionPredicateRegistry", "()Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "isUseDefaultPredicateRegistry", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/criteria/role/impl/RoleDescriptorCriterionPredicateRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/criteria/role/impl/RoleDescriptorCriterionPredicateRegistry", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "setCriterionPredicateRegistry", "(Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolveSingle", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;", null, new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifNotInitializedThrowUninitializedComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "resolve", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/metadata/RoleDescriptor");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Iterable"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolve", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable;", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;", new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifNotInitializedThrowUninitializedComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "entityDescriptorResolver", "Lorg/opensaml/saml/metadata/resolver/MetadataResolver;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/metadata/resolver/MetadataResolver", "resolve", "(Ljava/lang/Object;)Ljava/lang/Iterable;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved no EntityDescriptors via underlying MetadataResolver, returning empty collection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Iterable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isDebugEnabled", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved {} source EntityDescriptors");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "size", "(Ljava/lang/Iterable;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "isRequireValidMetadata", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "IS_VALID_PREDICATE", "Lcom/google/common/base/Predicate;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Predicates", "alwaysTrue", "()Lcom/google/common/base/Predicate;", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"com/google/common/base/Predicate"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "haveRoleCriteria", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "getCandidatesByRoleAndProtocol", "(Ljava/lang/Iterable;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isDebugEnabled", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved {} RoleDescriptor candidates via role criteria, performing predicate filtering");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "size", "(Ljava/lang/Iterable;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"com/google/common/base/Predicate", "java/lang/Iterable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "filter", "(Ljava/lang/Iterable;Lcom/google/common/base/Predicate;)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "predicateFilterCandidates", "(Ljava/lang/Iterable;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Z)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "isResolveViaPredicatesOnly", "()Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "getAllCandidates", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isDebugEnabled", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved {} RoleDescriptor total candidates for predicate-only resolution");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "size", "(Ljava/lang/Iterable;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Iterable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "filter", "(Ljava/lang/Iterable;Lcom/google/common/base/Predicate;)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "predicateFilterCandidates", "(Ljava/lang/Iterable;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Z)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Found no role criteria and predicate-only resolution is disabled, returning empty collection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "haveRoleCriteria", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Z", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/criterion/EntityRoleCriterion;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "contains", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getCandidatesByRoleAndProtocol", "(Ljava/lang/Iterable;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable;", "(Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;", null);
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
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/criterion/EntityRoleCriterion;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitLdcInsn("EntityRoleCriterion was not supplied");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/criterion/EntityRoleCriterion");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/criterion/ProtocolCriterion;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/criterion/ProtocolCriterion");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "java/lang/Iterable", "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "org/opensaml/saml/criterion/EntityRoleCriterion", "org/opensaml/saml/criterion/ProtocolCriterion", "java/util/ArrayList", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/metadata/EntityDescriptor");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/criterion/EntityRoleCriterion", "getRole", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/criterion/ProtocolCriterion", "getProtocol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/EntityDescriptor", "getRoleDescriptors", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/saml/saml2/metadata/EntityDescriptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/criterion/EntityRoleCriterion", "getRole", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/EntityDescriptor", "getRoleDescriptors", "(Ljavax/xml/namespace/QName;)Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "concat", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAllCandidates", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "(Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;)Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/ArrayList", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/metadata/EntityDescriptor");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/EntityDescriptor", "getRoleDescriptors", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayList", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "concat", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "predicateFilterCandidates", "(Ljava/lang/Iterable;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Z)Ljava/lang/Iterable;", "(Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Z)Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;>;", new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Candidates iteration was empty, nothing to filter via predicates");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Attempting to filter candidate RoleDescriptors via resolved Predicates");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/metadata/criteria/role/EvaluableRoleDescriptorCriterion;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "getCriterionPredicateRegistry", "()Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/resolver/ResolverSupport", "getPredicates", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;Ljava/lang/Class;Lnet/shibboleth/utilities/java/support/resolver/CriterionPredicateRegistry;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Resolved {} Predicates: {}");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/core/criterion/SatisfyAnyCriterion;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/criterion/SatisfyAnyCriterion");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("CriteriaSet contained SatisfyAnyCriterion");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/criterion/SatisfyAnyCriterion", "isSatisfyAny", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Set", Opcodes.TOP, "org/opensaml/core/criterion/SatisfyAnyCriterion"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("CriteriaSet did NOT contain SatisfyAnyCriterion");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "isSatisfyAnyPredicates", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "java/lang/Iterable", "net/shibboleth/utilities/java/support/resolver/CriteriaSet", Opcodes.INTEGER, "java/util/Set", Opcodes.INTEGER, "org/opensaml/core/criterion/SatisfyAnyCriterion"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Effective satisyAny value: {}");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "trace", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/resolver/ResolverSupport", "getFilteredIterable", "(Ljava/lang/Iterable;Ljava/util/Set;ZZ)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isDebugEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("After predicate filtering {} RoleDescriptors remain");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "size", "(Ljava/lang/Iterable;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Iterable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "resolveSingle", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "resolveSingle", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "resolve", "(Ljava/lang/Object;)Ljava/lang/Iterable;", null, new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "resolve", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/common/IsTimeboundSAMLObjectValidPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/common/IsTimeboundSAMLObjectValidPredicate", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/metadata/resolver/impl/PredicateRoleDescriptorResolver", "IS_VALID_PREDICATE", "Lcom/google/common/base/Predicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
