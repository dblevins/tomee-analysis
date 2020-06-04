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
public class CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver", "CompositeMetadataResolverIterable", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "CompositeMetadataResolverIterator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resolverIterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/opensaml/saml/metadata/resolver/MetadataResolver;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currentResolver", "Lorg/opensaml/saml/metadata/resolver/MetadataResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currentResolverMetadataIterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "access$000", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "resolverIterator", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolverMetadataIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "proceedToNextResolverIterator", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolverMetadataIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolverMetadataIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "proceedToNextResolverIterator", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolverMetadataIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/metadata/EntityDescriptor");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "proceedToNextResolverIterator", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "net/shibboleth/utilities/java/support/resolver/ResolverException");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "resolverIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "resolverIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/metadata/resolver/MetadataResolver");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolver", "Lorg/opensaml/saml/metadata/resolver/MetadataResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolver", "Lorg/opensaml/saml/metadata/resolver/MetadataResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "access$100", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/metadata/resolver/MetadataResolver", "resolve", "(Ljava/lang/Object;)Ljava/lang/Iterable;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolverMetadataIterator", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "currentResolverMetadataIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"net/shibboleth/utilities/java/support/resolver/ResolverException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable", "access$200", "(Lorg/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable;)Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Error encountered attempting to fetch results from resolver");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/CompositeMetadataResolver$CompositeMetadataResolverIterable$CompositeMetadataResolverIterator", "next", "()Lorg/opensaml/saml/saml2/metadata/EntityDescriptor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
