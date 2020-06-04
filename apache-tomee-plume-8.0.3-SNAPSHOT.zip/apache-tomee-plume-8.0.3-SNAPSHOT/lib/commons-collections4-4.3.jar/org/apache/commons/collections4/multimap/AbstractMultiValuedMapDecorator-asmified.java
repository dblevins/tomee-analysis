package asm.org.apache.commons.collections4.multimap;
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
public class AbstractMultiValuedMapDecoratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/commons/collections4/MultiValuedMap<TK;TV;>;Ljava/io/Serializable;", "java/lang/Object", new String[] { "org/apache/commons/collections4/MultiValuedMap", "java/io/Serializable" });

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(20150612L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "map", "Lorg/apache/commons/collections4/MultiValuedMap;", "Lorg/apache/commons/collections4/MultiValuedMap<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/commons/collections4/MultiValuedMap;)V", "(Lorg/apache/commons/collections4/MultiValuedMap<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MultiValuedMap must not be null.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "org/apache/commons/collections4/MultiValuedMap"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "map", "Lorg/apache/commons/collections4/MultiValuedMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", "()Lorg/apache/commons/collections4/MultiValuedMap<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "map", "Lorg/apache/commons/collections4/MultiValuedMap;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "isEmpty", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsKey", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "containsKey", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsValue", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "containsValue", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "containsMapping", "(Ljava/lang/Object;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "containsMapping", "(Ljava/lang/Object;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/lang/Object;)Ljava/util/Collection;", "(TK;)Ljava/util/Collection<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "get", "(Ljava/lang/Object;)Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Ljava/util/Collection;", "(Ljava/lang/Object;)Ljava/util/Collection<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "remove", "(Ljava/lang/Object;)Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeMapping", "(Ljava/lang/Object;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "removeMapping", "(Ljava/lang/Object;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "clear", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "(TK;TV;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keySet", "()Ljava/util/Set;", "()Ljava/util/Set<TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "keySet", "()Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "entries", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/util/Map$Entry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "entries", "()Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "keys", "()Lorg/apache/commons/collections4/MultiSet;", "()Lorg/apache/commons/collections4/MultiSet<TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "keys", "()Lorg/apache/commons/collections4/MultiSet;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "values", "()Ljava/util/Collection;", "()Ljava/util/Collection<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "asMap", "()Ljava/util/Map;", "()Ljava/util/Map<TK;Ljava/util/Collection<TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "asMap", "()Ljava/util/Map;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putAll", "(Ljava/lang/Object;Ljava/lang/Iterable;)Z", "(TK;Ljava/lang/Iterable<+TV;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "putAll", "(Ljava/lang/Object;Ljava/lang/Iterable;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putAll", "(Ljava/util/Map;)Z", "(Ljava/util/Map<+TK;+TV;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "putAll", "(Ljava/util/Map;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "putAll", "(Lorg/apache/commons/collections4/MultiValuedMap;)Z", "(Lorg/apache/commons/collections4/MultiValuedMap<+TK;+TV;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "putAll", "(Lorg/apache/commons/collections4/MultiValuedMap;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "mapIterator", "()Lorg/apache/commons/collections4/MapIterator;", "()Lorg/apache/commons/collections4/MapIterator<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiValuedMap", "mapIterator", "()Lorg/apache/commons/collections4/MapIterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMapDecorator", "decorated", "()Lorg/apache/commons/collections4/MultiValuedMap;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
