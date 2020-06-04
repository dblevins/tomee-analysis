package asm.jakarta.enterprise.deploy.spi;
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

classWriter.visit(V1_4, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/enterprise/deploy/spi/DeploymentManager", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTargets", "()[Ljakarta/enterprise/deploy/spi/Target;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRunningModules", "(Ljakarta/enterprise/deploy/shared/ModuleType;[Ljakarta/enterprise/deploy/spi/Target;)[Ljakarta/enterprise/deploy/spi/TargetModuleID;", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/TargetException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNonRunningModules", "(Ljakarta/enterprise/deploy/shared/ModuleType;[Ljakarta/enterprise/deploy/spi/Target;)[Ljakarta/enterprise/deploy/spi/TargetModuleID;", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/TargetException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAvailableModules", "(Ljakarta/enterprise/deploy/shared/ModuleType;[Ljakarta/enterprise/deploy/spi/Target;)[Ljakarta/enterprise/deploy/spi/TargetModuleID;", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/TargetException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConfiguration", "(Ljakarta/enterprise/deploy/model/DeployableObject;)Ljakarta/enterprise/deploy/spi/DeploymentConfiguration;", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/InvalidModuleException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distribute", "([Ljakarta/enterprise/deploy/spi/Target;Ljava/io/File;Ljava/io/File;)Ljakarta/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "distribute", "([Ljakarta/enterprise/deploy/spi/Target;Ljava/io/InputStream;Ljava/io/InputStream;)Ljakarta/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "start", "([Ljakarta/enterprise/deploy/spi/TargetModuleID;)Ljakarta/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "stop", "([Ljakarta/enterprise/deploy/spi/TargetModuleID;)Ljakarta/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "undeploy", "([Ljakarta/enterprise/deploy/spi/TargetModuleID;)Ljakarta/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isRedeploySupported", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "redeploy", "([Ljakarta/enterprise/deploy/spi/TargetModuleID;Ljava/io/File;Ljava/io/File;)Ljakarta/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/UnsupportedOperationException", "java/lang/IllegalStateException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "redeploy", "([Ljakarta/enterprise/deploy/spi/TargetModuleID;Ljava/io/InputStream;Ljava/io/InputStream;)Ljakarta/enterprise/deploy/spi/status/ProgressObject;", null, new String[] { "java/lang/UnsupportedOperationException", "java/lang/IllegalStateException" });
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDConfigBeanVersion", "()Ljakarta/enterprise/deploy/shared/DConfigBeanVersionType;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isDConfigBeanVersionSupported", "(Ljakarta/enterprise/deploy/shared/DConfigBeanVersionType;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDConfigBeanVersion", "(Ljakarta/enterprise/deploy/shared/DConfigBeanVersionType;)V", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/DConfigBeanVersionUnsupportedException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
