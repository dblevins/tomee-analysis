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
public class LogStreamAsync$ConsumerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/util/LogStreamAsync$Consumer", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/openejb/util/LogStreamAsync$Message", "org/apache/openejb/util/LogStreamAsync", "Message", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/util/LogStreamAsync$Consumer", "org/apache/openejb/util/LogStreamAsync", "Consumer", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/util/LogStreamAsync$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/util/LogStreamAsync$level", "org/apache/openejb/util/LogStreamAsync", "level", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "queue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/util/concurrent/BlockingQueue<Lorg/apache/openejb/util/LogStreamAsync$Message;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/util/concurrent/BlockingQueue;)V", "(Ljava/util/concurrent/BlockingQueue<Lorg/apache/openejb/util/LogStreamAsync$Message;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/util/LogStreamAsync$Consumer", "queue", "Ljava/util/concurrent/BlockingQueue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogStreamAsync$level", "quit", "Lorg/apache/openejb/util/LogStreamAsync$level;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/util/LogStreamAsync$Consumer", "queue", "Ljava/util/concurrent/BlockingQueue;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/BlockingQueue", "take", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/util/LogStreamAsync$Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$300", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStreamAsync$level;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogStreamAsync$level", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$400", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogStreamAsync$1", "$SwitchMap$org$apache$openejb$util$LogStreamAsync$level", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$300", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStreamAsync$level;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogStreamAsync$level", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTableSwitchInsn(1, 5, label9, new Label[] { label4, label5, label6, label7, label8 });
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openejb/util/LogStreamAsync$Message", "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "fatal", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "info", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "debug", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogStreamAsync$1", "$SwitchMap$org$apache$openejb$util$LogStreamAsync$level", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$300", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStreamAsync$level;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/LogStreamAsync$level", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
methodVisitor.visitTableSwitchInsn(1, 5, label10, new Label[] { label11, label12, label13, label14, label15 });
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "fatal", "(Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "error", "(Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "warn", "(Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "info", "(Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$600", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Lorg/apache/openejb/util/LogStream;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/LogStreamAsync$Message", "access$500", "(Lorg/apache/openejb/util/LogStreamAsync$Message;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/util/LogStream", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/util/concurrent/BlockingQueue;Lorg/apache/openejb/util/LogStreamAsync$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/util/LogStreamAsync$Consumer", "<init>", "(Ljava/util/concurrent/BlockingQueue;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
