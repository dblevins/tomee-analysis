package asm.jakarta.validation.metadata;
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
public class BeanDescriptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/validation/metadata/BeanDescriptor", null, "java/lang/Object", new String[] { "jakarta/validation/metadata/ElementDescriptor" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isBeanConstrained", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConstraintsForProperty", "(Ljava/lang/String;)Ljakarta/validation/metadata/PropertyDescriptor;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConstrainedProperties", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/validation/metadata/PropertyDescriptor;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getConstraintsForMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljakarta/validation/metadata/MethodDescriptor;", "(Ljava/lang/String;[Ljava/lang/Class<*>;)Ljakarta/validation/metadata/MethodDescriptor;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getConstrainedMethods", "(Ljakarta/validation/metadata/MethodType;[Ljakarta/validation/metadata/MethodType;)Ljava/util/Set;", "(Ljakarta/validation/metadata/MethodType;[Ljakarta/validation/metadata/MethodType;)Ljava/util/Set<Ljakarta/validation/metadata/MethodDescriptor;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "getConstraintsForConstructor", "([Ljava/lang/Class;)Ljakarta/validation/metadata/ConstructorDescriptor;", "([Ljava/lang/Class<*>;)Ljakarta/validation/metadata/ConstructorDescriptor;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConstrainedConstructors", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/validation/metadata/ConstructorDescriptor;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
