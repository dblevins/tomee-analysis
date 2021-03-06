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
public class XmlIoPluginDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/binding/xml/wsdl11/XmlIoPlugin", null, "org/apache/cxf/wsdl/AbstractWSDLPlugin", null);

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
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Class;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/xml/wsdl11/XmlIoPlugin", "getOption", "(Ljava/util/Map;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Class");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/namespace/QName;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/xml/wsdl11/XmlIoPlugin", "getOption", "(Ljava/util/Map;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/namespace/QName");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/xml/wsdl11/XmlIoPlugin", "registry", "Ljavax/wsdl/extensions/ExtensionRegistry;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/tools/common/ToolConstants", "XML_FORMAT", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/wsdl/extensions/ExtensionRegistry", "createExtension", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;)Ljavax/wsdl/extensions/ExtensibilityElement;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/wsdl/JAXBExtensibilityElement");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/wsdl/JAXBExtensibilityElement");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl/JAXBExtensibilityElement", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/bindings/xformat/XMLBindingMessageFormat");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/cxf/binding/xml/wsdl11/XmlIoPlugin", "java/util/Map", "org/apache/cxf/bindings/xformat/XMLBindingMessageFormat", "java/lang/Class", "javax/xml/namespace/QName", "javax/wsdl/extensions/ExtensibilityElement"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/bindings/xformat/XMLBindingMessageFormat");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bindings/xformat/XMLBindingMessageFormat", "setRootNode", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
