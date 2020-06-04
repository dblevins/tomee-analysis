package asm.org.apache.openejb.util;
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
public class Pool$DiscardDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/util/Pool$Discard", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Event", "org/apache/openejb/util/Pool", "Event", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Discard", "org/apache/openejb/util/Pool", "Discard", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$2", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Stats", "org/apache/openejb/util/Pool", "Stats", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Supplier", "org/apache/openejb/util/Pool", "Supplier", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "expired", "Ljava/lang/Object;", "TT;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "event", "Lorg/apache/openejb/util/Pool$Event;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/util/Pool;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/util/Pool;Ljava/lang/Object;Lorg/apache/openejb/util/Pool$Event;)V", "(TT;Lorg/apache/openejb/util/Pool$Event;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$3500", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/CountingLatch;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/CountingLatch", "countUp", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("expired object cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/util/Pool$Discard", "org/apache/openejb/util/Pool", "java/lang/Object", "org/apache/openejb/util/Pool$Event"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Discard", "expired", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/Pool$Discard", "event", "Lorg/apache/openejb/util/Pool$Event;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/Pool$2", "$SwitchMap$org$apache$openejb$util$Pool$Event", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "event", "Lorg/apache/openejb/util/Pool$Event;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool$Event", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTableSwitchInsn(1, 5, label0, new Label[] { label3, label4, label5, label6, label7 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$3600", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$3700", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$3800", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$3900", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$2000", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Stats;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool$Stats", "access$4000", "(Lorg/apache/openejb/util/Pool$Stats;)Lorg/apache/openejb/monitoring/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/monitoring/Event", "record", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$3300", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/Pool$Supplier;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "expired", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "event", "Lorg/apache/openejb/util/Pool$Event;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/Pool$Supplier", "discard", "(Ljava/lang/Object;Lorg/apache/openejb/util/Pool$Event;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$3500", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/CountingLatch;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/CountingLatch", "countDown", "()V", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/Pool$Discard", "this$0", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Pool", "access$3500", "(Lorg/apache/openejb/util/Pool;)Lorg/apache/openejb/util/CountingLatch;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/CountingLatch", "countDown", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/util/Pool;Ljava/lang/Object;Lorg/apache/openejb/util/Pool$Event;Lorg/apache/openejb/util/Pool$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/Pool$Discard", "<init>", "(Lorg/apache/openejb/util/Pool;Ljava/lang/Object;Lorg/apache/openejb/util/Pool$Event;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
