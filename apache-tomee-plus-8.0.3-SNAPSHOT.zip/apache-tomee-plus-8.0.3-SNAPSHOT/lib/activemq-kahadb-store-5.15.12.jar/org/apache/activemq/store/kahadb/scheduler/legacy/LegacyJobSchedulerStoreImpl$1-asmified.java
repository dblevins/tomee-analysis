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
public class LegacyJobSchedulerStoreImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "Ljava/lang/Object;Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure<Ljava/io/IOException;>;", "java/lang/Object", new String[] { "org/apache/activemq/store/kahadb/disk/page/Transaction$Closure" });

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "doStart", "()V");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "MetaData", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$Closure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "Closure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaDataMarshaller", "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "MetaDataMarshaller", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$assertionsDisabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$000", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/disk/page/PageFile;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "getPageCount", "()J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "allocate", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "$assertionsDisabled", "Z");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/store/kahadb/disk/page/Page"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$100", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$100", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$100", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "createIndexes", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$100", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$200", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaDataMarshaller;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Page;Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;Z)V", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$200", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaDataMarshaller;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "load", "(JLorg/apache/activemq/store/kahadb/disk/util/Marshaller;)Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$102", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$100", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$100", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$100", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$300", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$MetaData", "loadScheduler", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "this$0", "Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "access$300", "(Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;)Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl", "start", "()V", false);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "org/apache/activemq/store/kahadb/disk/page/Transaction", "java/util/Iterator", "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Failed to load ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerImpl", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/scheduler/legacy/LegacyJobSchedulerStoreImpl$1", "$assertionsDisabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
