package asm.org.apache.commons.collections4.set;
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
public class CompositeSet$SetMutatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/commons/collections4/set/CompositeSet$SetMutator", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/io/Serializable;", "java/lang/Object", new String[] { "java/io/Serializable" });

classWriter.visitInnerClass("org/apache/commons/collections4/set/CompositeSet$SetMutator", "org/apache/commons/collections4/set/CompositeSet", "SetMutator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(Lorg/apache/commons/collections4/set/CompositeSet;Ljava/util/List;Ljava/lang/Object;)Z", "(Lorg/apache/commons/collections4/set/CompositeSet<TE;>;Ljava/util/List<Ljava/util/Set<TE;>;>;TE;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAll", "(Lorg/apache/commons/collections4/set/CompositeSet;Ljava/util/List;Ljava/util/Collection;)Z", "(Lorg/apache/commons/collections4/set/CompositeSet<TE;>;Ljava/util/List<Ljava/util/Set<TE;>;>;Ljava/util/Collection<+TE;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "resolveCollision", "(Lorg/apache/commons/collections4/set/CompositeSet;Ljava/util/Set;Ljava/util/Set;Ljava/util/Collection;)V", "(Lorg/apache/commons/collections4/set/CompositeSet<TE;>;Ljava/util/Set<TE;>;Ljava/util/Set<TE;>;Ljava/util/Collection<TE;>;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
