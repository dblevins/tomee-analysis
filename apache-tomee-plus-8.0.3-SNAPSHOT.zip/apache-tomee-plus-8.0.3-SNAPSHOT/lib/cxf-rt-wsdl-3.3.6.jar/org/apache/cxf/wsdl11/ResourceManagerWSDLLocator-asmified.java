package asm.org.apache.cxf.wsdl11;
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
public class ResourceManagerWSDLLocatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", null, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", null);

{
fieldVisitor = classWriter.visitField(0, "bus", "Lorg/apache/cxf/Bus;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljavax/wsdl/xml/WSDLLocator;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "<init>", "(Ljava/lang/String;Ljavax/wsdl/xml/WSDLLocator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/wsdl11/CatalogWSDLLocator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl11/CatalogWSDLLocator", "<init>", "(Ljava/lang/String;Lorg/apache/cxf/Bus;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "<init>", "(Ljava/lang/String;Ljavax/wsdl/xml/WSDLLocator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInputSource", "()Lorg/xml/sax/InputSource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", "wsdlUrl", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", "getInputSource", "(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getPublicId", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", "baseUri", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInputSource", "(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/resource/ResourceManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "getResourceAsStream", "(Ljava/lang/String;)Ljava/io/InputStream;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/InputSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/InputSource", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "setSystemId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "setPublicId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/ResourceManagerWSDLLocator", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/resource/ResourceManager;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/resource/ResourceManager");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/net/URL;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/resource/ResourceManager", "resolveResource", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "setSystemId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "setPublicId", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/io/InputStream", "org/xml/sax/InputSource", "java/net/URL"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
