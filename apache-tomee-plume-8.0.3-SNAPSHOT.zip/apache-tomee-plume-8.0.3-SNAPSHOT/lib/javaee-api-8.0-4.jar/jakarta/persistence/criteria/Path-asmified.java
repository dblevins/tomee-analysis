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
public class PathDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/criteria/Path", "<X:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/criteria/Expression<TX;>;", "java/lang/Object", new String[] { "jakarta/persistence/criteria/Expression" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getModel", "()Ljakarta/persistence/metamodel/Bindable;", "()Ljakarta/persistence/metamodel/Bindable<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getParentPath", "()Ljakarta/persistence/criteria/Path;", "()Ljakarta/persistence/criteria/Path<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljakarta/persistence/metamodel/SingularAttribute;)Ljakarta/persistence/criteria/Path;", "<Y:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;)Ljakarta/persistence/criteria/Path<TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljakarta/persistence/metamodel/PluralAttribute;)Ljakarta/persistence/criteria/Expression;", "<E:Ljava/lang/Object;C::Ljava/util/Collection<TE;>;>(Ljakarta/persistence/metamodel/PluralAttribute<TX;TC;TE;>;)Ljakarta/persistence/criteria/Expression<TC;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljakarta/persistence/metamodel/MapAttribute;)Ljakarta/persistence/criteria/Expression;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;M::Ljava/util/Map<TK;TV;>;>(Ljakarta/persistence/metamodel/MapAttribute<TX;TK;TV;>;)Ljakarta/persistence/criteria/Expression<TM;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "type", "()Ljakarta/persistence/criteria/Expression;", "()Ljakarta/persistence/criteria/Expression<Ljava/lang/Class<+TX;>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/String;)Ljakarta/persistence/criteria/Path;", "<Y:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/criteria/Path<TY;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
