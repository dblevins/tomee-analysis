package asm.org.apache.openejb.assembler.classic;
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
public class ValidatorBuilder$OpenEJBValidatorFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", null, "java/lang/Object", new String[] { "javax/validation/ValidatorFactory", "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$Releasable", "org/apache/openejb/assembler/classic/ValidatorBuilder", "Releasable", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "org/apache/openejb/assembler/classic/ValidatorBuilder", "OpenEJBValidatorFactory", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "delegate", "Ljavax/validation/ValidatorFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "toRelease", "Ljava/util/Collection;", "Ljava/util/Collection<Lorg/apache/openejb/assembler/classic/ValidatorBuilder$Releasable<*>;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/validation/ValidatorFactory;Ljava/util/Collection;)V", "(Ljavax/validation/ValidatorFactory;Ljava/util/Collection<Lorg/apache/openejb/assembler/classic/ValidatorBuilder$Releasable<*>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "Ljavax/validation/ValidatorFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "toRelease", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "delegate", "()Ljavax/validation/ValidatorFactory;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/naming/NamingException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "Ljavax/validation/ValidatorFactory;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "Ljavax/validation/ValidatorFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/bval/ValidatorUtil", "lookupFactory", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/validation/Validation", "buildDefaultValidatorFactory", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidator", "()Ljavax/validation/Validator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "getValidator", "()Ljavax/validation/Validator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "usingContext", "()Ljavax/validation/ValidatorContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "usingContext", "()Ljavax/validation/ValidatorContext;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageInterpolator", "()Ljavax/validation/MessageInterpolator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "getMessageInterpolator", "()Ljavax/validation/MessageInterpolator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTraversableResolver", "()Ljavax/validation/TraversableResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "getTraversableResolver", "()Ljavax/validation/TraversableResolver;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstraintValidatorFactory", "()Ljavax/validation/ConstraintValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "getConstraintValidatorFactory", "()Ljavax/validation/ConstraintValidatorFactory;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "unwrap", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "getParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClockProvider", "()Ljavax/validation/ClockProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "()Ljavax/validation/ValidatorFactory;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "getClockProvider", "()Ljavax/validation/ClockProvider;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "Ljavax/validation/ValidatorFactory;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "delegate", "Ljavax/validation/ValidatorFactory;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/ValidatorFactory", "close", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "toRelease", "Ljava/util/Collection;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "toRelease", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ValidatorBuilder$Releasable");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/assembler/classic/ValidatorBuilder$Releasable", "access$200", "(Lorg/apache/openejb/assembler/classic/ValidatorBuilder$Releasable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
