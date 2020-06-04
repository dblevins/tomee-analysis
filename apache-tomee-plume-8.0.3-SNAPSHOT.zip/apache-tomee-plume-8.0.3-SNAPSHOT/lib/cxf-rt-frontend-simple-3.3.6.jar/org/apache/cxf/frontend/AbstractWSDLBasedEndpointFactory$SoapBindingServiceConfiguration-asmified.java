package asm.org.apache.cxf.frontend;
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
public class AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfigurationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", null, "org/apache/cxf/wsdl/service/factory/AbstractServiceConfiguration", null);

classWriter.visitInnerClass("org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory", "SoapBindingServiceConfiguration", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl/service/factory/AbstractServiceConfiguration", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStyle", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory", "getBindingConfig", "()Lorg/apache/cxf/binding/BindingConfiguration;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/binding/soap/SoapBindingConfiguration");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory", "getBindingConfig", "()Lorg/apache/cxf/binding/BindingConfiguration;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/binding/soap/SoapBindingConfiguration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapBindingConfiguration", "isSetStyle", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory", "getBindingConfig", "()Lorg/apache/cxf/binding/BindingConfiguration;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/binding/soap/SoapBindingConfiguration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapBindingConfiguration", "getStyle", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWrapped", "()Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory", "getBindingConfig", "()Lorg/apache/cxf/binding/BindingConfiguration;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/binding/soap/SoapBindingConfiguration");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory", "getBindingConfig", "()Lorg/apache/cxf/binding/BindingConfiguration;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/binding/soap/SoapBindingConfiguration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapBindingConfiguration", "isSetStyle", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("rpc");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "this$0", "Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory", "getBindingConfig", "()Lorg/apache/cxf/binding/BindingConfiguration;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/binding/soap/SoapBindingConfiguration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapBindingConfiguration", "getStyle", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory$SoapBindingServiceConfiguration", "<init>", "(Lorg/apache/cxf/frontend/AbstractWSDLBasedEndpointFactory;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
