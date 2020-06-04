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
public class ContainerElementNodeBuilderCustomizableContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", null, "java/lang/Object", new String[] { "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext" });

classWriter.visitInnerClass("org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "ConstraintViolationBuilderImpl", ACC_PUBLIC);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "jakarta/validation/ConstraintValidatorContext", "ConstraintViolationBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeContextBuilder", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeContextBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "NodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/util/NodeImpl$ContainerElementNodeImpl", "org/apache/bval/jsr/util/NodeImpl", "ContainerElementNodeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/validation/Path$Node", "jakarta/validation/Path", "Node", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "path", "Lorg/apache/bval/jsr/util/PathImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl<*>.ConstraintViolationBuilderImpl;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", "(Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/String;Ljava/lang/Class<*>;Ljava/lang/Integer;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl<*>.ConstraintViolationBuilderImpl;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "ofLegalState", "()Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeImpl$ContainerElementNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$ContainerElementNodeImpl", "<init>", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addNode", "(Ljakarta/validation/Path$Node;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inIterable", "()Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeContextBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addPropertyNode", "(Ljava/lang/String;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/String;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addBeanNode", "()Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addContainerElementNode", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", "(Ljava/lang/String;Ljava/lang/Class<*>;Ljava/lang/Integer;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeImpl$ContainerElementNodeImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeImpl$ContainerElementNodeImpl", "<init>", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "addNode", "(Ljakarta/validation/Path$Node;)Lorg/apache/bval/jsr/util/PathImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConstraintViolation", "()Ljakarta/validation/ConstraintValidatorContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "addConstraintViolation", "(Lorg/apache/bval/jsr/util/PathImpl;)Ljakarta/validation/ConstraintValidatorContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
