package asm.org.apache.openejb.rest;
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
public class ThreadLocalContextManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/rest/ThreadLocalContextManager", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST", "Lorg/apache/openejb/rest/ThreadLocalRequest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_CONFIG", "Lorg/apache/openejb/rest/ThreadLocalServletConfig;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalServletContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalServletRequest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalHttpServletRequest;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_SERVLET_RESPONSE", "Lorg/apache/openejb/rest/ThreadLocalHttpServletResponse;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "URI_INFO", "Lorg/apache/openejb/rest/ThreadLocalUriInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HTTP_HEADERS", "Lorg/apache/openejb/rest/ThreadLocalHttpHeaders;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalSecurityContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTEXT_RESOLVER", "Lorg/apache/openejb/rest/ThreadLocalContextResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROVIDERS", "Lorg/apache/openejb/rest/ThreadLocalProviders;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPLICATION", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Ljavax/ws/rs/core/Application;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONFIGURATION", "Lorg/apache/openejb/rest/ThreadLocalConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_INFO", "Lorg/apache/openejb/rest/ThreadLocalResourceInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalResourceContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OTHERS", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "REQUEST", "Lorg/apache/openejb/rest/ThreadLocalRequest;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalRequest", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalServletRequest;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalServletRequest", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_CONFIG", "Lorg/apache/openejb/rest/ThreadLocalServletConfig;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalServletConfig", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalServletContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalServletContext", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalHttpServletRequest;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalHttpServletRequest", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_SERVLET_RESPONSE", "Lorg/apache/openejb/rest/ThreadLocalHttpServletResponse;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalHttpServletResponse", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "URI_INFO", "Lorg/apache/openejb/rest/ThreadLocalUriInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalUriInfo", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_HEADERS", "Lorg/apache/openejb/rest/ThreadLocalHttpHeaders;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalHttpHeaders", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SECURITY_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalSecurityContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalSecurityContext", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "CONTEXT_RESOLVER", "Lorg/apache/openejb/rest/ThreadLocalContextResolver;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalContextResolver", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "PROVIDERS", "Lorg/apache/openejb/rest/ThreadLocalProviders;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalProviders", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "APPLICATION", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "CONFIGURATION", "Lorg/apache/openejb/rest/ThreadLocalConfiguration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalConfiguration", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "RESOURCE_INFO", "Lorg/apache/openejb/rest/ThreadLocalResourceInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalResourceInfo", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "RESOURCE_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalResourceContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/rest/ThreadLocalResourceContext", "remove", "()V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "OTHERS", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "clear", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Map"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "OTHERS", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "remove", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadLocal", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Ljava/lang/Class<*>;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Request;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "REQUEST", "Lorg/apache/openejb/rest/ThreadLocalRequest;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/UriInfo;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "URI_INFO", "Lorg/apache/openejb/rest/ThreadLocalUriInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/HttpHeaders;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_HEADERS", "Lorg/apache/openejb/rest/ThreadLocalHttpHeaders;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/SecurityContext;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SECURITY_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalSecurityContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/ext/ContextResolver;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "CONTEXT_RESOLVER", "Lorg/apache/openejb/rest/ThreadLocalContextResolver;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/ext/Providers;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "PROVIDERS", "Lorg/apache/openejb/rest/ThreadLocalProviders;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/ServletRequest;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalServletRequest;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/http/HttpServletRequest;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalHttpServletRequest;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/http/HttpServletResponse;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_SERVLET_RESPONSE", "Lorg/apache/openejb/rest/ThreadLocalHttpServletResponse;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/ServletConfig;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_CONFIG", "Lorg/apache/openejb/rest/ThreadLocalServletConfig;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/servlet/ServletContext;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalServletContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/container/ResourceInfo;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "RESOURCE_INFO", "Lorg/apache/openejb/rest/ThreadLocalResourceInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/container/ResourceContext;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "RESOURCE_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalResourceContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Application;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "APPLICATION", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/ws/rs/core/Configuration;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "CONFIGURATION", "Lorg/apache/openejb/rest/ThreadLocalConfiguration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalRequest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalRequest", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "REQUEST", "Lorg/apache/openejb/rest/ThreadLocalRequest;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalServletConfig");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalServletConfig", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_CONFIG", "Lorg/apache/openejb/rest/ThreadLocalServletConfig;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalServletContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalServletContext", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalServletContext;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalServletRequest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalServletRequest", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalServletRequest;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalHttpServletRequest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalHttpServletRequest", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_SERVLET_REQUEST", "Lorg/apache/openejb/rest/ThreadLocalHttpServletRequest;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalHttpServletResponse");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalHttpServletResponse", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_SERVLET_RESPONSE", "Lorg/apache/openejb/rest/ThreadLocalHttpServletResponse;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalUriInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalUriInfo", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "URI_INFO", "Lorg/apache/openejb/rest/ThreadLocalUriInfo;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalHttpHeaders");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalHttpHeaders", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "HTTP_HEADERS", "Lorg/apache/openejb/rest/ThreadLocalHttpHeaders;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalSecurityContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalSecurityContext", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "SECURITY_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalSecurityContext;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalContextResolver");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalContextResolver", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "CONTEXT_RESOLVER", "Lorg/apache/openejb/rest/ThreadLocalContextResolver;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalProviders");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalProviders", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "PROVIDERS", "Lorg/apache/openejb/rest/ThreadLocalProviders;");
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "APPLICATION", "Ljava/lang/ThreadLocal;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalConfiguration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalConfiguration", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "CONFIGURATION", "Lorg/apache/openejb/rest/ThreadLocalConfiguration;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalResourceInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalResourceInfo", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "RESOURCE_INFO", "Lorg/apache/openejb/rest/ThreadLocalResourceInfo;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/rest/ThreadLocalResourceContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/rest/ThreadLocalResourceContext", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "RESOURCE_CONTEXT", "Lorg/apache/openejb/rest/ThreadLocalResourceContext;");
methodVisitor.visitTypeInsn(NEW, "java/lang/ThreadLocal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ThreadLocal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/rest/ThreadLocalContextManager", "OTHERS", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
