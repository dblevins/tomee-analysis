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
public class MultiSetUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/MultiSetUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_MULTISET", "Lorg/apache/commons/collections4/MultiSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "synchronizedMultiSet", "(Lorg/apache/commons/collections4/MultiSet;)Lorg/apache/commons/collections4/MultiSet;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/MultiSet<TE;>;)Lorg/apache/commons/collections4/MultiSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/multiset/SynchronizedMultiSet", "synchronizedMultiSet", "(Lorg/apache/commons/collections4/MultiSet;)Lorg/apache/commons/collections4/multiset/SynchronizedMultiSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableMultiSet", "(Lorg/apache/commons/collections4/MultiSet;)Lorg/apache/commons/collections4/MultiSet;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/MultiSet<+TE;>;)Lorg/apache/commons/collections4/MultiSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/multiset/UnmodifiableMultiSet", "unmodifiableMultiSet", "(Lorg/apache/commons/collections4/MultiSet;)Lorg/apache/commons/collections4/MultiSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "predicatedMultiSet", "(Lorg/apache/commons/collections4/MultiSet;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/MultiSet;", "<E:Ljava/lang/Object;>(Lorg/apache/commons/collections4/MultiSet<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Lorg/apache/commons/collections4/MultiSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/multiset/PredicatedMultiSet", "predicatedMultiSet", "(Lorg/apache/commons/collections4/MultiSet;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/multiset/PredicatedMultiSet;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyMultiSet", "()Lorg/apache/commons/collections4/MultiSet;", "<E:Ljava/lang/Object;>()Lorg/apache/commons/collections4/MultiSet<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/MultiSetUtils", "EMPTY_MULTISET", "Lorg/apache/commons/collections4/MultiSet;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/multiset/HashMultiSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/multiset/HashMultiSet", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/multiset/UnmodifiableMultiSet", "unmodifiableMultiSet", "(Lorg/apache/commons/collections4/MultiSet;)Lorg/apache/commons/collections4/MultiSet;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/MultiSetUtils", "EMPTY_MULTISET", "Lorg/apache/commons/collections4/MultiSet;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
