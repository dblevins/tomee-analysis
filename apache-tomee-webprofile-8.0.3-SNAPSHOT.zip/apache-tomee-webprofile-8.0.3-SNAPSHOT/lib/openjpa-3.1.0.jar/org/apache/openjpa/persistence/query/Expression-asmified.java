package asm.org.apache.openjpa.persistence.query;
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
public class ExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/persistence/query/Expression", null, "java/lang/Object", new String[] { "org/apache/openjpa/persistence/query/SelectItem", "org/apache/openjpa/persistence/query/PredicateOperand" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "member", "(Lorg/apache/openjpa/persistence/query/PathExpression;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNull", "()Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "in", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "in", "([Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "in", "([Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/Predicate;", "([Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "in", "([Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "in", "([Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "in", "(Lorg/apache/openjpa/persistence/query/Subquery;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "length", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "concat", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "concat", "([Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(I)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(II)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(ILorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Lorg/apache/openjpa/persistence/query/Expression;I)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Lorg/apache/openjpa/persistence/query/Expression;Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lower", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "upper", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Lorg/apache/openjpa/persistence/query/TrimSpec;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(C)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(CLorg/apache/openjpa/persistence/query/TrimSpec;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Lorg/apache/openjpa/persistence/query/Expression;Lorg/apache/openjpa/persistence/query/TrimSpec;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljava/lang/String;I)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljava/lang/String;Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Lorg/apache/openjpa/persistence/query/Expression;I)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Lorg/apache/openjpa/persistence/query/Expression;Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "plus", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "plus", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "minus", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "minus", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "minus", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "dividedBy", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "dividedBy", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "times", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "times", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "abs", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sqrt", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(I)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
