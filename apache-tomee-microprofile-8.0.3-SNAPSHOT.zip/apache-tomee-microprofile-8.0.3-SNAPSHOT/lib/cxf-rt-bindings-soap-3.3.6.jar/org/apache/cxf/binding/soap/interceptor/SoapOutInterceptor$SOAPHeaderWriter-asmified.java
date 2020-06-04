package asm.org.apache.cxf.binding.soap.interceptor;
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
public class SoapOutInterceptor$SOAPHeaderWriterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", null, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", null);

classWriter.visitInnerClass("org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor", "SOAPHeaderWriter", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "soapHeader", "Lorg/apache/cxf/binding/soap/SoapHeader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "soapPrefix", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "firstDone", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/stream/XMLStreamWriter;Lorg/apache/cxf/binding/soap/SoapHeader;Lorg/apache/cxf/binding/soap/SoapVersion;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "<init>", "(Ljavax/xml/stream/XMLStreamWriter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapHeader", "Lorg/apache/cxf/binding/soap/SoapHeader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapPrefix", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getNamespace", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getAttrNameMustUnderstand", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getAttrNameRole", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getNamespace", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getAttrNameMustUnderstand", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getAttrNameRole", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "writeSoapAttributes", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "firstDone", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "firstDone", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapHeader", "Lorg/apache/cxf/binding/soap/SoapHeader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapHeader", "getActor", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapPrefix", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getNamespace", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getAttrNameRole", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapHeader", "Lorg/apache/cxf/binding/soap/SoapHeader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapHeader", "getActor", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapHeader", "Lorg/apache/cxf/binding/soap/SoapHeader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapHeader", "isMustUnderstand", "()Z", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getAttrValueMustUnderstand", "(Z)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapPrefix", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getNamespace", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "soapVersion", "Lorg/apache/cxf/binding/soap/SoapVersion;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getAttrNameMustUnderstand", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "writeSoapAttributes", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "writeSoapAttributes", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeStartElement", "(Ljava/lang/String;)V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DelegatingXMLStreamWriter", "writeStartElement", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/interceptor/SoapOutInterceptor$SOAPHeaderWriter", "writeSoapAttributes", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
