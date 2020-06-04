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
public class ElementDescriptor$ConstraintFinderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/validation/metadata/ElementDescriptor$ConstraintFinder", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/validation/metadata/ElementDescriptor$ConstraintFinder", "jakarta/validation/metadata/ElementDescriptor", "ConstraintFinder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "unorderedAndMatchingGroups", "([Ljava/lang/Class;)Ljakarta/validation/metadata/ElementDescriptor$ConstraintFinder;", "([Ljava/lang/Class<*>;)Ljakarta/validation/metadata/ElementDescriptor$ConstraintFinder;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lookingAt", "(Ljakarta/validation/metadata/Scope;)Ljakarta/validation/metadata/ElementDescriptor$ConstraintFinder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "declaredOn", "([Ljava/lang/annotation/ElementType;)Ljakarta/validation/metadata/ElementDescriptor$ConstraintFinder;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConstraintDescriptors", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/validation/metadata/ConstraintDescriptor<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasConstraints", "()Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
