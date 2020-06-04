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
public class ExpressionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/Expression", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/Selection<TT;>;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/Selection" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNull", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isNotNull", "()Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "in", "([Ljava/lang/Object;)Ljakarta/persistence/criteria/Predicate;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "in", "([Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "([Ljakarta/persistence/criteria/Expression<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "in", "(Ljava/util/Collection;)Ljakarta/persistence/criteria/Predicate;", "(Ljava/util/Collection<*>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "in", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/Predicate;", "(Ljakarta/persistence/criteria/Expression<Ljava/util/Collection<*>;>;)Ljakarta/persistence/criteria/Predicate;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "as", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Expression;", "<X:Ljava/lang/Object;>(Ljava/lang/Class<TX;>;)Ljakarta/persistence/criteria/Expression<TX;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
