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
public class QueryDefinitionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/persistence/query/QueryDefinition", null, "java/lang/Object", new String[] { "org/apache/openjpa/persistence/query/Subquery" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addRoot", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/DomainObject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSubqueryRoot", "(Lorg/apache/openjpa/persistence/query/PathExpression;)Lorg/apache/openjpa/persistence/query/DomainObject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "select", "([Lorg/apache/openjpa/persistence/query/SelectItem;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "select", "(Ljava/util/List;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", "(Ljava/util/List<Lorg/apache/openjpa/persistence/query/SelectItem;>;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "selectDistinct", "([Lorg/apache/openjpa/persistence/query/SelectItem;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectDistinct", "(Ljava/util/List;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", "(Ljava/util/List<Lorg/apache/openjpa/persistence/query/SelectItem;>;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Lorg/apache/openjpa/persistence/query/Predicate;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "orderBy", "([Lorg/apache/openjpa/persistence/query/OrderByItem;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "orderBy", "(Ljava/util/List;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", "(Ljava/util/List<Lorg/apache/openjpa/persistence/query/OrderByItem;>;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "groupBy", "([Lorg/apache/openjpa/persistence/query/PathExpression;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groupBy", "(Ljava/util/List;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", "(Ljava/util/List<Lorg/apache/openjpa/persistence/query/PathExpression;>;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "having", "(Lorg/apache/openjpa/persistence/query/Predicate;)Lorg/apache/openjpa/persistence/query/QueryDefinition;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "newInstance", "(Ljava/lang/Class;[Lorg/apache/openjpa/persistence/query/SelectItem;)Lorg/apache/openjpa/persistence/query/SelectItem;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "exists", "()Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "all", "()Lorg/apache/openjpa/persistence/query/Subquery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "any", "()Lorg/apache/openjpa/persistence/query/Subquery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "some", "()Lorg/apache/openjpa/persistence/query/Subquery;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "generalCase", "()Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCase", "(Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCase", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCase", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCase", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCase", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCase", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "simpleCase", "(Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/CaseExpression;", "(Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/CaseExpression;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "coalesce", "([Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "coalesce", "([Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "coalesce", "([Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "coalesce", "([Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Lorg/apache/openjpa/persistence/query/Expression;Lorg/apache/openjpa/persistence/query/Expression;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljava/lang/Number;Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljava/util/Date;Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljava/lang/Class;Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljava/lang/Enum;Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/Expression;", "(Ljava/lang/Enum<*>;Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/Expression;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "predicate", "(Z)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentTime", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentDate", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentTimestamp", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Z)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(C)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/Expression;", "(Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/Expression;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullLiteral", "()Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "param", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Expression;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
