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
public class ConcurrentHashMap$KeySetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", null, "java/util/AbstractSet", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "KeySet", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$HashIterator", "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "HashIterator", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$Entry", "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "Entry", ACC_PROTECTED | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractSet", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$HashIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "access$200", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;)[Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$Entry;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$HashIterator", "<init>", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;II)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "access$300", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "containsKey", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "access$500", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$Entry;", false);
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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "this$0", "Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap", "clear", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/concurrent/ConcurrentHashMap$KeySet", "<init>", "(Lorg/apache/openjpa/lib/util/concurrent/ConcurrentHashMap;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
