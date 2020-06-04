package asm.org.apache.commons.collections4;
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
public class IterableUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/IterableUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$UnmodifiableIterable", "org/apache/commons/collections4/IterableUtils", "UnmodifiableIterable", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$13", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$12", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$11", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$10", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$9", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$8", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$6", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$5", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$4", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "EMPTY_ITERABLE", "Lorg/apache/commons/collections4/FluentIterable;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyIterable", "()Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>()Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/IterableUtils", "EMPTY_ITERABLE", "Lorg/apache/commons/collections4/FluentIterable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "chainedIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Iterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "chainedIterable", "([Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "chainedIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Iterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "chainedIterable", "([Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "chainedIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Iterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "chainedIterable", "([Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "chainedIterable", "([Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>([Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "([Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$2", "<init>", "([Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "collatedIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Iterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "([Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$3", "<init>", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "collatedIterable", "(Ljava/util/Comparator;Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/util/Comparator<-TE;>;Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Iterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "([Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$4", "<init>", "(Ljava/util/Comparator;Ljava/lang/Iterable;Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "filteredIterable", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Predicate must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$5", "<init>", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "boundedIterable", "(Ljava/lang/Iterable;J)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;J)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MaxSize parameter must not be negative.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$6");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$6", "<init>", "(Ljava/lang/Iterable;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "loopingIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$7");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$7", "<init>", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "reversedIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$8");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$8", "<init>", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "skippingIterable", "(Ljava/lang/Iterable;J)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;J)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ElementsToSkip parameter must not be negative.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$9");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$9", "<init>", "(Ljava/lang/Iterable;J)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformedIterable", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Transformer;)Ljava/lang/Iterable;", "<I:Ljava/lang/Object;O:Ljava/lang/Object;>(Ljava/lang/Iterable<TI;>;Lorg/apache/commons/collections4/Transformer<-TI;+TO;>;)Ljava/lang/Iterable<TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Transformer must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$10");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$10", "<init>", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Transformer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "uniqueIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$11");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$11", "<init>", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/collections4/IterableUtils$UnmodifiableIterable");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$UnmodifiableIterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$UnmodifiableIterable", "<init>", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "zippingIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<+TE;>;Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$12");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$12", "<init>", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "zippingIterable", "(Ljava/lang/Iterable;[Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<+TE;>;[Ljava/lang/Iterable<+TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "([Ljava/lang/Iterable;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$13");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$13", "<init>", "([Ljava/lang/Iterable;Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyIfNull", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/lang/Iterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIterable", "()Ljava/lang/Iterable;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Iterable"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "forEach", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Closure;)V", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Closure<-TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "forEach", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Closure;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "forEachButLast", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Closure;)Ljava/lang/Object;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Closure<-TE;>;)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "forEachButLast", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Closure;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "find", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Ljava/lang/Object;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "find", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Predicate;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "indexOf", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)I", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "indexOf", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Predicate;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "matchesAll", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Z", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "matchesAll", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Predicate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "matchesAny", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Z", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "matchesAny", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Predicate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "countMatches", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)J", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)J", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Predicate must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIfNull", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "filteredIterable", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "size", "(Ljava/lang/Iterable;)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isEmpty", "(Ljava/lang/Iterable;)Z", "(Ljava/lang/Iterable<*>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Collection");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "isEmpty", "(Ljava/util/Iterator;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "contains", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Ljava/lang/Object;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Collection");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "contains", "(Ljava/util/Iterator;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "contains", "(Ljava/lang/Iterable;Ljava/lang/Object;Lorg/apache/commons/collections4/Equator;)Z", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<+TE;>;TE;Lorg/apache/commons/collections4/Equator<-TE;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Equator must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/EqualPredicate", "equalPredicate", "(Ljava/lang/Object;Lorg/apache/commons/collections4/Equator;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "matchesAny", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "frequency", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "<E:Ljava/lang/Object;T:TE;>(Ljava/lang/Iterable<TE;>;TT;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Set");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/collections4/Bag");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/Bag");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Bag", "getCount", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIfNull", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/functors/EqualPredicate", "equalPredicate", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/Predicate;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "filteredIterable", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "size", "(Ljava/lang/Iterable;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "get", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Iterable<TT;>;I)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/CollectionUtils", "checkIndexBounds", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/List");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "get", "(Ljava/util/Iterator;I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "first", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "<T:Ljava/lang/Object;>(Ljava/lang/Iterable<TT;>;)TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "get", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "size", "(Ljava/lang/Iterable;)I", "(Ljava/lang/Iterable<*>;)I", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Collection");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "size", "(Ljava/util/Iterator;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "partition", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Ljava/util/List;", "<O:Ljava/lang/Object;>(Ljava/lang/Iterable<+TO;>;Lorg/apache/commons/collections4/Predicate<-TO;>;)Ljava/util/List<Ljava/util/List<TO;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Predicate must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/ArrayList;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FactoryUtils", "instantiateFactory", "(Ljava/lang/Class;)Lorg/apache/commons/collections4/Factory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/collections4/Predicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "partition", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Factory;[Lorg/apache/commons/collections4/Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "partition", "(Ljava/lang/Iterable;[Lorg/apache/commons/collections4/Predicate;)Ljava/util/List;", "<O:Ljava/lang/Object;>(Ljava/lang/Iterable<+TO;>;[Lorg/apache/commons/collections4/Predicate<-TO;>;)Ljava/util/List<Ljava/util/List<TO;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/ArrayList;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FactoryUtils", "instantiateFactory", "(Ljava/lang/Class;)Lorg/apache/commons/collections4/Factory;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "partition", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Factory;[Lorg/apache/commons/collections4/Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "partition", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Factory;[Lorg/apache/commons/collections4/Predicate;)Ljava/util/List;", "<O:Ljava/lang/Object;R::Ljava/util/Collection<TO;>;>(Ljava/lang/Iterable<+TO;>;Lorg/apache/commons/collections4/Factory<TR;>;[Lorg/apache/commons/collections4/Predicate<-TO;>;)Ljava/util/List<TR;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIterable", "()Ljava/lang/Iterable;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "partition", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Factory;[Lorg/apache/commons/collections4/Predicate;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Predicates must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/commons/collections4/Predicate;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Predicate must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Factory", "create", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/CollectionUtils", "addAll", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/lang/Iterable", "org/apache/commons/collections4/Factory", "[Lorg/apache/commons/collections4/Predicate;", Opcodes.INTEGER, Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Factory", "create", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 9);
Label label10 = new Label();
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/Object", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/Predicate", "evaluate", "(Ljava/lang/Object;)Z", true);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(9, 1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNE, label13);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Collection");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toList", "(Ljava/lang/Iterable;)Ljava/util/List;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/util/List<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "toList", "(Ljava/util/Iterator;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toString", "(Ljava/lang/Iterable;)Ljava/lang/String;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "toString", "(Ljava/util/Iterator;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toString", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Transformer;)Ljava/lang/String;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;Ljava/lang/String;>;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Transformer must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "toString", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Transformer;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toString", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Transformer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;Ljava/lang/String;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "toString", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Transformer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "checkNotNull", "(Ljava/lang/Iterable;)V", "(Ljava/lang/Iterable<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Iterable must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_VARARGS, "checkNotNull", "([Ljava/lang/Iterable;)V", "([Ljava/lang/Iterable<*>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Iterables must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/Iterable;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", "<E:Ljava/lang/Object;>(Ljava/lang/Iterable<TE;>;)Ljava/util/Iterator<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "emptyIterator", "()Lorg/apache/commons/collections4/ResettableIterator;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/util/Iterator"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "emptyIteratorIfNull", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/IterableUtils$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/IterableUtils$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/IterableUtils", "EMPTY_ITERABLE", "Lorg/apache/commons/collections4/FluentIterable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
