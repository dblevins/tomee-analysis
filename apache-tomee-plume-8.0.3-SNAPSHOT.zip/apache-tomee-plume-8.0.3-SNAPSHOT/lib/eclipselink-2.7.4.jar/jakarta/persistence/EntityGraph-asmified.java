package asm.jakarta.persistence;
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
public class EntityGraphDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/persistence/EntityGraph", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addAttributeNodes", "([Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS | ACC_ABSTRACT, "addAttributeNodes", "([Ljakarta/persistence/metamodel/Attribute;)V", "([Ljakarta/persistence/metamodel/Attribute<TT;*>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSubgraph", "(Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/Attribute<TT;TX;>;)Ljakarta/persistence/Subgraph<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSubgraph", "(Ljakarta/persistence/metamodel/Attribute;Ljava/lang/Class;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/Attribute<TT;TX;>;Ljava/lang/Class<+TX;>;)Ljakarta/persistence/Subgraph<+TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSubgraph", "(Ljava/lang/String;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/Subgraph<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSubgraph", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TX;>;)Ljakarta/persistence/Subgraph<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addKeySubgraph", "(Ljakarta/persistence/metamodel/Attribute;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/Attribute<TT;TX;>;)Ljakarta/persistence/Subgraph<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addKeySubgraph", "(Ljakarta/persistence/metamodel/Attribute;Ljava/lang/Class;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljakarta/persistence/metamodel/Attribute<TT;TX;>;Ljava/lang/Class<+TX;>;)Ljakarta/persistence/Subgraph<+TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addKeySubgraph", "(Ljava/lang/String;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljava/lang/String;)Ljakarta/persistence/Subgraph<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addKeySubgraph", "(Ljava/lang/String;Ljava/lang/Class;)Ljakarta/persistence/Subgraph;", "<X:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TX;>;)Ljakarta/persistence/Subgraph<TX;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSubclassSubgraph", "(Ljava/lang/Class;)Ljakarta/persistence/Subgraph;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<+TT;>;)Ljakarta/persistence/Subgraph<+TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeNodes", "()Ljava/util/List;", "()Ljava/util/List<Ljakarta/persistence/AttributeNode<*>;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
