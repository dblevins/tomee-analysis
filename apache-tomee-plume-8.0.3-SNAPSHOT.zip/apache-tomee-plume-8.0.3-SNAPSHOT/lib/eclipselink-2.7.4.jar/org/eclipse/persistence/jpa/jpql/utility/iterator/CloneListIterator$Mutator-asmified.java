package asm.org.eclipse.persistence.jpa.jpql.utility.iterator;
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
public class CloneListIterator$MutatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator", "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator", "Mutator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator$ReadOnly", "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator", "ReadOnly", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(ILjava/lang/Object;)V", "(ITT;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "remove", "(I)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "set", "(ILjava/lang/Object;)V", "(ITT;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
