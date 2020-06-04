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
public class FetchParentDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/FetchParent", "<Z:Ljava/lang/Object;X:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getFetches", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/criteria/Fetch<TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fetch", "(Ljavax/persistence/metamodel/SingularAttribute;)Ljavax/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TX;TY;>;)Ljavax/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fetch", "(Ljavax/persistence/metamodel/SingularAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TX;TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fetch", "(Ljavax/persistence/metamodel/PluralAttribute;)Ljavax/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/PluralAttribute<-TX;*TY;>;)Ljavax/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fetch", "(Ljavax/persistence/metamodel/PluralAttribute;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Fetch;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/PluralAttribute<-TX;*TY;>;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fetch", "(Ljava/lang/String;)Ljavax/persistence/criteria/Fetch;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "fetch", "(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Fetch;", "<X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Ljava/lang/String;Ljavax/persistence/criteria/JoinType;)Ljavax/persistence/criteria/Fetch<TX;TY;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
