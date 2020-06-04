package asm.org.eclipse.persistence.platform.server.was;
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
public class WebSphere_7_PlatformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", null, "org/eclipse/persistence/platform/server/was/WebSphere_6_1_Platform", new String[] { "org/eclipse/persistence/platform/server/JMXEnabledPlatform" });

classWriter.visitInnerClass("org/eclipse/persistence/platform/server/was/WebSphere_7_Platform$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERVER_LOG_CLASS", "Ljava/lang/String;", null, "com.ibm.ws.jpa.container.eclipselink.logging.EclipseLinkLogger");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("[app:");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "APP_SERVER_CLASSLOADER_APPLICATION_PU_SEARCH_STRING_PREFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("]");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "APP_SERVER_CLASSLOADER_APPLICATION_PU_SEARCH_STRING_POSTFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(".jar!/");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "APP_SERVER_CLASSLOADER_MODULE_EJB_SEARCH_STRING_PREFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(".war!/");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "APP_SERVER_CLASSLOADER_MODULE_WAR_SEARCH_STRING_PREFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("]");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "APP_SERVER_CLASSLOADER_MODULE_EJB_WAR_SEARCH_STRING_POSTFIX", "Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "setDefaultUseDoPrivilegedValue", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/sessions/DatabaseSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/server/was/WebSphere_6_1_Platform", "<init>", "(Lorg/eclipse/persistence/sessions/DatabaseSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "enableRuntimeServices", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "prepareServerSpecificServicesMBean", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServerLog", "()Lorg/eclipse/persistence/logging/SessionLog;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "createSessionLog", "()Lorg/eclipse/persistence/logging/SessionLog;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createSessionLog", "()Lorg/eclipse/persistence/logging/SessionLog;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "shouldUsePrivilegedAccess", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform$1", "<init>", "(Lorg/eclipse/persistence/platform/server/was/WebSphere_7_Platform;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/logging/SessionLog");
methodVisitor.visitVarInsn(ASTORE, 1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/logging/SessionLog"}, 0, null);
methodVisitor.visitLdcInsn("com.ibm.ws.jpa.container.eclipselink.logging.EclipseLinkLogger");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/security/PrivilegedAccessHelper", "getConstructorFor", "(Ljava/lang/Class;[Ljava/lang/Class;Z)Ljava/lang/reflect/Constructor;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Constructor", "newInstance", "([Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/logging/SessionLog");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/server/was/WebSphere_6_1_Platform", "getServerLog", "()Lorg/eclipse/persistence/logging/SessionLog;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Unable to create an instance of com.ibm.ws.jpa.container.eclipselink.logging.EclipseLinkLogger. Falling back to using default logger.");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/logging/SessionLog", "log", "(ILjava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isRuntimeServicesEnabledDefault", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareServerSpecificServicesMBean", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "getDatabaseSession", "()Lorg/eclipse/persistence/sessions/DatabaseSession;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "shouldRegisterRuntimeBean", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/services/websphere/MBeanWebSphereRuntimeServices");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "getDatabaseSession", "()Lorg/eclipse/persistence/sessions/DatabaseSession;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/services/websphere/MBeanWebSphereRuntimeServices", "<init>", "(Lorg/eclipse/persistence/sessions/Session;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "setRuntimeServicesMBean", "(Lorg/eclipse/persistence/services/mbean/MBeanRuntimeServicesMBean;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serverSpecificRegisterMBean", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/server/was/WebSphere_6_1_Platform", "serverSpecificRegisterMBean", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/was/WebSphere_7_Platform", "initializeApplicationNameAndModuleName", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
