package asm.org.apache.cxf.jaxrs.interceptor;
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
public class JAXRSDefaultFaultOutInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", null, "org/apache/cxf/interceptor/AbstractOutDatabindingInterceptor", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BUNDLE", "Ljava/util/ResourceBundle;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("marshal");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/AbstractOutDatabindingInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/AbstractOutDatabindingInterceptor", "<init>", "(Ljava/lang/String;)V", false);
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
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitLdcInsn("second.jaxrs.exception");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/PropertyUtils", "isTrue", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Exception;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getContent", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/JAXRSUtils", "convertFaultToResponse", "(Ljava/lang/Throwable;Lorg/apache/cxf/message/Message;)Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/JAXRSUtils", "setMessageContentType", "(Lorg/apache/cxf/message/Message;Ljakarta/ws/rs/core/Response;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/message/MessageContentsList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/message/MessageContentsList", "<init>", "([Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "setContent", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getOutMessage", "()Lorg/apache/cxf/message/Message;", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getOutFaultMessage", "()Lorg/apache/cxf/message/Message;", true);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getOutFaultMessage", "()Lorg/apache/cxf/message/Message;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "setOutMessage", "(Lorg/apache/cxf/message/Message;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/cxf/interceptor/Fault", "jakarta/ws/rs/core/Response"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/interceptor/JAXRSOutInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/interceptor/JAXRSOutInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/interceptor/JAXRSOutInterceptor", "handleMessage", "(Lorg/apache/cxf/message/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/provider/ServerProviderFactory", "releaseRequestState", "(Lorg/apache/cxf/message/Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", "mustPropogateException", "(Lorg/apache/cxf/message/Message;)Z", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/StaxOutInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/StaxOutInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/StaxOutInterceptor", "handleMessage", "(Lorg/apache/cxf/message/Message;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/message/Message", "RESPONSE_CODE", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getStatusCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/helpers/NSStack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/helpers/NSStack", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/helpers/NSStack", "push", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/stream/XMLStreamWriter;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getContent", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLStreamWriter");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("http://cxf.apache.org/bindings/xformat");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/helpers/NSStack", "add", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("http://cxf.apache.org/bindings/xformat");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/helpers/NSStack", "getPrefix", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("XMLFault");
methodVisitor.visitLdcInsn("http://cxf.apache.org/bindings/xformat");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/StaxUtils", "writeStartElement", "(Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("faultstring");
methodVisitor.visitLdcInsn("http://cxf.apache.org/bindings/xformat");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/StaxUtils", "writeStartElement", "(Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getMessage", "()Ljava/lang/String;", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", "org/apache/cxf/message/Message", "org/apache/cxf/interceptor/Fault", "jakarta/ws/rs/core/Response", "org/apache/cxf/helpers/NSStack", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/Throwable"}, 1, new Object[] {"javax/xml/stream/XMLStreamWriter"});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", "org/apache/cxf/message/Message", "org/apache/cxf/interceptor/Fault", "jakarta/ws/rs/core/Response", "org/apache/cxf/helpers/NSStack", "javax/xml/stream/XMLStreamWriter", "java/lang/String", "java/lang/Throwable"}, 2, new Object[] {"javax/xml/stream/XMLStreamWriter", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getDetail", "()Lorg/w3c/dom/Element;", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("detail");
methodVisitor.visitLdcInsn("http://cxf.apache.org/bindings/xformat");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/StaxUtils", "writeStartElement", "(Ljavax/xml/stream/XMLStreamWriter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/interceptor/Fault", "getDetail", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/DOMUtils", "getChild", "(Lorg/w3c/dom/Node;I)Lorg/w3c/dom/Node;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/StaxUtils", "writeNode", "(Lorg/w3c/dom/Node;Ljavax/xml/stream/XMLStreamWriter;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamWriter", "flush", "()V", true);
methodVisitor.visitLabel(label1);
Label label10 = new Label();
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", "org/apache/cxf/message/Message", "org/apache/cxf/interceptor/Fault", "jakarta/ws/rs/core/Response", "org/apache/cxf/helpers/NSStack", "javax/xml/stream/XMLStreamWriter"}, 1, new Object[] {"javax/xml/stream/XMLStreamException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XML_WRITE_EXC");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", "BUNDLE", "Ljava/util/ResourceBundle;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/ResourceBundle;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/interceptor/Fault", "<init>", "(Lorg/apache/cxf/common/i18n/Message;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleFault", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", "mustPropogateException", "(Lorg/apache/cxf/message/Message;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Exception;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getContent", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/interceptor/Fault");
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "mustPropogateException", "(Lorg/apache/cxf/message/Message;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "TRUE", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/message/Message", "PROPOGATE_EXCEPTION", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/i18n/BundleUtils", "getBundle", "(Ljava/lang/Class;)Ljava/util/ResourceBundle;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/interceptor/JAXRSDefaultFaultOutInterceptor", "BUNDLE", "Ljava/util/ResourceBundle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
