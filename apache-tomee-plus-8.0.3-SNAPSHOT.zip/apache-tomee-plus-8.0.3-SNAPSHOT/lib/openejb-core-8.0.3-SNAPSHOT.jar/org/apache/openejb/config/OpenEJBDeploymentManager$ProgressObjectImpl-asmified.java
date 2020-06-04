package asm.org.apache.openejb.config;
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
public class OpenEJBDeploymentManager$ProgressObjectImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", null, "java/lang/Object", new String[] { "jakarta/enterprise/deploy/spi/status/ProgressObject" });

classWriter.visitInnerClass("org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "org/apache/openejb/config/OpenEJBDeploymentManager", "ProgressObjectImpl", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/OpenEJBDeploymentManager$DeploymentStatusImpl", "org/apache/openejb/config/OpenEJBDeploymentManager", "DeploymentStatusImpl", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "targetModuleIds", "Ljava/util/Set;", "Ljava/util/Set<Ljakarta/enterprise/deploy/spi/TargetModuleID;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "event", "Ljakarta/enterprise/deploy/spi/status/ProgressEvent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "deploymentStatus", "Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/config/OpenEJBDeploymentManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/config/OpenEJBDeploymentManager;Ljakarta/enterprise/deploy/shared/CommandType;Ljava/util/Set;)V", "(Ljakarta/enterprise/deploy/shared/CommandType;Ljava/util/Set<Ljakarta/enterprise/deploy/spi/TargetModuleID;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "this$0", "Lorg/apache/openejb/config/OpenEJBDeploymentManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/OpenEJBDeploymentManager$DeploymentStatusImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/OpenEJBDeploymentManager$DeploymentStatusImpl", "<init>", "(Ljakarta/enterprise/deploy/shared/CommandType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/deploy/spi/status/ProgressEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/deploy/spi/status/ProgressEvent", "<init>", "(Ljava/lang/Object;Ljakarta/enterprise/deploy/spi/TargetModuleID;Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "event", "Ljakarta/enterprise/deploy/spi/status/ProgressEvent;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/config/OpenEJBDeploymentManager;Ljakarta/enterprise/deploy/shared/CommandType;Ljava/lang/Exception;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "this$0", "Lorg/apache/openejb/config/OpenEJBDeploymentManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/OpenEJBDeploymentManager$DeploymentStatusImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/OpenEJBDeploymentManager$DeploymentStatusImpl", "<init>", "(Ljakarta/enterprise/deploy/shared/CommandType;Ljava/lang/Exception;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/deploy/spi/status/ProgressEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/deploy/spi/status/ProgressEvent", "<init>", "(Ljava/lang/Object;Ljakarta/enterprise/deploy/spi/TargetModuleID;Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "event", "Ljakarta/enterprise/deploy/spi/status/ProgressEvent;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getResultTargetModuleIDs", "()[Ljakarta/enterprise/deploy/spi/TargetModuleID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/enterprise/deploy/spi/TargetModuleID");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/enterprise/deploy/spi/TargetModuleID;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getDeploymentStatus", "()Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljakarta/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientConfiguration", "(Ljakarta/enterprise/deploy/spi/TargetModuleID;)Ljakarta/enterprise/deploy/spi/status/ClientConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCancelSupported", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cancel", "()V", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/OperationUnsupportedException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/deploy/spi/exceptions/OperationUnsupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cancel is not supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/deploy/spi/exceptions/OperationUnsupportedException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isStopSupported", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, new String[] { "jakarta/enterprise/deploy/spi/exceptions/OperationUnsupportedException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/deploy/spi/exceptions/OperationUnsupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("stop is not supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/deploy/spi/exceptions/OperationUnsupportedException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addProgressListener", "(Ljakarta/enterprise/deploy/spi/status/ProgressListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/OpenEJBDeploymentManager$ProgressObjectImpl", "event", "Ljakarta/enterprise/deploy/spi/status/ProgressEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/enterprise/deploy/spi/status/ProgressListener", "handleProgressEvent", "(Ljakarta/enterprise/deploy/spi/status/ProgressEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeProgressListener", "(Ljakarta/enterprise/deploy/spi/status/ProgressListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
