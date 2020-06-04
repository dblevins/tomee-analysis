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
public class CriteriaUpdateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/CriteriaUpdate", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/CommonAbstractCriteria;", "java/lang/Object", new String[] { "javax/persistence/criteria/CommonAbstractCriteria" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljava/lang/Class;)Ljavax/persistence/criteria/Root;", "(Ljava/lang/Class<TT;>;)Ljavax/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "from", "(Ljavax/persistence/metamodel/EntityType;)Ljavax/persistence/criteria/Root;", "(Ljavax/persistence/metamodel/EntityType<TT;>;)Ljavax/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRoot", "()Ljavax/persistence/criteria/Root;", "()Ljavax/persistence/criteria/Root<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljavax/persistence/metamodel/SingularAttribute;Ljava/lang/Object;)Ljavax/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;X:TY;>(Ljavax/persistence/metamodel/SingularAttribute<-TT;TY;>;TX;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljavax/persistence/metamodel/SingularAttribute;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TT;TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljavax/persistence/criteria/Path;Ljava/lang/Object;)Ljavax/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;X:TY;>(Ljavax/persistence/criteria/Path<TY;>;TX;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljavax/persistence/criteria/Path;Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaUpdate;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/criteria/Path<TY;>;Ljavax/persistence/criteria/Expression<+TY;>;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/criteria/CriteriaUpdate;", "(Ljava/lang/String;Ljava/lang/Object;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "where", "(Ljavax/persistence/criteria/Expression;)Ljavax/persistence/criteria/CriteriaUpdate;", "(Ljavax/persistence/criteria/Expression<Ljava/lang/Boolean;>;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "where", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaUpdate;", "([Ljavax/persistence/criteria/Predicate;)Ljavax/persistence/criteria/CriteriaUpdate<TT;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
