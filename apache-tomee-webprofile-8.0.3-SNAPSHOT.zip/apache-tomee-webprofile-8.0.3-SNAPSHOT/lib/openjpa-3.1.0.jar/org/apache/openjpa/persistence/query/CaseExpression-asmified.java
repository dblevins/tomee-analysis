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
public class CaseExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/persistence/query/CaseExpression", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Lorg/apache/openjpa/persistence/query/Predicate;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "when", "(Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/CaseExpression;", "(Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "then", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "then", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "then", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "then", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "then", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "then", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "then", "(Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/CaseExpression;", "(Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "elseCase", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "elseCase", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "elseCase", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "elseCase", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "elseCase", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "elseCase", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "elseCase", "(Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/Expression;", "(Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/Expression;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
