package asm.org.apache.cxf.transport.http.spring;
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

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/http/spring/NamespaceHandler", null, "org/springframework/beans/factory/xml/NamespaceHandlerSupport", null);

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
methodVisitor.visitLdcInsn("conduit");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/spring/HttpConduitBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/spring/HttpConduitBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("trustDecider");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/spring/MessageTrustDeciderBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/spring/MessageTrustDeciderBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("authSupplier");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/spring/HttpAuthSupplierBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/spring/HttpAuthSupplierBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("destination");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/spring/HttpDestinationBeanDefinitionParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/spring/HttpDestinationBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/spring/NamespaceHandler", "registerBeanDefinitionParser", "(Ljava/lang/String;Lorg/springframework/beans/factory/xml/BeanDefinitionParser;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
