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
public class AbstractPatriciaTrie$KeySet$KeyIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet$KeyIterator", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie<TK;TV;>.TrieIterator<TK;>;", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", null);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "KeySet", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet$KeyIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet", "KeyIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieIterator", ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "org/apache/commons/collections4/trie/AbstractPatriciaTrie", "TrieEntry", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet$KeyIterator", "this$1", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet", "this$0", "Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", "()TK;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet$KeyIterator", "nextEntry", "()Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$TrieEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet;Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet$KeyIterator", "<init>", "(Lorg/apache/commons/collections4/trie/AbstractPatriciaTrie$KeySet;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
