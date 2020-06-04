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
public class BasicKeyInfoGeneratorFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", null, "java/lang/Object", new String[] { "org/opensaml/xmlsec/keyinfo/KeyInfoGeneratorFactory" });

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "BasicOptions", ACC_PROTECTED);

classWriter.visitInnerClass("org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "BasicKeyInfoGenerator", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "newOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCredentialType", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Lorg/opensaml/security/credential/Credential;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/credential/Credential;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handles", "(Lorg/opensaml/security/credential/Credential;)Z", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInstance", "()Lorg/opensaml/xmlsec/keyinfo/KeyInfoGenerator;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "clone", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicKeyInfoGenerator", "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitEntityIDAsKeyName", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$000", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitEntityIDAsKeyName", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$002", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitKeyNames", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$100", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitKeyNames", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$102", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitPublicKeyValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$200", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitPublicKeyValue", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$202", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "emitPublicDEREncodedKeyValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$300", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEmitPublicDEREncodedKeyValue", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "access$302", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions", "<init>", "(Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getOptions", "()Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory", "options", "Lorg/opensaml/xmlsec/keyinfo/impl/BasicKeyInfoGeneratorFactory$BasicOptions;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
