package asm.org.apache.tomee.catalina;
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
public class WebDeploymentListeners$WebDeploymentListenerObserverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomee/catalina/WebDeploymentListeners$WebDeploymentListenerObserver", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomee/catalina/WebDeploymentListeners$WebDeploymentListenerObserver", "org/apache/tomee/catalina/WebDeploymentListeners", "WebDeploymentListenerObserver", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "delegate", "Lorg/apache/tomee/catalina/WebDeploymentListener;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomee/catalina/WebDeploymentListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/catalina/WebDeploymentListeners$WebDeploymentListenerObserver", "delegate", "Lorg/apache/tomee/catalina/WebDeploymentListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterApplicationCreated", "(Lorg/apache/tomee/catalina/event/AfterApplicationCreated;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lorg/apache/openejb/observer/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/catalina/WebDeploymentListeners$WebDeploymentListenerObserver", "delegate", "Lorg/apache/tomee/catalina/WebDeploymentListener;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/catalina/event/AfterApplicationCreated", "getApp", "()Lorg/apache/openejb/assembler/classic/AppInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/catalina/event/AfterApplicationCreated", "getWeb", "()Lorg/apache/openejb/assembler/classic/WebAppInfo;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomee/catalina/WebDeploymentListener", "afterApplicationCreated", "(Lorg/apache/openejb/assembler/classic/AppInfo;Lorg/apache/openejb/assembler/classic/WebAppInfo;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
