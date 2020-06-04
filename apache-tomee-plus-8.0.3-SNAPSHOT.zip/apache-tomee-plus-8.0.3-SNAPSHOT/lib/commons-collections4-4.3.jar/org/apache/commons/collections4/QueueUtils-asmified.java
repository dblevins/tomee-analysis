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
public class QueueUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/collections4/QueueUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_QUEUE", "Ljava/util/Queue;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "synchronizedQueue", "(Ljava/util/Queue;)Ljava/util/Queue;", "<E:Ljava/lang/Object;>(Ljava/util/Queue<TE;>;)Ljava/util/Queue<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/SynchronizedQueue", "synchronizedQueue", "(Ljava/util/Queue;)Lorg/apache/commons/collections4/queue/SynchronizedQueue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unmodifiableQueue", "(Ljava/util/Queue;)Ljava/util/Queue;", "<E:Ljava/lang/Object;>(Ljava/util/Queue<+TE;>;)Ljava/util/Queue<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/UnmodifiableQueue", "unmodifiableQueue", "(Ljava/util/Queue;)Ljava/util/Queue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "predicatedQueue", "(Ljava/util/Queue;Lorg/apache/commons/collections4/Predicate;)Ljava/util/Queue;", "<E:Ljava/lang/Object;>(Ljava/util/Queue<TE;>;Lorg/apache/commons/collections4/Predicate<-TE;>;)Ljava/util/Queue<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/PredicatedQueue", "predicatedQueue", "(Ljava/util/Queue;Lorg/apache/commons/collections4/Predicate;)Lorg/apache/commons/collections4/queue/PredicatedQueue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "transformingQueue", "(Ljava/util/Queue;Lorg/apache/commons/collections4/Transformer;)Ljava/util/Queue;", "<E:Ljava/lang/Object;>(Ljava/util/Queue<TE;>;Lorg/apache/commons/collections4/Transformer<-TE;+TE;>;)Ljava/util/Queue<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/TransformedQueue", "transformingQueue", "(Ljava/util/Queue;Lorg/apache/commons/collections4/Transformer;)Lorg/apache/commons/collections4/queue/TransformedQueue;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyQueue", "()Ljava/util/Queue;", "<E:Ljava/lang/Object;>()Ljava/util/Queue<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/collections4/QueueUtils", "EMPTY_QUEUE", "Ljava/util/Queue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/LinkedList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/LinkedList", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/collections4/queue/UnmodifiableQueue", "unmodifiableQueue", "(Ljava/util/Queue;)Ljava/util/Queue;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/collections4/QueueUtils", "EMPTY_QUEUE", "Ljava/util/Queue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
