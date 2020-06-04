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
public class XMLWSDLExtensionLoaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/binding/xml/wsdl11/XMLWSDLExtensionLoader", null, "java/lang/Object", new String[] { "org/apache/cxf/wsdl/WSDLExtensionLoader" });

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/common/injection/NoJSR250Annotations;", true);
annotationVisitor0.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/xml/wsdl11/XMLWSDLExtensionLoader", "setupBus", "(Lorg/apache/cxf/Bus;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setupBus", "(Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/wsdl/WSDLManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/wsdl/WSDLManager");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/xml/wsdl11/XMLWSDLExtensionLoader", "registerExtensors", "(Lorg/apache/cxf/wsdl/WSDLManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "registerExtensors", "(Lorg/apache/cxf/wsdl/WSDLManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/wsdl/BindingInput;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/bindings/xformat/XMLBindingMessageFormat;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/xml/wsdl11/XMLWSDLExtensionLoader", "createExtensor", "(Lorg/apache/cxf/wsdl/WSDLManager;Ljava/lang/Class;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/wsdl/BindingOutput;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/bindings/xformat/XMLBindingMessageFormat;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/xml/wsdl11/XMLWSDLExtensionLoader", "createExtensor", "(Lorg/apache/cxf/wsdl/WSDLManager;Ljava/lang/Class;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/wsdl/Binding;"));
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/bindings/xformat/XMLFormatBinding;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/xml/wsdl11/XMLWSDLExtensionLoader", "createExtensor", "(Lorg/apache/cxf/wsdl/WSDLManager;Ljava/lang/Class;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createExtensor", "(Lorg/apache/cxf/wsdl/WSDLManager;Ljava/lang/Class;Ljava/lang/Class;)V", "(Lorg/apache/cxf/wsdl/WSDLManager;Ljava/lang/Class<*>;Ljava/lang/Class<*>;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/xml/bind/JAXBException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/wsdl/WSDLManager", "getExtensionRegistry", "()Ljakarta/wsdl/extensions/ExtensionRegistry;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/binding/xml/wsdl11/XMLWSDLExtensionLoader;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/wsdl/JAXBExtensionHelper", "addExtensions", "(Ljakarta/wsdl/extensions/ExtensionRegistry;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/xml/bind/JAXBException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
