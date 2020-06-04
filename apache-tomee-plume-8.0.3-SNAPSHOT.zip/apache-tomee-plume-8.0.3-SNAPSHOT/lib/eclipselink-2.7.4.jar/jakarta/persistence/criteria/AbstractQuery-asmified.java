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
public class AbstractQueryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/AbstractQuery", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/CommonAbstractCriteria;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/CommonAbstractCriteria" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Root;", "<X:Ljava/lang/Object;>(Ljava/lang/Class<TX;>;)Ljakarta/persistence/criteria/Root<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljakarta/persistence/metamodel/EntityType;)Ljakarta/persistence/criteria/Root;", "<X:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/EntityType<TX;>;)Ljakarta/persistence/criteria/Root<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery;", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "groupBy", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", "([Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "groupBy", "(Ljava/util/List;)Ljakarta/persistence/criteria/AbstractQuery;", "(Ljava/util/List<Ljakarta/persistence/criteria/Expression<*>;>;)Ljakarta/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "having", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/AbstractQuery;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "having", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery;", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distinct", "(Z)Ljakarta/persistence/criteria/AbstractQuery;", "(Z)Ljakarta/persistence/criteria/AbstractQuery<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRoots", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/criteria/Root<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSelection", "()Ljakarta/persistence/criteria/Selection;", "()Ljakarta/persistence/criteria/Selection<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGroupList", "()Ljava/util/List;", "()Ljava/util/List<Ljakarta/persistence/criteria/Expression<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGroupRestriction", "()Ljakarta/persistence/criteria/Predicate;", null, null);
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
