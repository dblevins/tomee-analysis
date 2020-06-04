package asm.org.apache.bval.jsr.util;
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
public class LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", null, "java/lang/Object", new String[] { "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeContextBuilder" });

classWriter.visitInnerClass("org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "LeafNodeContextBuilderImpl", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1", null, null, 0);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "jakarta/validation/ConstraintValidatorContext", "ConstraintViolationBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeBuilderDefinedContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeContextBuilder", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeContextBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "definedContext", "Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "this$0", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1", "<init>", "(Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "definedContext", "Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "atKey", "(Ljava/lang/Object;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "this$0", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "access$000", "(Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "getLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "setKey", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "definedContext", "Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "atIndex", "(Ljava/lang/Integer;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "this$0", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "access$000", "(Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "getLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "setIndex", "(Ljava/lang/Integer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "definedContext", "Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConstraintViolation", "()Ljakarta/validation/ConstraintValidatorContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "this$0", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "addConstraintViolation", "()Ljakarta/validation/ConstraintValidatorContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "<init>", "(Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
