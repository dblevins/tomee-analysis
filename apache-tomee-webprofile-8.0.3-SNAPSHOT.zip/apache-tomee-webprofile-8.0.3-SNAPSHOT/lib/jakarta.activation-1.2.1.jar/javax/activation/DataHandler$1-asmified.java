package asm.javax.activation;
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
public class DataHandler$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "javax/activation/DataHandler$1", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("javax/activation/DataHandler", "getInputStream", "()Ljava/io/InputStream;");

classWriter.visitInnerClass("javax/activation/DataHandler$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$fdch", "Ljavax/activation/DataContentHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$pos", "Ljava/io/PipedOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Ljavax/activation/DataHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/activation/DataHandler;Ljavax/activation/DataContentHandler;Ljava/io/PipedOutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/activation/DataHandler$1", "this$0", "Ljavax/activation/DataHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/activation/DataHandler$1", "val$fdch", "Ljavax/activation/DataContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/activation/DataHandler$1", "val$pos", "Ljava/io/PipedOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label0, label4, "java/io/IOException");
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label5, label6, label7, "java/io/IOException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label3, label0, label8, null);
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/io/IOException");
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/activation/DataHandler$1", "val$fdch", "Ljavax/activation/DataContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/activation/DataHandler$1", "this$0", "Ljavax/activation/DataHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/activation/DataHandler", "access$000", "(Ljavax/activation/DataHandler;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/activation/DataHandler$1", "this$0", "Ljavax/activation/DataHandler;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/activation/DataHandler", "access$100", "(Ljavax/activation/DataHandler;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/activation/DataHandler$1", "val$pos", "Ljava/io/PipedOutputStream;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/activation/DataContentHandler", "writeTo", "(Ljava/lang/Object;Ljava/lang/String;Ljava/io/OutputStream;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/activation/DataHandler$1", "val$pos", "Ljava/io/PipedOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PipedOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/activation/DataHandler$1", "val$pos", "Ljava/io/PipedOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PipedOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/activation/DataHandler$1", "val$pos", "Ljava/io/PipedOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PipedOutputStream", "close", "()V", false);
methodVisitor.visitLabel(label10);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
