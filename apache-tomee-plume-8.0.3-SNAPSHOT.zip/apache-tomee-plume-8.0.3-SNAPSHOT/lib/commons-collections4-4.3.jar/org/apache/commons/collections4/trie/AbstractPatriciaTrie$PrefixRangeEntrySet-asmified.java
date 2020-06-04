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
public class AbstractPatriciaTrie$PrefixRangeEntrySetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.RangeEntrySet;", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", null);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "PrefixRangeEntrySet", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "EntryIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$SingletonIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "SingletonIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "PrefixRangeMap", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieEntry", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "RangeEntrySet", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "RangeMap", ACC_PRIVATE | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.PrefixRangeMap;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "prefixStart", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry<TK;TV;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "expectedModCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)V", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.PrefixRangeMap;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeEntrySet", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$RangeMap;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "expectedModCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1100", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/util/Map$Entry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "modCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "expectedModCount", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1200", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1300", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1400", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "subtree", "(Ljava/lang/Object;II)Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "prefixStart", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "modCount", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "expectedModCount", "I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "prefixStart", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1400", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "prefixStart", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "bitIndex", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$SingletonIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "prefixStart", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$SingletonIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "prefixStart", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1200", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1300", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet", "delegate", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap", "access$1400", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeMap;)I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet$EntryIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$PrefixRangeEntrySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;Ljava/lang/Object;II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
