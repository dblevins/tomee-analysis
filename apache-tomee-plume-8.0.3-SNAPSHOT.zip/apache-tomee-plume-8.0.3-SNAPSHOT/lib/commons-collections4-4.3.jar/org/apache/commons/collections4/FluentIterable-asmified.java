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
public class FluentIterableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/FluentIterable", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/lang/Iterable<TE;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "iterable", "Ljava/lang/Iterable;", "Ljava/lang/Iterable<TE;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "empty", "()Lorg/apache/commons/collections4/FluentIterable;", "<T:Ljava/lang/Object;>()Lorg/apache/commons/collections4/FluentIterable<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/IterableUtils", "EMPTY_ITERABLE", "Lorg/apache/commons/collections4/FluentIterable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "of", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/FluentIterable;", "<T:Ljava/lang/Object;>(TT;)Lorg/apache/commons/collections4/FluentIterable<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/iterators/SingletonIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/iterators/SingletonIterator", "<init>", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "asIterable", "(Ljava/util/Iterator;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "of", "([Ljava/lang/Object;)Lorg/apache/commons/collections4/FluentIterable;", "<T:Ljava/lang/Object;>([TT;)Lorg/apache/commons/collections4/FluentIterable<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", "<T:Ljava/lang/Object;>(Ljava/lang/Iterable<TT;>;)Lorg/apache/commons/collections4/FluentIterable<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "checkNotNull", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/commons/collections4/FluentIterable");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/FluentIterable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/FluentIterable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/FluentIterable", "<init>", "(Ljava/lang/Iterable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/Iterable;)V", "(Ljava/lang/Iterable<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "append", "([Ljava/lang/Object;)Lorg/apache/commons/collections4/FluentIterable;", "([TE;)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/FluentIterable", "append", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "append", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", "(Ljava/lang/Iterable<+TE;>;)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "chainedIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "collate", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", "(Ljava/lang/Iterable<+TE;>;)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "collatedIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "collate", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Lorg/apache/commons/collections4/FluentIterable;", "(Ljava/lang/Iterable<+TE;>;Ljava/util/Comparator<-TE;>;)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "collatedIterable", "(Ljava/util/Comparator;Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "eval", "()Lorg/apache/commons/collections4/FluentIterable;", "()Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/FluentIterable", "toList", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filter", "(Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/FluentIterable;", "(Lorg/apache/commons/collections4/Predicate<-TE;>;)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "filteredIterable", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "limit", "(J)Lorg/apache/commons/collections4/FluentIterable;", "(J)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "boundedIterable", "(Ljava/lang/Iterable;J)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loop", "()Lorg/apache/commons/collections4/FluentIterable;", "()Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "loopingIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reverse", "()Lorg/apache/commons/collections4/FluentIterable;", "()Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "reversedIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "skip", "(J)Lorg/apache/commons/collections4/FluentIterable;", "(J)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "skippingIterable", "(Ljava/lang/Iterable;J)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/FluentIterable;", "<O:Ljava/lang/Object;>(Lorg/apache/commons/collections4/Transformer<-TE;+TO;>;)Lorg/apache/commons/collections4/FluentIterable<TO;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "transformedIterable", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Transformer;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unique", "()Lorg/apache/commons/collections4/FluentIterable;", "()Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "uniqueIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmodifiable", "()Lorg/apache/commons/collections4/FluentIterable;", "()Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "unmodifiableIterable", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "zip", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", "(Ljava/lang/Iterable<+TE;>;)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "zippingIterable", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "zip", "([Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", "([Ljava/lang/Iterable<+TE;>;)Lorg/apache/commons/collections4/FluentIterable<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "zippingIterable", "(Ljava/lang/Iterable;[Ljava/lang/Iterable;)Ljava/lang/Iterable;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/FluentIterable", "of", "(Ljava/lang/Iterable;)Lorg/apache/commons/collections4/FluentIterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asEnumeration", "()Ljava/util/Enumeration;", "()Ljava/util/Enumeration<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/FluentIterable", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "asEnumeration", "(Ljava/util/Iterator;)Ljava/util/Enumeration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "allMatch", "(Lorg/apache/commons/collections4/Predicate;)Z", "(Lorg/apache/commons/collections4/Predicate<-TE;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "matchesAll", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "anyMatch", "(Lorg/apache/commons/collections4/Predicate;)Z", "(Lorg/apache/commons/collections4/Predicate<-TE;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "matchesAny", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "isEmpty", "(Ljava/lang/Iterable;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "contains", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "forEach", "(Lorg/apache/commons/collections4/Closure;)V", "(Lorg/apache/commons/collections4/Closure<-TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "forEach", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Closure;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(I)Ljava/lang/Object;", "(I)TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "get", "(Ljava/lang/Iterable;I)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "size", "(Ljava/lang/Iterable;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "copyInto", "(Ljava/util/Collection;)V", "(Ljava/util/Collection<-TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Collection must not be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/CollectionUtils", "addAll", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toArray", "(Ljava/lang/Class;)[Ljava/lang/Object;", "(Ljava/lang/Class<TE;>;)[TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/FluentIterable", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "toArray", "(Ljava/util/Iterator;Ljava/lang/Class;)[Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toList", "()Ljava/util/List;", "()Ljava/util/List<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "toList", "(Ljava/lang/Iterable;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/FluentIterable", "iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "toString", "(Ljava/lang/Iterable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
