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
public class Flat3Map$ValuesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_3, ACC_SUPER, "org/apache/commons/collections/map/Flat3Map$Values", null, "java/util/AbstractCollection", null);

classWriter.visitInnerClass("org/apache/commons/collections/map/Flat3Map$Values", "org/apache/commons/collections/map/Flat3Map", "Values", ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections/map/Flat3Map$ValuesIterator", "org/apache/commons/collections/map/Flat3Map", "ValuesIterator", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parent", "Lorg/apache/commons/collections/map/Flat3Map;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections/map/Flat3Map;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractCollection", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/Flat3Map", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/Flat3Map", "clear", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/Flat3Map", "containsValue", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/map/Flat3Map", "access$700", "(Lorg/apache/commons/collections/map/Flat3Map;)Lorg/apache/commons/collections/map/AbstractHashedMap;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections/map/Flat3Map", "access$700", "(Lorg/apache/commons/collections/map/Flat3Map;)Lorg/apache/commons/collections/map/AbstractHashedMap;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/AbstractHashedMap", "values", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections/map/Flat3Map", "size", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections/iterators/EmptyIterator", "INSTANCE", "Ljava/util/Iterator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections/map/Flat3Map$ValuesIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections/map/Flat3Map$Values", "parent", "Lorg/apache/commons/collections/map/Flat3Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections/map/Flat3Map$ValuesIterator", "<init>", "(Lorg/apache/commons/collections/map/Flat3Map;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
