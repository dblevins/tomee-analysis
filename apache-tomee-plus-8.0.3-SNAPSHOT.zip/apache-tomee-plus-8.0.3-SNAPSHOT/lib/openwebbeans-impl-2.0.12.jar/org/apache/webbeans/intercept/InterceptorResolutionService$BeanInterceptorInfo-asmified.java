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
public class InterceptorResolutionService$BeanInterceptorInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo", "org/apache/webbeans/intercept/InterceptorResolutionService", "BusinessMethodInterceptorInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo", "org/apache/webbeans/intercept/InterceptorResolutionService", "LifecycleMethodInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "org/apache/webbeans/intercept/InterceptorResolutionService", "BeanInterceptorInfo", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ejbInterceptors", "Ljava/util/LinkedHashSet;", "Ljava/util/LinkedHashSet<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "cdiInterceptors", "Ljava/util/List;", "Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "constructorCdiInterceptors", "Ljava/util/List;", "Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "selfInterceptorBean", "Lorg/apache/webbeans/component/SelfInterceptorBean;", "Lorg/apache/webbeans/component/SelfInterceptorBean<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "decorators", "Ljava/util/List;", "Ljava/util/List<Ljavax/enterprise/inject/spi/Decorator<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "businessMethodsInfo", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/reflect/Method;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "constructorInterceptorInfos", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/reflect/Constructor<*>;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nonInterceptedMethods", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/reflect/Method;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lifecycleMethodInterceptorInfos", "Ljava/util/Map;", "Ljava/util/Map<Ljavax/enterprise/inject/spi/InterceptionType;Lorg/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;Ljava/util/LinkedHashSet;Ljava/util/List;Ljava/util/List;Lorg/apache/webbeans/component/SelfInterceptorBean;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V", "(Ljava/util/List<Ljavax/enterprise/inject/spi/Decorator<*>;>;Ljava/util/LinkedHashSet<Ljavax/enterprise/inject/spi/Interceptor<*>;>;Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;Lorg/apache/webbeans/component/SelfInterceptorBean<*>;Ljava/util/Map<Ljava/lang/reflect/Constructor<*>;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;>;Ljava/util/Map<Ljava/lang/reflect/Method;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;>;Ljava/util/List<Ljava/lang/reflect/Method;>;Ljava/util/Map<Ljavax/enterprise/inject/spi/InterceptionType;Lorg/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "decorators", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "ejbInterceptors", "Ljava/util/LinkedHashSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "cdiInterceptors", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "constructorCdiInterceptors", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "selfInterceptorBean", "Lorg/apache/webbeans/component/SelfInterceptorBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "businessMethodsInfo", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "constructorInterceptorInfos", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "nonInterceptedMethods", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "lifecycleMethodInterceptorInfos", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDecorators", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/enterprise/inject/spi/Decorator<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "decorators", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEjbInterceptors", "()Ljava/util/LinkedHashSet;", "()Ljava/util/LinkedHashSet<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "ejbInterceptors", "Ljava/util/LinkedHashSet;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCdiInterceptors", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "cdiInterceptors", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstructorCdiInterceptors", "()Ljava/util/List;", "()Ljava/util/List<Ljavax/enterprise/inject/spi/Interceptor<*>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "constructorCdiInterceptors", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSelfInterceptorBean", "()Lorg/apache/webbeans/component/SelfInterceptorBean;", "()Lorg/apache/webbeans/component/SelfInterceptorBean<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "selfInterceptorBean", "Lorg/apache/webbeans/component/SelfInterceptorBean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBusinessMethodsInfo", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/reflect/Method;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "businessMethodsInfo", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstructorInterceptorInfos", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/reflect/Constructor<*>;Lorg/apache/webbeans/intercept/InterceptorResolutionService$BusinessMethodInterceptorInfo;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "constructorInterceptorInfos", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNonInterceptedMethods", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/reflect/Method;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "nonInterceptedMethods", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLifecycleMethodInterceptorInfos", "()Ljava/util/Map;", "()Ljava/util/Map<Ljavax/enterprise/inject/spi/InterceptionType;Lorg/apache/webbeans/intercept/InterceptorResolutionService$LifecycleMethodInfo;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/intercept/InterceptorResolutionService$BeanInterceptorInfo", "lifecycleMethodInterceptorInfos", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
