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
public class JAXRSBeanValidationFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature", "Lorg/apache/cxf/feature/DelegatingFeature<Lorg/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable;>;", "org/apache/cxf/feature/DelegatingFeature", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/annotations/Provider;", true);
annotationVisitor0.visitEnum("value", "Lorg/apache/cxf/annotations/Provider$Type;", "Feature");
annotationVisitor0.visitEnum("scope", "Lorg/apache/cxf/annotations/Provider$Scope;", "Server");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature", "Portable", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/annotations/Provider$Type", "org/apache/cxf/annotations/Provider", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/cxf/annotations/Provider$Scope", "org/apache/cxf/annotations/Provider", "Scope", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/feature/DelegatingFeature", "<init>", "(Lorg/apache/cxf/feature/AbstractPortableFeature;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProvider", "(Lorg/apache/cxf/validation/BeanValidationProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "setProvider", "(Lorg/apache/cxf/validation/BeanValidationProvider;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSupportMultipleValidations", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature", "delegate", "Lorg/apache/cxf/feature/AbstractPortableFeature;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/validation/JAXRSBeanValidationFeature$Portable", "setSupportMultipleValidations", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
