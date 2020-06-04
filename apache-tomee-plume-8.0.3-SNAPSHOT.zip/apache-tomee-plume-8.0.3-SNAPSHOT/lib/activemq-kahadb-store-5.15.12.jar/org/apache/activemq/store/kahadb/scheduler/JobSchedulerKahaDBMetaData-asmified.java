package asm.org.apache.activemq.store.kahadb.scheduler;
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
public class JobSchedulerKahaDBMetaDataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "Lorg/apache/activemq/store/kahadb/AbstractKahaDBMetaData<Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;>;", "org/apache/activemq/store/kahadb/AbstractKahaDBMetaData", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "IntegerListMarshaller", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$JobSchedulerMarshaller", "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "JobSchedulerMarshaller", ACC_PRIVATE);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "token", "Ljava/util/UUID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "version", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/Integer;Ljava/lang/Integer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/String;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/AbstractKahaDBMetaData", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "SCHEDULER_STORE_TOKEN", "Ljava/util/UUID;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "token", "Ljava/util/UUID;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "version", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getToken", "()Ljava/util/UUID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "token", "Ljava/util/UUID;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersion", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "version", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRemoveLocationTracker", "()Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "()Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJournalRC", "()Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "()Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/Integer;Ljava/lang/Integer;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJobSchedulers", "()Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "()Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/String;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "getPageFile", "()Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "allocate", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "getPageFile", "()Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "allocate", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "getPageFile", "()Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "allocate", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/StringMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/StringMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$JobSchedulerMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$JobSchedulerMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadScheduler", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/util/Map;)V", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/util/Map<Ljava/lang/String;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl;>;)V", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "iterator", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)Ljava/util/Iterator;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerImpl", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljava/io/DataInput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitVarInsn(LSTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitVarInsn(LSTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/UUID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/UUID", "<init>", "(JJ)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "token", "Ljava/util/UUID;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/UnknownStoreVersionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/UnknownStoreVersionException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "token", "Ljava/util/UUID;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "SCHEDULER_STORE_TOKEN", "Ljava/util/UUID;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/UUID", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/UnknownStoreVersionException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "token", "Ljava/util/UUID;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/UUID", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/UnknownStoreVersionException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readInt", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "version", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readBoolean", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/LocationMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/LocationMarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LocationMarshaller", "readPayload", "(Ljava/io/DataInput;)Lorg/apache/activemq/store/kahadb/disk/journal/Location;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "setLastUpdateLocation", "(Lorg/apache/activemq/store/kahadb/disk/journal/Location;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "setLastUpdateLocation", "(Lorg/apache/activemq/store/kahadb/disk/journal/Location;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "getPageFile", "()Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/StringMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/StringMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$JobSchedulerMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$JobSchedulerMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "getPageFile", "()Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerStoreImpl", "getPageFile", "()Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Scheduler Store version {} loaded");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "version", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "info", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "token", "Ljava/util/UUID;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/UUID", "getMostSignificantBits", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "token", "Ljava/util/UUID;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/UUID", "getLeastSignificantBits", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "version", "I");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeInt", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "getLastUpdateLocation", "()Lorg/apache/activemq/store/kahadb/disk/journal/Location;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeBoolean", "(Z)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/LocationMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/LocationMarshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "getLastUpdateLocation", "()Lorg/apache/activemq/store/kahadb/disk/journal/Location;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/LocationMarshaller", "writePayload", "(Lorg/apache/activemq/store/kahadb/disk/journal/Location;Ljava/io/DataOutput;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeBoolean", "(Z)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "removeLocationTracker", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
