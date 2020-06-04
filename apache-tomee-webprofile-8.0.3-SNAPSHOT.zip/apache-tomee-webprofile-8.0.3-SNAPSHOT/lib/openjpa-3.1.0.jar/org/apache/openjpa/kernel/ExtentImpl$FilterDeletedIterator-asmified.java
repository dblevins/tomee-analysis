package asm.org.apache.openjpa.kernel;
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
public class ExtentImpl$FilterDeletedIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", null, "org/apache/commons/collections4/iterators/FilterIterator", new String[] { "org/apache/openjpa/kernel/ExtentImpl$CloseableIterator", "org/apache/commons/collections4/Predicate" });

classWriter.visitInnerClass("org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "org/apache/openjpa/kernel/ExtentImpl", "FilterDeletedIterator", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/kernel/ExtentImpl$CloseableIterator", "org/apache/openjpa/kernel/ExtentImpl", "CloseableIterator", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_closed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Iterator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/iterators/FilterIterator", "<init>", "(Ljava/util/Iterator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_closed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "setPredicate", "(Lorg/apache/commons/collections4/Predicate;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_closed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/iterators/FilterIterator", "hasNext", "()Z", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_closed", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/iterators/FilterIterator", "next", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRemoveOnClose", "(Lorg/apache/openjpa/kernel/ExtentImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/ExtentImpl", "access$100", "(Lorg/apache/openjpa/kernel/ExtentImpl;)Lorg/apache/openjpa/lib/util/ReferenceHashSet;", false);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExtentImpl", "lock", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/ExtentImpl", "access$100", "(Lorg/apache/openjpa/kernel/ExtentImpl;)Lorg/apache/openjpa/lib/util/ReferenceHashSet;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/ReferenceHashSet", "remove", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExtentImpl", "unlock", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExtentImpl", "unlock", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_closed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "getIterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/lib/util/Closeable");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/util/Closeable", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/kernel/ExtentImpl$FilterDeletedIterator", "_extent", "Lorg/apache/openjpa/kernel/ExtentImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/kernel/ExtentImpl", "access$200", "(Lorg/apache/openjpa/kernel/ExtentImpl;)Lorg/apache/openjpa/kernel/Broker;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/Broker", "isDeleted", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
