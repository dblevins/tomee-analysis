package asm.org.apache.geronimo.connector.work;
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
public class WorkerContext$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "org/apache/geronimo/connector/work/WorkerContext$1", null, "jakarta/resource/spi/work/WorkAdapter", null);

classWriter.visitOuterClass("org/apache/geronimo/connector/work/WorkerContext", null, null);

classWriter.visitInnerClass("org/apache/geronimo/connector/work/WorkerContext$1", null, null, ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/work/WorkAdapter", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "workRejected", "(Ljakarta/resource/spi/work/WorkEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkEvent", "getException", "()Ljakarta/resource/spi/work/WorkException;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkEvent", "getException", "()Ljakarta/resource/spi/work/WorkException;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/resource/spi/work/WorkCompletedException");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkEvent", "getException", "()Ljakarta/resource/spi/work/WorkException;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/work/WorkerContext", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkEvent", "getWork", "()Ljakarta/resource/spi/work/Work;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkEvent", "getException", "()Ljakarta/resource/spi/work/WorkException;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/geronimo/connector/work/WorkerContext", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkEvent", "getWork", "()Ljakarta/resource/spi/work/Work;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/work/WorkEvent", "getException", "()Ljakarta/resource/spi/work/WorkException;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
