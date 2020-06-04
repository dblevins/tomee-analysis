package asm.javax.enterprise.deploy.spi;
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
public class DeploymentManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "javax/enterprise/deploy/spi/DeploymentManager", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTargets", "()[Ljavax/enterprise/deploy/spi/Target;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRunningModules", "(Ljavax/enterprise/deploy/shared/ModuleType;[Ljavax/enterprise/deploy/spi/Target;)[Ljavax/enterprise/deploy/spi/TargetModuleID;", null, new String[] { "javax/enterprise/deploy/spi/exceptions/TargetException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNonRunningModules", "(Ljavax/enterprise/deploy/shared/ModuleType;[Ljavax/enterprise/deploy/spi/Target;)[Ljavax/enterprise/deploy/spi/TargetModuleID;", null, new String[] { "javax/enterprise/deploy/spi/exceptions/TargetException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAvailableModules", "(Ljavax/enterprise/deploy/shared/ModuleType;[Ljavax/enterprise/deploy/spi/Target;)[Ljavax/enterprise/deploy/spi/TargetModuleID;", null, new String[] { "javax/enterprise/deploy/spi/exceptions/TargetException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConfiguration", "(Ljavax/enterprise/deploy/model/DeployableObject;)Ljavax/enterprise/deploy/spi/DeploymentConfiguration;", null, new String[] { "javax/enterprise/deploy/spi/exceptions/InvalidModuleException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distribute", "([Ljavax/enterprise/deploy/spi/Target;Ljava/io/File;Ljava/io/File;)Ljavax/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distribute", "([Ljavax/enterprise/deploy/spi/Target;Ljava/io/InputStream;Ljava/io/InputStream;)Ljavax/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "start", "([Ljavax/enterprise/deploy/spi/TargetModuleID;)Ljavax/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stop", "([Ljavax/enterprise/deploy/spi/TargetModuleID;)Ljavax/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "undeploy", "([Ljavax/enterprise/deploy/spi/TargetModuleID;)Ljavax/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isRedeploySupported", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "redeploy", "([Ljavax/enterprise/deploy/spi/TargetModuleID;Ljava/io/File;Ljava/io/File;)Ljavax/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/UnsupportedOperationException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "redeploy", "([Ljavax/enterprise/deploy/spi/TargetModuleID;Ljava/io/InputStream;Ljava/io/InputStream;)Ljavax/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/UnsupportedOperationException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "release", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDefaultLocale", "()Ljava/util/Locale;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentLocale", "()Ljava/util/Locale;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLocale", "(Ljava/util/Locale;)V", null, new String[] { "java/lang/UnsupportedOperationException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSupportedLocales", "()[Ljava/util/Locale;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isLocaleSupported", "(Ljava/util/Locale;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDConfigBeanVersion", "()Ljavax/enterprise/deploy/shared/DConfigBeanVersionType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isDConfigBeanVersionSupported", "(Ljavax/enterprise/deploy/shared/DConfigBeanVersionType;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDConfigBeanVersion", "(Ljavax/enterprise/deploy/shared/DConfigBeanVersionType;)V", null, new String[] { "javax/enterprise/deploy/spi/exceptions/DConfigBeanVersionUnsupportedException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
