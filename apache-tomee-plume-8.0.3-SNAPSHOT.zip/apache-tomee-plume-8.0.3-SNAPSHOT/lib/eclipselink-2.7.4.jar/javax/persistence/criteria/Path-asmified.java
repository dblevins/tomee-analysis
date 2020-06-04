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
public class PathDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/criteria/Path", "<X:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/persistence/criteria/Expression<TX;>;", "java/lang/Object", new String[] { "javax/persistence/criteria/Expression" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getModel", "()Ljavax/persistence/metamodel/Bindable;", "()Ljavax/persistence/metamodel/Bindable<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParentPath", "()Ljavax/persistence/criteria/Path;", "()Ljavax/persistence/criteria/Path<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljavax/persistence/metamodel/SingularAttribute;)Ljavax/persistence/criteria/Path;", "<Y:Ljava/lang/Object;>(Ljavax/persistence/metamodel/SingularAttribute<-TX;TY;>;)Ljavax/persistence/criteria/Path<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljavax/persistence/metamodel/PluralAttribute;)Ljavax/persistence/criteria/Expression;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljavax/persistence/metamodel/PluralAttribute<TX;TC;TE;>;)Ljavax/persistence/criteria/Expression<TC;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljavax/persistence/metamodel/MapAttribute;)Ljavax/persistence/criteria/Expression;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;M::Ljava/util/Map<TK;TV;>;>(Ljavax/persistence/metamodel/MapAttribute<TX;TK;TV;>;)Ljavax/persistence/criteria/Expression<TM;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "type", "()Ljavax/persistence/criteria/Expression;", "()Ljavax/persistence/criteria/Expression<Ljava/lang/Class<+TX;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/String;)Ljavax/persistence/criteria/Path;", "<Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljavax/persistence/criteria/Path<TY;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
