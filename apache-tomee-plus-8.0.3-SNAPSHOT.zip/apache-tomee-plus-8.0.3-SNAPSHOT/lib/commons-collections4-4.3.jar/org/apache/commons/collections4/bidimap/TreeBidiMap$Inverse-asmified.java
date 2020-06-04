package asm.org.apache.commons.collections4.bidimap;
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
public class TreeBidiMap$InverseDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "Ljava/lang/Object;Lorg/apache/commons/collections4/OrderedBidiMap<TV;TK;>;", "java/lang/Object", new String[] { "org/apache/commons/collections4/OrderedBidiMap" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "org/apache/commons/collections4/bidimap/TreeBidiMap", "Inverse", 0);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "org/apache/commons/collections4/bidimap/TreeBidiMap", "Node", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$ValueView", "org/apache/commons/collections4/bidimap/TreeBidiMap", "ValueView", 0);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$KeyView", "org/apache/commons/collections4/bidimap/TreeBidiMap", "KeyView", 0);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$InverseEntryView", "org/apache/commons/collections4/bidimap/TreeBidiMap", "InverseEntryView", 0);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "org/apache/commons/collections4/bidimap/TreeBidiMap", "InverseViewMapIterator", 0);

classWriter.visitInnerClass("org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "org/apache/commons/collections4/bidimap/TreeBidiMap", "DataElement", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inverseKeySet", "Ljava/util/Set;", "Ljava/util/Set<TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inverseValuesSet", "Ljava/util/Set;", "Ljava/util/Set<TK;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "inverseEntrySet", "Ljava/util/Set;", "Ljava/util/Set<Ljava/util/Map$Entry<TV;TK;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "isEmpty", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/Object;)Ljava/lang/Comparable;", "(Ljava/lang/Object;)TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "getKey", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKey", "(Ljava/lang/Object;)Ljava/lang/Comparable;", "(Ljava/lang/Object;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "get", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsKey", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "containsValue", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsValue", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "containsKey", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "firstKey", "()Ljava/lang/Comparable;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2700", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Map is empty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2200", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)[Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "ordinal", "()I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2300", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lastKey", "()Ljava/lang/Comparable;", "()TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2700", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Map is empty");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2200", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)[Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "ordinal", "()I", false);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2600", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextKey", "(Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(TV;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2800", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2900", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Ljava/lang/Object;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2400", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/collections4/bidimap/TreeBidiMap$Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Comparable"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousKey", "(Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(TV;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2800", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2900", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Ljava/lang/Object;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$2500", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Lorg/apache/commons/collections4/bidimap/TreeBidiMap$Node;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/collections4/bidimap/TreeBidiMap$Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Node", "getValue", "()Ljava/lang/Comparable;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Comparable"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "(TV;TK;)TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "get", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$3000", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Ljava/lang/Comparable;Ljava/lang/Comparable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putAll", "(Ljava/util/Map;)V", "(Ljava/util/Map<+TV;+TK;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "put", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Ljava/lang/Comparable;", "(Ljava/lang/Object;)TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "removeValue", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeValue", "(Ljava/lang/Object;)Ljava/lang/Comparable;", "(Ljava/lang/Object;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap", "clear", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keySet", "()Ljava/util/Set;", "()Ljava/util/Set<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseKeySet", "Ljava/util/Set;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/bidimap/TreeBidiMap$ValueView");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$ValueView", "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseKeySet", "Ljava/util/Set;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseKeySet", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "values", "()Ljava/util/Set;", "()Ljava/util/Set<TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseValuesSet", "Ljava/util/Set;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/bidimap/TreeBidiMap$KeyView");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$KeyView", "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseValuesSet", "Ljava/util/Set;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseValuesSet", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "entrySet", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/util/Map$Entry<TV;TK;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseEntrySet", "Ljava/util/Set;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseEntryView");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseEntryView", "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseEntrySet", "Ljava/util/Set;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseEntrySet", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mapIterator", "()Lorg/apache/commons/collections4/OrderedMapIterator;", "()Lorg/apache/commons/collections4/OrderedMapIterator<TV;TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "isEmpty", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/iterators/EmptyOrderedMapIterator", "emptyOrderedMapIterator", "()Lorg/apache/commons/collections4/OrderedMapIterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$InverseViewMapIterator", "<init>", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inverseBidiMap", "()Lorg/apache/commons/collections4/OrderedBidiMap;", "()Lorg/apache/commons/collections4/OrderedBidiMap<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$3100", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Ljava/lang/Object;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$3200", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "this$0", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement", "VALUE", "Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/bidimap/TreeBidiMap", "access$3300", "(Lorg/apache/commons/collections4/bidimap/TreeBidiMap;Lorg/apache/commons/collections4/bidimap/TreeBidiMap$DataElement;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "inverseBidiMap", "()Lorg/apache/commons/collections4/BidiMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "inverseBidiMap", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "removeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "removeValue", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getKey", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "getKey", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "put", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "values", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "values", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "remove", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "get", "(Ljava/lang/Object;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "mapIterator", "()Lorg/apache/commons/collections4/MapIterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "mapIterator", "()Lorg/apache/commons/collections4/OrderedMapIterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "previousKey", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "previousKey", "(Ljava/lang/Comparable;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "nextKey", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "nextKey", "(Ljava/lang/Comparable;)Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "lastKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "lastKey", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "firstKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/TreeBidiMap$Inverse", "firstKey", "()Ljava/lang/Comparable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
