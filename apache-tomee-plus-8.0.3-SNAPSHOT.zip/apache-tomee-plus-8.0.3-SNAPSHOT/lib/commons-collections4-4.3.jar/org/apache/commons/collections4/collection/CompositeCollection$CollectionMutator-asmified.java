package asm.org.apache.commons.collections4.collection;
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
public class CompositeCollection$CollectionMutatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/commons/collections4/collection/CompositeCollection$CollectionMutator", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/io/Serializable;", "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/commons/collections4/collection/CompositeCollection$CollectionMutator", "org/apache/commons/collections4/collection/CompositeCollection", "CollectionMutator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(Lorg/apache/commons/collections4/collection/CompositeCollection;Ljava/util/List;Ljava/lang/Object;)Z", "(Lorg/apache/commons/collections4/collection/CompositeCollection<TE;>;Ljava/util/List<Ljava/util/Collection<TE;>;>;TE;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAll", "(Lorg/apache/commons/collections4/collection/CompositeCollection;Ljava/util/List;Ljava/util/Collection;)Z", "(Lorg/apache/commons/collections4/collection/CompositeCollection<TE;>;Ljava/util/List<Ljava/util/Collection<TE;>;>;Ljava/util/Collection<+TE;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "remove", "(Lorg/apache/commons/collections4/collection/CompositeCollection;Ljava/util/List;Ljava/lang/Object;)Z", "(Lorg/apache/commons/collections4/collection/CompositeCollection<TE;>;Ljava/util/List<Ljava/util/Collection<TE;>;>;Ljava/lang/Object;)Z", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
