package asm.org.apache.activemq.memory;
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
public class UsageManagerCacheFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/memory/UsageManagerCacheFilter", null, "org/apache/activemq/memory/CacheFilter", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "totalUsage", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "usage", "Lorg/apache/activemq/usage/MemoryUsage;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/memory/Cache;Lorg/apache/activemq/usage/MemoryUsage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/memory/CacheFilter", "<init>", "(Lorg/apache/activemq/memory/Cache;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "totalUsage", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "usage", "Lorg/apache/activemq/usage/MemoryUsage;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/memory/UsageManagerCacheFilter", "getUsageOfAddedObject", "(Ljava/lang/Object;)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/memory/CacheFilter", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/memory/UsageManagerCacheFilter", "getUsageOfRemovedObject", "(Ljava/lang/Object;)J", false);
methodVisitor.visitInsn(LSUB);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.LONG, "java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "totalUsage", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "addAndGet", "(J)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "usage", "Lorg/apache/activemq/usage/MemoryUsage;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/MemoryUsage", "increaseUsage", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/memory/CacheFilter", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/memory/UsageManagerCacheFilter", "getUsageOfRemovedObject", "(Ljava/lang/Object;)J", false);
methodVisitor.visitVarInsn(LSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "totalUsage", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LNEG);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "addAndGet", "(J)J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "usage", "Lorg/apache/activemq/usage/MemoryUsage;");
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/MemoryUsage", "decreaseUsage", "(J)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getUsageOfAddedObject", "(Ljava/lang/Object;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getUsageOfRemovedObject", "(Ljava/lang/Object;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(LCONST_1);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "usage", "Lorg/apache/activemq/usage/MemoryUsage;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/memory/UsageManagerCacheFilter", "totalUsage", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "get", "()J", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/usage/MemoryUsage", "decreaseUsage", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
