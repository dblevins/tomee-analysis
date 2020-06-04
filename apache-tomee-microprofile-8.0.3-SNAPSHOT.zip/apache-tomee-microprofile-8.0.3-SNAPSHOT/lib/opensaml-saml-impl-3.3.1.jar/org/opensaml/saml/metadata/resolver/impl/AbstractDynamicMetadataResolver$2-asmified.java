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
public class AbstractDynamicMetadataResolver$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$2", null, "com/codahale/metrics/RatioGauge", null);

classWriter.visitOuterClass("org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver", "initializeMetricsInstrumentation", "()V");

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$2", null, null, 0);

classWriter.visitInnerClass("com/codahale/metrics/RatioGauge$Ratio", "com/codahale/metrics/RatioGauge", "Ratio", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$2", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/codahale/metrics/RatioGauge", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getRatio", "()Lcom/codahale/metrics/RatioGauge$Ratio;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$2", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver", "access$100", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;)Lcom/codahale/metrics/Timer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/codahale/metrics/Timer", "getCount", "()J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$2", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver", "access$200", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;)Lcom/codahale/metrics/Timer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/codahale/metrics/Timer", "getCount", "()J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/codahale/metrics/RatioGauge$Ratio", "of", "(DD)Lcom/codahale/metrics/RatioGauge$Ratio;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
