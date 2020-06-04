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
public class ContainerElementNodeContextBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", null, "java/lang/Object", new String[] { "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeContextBuilder" });

classWriter.visitInnerClass("org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "org/apache/bval/jsr/job/ConstraintValidatorContextImpl", "ConstraintViolationBuilderImpl", ACC_PUBLIC);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "javax/validation/ConstraintValidatorContext", "ConstraintViolationBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderDefinedContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeBuilderDefinedContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "NodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeContextBuilder", "javax/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeContextBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "path", "Lorg/apache/bval/jsr/util/PathImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl<*>.ConstraintViolationBuilderImpl;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl<*>.ConstraintViolationBuilderImpl;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "ofLegalState", "()Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "getLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "inIterable", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "atKey", "(Ljava/lang/Object;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderDefinedContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "getLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "setKey", "(Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/ContainerElementNodeBuilderDefinedContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/ContainerElementNodeBuilderDefinedContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "atIndex", "(Ljava/lang/Integer;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderDefinedContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/PathImpl", "getLeafNode", "()Lorg/apache/bval/jsr/util/NodeImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/util/NodeImpl", "setIndex", "(Ljava/lang/Integer;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/ContainerElementNodeBuilderDefinedContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/ContainerElementNodeBuilderDefinedContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addPropertyNode", "(Ljava/lang/String;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/NodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/NodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/String;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addBeanNode", "()Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/LeafNodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addContainerElementNode", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", "(Ljava/lang/String;Ljava/lang/Class<*>;Ljava/lang/Integer;)Ljavax/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/util/ContainerElementNodeBuilderCustomizableContextImpl", "<init>", "(Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addConstraintViolation", "()Ljavax/validation/ConstraintValidatorContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "builder", "Lorg/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/util/ContainerElementNodeContextBuilderImpl", "path", "Lorg/apache/bval/jsr/util/PathImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ConstraintValidatorContextImpl$ConstraintViolationBuilderImpl", "addConstraintViolation", "(Lorg/apache/bval/jsr/util/PathImpl;)Ljavax/validation/ConstraintValidatorContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
