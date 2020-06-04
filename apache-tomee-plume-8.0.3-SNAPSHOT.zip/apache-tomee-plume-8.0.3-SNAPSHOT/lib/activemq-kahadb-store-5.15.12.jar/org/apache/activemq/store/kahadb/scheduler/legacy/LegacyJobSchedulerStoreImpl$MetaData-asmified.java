package asm.org.apache.activemq.store.kahadb.scheduler.legacy;
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
public class LegacyJobSchedulerStoreImpl$MetaDataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "MetaData", ACC_PROTECTED);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$JobSchedulerMarshaller", "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "JobSchedulerMarshaller", 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "store", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;", "Lorg/apache/activemq/store/kahadb/disk/page/Page<Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/Integer;Ljava/lang/Integer;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex<Ljava/lang/String;Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "createIndexes", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$000", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "allocate", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$000", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "allocate", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/StringMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/StringMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$JobSchedulerMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$JobSchedulerMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "loadScheduler", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/util/Map;)V", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/util/Map<Ljava/lang/String;Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl;>;)V", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
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
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$000", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/StringMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/StringMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$JobSchedulerMarshaller");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "store", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$JobSchedulerMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$000", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readLong", "()J", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "<init>", "(Lorg/apache/activemq/store/kahadb/disk/page/PageFile;J)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setKeyMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "setValueMarshaller", "(Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "storedSchedulers", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "journalRC", "Lorg/apache/activemq/store/kahadb/disk/index/BTreeIndex;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/index/BTreeIndex", "getPageId", "()J", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeLong", "(J)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
