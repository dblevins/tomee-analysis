package asm.org.apache.commons.collections.bidimap;
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
public class DualTreeBidiMap$ViewMapDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", null, "org/apache/commons/collections/map/AbstractSortedMapDecorator", null);

classWriter.visitInnerClass("org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "org/apache/commons/collections/bidimap/DualTreeBidiMap", "ViewMap", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "bidi", "Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;Ljava/util/SortedMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap", "maps", "[Ljava/util/Map;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap", "inverseBidiMap", "Lorg/apache/commons/collections/BidiMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/DualTreeBidiMap", "createBidiMap", "(Ljava/util/Map;Ljava/util/Map;Lorg/apache/commons/collections/BidiMap;)Lorg/apache/commons/collections/BidiMap;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/SortedMap");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractSortedMapDecorator", "<init>", "(Ljava/util/SortedMap;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "map", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/bidimap/DualTreeBidiMap");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "bidi", "Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsValue", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "bidi", "Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap", "maps", "[Ljava/util/Map;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "containsValue", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "keySet", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "headMap", "(Ljava/lang/Object;)Ljava/util/SortedMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "bidi", "Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractSortedMapDecorator", "headMap", "(Ljava/lang/Object;)Ljava/util/SortedMap;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "<init>", "(Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;Ljava/util/SortedMap;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "tailMap", "(Ljava/lang/Object;)Ljava/util/SortedMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "bidi", "Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractSortedMapDecorator", "tailMap", "(Ljava/lang/Object;)Ljava/util/SortedMap;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "<init>", "(Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;Ljava/util/SortedMap;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "subMap", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "bidi", "Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/AbstractSortedMapDecorator", "subMap", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bidimap/DualTreeBidiMap$ViewMap", "<init>", "(Lorg/apache/commons/collections/bidimap/DualTreeBidiMap;Ljava/util/SortedMap;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
