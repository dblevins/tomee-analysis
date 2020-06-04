package asm.org.apache.cxf.jaxrs.spring;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/spring/NamespaceHandler", null, "org/springframework/beans/factory/xml/NamespaceHandlerSupport", null);

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
methodVisitor.visitLdcInsn("server");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("schemaLocation");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/configuration/spring/StringBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/configuration/spring/StringBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/configuration/spring/MappingBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://cxf.apache.org/jaxrs");
methodVisitor.visitLdcInsn("http://cxf.apache.org/jaxrs-client");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/configuration/spring/MappingBeanDefinitionParser", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("client");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
