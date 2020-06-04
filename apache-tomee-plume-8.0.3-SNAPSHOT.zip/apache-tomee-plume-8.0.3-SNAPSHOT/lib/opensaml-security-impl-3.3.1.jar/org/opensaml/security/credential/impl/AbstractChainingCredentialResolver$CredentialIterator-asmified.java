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
public class AbstractChainingCredentialResolver$CredentialIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/opensaml/security/credential/Credential;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver", "CredentialIterator", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parent", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver<TResolverType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "critSet", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resolverIterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<TResolverType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "credentialIterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/opensaml/security/credential/Credential;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currentResolver", "Lorg/opensaml/security/credential/CredentialResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nextCredential", "Lorg/opensaml/security/credential/Credential;", null, null);
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "this$0", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Parent resolver cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "parent", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "critSet", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "parent", "Lorg/opensaml/security/credential/impl/AbstractChainingCredentialResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver", "getResolverChain", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "resolverIterator", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "getNextCredentialIterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "nextCredential", "Lorg/opensaml/security/credential/Credential;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "nextCredential", "Lorg/opensaml/security/credential/Credential;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "getNextCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "nextCredential", "Lorg/opensaml/security/credential/Credential;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "nextCredential", "Lorg/opensaml/security/credential/Credential;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/opensaml/security/credential/Credential;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "nextCredential", "Lorg/opensaml/security/credential/Credential;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "nextCredential", "Lorg/opensaml/security/credential/Credential;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "nextCredential", "Lorg/opensaml/security/credential/Credential;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "getNextCredential", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/security/credential/Credential"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No more Credential elements are available");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Remove operation is not supported by this iterator");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getNextCredentialIterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/opensaml/security/credential/Credential;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "net/shibboleth/utilities/java/support/resolver/ResolverException");
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "resolverIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "resolverIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/credential/CredentialResolver");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "currentResolver", "Lorg/opensaml/security/credential/CredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Getting credential iterator from next resolver in chain: {}");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "currentResolver", "Lorg/opensaml/security/credential/CredentialResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "currentResolver", "Lorg/opensaml/security/credential/CredentialResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "critSet", "Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/security/credential/CredentialResolver", "resolve", "(Ljava/lang/Object;)Ljava/lang/Iterable;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"net/shibboleth/utilities/java/support/resolver/ResolverException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Error resolving credentials from chaining resolver member '%s'");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "currentResolver", "Lorg/opensaml/security/credential/CredentialResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "resolverIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Will attempt to resolve credentials from next member of resolver chain");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("No more credential resolvers available in the resolver chain");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "currentResolver", "Lorg/opensaml/security/credential/CredentialResolver;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getNextCredential", "()Lorg/opensaml/security/credential/Credential;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/credential/Credential");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "getNextCredentialIterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/credential/Credential");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "getNextCredentialIterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "credentialIterator", "Ljava/util/Iterator;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/credential/impl/AbstractChainingCredentialResolver$CredentialIterator", "next", "()Lorg/opensaml/security/credential/Credential;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
