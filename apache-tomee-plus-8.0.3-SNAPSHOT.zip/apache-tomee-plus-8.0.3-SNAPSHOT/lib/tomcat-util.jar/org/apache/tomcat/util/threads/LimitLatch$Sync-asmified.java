package asm.org.apache.tomcat.util.threads;
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
public class LimitLatch$SyncDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomcat/util/threads/LimitLatch$Sync", null, "java/util/concurrent/locks/AbstractQueuedSynchronizer", null);

classWriter.visitInnerClass("org/apache/tomcat/util/threads/LimitLatch$Sync", "org/apache/tomcat/util/threads/LimitLatch", "Sync", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/util/threads/LimitLatch;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/util/threads/LimitLatch;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/threads/LimitLatch$Sync", "this$0", "Lorg/apache/tomcat/util/threads/LimitLatch;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/locks/AbstractQueuedSynchronizer", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "tryAcquireShared", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/threads/LimitLatch$Sync", "this$0", "Lorg/apache/tomcat/util/threads/LimitLatch;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/threads/LimitLatch", "access$000", "(Lorg/apache/tomcat/util/threads/LimitLatch;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "incrementAndGet", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/threads/LimitLatch$Sync", "this$0", "Lorg/apache/tomcat/util/threads/LimitLatch;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/threads/LimitLatch", "access$100", "(Lorg/apache/tomcat/util/threads/LimitLatch;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/threads/LimitLatch$Sync", "this$0", "Lorg/apache/tomcat/util/threads/LimitLatch;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/threads/LimitLatch", "access$200", "(Lorg/apache/tomcat/util/threads/LimitLatch;)J", false);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/threads/LimitLatch$Sync", "this$0", "Lorg/apache/tomcat/util/threads/LimitLatch;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/threads/LimitLatch", "access$000", "(Lorg/apache/tomcat/util/threads/LimitLatch;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "decrementAndGet", "()J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.LONG}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "tryReleaseShared", "(I)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/threads/LimitLatch$Sync", "this$0", "Lorg/apache/tomcat/util/threads/LimitLatch;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/threads/LimitLatch", "access$000", "(Lorg/apache/tomcat/util/threads/LimitLatch;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "decrementAndGet", "()J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
