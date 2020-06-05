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
public class Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternalDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", null, "org/apache/cxf/binding/soap/interceptor/AbstractSoapInterceptor", null);

classWriter.visitInnerClass("org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor", "Soap12FaultOutInterceptorInternal", ACC_STATIC);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("marshal");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/interceptor/AbstractSoapInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/binding/soap/SoapMessage;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor", "access$000", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Content-Type");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "info", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/stream/XMLStreamWriter;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "getContent", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLStreamWriter");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Exception;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "getContent", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/message/Message", "RESPONSE_CODE", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getStatusCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "put", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "getVersion", "()Lorg/apache/cxf/binding/soap/SoapVersion;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/SoapFault", "createFault", "(Lorg/apache/cxf/interceptor/Fault;Lorg/apache/cxf/binding/soap/SoapVersion;)Lorg/apache/cxf/binding/soap/SoapFault;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getNamespaces", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "org/apache/cxf/binding/soap/SoapMessage", "javax/xml/stream/XMLStreamWriter", "org/apache/cxf/interceptor/Fault", "org/apache/cxf/binding/soap/SoapFault", "java/util/Map", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "getVersion", "()Lorg/apache/cxf/binding/soap/SoapVersion;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/SoapVersion", "getNamespace", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/StaxUtils", "getUniquePrefix", "(Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Fault");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeNamespace", "(Ljava/lang/String;Ljava/lang/String;)V", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Fault");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Code");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Value");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getFaultCode", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "getFaultCodePrefix", "(Ljavax/xml/stream/XMLStreamWriter;Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getCodeString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getSubCodes", "()Ljava/util/List;", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getSubCodes", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/namespace/QName");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Subcode");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Value");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "getFaultCodePrefix", "(Ljavax/xml/stream/XMLStreamWriter;Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "getCodeString", "(Ljava/lang/String;Ljava/lang/String;Ljavax/xml/namespace/QName;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIincInsn(8, -1);
methodVisitor.visitJumpInsn(IFLE, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Reason");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Text");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getLang", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "getLangCode", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("xml");
methodVisitor.visitLdcInsn("http://www.w3.org/XML/1998/namespace");
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "getFaultMessage", "(Lorg/apache/cxf/binding/soap/SoapMessage;Lorg/apache/cxf/binding/soap/SoapFault;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getRole", "()Ljava/lang/String;", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Role");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getRole", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "prepareStackTrace", "(Lorg/apache/cxf/binding/soap/SoapMessage;Lorg/apache/cxf/binding/soap/SoapFault;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "hasDetails", "()Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapFault", "getDetail", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("Detail");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getFirstChild", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
Label label13 = new Label();
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/w3c/dom/Element", "org/w3c/dom/Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/StaxUtils", "writeNode", "(Lorg/w3c/dom/Node;Ljavax/xml/stream/XMLStreamWriter;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Node", "getNextSibling", "()Lorg/w3c/dom/Node;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitLabel(label1);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "org/apache/cxf/binding/soap/SoapMessage", "javax/xml/stream/XMLStreamWriter", "org/apache/cxf/interceptor/Fault", "org/apache/cxf/binding/soap/SoapFault"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor", "access$000", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("XML_WRITE_EXC");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getLangCode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor", "access$000", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "getResourceBundle", "()Ljava/util/ResourceBundle;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ResourceBundle", "getLocale", "()Ljava/util/Locale;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Locale", "getLanguage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("en");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getCodeString", "(Ljava/lang/String;Ljava/lang/String;Ljavax/xml/namespace/QName;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getPrefix", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/binding/soap/SoapMessage");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "handleMessage", "(Lorg/apache/cxf/binding/soap/SoapMessage;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal", "INSTANCE", "Lorg/apache/cxf/binding/soap/interceptor/Soap12FaultOutInterceptor$Soap12FaultOutInterceptorInternal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}