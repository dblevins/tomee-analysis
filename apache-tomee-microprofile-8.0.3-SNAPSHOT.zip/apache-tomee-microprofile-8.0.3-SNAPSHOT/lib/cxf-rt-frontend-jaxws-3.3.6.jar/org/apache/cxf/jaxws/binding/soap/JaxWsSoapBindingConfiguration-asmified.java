package asm.org.apache.cxf.jaxws.binding.soap;
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
public class JaxWsSoapBindingConfigurationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", null, "org/apache/cxf/binding/soap/SoapBindingConfiguration", null);

classWriter.visitInnerClass("javax/jws/soap/SOAPBinding$Style", "javax/jws/soap/SOAPBinding", "Style", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/jws/soap/SOAPBinding$Use", "javax/jws/soap/SOAPBinding", "Use", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(0, "serviceFactory", "Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/SoapBindingConfiguration", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "serviceFactory", "Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJaxWsServiceFactoryBean", "(Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "serviceFactory", "Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyle", "(Lorg/apache/cxf/service/model/OperationInfo;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("operation.method");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/reflect/Method;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "getProperty", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Method");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "serviceFactory", "Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "isRPC", "(Ljava/lang/reflect/Method;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLdcInsn("rpc");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/reflect/Method"}, 0, null);
methodVisitor.visitLdcInsn("document");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "getStyle", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/jws/soap/SOAPBinding;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jws/soap/SOAPBinding");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jws/soap/SOAPBinding", "style", "()Ljavax/jws/soap/SOAPBinding$Style;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/jws/soap/SOAPBinding$Style", "DOCUMENT", "Ljavax/jws/soap/SOAPBinding$Style;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/jws/soap/SOAPBinding$Style", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLdcInsn("document");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/jws/soap/SOAPBinding"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jws/soap/SOAPBinding", "style", "()Ljavax/jws/soap/SOAPBinding$Style;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/jws/soap/SOAPBinding$Style", "RPC", "Ljavax/jws/soap/SOAPBinding$Style;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/jws/soap/SOAPBinding$Style", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("rpc");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/SoapBindingConfiguration", "getStyle", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getServiceClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "getJaxWsServiceFactory", "()Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsServiceFactoryBean", "getJaxWsImplementorInfo", "()Lorg/apache/cxf/jaxws/support/JaxWsImplementorInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/support/JaxWsImplementorInfo", "getEndpointClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getJaxWsServiceFactory", "()Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "serviceFactory", "Lorg/apache/cxf/jaxws/support/JaxWsServiceFactoryBean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUse", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxws/binding/soap/JaxWsSoapBindingConfiguration", "getServiceClass", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/jws/soap/SOAPBinding;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jws/soap/SOAPBinding");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jws/soap/SOAPBinding", "use", "()Ljavax/jws/soap/SOAPBinding$Use;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/jws/soap/SOAPBinding$Use", "LITERAL", "Ljavax/jws/soap/SOAPBinding$Use;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/jws/soap/SOAPBinding$Use", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLdcInsn("literal");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/jws/soap/SOAPBinding"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jws/soap/SOAPBinding", "use", "()Ljavax/jws/soap/SOAPBinding$Use;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/jws/soap/SOAPBinding$Use", "ENCODED", "Ljavax/jws/soap/SOAPBinding$Use;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/jws/soap/SOAPBinding$Use", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("encoded");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/SoapBindingConfiguration", "getUse", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
