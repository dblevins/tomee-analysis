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
public class SubqueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/Subquery", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/AbstractQuery<TT;>;Ljakarta/persistence/criteria/Expression<TT;>;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/AbstractQuery", "jakarta/persistence/criteria/Expression" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "select", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Subquery;", "(Ljakarta/persistence/criteria/Expression<TT;>;)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Subquery;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Subquery;", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "groupBy", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Subquery;", "([Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groupBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/Subquery;", "(Ljava/util/List<Ljakarta/persistence/criteria/Expression<*>;>;)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "having", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Subquery;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "having", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Subquery;", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distinct", "(Z)Ljakarta/persistence/criteria/Subquery;", "(Z)Ljakarta/persistence/criteria/Subquery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljakarta/persistence/criteria/Root;)Ljakarta/persistence/criteria/Root;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Root<TY;>;)Ljakarta/persistence/criteria/Root<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljakarta/persistence/criteria/Join;)Ljakarta/persistence/criteria/Join;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Join<TX;TY;>;)Ljakarta/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljakarta/persistence/criteria/CollectionJoin;)Ljakarta/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;)Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljakarta/persistence/criteria/SetJoin;)Ljakarta/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/SetJoin<TX;TY;>;)Ljakarta/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljakarta/persistence/criteria/ListJoin;)Ljakarta/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/ListJoin<TX;TY;>;)Ljakarta/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "correlate", "(Ljakarta/persistence/criteria/MapJoin;)Ljakarta/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParent", "()Ljakarta/persistence/criteria/AbstractQuery;", "()Ljakarta/persistence/criteria/AbstractQuery<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContainingQuery", "()Ljakarta/persistence/criteria/CommonAbstractCriteria;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSelection", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCorrelatedJoins", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/criteria/Join<**>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getSelection", "()Ljakarta/persistence/criteria/Selection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "getSelection", "()Ljakarta/persistence/criteria/Expression;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "distinct", "(Z)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "distinct", "(Z)Ljakarta/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "having", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "having", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "groupBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "groupBy", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/Subquery", "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Subquery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
