package asm.org.apache.openjpa.kernel.exps;
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
public class ExpressionFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/kernel/exps/ExpressionFactory", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "emptyExpression", "()Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asExpression", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThanEqual", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThanEqual", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isEmpty", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotEmpty", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "contains", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "containsKey", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "containsValue", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapValue", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isInstance", "(Lorg/apache/openjpa/kernel/exps/Value;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "and", "(Lorg/apache/openjpa/kernel/exps/Expression;Lorg/apache/openjpa/kernel/exps/Expression;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "or", "(Lorg/apache/openjpa/kernel/exps/Expression;Lorg/apache/openjpa/kernel/exps/Expression;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "not", "(Lorg/apache/openjpa/kernel/exps/Expression;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "bindVariable", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "bindKeyVariable", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "bindValueVariable", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endsWith", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "matches", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notMatches", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startsWith", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stringLength", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;Ljava/lang/Boolean;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newSubquery", "(Lorg/apache/openjpa/meta/ClassMetaData;ZLjava/lang/String;)Lorg/apache/openjpa/kernel/exps/Subquery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newPath", "()Lorg/apache/openjpa/kernel/exps/Path;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newPath", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Path;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newLiteral", "(Ljava/lang/Object;I)Lorg/apache/openjpa/kernel/exps/Literal;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getThis", "()Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNull", "()Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentDate", "(Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", "<T:Ljava/util/Date;>(Ljava/lang/Class<TT;>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentTime", "(Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", "<T:Ljava/util/Date;>(Ljava/lang/Class<TT;>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentTimestamp", "(Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", "<T:Ljava/util/Date;>(Ljava/lang/Class<TT;>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newParameter", "(Ljava/lang/Object;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Parameter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newCollectionValuedParameter", "(Ljava/lang/Object;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Parameter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newExtension", "(Lorg/apache/openjpa/kernel/exps/FilterListener;Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newAggregate", "(Lorg/apache/openjpa/kernel/exps/AggregateListener;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newArgumentList", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Arguments;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "newArgumentList", "([Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Arguments;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newUnboundVariable", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newBoundVariable", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cast", "(Lorg/apache/openjpa/kernel/exps/Value;Ljava/lang/Class;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "subtract", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "multiply", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "divide", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "abs", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "indexOf", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "concat", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sqrt", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toUpperCase", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toLowerCase", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "avg", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "count", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "max", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "min", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "any", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "all", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "size", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "index", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "type", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mapEntry", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mapKey", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getKey", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distinct", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObjectId", "(Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCaseExpression", "(Lorg/apache/openjpa/kernel/exps/Value;[Lorg/apache/openjpa/kernel/exps/Expression;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "generalCaseExpression", "([Lorg/apache/openjpa/kernel/exps/Expression;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whenCondition", "(Lorg/apache/openjpa/kernel/exps/Expression;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "whenScalar", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "coalesceExpression", "([Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullIfExpression", "(Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "newTypeLiteral", "(Ljava/lang/Object;I)Lorg/apache/openjpa/kernel/exps/Literal;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "newFunction", "(Ljava/lang/String;Ljava/lang/Class;[Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", "(Ljava/lang/String;Ljava/lang/Class<*>;[Lorg/apache/openjpa/kernel/exps/Value;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isVerticalType", "(Lorg/apache/openjpa/kernel/exps/Value;)Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
