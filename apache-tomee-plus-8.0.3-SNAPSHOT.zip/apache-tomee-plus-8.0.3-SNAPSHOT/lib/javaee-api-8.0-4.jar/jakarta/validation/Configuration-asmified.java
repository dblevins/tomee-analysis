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
public class ConfigurationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/validation/Configuration", "<T::Ljakarta/validation/Configuration<TT;>;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ignoreXmlConfiguration", "()Ljakarta/validation/Configuration;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "messageInterpolator", "(Ljakarta/validation/MessageInterpolator;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/MessageInterpolator;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "traversableResolver", "(Ljakarta/validation/TraversableResolver;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/TraversableResolver;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "constraintValidatorFactory", "(Ljakarta/validation/ConstraintValidatorFactory;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/ConstraintValidatorFactory;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addMapping", "(Ljava/io/InputStream;)Ljakarta/validation/Configuration;", "(Ljava/io/InputStream;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljakarta/validation/Configuration;", "(Ljava/lang/String;Ljava/lang/String;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultMessageInterpolator", "()Ljakarta/validation/MessageInterpolator;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultTraversableResolver", "()Ljakarta/validation/TraversableResolver;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultConstraintValidatorFactory", "()Ljakarta/validation/ConstraintValidatorFactory;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildValidatorFactory", "()Ljakarta/validation/ValidatorFactory;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parameterNameProvider", "(Ljakarta/validation/ParameterNameProvider;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/ParameterNameProvider;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultParameterNameProvider", "()Ljakarta/validation/ParameterNameProvider;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getBootstrapConfiguration", "()Ljakarta/validation/BootstrapConfiguration;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clockProvider", "(Ljakarta/validation/ClockProvider;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/ClockProvider;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addValueExtractor", "(Ljakarta/validation/valueextraction/ValueExtractor;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/valueextraction/ValueExtractor<*>;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultClockProvider", "()Ljakarta/validation/ClockProvider;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
