package asm.org.apache.commons.collections.map;
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
public class AbstractReferenceMap$ReferenceEntrySetIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry", "org/apache/commons/collections/map/AbstractReferenceMap", "ReferenceEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "org/apache/commons/collections/map/AbstractReferenceMap", "ReferenceEntrySetIterator", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/map/AbstractHashedMap$HashEntry", "org/apache/commons/collections/map/AbstractHashedMap", "HashEntry", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "parent", "Lorg/apache/commons/collections/map/AbstractReferenceMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "previous", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextKey", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "nextValue", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentKey", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "currentValue", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "expectedModCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections/map/AbstractReferenceMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "parent", "Lorg/apache/commons/collections/map/AbstractReferenceMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap", "size", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap", "data", "[Lorg/apache/commons/collections/map/AbstractHashedMap$HashEntry;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "expectedModCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "checkMod", "()V", false);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextNull", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "index", "I");
methodVisitor.visitVarInsn(ISTORE, 2);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitIincInsn(2, -1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "parent", "Lorg/apache/commons/collections/map/AbstractReferenceMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap", "data", "[Lorg/apache/commons/collections/map/AbstractHashedMap$HashEntry;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "currentKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "currentValue", "Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextValue", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextNull", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry", "next", "()Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitLabel(label5);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "checkMod", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "parent", "Lorg/apache/commons/collections/map/AbstractReferenceMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap", "modCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "expectedModCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "nextNull", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextKey", "Ljava/lang/Object;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextValue", "Ljava/lang/Object;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "nextEntry", "()Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "checkMod", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextNull", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "hasNext", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "previous", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry", "next", "()Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "entry", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextKey", "Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "currentKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextValue", "Ljava/lang/Object;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "currentValue", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextValue", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "previous", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "currentEntry", "()Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "checkMod", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "previous", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "nextEntry", "()Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "checkMod", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "previous", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "parent", "Lorg/apache/commons/collections/map/AbstractReferenceMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "currentKey", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractReferenceMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "previous", "Lorg/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "currentKey", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "currentValue", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "parent", "Lorg/apache/commons/collections/map/AbstractReferenceMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/AbstractReferenceMap", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/AbstractReferenceMap$ReferenceEntrySetIterator", "expectedModCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
