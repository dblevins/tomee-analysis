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
public class CriteriaUpdateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/CriteriaUpdate", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/CommonAbstractCriteria;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/CommonAbstractCriteria" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljava/lang/Class;)Ljakarta/persistence/criteria/Root;", "(Ljava/lang/Class<TT;>;)Ljakarta/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljakarta/persistence/metamodel/EntityType;)Ljakarta/persistence/criteria/Root;", "(Ljakarta/persistence/metamodel/EntityType<TT;>;)Ljakarta/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRoot", "()Ljakarta/persistence/criteria/Root;", "()Ljakarta/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljava/lang/Object;)Ljakarta/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;X:TY;>(Ljakarta/persistence/metamodel/SingularAttribute<-TT;TY;>;TX;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TT;TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljakarta/persistence/criteria/Path;Ljava/lang/Object;)Ljakarta/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;X:TY;>(Ljakarta/persistence/criteria/Path<TY;>;TX;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljakarta/persistence/criteria/Path;Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/criteria/Path<TY;>;Ljakarta/persistence/criteria/Expression<+TY;>;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/persistence/criteria/CriteriaUpdate;", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljakarta/persistence/criteria/Expression;)Ljakarta/persistence/criteria/CriteriaUpdate;", "(Ljakarta/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaUpdate;", "([Ljakarta/persistence/criteria/Predicate;)Ljakarta/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
