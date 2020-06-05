package asm.org.apache.cxf.binding.soap.wsdl11;
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
public class SoapAddressPluginDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/binding/soap/wsdl11/SoapAddressPlugin", null, "org/apache/cxf/wsdl/AbstractWSDLPlugin", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CFG_ADDRESS", "Ljava/lang/String;", null, "address");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CFG_SOAP12", "Ljava/lang/String;", null, "soap12");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl/AbstractWSDLPlugin", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createExtension", "(Ljava/util/Map;)Ljavax/wsdl/extensions/ExtensibilityElement;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljavax/wsdl/extensions/ExtensibilityElement;", new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("soap12");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/wsdl11/SoapAddressPlugin", "optionSet", "(Ljava/util/Map;Ljava/lang/String;)Z", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("address");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/wsdl11/SoapAddressPlugin", "getOption", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/wsdl11/SoapAddressPlugin", "createExtension", "(ZLjava/lang/String;)Ljavax/wsdl/extensions/ExtensibilityElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createExtension", "(ZLjava/lang/String;)Ljavax/wsdl/extensions/ExtensibilityElement;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/wsdl11/SoapAddressPlugin", "registry", "Ljavax/wsdl/extensions/ExtensionRegistry;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/SOAPBindingUtil", "createSoapAddress", "(Ljavax/wsdl/extensions/ExtensionRegistry;Z)Lorg/apache/cxf/binding/soap/wsdl/extensions/SoapAddress;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/wsdl/extensions/SoapAddress", "setLocationURI", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
