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
public class WsServlet$InvocationContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/server/webservices/WsServlet$InvocationContext", null, "java/lang/Object", new String[] { "javax/xml/rpc/server/ServletEndpointContext" });

classWriter.visitInnerClass("org/apache/openejb/server/webservices/WsServlet$InvocationContext", "org/apache/openejb/server/webservices/WsServlet", "InvocationContext", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "request", "Ljakarta/servlet/http/HttpServletRequest;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/servlet/http/HttpServletRequest;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/webservices/WsServlet$InvocationContext", "request", "Ljakarta/servlet/http/HttpServletRequest;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessageContext", "()Ljavax/xml/rpc/handler/MessageContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet$InvocationContext", "request", "Ljakarta/servlet/http/HttpServletRequest;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/server/webservices/WsConstants", "MESSAGE_CONTEXT", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/rpc/handler/MessageContext");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet$InvocationContext", "request", "Ljakarta/servlet/http/HttpServletRequest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletRequest", "getUserPrincipal", "()Ljava/security/Principal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHttpSession", "()Ljakarta/servlet/http/HttpSession;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet$InvocationContext", "request", "Ljakarta/servlet/http/HttpServletRequest;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletRequest", "getSession", "()Ljakarta/servlet/http/HttpSession;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServletContext", "()Ljakarta/servlet/ServletContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalAccessError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("InstanceContext should never delegate this method.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalAccessError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isUserInRole", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/webservices/WsServlet$InvocationContext", "request", "Ljakarta/servlet/http/HttpServletRequest;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletRequest", "isUserInRole", "(Ljava/lang/String;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
