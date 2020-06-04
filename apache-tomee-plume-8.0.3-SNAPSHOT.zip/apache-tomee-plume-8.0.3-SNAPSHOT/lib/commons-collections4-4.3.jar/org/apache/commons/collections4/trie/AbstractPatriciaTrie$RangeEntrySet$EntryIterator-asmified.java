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
public class AbstractPatriciaTrie$RangeEntrySet$EntryIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.TrieIterator<Ljava/util/Map$Entry<TK;TV;>;>;", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", null);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "RangeEntrySet", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "EntryIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieIterator", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "excludedKey", "Ljava/lang/Object;", "TK;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)V", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry<TK;TV;>;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry<TK;TV;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "getKey", "()Ljava/lang/Object;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry"}, 1, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry"}, 2, new Object[] {"org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "java/lang/Object"});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "excludedKey", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "next", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "next", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "key", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "excludedKey", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractBitwiseTrie", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
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
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/util/Map$Entry;", "()Ljava/util/Map$Entry<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "next", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "next", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "key", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "excludedKey", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractBitwiseTrie", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "nextEntry", "()Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "next", "()Ljava/util/Map$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet$EntryIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
