package asm.jakarta.validation;
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
public class ConstraintValidatorContext$ConstraintViolationBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "jakarta/validation/ConstraintValidatorContext", "ConstraintViolationBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeContextBuilder", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeContextBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderDefinedContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "ContainerElementNodeBuilderDefinedContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeContextBuilder", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeContextBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderDefinedContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "LeafNodeBuilderDefinedContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeContextBuilder", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "NodeContextBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "NodeBuilderCustomizableContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext", "jakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder", "NodeBuilderDefinedContext", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "addNode", "(Ljava/lang/String;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addConstraintViolation", "()Ljakarta/validation/ConstraintValidatorContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPropertyNode", "(Ljava/lang/String;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderCustomizableContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addBeanNode", "()Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$LeafNodeBuilderCustomizableContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addParameterNode", "(I)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$NodeBuilderDefinedContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addContainerElementNode", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Integer;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", "(Ljava/lang/String;Ljava/lang/Class<*>;Ljava/lang/Integer;)Ljakarta/validation/ConstraintValidatorContext$ConstraintViolationBuilder$ContainerElementNodeBuilderCustomizableContext;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
