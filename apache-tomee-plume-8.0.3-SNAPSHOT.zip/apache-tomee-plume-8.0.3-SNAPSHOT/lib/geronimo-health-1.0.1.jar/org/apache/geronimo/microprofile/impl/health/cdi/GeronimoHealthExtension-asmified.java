package asm.org.apache.geronimo.microprofile.impl.health.cdi;
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
public class GeronimoHealthExtensionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", null, "java/lang/Object", new String[] { "javax/enterprise/inject/spi/Extension", "org/apache/geronimo/microprofile/common/registry/HealthChecksRegistry" });

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "beans", "Ljava/util/Collection;", "Ljava/util/Collection<Ljavax/enterprise/inject/spi/Bean<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "contexts", "Ljava/util/Collection;", "Ljava/util/Collection<Ljavax/enterprise/context/spi/CreationalContext<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "checks", "Ljava/util/List;", "Ljava/util/List<Lorg/eclipse/microprofile/health/HealthCheck;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "beans", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "contexts", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "findChecks", "(Ljavax/enterprise/inject/spi/ProcessBean;)V", "(Ljavax/enterprise/inject/spi/ProcessBean<*>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/health/Health;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getBean", "()Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getTypes", "()Ljava/util/Set;", true);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/health/HealthCheck;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "beans", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getBean", "()Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "start", "(Ljavax/enterprise/inject/spi/AfterDeploymentValidation;Ljavax/enterprise/inject/spi/BeanManager;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "beans", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "stream", "()Ljava/util/stream/Stream;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension;Ljavax/enterprise/inject/spi/BeanManager;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "lambda$start$0", "(Ljavax/enterprise/inject/spi/BeanManager;Ljavax/enterprise/inject/spi/Bean;)Lorg/eclipse/microprofile/health/HealthCheck;", false), Type.getType("(Ljavax/enterprise/inject/spi/Bean;)Lorg/eclipse/microprofile/health/HealthCheck;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "map", "(Ljava/util/function/Function;)Ljava/util/stream/Stream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/stream/Collectors", "toList", "()Ljava/util/stream/Collector;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/stream/Stream", "collect", "(Ljava/util/stream/Collector;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "checks", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "stop", "(Ljavax/enterprise/inject/spi/BeforeShutdown;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalStateException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Something went wrong releasing health checks");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "contexts", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInvokeDynamicInsn("accept", "(Ljava/lang/IllegalStateException;)Ljava/util/function/Consumer;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)V"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "lambda$stop$1", "(Ljava/lang/IllegalStateException;Ljavax/enterprise/context/spi/CreationalContext;)V", false), Type.getType("(Ljavax/enterprise/context/spi/CreationalContext;)V")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "forEach", "(Ljava/util/function/Consumer;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/IllegalStateException", "getSuppressed", "()[Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/RuntimeException;"));
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/RuntimeException");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/IllegalStateException", "[Ljava/lang/Throwable;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChecks", "()Ljava/util/List;", "()Ljava/util/List<Lorg/eclipse/microprofile/health/HealthCheck;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "checks", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "lookup", "(Ljavax/enterprise/inject/spi/Bean;Ljavax/enterprise/inject/spi/BeanManager;)Lorg/eclipse/microprofile/health/HealthCheck;", "(Ljavax/enterprise/inject/spi/Bean<*>;Ljavax/enterprise/inject/spi/BeanManager;)Lorg/eclipse/microprofile/health/HealthCheck;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getBeanClass", "()Ljava/lang/Class;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/health/HealthCheck;"));
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getBeanClass", "()Ljava/lang/Class;", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Class"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getQualifiers", "()Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getQualifiers", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/annotation/Annotation;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getScope", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "isNormalScope", "(Ljava/lang/Class;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "contexts", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "javax/enterprise/inject/spi/Bean", "javax/enterprise/inject/spi/BeanManager", "java/lang/Class", "java/util/Set", "javax/enterprise/inject/spi/Bean", "javax/enterprise/context/spi/CreationalContext"}, 0, new Object[] {});
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/health/HealthCheck;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/health/HealthCheck;"));
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/health/HealthCheck");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getChecks", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "getChecks", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$stop$1", "(Ljava/lang/IllegalStateException;Ljavax/enterprise/context/spi/CreationalContext;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/RuntimeException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/context/spi/CreationalContext", "release", "()V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/RuntimeException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/IllegalStateException", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$start$0", "(Ljavax/enterprise/inject/spi/BeanManager;Ljavax/enterprise/inject/spi/Bean;)Lorg/eclipse/microprofile/health/HealthCheck;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/microprofile/impl/health/cdi/GeronimoHealthExtension", "lookup", "(Ljavax/enterprise/inject/spi/Bean;Ljavax/enterprise/inject/spi/BeanManager;)Lorg/eclipse/microprofile/health/HealthCheck;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
