package asm.org.eclipse.persistence.platform.server.jboss;
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
public class JBossPlatformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", null, "org/eclipse/persistence/platform/server/JMXServerPlatformBase", new String[] { "org/eclipse/persistence/platform/server/JMXEnabledPlatform" });

{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("/deploy/");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "APP_SERVER_CLASSLOADER_APPLICATION_PU_SEARCH_STRING_PREFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(".jar/");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "APP_SERVER_CLASSLOADER_MODULE_EJB_SEARCH_STRING_PREFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn(".war/");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "APP_SERVER_CLASSLOADER_MODULE_WAR_SEARCH_STRING_PREFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("/}");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "APP_SERVER_CLASSLOADER_APPLICATION_PU_SEARCH_STRING_POSTFIX", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("postfix,match~not;required^");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "APP_SERVER_CLASSLOADER_MODULE_EJB_WAR_SEARCH_STRING_POSTFIX", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/sessions/DatabaseSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/server/JMXServerPlatformBase", "<init>", "(Lorg/eclipse/persistence/sessions/DatabaseSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "enableRuntimeServices", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "prepareServerSpecificServicesMBean", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExternalTransactionControllerClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "externalTransactionControllerClass", "Ljava/lang/Class;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/transaction/jboss/JBossTransactionController;"));
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "externalTransactionControllerClass", "Ljava/lang/Class;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "externalTransactionControllerClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNewTempClassLoader", "(Ljakarta/persistence/spi/PersistenceUnitInfo;)Lorg/eclipse/persistence/internal/helper/JPAClassLoaderHolder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/spi/PersistenceUnitInfo", "getClassLoader", "()Ljava/lang/ClassLoader;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/logging/AbstractSessionLog", "getLog", "()Lorg/eclipse/persistence/logging/SessionLog;", false);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("persistence_unit_processor_jboss_temp_classloader_bypassed");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/spi/PersistenceUnitInfo", "getPersistenceUnitName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/logging/SessionLog", "log", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JPAClassLoaderHolder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JPAClassLoaderHolder", "<init>", "(Ljava/lang/ClassLoader;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepareServerSpecificServicesMBean", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "getDatabaseSession", "()Lorg/eclipse/persistence/sessions/DatabaseSession;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "shouldRegisterRuntimeBean", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/services/jboss/MBeanJBossRuntimeServices");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "getDatabaseSession", "()Lorg/eclipse/persistence/sessions/DatabaseSession;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/services/jboss/MBeanJBossRuntimeServices", "<init>", "(Lorg/eclipse/persistence/sessions/Session;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "setRuntimeServicesMBean", "(Lorg/eclipse/persistence/services/mbean/MBeanRuntimeServicesMBean;)V", false);
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
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/server/JMXServerPlatformBase", "serverSpecificRegisterMBean", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/server/jboss/JBossPlatform", "initializeApplicationNameAndModuleName", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
