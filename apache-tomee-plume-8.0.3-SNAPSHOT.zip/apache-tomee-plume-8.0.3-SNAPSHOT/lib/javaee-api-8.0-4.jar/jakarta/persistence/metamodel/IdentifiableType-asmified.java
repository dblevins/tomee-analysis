package asm.jakarta.persistence.metamodel;
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
public class IdentifiableTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/metamodel/IdentifiableType", "<X:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/metamodel/ManagedType<TX;>;", "java/lang/Object", new String[] { "jakarta/persistence/metamodel/ManagedType" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getId", "(Ljava/lang/Class;)Ljakarta/persistence/metamodel/SingularAttribute;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;)Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredId", "(Ljava/lang/Class;)Ljakarta/persistence/metamodel/SingularAttribute;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;)Ljakarta/persistence/metamodel/SingularAttribute<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getVersion", "(Ljava/lang/Class;)Ljakarta/persistence/metamodel/SingularAttribute;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;)Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredVersion", "(Ljava/lang/Class;)Ljakarta/persistence/metamodel/SingularAttribute;", "<Y:Ljava/lang/Object;>(Ljava/lang/Class<TY;>;)Ljakarta/persistence/metamodel/SingularAttribute<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSupertype", "()Ljakarta/persistence/metamodel/IdentifiableType;", "()Ljakarta/persistence/metamodel/IdentifiableType<-TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasSingleIdAttribute", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasVersionAttribute", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIdClassAttributes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/metamodel/SingularAttribute<-TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getIdType", "()Ljakarta/persistence/metamodel/Type;", "()Ljakarta/persistence/metamodel/Type<*>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
