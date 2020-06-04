package asm.org.apache.cxf.wsdl;
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
public class JAXBExtensionHelper$MappingReaderDelegate$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", null, "java/lang/Object", new String[] { "javax/xml/namespace/NamespaceContext" });

classWriter.visitOuterClass("org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "getNamespaceContext", "()Ljavax/xml/namespace/NamespaceContext;");

classWriter.visitInnerClass("org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "org/apache/cxf/wsdl/JAXBExtensionHelper", "MappingReaderDelegate", 0);

classWriter.visitInnerClass("org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ctx", "Ljavax/xml/namespace/NamespaceContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;Ljavax/xml/namespace/NamespaceContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "val$ctx", "Ljavax/xml/namespace/NamespaceContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "val$ctx", "Ljavax/xml/namespace/NamespaceContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getNamespaceURI", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "this$0", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper", "namespace", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "this$0", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper", "jaxbNamespace", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "this$0", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper", "jaxbNamespace", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "val$ctx", "Ljavax/xml/namespace/NamespaceContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "this$0", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper", "namespace", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "val$ctx", "Ljavax/xml/namespace/NamespaceContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefixes", "(Ljava/lang/String;)Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "this$0", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper", "jaxbNamespace", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "val$ctx", "Ljavax/xml/namespace/NamespaceContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "this$1", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate", "this$0", "Lorg/apache/cxf/wsdl/JAXBExtensionHelper;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper", "namespace", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getPrefixes", "(Ljava/lang/String;)Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl/JAXBExtensionHelper$MappingReaderDelegate$1", "val$ctx", "Ljavax/xml/namespace/NamespaceContext;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/namespace/NamespaceContext", "getPrefixes", "(Ljava/lang/String;)Ljava/util/Iterator;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
