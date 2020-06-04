package asm.javax.validation;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/validation/Validation", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/validation/Validation$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("javax/validation/Validation$DefaultValidationProviderResolver", "javax/validation/Validation", "DefaultValidationProviderResolver", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/Validation$GenericBootstrapImpl", "javax/validation/Validation", "GenericBootstrapImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("javax/validation/Validation$ProviderSpecificBootstrapImpl", "javax/validation/Validation", "ProviderSpecificBootstrapImpl", ACC_PRIVATE | ACC_STATIC);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildDefaultValidatorFactory", "()Ljavax/validation/ValidatorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/validation/Validation", "byDefaultProvider", "()Ljavax/validation/bootstrap/GenericBootstrap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/bootstrap/GenericBootstrap", "configure", "()Ljavax/validation/Configuration;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/validation/Configuration", "buildValidatorFactory", "()Ljavax/validation/ValidatorFactory;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "byDefaultProvider", "()Ljavax/validation/bootstrap/GenericBootstrap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/validation/Validation$GenericBootstrapImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/Validation$GenericBootstrapImpl", "<init>", "(Ljavax/validation/Validation$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "byProvider", "(Ljava/lang/Class;)Ljavax/validation/bootstrap/ProviderSpecificBootstrap;", "<T::Ljavax/validation/Configuration<TT;>;U::Ljavax/validation/spi/ValidationProvider<TT;>;>(Ljava/lang/Class<TU;>;)Ljavax/validation/bootstrap/ProviderSpecificBootstrap<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/validation/Validation$ProviderSpecificBootstrapImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/validation/Validation$ProviderSpecificBootstrapImpl", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
