package asm.org.apache.bval.constraints;
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
public class NumberSignValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/bval/constraints/NumberSignValidator", "<A::Ljava/lang/annotation/Annotation;>Ljava/lang/Object;Ljavax/validation/ConstraintValidator<TA;Ljava/lang/Number;>;", "java/lang/Object", new String[] { "javax/validation/ConstraintValidator" });

classWriter.visitInnerClass("org/apache/bval/constraints/NumberSignValidator$ForNegative", "org/apache/bval/constraints/NumberSignValidator", "ForNegative", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/constraints/NumberSignValidator$ForPositive", "org/apache/bval/constraints/NumberSignValidator", "ForPositive", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "comparisonTest", "Ljava/util/function/IntPredicate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/function/IntPredicate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/function/IntPredicate");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/constraints/NumberSignValidator", "comparisonTest", "Ljava/util/function/IntPredicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isValid", "(Ljava/lang/Number;Ljavax/validation/ConstraintValidatorContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Number", "doubleValue", "()D", false);
methodVisitor.visitVarInsn(DSTORE, 3);
methodVisitor.visitVarInsn(DLOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "isNaN", "(D)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.DOUBLE}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/constraints/NumberSignValidator", "comparisonTest", "Ljava/util/function/IntPredicate;");
methodVisitor.visitVarInsn(DLOAD, 3);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "compare", "(DD)I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/IntPredicate", "test", "(I)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isValid", "(Ljava/lang/Object;Ljavax/validation/ConstraintValidatorContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Number");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/constraints/NumberSignValidator", "isValid", "(Ljava/lang/Number;Ljavax/validation/ConstraintValidatorContext;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
