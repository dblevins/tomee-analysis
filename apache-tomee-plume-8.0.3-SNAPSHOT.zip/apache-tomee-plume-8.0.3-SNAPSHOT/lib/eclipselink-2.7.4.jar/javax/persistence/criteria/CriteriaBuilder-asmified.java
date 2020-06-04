package asm.javax.persistence.criteria;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/CriteriaBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Case", "javax/persistence/criteria/CriteriaBuilder", "Case", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Coalesce", "javax/persistence/criteria/CriteriaBuilder", "Coalesce", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$In", "javax/persistence/criteria/CriteriaBuilder", "In", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$SimpleCase", "javax/persistence/criteria/CriteriaBuilder", "SimpleCase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Trimspec", "javax/persistence/criteria/CriteriaBuilder", "Trimspec", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", "()Ljavax/persistence/criteria/CriteriaQuery<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createQuery", "(Ljava/lang/Class;)Ljavax/persistence/criteria/CriteriaQuery;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createTupleQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", "()Ljavax/persistence/criteria/CriteriaQuery<Ljavax/persistence/Tuple;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCriteriaUpdate", "(Ljava/lang/Class;)Ljavax/persistence/criteria/CriteriaUpdate;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createCriteriaDelete", "(Ljava/lang/Class;)Ljavax/persistence/criteria/CriteriaDelete;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/CriteriaDelete<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "construct", "(Ljava/lang/Class;[Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;[Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CompoundSelection<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "tuple", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CompoundSelection<Ljavax/persistence/Tuple;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "array", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CompoundSelection<[Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asc", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Order;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Order;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "desc", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Order;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Order;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "avg", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sumAsLong", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sumAsDouble", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Float;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "max", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "min", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greatest", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljavax/persistence/criteria/Expression<TX;>;)Ljavax/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "least", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljavax/persistence/criteria/Expression<TX;>;)Ljavax/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "count", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "countDistinct", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "exists", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Subquery<*>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "all", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Subquery<TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "some", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Subquery<TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "any", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Subquery<TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "and", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "and", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "or", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "or", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "not", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "conjunction", "()Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "disjunction", "()Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isTrue", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isFalse", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNull", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotNull", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equal", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notEqual", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThan", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "greaterThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThan", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lessThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "between", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "gt", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "gt", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ge", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "ge", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lt", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lt", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "le", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "le", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "neg", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "abs", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;TN;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sum", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prod", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prod", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;TN;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prod", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "diff", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "diff", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;TN;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "diff", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "quot", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "quot", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "quot", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Integer;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljava/lang/Integer;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "mod", "(Ljava/lang/Integer;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljava/lang/Integer;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "sqrt", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toLong", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toInteger", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toFloat", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Float;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toDouble", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toBigDecimal", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/math/BigDecimal;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toBigInteger", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/math/BigInteger;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toString", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "literal", "(Ljava/lang/Object;)Ljavax/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(TT;)Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullLiteral", "(Ljava/lang/Class;)Ljavax/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parameter", "(Ljava/lang/Class;)Ljavax/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/ParameterExpression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "parameter", "(Ljava/lang/Class;Ljava/lang/String;)Ljavax/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljavax/persistence/criteria/ParameterExpression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isEmpty", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotEmpty", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "size", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "size", "(Ljava/util/Collection;)Ljavax/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(TC;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isMember", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljavax/persistence/criteria/Expression<TE;>;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isMember", "(Ljava/lang/Object;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotMember", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljavax/persistence/criteria/Expression<TE;>;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotMember", "(Ljava/lang/Object;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "values", "(Ljava/util/Map;)Ljavax/persistence/criteria/Expression;", "<V:Ljava/lang/Object;M::Ljava/util/Map<*TV;>;>(TM;)Ljavax/persistence/criteria/Expression<Ljava/util/Collection<TV;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "keys", "(Ljava/util/Map;)Ljavax/persistence/criteria/Expression;", "<K:Ljava/lang/Object;M::Ljava/util/Map<TK;*>;>(TM;)Ljavax/persistence/criteria/Expression<Ljava/util/Set<TK;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "notLike", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "concat", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "concat", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "concat", "(Ljava/lang/String;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljava/lang/String;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljavax/persistence/criteria/Expression;I)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;I)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "substring", "(Ljavax/persistence/criteria/Expression;II)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;II)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(CLjavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(CLjavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "trim", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;CLjavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;CLjavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "lower", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "upper", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "length", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "locate", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;I)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;I)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentDate", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/sql/Date;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentTimestamp", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/sql/Timestamp;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "currentTime", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/sql/Time;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "in", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaBuilder$In;", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TT;>;)Ljavax/persistence/criteria/CriteriaBuilder$In<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "coalesce", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "coalesce", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<TY;>;Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nullif", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<TY;>;TY;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "coalesce", "()Ljavax/persistence/criteria/CriteriaBuilder$Coalesce;", "<T:Ljava/lang/Object;>()Ljavax/persistence/criteria/CriteriaBuilder$Coalesce<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectCase", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaBuilder$SimpleCase;", "<C:Ljava/lang/Object;R:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TC;>;)Ljavax/persistence/criteria/CriteriaBuilder$SimpleCase<TC;TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "selectCase", "()Ljavax/persistence/criteria/CriteriaBuilder$Case;", "<R:Ljava/lang/Object;>()Ljavax/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "function", "(Ljava/lang/String;Ljava/lang/Class;[Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;[Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljavax/persistence/criteria/Join;Ljava/lang/Class;)Ljavax/persistence/criteria/Join;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljavax/persistence/criteria/Join<TX;TT;>;Ljava/lang/Class<TV;>;)Ljavax/persistence/criteria/Join<TX;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljavax/persistence/criteria/CollectionJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljavax/persistence/criteria/CollectionJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljavax/persistence/criteria/CollectionJoin<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljavax/persistence/criteria/SetJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljavax/persistence/criteria/SetJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljavax/persistence/criteria/SetJoin<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljavax/persistence/criteria/ListJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljavax/persistence/criteria/ListJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljavax/persistence/criteria/ListJoin<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljavax/persistence/criteria/MapJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljavax/persistence/criteria/MapJoin<TX;TK;TT;>;Ljava/lang/Class<TV;>;)Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljavax/persistence/criteria/Path;Ljava/lang/Class;)Ljavax/persistence/criteria/Path;", "<X:Ljava/lang/Object;T:TX;>(Ljavax/persistence/criteria/Path<TX;>;Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/Path<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "treat", "(Ljavax/persistence/criteria/Root;Ljava/lang/Class;)Ljavax/persistence/criteria/Root;", "<X:Ljava/lang/Object;T:TX;>(Ljavax/persistence/criteria/Root<TX;>;Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
