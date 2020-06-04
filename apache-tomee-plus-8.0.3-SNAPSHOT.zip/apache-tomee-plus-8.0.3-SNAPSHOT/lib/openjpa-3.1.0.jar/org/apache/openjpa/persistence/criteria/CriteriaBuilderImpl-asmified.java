package asm.org.apache.openjpa.persistence.criteria;
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
public class CriteriaBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", null, "java/lang/Object", new String[] { "org/apache/openjpa/persistence/criteria/OpenJPACriteriaBuilder", "org/apache/openjpa/kernel/exps/ExpressionParser" });

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Coalesce", "jakarta/persistence/criteria/CriteriaBuilder", "Coalesce", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$In", "jakarta/persistence/criteria/CriteriaBuilder", "In", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Case", "jakarta/persistence/criteria/CriteriaBuilder", "Case", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$SimpleCase", "jakarta/persistence/criteria/CriteriaBuilder", "SimpleCase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("jakarta/persistence/criteria/CriteriaBuilder$Trimspec", "jakarta/persistence/criteria/CriteriaBuilder", "Trimspec", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Abs", "org/apache/openjpa/persistence/criteria/Expressions", "Abs", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$All", "org/apache/openjpa/persistence/criteria/Expressions", "All", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/PredicateImpl$And", "org/apache/openjpa/persistence/criteria/PredicateImpl", "And", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Any", "org/apache/openjpa/persistence/criteria/Expressions", "Any", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Avg", "org/apache/openjpa/persistence/criteria/Expressions", "Avg", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Between", "org/apache/openjpa/persistence/criteria/Expressions", "Between", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "org/apache/openjpa/persistence/criteria/Expressions", "Coalesce", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Concat", "org/apache/openjpa/persistence/criteria/Expressions", "Concat", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Count", "org/apache/openjpa/persistence/criteria/Expressions", "Count", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$CurrentDate", "org/apache/openjpa/persistence/criteria/Expressions", "CurrentDate", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$CurrentTime", "org/apache/openjpa/persistence/criteria/Expressions", "CurrentTime", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$CurrentTimestamp", "org/apache/openjpa/persistence/criteria/Expressions", "CurrentTimestamp", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Diff", "org/apache/openjpa/persistence/criteria/Expressions", "Diff", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "org/apache/openjpa/persistence/criteria/PredicateImpl", "Or", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$IsNull", "org/apache/openjpa/persistence/criteria/Expressions", "IsNull", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Equal", "org/apache/openjpa/persistence/criteria/Expressions", "Equal", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Exists", "org/apache/openjpa/persistence/criteria/Expressions", "Exists", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$DatabaseFunction", "org/apache/openjpa/persistence/criteria/Expressions", "DatabaseFunction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "org/apache/openjpa/persistence/criteria/Expressions", "GreaterThanEqual", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "org/apache/openjpa/persistence/criteria/Expressions", "GreaterThan", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Max", "org/apache/openjpa/persistence/criteria/Expressions", "Max", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$In", "org/apache/openjpa/persistence/criteria/Expressions", "In", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$IsEmpty", "org/apache/openjpa/persistence/criteria/Expressions", "IsEmpty", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$IsMember", "org/apache/openjpa/persistence/criteria/Expressions", "IsMember", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$IsNotEmpty", "org/apache/openjpa/persistence/criteria/Expressions", "IsNotEmpty", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Constant", "org/apache/openjpa/persistence/criteria/Expressions", "Constant", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "org/apache/openjpa/persistence/criteria/Expressions", "LessThanEqual", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Min", "org/apache/openjpa/persistence/criteria/Expressions", "Min", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Length", "org/apache/openjpa/persistence/criteria/Expressions", "Length", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$LessThan", "org/apache/openjpa/persistence/criteria/Expressions", "LessThan", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Like", "org/apache/openjpa/persistence/criteria/Expressions", "Like", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Locate", "org/apache/openjpa/persistence/criteria/Expressions", "Locate", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Lower", "org/apache/openjpa/persistence/criteria/Expressions", "Lower", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Mod", "org/apache/openjpa/persistence/criteria/Expressions", "Mod", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$NotEqual", "org/apache/openjpa/persistence/criteria/Expressions", "NotEqual", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Nullif", "org/apache/openjpa/persistence/criteria/Expressions", "Nullif", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Product", "org/apache/openjpa/persistence/criteria/Expressions", "Product", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Quotient", "org/apache/openjpa/persistence/criteria/Expressions", "Quotient", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/CompoundSelections$NewInstance", "org/apache/openjpa/persistence/criteria/CompoundSelections", "NewInstance", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Case", "org/apache/openjpa/persistence/criteria/Expressions", "Case", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "org/apache/openjpa/persistence/criteria/Expressions", "SimpleCase", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Size", "org/apache/openjpa/persistence/criteria/Expressions", "Size", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Sqrt", "org/apache/openjpa/persistence/criteria/Expressions", "Sqrt", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Substring", "org/apache/openjpa/persistence/criteria/Expressions", "Substring", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Sum", "org/apache/openjpa/persistence/criteria/Expressions", "Sum", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Cast", "org/apache/openjpa/persistence/criteria/Expressions", "Cast", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Trim", "org/apache/openjpa/persistence/criteria/Expressions", "Trim", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$Upper", "org/apache/openjpa/persistence/criteria/Expressions", "Upper", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/CompoundSelections$Array", "org/apache/openjpa/persistence/criteria/CompoundSelections", "Array", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/Expressions$IsNotNull", "org/apache/openjpa/persistence/criteria/Expressions", "IsNotNull", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/CompoundSelections$Tuple", "org/apache/openjpa/persistence/criteria/CompoundSelections", "Tuple", ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/persistence/criteria/ComparisonStyle$Default", "org/apache/openjpa/persistence/criteria/ComparisonStyle", "Default", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/persistence/criteria/Predicate$BooleanOperator", "jakarta/persistence/criteria/Predicate", "BooleanOperator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMetaModel", "(Lorg/apache/openjpa/persistence/meta/MetamodelImpl;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetamodel", "()Ljakarta/persistence/metamodel/Metamodel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "eval", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/ExpressionStoreQuery;Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/meta/ClassMetaData;)Lorg/apache/openjpa/kernel/exps/QueryExpressions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getQueryExpressions", "(Lorg/apache/openjpa/kernel/exps/ExpressionFactory;)Lorg/apache/openjpa/kernel/exps/QueryExpressions;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "eval", "([Ljava/lang/String;Lorg/apache/openjpa/kernel/ExpressionStoreQuery;Lorg/apache/openjpa/kernel/exps/ExpressionFactory;Lorg/apache/openjpa/meta/ClassMetaData;)[Lorg/apache/openjpa/kernel/exps/Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLanguage", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("jakarta.persistence.criteria");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQuery", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "<init>", "(Lorg/apache/openjpa/persistence/meta/MetamodelImpl;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTupleQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery<Ljakarta/persistence/Tuple;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/persistence/Tuple;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "<init>", "(Lorg/apache/openjpa/persistence/meta/MetamodelImpl;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCriteriaUpdate", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/CriteriaUpdate;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCriteriaDelete", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/CriteriaDelete;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/CriteriaDelete<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Ljava/lang/String;Lorg/apache/openjpa/kernel/ExpressionStoreQuery;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/AbstractMethodError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AbstractMethodError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "populate", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/ExpressionStoreQuery;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExpressionStoreQuery", "invalidateCompilation", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExpressionStoreQuery", "getContext", "()Lorg/apache/openjpa/kernel/QueryContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getRoot", "()Ljakarta/persistence/criteria/Root;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Root", "getJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/QueryContext", "setCandidateType", "(Ljava/lang/Class;Z)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExpressionStoreQuery", "setQuery", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "abs", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Abs");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Abs", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "all", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Subquery<TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$All");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$All", "<init>", "(Ljakarta/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "and", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$And");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$And", "<init>", "([Ljakarta/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "and", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$And");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$And", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "any", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Subquery<TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Any");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Any", "<init>", "(Ljakarta/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asc", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Order;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Order;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/OrderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/OrderImpl", "<init>", "(Ljakarta/persistence/criteria/Expression;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "avg", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Avg");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Avg", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "between", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Between");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Between", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "between", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Between");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Between", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;Ljava/lang/Comparable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "coalesce", "()Ljakarta/persistence/criteria/CriteriaBuilder$Coalesce;", "<T:Ljava/lang/Object;>()Ljakarta/persistence/criteria/CriteriaBuilder$Coalesce<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "coalesce", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Expression", "getJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "coalesce", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Expression", "getJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljakarta/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljava/lang/Object;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "concat", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Concat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Concat", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "concat", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Concat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Concat", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "concat", "(Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljava/lang/String;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Concat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Concat", "<init>", "(Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "conjunction", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$And");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/criteria/Predicate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$And", "<init>", "([Ljakarta/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "count", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Count");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Count", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "countDistinct", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Count");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Count", "<init>", "(Ljakarta/persistence/criteria/Expression;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "<init>", "(Lorg/apache/openjpa/persistence/meta/MetamodelImpl;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "currentDate", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/sql/Date;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$CurrentDate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$CurrentDate", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "currentTime", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/sql/Time;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTime", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "currentTimestamp", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/sql/Timestamp;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTimestamp");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTimestamp", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "desc", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Order;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Order;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/OrderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/OrderImpl", "<init>", "(Ljakarta/persistence/criteria/Expression;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "diff", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "diff", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;TN;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "diff", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "disjunction", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/persistence/criteria/Predicate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "<init>", "([Ljakarta/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equal", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsNull");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsNull", "<init>", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Equal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "replaceExpressionForBinaryOperator", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<TT;>;)Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE", "()Ljakarta/persistence/criteria/Predicate;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE_CONSTANT", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE", "()Ljakarta/persistence/criteria/Predicate;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE_CONSTANT", "Ljakarta/persistence/criteria/Expression;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equal", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsNull");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsNull", "<init>", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Equal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "exists", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Subquery<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Exists");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Exists", "<init>", "(Ljakarta/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "function", "(Ljava/lang/String;Ljava/lang/Class;[Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;[Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$DatabaseFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$DatabaseFunction", "<init>", "(Ljava/lang/String;Ljava/lang/Class;[Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljakarta/persistence/criteria/Join;Ljava/lang/Class;)Ljakarta/persistence/criteria/Join;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljakarta/persistence/criteria/Join<TX;TT;>;Ljava/lang/Class<TV;>;)Ljakarta/persistence/criteria/Join<TX;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljakarta/persistence/criteria/CollectionJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljakarta/persistence/criteria/CollectionJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljakarta/persistence/criteria/CollectionJoin<TX;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljakarta/persistence/criteria/SetJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljakarta/persistence/criteria/SetJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljakarta/persistence/criteria/SetJoin<TX;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljakarta/persistence/criteria/ListJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljakarta/persistence/criteria/ListJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljakarta/persistence/criteria/ListJoin<TX;TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljakarta/persistence/criteria/MapJoin;Ljava/lang/Class;)Ljakarta/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljakarta/persistence/criteria/MapJoin<TX;TK;TT;>;Ljava/lang/Class<TV;>;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljakarta/persistence/criteria/Path;Ljava/lang/Class;)Ljakarta/persistence/criteria/Path;", "<X:Ljava/lang/Object;T:TX;>(Ljakarta/persistence/criteria/Path<TX;>;Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/Path<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljakarta/persistence/criteria/Root;Ljava/lang/Class;)Ljakarta/persistence/criteria/Root;", "<X:Ljava/lang/Object;T:TX;>(Ljakarta/persistence/criteria/Root<TX;>;Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA 2.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ge", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ge", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThan", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThan", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greatest", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljakarta/persistence/criteria/Expression<TX;>;)Ljakarta/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Max");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Max", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "gt", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "gt", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "in", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaBuilder$In;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TT;>;)Ljakarta/persistence/criteria/CriteriaBuilder$In<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$In");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$In", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsEmpty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsEmpty", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFalse", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Equal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMember", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsMember");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsMember", "<init>", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMember", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljakarta/persistence/criteria/Expression<TE;>;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsMember");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsMember", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotEmpty", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsNotEmpty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsNotEmpty", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotMember", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "isMember", "(Ljava/lang/Object;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotMember", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljakarta/persistence/criteria/Expression<TE;>;Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "isMember", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTrue", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/openjpa/persistence/criteria/PredicateImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/PredicateImpl");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/PredicateImpl", "isEmpty", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/PredicateImpl", "getOperator", "()Ljakarta/persistence/criteria/Predicate$BooleanOperator;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/criteria/Predicate$BooleanOperator", "AND", "Ljakarta/persistence/criteria/Predicate$BooleanOperator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE", "()Ljakarta/persistence/criteria/Predicate;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/persistence/criteria/PredicateImpl"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE", "()Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/persistence/criteria/Predicate"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Equal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keys", "(Ljava/util/Map;)Ljakarta/persistence/criteria/Expression;", "<K:Ljava/lang/Object;M::Ljava/util/Map<TK;*>;>(TM;)Ljakarta/persistence/criteria/Expression<Ljava/util/Set<TK;>;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Constant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_SET", "Ljava/util/Set;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "java/util/Map"}, 2, new Object[] {label0, label0});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "keySet", "()Ljava/util/Set;", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "java/util/Map"}, 3, new Object[] {label0, label0, "java/util/Set"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Constant", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "le", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "le", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "least", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljakarta/persistence/criteria/Expression<TX;>;)Ljakarta/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Min");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Min", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "length", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Length");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Length", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThan", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThan", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThanOrEqualTo", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljakarta/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljakarta/persistence/criteria/Expression<+TY;>;TY;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;Ljava/lang/Character;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "literal", "(Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(TT;)Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE", "()Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE", "()Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Constant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Constant", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;I)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;I)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lower", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Lower");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Lower", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lt", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lt", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "max", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Max");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Max", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "min", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Min");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Min", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mod", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Mod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Mod", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mod", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Integer;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljava/lang/Integer;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Mod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Mod", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mod", "(Ljava/lang/Integer;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljava/lang/Integer;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Mod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Mod", "<init>", "(Ljava/lang/Integer;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "neg", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "not", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/persistence/criteria/Predicate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notEqual", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notEqual", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;C)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/String;C)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Predicate", "not", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nullif", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<TY;>;Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Nullif");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Nullif", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nullif", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<TY;>;TY;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Nullif");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Nullif", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "or", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "<init>", "([Ljakarta/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "or", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameter", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/ParameterExpression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/ParameterExpressionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ParameterExpressionImpl", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameter", "(Ljava/lang/Class;Ljava/lang/String;)Ljakarta/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljakarta/persistence/criteria/ParameterExpression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/ParameterExpressionImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ParameterExpressionImpl", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prod", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Product");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Product", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prod", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;TN;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Product");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Product", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prod", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Product");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Product", "<init>", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "quot", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Quotient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Quotient", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "quot", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Quotient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Quotient", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "quot", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Quotient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Quotient", "<init>", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "construct", "(Ljava/lang/Class;[Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CompoundSelection;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;[Ljakarta/persistence/criteria/Selection<*>;)Ljakarta/persistence/criteria/CompoundSelection<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CompoundSelections$NewInstance");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompoundSelections$NewInstance", "<init>", "(Ljava/lang/Class;[Ljakarta/persistence/criteria/Selection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectCase", "()Ljakarta/persistence/criteria/CriteriaBuilder$Case;", "<R:Ljava/lang/Object;>()Ljakarta/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Case");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Case", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectCase", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaBuilder$SimpleCase;", "<C:Ljava/lang/Object;R:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Expression<+TC;>;)Ljakarta/persistence/criteria/CriteriaBuilder$SimpleCase<TC;TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "(Ljava/util/Collection;)Ljakarta/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(TC;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Size");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Size", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(Ljakarta/persistence/criteria/Expression<TC;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Size");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Size", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "some", "(Ljakarta/persistence/criteria/Subquery;)Ljakarta/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Subquery<TY;>;)Ljakarta/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Any");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Any", "<init>", "(Ljakarta/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sqrt", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sqrt");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sqrt", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljakarta/persistence/criteria/Expression;I)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;I)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljakarta/persistence/criteria/Expression;II)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;II)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Integer;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljakarta/persistence/criteria/Expression<+TN;>;TN;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljakarta/persistence/criteria/Expression<+TN;>;)Ljakarta/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljava/lang/Number;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sumAsLong", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "sum", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Expression", "as", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Expression;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sumAsDouble", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Float;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "sum", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Expression", "as", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Expression;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toBigDecimal", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/math/BigDecimal;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigDecimal;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toBigInteger", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/math/BigInteger;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigInteger;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toDouble", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toFloat", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Float;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toInteger", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toLong", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(CLjakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(CLjakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Character;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;Ljakarta/persistence/criteria/Expression<Ljava/lang/Character;>;Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/Expression;Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;CLjakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;CLjakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljakarta/persistence/criteria/Expression;Ljava/lang/Character;Ljakarta/persistence/criteria/CriteriaBuilder$Trimspec;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "upper", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Expression;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;)Ljakarta/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Upper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Upper", "<init>", "(Ljakarta/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "values", "(Ljava/util/Map;)Ljakarta/persistence/criteria/Expression;", "<V:Ljava/lang/Object;M::Ljava/util/Map<*TV;>;>(TM;)Ljakarta/persistence/criteria/Expression<Ljava/util/Collection<TV;>;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Constant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "java/util/Map"}, 2, new Object[] {label0, label0});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "java/util/Map"}, 3, new Object[] {label0, label0, "java/util/Collection"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Constant", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "array", "([Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CompoundSelection;", "([Ljakarta/persistence/criteria/Selection<*>;)Ljakarta/persistence/criteria/CompoundSelection<[Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CompoundSelections$Array");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Object;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompoundSelections$Array", "<init>", "(Ljava/lang/Class;[Ljakarta/persistence/criteria/Selection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotNull", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsNotNull");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsNotNull", "<init>", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNull", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsNull");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/criteria/ExpressionImpl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsNull", "<init>", "(Lorg/apache/openjpa/persistence/criteria/ExpressionImpl;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nullLiteral", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Constant");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Constant", "<init>", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "tuple", "([Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CompoundSelection;", "([Ljakarta/persistence/criteria/Selection<*>;)Ljakarta/persistence/criteria/CompoundSelection<Ljakarta/persistence/Tuple;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CompoundSelections$Tuple");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompoundSelections$Tuple", "<init>", "([Ljakarta/persistence/criteria/Selection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute<**>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/From", "isNull", "()Ljakarta/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/MetamodelImpl", "managedType", "(Ljava/lang/Class;)Ljakarta/persistence/metamodel/ManagedType;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CompareByExample");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbeStyle", "()Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "jakarta/persistence/criteria/From", "java/lang/Object", "org/apache/openjpa/persistence/criteria/ComparisonStyle", "[Ljakarta/persistence/metamodel/Attribute;", "jakarta/persistence/metamodel/ManagedType"}, 6, new Object[] {label2, label2, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "jakarta/persistence/metamodel/ManagedType", "jakarta/persistence/criteria/From", "java/lang/Object"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "jakarta/persistence/criteria/From", "java/lang/Object", "org/apache/openjpa/persistence/criteria/ComparisonStyle", "[Ljakarta/persistence/metamodel/Attribute;", "jakarta/persistence/metamodel/ManagedType"}, 7, new Object[] {label2, label2, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "jakarta/persistence/metamodel/ManagedType", "jakarta/persistence/criteria/From", "java/lang/Object", "org/apache/openjpa/persistence/criteria/ComparisonStyle"});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompareByExample", "<init>", "(Ljakarta/persistence/criteria/CriteriaBuilder;Ljakarta/persistence/metamodel/ManagedType;Ljakarta/persistence/criteria/Path;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;[Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;[Ljakarta/persistence/metamodel/Attribute<**>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbeStyle", "()Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljakarta/persistence/criteria/From<*TT;>;TT;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbeStyle", "()Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbe", "(Ljakarta/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "qbeStyle", "()Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/ComparisonStyle$Default");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/ComparisonStyle$Default", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createTupleQuery", "()Ljakarta/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "createTupleQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createQuery", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "createQuery", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createQuery", "()Ljakarta/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "createQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
