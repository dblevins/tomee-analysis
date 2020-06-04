package asm.org.eclipse.persistence.jpa.jpql.utility.iterable;
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
public class SnapshotCloneListIterable$LocalCloneListIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/utility/iterable/SnapshotCloneListIterable$LocalCloneListIterator", "<E:Ljava/lang/Object;>Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator<TE;>;", "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterable/SnapshotCloneListIterable$LocalCloneListIterator", "org/eclipse/persistence/jpa/jpql/utility/iterable/SnapshotCloneListIterable", "LocalCloneListIterator", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator", "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator", "Mutator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;[Ljava/lang/Object;)V", "(Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator<TE;>;[Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
