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
public class LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1", null, "java/lang/Object", new String[] { "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext" });

classWriter.visitOuterClass("org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", null, null);

classWriter.visitInnerClass("org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "LeafNodeContextBuilderImpl", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1", null, null, 0);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "javax/validation/ConstraintValidatorContext", "ConstraintViolationBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeBuilderDefinedContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1", "this$1", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConstraintViolation", "()Ljavax/validation/ConstraintValidatorContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl$1", "this$1", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl$LeafNodeContextBuilderImpl", "this$0", "Lorg/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "addConstraintViolation", "()Ljavax/validation/ConstraintValidatorContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
