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
public class CriteriaQueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/CriteriaQuery", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/AbstractQuery<TT;>;", "java/lang/Object", new String[] { "javax/persistence/criteria/AbstractQuery" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "select", "(Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljavax/persistence/criteria/Selection<+TT;>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "multiselect", "([Ljavax/persistence/criteria/Selection;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Selection<*>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "multiselect", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljavax/persistence/criteria/Selection<*>;>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "groupBy", "([Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groupBy", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "having", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "having", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "orderBy", "([Ljavax/persistence/criteria/Order;)Ljavax/persistence/criteria/CriteriaQuery;", "([Ljavax/persistence/criteria/Order;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "orderBy", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", "(Ljava/util/List<Ljavax/persistence/criteria/Order;>;)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distinct", "(Z)Ljavax/persistence/criteria/CriteriaQuery;", "(Z)Ljavax/persistence/criteria/CriteriaQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOrderList", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/persistence/criteria/Order;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParameters", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/criteria/ParameterExpression<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "distinct", "(Z)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "distinct", "(Z)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "having", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "having", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "having", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "(Ljava/util/List;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "groupBy", "(Ljava/util/List;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "groupBy", "([Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "groupBy", "([Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/persistence/criteria/CriteriaQuery", "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaQuery;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
