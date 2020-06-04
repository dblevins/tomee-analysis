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
public class AbstractDynamicMetadataResolver$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$1", null, "java/util/TimerTask", null);

classWriter.visitOuterClass("org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver", "initMetadataResolver", "()V");

classWriter.visitInnerClass("org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$1", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TimerTask", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver$1", "this$0", "Lorg/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/metadata/resolver/impl/AbstractDynamicMetadataResolver", "initializeFromPersistentCache", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
