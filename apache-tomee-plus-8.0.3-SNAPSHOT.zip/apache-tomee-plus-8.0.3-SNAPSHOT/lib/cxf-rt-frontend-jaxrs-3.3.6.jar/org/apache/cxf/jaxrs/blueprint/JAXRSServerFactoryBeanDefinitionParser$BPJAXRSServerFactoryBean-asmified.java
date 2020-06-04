package asm.org.apache.cxf.jaxrs.blueprint;
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
public class JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", null, "org/apache/cxf/jaxrs/JAXRSServerFactoryBean", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/common/injection/NoJSR250Annotations;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser", "BPJAXRSServerFactoryBean", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "server", "Lorg/apache/cxf/endpoint/Server;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/JAXRSServerFactoryBean", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/jaxrs/JAXRSServiceFactoryBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/JAXRSServerFactoryBean", "<init>", "(Lorg/apache/cxf/jaxrs/JAXRSServiceFactoryBean;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getServer", "()Lorg/apache/cxf/endpoint/Server;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "server", "Lorg/apache/cxf/endpoint/Server;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "create", "()Lorg/apache/cxf/endpoint/Server;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "()Lorg/apache/cxf/endpoint/Server;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "server", "Lorg/apache/cxf/endpoint/Server;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/JAXRSServerFactoryBean", "create", "()Lorg/apache/cxf/endpoint/Server;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "server", "Lorg/apache/cxf/endpoint/Server;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "server", "Lorg/apache/cxf/endpoint/Server;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "server", "Lorg/apache/cxf/endpoint/Server;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "server", "Lorg/apache/cxf/endpoint/Server;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Server", "destroy", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/blueprint/JAXRSServerFactoryBeanDefinitionParser$BPJAXRSServerFactoryBean", "server", "Lorg/apache/cxf/endpoint/Server;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
