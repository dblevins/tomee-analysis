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
public class AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer", "Ljava/lang/Object;Lorg/apache/commons/collections4/Transformer<Ljava/util/Map$Entry<TK;Ljava/util/Collection<TV;>;>;Lorg/apache/commons/collections4/MultiSet$Entry<TK;>;>;", "java/lang/Object", new String[] { "org/apache/commons/collections4/Transformer" });

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet", "org/apache/commons/collections4/multimap/AbstractMultiValuedMap", "KeysMultiSet", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer", "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet", "MapEntryTransformer", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/MultiSet$Entry", "org/apache/commons/collections4/MultiSet", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/multimap/AbstractMultiValuedMap$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer", "this$1", "Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Ljava/util/Map$Entry;)Lorg/apache/commons/collections4/MultiSet$Entry;", "(Ljava/util/Map$Entry<TK;Ljava/util/Collection<TV;>;>;)Lorg/apache/commons/collections4/MultiSet$Entry<TK;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer$1", "<init>", "(Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer;Ljava/util/Map$Entry;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer", "transform", "(Ljava/util/Map$Entry;)Lorg/apache/commons/collections4/MultiSet$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet;Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet$MapEntryTransformer", "<init>", "(Lorg/apache/commons/collections4/multimap/AbstractMultiValuedMap$KeysMultiSet;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
