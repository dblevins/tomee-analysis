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
public class JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean$1", null, "org/apache/cxf/jaxrs/spring/AbstractSpringComponentScanServer", null);

classWriter.visitOuterClass("org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean", "discoverContextResources", "(Ljava/lang/Class;)V");

classWriter.visitInnerClass("org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean", "org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser", "SpringJAXRSServerFactoryBean", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean$1", "this$0", "Lorg/apache/cxf/jaxrs/spring/JAXRSServerFactoryBeanDefinitionParser$SpringJAXRSServerFactoryBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/spring/AbstractSpringComponentScanServer", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
