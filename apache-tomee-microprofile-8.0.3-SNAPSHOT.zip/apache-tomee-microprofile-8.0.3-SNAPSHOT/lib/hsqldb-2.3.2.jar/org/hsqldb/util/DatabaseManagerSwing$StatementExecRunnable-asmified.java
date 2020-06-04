package asm.org.hsqldb.util;
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
public class DatabaseManagerSwing$StatementExecRunnableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "org/hsqldb/util/DatabaseManagerSwing", "StatementExecRunnable", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/RuntimeException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing", "gResult", "Lorg/hsqldb/util/GridSwing;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/GridSwing", "clear", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing", "txtCommand", "Ljavax/swing/JTextArea;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/JTextArea", "getText", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("-->>>TEST<<<--");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$900", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$1000", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$1100", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$1200", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/DatabaseManagerSwing", "updateAutoCommitBox", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/DatabaseManagerSwing", "setWaiting", "(Ljava/lang/String;)V", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/CommonSwing", "errorMessage", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$StatementExecRunnable", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/util/DatabaseManagerSwing", "setWaiting", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
