package asm.javax.validation.executable;
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
public class ExecutableValidatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/validation/executable/ExecutableValidator", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "validateParameters", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(TT;Ljava/lang/reflect/Method;[Ljava/lang/Object;[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "validateReturnValue", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(TT;Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "validateConstructorParameters", "(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(Ljava/lang/reflect/Constructor<+TT;>;[Ljava/lang/Object;[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "validateConstructorReturnValue", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;[Ljava/lang/Class;)Ljava/util/Set;", "<T:Ljava/lang/Object;>(Ljava/lang/reflect/Constructor<+TT;>;TT;[Ljava/lang/Class<*>;)Ljava/util/Set<Ljavax/validation/ConstraintViolation<TT;>;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
