package asm.org.apache.myfaces.flow.cdi;
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
public class FlowScopeCDIExtensionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/flow/cdi/FlowScopeCDIExtension", null, "java/lang/Object", new String[] { "javax/enterprise/inject/spi/Extension" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "flowScopedContext", "Lorg/apache/myfaces/flow/cdi/FlowScopedContextImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "flowBeanReferences", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Class;Lorg/apache/myfaces/flow/FlowReference;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/cdi/FlowScopeCDIExtension", "flowBeanReferences", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "beforeBeanDiscovery", "(Ljavax/enterprise/inject/spi/BeforeBeanDiscovery;Ljavax/enterprise/inject/spi/BeanManager;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/flow/FlowScoped;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeforeBeanDiscovery", "addScope", "(Ljava/lang/Class;ZZ)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/flow/cdi/FlowScopeBeanHolder;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createAnnotatedType", "(Ljava/lang/Class;)Ljavax/enterprise/inject/spi/AnnotatedType;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AnnotatedType", "getJavaClass", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeforeBeanDiscovery", "addAnnotatedType", "(Ljavax/enterprise/inject/spi/AnnotatedType;Ljava/lang/String;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "onProcessBean", "(Ljavax/enterprise/inject/spi/ProcessBean;Ljavax/enterprise/inject/spi/BeanManager;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/flow/FlowScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "isAnnotationPresent", "(Ljava/lang/Class;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/flow/FlowScoped;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/flow/FlowScoped");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/flow/FlowScoped", "value", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/cdi/FlowScopeCDIExtension", "flowBeanReferences", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/ProcessBean", "getBean", "()Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getBeanClass", "()Ljava/lang/Class;", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/FlowReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/faces/flow/FlowScoped", "definingDocumentId", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/FlowReference", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "afterBeanDiscovery", "(Ljavax/enterprise/inject/spi/AfterBeanDiscovery;Ljavax/enterprise/inject/spi/BeanManager;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/flow/cdi/FlowScopedContextImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/cdi/FlowScopeCDIExtension", "flowBeanReferences", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/flow/cdi/FlowScopedContextImpl", "<init>", "(Ljavax/enterprise/inject/spi/BeanManager;Ljava/util/Map;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/flow/cdi/FlowScopeCDIExtension", "flowScopedContext", "Lorg/apache/myfaces/flow/cdi/FlowScopedContextImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/flow/cdi/FlowScopeCDIExtension", "flowScopedContext", "Lorg/apache/myfaces/flow/cdi/FlowScopedContextImpl;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/AfterBeanDiscovery", "addContext", "(Ljavax/enterprise/context/spi/Context;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "initializeFlowContexts", "(Ljavax/enterprise/inject/spi/AfterDeploymentValidation;Ljavax/enterprise/inject/spi/BeanManager;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/enterprise/event/Observes;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
