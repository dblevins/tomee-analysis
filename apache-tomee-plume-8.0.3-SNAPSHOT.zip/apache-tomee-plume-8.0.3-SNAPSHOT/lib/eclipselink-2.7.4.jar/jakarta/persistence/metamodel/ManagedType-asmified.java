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
public class ManagedTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/metamodel/ManagedType", "<X:Ljava/lang/Object;>Ljava/lang/Object;Ljakarta/persistence/metamodel/Type<TX;>;", "java/lang/Object", new String[] { "jakarta/persistence/metamodel/Type" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/metamodel/Attribute<-TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredAttributes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/metamodel/Attribute<TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSingularAttribute", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/SingularAttribute;", "<Y:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TY;>;)Ljakarta/persistence/metamodel/SingularAttribute<-TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredSingularAttribute", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/SingularAttribute;", "<Y:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TY;>;)Ljakarta/persistence/metamodel/SingularAttribute<TX;TY;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSingularAttributes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/metamodel/SingularAttribute<-TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredSingularAttributes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/metamodel/SingularAttribute<TX;*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCollection", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/CollectionAttribute;", "<E:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)Ljakarta/persistence/metamodel/CollectionAttribute<-TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredCollection", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/CollectionAttribute;", "<E:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)Ljakarta/persistence/metamodel/CollectionAttribute<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSet", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/SetAttribute;", "<E:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)Ljakarta/persistence/metamodel/SetAttribute<-TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredSet", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/SetAttribute;", "<E:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)Ljakarta/persistence/metamodel/SetAttribute<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getList", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/ListAttribute;", "<E:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)Ljakarta/persistence/metamodel/ListAttribute<-TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredList", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/metamodel/ListAttribute;", "<E:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TE;>;)Ljakarta/persistence/metamodel/ListAttribute<TX;TE;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMap", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljakarta/persistence/metamodel/MapAttribute;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TK;>;Ljava/lang/Class<TV;>;)Ljakarta/persistence/metamodel/MapAttribute<-TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredMap", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)Ljakarta/persistence/metamodel/MapAttribute;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TK;>;Ljava/lang/Class<TV;>;)Ljakarta/persistence/metamodel/MapAttribute<TX;TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPluralAttributes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/metamodel/PluralAttribute<-TX;**>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredPluralAttributes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/persistence/metamodel/PluralAttribute<TX;**>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttribute", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/Attribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/Attribute<-TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredAttribute", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/Attribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/Attribute<TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSingularAttribute", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SingularAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SingularAttribute<-TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredSingularAttribute", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SingularAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SingularAttribute<TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCollection", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/CollectionAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/CollectionAttribute<-TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredCollection", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/CollectionAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/CollectionAttribute<TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSet", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SetAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SetAttribute<-TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredSet", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SetAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/SetAttribute<TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getList", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/ListAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/ListAttribute<-TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredList", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/ListAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/ListAttribute<TX;*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMap", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/MapAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/MapAttribute<-TX;**>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeclaredMap", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/MapAttribute;", "(Ljava/lang/String;)Ljakarta/persistence/metamodel/MapAttribute<TX;**>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
