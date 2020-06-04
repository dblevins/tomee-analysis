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
public class ControlledValidationXmlBeanDefinitionReader$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader$1", "Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<Ljava/lang/Integer;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitOuterClass("org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader", "loadBeanDefinitions", "(Lorg/springframework/core/io/support/EncodedResource;)I");

classWriter.visitInnerClass("org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$encodedResource", "Lorg/springframework/core/io/support/EncodedResource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader;Lorg/springframework/core/io/support/EncodedResource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader$1", "this$0", "Lorg/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader$1", "val$encodedResource", "Lorg/springframework/core/io/support/EncodedResource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Integer;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader$1", "this$0", "Lorg/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader$1", "val$encodedResource", "Lorg/springframework/core/io/support/EncodedResource;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader", "access$000", "(Lorg/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader;Lorg/springframework/core/io/support/EncodedResource;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bus/spring/ControlledValidationXmlBeanDefinitionReader$1", "run", "()Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
