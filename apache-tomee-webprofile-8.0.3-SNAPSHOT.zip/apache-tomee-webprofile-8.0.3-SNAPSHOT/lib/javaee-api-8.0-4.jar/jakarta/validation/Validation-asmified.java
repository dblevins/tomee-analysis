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
public class ValidationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/validation/Validation", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/validation/Validation$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/validation/Validation$DefaultValidationProviderResolver", "jakarta/validation/Validation", "DefaultValidationProviderResolver", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("jakarta/validation/Validation$GenericBootstrapImpl", "jakarta/validation/Validation", "GenericBootstrapImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("jakarta/validation/Validation$ProviderSpecificBootstrapImpl", "jakarta/validation/Validation", "ProviderSpecificBootstrapImpl", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildDefaultValidatorFactory", "()Ljakarta/validation/ValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/validation/Validation", "byDefaultProvider", "()Ljakarta/validation/bootstrap/GenericBootstrap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/bootstrap/GenericBootstrap", "configure", "()Ljakarta/validation/Configuration;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/Configuration", "buildValidatorFactory", "()Ljakarta/validation/ValidatorFactory;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "byDefaultProvider", "()Ljakarta/validation/bootstrap/GenericBootstrap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/Validation$GenericBootstrapImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/Validation$GenericBootstrapImpl", "<init>", "(Ljakarta/validation/Validation$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "byProvider", "(Ljava/lang/Class;)Ljakarta/validation/bootstrap/ProviderSpecificBootstrap;", "<T::Ljakarta/validation/Configuration<TT;>;U::Ljakarta/validation/spi/ValidationProvider<TT;>;>(Ljava/lang/Class<TU;>;)Ljakarta/validation/bootstrap/ProviderSpecificBootstrap<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/validation/Validation$ProviderSpecificBootstrapImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/validation/Validation$ProviderSpecificBootstrapImpl", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
