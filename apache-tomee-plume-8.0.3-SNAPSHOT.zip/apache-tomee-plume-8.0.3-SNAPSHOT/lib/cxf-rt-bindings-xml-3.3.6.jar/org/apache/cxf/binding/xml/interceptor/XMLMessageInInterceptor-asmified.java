package asm.org.apache.cxf.binding.xml.interceptor;
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
public class XMLMessageInInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", null, "org/apache/cxf/interceptor/AbstractInDatabindingInterceptor", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("unmarshal");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/AbstractInDatabindingInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/wsdl/interceptors/DocLiteralInInterceptor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "addBefore", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/stream/XMLStreamException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "isGET", "(Lorg/apache/cxf/message/Message;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("XMLMessageInInterceptor skipped in HTTP GET method");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getEndpoint", "()Lorg/apache/cxf/endpoint/Endpoint;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/stream/XMLStreamReader;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getContent", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLStreamReader");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/endpoint/Endpoint", "javax/xml/stream/XMLStreamReader"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/DepthXMLStreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DepthXMLStreamReader", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/StaxUtils", "toNextElement", "(Lorg/apache/cxf/staxutils/DepthXMLStreamReader;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NO_OPERATION_ELEMENT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Lorg/apache/cxf/common/i18n/Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/staxutils/DepthXMLStreamReader"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DepthXMLStreamReader", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("XMLFault");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getInterceptorChain", "()Lorg/apache/cxf/interceptor/InterceptorChain;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/interceptor/InterceptorChain", "abort", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Endpoint", "getInFaultObserver", "()Lorg/apache/cxf/transport/MessageObserver;", true);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Endpoint", "getInFaultObserver", "()Lorg/apache/cxf/transport/MessageObserver;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/transport/MessageObserver", "onMessage", "(Lorg/apache/cxf/message/Message;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/message/Exchange", "javax/xml/namespace/QName"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getBindingOperationInfo", "()Lorg/apache/cxf/service/model/BindingOperationInfo;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "isRequestor", "(Lorg/apache/cxf/message/Message;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Endpoint", "getEndpointInfo", "()Lorg/apache/cxf/service/model/EndpointInfo;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/EndpointInfo", "getBinding", "()Lorg/apache/cxf/service/model/BindingInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "getBindingOperationInfo", "(ZLjavax/xml/namespace/QName;Lorg/apache/cxf/service/model/BindingInfo;Ljavax/xml/stream/XMLStreamReader;)Lorg/apache/cxf/service/model/BindingOperationInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/service/model/BindingOperationInfo;"));
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "put", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getOperationInfo", "()Lorg/apache/cxf/service/model/OperationInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/OperationInfo", "isOneWay", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "setOneWay", "(Z)V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/service/model/BindingOperationInfo", Opcodes.INTEGER}, 0, null);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getInput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/cxf/service/model/BindingMessageInfo"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "hasRootNode", "(Lorg/apache/cxf/service/model/BindingMessageInfo;Ljavax/xml/namespace/QName;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "nextTag", "()I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "org/apache/cxf/message/Message", "org/apache/cxf/endpoint/Endpoint", "javax/xml/stream/XMLStreamReader", "org/apache/cxf/staxutils/DepthXMLStreamReader", "org/apache/cxf/message/Exchange", "javax/xml/namespace/QName", "org/apache/cxf/service/model/BindingOperationInfo", Opcodes.INTEGER, "org/apache/cxf/service/model/BindingMessageInfo"}, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STAX_READ_EXC");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Lorg/apache/cxf/common/i18n/Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getBindingOperationInfo", "(ZLjavax/xml/namespace/QName;Lorg/apache/cxf/service/model/BindingInfo;Ljavax/xml/stream/XMLStreamReader;)Lorg/apache/cxf/service/model/BindingOperationInfo;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/xml/stream/XMLStreamException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "javax/xml/stream/XMLStreamException");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingInfo", "getOperations", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/BindingOperationInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getInput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/service/model/BindingOperationInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/service/model/BindingMessageInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "hasRootNode", "(Lorg/apache/cxf/service/model/BindingMessageInfo;Ljavax/xml/namespace/QName;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "nextTag", "()I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STAX_READ_EXC");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Lorg/apache/cxf/common/i18n/Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingMessageInfo", "getMessageParts", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label12);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/MessagePartInfo");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getConcreteName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingInfo", "getOperations", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label13 = new Label();
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/BindingOperationInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "nextTag", "()I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", Opcodes.INTEGER, "javax/xml/namespace/QName", "org/apache/cxf/service/model/BindingInfo", "javax/xml/stream/XMLStreamReader", "java/util/Iterator", "org/apache/cxf/service/model/BindingOperationInfo"}, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STAX_READ_EXC");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Lorg/apache/cxf/common/i18n/Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "hasRootNode", "(Lorg/apache/cxf/service/model/BindingMessageInfo;Ljavax/xml/namespace/QName;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/bindings/xformat/XMLBindingMessageFormat;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingMessageInfo", "getExtensor", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/bindings/xformat/XMLBindingMessageFormat");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingMessageInfo", "getMessageParts", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/bindings/xformat/XMLBindingMessageFormat", "getRootNode", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/bindings/xformat/XMLBindingMessageFormat"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/binding/xml/interceptor/XMLMessageInInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}