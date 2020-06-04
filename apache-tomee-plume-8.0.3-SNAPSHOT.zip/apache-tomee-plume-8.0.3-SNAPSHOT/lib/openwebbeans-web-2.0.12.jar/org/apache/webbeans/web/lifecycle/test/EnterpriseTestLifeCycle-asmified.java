package asm.org.apache.webbeans.web.lifecycle.test;
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
public class EnterpriseTestLifeCycleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", null, "org/apache/webbeans/lifecycle/StandaloneLifeCycle", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "servletContextEvent", "Lorg/apache/webbeans/web/lifecycle/test/MockServletContextEvent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "mockHttpSession", "Lorg/apache/webbeans/web/lifecycle/test/MockHttpSession;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/lifecycle/StandaloneLifeCycle", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeStartApplication", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/web/lifecycle/test/MockHttpSession");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/web/lifecycle/test/MockHttpSession", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "mockHttpSession", "Lorg/apache/webbeans/web/lifecycle/test/MockHttpSession;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/web/lifecycle/test/MockServletContextEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/web/lifecycle/test/MockServletContextEvent", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "servletContextEvent", "Lorg/apache/webbeans/web/lifecycle/test/MockServletContextEvent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "getWebBeansContext", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getContextsService", "()Lorg/apache/webbeans/spi/ContextsService;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/RequestScoped;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "startContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/SessionScoped;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "mockHttpSession", "Lorg/apache/webbeans/web/lifecycle/test/MockHttpSession;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "startContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ConversationScoped;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "startContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ApplicationScoped;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "servletContextEvent", "Lorg/apache/webbeans/web/lifecycle/test/MockServletContextEvent;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/web/lifecycle/test/MockServletContextEvent", "getServletContext", "()Ljavax/servlet/ServletContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "startContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initApplication", "(Ljava/util/Properties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/corespi/se/DefaultScannerService");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/corespi/se/DefaultScannerService", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "scannerService", "Lorg/apache/webbeans/spi/ScannerService;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeStopApplication", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "getWebBeansContext", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getContextsService", "()Lorg/apache/webbeans/spi/ContextsService;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/RequestScoped;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "endContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/SessionScoped;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "mockHttpSession", "Lorg/apache/webbeans/web/lifecycle/test/MockHttpSession;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "endContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ConversationScoped;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "endContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/context/ApplicationScoped;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/web/lifecycle/test/EnterpriseTestLifeCycle", "servletContextEvent", "Lorg/apache/webbeans/web/lifecycle/test/MockServletContextEvent;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/web/lifecycle/test/MockServletContextEvent", "getServletContext", "()Ljavax/servlet/ServletContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/webbeans/spi/ContextsService", "endContext", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/el/ELContextStore", "getInstance", "(Z)Lorg/apache/webbeans/el/ELContextStore;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/el/ELContextStore", "destroyELContextStore", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/webbeans/config/WebBeansContext", "org/apache/webbeans/spi/ContextsService", "org/apache/webbeans/el/ELContextStore"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
