package asm.org.apache.commons.collections4.multiset;
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
public class AbstractMapMultiSet$MultiSetEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry", "<E:Ljava/lang/Object;>Lorg/apache/commons/collections4/multiset/AbstractMultiSet$AbstractEntry<TE;>;", "org/apache/commons/collections4/multiset/AbstractMultiSet$AbstractEntry", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger", "org/apache/commons/collections4/multiset/AbstractMapMultiSet", "MutableInteger", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry", "org/apache/commons/collections4/multiset/AbstractMapMultiSet", "MultiSetEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/multiset/AbstractMultiSet$AbstractEntry", "org/apache/commons/collections4/multiset/AbstractMultiSet", "AbstractEntry", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "parentEntry", "Ljava/util/Map$Entry;", "Ljava/util/Map$Entry<TE;Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/util/Map$Entry;)V", "(Ljava/util/Map$Entry<TE;Lorg/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/multiset/AbstractMultiSet$AbstractEntry", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry", "parentEntry", "Ljava/util/Map$Entry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElement", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry", "parentEntry", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MultiSetEntry", "parentEntry", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMapMultiSet$MutableInteger", "value", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
