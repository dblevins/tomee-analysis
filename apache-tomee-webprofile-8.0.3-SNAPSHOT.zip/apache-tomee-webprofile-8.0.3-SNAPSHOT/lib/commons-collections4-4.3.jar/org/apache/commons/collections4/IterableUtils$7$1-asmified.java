package asm.org.apache.commons.collections4;
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
public class IterableUtils$7$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/commons/collections4/IterableUtils$7$1", "Lorg/apache/commons/collections4/iterators/LazyIteratorChain<TE;>;", "org/apache/commons/collections4/iterators/LazyIteratorChain", null);

classWriter.visitOuterClass("org/apache/commons/collections4/IterableUtils$7", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$7", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$7$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/collections4/IterableUtils$7;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/IterableUtils$7;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/IterableUtils$7$1", "this$0", "Lorg/apache/commons/collections4/IterableUtils$7;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/iterators/LazyIteratorChain", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "nextIterator", "(I)Ljava/util/Iterator;", "(I)Ljava/util/Iterator<+TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/IterableUtils$7$1", "this$0", "Lorg/apache/commons/collections4/IterableUtils$7;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/IterableUtils$7", "val$iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "isEmpty", "(Ljava/lang/Iterable;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/IterableUtils$7$1", "this$0", "Lorg/apache/commons/collections4/IterableUtils$7;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/IterableUtils$7", "val$iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
