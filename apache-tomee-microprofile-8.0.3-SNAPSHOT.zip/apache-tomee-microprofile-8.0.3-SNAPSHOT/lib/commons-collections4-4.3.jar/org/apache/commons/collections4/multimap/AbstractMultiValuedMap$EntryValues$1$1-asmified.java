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
public class AbstractMultiValuedMap$EntryValues$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1$1", "Ljava/lang/Object;Lorg/apache/commons/collections4/Transformer<TV;Ljava/util/Map$Entry<TK;TV;>;>;", "java/lang/Object", new String[] { "org/apache/commons/collections4/Transformer" });

classWriter.visitOuterClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1", "nextIterator", "(I)Ljava/util/Iterator;");

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues", "org/apache/commons/collections4/multimap/AbstractMultiValuedMap", "EntryValues", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1", null, null, 0);

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$MultiValuedMapEntry", "org/apache/commons/collections4/multimap/AbstractMultiValuedMap", "MultiValuedMapEntry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$key", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$2", "Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1$1", "this$2", "Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1$1", "val$key", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", "(TV;)Ljava/util/Map$Entry<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$MultiValuedMapEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1$1", "this$2", "Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1", "this$1", "Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues", "this$0", "Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1$1", "val$key", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$MultiValuedMapEntry", "<init>", "(Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap;Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$EntryValues$1$1", "transform", "(Ljava/lang/Object;)Ljava/util/Map$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
