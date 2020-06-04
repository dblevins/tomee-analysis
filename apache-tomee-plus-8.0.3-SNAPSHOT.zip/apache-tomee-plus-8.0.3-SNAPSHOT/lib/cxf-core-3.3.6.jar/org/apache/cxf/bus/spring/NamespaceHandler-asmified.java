package asm.org.apache.cxf.bus.spring;
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
public class NamespaceHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/bus/spring/NamespaceHandler", null, "org/springframework/beans/factory/xml/NamespaceHandlerSupport", null);

classWriter.visitInnerClass("org/apache/cxf/bus/spring/NamespaceHandler$1", null, null, 0);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/springframework/beans/factory/xml/NamespaceHandlerSupport", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("bus");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/spring/BusDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/BusDefinitionParser", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("logging");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/configuration/spring/SimpleBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/feature/LoggingFeature;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/configuration/spring/SimpleBeanDefinitionParser", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("fastinfoset");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/configuration/spring/SimpleBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/feature/FastInfosetFeature;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/configuration/spring/SimpleBeanDefinitionParser", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("workqueue");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/bus/spring/NamespaceHandler$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/workqueue/AutomaticWorkQueueImpl;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/bus/spring/NamespaceHandler$1", "<init>", "(Lorg/apache/cxf/bus/spring/NamespaceHandler;Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
