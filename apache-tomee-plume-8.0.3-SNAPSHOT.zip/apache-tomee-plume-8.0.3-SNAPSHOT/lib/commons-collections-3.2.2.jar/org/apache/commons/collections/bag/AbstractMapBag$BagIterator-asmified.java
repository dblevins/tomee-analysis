package asm.org.apache.commons.collections.bag;
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
public class AbstractMapBag$BagIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "org/apache/commons/collections/bag/AbstractMapBag", "BagIterator", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/bag/AbstractMapBag$MutableInteger", "org/apache/commons/collections/bag/AbstractMapBag", "MutableInteger", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parent", "Lorg/apache/commons/collections/bag/AbstractMapBag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entryIterator", "Ljava/util/Iterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "current", "Ljava/util/Map$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "mods", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "canRemove", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections/bag/AbstractMapBag;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "parent", "Lorg/apache/commons/collections/bag/AbstractMapBag;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/AbstractMapBag", "access$000", "(Lorg/apache/commons/collections/bag/AbstractMapBag;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "current", "Ljava/util/Map$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/AbstractMapBag", "access$100", "(Lorg/apache/commons/collections/bag/AbstractMapBag;)I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "mods", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "canRemove", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "itemCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "parent", "Lorg/apache/commons/collections/bag/AbstractMapBag;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/AbstractMapBag", "access$100", "(Lorg/apache/commons/collections/bag/AbstractMapBag;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "mods", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "itemCount", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "current", "Ljava/util/Map$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "current", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/bag/AbstractMapBag$MutableInteger");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$MutableInteger", "value", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "itemCount", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "canRemove", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "itemCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "itemCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "current", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "parent", "Lorg/apache/commons/collections/bag/AbstractMapBag;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/AbstractMapBag", "access$100", "(Lorg/apache/commons/collections/bag/AbstractMapBag;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "mods", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "canRemove", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "current", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/bag/AbstractMapBag$MutableInteger");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$MutableInteger", "value", "I");
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$MutableInteger", "value", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$MutableInteger", "value", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "parent", "Lorg/apache/commons/collections/bag/AbstractMapBag;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/bag/AbstractMapBag", "access$210", "(Lorg/apache/commons/collections/bag/AbstractMapBag;)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bag/AbstractMapBag$BagIterator", "canRemove", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
