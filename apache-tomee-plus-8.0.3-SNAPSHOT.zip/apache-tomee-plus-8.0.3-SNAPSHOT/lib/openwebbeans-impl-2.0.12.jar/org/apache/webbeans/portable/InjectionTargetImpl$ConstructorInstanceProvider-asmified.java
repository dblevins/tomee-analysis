package asm.org.apache.webbeans.portable;
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
public class InjectionTargetImpl$ConstructorInstanceProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/webbeans/portable/InjectionTargetImpl$ConstructorInstanceProvider", "<T:Ljava/lang/Object;>Ljava/lang/Object;Ljavax/inject/Provider<TT;>;", "java/lang/Object", new String[] { "javax/inject/Provider" });

classWriter.visitInnerClass("org/apache/webbeans/portable/InjectionTargetImpl$ConstructorInstanceProvider", "org/apache/webbeans/portable/InjectionTargetImpl", "ConstructorInstanceProvider", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/portable/InjectionTargetImpl$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "context", "Lorg/apache/webbeans/intercept/ConstructorInterceptorInvocationContext;", "Lorg/apache/webbeans/intercept/ConstructorInterceptorInvocationContext<TT;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/portable/InjectionTargetImpl$ConstructorInstanceProvider", "context", "Lorg/apache/webbeans/intercept/ConstructorInterceptorInvocationContext;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/intercept/ConstructorInterceptorInvocationContext", "getNewInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContext", "(Lorg/apache/webbeans/intercept/ConstructorInterceptorInvocationContext;)V", "(Lorg/apache/webbeans/intercept/ConstructorInterceptorInvocationContext<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/portable/InjectionTargetImpl$ConstructorInstanceProvider", "context", "Lorg/apache/webbeans/intercept/ConstructorInterceptorInvocationContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/webbeans/portable/InjectionTargetImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/portable/InjectionTargetImpl$ConstructorInstanceProvider", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
