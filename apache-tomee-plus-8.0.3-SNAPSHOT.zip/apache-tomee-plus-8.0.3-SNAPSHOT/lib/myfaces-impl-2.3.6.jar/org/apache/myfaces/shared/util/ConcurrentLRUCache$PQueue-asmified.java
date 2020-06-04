package asm.org.apache.myfaces.shared.util;
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
public class ConcurrentLRUCache$PQueueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/apache/myfaces/shared/util/PriorityQueue<Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry<TK;TV;>;>;", "org/apache/myfaces/shared/util/PriorityQueue", null);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "org/apache/myfaces/shared/util/ConcurrentLRUCache", "PQueue", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry", "org/apache/myfaces/shared/util/ConcurrentLRUCache", "CacheEntry", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "myMaxSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "heap", "[Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/shared/util/PriorityQueue", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "getHeapArray", "()[Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "heap", "[Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "myMaxSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getValues", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry<TK;TV;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "heap", "[Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "lessThan", "(Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry", "lastAccessedCopy", "J");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry", "lastAccessedCopy", "J");
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "myInsertWithOverflow", "(Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;)Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;", "(Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry<TK;TV;>;)Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry<TK;TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "size", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "myMaxSize", "I");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "add", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "size", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "heap", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "lessThan", "(Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "heap", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "heap", "[Ljava/lang/Object;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "updateTop", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "lessThan", "(Ljava/lang/Object;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/shared/util/ConcurrentLRUCache$PQueue", "lessThan", "(Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;Lorg/apache/myfaces/shared/util/ConcurrentLRUCache$CacheEntry;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
