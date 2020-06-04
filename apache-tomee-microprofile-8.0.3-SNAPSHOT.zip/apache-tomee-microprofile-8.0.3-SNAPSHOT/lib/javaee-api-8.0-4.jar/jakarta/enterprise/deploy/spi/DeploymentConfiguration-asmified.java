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
public class DeploymentConfigurationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_4, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/enterprise/deploy/spi/DeploymentConfiguration", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeployableObject", "()Ljakarta/enterprise/deploy/model/DeployableObject;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDConfigBeanRoot", "(Ljakarta/enterprise/deploy/model/DDBeanRoot;)Ljakarta/enterprise/deploy/spi/DConfigBeanRoot;", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/ConfigurationException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeDConfigBean", "(Ljakarta/enterprise/deploy/spi/DConfigBeanRoot;)V", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/BeanNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restoreDConfigBean", "(Ljava/io/InputStream;Ljakarta/enterprise/deploy/model/DDBeanRoot;)Ljakarta/enterprise/deploy/spi/DConfigBeanRoot;", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/ConfigurationException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "saveDConfigBean", "(Ljava/io/OutputStream;Ljakarta/enterprise/deploy/spi/DConfigBeanRoot;)V", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/ConfigurationException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "restore", "(Ljava/io/InputStream;)V", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/ConfigurationException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "save", "(Ljava/io/OutputStream;)V", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/ConfigurationException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
