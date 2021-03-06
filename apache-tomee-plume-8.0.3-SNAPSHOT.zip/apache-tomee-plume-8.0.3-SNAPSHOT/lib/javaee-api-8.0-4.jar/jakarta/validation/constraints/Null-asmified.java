package asm.jakarta.validation.constraints;
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
public class NullDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/validation/constraints/Null", null, "java/lang/Object", new String[] { "java/lang/annotation/Annotation" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Target;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "METHOD");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "FIELD");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "ANNOTATION_TYPE");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "CONSTRUCTOR");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "PARAMETER");
annotationVisitor1.visitEnum(null, "Ljava/lang/annotation/ElementType;", "TYPE_USE");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Retention;", true);
annotationVisitor0.visitEnum("value", "Ljava/lang/annotation/RetentionPolicy;", "RUNTIME");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Documented;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/validation/Constraint;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("validatedBy");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljava/lang/annotation/Repeatable;", true);
annotationVisitor0.visit("value", Type.getType("Ljakarta/validation/constraints/Null$List;"));
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("jakarta/validation/constraints/Null$List", "jakarta/validation/constraints/Null", "List", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "message", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
annotationVisitor0.visit(null, "{jakarta.validation.constraints.Null.message}");
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groups", "()[Ljava/lang/Class;", "()[Ljava/lang/Class<*>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray(null);
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "payload", "()[Ljava/lang/Class;", "()[Ljava/lang/Class<+Ljakarta/validation/Payload;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotationDefault();
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray(null);
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
