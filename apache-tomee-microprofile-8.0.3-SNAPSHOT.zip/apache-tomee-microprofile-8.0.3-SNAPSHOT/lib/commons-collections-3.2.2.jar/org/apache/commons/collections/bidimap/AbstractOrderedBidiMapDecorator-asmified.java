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
public class AbstractOrderedBidiMapDecoratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", null, "org/apache/commons/collections/bidimap/AbstractBidiMapDecorator", new String[] { "org/apache/commons/collections/OrderedBidiMap" });

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections/OrderedBidiMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/bidimap/AbstractBidiMapDecorator", "<init>", "(Lorg/apache/commons/collections/BidiMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", "map", "Ljava/util/Map;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections/OrderedBidiMap");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderedMapIterator", "()Lorg/apache/commons/collections/OrderedMapIterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", "getOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/OrderedBidiMap", "orderedMapIterator", "()Lorg/apache/commons/collections/OrderedMapIterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "firstKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", "getOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/OrderedBidiMap", "firstKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lastKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", "getOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/OrderedBidiMap", "lastKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextKey", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", "getOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/OrderedBidiMap", "nextKey", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "previousKey", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", "getOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/OrderedBidiMap", "previousKey", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "inverseOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/bidimap/AbstractOrderedBidiMapDecorator", "getOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections/OrderedBidiMap", "inverseOrderedBidiMap", "()Lorg/apache/commons/collections/OrderedBidiMap;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
