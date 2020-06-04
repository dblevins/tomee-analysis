package asm.org.apache.bval.jsr.job;
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
public class ConstraintValidatorsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/jsr/job/ConstraintValidators", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "constraintsCache", "Lorg/apache/bval/jsr/ConstraintCached;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintCached");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintCached", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ConstraintValidators", "constraintsCache", "Lorg/apache/bval/jsr/ConstraintCached;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canValidate", "(Lorg/apache/bval/jsr/descriptor/ConstraintD;Ljava/lang/Class;)Z", "<A::Ljava/lang/annotation/Annotation;>(Lorg/apache/bval/jsr/descriptor/ConstraintD<TA;>;Ljava/lang/Class<*>;)Z", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/validation/ConstraintDeclarationException");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ComputeConstraintValidatorClass");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ConstraintValidators", "constraintsCache", "Lorg/apache/bval/jsr/ConstraintCached;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/validation/constraintvalidation/ValidationTarget", "ANNOTATED_ELEMENT", "Ljavax/validation/constraintvalidation/ValidationTarget;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ComputeConstraintValidatorClass", "<init>", "(Lorg/apache/bval/jsr/ConstraintCached;Lorg/apache/bval/jsr/descriptor/ConstraintD;Ljavax/validation/constraintvalidation/ValidationTarget;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/job/ComputeConstraintValidatorClass", "get", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/bval/jsr/job/ConstraintValidators", "org/apache/bval/jsr/descriptor/ConstraintD", "java/lang/Class", "org/apache/bval/jsr/job/ComputeConstraintValidatorClass"}, 1, new Object[] {"javax/validation/ConstraintDeclarationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
