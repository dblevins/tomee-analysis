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
public class CloneListIterable$DefaultMutatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "Ljava/lang/Object;Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator<TE;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator" });

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "DefaultMutator", ACC_PROTECTED);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator", "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator", "Mutator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "this$0", "Lorg/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(ILjava/lang/Object;)V", "(ITE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "this$0", "Lorg/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "add", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "this$0", "Lorg/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "remove", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "set", "(ILjava/lang/Object;)V", "(ITE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "this$0", "Lorg/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "set", "(ILjava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
