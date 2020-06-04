package asm.org.apache.activemq.store.kahadb.disk.index;
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
public class ListNodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/activemq/store/kahadb/disk/index/ListNode", "<Key:Ljava/lang/Object;Value:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/index/ListNode$NodeMarshaller", "org/apache/activemq/store/kahadb/disk/index/ListNode", "NodeMarshaller", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/index/ListNode$ListIterator", "org/apache/activemq/store/kahadb/disk/index/ListNode", "ListIterator", ACC_FINAL);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/index/ListNode$ListNodeIterator", "org/apache/activemq/store/kahadb/disk/index/ListNode", "ListNodeIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "org/apache/activemq/store/kahadb/disk/index/ListNode", "KeyValueEntry", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/index/ListNode$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$PageOverflowIOException", "org/apache/activemq/store/kahadb/disk/page/Transaction", "PageOverflowIOException", ACC_PUBLIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ADD_FIRST", "Z", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ADD_LAST", "Z", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "containingList", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex<TKey;TValue;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;", "Lorg/apache/activemq/store/kahadb/disk/page/Page<Lorg/apache/activemq/store/kahadb/disk/index/ListNode<TKey;TValue;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList<Lorg/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry<TKey;TValue;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "next", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListNode$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$1", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "next", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;TValue;)TValue;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "addLast", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addFirst", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;TValue;)TValue;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "addFirst", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeUpdate", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/activemq/store/kahadb/disk/page/Transaction$PageOverflowIOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getContainingList", "()Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "size", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/activemq/store/kahadb/disk/index/ListNode", "org/apache/activemq/store/kahadb/disk/page/Transaction", Opcodes.INTEGER}, 3, new Object[] {"org/apache/activemq/store/kahadb/disk/index/ListIndex", "org/apache/activemq/store/kahadb/disk/page/Transaction", "org/apache/activemq/store/kahadb/disk/index/ListNode"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/activemq/store/kahadb/disk/index/ListNode", "org/apache/activemq/store/kahadb/disk/page/Transaction", Opcodes.INTEGER}, 4, new Object[] {"org/apache/activemq/store/kahadb/disk/index/ListIndex", "org/apache/activemq/store/kahadb/disk/page/Transaction", "org/apache/activemq/store/kahadb/disk/index/ListNode", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "storeNode", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "next", "J");
methodVisitor.visitLdcInsn(new Long(-1L));
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getContainingList", "()Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "setTailPageId", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/activemq/store/kahadb/disk/page/Transaction$PageOverflowIOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "split", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getContainingList", "()Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "storeNode", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "split", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getContainingList", "()Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "createNode", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Lorg/apache/activemq/store/kahadb/disk/index/ListNode;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "getHead", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "splitAfter", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "setEntries", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getNext", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "setNext", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "setNext", "(J)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/store/kahadb/disk/index/ListNode"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "getTail", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "getPrevious", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "splitAfter", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "setEntries", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getNext", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "setNext", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getContainingList", "()Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "setTailPageId", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "setNext", "(J)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "setEntries", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;)V", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList<Lorg/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry<TKey;TValue;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Ljava/lang/Object;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;)TValue;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "getTail", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "getPrevious", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isEmpty", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "isEmpty", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFirst", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Map$Entry;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Map$Entry<TKey;TValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "getHead", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLast", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Map$Entry;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Map$Entry<TKey;TValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "getTail", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;J)Ljava/util/Iterator;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;J)Ljava/util/Iterator<Ljava/util/Map$Entry<TKey;TValue;>;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListNode$ListIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$ListIterator", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/disk/index/ListNode;JLorg/apache/activemq/store/kahadb/disk/index/ListNode$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Iterator;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Iterator<Ljava/util/Map$Entry<TKey;TValue;>;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListNode$ListIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$ListIterator", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/disk/index/ListNode;JLorg/apache/activemq/store/kahadb/disk/index/ListNode$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "listNodeIterator", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Iterator;", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Iterator<Lorg/apache/activemq/store/kahadb/disk/index/ListNode<TKey;TValue;>;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/ListNode$ListNodeIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$ListNodeIterator", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Lorg/apache/activemq/store/kahadb/disk/index/ListNode$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "clear", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "free", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/lang/Object;)Z", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;TKey;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "getTail", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "getKey", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "getPrevious", "()Lorg/apache/activemq/store/kahadb/disk/util/LinkedNode;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPageId", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPage", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", "()Lorg/apache/activemq/store/kahadb/disk/page/Page<Lorg/apache/activemq/store/kahadb/disk/index/ListNode<TKey;TValue;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPage", "(Lorg/apache/activemq/store/kahadb/disk/page/Page;)V", "(Lorg/apache/activemq/store/kahadb/disk/page/Page<Lorg/apache/activemq/store/kahadb/disk/index/ListNode<TKey;TValue;>;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNext", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "next", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNext", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "next", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContainingList", "(Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;)V", "(Lorg/apache/activemq/store/kahadb/disk/index/ListIndex<TKey;TValue;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "containingList", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContainingList", "()Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", "()Lorg/apache/activemq/store/kahadb/disk/index/ListIndex<TKey;TValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "containingList", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isHead", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getPageId", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "containingList", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "getHeadPageId", "()J", false);
methodVisitor.visitInsn(LCMP);
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
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTail", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "getPageId", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "containingList", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/ListIndex", "getTailPageId", "()J", false);
methodVisitor.visitInsn(LCMP);
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
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("[ListNode(");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("->");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "next", "J");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/StringBuilder"});
methodVisitor.visitLdcInsn("null");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/apache/activemq/store/kahadb/disk/index/ListNode"}, 2, new Object[] {"java/lang/StringBuilder", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(")[");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "size", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)Lorg/apache/activemq/store/kahadb/disk/page/Page;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "containingList", "Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "next", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode", "entries", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "setEntries", "(Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/ListNode", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
