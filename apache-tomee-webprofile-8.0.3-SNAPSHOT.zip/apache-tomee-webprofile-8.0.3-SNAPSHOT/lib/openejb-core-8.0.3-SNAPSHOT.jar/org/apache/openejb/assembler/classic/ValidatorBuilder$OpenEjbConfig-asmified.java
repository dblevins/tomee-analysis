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
public class ValidatorBuilder$OpenEjbConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "<T::Ljakarta/validation/Configuration<TT;>;>Ljava/lang/Object;Ljakarta/validation/Configuration<TT;>;", "java/lang/Object", new String[] { "jakarta/validation/Configuration" });

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$Releasable", "org/apache/openejb/assembler/classic/ValidatorBuilder", "Releasable", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "org/apache/openejb/assembler/classic/ValidatorBuilder", "OpenEjbConfig", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "org/apache/openejb/assembler/classic/ValidatorBuilder", "OpenEJBValidatorFactory", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "releasables", "Ljava/util/Collection;", "Ljava/util/Collection<Lorg/apache/openejb/assembler/classic/ValidatorBuilder$Releasable<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljakarta/validation/Configuration;", "Ljakarta/validation/Configuration<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bootstrap", "Ljakarta/validation/BootstrapConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/validation/BootstrapConfiguration;Ljakarta/validation/Configuration;)V", "(Ljakarta/validation/BootstrapConfiguration;Ljakarta/validation/Configuration<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "releasables", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "bootstrap", "Ljakarta/validation/BootstrapConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ignoreXmlConfiguration", "()Ljakarta/validation/Configuration;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "ignoreXmlConfiguration", "()Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "messageInterpolator", "(Ljakarta/validation/MessageInterpolator;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/MessageInterpolator;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "messageInterpolator", "(Ljakarta/validation/MessageInterpolator;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "traversableResolver", "(Ljakarta/validation/TraversableResolver;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/TraversableResolver;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "traversableResolver", "(Ljakarta/validation/TraversableResolver;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "constraintValidatorFactory", "(Ljakarta/validation/ConstraintValidatorFactory;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/ConstraintValidatorFactory;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "constraintValidatorFactory", "(Ljakarta/validation/ConstraintValidatorFactory;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMapping", "(Ljava/io/InputStream;)Ljakarta/validation/Configuration;", "(Ljava/io/InputStream;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "addMapping", "(Ljava/io/InputStream;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/validation/Configuration;", "(Ljava/lang/String;Ljava/lang/String;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "addProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultMessageInterpolator", "()Ljakarta/validation/MessageInterpolator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "getDefaultMessageInterpolator", "()Ljakarta/validation/MessageInterpolator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultTraversableResolver", "()Ljakarta/validation/TraversableResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "getDefaultTraversableResolver", "()Ljakarta/validation/TraversableResolver;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultConstraintValidatorFactory", "()Ljakarta/validation/ConstraintValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "getDefaultConstraintValidatorFactory", "()Ljakarta/validation/ConstraintValidatorFactory;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildValidatorFactory", "()Ljakarta/validation/ValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "buildValidatorFactory", "()Ljakarta/validation/ValidatorFactory;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "releasables", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "<init>", "(Ljakarta/validation/ValidatorFactory;Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameterNameProvider", "(Ljakarta/validation/ParameterNameProvider;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/ParameterNameProvider;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "parameterNameProvider", "(Ljakarta/validation/ParameterNameProvider;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultParameterNameProvider", "()Ljakarta/validation/ParameterNameProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "getDefaultParameterNameProvider", "()Ljakarta/validation/ParameterNameProvider;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBootstrapConfiguration", "()Ljakarta/validation/BootstrapConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "bootstrap", "Ljakarta/validation/BootstrapConfiguration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clockProvider", "(Ljakarta/validation/ClockProvider;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/ClockProvider;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "clockProvider", "(Ljakarta/validation/ClockProvider;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addValueExtractor", "(Ljakarta/validation/valueextraction/ValueExtractor;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/valueextraction/ValueExtractor<*>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "addValueExtractor", "(Ljakarta/validation/valueextraction/ValueExtractor;)Ljakarta/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultClockProvider", "()Ljakarta/validation/ClockProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljakarta/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "getDefaultClockProvider", "()Ljakarta/validation/ClockProvider;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig;)Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "releasables", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
