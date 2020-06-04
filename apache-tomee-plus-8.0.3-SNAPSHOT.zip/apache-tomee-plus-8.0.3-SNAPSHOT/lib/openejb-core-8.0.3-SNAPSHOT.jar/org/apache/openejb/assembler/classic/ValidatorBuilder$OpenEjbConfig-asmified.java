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

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "<T::Ljavax/validation/Configuration<TT;>;>Ljava/lang/Object;Ljavax/validation/Configuration<TT;>;", "java/lang/Object", new String[] { "javax/validation/Configuration" });

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$Releasable", "org/apache/openejb/assembler/classic/ValidatorBuilder", "Releasable", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "org/apache/openejb/assembler/classic/ValidatorBuilder", "OpenEjbConfig", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "org/apache/openejb/assembler/classic/ValidatorBuilder", "OpenEJBValidatorFactory", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "releasables", "Ljava/util/Collection;", "Ljava/util/Collection<Lorg/apache/openejb/assembler/classic/ValidatorBuilder$Releasable<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Ljavax/validation/Configuration;", "Ljavax/validation/Configuration<TT;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bootstrap", "Ljavax/validation/BootstrapConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/validation/BootstrapConfiguration;Ljavax/validation/Configuration;)V", "(Ljavax/validation/BootstrapConfiguration;Ljavax/validation/Configuration<TT;>;)V", null);
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "bootstrap", "Ljavax/validation/BootstrapConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ignoreXmlConfiguration", "()Ljavax/validation/Configuration;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "ignoreXmlConfiguration", "()Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "messageInterpolator", "(Ljavax/validation/MessageInterpolator;)Ljavax/validation/Configuration;", "(Ljavax/validation/MessageInterpolator;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "messageInterpolator", "(Ljavax/validation/MessageInterpolator;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "traversableResolver", "(Ljavax/validation/TraversableResolver;)Ljavax/validation/Configuration;", "(Ljavax/validation/TraversableResolver;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "traversableResolver", "(Ljavax/validation/TraversableResolver;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "constraintValidatorFactory", "(Ljavax/validation/ConstraintValidatorFactory;)Ljavax/validation/Configuration;", "(Ljavax/validation/ConstraintValidatorFactory;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "constraintValidatorFactory", "(Ljavax/validation/ConstraintValidatorFactory;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMapping", "(Ljava/io/InputStream;)Ljavax/validation/Configuration;", "(Ljava/io/InputStream;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "addMapping", "(Ljava/io/InputStream;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/validation/Configuration;", "(Ljava/lang/String;Ljava/lang/String;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "addProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultMessageInterpolator", "()Ljavax/validation/MessageInterpolator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "getDefaultMessageInterpolator", "()Ljavax/validation/MessageInterpolator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultTraversableResolver", "()Ljavax/validation/TraversableResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "getDefaultTraversableResolver", "()Ljavax/validation/TraversableResolver;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultConstraintValidatorFactory", "()Ljavax/validation/ConstraintValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "getDefaultConstraintValidatorFactory", "()Ljavax/validation/ConstraintValidatorFactory;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildValidatorFactory", "()Ljavax/validation/ValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "buildValidatorFactory", "()Ljavax/validation/ValidatorFactory;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "releasables", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEJBValidatorFactory", "<init>", "(Ljavax/validation/ValidatorFactory;Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameterNameProvider", "(Ljavax/validation/ParameterNameProvider;)Ljavax/validation/Configuration;", "(Ljavax/validation/ParameterNameProvider;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "parameterNameProvider", "(Ljavax/validation/ParameterNameProvider;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "getDefaultParameterNameProvider", "()Ljavax/validation/ParameterNameProvider;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBootstrapConfiguration", "()Ljavax/validation/BootstrapConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "bootstrap", "Ljavax/validation/BootstrapConfiguration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clockProvider", "(Ljavax/validation/ClockProvider;)Ljavax/validation/Configuration;", "(Ljavax/validation/ClockProvider;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "clockProvider", "(Ljavax/validation/ClockProvider;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addValueExtractor", "(Ljavax/validation/valueextraction/ValueExtractor;)Ljavax/validation/Configuration;", "(Ljavax/validation/valueextraction/ValueExtractor<*>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "addValueExtractor", "(Ljavax/validation/valueextraction/ValueExtractor;)Ljavax/validation/Configuration;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDefaultClockProvider", "()Ljavax/validation/ClockProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ValidatorBuilder$OpenEjbConfig", "delegate", "Ljavax/validation/Configuration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "getDefaultClockProvider", "()Ljavax/validation/ClockProvider;", true);
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
