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
public class AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.TrieIterator<Ljava/util/Map$Entry<TK;TV;>;>;", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", null);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "PrefixRangeEntrySet", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "EntryIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieIterator", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "prefix", "Ljava/lang/Object;", "TK;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "offset", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "lengthInBits", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lastOne", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Ljava/lang/Object;II)V", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry<TK;TV;>;TK;II)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "followLeft", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "next", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "prefix", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "lengthInBits", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/util/Map$Entry;", "()Ljava/util/Map$Entry<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "nextEntry", "()Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "lastOne", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "next", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map$Entry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "findNext", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry<TK;TV;>;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "nextEntryInSubtree", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "bitIndex", "I");
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "current", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", "remove", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "bitIndex", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "prefix", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "offset", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "lengthInBits", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "subtree", "(Ljava/lang/Object;II)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "lengthInBits", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "subtree", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "bitIndex", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "lastOne", "Z");
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "next", "()Ljava/util/Map$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
