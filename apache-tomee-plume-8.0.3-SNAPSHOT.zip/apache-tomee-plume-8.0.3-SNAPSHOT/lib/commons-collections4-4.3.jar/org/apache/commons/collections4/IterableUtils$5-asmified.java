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
public class IterableUtils$5Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/commons/collections4/IterableUtils$5", "Lorg/apache/commons/collections4/FluentIterable<TE;>;", "org/apache/commons/collections4/FluentIterable", null);

classWriter.visitOuterClass("org/apache/commons/collections4/IterableUtils", "filteredIterable", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)Ljava/lang/Iterable;");

classWriter.visitInnerClass("org/apache/commons/collections4/IterableUtils$5", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$iterable", "Ljava/lang/Iterable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$predicate", "Lorg/apache/commons/collections4/Predicate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/Iterable;Lorg/apache/commons/collections4/Predicate;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/IterableUtils$5", "val$iterable", "Ljava/lang/Iterable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/IterableUtils$5", "val$predicate", "Lorg/apache/commons/collections4/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/FluentIterable", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/IterableUtils$5", "val$iterable", "Ljava/lang/Iterable;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IterableUtils", "access$000", "(Ljava/lang/Iterable;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/IterableUtils$5", "val$predicate", "Lorg/apache/commons/collections4/Predicate;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/IteratorUtils", "filteredIterator", "(Ljava/util/Iterator;Lorg/apache/commons/collections4/Predicate;)Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
