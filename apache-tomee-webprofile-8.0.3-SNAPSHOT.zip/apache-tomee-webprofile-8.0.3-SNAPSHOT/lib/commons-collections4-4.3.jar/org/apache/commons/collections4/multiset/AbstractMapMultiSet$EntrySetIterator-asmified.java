package asm.org.apache.commons.collections4.multiset;
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
public class AbstractMapMultiSet$EntrySetIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Iterator<Lorg/apache/commons/collections4/MultiSet$Entry<TE;>;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger", "org/apache/commons/collections4/multiset/AbstractMapMultiSet", "MutableInteger", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/MultiSet$Entry", "org/apache/commons/collections4/MultiSet", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "org/apache/commons/collections4/multiset/AbstractMapMultiSet", "EntrySetIterator", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry", "org/apache/commons/collections4/multiset/AbstractMapMultiSet", "MultiSetEntry", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "parent", "Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet;", "Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "decorated", "Ljava/util/Iterator;", "Ljava/util/Iterator<Ljava/util/Map$Entry<TE;Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "last", "Lorg/apache/commons/collections4/MultiSet$Entry;", "Lorg/apache/commons/collections4/MultiSet$Entry<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "canRemove", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet;)V", "(Ljava/util/Iterator<Ljava/util/Map$Entry<TE;Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger;>;>;Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "last", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "canRemove", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "decorated", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "parent", "Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "decorated", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/commons/collections4/MultiSet$Entry;", "()Lorg/apache/commons/collections4/MultiSet$Entry<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "decorated", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry", "<init>", "(Ljava/util/Map$Entry;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "last", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "canRemove", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "last", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "canRemove", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Iterator remove() can only be called once after next()");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "decorated", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "last", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "canRemove", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$EntrySetIterator", "next", "()Lorg/apache/commons/collections4/MultiSet$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
