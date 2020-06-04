package asm.org.apache.commons.collections;
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
public class FastHashMap$CollectionView$CollectionViewIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections/FastHashMap$CollectionView", "org/apache/commons/collections/FastHashMap", "CollectionView", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "org/apache/commons/collections/FastHashMap$CollectionView", "CollectionViewIterator", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expected", "Ljava/util/Map;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastReturned", "Ljava/util/Map$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "iterator", "Ljava/util/Iterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "lastReturned", "Ljava/util/Map$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap", "map", "Ljava/util/HashMap;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "expected", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "expected", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "expected", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap", "map", "Ljava/util/HashMap;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "expected", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap", "map", "Ljava/util/HashMap;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "lastReturned", "Ljava/util/Map$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "lastReturned", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastHashMap$CollectionView", "iteratorNext", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "lastReturned", "Ljava/util/Map$Entry;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap", "fast", "Z");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "expected", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap", "map", "Ljava/util/HashMap;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label6);
methodVisitor.visitTypeInsn(NEW, "java/util/ConcurrentModificationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ConcurrentModificationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "lastReturned", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/FastHashMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "lastReturned", "Ljava/util/Map$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "this$1", "Lorg/apache/commons/collections/FastHashMap$CollectionView;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/FastHashMap$CollectionView", "access$300", "(Lorg/apache/commons/collections/FastHashMap$CollectionView;)Lorg/apache/commons/collections/FastHashMap;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap", "map", "Ljava/util/HashMap;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "expected", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "iterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/FastHashMap$CollectionView$CollectionViewIterator", "lastReturned", "Ljava/util/Map$Entry;");
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
