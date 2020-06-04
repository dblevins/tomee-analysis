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
public class AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "Lorg/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$ConcurrentMethodHandler;Lorg/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler<Ljakarta/ejb/AccessTimeout;>;", "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$ConcurrentMethodHandler", new String[] { "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler" });

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "org/apache/openejb/config/AnnotationDeployer", "ProcessAnnotatedBeans", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "AccessTimeoutHandler", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$ConcurrentMethodHandler", "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "ConcurrentMethodHandler", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AnnotationHandler", "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans", "AnnotationHandler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/jee/AssemblyDescriptor;Lorg/apache/openejb/jee/SessionBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "<init>", "(Lorg/apache/openejb/jee/AssemblyDescriptor;Lorg/apache/openejb/jee/SessionBean;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/jee/AssemblyDescriptor;Lorg/apache/openejb/jee/SessionBean;Ljava/util/Map;)V", "(Lorg/apache/openejb/jee/AssemblyDescriptor;Lorg/apache/openejb/jee/SessionBean;Ljava/util/Map<Ljava/lang/Object;Lorg/apache/openejb/jee/ContainerConcurrency;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$ConcurrentMethodHandler", "<init>", "(Lorg/apache/openejb/jee/AssemblyDescriptor;Lorg/apache/openejb/jee/SessionBean;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addClassLevelDeclaration", "(Ljakarta/ejb/AccessTimeout;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "getContainerConcurrency", "(Ljava/lang/Class;)Lorg/apache/openejb/jee/ContainerConcurrency;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "toTimeout", "(Ljakarta/ejb/AccessTimeout;)Lorg/apache/openejb/jee/Timeout;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/ContainerConcurrency", "setAccessTimeout", "(Lorg/apache/openejb/jee/Timeout;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addMethodLevelDeclaration", "(Ljakarta/ejb/AccessTimeout;Ljava/lang/reflect/Method;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "getContainerConcurrency", "(Ljava/lang/reflect/Method;)Lorg/apache/openejb/jee/ContainerConcurrency;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "toTimeout", "(Ljakarta/ejb/AccessTimeout;)Lorg/apache/openejb/jee/Timeout;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/ContainerConcurrency", "setAccessTimeout", "(Lorg/apache/openejb/jee/Timeout;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "toTimeout", "(Ljakarta/ejb/AccessTimeout;)Lorg/apache/openejb/jee/Timeout;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/Timeout");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/Timeout", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ejb/AccessTimeout", "value", "()J", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Timeout", "setTimeout", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ejb/AccessTimeout", "unit", "()Ljava/util/concurrent/TimeUnit;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/Timeout", "setUnit", "(Ljava/util/concurrent/TimeUnit;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotationClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<Ljakarta/ejb/AccessTimeout;>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/ejb/AccessTimeout;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getContainerConcurrency", "(Ljava/lang/Class;)Lorg/apache/openejb/jee/ContainerConcurrency;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$ConcurrentMethodHandler", "getContainerConcurrency", "(Ljava/lang/Class;)Lorg/apache/openejb/jee/ContainerConcurrency;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getContainerConcurrency", "(Ljava/lang/reflect/Method;)Lorg/apache/openejb/jee/ContainerConcurrency;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$ConcurrentMethodHandler", "getContainerConcurrency", "(Ljava/lang/reflect/Method;)Lorg/apache/openejb/jee/ContainerConcurrency;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getExistingDeclarations", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$ConcurrentMethodHandler", "getExistingDeclarations", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addMethodLevelDeclaration", "(Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ejb/AccessTimeout");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "addMethodLevelDeclaration", "(Ljakarta/ejb/AccessTimeout;Ljava/lang/reflect/Method;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "addClassLevelDeclaration", "(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/ejb/AccessTimeout");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/AnnotationDeployer$ProcessAnnotatedBeans$AccessTimeoutHandler", "addClassLevelDeclaration", "(Ljakarta/ejb/AccessTimeout;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
