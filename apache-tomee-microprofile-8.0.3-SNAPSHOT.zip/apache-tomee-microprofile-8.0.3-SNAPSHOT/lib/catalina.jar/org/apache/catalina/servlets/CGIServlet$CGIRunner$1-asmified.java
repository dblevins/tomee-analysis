package asm.org.apache.catalina.servlets;
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
public class CGIServlet$CGIRunner$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/catalina/servlets/CGIServlet$CGIRunner$1", null, "java/lang/Thread", null);

classWriter.visitOuterClass("org/apache/catalina/servlets/CGIServlet$CGIRunner", "run", "()V");

classWriter.visitInnerClass("org/apache/catalina/servlets/CGIServlet$CGIRunner", "org/apache/catalina/servlets/CGIServlet", "CGIRunner", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/catalina/servlets/CGIServlet$CGIRunner$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$stdErrRdr", "Ljava/io/BufferedReader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/catalina/servlets/CGIServlet$CGIRunner;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/catalina/servlets/CGIServlet$CGIRunner;Ljava/io/BufferedReader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/servlets/CGIServlet$CGIRunner$1", "this$1", "Lorg/apache/catalina/servlets/CGIServlet$CGIRunner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/servlets/CGIServlet$CGIRunner$1", "val$stdErrRdr", "Ljava/io/BufferedReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/servlets/CGIServlet$CGIRunner$1", "this$1", "Lorg/apache/catalina/servlets/CGIServlet$CGIRunner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/servlets/CGIServlet$CGIRunner$1", "val$stdErrRdr", "Ljava/io/BufferedReader;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/servlets/CGIServlet$CGIRunner", "access$1200", "(Lorg/apache/catalina/servlets/CGIServlet$CGIRunner;Ljava/io/BufferedReader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
