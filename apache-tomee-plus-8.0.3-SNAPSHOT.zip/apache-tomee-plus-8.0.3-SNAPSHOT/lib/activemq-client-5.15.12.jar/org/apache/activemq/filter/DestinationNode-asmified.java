package asm.org.apache.activemq.filter;
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
public class DestinationNodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/activemq/filter/DestinationNode", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "appendMatchingValues", "(Ljava/util/Set;[Ljava/lang/String;I)V", "(Ljava/util/Set<Lorg/apache/activemq/filter/DestinationNode;>;[Ljava/lang/String;I)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "appendMatchingWildcards", "(Ljava/util/Set;[Ljava/lang/String;I)V", "(Ljava/util/Set<Lorg/apache/activemq/filter/DestinationNode;>;[Ljava/lang/String;I)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "appendDescendantValues", "(Ljava/util/Set;)V", "(Ljava/util/Set<Lorg/apache/activemq/filter/DestinationNode;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDesendentValues", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/activemq/filter/DestinationNode;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChild", "(Ljava/lang/String;)Lorg/apache/activemq/filter/DestinationNode;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getValues", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/activemq/filter/DestinationNode;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getChildren", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/activemq/filter/DestinationNode;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeDesendentValues", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/activemq/filter/DestinationNode;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeValues", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/apache/activemq/filter/DestinationNode;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
