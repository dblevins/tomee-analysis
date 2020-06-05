package asm.org.apache.webbeans.servlet;
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
public class WebBeansConfigurationFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", null, "java/lang/Object", new String[] { "jakarta/servlet/Filter" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "CALL_COUNT_ATTRIBUTE_NAME", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "logger", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "lifeCycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "servletContext", "Ljakarta/servlet/ServletContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "webContextsService", "Lorg/apache/webbeans/web/context/WebContextsService;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "startOwb", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/config/WebBeansContext", "getInstance", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getContextsService", "()Lorg/apache/webbeans/spi/ContextsService;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/web/context/WebContextsService");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "webContextsService", "Lorg/apache/webbeans/web/context/WebContextsService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Ljakarta/servlet/FilterConfig;)V", null, new String[] { "jakarta/servlet/ServletException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "webBeansContext", "Lorg/apache/webbeans/config/WebBeansContext;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/spi/ContainerLifecycle;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/spi/ContainerLifecycle");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lifeCycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/FilterConfig", "getServletContext", "()Ljakarta/servlet/ServletContext;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "servletContext", "Ljakarta/servlet/ServletContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("startOwb");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/FilterConfig", "getInitParameter", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/webbeans/servlet/WebBeansConfigurationFilter", "jakarta/servlet/FilterConfig", "java/lang/String"}, 1, new Object[] {"org/apache/webbeans/servlet/WebBeansConfigurationFilter"});
methodVisitor.visitInsn(ICONST_1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/webbeans/servlet/WebBeansConfigurationFilter"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/webbeans/servlet/WebBeansConfigurationFilter", "jakarta/servlet/FilterConfig", "java/lang/String"}, 2, new Object[] {"org/apache/webbeans/servlet/WebBeansConfigurationFilter", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "startOwb", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "startOwb", "Z");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lifeCycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletContextEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "servletContext", "Ljakarta/servlet/ServletContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletContextEvent", "<init>", "(Ljakarta/servlet/ServletContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContainerLifecycle", "startApplication", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("ERROR_0018");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "servletContext", "Ljakarta/servlet/ServletContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/web/util/ServletCompatibilityUtil", "getServletInfo", "(Ljakarta/servlet/ServletContext;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "constructMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/WebBeansUtil", "throwRuntimeExceptions", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doFilter", "(Ljakarta/servlet/ServletRequest;Ljakarta/servlet/ServletResponse;Ljakarta/servlet/FilterChain;)V", null, new String[] { "java/io/IOException", "jakarta/servlet/ServletException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "firstInit", "(Ljakarta/servlet/ServletRequest;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "requestInitialized", "(Ljakarta/servlet/ServletRequest;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/FilterChain", "doFilter", "(Ljakarta/servlet/ServletRequest;Ljakarta/servlet/ServletResponse;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lastDestroy", "(Ljakarta/servlet/ServletRequest;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "requestDestroyed", "(Ljakarta/servlet/ServletRequest;)V", false);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lastDestroy", "(Ljakarta/servlet/ServletRequest;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "requestDestroyed", "(Ljakarta/servlet/ServletRequest;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "firstInit", "(Ljakarta/servlet/ServletRequest;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "CALL_COUNT_ATTRIBUTE_NAME", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Integer"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "CALL_COUNT_ATTRIBUTE_NAME", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "lastDestroy", "(Ljakarta/servlet/ServletRequest;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "CALL_COUNT_ATTRIBUTE_NAME", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "CALL_COUNT_ATTRIBUTE_NAME", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Integer"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requestInitialized", "(Ljakarta/servlet/ServletRequest;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Starting a new request : [{0}]");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getRemoteAddr", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lifeCycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContainerLifecycle", "getContextService", "()Lorg/apache/webbeans/spi/ContextsService;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/RequestScoped;"));
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletRequestEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "servletContext", "Ljakarta/servlet/ServletContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletRequestEvent", "<init>", "(Ljakarta/servlet/ServletContext;Ljakarta/servlet/ServletRequest;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "startContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("ERROR_0019");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "constructMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/util/WebBeansUtil", "throwRuntimeExceptions", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "requestDestroyed", "(Ljakarta/servlet/ServletRequest;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Destroying a request : [{0}]");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/ServletRequest", "getRemoteAddr", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/el/ELContextStore", "getInstance", "(Z)Lorg/apache/webbeans/el/ELContextStore;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/el/ELContextStore", "destroyELContextStore", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/webbeans/el/ELContextStore"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lifeCycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContainerLifecycle", "getContextService", "()Lorg/apache/webbeans/spi/ContextsService;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/RequestScoped;"));
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletRequestEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "servletContext", "Ljakarta/servlet/ServletContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletRequestEvent", "<init>", "(Ljakarta/servlet/ServletContext;Ljakarta/servlet/ServletRequest;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "endContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "cleanupRequestThreadLocals", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "startOwb", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lifeCycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/ServletContextEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "servletContext", "Ljakarta/servlet/ServletContext;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/ServletContextEvent", "<init>", "(Ljakarta/servlet/ServletContext;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContainerLifecycle", "stopApplication", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "lifeCycle", "Lorg/apache/webbeans/spi/ContainerLifecycle;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "servletContext", "Ljakarta/servlet/ServletContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "cleanupRequestThreadLocals", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "cleanupRequestThreadLocals", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "webContextsService", "Lorg/apache/webbeans/web/context/WebContextsService;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/web/context/WebContextsService", "removeThreadLocals", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/servlet/WebBeansConfigurationFilter;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "CALL_COUNT_ATTRIBUTE_NAME", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/servlet/WebBeansConfigurationFilter;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/logger/WebBeansLoggerFacade", "getLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/servlet/WebBeansConfigurationFilter", "logger", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}