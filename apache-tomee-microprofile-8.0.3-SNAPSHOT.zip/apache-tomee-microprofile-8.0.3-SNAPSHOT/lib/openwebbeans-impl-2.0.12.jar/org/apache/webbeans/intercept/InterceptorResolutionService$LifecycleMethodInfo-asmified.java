package asm.org.apache.webbeans.intercept;
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
public class InterceptorResolutionService$LifecycleMethodInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo", "org/apache/webbeans/intercept/InterceptorResolutionService", "BusinessMethodInterceptorInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", "org/apache/webbeans/intercept/InterceptorResolutionService", "LifecycleMethodInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "methods", "Ljava/util/List;", "Ljava/util/List<Ljakarta/enterprise/inject/spi/AnnotatedMethod<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "methodInterceptorInfo", "Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;)V", "(Ljava/util/List<Ljakarta/enterprise/inject/spi/AnnotatedMethod<*>;>;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", "methods", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", "methods", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", "methodInterceptorInfo", "Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethods", "()Ljava/util/List;", "()Ljava/util/List<Ljakarta/enterprise/inject/spi/AnnotatedMethod<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", "methods", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMethodInterceptorInfo", "()Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", "methodInterceptorInfo", "Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
