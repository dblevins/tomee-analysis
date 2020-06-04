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
public class FromDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/From", "<Z:Ljava/lang/Object;X:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/Path<TX;>;Ljakarta/persistence/criteria/FetchParent<TZ;TX;>;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/Path", "jakarta/persistence/criteria/FetchParent" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJoins", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/criteria/Join<TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isCorrelated", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCorrelationParent", "()Ljakarta/persistence/criteria/From;", "()Ljakarta/persistence/criteria/From<TZ;TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/SingularAttribute;)Ljakarta/persistence/criteria/Join;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/SingularAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;)Ljakarta/persistence/criteria/CollectionJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/CollectionAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/SetAttribute;)Ljakarta/persistence/criteria/SetJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SetAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/ListAttribute;)Ljakarta/persistence/criteria/ListJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/ListAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/MapAttribute;)Ljakarta/persistence/criteria/MapJoin;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/MapAttribute<-TX;TK;TV;>;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/CollectionAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/CollectionAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/SetAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SetAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/ListAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/ListAttribute<-TX;TY;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljakarta/persistence/metamodel/MapAttribute;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/MapAttribute<-TX;TK;TV;>;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljava/lang/String;)Ljakarta/persistence/criteria/Join;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinCollection", "(Ljava/lang/String;)Ljakarta/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinSet", "(Ljava/lang/String;)Ljakarta/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinList", "(Ljava/lang/String;)Ljakarta/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinMap", "(Ljava/lang/String;)Ljakarta/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinCollection", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinSet", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinList", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinMap", "(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljakarta/persistence/criteria/JoinType;)Ljakarta/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
