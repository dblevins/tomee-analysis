package asm.org.apache.commons.collections4.trie;
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
public class AbstractPatriciaTrie$RangeEntrySetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "Ljava/util/AbstractSet<Ljava/util/Map$Entry<TK;TV;>;>;", "java/util/AbstractSet", null);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "RangeEntrySet", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "EntryIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "RangeMap", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.RangeMap;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "size", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "expectedModCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;)V", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.RangeMap;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("delegate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap", "getFromKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap", "getToKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "firstEntry", "()Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/Object", "java/lang/Object", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "ceilingEntry", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "ceilingEntry", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "size", "I");
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "expectedModCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "modCount", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "size", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "size", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "expectedModCount", "I");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "size", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Map$Entry");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap", "inRange", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "getEntry", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractBitwiseTrie", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/util/Map$Entry");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap", "inRange", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map$Entry", "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "getEntry", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractBitwiseTrie", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "removeEntry", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
