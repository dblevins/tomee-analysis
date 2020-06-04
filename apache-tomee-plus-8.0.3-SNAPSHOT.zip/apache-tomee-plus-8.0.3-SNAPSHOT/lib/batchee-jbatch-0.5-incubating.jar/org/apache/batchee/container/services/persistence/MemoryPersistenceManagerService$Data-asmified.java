package asm.org.apache.batchee.container.services.persistence;
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
public class MemoryPersistenceManagerService$DataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService", "Structures", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$JobInstanceData", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "JobInstanceData", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$ExecutionInstanceData", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "ExecutionInstanceData", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$StepExecutionInstanceData", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures", "StepExecutionInstanceData", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService", "Data", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "lastCleanedJobInstanceId", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "jobInstanceIdGenerator", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "executionInstanceIdGenerator", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "stepExecutionIdGenerator", "Ljava/util/concurrent/atomic/AtomicLong;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "checkpointData", "Ljava/util/Map;", "Ljava/util/Map<Lorg/apache/batchee/container/impl/controller/chunk/CheckpointDataKey;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointData;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "jobInstanceData", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Long;Lorg/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$JobInstanceData;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "executionInstanceData", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Long;Lorg/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$ExecutionInstanceData;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "stepExecutionInstanceData", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Long;Lorg/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Structures$StepExecutionInstanceData;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "(J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "lastCleanedJobInstanceId", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "jobInstanceIdGenerator", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "executionInstanceIdGenerator", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/atomic/AtomicLong");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/atomic/AtomicLong", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "stepExecutionIdGenerator", "Ljava/util/concurrent/atomic/AtomicLong;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "checkpointData", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "jobInstanceData", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "executionInstanceData", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/services/persistence/MemoryPersistenceManagerService$Data", "stepExecutionInstanceData", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
