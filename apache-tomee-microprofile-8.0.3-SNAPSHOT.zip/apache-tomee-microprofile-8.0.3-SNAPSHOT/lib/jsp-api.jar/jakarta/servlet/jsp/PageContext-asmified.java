package asm.jakarta.servlet.jsp;
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
public class PageContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "jakarta/servlet/jsp/PageContext", null, "jakarta/servlet/jsp/JspContext", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PAGE_SCOPE", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_SCOPE", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION_SCOPE", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPLICATION_SCOPE", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PAGE", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspPage");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PAGECONTEXT", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspPageContext");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspRequest");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESPONSE", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspResponse");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONFIG", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspConfig");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SESSION", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspSession");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUT", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspOut");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPLICATION", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspApplication");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCEPTION", "Ljava/lang/String;", null, "jakarta.servlet.jsp.jspException");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/JspContext", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initialize", "(Ljakarta/servlet/Servlet;Ljakarta/servlet/ServletRequest;Ljakarta/servlet/ServletResponse;Ljava/lang/String;ZIZ)V", null, new String[] { "java/io/IOException", "java/lang/IllegalStateException", "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "release", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSession", "()Ljakarta/servlet/http/HttpSession;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPage", "()Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRequest", "()Ljakarta/servlet/ServletRequest;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResponse", "()Ljakarta/servlet/ServletResponse;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getException", "()Ljava/lang/Exception;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getServletConfig", "()Ljakarta/servlet/ServletConfig;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getServletContext", "()Ljakarta/servlet/ServletContext;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "forward", "(Ljava/lang/String;)V", null, new String[] { "jakarta/servlet/ServletException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "include", "(Ljava/lang/String;)V", null, new String[] { "jakarta/servlet/ServletException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "include", "(Ljava/lang/String;Z)V", null, new String[] { "jakarta/servlet/ServletException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "handlePageException", "(Ljava/lang/Exception;)V", null, new String[] { "jakarta/servlet/ServletException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "handlePageException", "(Ljava/lang/Throwable;)V", null, new String[] { "jakarta/servlet/ServletException", "java/io/IOException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pushBody", "()Ljakarta/servlet/jsp/tagext/BodyContent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getErrorData", "()Ljakarta/servlet/jsp/ErrorData;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/PageContext", "getRequest", "()Ljakarta/servlet/ServletRequest;", false);
methodVisitor.visitLdcInsn("jakarta.servlet.error.status_code");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "java/lang/Integer"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/jsp/ErrorData");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/PageContext", "getRequest", "()Ljakarta/servlet/ServletRequest;", false);
methodVisitor.visitLdcInsn("jakarta.servlet.error.exception");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Throwable");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/PageContext", "getRequest", "()Ljakarta/servlet/ServletRequest;", false);
methodVisitor.visitLdcInsn("jakarta.servlet.error.request_uri");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/PageContext", "getRequest", "()Ljakarta/servlet/ServletRequest;", false);
methodVisitor.visitLdcInsn("jakarta.servlet.error.servlet_name");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/ErrorData", "<init>", "(Ljava/lang/Throwable;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
