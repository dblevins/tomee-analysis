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
public class SubqueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/Subquery", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/AbstractQuery<TT;>;Ljavax/persistence/criteria/Expression<TT;>;", "java/lang/Object", new String[] { "javax/persistence/criteria/AbstractQuery", "javax/persistence/criteria/Expression" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "select", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Subquery;", "(Ljavax/persistence/criteria/Expression<TT;>;)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Subquery;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Subquery;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "groupBy", "([Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Subquery;", "([Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groupBy", "(Ljava/util/List;)Ljavax/persistence/criteria/Subquery;", "(Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "having", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Subquery;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "having", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Subquery;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distinct", "(Z)Ljavax/persistence/criteria/Subquery;", "(Z)Ljavax/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljavax/persistence/criteria/Root;)Ljavax/persistence/criteria/Root;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Root<TY;>;)Ljavax/persistence/criteria/Root<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljavax/persistence/criteria/Join;)Ljavax/persistence/criteria/Join;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Join<TX;TY;>;)Ljavax/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljavax/persistence/criteria/CollectionJoin;)Ljavax/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/CollectionJoin<TX;TY;>;)Ljavax/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljavax/persistence/criteria/SetJoin;)Ljavax/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/SetJoin<TX;TY;>;)Ljavax/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljavax/persistence/criteria/ListJoin;)Ljavax/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/ListJoin<TX;TY;>;)Ljavax/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljavax/persistence/criteria/MapJoin;)Ljavax/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;)Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParent", "()Ljavax/persistence/criteria/AbstractQuery;", "()Ljavax/persistence/criteria/AbstractQuery<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContainingQuery", "()Ljavax/persistence/criteria/CommonAbstractCriteria;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSelection", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCorrelatedJoins", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/criteria/Join<**>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSelection", "()Ljavax/persistence/criteria/Selection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "getSelection", "()Ljavax/persistence/criteria/Expression;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "distinct", "(Z)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "distinct", "(Z)Ljavax/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "having", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "having", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "(Ljava/util/List;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "groupBy", "(Ljava/util/List;)Ljavax/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "([Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "groupBy", "([Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/Subquery", "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
