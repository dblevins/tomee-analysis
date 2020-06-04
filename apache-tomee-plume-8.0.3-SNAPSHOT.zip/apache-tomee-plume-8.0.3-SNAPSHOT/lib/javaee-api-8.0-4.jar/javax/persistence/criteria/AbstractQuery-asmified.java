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
public class AbstractQueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/AbstractQuery", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/CommonAbstractCriteria;", "java/lang/Object", new String[] { "javax/persistence/criteria/CommonAbstractCriteria" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljava/lang/Class;)Ljavax/persistence/criteria/Root;", "<X:Ljava/lang/Object;>(Ljava/lang/Class<TX;>;)Ljavax/persistence/criteria/Root<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljavax/persistence/metamodel/EntityType;)Ljavax/persistence/criteria/Root;", "<X:Ljava/lang/Object;>(Ljavax/persistence/metamodel/EntityType<TX;>;)Ljavax/persistence/criteria/Root<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "groupBy", "([Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", "([Ljavax/persistence/criteria/Expression<*>;)Ljavax/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groupBy", "(Ljava/util/List;)Ljavax/persistence/criteria/AbstractQuery;", "(Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;)Ljavax/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "having", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/AbstractQuery;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "having", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distinct", "(Z)Ljavax/persistence/criteria/AbstractQuery;", "(Z)Ljavax/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRoots", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/criteria/Root<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSelection", "()Ljavax/persistence/criteria/Selection;", "()Ljavax/persistence/criteria/Selection<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGroupList", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/persistence/criteria/Expression<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGroupRestriction", "()Ljavax/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isDistinct", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResultType", "()Ljava/lang/Class;", "()Ljava/lang/Class<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
