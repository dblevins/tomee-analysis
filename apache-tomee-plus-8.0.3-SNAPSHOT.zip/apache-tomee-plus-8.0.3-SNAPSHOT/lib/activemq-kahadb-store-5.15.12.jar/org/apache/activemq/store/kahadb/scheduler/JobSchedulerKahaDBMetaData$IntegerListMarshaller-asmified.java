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
public class JobSchedulerKahaDBMetaData$IntegerListMarshallerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "Lorg/apache/activemq/store/kahadb/disk/util/VariableMarshaller<Ljava/util/List<Ljava/lang/Integer;>;>;", "org/apache/activemq/store/kahadb/disk/util/VariableMarshaller", null);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData", "IntegerListMarshaller", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/disk/util/VariableMarshaller", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readPayload", "(Ljava/io/DataInput;)Ljava/util/List;", "(Ljava/io/DataInput;)Ljava/util/List<Ljava/lang/Integer;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readInt", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/List", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "readPayload", "(Ljava/io/DataInput;)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writePayload", "(Ljava/util/List;Ljava/io/DataOutput;)V", "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/io/DataOutput;)V", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataOutput", "writeInt", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
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
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "INSTANCE", "Lorg/apache/activemq/store/kahadb/disk/util/IntegerMarshaller;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/util/IntegerMarshaller", "writePayload", "(Ljava/lang/Integer;Ljava/io/DataOutput;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "readPayload", "(Ljava/io/DataInput;)Ljava/lang/Object;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "readPayload", "(Ljava/io/DataInput;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "writePayload", "(Ljava/lang/Object;Ljava/io/DataOutput;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "writePayload", "(Ljava/util/List;Ljava/io/DataOutput;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData$IntegerListMarshaller", "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/JobSchedulerKahaDBMetaData;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
