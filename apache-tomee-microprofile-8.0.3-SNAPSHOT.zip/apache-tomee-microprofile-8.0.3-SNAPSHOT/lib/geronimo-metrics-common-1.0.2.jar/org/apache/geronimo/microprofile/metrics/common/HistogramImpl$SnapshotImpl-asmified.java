package asm.org.apache.geronimo.microprofile.metrics.common;
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
public class HistogramImpl$SnapshotImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", null, "org/eclipse/microprofile/metrics/Snapshot", null);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "org/apache/geronimo/microprofile/metrics/common/HistogramImpl", "Value", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "org/apache/geronimo/microprofile/metrics/common/HistogramImpl", "SnapshotImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/microprofile/metrics/common/HistogramImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/metrics/Snapshot", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValues", "()[J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "()[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/util/stream/LongStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/LongStream", "toArray", "()[J", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMax", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$300", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/util/stream/LongStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/LongStream", "max", "()Ljava/util/OptionalLong;", true);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/OptionalLong", "orElse", "(J)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMin", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$300", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/util/stream/LongStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/LongStream", "min", "()Ljava/util/OptionalLong;", true);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/OptionalLong", "orElse", "(J)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMean", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/util/stream/LongStream;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/LongStream", "sum", "()J", true);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(I2D);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStdDev", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "getMean", "()D", false);
methodVisitor.visitVarInsn(DSTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("applyAsDouble", "()Ljava/util/function/ToDoubleFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)D"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "lambda$getStdDev$0", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D", false), Type.getType("(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "mapToDouble", "(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/DoubleStream", "sum", "()D", true);
methodVisitor.visitVarInsn(DSTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitVarInsn(DLOAD, 3);
methodVisitor.visitInvokeDynamicInsn("applyAsDouble", "(DD)Ljava/util/function/ToDoubleFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)D"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "lambda$getStdDev$1", "(DDLorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D", false), Type.getType("(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "mapToDouble", "(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/DoubleStream", "sum", "()D", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "sqrt", "(D)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dump", "(Ljava/io/OutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "()[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/util/stream/LongStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljava/io/OutputStream;)Ljava/util/function/LongConsumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(J)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "lambda$dump$2", "(Ljava/io/OutputStream;J)V", false), Type.getType("(J)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/LongStream", "forEach", "(Ljava/util/function/LongConsumer;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "(D)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DCMPL);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFGE, label0);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitInsn(DCMPG);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Quantile ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(D)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" is invalid");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(DCONST_0);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$300", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(I2D);
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "floor", "(D)D", false);
methodVisitor.visitInsn(D2I);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "()[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$300", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "sorted", "()[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "values", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "lambda$sorted$3", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/lang/Long;", false), Type.getType("(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/lang/Long;")});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Comparator", "comparing", "(Ljava/util/function/Function;)Ljava/util/Comparator;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "sort", "([Ljava/lang/Object;Ljava/util/Comparator;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "sorted", "[Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "values", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/util/stream/LongStream;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Stream", "of", "([Ljava/lang/Object;)Ljava/util/stream/Stream;", true);
methodVisitor.visitInvokeDynamicInsn("applyAsLong", "()Ljava/util/function/ToLongFunction;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)J"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "lambda$values$4", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false), Type.getType("(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "mapToLong", "(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$values$4", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$300", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$sorted$3", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)Ljava/lang/Long;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$300", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$dump$2", "(Ljava/io/OutputStream;J)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "UTF_8", "Ljava/nio/charset/Charset;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "write", "([B)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getStdDev$1", "(DDLorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$300", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)J", false);
methodVisitor.visitInsn(L2D);
methodVisitor.visitVarInsn(DLOAD, 0);
methodVisitor.visitInsn(DSUB);
methodVisitor.visitLdcInsn(new Double("2.0"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$100", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D", false);
methodVisitor.visitVarInsn(DLOAD, 2);
methodVisitor.visitInsn(DDIV);
methodVisitor.visitInsn(DMUL);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$getStdDev$0", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value", "access$100", "(Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/metrics/common/HistogramImpl$SnapshotImpl", "<init>", "([Lorg/apache/geronimo/microprofile/metrics/common/HistogramImpl$Value;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
