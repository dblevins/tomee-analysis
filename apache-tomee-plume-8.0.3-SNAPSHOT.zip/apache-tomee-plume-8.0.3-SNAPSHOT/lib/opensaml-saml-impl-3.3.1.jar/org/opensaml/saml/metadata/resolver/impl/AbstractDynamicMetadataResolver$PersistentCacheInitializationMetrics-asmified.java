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
public class AbstractDynamicMetadataResolver$PersistentCacheInitializationMetricsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver", "PersistentCacheInitializationMetrics", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/google/common/base/MoreObjects$ToStringHelper", "com/google/common/base/MoreObjects", "ToStringHelper", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "enabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "processingTime", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entriesTotal", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entriesLoaded", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entriesSkippedAlreadyLive", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entriesSkippedInvalid", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entriesSkippedFailedPredicate", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entriesSkippedProcessingException", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "enabled", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProcessingTime", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "processingTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntriesTotal", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesTotal", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntriesLoaded", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesLoaded", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntriesSkippedAlreadyLive", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedAlreadyLive", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntriesSkippedInvalid", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedInvalid", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntriesSkippedFailedPredicate", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedFailedPredicate", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEntriesSkippedProcessingException", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedProcessingException", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/google/common/base/MoreObjects", "toStringHelper", "(Ljava/lang/Object;)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("enabled");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "enabled", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;Z)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("processingTime");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "processingTime", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;J)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("entriesTotal");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesTotal", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;I)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("entriesLoaded");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesLoaded", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;I)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("entriesSkippedAlreadyLive");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedAlreadyLive", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;I)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("entriesSkippedInvalid");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedInvalid", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;I)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("entriesSkippedFailedPredicate");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedFailedPredicate", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;I)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitLdcInsn("entriesSkippedProcessingException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedProcessingException", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "add", "(Ljava/lang/String;I)Lcom/google/common/base/MoreObjects$ToStringHelper;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/google/common/base/MoreObjects$ToStringHelper", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$002", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "enabled", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$408", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesTotal", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesTotal", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$508", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedAlreadyLive", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedAlreadyLive", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$602", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(DUP2_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "processingTime", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$708", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesLoaded", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesLoaded", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$808", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedProcessingException", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedProcessingException", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$908", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedFailedPredicate", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedFailedPredicate", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1008", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedInvalid", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$PersistentCacheInitializationMetrics", "entriesSkippedInvalid", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
