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
public class CloneListIterableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "<E:Ljava/lang/Object;>Ljava/lang/Object;Lorg/eclipse/persistence/jpa/jpql/utility/iterable/ListIterable<TE;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/jpa/jpql/utility/iterable/ListIterable" });

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "DefaultMutator", ACC_PROTECTED);

classWriter.visitInnerClass("org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator", "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator", "Mutator", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mutator", "Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;", "Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator<TE;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "buildDefaultMutator", "()Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "mutator", "Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;)V", "(Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "org/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable", "mutator", "Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildDefaultMutator", "()Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator;", "()Lorg/eclipse/persistence/jpa/jpql/utility/iterator/CloneListIterator$Mutator<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable$DefaultMutator", "<init>", "(Lorg/eclipse/persistence/jpa/jpql/utility/iterable/CloneListIterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "add", "(ILjava/lang/Object;)V", "(ITE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("This method was not overridden.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "remove", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("This method was not overridden.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "set", "(ILjava/lang/Object;)V", "(ITE;)V", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("This method was not overridden.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
