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
public class AbstractOrderedBidiMapDecoratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/commons/collections4/bidimap/AbstractBidiMapDecorator<TK;TV;>;Lorg/apache/commons/collections4/OrderedBidiMap<TK;TV;>;", "org/apache/commons/collections4/bidimap/AbstractBidiMapDecorator", new String[] { "org/apache/commons/collections4/OrderedBidiMap" });

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections4/OrderedBidiMap;)V", "(Lorg/apache/commons/collections4/OrderedBidiMap<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bidimap/AbstractBidiMapDecorator", "<init>", "(Lorg/apache/commons/collections4/BidiMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", "()Lorg/apache/commons/collections4/OrderedBidiMap<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/bidimap/AbstractBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/BidiMap;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/OrderedBidiMap");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mapIterator", "()Lorg/apache/commons/collections4/OrderedMapIterator;", "()Lorg/apache/commons/collections4/OrderedMapIterator<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/OrderedBidiMap", "mapIterator", "()Lorg/apache/commons/collections4/OrderedMapIterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "firstKey", "()Ljava/lang/Object;", "()TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/OrderedBidiMap", "firstKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lastKey", "()Ljava/lang/Object;", "()TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/OrderedBidiMap", "lastKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TK;)TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/OrderedBidiMap", "nextKey", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "(TK;)TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/OrderedBidiMap", "previousKey", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inverseBidiMap", "()Lorg/apache/commons/collections4/OrderedBidiMap;", "()Lorg/apache/commons/collections4/OrderedBidiMap<TV;TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/OrderedBidiMap", "inverseBidiMap", "()Lorg/apache/commons/collections4/OrderedBidiMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "inverseBidiMap", "()Lorg/apache/commons/collections4/BidiMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "inverseBidiMap", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "mapIterator", "()Lorg/apache/commons/collections4/MapIterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "mapIterator", "()Lorg/apache/commons/collections4/OrderedMapIterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "decorated", "()Lorg/apache/commons/collections4/BidiMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "decorated", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/bidimap/AbstractOrderedBidiMapDecorator", "decorated", "()Lorg/apache/commons/collections4/OrderedBidiMap;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
