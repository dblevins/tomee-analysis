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

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Coalesce", "javax/persistence/criteria/CriteriaBuilder", "Coalesce", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$In", "javax/persistence/criteria/CriteriaBuilder", "In", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Case", "javax/persistence/criteria/CriteriaBuilder", "Case", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$SimpleCase", "javax/persistence/criteria/CriteriaBuilder", "SimpleCase", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Trimspec", "javax/persistence/criteria/CriteriaBuilder", "Trimspec", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

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

classWriter.visitInnerClass("javax/persistence/criteria/Predicate$BooleanOperator", "javax/persistence/criteria/Predicate", "BooleanOperator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetamodel", "()Ljavax/persistence/metamodel/Metamodel;", null, null);
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
methodVisitor.visitLdcInsn("javax.persistence.criteria");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createTupleQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery<Ljavax/persistence/Tuple;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/persistence/Tuple;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "<init>", "(Lorg/apache/openjpa/persistence/meta/MetamodelImpl;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCriteriaUpdate", "(Ljava/lang/Class;)Ljavax/persistence/criteria/CriteriaUpdate;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCriteriaDelete", "(Ljava/lang/Class;)Ljavax/persistence/criteria/CriteriaDelete;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/CriteriaDelete<TT;>;", null);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaQueryImpl", "getRoot", "()Ljavax/persistence/criteria/Root;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Root", "getJavaType", "()Ljava/lang/Class;", true);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "abs", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Abs");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Abs", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "all", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Subquery<TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$All");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$All", "<init>", "(Ljavax/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "and", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$And");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$And", "<init>", "([Ljavax/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "and", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$And");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$And", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "any", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Subquery<TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Any");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Any", "<init>", "(Ljavax/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asc", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Order;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Order;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/OrderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/OrderImpl", "<init>", "(Ljavax/persistence/criteria/Expression;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "avg", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Avg");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Avg", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "between", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Between");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Between", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "between", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Between");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Between", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;Ljava/lang/Comparable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "coalesce", "()Ljavax/persistence/criteria/CriteriaBuilder$Coalesce;", "<T:Ljava/lang/Object;>()Ljavax/persistence/criteria/CriteriaBuilder$Coalesce<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "coalesce", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Expression", "getJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljavax/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljavax/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "coalesce", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Expression", "getJavaType", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljavax/persistence/criteria/Expression;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/Expressions$Coalesce", "value", "(Ljava/lang/Object;)Lorg/apache/openjpa/persistence/criteria/Expressions$Coalesce;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "concat", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Concat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Concat", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "concat", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Concat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Concat", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "concat", "(Ljava/lang/String;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljava/lang/String;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Concat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Concat", "<init>", "(Ljava/lang/String;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "conjunction", "()Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$And");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/persistence/criteria/Predicate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$And", "<init>", "([Ljavax/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "count", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Count");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Count", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "countDistinct", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Count");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Count", "<init>", "(Ljavax/persistence/criteria/Expression;Z)V", false);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "currentDate", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/sql/Date;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$CurrentDate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$CurrentDate", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "currentTime", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/sql/Time;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTime");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTime", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "currentTimestamp", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/sql/Timestamp;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTimestamp");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$CurrentTimestamp", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "desc", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Order;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Order;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/OrderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/OrderImpl", "<init>", "(Ljavax/persistence/criteria/Expression;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "diff", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "diff", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;TN;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "diff", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "disjunction", "()Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/persistence/criteria/Predicate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "<init>", "([Ljavax/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equal", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "replaceExpressionForBinaryOperator", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "replaceExpressionForBinaryOperator", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<TT;>;)Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE", "()Ljavax/persistence/criteria/Predicate;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE_CONSTANT", "Ljavax/persistence/criteria/Expression;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE", "()Ljavax/persistence/criteria/Predicate;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE_CONSTANT", "Ljavax/persistence/criteria/Expression;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equal", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", null);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "exists", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Subquery<*>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Exists");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Exists", "<init>", "(Ljavax/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "function", "(Ljava/lang/String;Ljava/lang/Class;[Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;[Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$DatabaseFunction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$DatabaseFunction", "<init>", "(Ljava/lang/String;Ljava/lang/Class;[Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljavax/persistence/criteria/Join;Ljava/lang/Class;)Ljavax/persistence/criteria/Join;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljavax/persistence/criteria/Join<TX;TT;>;Ljava/lang/Class<TV;>;)Ljavax/persistence/criteria/Join<TX;TV;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljavax/persistence/criteria/CollectionJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljavax/persistence/criteria/CollectionJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljavax/persistence/criteria/CollectionJoin<TX;TE;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljavax/persistence/criteria/SetJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljavax/persistence/criteria/SetJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljavax/persistence/criteria/SetJoin<TX;TE;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljavax/persistence/criteria/ListJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;T:Ljava/lang/Object;E:TT;>(Ljavax/persistence/criteria/ListJoin<TX;TT;>;Ljava/lang/Class<TE;>;)Ljavax/persistence/criteria/ListJoin<TX;TE;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljavax/persistence/criteria/MapJoin;Ljava/lang/Class;)Ljavax/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;T:Ljava/lang/Object;V:TT;>(Ljavax/persistence/criteria/MapJoin<TX;TK;TT;>;Ljava/lang/Class<TV;>;)Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljavax/persistence/criteria/Path;Ljava/lang/Class;)Ljavax/persistence/criteria/Path;", "<X:Ljava/lang/Object;T:TX;>(Ljavax/persistence/criteria/Path<TX;>;Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/Path<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "treat", "(Ljavax/persistence/criteria/Root;Ljava/lang/Class;)Ljavax/persistence/criteria/Root;", "<X:Ljava/lang/Object;T:TX;>(Ljavax/persistence/criteria/Root<TX;>;Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/Root<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ge", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ge", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThan", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThan", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greaterThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "greatest", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljavax/persistence/criteria/Expression<TX;>;)Ljavax/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Max");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Max", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "gt", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "gt", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$GreaterThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "in", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaBuilder$In;", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TT;>;)Ljavax/persistence/criteria/CriteriaBuilder$In<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$In");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$In", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsEmpty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsEmpty", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFalse", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Equal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMember", "(Ljava/lang/Object;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsMember");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsMember", "<init>", "(Ljava/lang/Object;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMember", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljavax/persistence/criteria/Expression<TE;>;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsMember");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsMember", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotEmpty", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<C::Ljava/util/Collection<*>;>(Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$IsNotEmpty");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$IsNotEmpty", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotMember", "(Ljava/lang/Object;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(TE;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "isMember", "(Ljava/lang/Object;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotMember", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljavax/persistence/criteria/Expression<TE;>;Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "isMember", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTrue", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/PredicateImpl", "getOperator", "()Ljavax/persistence/criteria/Predicate$BooleanOperator;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "AND", "Ljavax/persistence/criteria/Predicate$BooleanOperator;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE", "()Ljavax/persistence/criteria/Predicate;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/persistence/criteria/PredicateImpl"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE", "()Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/persistence/criteria/Predicate"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Equal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Equal", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keys", "(Ljava/util/Map;)Ljavax/persistence/criteria/Expression;", "<K:Ljava/lang/Object;M::Ljava/util/Map<TK;*>;>(TM;)Ljavax/persistence/criteria/Expression<Ljava/util/Set<TK;>;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "le", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "le", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "least", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<X::Ljava/lang/Comparable<-TX;>;>(Ljavax/persistence/criteria/Expression<TX;>;)Ljavax/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Min");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Min", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "length", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Length");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Length", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThan", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThan", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lessThanOrEqualTo", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Comparable;)Ljavax/persistence/criteria/Predicate;", "<Y::Ljava/lang/Comparable<-TY;>;>(Ljavax/persistence/criteria/Expression<+TY;>;TY;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThanEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;C)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Like");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Like", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;Ljava/lang/Character;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "literal", "(Ljava/lang/Object;)Ljavax/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(TT;)Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "TRUE", "()Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/criteria/PredicateImpl", "FALSE", "()Ljavax/persistence/criteria/Predicate;", false);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "locate", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;I)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;I)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Locate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Locate", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lower", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Lower");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Lower", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lt", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lt", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$LessThan");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$LessThan", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "max", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Max");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Max", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "min", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Min");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Min", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mod", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Mod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Mod", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mod", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Integer;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljava/lang/Integer;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Mod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Mod", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mod", "(Ljava/lang/Integer;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljava/lang/Integer;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Mod");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Mod", "<init>", "(Ljava/lang/Integer;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "neg", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Diff");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Diff", "<init>", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "not", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/criteria/Predicate");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notEqual", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notEqual", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$NotEqual", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;C)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "notLike", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "like", "(Ljavax/persistence/criteria/Expression;Ljava/lang/String;C)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Predicate", "not", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nullif", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<TY;>;Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Nullif");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Nullif", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nullif", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<TY;>;TY;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Nullif");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Nullif", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "or", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "<init>", "([Ljavax/persistence/criteria/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "or", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/PredicateImpl$Or", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameter", "(Ljava/lang/Class;)Ljavax/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/ParameterExpression<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameter", "(Ljava/lang/Class;Ljava/lang/String;)Ljavax/persistence/criteria/ParameterExpression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/lang/String;)Ljavax/persistence/criteria/ParameterExpression<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prod", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Product");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Product", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prod", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;TN;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Product");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Product", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prod", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Product");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Product", "<init>", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "quot", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Quotient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Quotient", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "quot", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Quotient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Quotient", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "quot", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Number;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Quotient");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Quotient", "<init>", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "construct", "(Ljava/lang/Class;[Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;[Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CompoundSelection<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CompoundSelections$NewInstance");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompoundSelections$NewInstance", "<init>", "(Ljava/lang/Class;[Ljavax/persistence/criteria/Selection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectCase", "()Ljavax/persistence/criteria/CriteriaBuilder$Case;", "<R:Ljava/lang/Object;>()Ljavax/persistence/criteria/CriteriaBuilder$Case<TR;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectCase", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaBuilder$SimpleCase;", "<C:Ljava/lang/Object;R:Ljava/lang/Object;>(Ljavax/persistence/criteria/Expression<+TC;>;)Ljavax/persistence/criteria/CriteriaBuilder$SimpleCase<TC;TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$SimpleCase", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "(Ljava/util/Collection;)Ljavax/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(TC;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<C::Ljava/util/Collection<*>;>(Ljavax/persistence/criteria/Expression<TC;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Size");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Size", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "some", "(Ljavax/persistence/criteria/Subquery;)Ljavax/persistence/criteria/Expression;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Subquery<TY;>;)Ljavax/persistence/criteria/Expression<TY;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Any");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Any", "<init>", "(Ljavax/persistence/criteria/Subquery;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sqrt", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sqrt");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sqrt", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljavax/persistence/criteria/Expression;I)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;I)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "substring", "(Ljavax/persistence/criteria/Expression;II)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;II)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Substring");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Substring", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Integer;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(Ljavax/persistence/criteria/Expression<+TN;>;TN;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Number;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sum", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "<N:Ljava/lang/Number;>(TN;Ljavax/persistence/criteria/Expression<+TN;>;)Ljavax/persistence/criteria/Expression<TN;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Sum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Sum", "<init>", "(Ljava/lang/Number;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sumAsLong", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "sum", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Expression", "as", "(Ljava/lang/Class;)Ljavax/persistence/criteria/Expression;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sumAsDouble", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Float;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "sum", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Expression", "as", "(Ljava/lang/Class;)Ljavax/persistence/criteria/Expression;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toBigDecimal", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/math/BigDecimal;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigDecimal;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toBigInteger", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/math/BigInteger;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigInteger;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toDouble", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Double;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toFloat", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Float;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toInteger", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toLong", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<+Ljava/lang/Number;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/Long;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Cast");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Cast", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(CLjavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(CLjavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Character;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;Ljavax/persistence/criteria/Expression<Ljava/lang/Character;>;Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/Expression;Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trim", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;CLjavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;CLjavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Trim");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Trim", "<init>", "(Ljavax/persistence/criteria/Expression;Ljava/lang/Character;Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "upper", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Expression;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;)Ljavax/persistence/criteria/Expression<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/Expressions$Upper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/Expressions$Upper", "<init>", "(Ljavax/persistence/criteria/Expression;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "values", "(Ljava/util/Map;)Ljavax/persistence/criteria/Expression;", "<V:Ljava/lang/Object;M::Ljava/util/Map<*TV;>;>(TM;)Ljavax/persistence/criteria/Expression<Ljava/util/Collection<TV;>;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "array", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CompoundSelection<[Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CompoundSelections$Array");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Object;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompoundSelections$Array", "<init>", "(Ljava/lang/Class;[Ljavax/persistence/criteria/Selection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNotNull", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNull", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Predicate;", "(Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Predicate;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nullLiteral", "(Ljava/lang/Class;)Ljavax/persistence/criteria/Expression;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/Expression<TT;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "tuple", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CompoundSelection;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CompoundSelection<Ljavax/persistence/Tuple;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/criteria/CompoundSelections$Tuple");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompoundSelections$Tuple", "<init>", "([Ljavax/persistence/criteria/Selection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "qbe", "(Ljavax/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljavax/persistence/metamodel/Attribute;)Ljavax/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/From<*TT;>;TT;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljavax/persistence/metamodel/Attribute<**>;)Ljavax/persistence/criteria/Predicate;", null);
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
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/From", "isNull", "()Ljavax/persistence/criteria/Predicate;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "_model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/MetamodelImpl", "managedType", "(Ljava/lang/Class;)Ljavax/persistence/metamodel/ManagedType;", false);
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
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "javax/persistence/criteria/From", "java/lang/Object", "org/apache/openjpa/persistence/criteria/ComparisonStyle", "[Ljavax/persistence/metamodel/Attribute;", "javax/persistence/metamodel/ManagedType"}, 6, new Object[] {label2, label2, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "javax/persistence/metamodel/ManagedType", "javax/persistence/criteria/From", "java/lang/Object"});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "javax/persistence/criteria/From", "java/lang/Object", "org/apache/openjpa/persistence/criteria/ComparisonStyle", "[Ljavax/persistence/metamodel/Attribute;", "javax/persistence/metamodel/ManagedType"}, 7, new Object[] {label2, label2, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "javax/persistence/metamodel/ManagedType", "javax/persistence/criteria/From", "java/lang/Object", "org/apache/openjpa/persistence/criteria/ComparisonStyle"});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/criteria/CompareByExample", "<init>", "(Ljavax/persistence/criteria/CriteriaBuilder;Ljavax/persistence/metamodel/ManagedType;Ljavax/persistence/criteria/Path;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljavax/persistence/metamodel/Attribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "qbe", "(Ljavax/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;)Ljavax/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/From<*TT;>;TT;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbe", "(Ljavax/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljavax/persistence/metamodel/Attribute;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "qbe", "(Ljavax/persistence/criteria/From;Ljava/lang/Object;[Ljavax/persistence/metamodel/Attribute;)Ljavax/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/From<*TT;>;TT;[Ljavax/persistence/metamodel/Attribute<**>;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbeStyle", "()Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbe", "(Ljavax/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljavax/persistence/metamodel/Attribute;)Ljavax/persistence/criteria/Predicate;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "qbe", "(Ljavax/persistence/criteria/From;Ljava/lang/Object;)Ljavax/persistence/criteria/Predicate;", "<T:Ljava/lang/Object;>(Ljavax/persistence/criteria/From<*TT;>;TT;)Ljavax/persistence/criteria/Predicate;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbeStyle", "()Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "qbe", "(Ljavax/persistence/criteria/From;Ljava/lang/Object;Lorg/apache/openjpa/persistence/criteria/ComparisonStyle;[Ljavax/persistence/metamodel/Attribute;)Ljavax/persistence/criteria/Predicate;", false);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createTupleQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "createTupleQuery", "()Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createQuery", "(Ljava/lang/Class;)Ljavax/persistence/criteria/CriteriaQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/criteria/CriteriaBuilderImpl", "createQuery", "(Ljava/lang/Class;)Lorg/apache/openjpa/persistence/criteria/OpenJPACriteriaQuery;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "createQuery", "()Ljavax/persistence/criteria/CriteriaQuery;", null, null);
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
