package asm.org.apache.batchee.container.impl.controller.chunk;
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
public class ChunkStepController$ChunkStatusDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType", "org/apache/batchee/container/impl/controller/chunk/ChunkStepController", "ChunkStatusType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "org/apache/batchee/container/impl/controller/chunk/ChunkStepController", "ChunkStatus", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(0, "type", "Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "finished", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "retryableException", "Ljava/lang/Exception;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "markedForRollbackWithRetry", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemsTouchedInCurrentChunk", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "itemsToProcessOneByOneAfterRollback", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType", "NORMAL", "Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "<init>", "(Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController;Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController;Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "this$0", "Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "finished", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "retryableException", "Ljava/lang/Exception;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "markedForRollbackWithRetry", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "itemsTouchedInCurrentChunk", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "itemsToProcessOneByOneAfterRollback", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "type", "Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRetryingAfterRollback", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "type", "Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType", "RETRY_AFTER_ROLLBACK", "Lorg/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatusType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "wasMarkedForRollbackWithRetry", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "markedForRollbackWithRetry", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRetryableException", "()Ljava/lang/Exception;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "retryableException", "Ljava/lang/Exception;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "markForRollbackWithRetry", "(Ljava/lang/Exception;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "markedForRollbackWithRetry", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "retryableException", "Ljava/lang/Exception;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getItemsTouchedInCurrentChunk", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "itemsTouchedInCurrentChunk", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "incrementItemsTouchedInCurrentChunk", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "itemsTouchedInCurrentChunk", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "itemsTouchedInCurrentChunk", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getItemsToProcessOneByOneAfterRollback", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "itemsToProcessOneByOneAfterRollback", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setItemsToProcessOneByOneAfterRollback", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "itemsToProcessOneByOneAfterRollback", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isFinished", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "finished", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFinished", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/ChunkStepController$ChunkStatus", "finished", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
