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
public class AbstractMultiSet$MultiSetIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "<E:Ljava/lang/Object;>Ljava/lang/Object;Ljava/util/Iterator<TE;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/apache/commons/collections4/MultiSet$Entry", "org/apache/commons/collections4/MultiSet", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "org/apache/commons/collections4/multiset/AbstractMultiSet", "MultiSetIterator", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parent", "Lorg/apache/commons/collections4/multiset/AbstractMultiSet;", "Lorg/apache/commons/collections4/multiset/AbstractMultiSet<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "entryIterator", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/apache/commons/collections4/MultiSet$Entry<TE;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "current", "Lorg/apache/commons/collections4/MultiSet$Entry;", "Lorg/apache/commons/collections4/MultiSet$Entry<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "canRemove", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections4/multiset/AbstractMultiSet;)V", "(Lorg/apache/commons/collections4/multiset/AbstractMultiSet<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "parent", "Lorg/apache/commons/collections4/multiset/AbstractMultiSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multiset/AbstractMultiSet", "entrySet", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "current", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "canRemove", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "itemCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TE;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "itemCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/collections4/MultiSet$Entry");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "current", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "current", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiSet$Entry", "getCount", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "itemCount", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "canRemove", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "itemCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "itemCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "current", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiSet$Entry", "getElement", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "canRemove", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "current", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiSet$Entry", "getCount", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "parent", "Lorg/apache/commons/collections4/multiset/AbstractMultiSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "current", "Lorg/apache/commons/collections4/MultiSet$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/collections4/MultiSet$Entry", "getElement", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/multiset/AbstractMultiSet", "remove", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "entryIterator", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/multiset/AbstractMultiSet$MultiSetIterator", "canRemove", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
