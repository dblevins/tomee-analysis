package asm.javax.persistence.metamodel;
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
public class MetamodelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/persistence/metamodel/Metamodel", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "entity", "(Ljava/lang/Class;)Ljavax/persistence/metamodel/EntityType;", "<X:Ljava/lang/Object;>(Ljava/lang/Class<TX;>;)Ljavax/persistence/metamodel/EntityType<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "managedType", "(Ljava/lang/Class;)Ljavax/persistence/metamodel/ManagedType;", "<X:Ljava/lang/Object;>(Ljava/lang/Class<TX;>;)Ljavax/persistence/metamodel/ManagedType<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "embeddable", "(Ljava/lang/Class;)Ljavax/persistence/metamodel/EmbeddableType;", "<X:Ljava/lang/Object;>(Ljava/lang/Class<TX;>;)Ljavax/persistence/metamodel/EmbeddableType<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getManagedTypes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/metamodel/ManagedType<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEntities", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/metamodel/EntityType<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEmbeddables", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/persistence/metamodel/EmbeddableType<*>;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
