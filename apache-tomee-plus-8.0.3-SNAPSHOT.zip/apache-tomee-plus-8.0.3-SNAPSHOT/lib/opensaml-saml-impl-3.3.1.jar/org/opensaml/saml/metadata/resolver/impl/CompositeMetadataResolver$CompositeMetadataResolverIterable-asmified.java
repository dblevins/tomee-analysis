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
public class CompositeMetadataResolver$CompositeMetadataResolverIterableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "Ljava/lang/Object;Ljava/lang/Iterable<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver", "CompositeMetadataResolverIterable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "CompositeMetadataResolverIterator", ACC_PRIVATE);

classWriter.visitInnerClass("com/google/common/collect/ImmutableList$Builder", "com/google/common/collect/ImmutableList", "Builder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "resolvers", "Ljava/util/List;", "Ljava/util/List<Lorg/opensaml/saml/metadata/resolver/MetadataResolver;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "criteria", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)V", "(Ljava/util/List<Lorg/opensaml/saml/metadata/resolver/MetadataResolver;>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/ImmutableList", "builder", "()Lcom/google/common/collect/ImmutableList$Builder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/Predicates", "notNull", "()Lcom/google/common/base/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/collect/Iterables", "filter", "(Ljava/lang/Iterable;Lcom/google/common/base/Predicate;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/collect/ImmutableList$Builder", "addAll", "(Ljava/lang/Iterable;)Lcom/google/common/collect/ImmutableList$Builder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/collect/ImmutableList$Builder", "build", "()Lcom/google/common/collect/ImmutableList;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "resolvers", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "criteria", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "<init>", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "resolvers", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "criteria", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)Lorg/slf4j/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
