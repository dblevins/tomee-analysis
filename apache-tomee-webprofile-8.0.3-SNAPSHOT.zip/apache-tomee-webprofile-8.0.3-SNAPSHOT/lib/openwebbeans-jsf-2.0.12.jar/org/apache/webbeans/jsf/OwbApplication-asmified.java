package asm.org.apache.webbeans.jsf;
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
public class OwbApplicationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/jsf/OwbApplication", null, "javax/faces/application/ApplicationWrapper", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "wrappedApplication", "Ljavax/faces/application/Application;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "expressionFactory", "Ljavax/el/ExpressionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/application/Application;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/application/ApplicationWrapper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/jsf/OwbApplication", "wrappedApplication", "Ljavax/faces/application/Application;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/jsf/OwbApplication", "expressionFactory", "Ljavax/el/ExpressionFactory;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/jsf/OwbApplication", "wrappedApplication", "Ljavax/faces/application/Application;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/Application", "getExpressionFactory", "()Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/jsf/OwbApplication", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/config/WebBeansContext", "getInstance", "()Lorg/apache/webbeans/config/WebBeansContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/config/WebBeansContext", "getBeanManagerImpl", "()Lorg/apache/webbeans/container/BeanManagerImpl;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/jsf/OwbApplication", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/container/BeanManagerImpl", "wrapExpressionFactory", "(Ljavax/el/ExpressionFactory;)Ljavax/el/ExpressionFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/jsf/OwbApplication", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/jsf/OwbApplication", "expressionFactory", "Ljavax/el/ExpressionFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljavax/faces/application/Application;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/jsf/OwbApplication", "wrappedApplication", "Ljavax/faces/application/Application;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getWrapped", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/jsf/OwbApplication", "getWrapped", "()Ljavax/faces/application/Application;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
