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
public class PredicateOperandDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/persistence/query/PredicateOperand", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Z)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/Predicate;", "(Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Z)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljava/lang/Enum;)Lorg/apache/openjpa/persistence/query/Predicate;", "(Ljava/lang/Enum<*>;)Lorg/apache/openjpa/persistence/query/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterEqual", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterEqual", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterEqual", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterEqual", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterEqual", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessEqual", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessEqual", "(Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessEqual", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessEqual", "(Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessEqual", "(Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/lang/Number;Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/lang/Number;Ljava/lang/Number;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/lang/String;Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/util/Date;Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/util/Date;Ljava/util/Date;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/util/Calendar;Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Lorg/apache/openjpa/persistence/query/PredicateOperand;C)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljava/lang/String;Lorg/apache/openjpa/persistence/query/PredicateOperand;)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljava/lang/String;C)Lorg/apache/openjpa/persistence/query/Predicate;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
