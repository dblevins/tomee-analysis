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
public class CriteriaQueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/AbstractQuery<TT;>;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/AbstractQuery" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "select", "(Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CriteriaQuery;", "(Ljakarta/persistence/criteria/Selection<+TT;>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "multiselect", "([Ljakarta/persistence/criteria/Selection;)Ljakarta/persistence/criteria/CriteriaQuery;", "([Ljakarta/persistence/criteria/Selection<*>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "multiselect", "(Ljava/util/List;)Ljakarta/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljakarta/persistence/criteria/Selection<*>;>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaQuery;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaQuery;", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "groupBy", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaQuery;", "([Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groupBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljakarta/persistence/criteria/Expression<*>;>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "having", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaQuery;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "having", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaQuery;", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "orderBy", "([Ljakarta/persistence/criteria/Order;)Ljakarta/persistence/criteria/CriteriaQuery;", "([Ljakarta/persistence/criteria/Order;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "orderBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljakarta/persistence/criteria/Order;>;)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distinct", "(Z)Ljakarta/persistence/criteria/CriteriaQuery;", "(Z)Ljakarta/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOrderList", "()Ljava/util/List;", "()Ljava/util/List<Ljakarta/persistence/criteria/Order;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParameters", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/criteria/ParameterExpression<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "distinct", "(Z)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "distinct", "(Z)Ljakarta/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "having", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "having", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "groupBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "groupBy", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/criteria/CriteriaQuery", "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
