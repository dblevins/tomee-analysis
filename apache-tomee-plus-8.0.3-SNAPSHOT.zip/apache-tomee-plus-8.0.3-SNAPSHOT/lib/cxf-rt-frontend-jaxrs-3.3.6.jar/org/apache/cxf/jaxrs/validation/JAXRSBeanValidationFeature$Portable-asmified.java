package asm.org.apache.cxf.jaxrs.validation;
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
public class JAXRSBeanValidationFeature$PortableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", null, "java/lang/Object", new String[] { "org/apache/cxf/feature/AbstractPortableFeature" });

classWriter.visitInnerClass("org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature", "Portable", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "validationProvider", "Lorg/apache/cxf/validation/BeanValidationProvider;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "supportMultipleValidations", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doInitializeProvider", "(Lorg/apache/cxf/interceptor/InterceptorProvider;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationInInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationInInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationOutInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationOutInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "supportMultipleValidations", "Z");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationOutInterceptor", "setSupportMultipleValidations", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "validationProvider", "Lorg/apache/cxf/validation/BeanValidationProvider;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "validationProvider", "Lorg/apache/cxf/validation/BeanValidationProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/validation/BeanValidationInInterceptor", "setProvider", "(Lorg/apache/cxf/validation/BeanValidationProvider;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "validationProvider", "Lorg/apache/cxf/validation/BeanValidationProvider;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationOutInterceptor", "setProvider", "(Lorg/apache/cxf/validation/BeanValidationProvider;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/validation/BeanValidationInInterceptor", "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationOutInterceptor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/interceptor/InterceptorProvider", "getInInterceptors", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/interceptor/InterceptorProvider", "getOutInterceptors", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProvider", "(Lorg/apache/cxf/validation/BeanValidationProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "validationProvider", "Lorg/apache/cxf/validation/BeanValidationProvider;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSupportMultipleValidations", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "supportMultipleValidations", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
