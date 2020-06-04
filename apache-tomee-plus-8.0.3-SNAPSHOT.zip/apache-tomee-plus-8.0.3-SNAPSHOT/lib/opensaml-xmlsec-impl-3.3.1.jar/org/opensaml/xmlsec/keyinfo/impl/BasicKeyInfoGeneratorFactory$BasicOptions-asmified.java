package asm.org.opensaml.xmlsec.keyinfo.impl;
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
public class BasicKeyInfoGeneratorFactory$BasicOptionsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", null, "java/lang/Object", new String[] { "java/lang/Cloneable" });

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "BasicOptions", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitKeyNames", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitEntityIDAsKeyName", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitPublicKeyValue", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "emitPublicDEREncodedKeyValue", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "this$0", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/CloneNotSupportedException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/CloneNotSupportedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitEntityIDAsKeyName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$002", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitEntityIDAsKeyName", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitKeyNames", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$102", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitKeyNames", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitPublicKeyValue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitPublicKeyValue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitPublicDEREncodedKeyValue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$302", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "emitPublicDEREncodedKeyValue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
