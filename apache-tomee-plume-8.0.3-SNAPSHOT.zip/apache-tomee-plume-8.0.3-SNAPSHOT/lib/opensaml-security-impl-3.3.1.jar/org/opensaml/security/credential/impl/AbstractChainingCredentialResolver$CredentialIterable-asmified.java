package asm.org.opensaml.security.credential.impl;
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
public class AbstractChainingCredentialResolver$CredentialIterableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "Ljava/lang/Object;Ljava/lang/Iterable<Lorg/opensaml/security/credential/Credential;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitInnerClass("org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver", "CredentialIterable", ACC_PUBLIC);

classWriter.visitInnerClass("org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver", "CredentialIterator", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parent", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver<TResolverType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "critSet", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)V", "(Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver<TResolverType;>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)V", null);
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "this$0", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "parent", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "critSet", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/opensaml/security/credential/Credential;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "this$0", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "parent", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterable", "critSet", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "<init>", "(Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
