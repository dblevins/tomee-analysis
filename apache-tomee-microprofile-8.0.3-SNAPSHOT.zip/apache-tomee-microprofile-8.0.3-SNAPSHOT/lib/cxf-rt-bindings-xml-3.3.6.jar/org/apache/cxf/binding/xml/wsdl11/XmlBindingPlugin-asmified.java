package asm.org.apache.cxf.binding.xml.wsdl11;
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
public class XmlBindingPluginDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/binding/xml/wsdl11/XmlBindingPlugin", null, "org/apache/cxf/wsdl/AbstractWSDLPlugin", null);

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
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/xml/wsdl11/XmlBindingPlugin", "registry", "Ljavax/wsdl/extensions/ExtensionRegistry;");
methodVisitor.visitLdcInsn(Type.getType("Ljavax/wsdl/Binding;"));
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/tools/common/ToolConstants", "XML_BINDING_FORMAT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/wsdl/extensions/ExtensionRegistry", "createExtension", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;)Ljavax/wsdl/extensions/ExtensibilityElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
