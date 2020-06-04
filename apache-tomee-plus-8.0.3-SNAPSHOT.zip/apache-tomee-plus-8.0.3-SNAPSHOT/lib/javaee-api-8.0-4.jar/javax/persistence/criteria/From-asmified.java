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
public class FromDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/From", "<Z:Ljava/lang/Object;X:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/Path<TX;>;Ljavax/persistence/criteria/FetchParent<TZ;TX;>;", "java/lang/Object", new String[] { "javax/persistence/criteria/Path", "javax/persistence/criteria/FetchParent" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJoins", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/criteria/Join<TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isCorrelated", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCorrelationParent", "()Ljavax/persistence/criteria/From;", "()Ljavax/persistence/criteria/From<TZ;TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/SingularAttribute;)Ljavax/persistence/criteria/Join;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TX;TY;>;)Ljavax/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/SingularAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TX;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/CollectionAttribute;)Ljavax/persistence/criteria/CollectionJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/CollectionAttribute<-TX;TY;>;)Ljavax/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/SetAttribute;)Ljavax/persistence/criteria/SetJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SetAttribute<-TX;TY;>;)Ljavax/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/ListAttribute;)Ljavax/persistence/criteria/ListJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/ListAttribute<-TX;TY;>;)Ljavax/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/MapAttribute;)Ljavax/persistence/criteria/MapJoin;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljavax/persistence/metamodel/MapAttribute<-TX;TK;TV;>;)Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/CollectionAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/CollectionAttribute<-TX;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/SetAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SetAttribute<-TX;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/ListAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/ListAttribute<-TX;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljavax/persistence/metamodel/MapAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljavax/persistence/metamodel/MapAttribute<-TX;TK;TV;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljava/lang/String;)Ljavax/persistence/criteria/Join;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinCollection", "(Ljava/lang/String;)Ljavax/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinSet", "(Ljava/lang/String;)Ljavax/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinList", "(Ljava/lang/String;)Ljavax/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinMap", "(Ljava/lang/String;)Ljavax/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "join", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Join<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinCollection", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/CollectionJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinSet", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/SetJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinList", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/ListJoin<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "joinMap", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin;", "<X:Ljava/lang/Object;K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/MapJoin<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
