package asm.org.apache.cxf.jaxrs.client.validation;
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
public class JAXRSClientBeanValidationFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature", null, "org/apache/cxf/validation/ClientBeanValidationFeature", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/annotations/Provider;", true);
annotationVisitor0.visitEnum("value", "Lorg/apache/cxf/annotations/Provider$Type;", "Feature");
annotationVisitor0.visitEnum("scope", "Lorg/apache/cxf/annotations/Provider$Scope;", "Client");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature$Portable", "org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature", "Portable", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/annotations/Provider$Type", "org/apache/cxf/annotations/Provider", "Type", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/cxf/annotations/Provider$Scope", "org/apache/cxf/annotations/Provider", "Scope", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/cxf/validation/ClientBeanValidationFeature$Portable", "org/apache/cxf/validation/ClientBeanValidationFeature", "Portable", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature$Portable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature$Portable", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/validation/ClientBeanValidationFeature", "<init>", "(Lorg/apache/cxf/validation/ClientBeanValidationFeature$Portable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWrapInProcessingException", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature$Portable;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature", "getDelegate", "()Lorg/apache/cxf/feature/AbstractPortableFeature;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature$Portable");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/client/validation/JAXRSClientBeanValidationFeature$Portable", "setWrapInProcessingException", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
