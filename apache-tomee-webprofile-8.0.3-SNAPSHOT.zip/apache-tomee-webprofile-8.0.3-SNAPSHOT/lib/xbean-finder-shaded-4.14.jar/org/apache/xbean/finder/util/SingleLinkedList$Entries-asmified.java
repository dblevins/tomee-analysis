package asm.org.apache.xbean.finder.util;
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
public class SingleLinkedList$EntriesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/apache/xbean/finder/util/SingleLinkedList<TE;>.Entry<TE;>;>;Ljava/lang/Iterable<Lorg/apache/xbean/finder/util/SingleLinkedList<TE;>.Entry<TE;>;>;", "java/lang/Object", new String[] { "java/util/Iterator", "java/lang/Iterable" });

classWriter.visitInnerClass("org/apache/xbean/finder/util/SingleLinkedList$Entry", "org/apache/xbean/finder/util/SingleLinkedList", "Entry", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xbean/finder/util/SingleLinkedList$Entries", "org/apache/xbean/finder/util/SingleLinkedList", "Entries", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/xbean/finder/util/SingleLinkedList$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "current", "Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;", "Lorg/apache/xbean/finder/util/SingleLinkedList<TE;>.Entry<TE;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xbean/finder/util/SingleLinkedList;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/xbean/finder/util/SingleLinkedList;Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;)V", "(Lorg/apache/xbean/finder/util/SingleLinkedList<TE;>.Entry<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "this$0", "Lorg/apache/xbean/finder/util/SingleLinkedList;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "current", "Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/apache/xbean/finder/util/SingleLinkedList<TE;>.Entry<TE;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "current", "Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;", "()Lorg/apache/xbean/finder/util/SingleLinkedList<TE;>.Entry<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "current", "Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "current", "Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "current", "Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/util/SingleLinkedList$Entry", "access$400", "(Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;)Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "current", "Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("remove");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "next", "()Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/xbean/finder/util/SingleLinkedList;Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;Lorg/apache/xbean/finder/util/SingleLinkedList$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/util/SingleLinkedList$Entries", "<init>", "(Lorg/apache/xbean/finder/util/SingleLinkedList;Lorg/apache/xbean/finder/util/SingleLinkedList$Entry;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
