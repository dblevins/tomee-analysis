package asm.jakarta.persistence.criteria;
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
public class CriteriaBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/CriteriaBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Case", "jakarta/persistence/criteria/CriteriaBuilder", "Case", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Coalesce", "jakarta/persistence/criteria/CriteriaBuilder", "Coalesce", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$In", "jakarta/persistence/criteria/CriteriaBuilder", "In", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$SimpleCase", "jakarta/persistence/criteria/CriteriaBuilder", "SimpleCase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "jakarta/persistence/criteria/CriteriaBuilder", "Trimspec", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQuery", "()Ljakarta/persistence/criteria/CriteriaQuery;", "()Ljakarta/persistence/criteria/CriteriaQuery<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQuery", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/CriteriaQuery;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTupleQuery", "()Ljakarta/persistence/criteria/CriteriaQuery;", "()Ljakarta/persistence/criteria/CriteriaQuery<Ljakarta/persistence/Tuple;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCriteriaUpdate", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/CriteriaUpdate;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCriteriaDelete", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/CriteriaDelete;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/CriteriaDelete<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "construct", "(Ljava/lang/Class;[Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CompoundSelection;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;[Ljakarta/persistence/criteria/Selection<*>;)Ljakarta/persistence/criteria/CompoundSelection<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "tuple", "([Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CompoundSelection;", "([Ljakarta/persistence/criteria/Selection<*>;)Ljakarta/persistence/criteria/CompoundSelection<Ljakarta/persistence/Tuple;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "array", "([Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CompoundSelection;", "([Ljakarta/persistence/criteria/Selection<*>;)Ljakarta/persistence/criteria/CompoundSelection<[Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asc", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Order;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Order;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "desc", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Order;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Order;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "avg", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sumAsLong", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sumAsDouble", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Float;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "max", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "min", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greatest", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljakarta/persistence/criteria/Expression<TX;>;)Ljakarta/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "least", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljakarta/persistence/criteria/Expression<TX;>;)Ljakarta/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "count", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "countDistinct", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "exists", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Subquery<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "all", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Subquery<TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "some", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Subquery<TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "any", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Subquery<TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "and", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "and", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "or", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "or", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "not", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "conjunction", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "disjunction", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isTrue", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isFalse", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNull", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotNull", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "gt", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "gt", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ge", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ge", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lt", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lt", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "le", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "le", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "neg", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "abs", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;TN;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prod", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prod", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;TN;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prod", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "diff", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "diff", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;TN;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "diff", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "quot", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "quot", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "quot", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Integer;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljava/lang/Integer;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Ljava/lang/Integer;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljava/lang/Integer;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sqrt", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toLong", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toInteger", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toFloat", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Float;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toDouble", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toBigDecimal", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/math/BigDecimal;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toBigInteger", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/math/BigInteger;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toString", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(TT;)Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullLiteral", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parameter", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/ParameterExpression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parameter", "(Ljava/lang/Class;Ljava/lang/String;)Ljakarta/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljakarta/persistence/criteria/ParameterExpression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isEmpty", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotEmpty", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "size", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "size", "(Ljava/util/Collection;)Ljakarta/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(TC;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isMember", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljakarta/persistence/criteria/Expression<TE;>;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isMember", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotMember", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljakarta/persistence/criteria/Expression<TE;>;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotMember", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "values", "(Ljava/util/Map;)Ljakarta/persistence/criteria/Expression;", "<V:Ljava/lang/Object;M::Ljava/util/Map<*TV;>;>(TM;)Ljakarta/persistence/criteria/Expression<Ljava/util/Collection<TV;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "keys", "(Ljava/util/Map;)Ljakarta/persistence/criteria/Expression;", "<K:Ljava/lang/Object;M::Ljava/util/Map<TK;*>;>(TM;)Ljakarta/persistence/criteria/Expression<Ljava/util/Set<TK;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "concat", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "concat", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "concat", "(Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljava/lang/String;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljakarta/persistence/criteria/Expression;I)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;I)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljakarta/persistence/criteria/Expression;II)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;II)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(CLjakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(CLjakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;CLjakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;CLjakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lower", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "upper", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "length", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;I)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;I)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentDate", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/sql/Date;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentTimestamp", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/sql/Timestamp;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentTime", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/sql/Time;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "in", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaBuilder$In;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TT;>;)Ljakarta/persistence/criteria/CriteriaBuilder$In<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "coalesce", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "coalesce", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<TY;>;Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<TY;>;TY;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "coalesce", "()Ljakarta/persistence/criteria/CriteriaBuilder$Coalesce;", "<T:Ljava/lang/Object;>()Ljakarta/persistence/criteria/CriteriaBuilder$Coalesce<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectCase", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaBuilder$SimpleCase;", "<C:Ljava/lang/Object;R:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TC;>;)Ljakarta/persistence/criteria/CriteriaBuilder$SimpleCase<TC;TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectCase", "()Ljakarta/persistence/criteria/CriteriaBuilder$Case;", "<R:Ljava/lang/Object;>()Ljakarta/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "function", "(Ljava/lang/String;Ljava/lang/Class;[Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;[Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljakarta/persistence/criteria/Join;Ljava/lang/Class;)Ljakarta/persistence/criteria/Join;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljakarta/persistence/criteria/Join<TX;TT;>;Ljava/lang/Class<TV;>;)Ljakarta/persistence/criteria/Join<TX;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljakarta/persistence/criteria/CollectionJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljakarta/persistence/criteria/CollectionJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljakarta/persistence/criteria/CollectionJoin<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljakarta/persistence/criteria/SetJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljakarta/persistence/criteria/SetJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljakarta/persistence/criteria/SetJoin<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljakarta/persistence/criteria/ListJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljakarta/persistence/criteria/ListJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljakarta/persistence/criteria/ListJoin<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljakarta/persistence/criteria/MapJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljakarta/persistence/criteria/MapJoin<TX;TK;TT;>;Ljava/lang/Class<TV;>;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljakarta/persistence/criteria/Path;Ljava/lang/Class;)Ljakarta/persistence/criteria/Path;", "<X:Ljava/lang/Object;T:TX;>(Ljakarta/persistence/criteria/Path<TX;>;Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/Path<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljakarta/persistence/criteria/Root;Ljava/lang/Class;)Ljakarta/persistence/criteria/Root;", "<X:Ljava/lang/Object;T:TX;>(Ljakarta/persistence/criteria/Root<TX;>;Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
