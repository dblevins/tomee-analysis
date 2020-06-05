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
public class VmDeploymentManager$ProgressObjectImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", null, "java/lang/Object", new String[] { "javax/enterprise/deploy/spi/status/ProgressObject" });

classWriter.visitInnerClass("org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "org/apache/openejb/config/VmDeploymentManager", "ProgressObjectImpl", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/VmDeploymentManager$DeploymentStatusImpl", "org/apache/openejb/config/VmDeploymentManager", "DeploymentStatusImpl", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "targetModuleIds", "Ljava/util/Set;", "Ljava/util/Set<Ljavax/enterprise/deploy/spi/TargetModuleID;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "event", "Ljavax/enterprise/deploy/spi/status/ProgressEvent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "deploymentStatus", "Ljavax/enterprise/deploy/spi/status/DeploymentStatus;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/config/VmDeploymentManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/config/VmDeploymentManager;Ljavax/enterprise/deploy/shared/CommandType;Ljava/util/Set;)V", "(Ljavax/enterprise/deploy/shared/CommandType;Ljava/util/Set<Ljavax/enterprise/deploy/spi/TargetModuleID;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "this$0", "Lorg/apache/openejb/config/VmDeploymentManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/VmDeploymentManager$DeploymentStatusImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/VmDeploymentManager$DeploymentStatusImpl", "<init>", "(Ljavax/enterprise/deploy/shared/CommandType;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljavax/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/deploy/spi/status/ProgressEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljavax/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/deploy/spi/status/ProgressEvent", "<init>", "(Ljava/lang/Object;Ljavax/enterprise/deploy/spi/TargetModuleID;Ljavax/enterprise/deploy/spi/status/DeploymentStatus;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "event", "Ljavax/enterprise/deploy/spi/status/ProgressEvent;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/config/VmDeploymentManager;Ljavax/enterprise/deploy/shared/CommandType;Ljava/lang/Exception;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "this$0", "Lorg/apache/openejb/config/VmDeploymentManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/VmDeploymentManager$DeploymentStatusImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/VmDeploymentManager$DeploymentStatusImpl", "<init>", "(Ljavax/enterprise/deploy/shared/CommandType;Ljava/lang/Exception;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljavax/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/deploy/spi/status/ProgressEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljavax/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/deploy/spi/status/ProgressEvent", "<init>", "(Ljava/lang/Object;Ljavax/enterprise/deploy/spi/TargetModuleID;Ljavax/enterprise/deploy/spi/status/DeploymentStatus;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "event", "Ljavax/enterprise/deploy/spi/status/ProgressEvent;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getResultTargetModuleIDs", "()[Ljavax/enterprise/deploy/spi/TargetModuleID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/enterprise/deploy/spi/TargetModuleID");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "targetModuleIds", "Ljava/util/Set;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/enterprise/deploy/spi/TargetModuleID");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/enterprise/deploy/spi/TargetModuleID;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "getDeploymentStatus", "()Ljavax/enterprise/deploy/spi/status/DeploymentStatus;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "deploymentStatus", "Ljavax/enterprise/deploy/spi/status/DeploymentStatus;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClientConfiguration", "(Ljavax/enterprise/deploy/spi/TargetModuleID;)Ljavax/enterprise/deploy/spi/status/ClientConfiguration;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "cancel", "()V", null, new String[] { "javax/enterprise/deploy/spi/exceptions/OperationUnsupportedException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/deploy/spi/exceptions/OperationUnsupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("cancel is not supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/deploy/spi/exceptions/OperationUnsupportedException", "<init>", "(Ljava/lang/String;)V", false);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, new String[] { "javax/enterprise/deploy/spi/exceptions/OperationUnsupportedException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/enterprise/deploy/spi/exceptions/OperationUnsupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("stop is not supported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/deploy/spi/exceptions/OperationUnsupportedException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addProgressListener", "(Ljavax/enterprise/deploy/spi/status/ProgressListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/VmDeploymentManager$ProgressObjectImpl", "event", "Ljavax/enterprise/deploy/spi/status/ProgressEvent;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/deploy/spi/status/ProgressListener", "handleProgressEvent", "(Ljavax/enterprise/deploy/spi/status/ProgressEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "removeProgressListener", "(Ljavax/enterprise/deploy/spi/status/ProgressListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
