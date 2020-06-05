package asm.org.apache.openejb.server.webservices;
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
public class WsServletDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/webservices/WsServlet", null, "java/lang/Object", new String[] { "jakarta/servlet/Servlet" });

classWriter.visitInnerClass("org/apache/openejb/server/webservices/WsServlet$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/server/webservices/WsServlet$DefaultContext", "org/apache/openejb/server/webservices/WsServlet", "DefaultContext", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/server/webservices/WsServlet$InvocationContext", "org/apache/openejb/server/webservices/WsServlet", "InvocationContext", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/server/webservices/WsServlet$InstanceContext", "org/apache/openejb/server/webservices/WsServlet", "InstanceContext", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "POJO_CLASS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WEBSERVICE_CONTAINER", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_CONTEXT", "Lorg/apache/openejb/server/webservices/WsServlet$DefaultContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ENDPOINT_CONTENT", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Ljavax/xml/rpc/server/ServletEndpointContext;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "config", "Ljakarta/servlet/ServletConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pojo", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "service", "Lorg/apache/openejb/server/httpd/HttpListener;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/server/httpd/HttpListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/webservices/WsServlet", "service", "Lorg/apache/openejb/server/httpd/HttpListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Ljakarta/servlet/ServletConfig;)V", null, new String[] { "jakarta/servlet/ServletException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/rpc/ServiceException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/webservices/WsServlet", "config", "Ljakarta/servlet/ServletConfig;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsServlet", "createPojoInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/webservices/WsServlet", "pojo", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "pojo", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/rpc/server/ServiceLifecycle");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "pojo", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/rpc/server/ServiceLifecycle");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/webservices/WsServlet$InstanceContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletConfig", "getServletContext", "()Ljakarta/servlet/ServletContext;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsServlet$InstanceContext", "<init>", "(Ljakarta/servlet/ServletContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/rpc/server/ServiceLifecycle", "init", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/rpc/ServiceException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to initialize ServiceEndpoint");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsServlet", "getService", "()Lorg/apache/openejb/server/httpd/HttpListener;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServletConfig", "()Ljakarta/servlet/ServletConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "config", "Ljakarta/servlet/ServletConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServletInfo", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Webservice Servlet ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsServlet", "getService", "()Lorg/apache/openejb/server/httpd/HttpListener;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "service", "(Ljakarta/servlet/ServletRequest;Ljakarta/servlet/ServletResponse;)V", null, new String[] { "jakarta/servlet/ServletException", "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/servlet/ServletException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label4, label5, label6, null);
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label6, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsServlet", "getService", "()Lorg/apache/openejb/server/httpd/HttpListener;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label8);
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WebServiceContainer has not been set");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/server/httpd/HttpListener"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/webservices/WsServlet", "getContext", "()Ljavax/xml/rpc/server/ServletEndpointContext;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsServlet", "ENDPOINT_CONTENT", "Ljava/lang/ThreadLocal;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/webservices/WsServlet$InvocationContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/servlet/http/HttpServletRequest");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsServlet$InvocationContext", "<init>", "(Ljakarta/servlet/http/HttpServletRequest;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("text/xml");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletResponse", "setContentType", "(Ljava/lang/String;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/ServletRequestAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/servlet/http/HttpServletRequest");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/servlet/http/HttpServletResponse");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "config", "Ljakarta/servlet/ServletConfig;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletConfig", "getServletContext", "()Ljakarta/servlet/ServletContext;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/ServletRequestAdapter", "<init>", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;Ljakarta/servlet/ServletContext;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/httpd/ServletResponseAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/servlet/http/HttpServletResponse");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/ServletResponseAdapter", "<init>", "(Ljakarta/servlet/http/HttpServletResponse;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "pojo", "Ljava/lang/Object;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsConstants", "POJO_INSTANCE", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "pojo", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"javax/xml/rpc/server/ServletEndpointContext", "org/apache/openejb/server/httpd/HttpRequest", "org/apache/openejb/server/httpd/HttpResponse"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/server/httpd/HttpListener", "onMessage", "(Lorg/apache/openejb/server/httpd/HttpRequest;Lorg/apache/openejb/server/httpd/HttpResponse;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error processing webservice request");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsServlet", "ENDPOINT_CONTENT", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsServlet", "ENDPOINT_CONTENT", "Ljava/lang/ThreadLocal;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "pojo", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/xml/rpc/server/ServiceLifecycle");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "pojo", "Ljava/lang/Object;");
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/rpc/server/ServiceLifecycle");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/rpc/server/ServiceLifecycle", "destroy", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createPojoInstance", "()Ljava/lang/Object;", null, new String[] { "jakarta/servlet/ServletException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/webservices/WsServlet", "getServletConfig", "()Ljakarta/servlet/ServletConfig;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletConfig", "getServletContext", "()Ljakarta/servlet/ServletContext;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsServlet", "POJO_CLASS", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"jakarta/servlet/ServletContext", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unable to instantiate POJO WebService class: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNCHRONIZED, "getService", "()Lorg/apache/openejb/server/httpd/HttpListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "service", "Lorg/apache/openejb/server/httpd/HttpListener;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/webservices/WsServlet", "getServletConfig", "()Ljakarta/servlet/ServletConfig;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsServlet", "WEBSERVICE_CONTAINER", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletConfig", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletConfig", "getServletContext", "()Ljakarta/servlet/ServletContext;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/server/httpd/HttpListener");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/webservices/WsServlet", "service", "Lorg/apache/openejb/server/httpd/HttpListener;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet", "service", "Lorg/apache/openejb/server/httpd/HttpListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getContext", "()Ljavax/xml/rpc/server/ServletEndpointContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsServlet", "ENDPOINT_CONTENT", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/rpc/server/ServletEndpointContext");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/rpc/server/ServletEndpointContext"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsServlet", "DEFAULT_CONTEXT", "Lorg/apache/openejb/server/webservices/WsServlet$DefaultContext;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/rpc/server/ServletEndpointContext"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Ljavax/xml/rpc/server/ServletEndpointContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/webservices/WsServlet", "getContext", "()Ljavax/xml/rpc/server/ServletEndpointContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/server/webservices/WsServlet;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("@pojoClassName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/webservices/WsServlet", "POJO_CLASS", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/server/webservices/WsServlet;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("@WebServiceContainer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/webservices/WsServlet", "WEBSERVICE_CONTAINER", "Ljava/lang/String;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/server/webservices/WsServlet$DefaultContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/webservices/WsServlet$DefaultContext", "<init>", "(Lorg/apache/openejb/server/webservices/WsServlet$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/webservices/WsServlet", "DEFAULT_CONTEXT", "Lorg/apache/openejb/server/webservices/WsServlet$DefaultContext;");
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/server/webservices/WsServlet", "ENDPOINT_CONTENT", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
