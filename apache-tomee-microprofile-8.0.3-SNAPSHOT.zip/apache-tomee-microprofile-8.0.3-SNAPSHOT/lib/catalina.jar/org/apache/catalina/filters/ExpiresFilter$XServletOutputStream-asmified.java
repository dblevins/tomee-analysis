package asm.org.apache.catalina.filters;
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
public class ExpiresFilter$XServletOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", null, "javax/servlet/ServletOutputStream", null);

classWriter.visitInnerClass("org/apache/catalina/filters/ExpiresFilter$XHttpServletResponse", "org/apache/catalina/filters/ExpiresFilter", "XHttpServletResponse", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "org/apache/catalina/filters/ExpiresFilter", "XServletOutputStream", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "request", "Ljavax/servlet/http/HttpServletRequest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "response", "Lorg/apache/catalina/filters/ExpiresFilter$XHttpServletResponse;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "servletOutputStream", "Ljavax/servlet/ServletOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/filters/ExpiresFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/catalina/filters/ExpiresFilter;Ljavax/servlet/ServletOutputStream;Ljavax/servlet/http/HttpServletRequest;Lorg/apache/catalina/filters/ExpiresFilter$XHttpServletResponse;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "this$0", "Lorg/apache/catalina/filters/ExpiresFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/servlet/ServletOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "response", "Lorg/apache/catalina/filters/ExpiresFilter$XHttpServletResponse;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "request", "Ljavax/servlet/http/HttpServletRequest;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fireOnBeforeWriteResponseBodyEvent", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "response", "Lorg/apache/catalina/filters/ExpiresFilter$XHttpServletResponse;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/ExpiresFilter$XHttpServletResponse", "isWriteResponseBodyStarted", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "response", "Lorg/apache/catalina/filters/ExpiresFilter$XHttpServletResponse;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/ExpiresFilter$XHttpServletResponse", "setWriteResponseBodyStarted", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "this$0", "Lorg/apache/catalina/filters/ExpiresFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "request", "Ljavax/servlet/http/HttpServletRequest;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "response", "Lorg/apache/catalina/filters/ExpiresFilter$XHttpServletResponse;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/filters/ExpiresFilter", "onBeforeWriteResponseBody", "(Ljavax/servlet/http/HttpServletRequest;Lorg/apache/catalina/filters/ExpiresFilter$XHttpServletResponse;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "flush", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "flush", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "print", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(C)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "print", "(C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(D)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "print", "(D)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(F)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "print", "(F)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "print", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(J)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "print", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "(Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "(C)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "(C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "(D)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(DLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "(D)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "(F)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(FLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "(F)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "(J)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "(J)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "println", "(Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([B)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "write", "([B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "([BII)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "write", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(I)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "fireOnBeforeWriteResponseBodyEvent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/ExpiresFilter$XServletOutputStream", "servletOutputStream", "Ljavax/servlet/ServletOutputStream;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/servlet/ServletOutputStream", "write", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isReady", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWriteListener", "(Ljavax/servlet/WriteListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
