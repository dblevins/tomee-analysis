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
public class ListNode$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/disk/index/ListNode$1", "Lorg/apache/activemq/store/kahadb/disk/util/LinkedNodeList<Lorg/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry<TKey;TValue;>;>;", "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", null);

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/disk/index/ListNode", null, null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/index/ListNode$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/index/ListNode$KeyValueEntry", "org/apache/activemq/store/kahadb/disk/index/ListNode", "KeyValueEntry", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/disk/index/ListNode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode$1", "this$0", "Lorg/apache/activemq/store/kahadb/disk/index/ListNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("PageId:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode$1", "this$0", "Lorg/apache/activemq/store/kahadb/disk/index/ListNode;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/disk/index/ListNode", "access$000", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(", index:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/disk/index/ListNode$1", "this$0", "Lorg/apache/activemq/store/kahadb/disk/index/ListNode;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/disk/index/ListNode", "access$100", "(Lorg/apache/activemq/store/kahadb/disk/index/ListNode;)Lorg/apache/activemq/store/kahadb/disk/index/ListIndex;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/util/LinkedNodeList", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
