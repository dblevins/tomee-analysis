package asm.org.apache.openjpa.lib.util.concurrent;
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
public class ConcurrentReferenceHashMap$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", null, "java/util/AbstractSet", null);

classWriter.visitOuterClass("org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "keySet", "()Ljava/util/Set;");

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "HashIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry", "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "Entry", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractSet", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "access$000", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;)[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$Entry;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$HashIterator", "<init>", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "access$100", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "containsKey", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap$1", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentReferenceHashMap", "clear", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
