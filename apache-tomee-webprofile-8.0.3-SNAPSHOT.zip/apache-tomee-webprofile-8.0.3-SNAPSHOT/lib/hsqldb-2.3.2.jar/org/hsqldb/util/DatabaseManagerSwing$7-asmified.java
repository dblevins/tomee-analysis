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
public class DatabaseManagerSwing$7Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/util/DatabaseManagerSwing$7", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/hsqldb/util/DatabaseManagerSwing", null, null);

classWriter.visitInnerClass("org/hsqldb/util/DatabaseManagerSwing$7", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/hsqldb/util/DatabaseManagerSwing;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/util/DatabaseManagerSwing$7", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(new Long(500L));
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "sleep", "(J)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$7", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$600", "(Lorg/hsqldb/util/DatabaseManagerSwing;)Ljava/lang/Thread;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$7", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing", "txtCommand", "Ljavax/swing/JTextArea;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/JTextArea", "getText", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFLE, label5);
methodVisitor.visitInsn(ICONST_1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$7", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$400", "(Lorg/hsqldb/util/DatabaseManagerSwing;)Ljavax/swing/JButton;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/swing/JButton", "isEnabled", "()Z", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$7", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$700", "(Lorg/hsqldb/util/DatabaseManagerSwing;)Ljava/lang/Runnable;", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/util/DatabaseManagerSwing$7", "this$0", "Lorg/hsqldb/util/DatabaseManagerSwing;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/hsqldb/util/DatabaseManagerSwing", "access$800", "(Lorg/hsqldb/util/DatabaseManagerSwing;)Ljava/lang/Runnable;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Runnable"});
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/swing/SwingUtilities", "invokeLater", "(Ljava/lang/Runnable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
