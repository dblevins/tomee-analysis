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
public class CheckpointManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", null, "java/lang/Object", null);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "persistenceManagerService", "Lorg/apache/batchee/spi/PersistenceManagerService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "dataRepresentationService", "Lorg/apache/batchee/spi/DataRepresentationService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "readerProxy", "Ljavax/batch/api/chunk/ItemReader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "writerProxy", "Ljavax/batch/api/chunk/ItemWriter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "checkpointAlgorithm", "Ljavax/batch/api/chunk/CheckpointAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "stepId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jobInstanceID", "J", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/batch/api/chunk/ItemReader;Ljavax/batch/api/chunk/ItemWriter;Ljavax/batch/api/chunk/CheckpointAlgorithm;JLjava/lang/String;Lorg/apache/batchee/spi/PersistenceManagerService;Lorg/apache/batchee/spi/DataRepresentationService;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "readerProxy", "Ljavax/batch/api/chunk/ItemReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "writerProxy", "Ljavax/batch/api/chunk/ItemWriter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "checkpointAlgorithm", "Ljavax/batch/api/chunk/CheckpointAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "stepId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "jobInstanceID", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "persistenceManagerService", "Lorg/apache/batchee/spi/PersistenceManagerService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "dataRepresentationService", "Lorg/apache/batchee/spi/DataRepresentationService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beginCheckpoint", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "checkpointAlgorithm", "Ljavax/batch/api/chunk/CheckpointAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/api/chunk/CheckpointAlgorithm", "beginCheckpoint", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Checkpoint algorithm beginCheckpoint() failed");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerRuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endCheckpoint", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "checkpointAlgorithm", "Ljavax/batch/api/chunk/CheckpointAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/api/chunk/CheckpointAlgorithm", "endCheckpoint", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Checkpoint algorithm endCheckpoint() failed");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerRuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "applyCheckPointPolicy", "()Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "checkpointAlgorithm", "Ljavax/batch/api/chunk/CheckpointAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/api/chunk/CheckpointAlgorithm", "isReadyToCheckpoint", "()Z", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Checkpoint algorithm failed");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerRuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareCheckpoints", "()Ljava/util/Map;", "()Ljava/util/Map<Lorg/apache/batchee/container/impl/controller/chunk/CheckpointDataKey;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointData;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "dataRepresentationService", "Lorg/apache/batchee/spi/DataRepresentationService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "readerProxy", "Ljavax/batch/api/chunk/ItemReader;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/api/chunk/ItemReader", "checkpointInfo", "()Ljava/io/Serializable;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/spi/DataRepresentationService", "toInternalRepresentation", "(Ljava/lang/Object;)[B", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/chunk/CheckpointData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "jobInstanceID", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "stepId", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/impl/controller/chunk/CheckpointType", "READER", "Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/chunk/CheckpointData", "<init>", "(JLjava/lang/String;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/chunk/CheckpointData", "setRestartToken", "([B)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/chunk/CheckpointDataKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "jobInstanceID", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "stepId", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/impl/controller/chunk/CheckpointType", "READER", "Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/chunk/CheckpointDataKey", "<init>", "(JLjava/lang/String;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "dataRepresentationService", "Lorg/apache/batchee/spi/DataRepresentationService;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "writerProxy", "Ljavax/batch/api/chunk/ItemWriter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/api/chunk/ItemWriter", "checkpointInfo", "()Ljava/io/Serializable;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/spi/DataRepresentationService", "toInternalRepresentation", "(Ljava/lang/Object;)[B", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/chunk/CheckpointData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "jobInstanceID", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "stepId", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/impl/controller/chunk/CheckpointType", "WRITER", "Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/chunk/CheckpointData", "<init>", "(JLjava/lang/String;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/impl/controller/chunk/CheckpointData", "setRestartToken", "([B)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/impl/controller/chunk/CheckpointDataKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "jobInstanceID", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "stepId", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/impl/controller/chunk/CheckpointType", "WRITER", "Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/impl/controller/chunk/CheckpointDataKey", "<init>", "(JLjava/lang/String;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointType;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/batchee/container/impl/controller/chunk/CheckpointManager", Opcodes.TOP, Opcodes.TOP, "java/util/Map"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot persist the checkpoint data for [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "stepId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerServiceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "org/apache/batchee/container/impl/controller/chunk/CheckpointDataKey", "org/apache/batchee/container/impl/controller/chunk/CheckpointDataKey", "java/util/Map"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeCheckPoints", "(Ljava/util/Map;)V", "(Ljava/util/Map<Lorg/apache/batchee/container/impl/controller/chunk/CheckpointDataKey;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointData;>;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "persistenceManagerService", "Lorg/apache/batchee/spi/PersistenceManagerService;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/container/impl/controller/chunk/CheckpointDataKey");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/batchee/container/impl/controller/chunk/CheckpointData");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/batchee/spi/PersistenceManagerService", "setCheckpointData", "(Lorg/apache/batchee/container/impl/controller/chunk/CheckpointDataKey;Lorg/apache/batchee/container/impl/controller/chunk/CheckpointData;)V", true);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerServiceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Cannot persist the checkpoint data for [");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "stepId", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerServiceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "checkpointTimeout", "()I", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/batchee/container/impl/controller/chunk/CheckpointManager", "checkpointAlgorithm", "Ljavax/batch/api/chunk/CheckpointAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/batch/api/chunk/CheckpointAlgorithm", "checkpointTimeout", "()I", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/exception/BatchContainerRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Checkpoint algorithm checkpointTimeout() failed");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/exception/BatchContainerRuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
