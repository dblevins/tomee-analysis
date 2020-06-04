package asm.org.apache.tomee.catalina.cluster;
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
public class TomEEClusterListener$DeployTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "org/apache/tomee/catalina/cluster/TomEEClusterListener", "DeployTask", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomee/catalina/cluster/TomEEClusterListener$Static", "org/apache/tomee/catalina/cluster/TomEEClusterListener", "Static", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "app", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "REMOTE_DEPLOY_PROPERTIES", "Ljava/util/Properties;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "app", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/openejb/OpenEJBException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "javax/naming/NamingException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "app", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/catalina/cluster/TomEEClusterListener", "access$300", "(Ljava/lang/String;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/catalina/cluster/TomEEClusterListener", "access$400", "()Lorg/apache/openejb/assembler/Deployer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "app", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "REMOTE_DEPLOY_PROPERTIES", "Ljava/util/Properties;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/assembler/Deployer", "deploy", "(Ljava/lang/String;Ljava/util/Properties;)Lorg/apache/openejb/assembler/classic/AppInfo;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/OpenEJBException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/catalina/cluster/TomEEClusterListener$Static", "access$000", "()Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("can't deploy: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "app", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "warning", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/catalina/cluster/TomEEClusterListener$Static", "access$000", "()Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitLdcInsn("can't find deployer");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "warning", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Properties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Properties", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "REMOTE_DEPLOY_PROPERTIES", "Ljava/util/Properties;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/catalina/cluster/TomEEClusterListener$DeployTask", "REMOTE_DEPLOY_PROPERTIES", "Ljava/util/Properties;");
methodVisitor.visitLdcInsn("openejb.app.autodeploy");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Properties", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
