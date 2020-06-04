package asm.org.apache.safeguard.impl.bulkhead;
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
public class BulkheadInterceptor$ContextualFutureWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$ContextualFutureWrapper", "<T:Ljava/lang/Object;>Lorg/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$FutureWrapper<TT;>;", "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$FutureWrapper", null);

classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor", "Model", ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$ContextualFutureWrapper", "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor", "ContextualFutureWrapper", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$FutureWrapper", "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor", "FutureWrapper", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "model", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;Ljava/util/Map;)V", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/asynchronous/BaseAsynchronousInterceptor$FutureWrapper", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$ContextualFutureWrapper", "model", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "before", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$ContextualFutureWrapper", "model", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "access$600", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "incrementAndGet", "()J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "after", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$ContextualFutureWrapper", "model", "Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model", "access$600", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;)Ljava/util/concurrent/atomic/AtomicLong;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/concurrent/atomic/AtomicLong", "decrementAndGet", "()J", false);
methodVisitor.visitInsn(POP2);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;Ljava/util/Map;Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/safeguard/impl/bulkhead/BulkheadInterceptor$ContextualFutureWrapper", "<init>", "(Lorg/apache/safeguard/impl/bulkhead/BulkheadInterceptor$Model;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
