package asm.jakarta.validation.spi;
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
public class ValidationProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/validation/spi/ValidationProvider", "<T::Ljakarta/validation/Configuration<TT;>;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createSpecializedConfiguration", "(Ljakarta/validation/spi/BootstrapState;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/spi/BootstrapState;)TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createGenericConfiguration", "(Ljakarta/validation/spi/BootstrapState;)Ljakarta/validation/Configuration;", "(Ljakarta/validation/spi/BootstrapState;)Ljakarta/validation/Configuration<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildValidatorFactory", "(Ljakarta/validation/spi/ConfigurationState;)Ljakarta/validation/ValidatorFactory;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
