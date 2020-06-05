package asm.org.opensaml.soap.client.http;
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
public class AbstractPipelineHttpSOAPClientDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "<OutboundMessageType:Ljava/lang/Object;InboundMessageType:Ljava/lang/Object;>Lnet/shibboleth/utilities/java/support/component/AbstractInitializableComponent;Lorg/opensaml/soap/client/SOAPClient;", "net/shibboleth/utilities/java/support/component/AbstractInitializableComponent", new String[] { "org/opensaml/soap/client/SOAPClient" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/annotation/concurrent/ThreadSafe;", false);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "httpClient", "Lorg/apache/http/client/HttpClient;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "httpClientSecurityParameters", "Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tlsCriteriaSetStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/InOutOperationContext<**>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/AbstractInitializableComponent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInitialize", "()V", null, new String[] { "net/shibboleth/utilities/java/support/component/ComponentInitializationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/AbstractInitializableComponent", "doInitialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "httpClient", "Lorg/apache/http/client/HttpClient;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HttpClient cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doDestroy", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "httpClient", "Lorg/apache/http/client/HttpClient;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "httpClientSecurityParameters", "Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "tlsCriteriaSetStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/AbstractInitializableComponent", "doDestroy", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHttpClient", "()Lorg/apache/http/client/HttpClient;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "httpClient", "Lorg/apache/http/client/HttpClient;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHttpClient", "(Lorg/apache/http/client/HttpClient;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("HttpClient cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/http/client/HttpClient");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "httpClient", "Lorg/apache/http/client/HttpClient;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHttpClientSecurityParameters", "()Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "httpClientSecurityParameters", "Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHttpClientSecurityParameters", "(Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "httpClientSecurityParameters", "Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTLSCriteriaSetStrategy", "()Lcom/google/common/base/Function;", "()Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/InOutOperationContext<**>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "tlsCriteriaSetStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTLSCriteriaSetStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/InOutOperationContext<**>;Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifDestroyedThrowDestroyedComponentException", "(Lnet/shibboleth/utilities/java/support/component/DestructableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "tlsCriteriaSetStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "send", "(Ljava/lang/String;Lorg/opensaml/messaging/context/InOutOperationContext;)V", null, new String[] { "org/opensaml/soap/common/SOAPException", "org/opensaml/security/SecurityException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/soap/common/SOAP11FaultDecodingException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "javax/net/ssl/SSLException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label5, "org/opensaml/messaging/encoder/MessageEncodingException");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label6, "org/opensaml/messaging/decoder/MessageDecodingException");
Label label7 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label7, "org/opensaml/messaging/handler/MessageHandlerException");
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label8, "org/apache/http/client/ClientProtocolException");
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label9, "java/io/IOException");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label10, null);
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label2, label11, label10, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Endpoint cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Operation context cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "resolvePipeline", "(Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getOutboundPayloadMessageHandler", "()Lorg/opensaml/messaging/handler/MessageHandler;", true);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getOutboundPayloadMessageHandler", "()Lorg/opensaml/messaging/handler/MessageHandler;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/handler/MessageHandler", "invoke", "(Lorg/opensaml/messaging/context/MessageContext;)V", true);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "buildHttpRequest", "(Ljava/lang/String;Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/apache/http/client/methods/HttpUriRequest;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "buildHttpContext", "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/apache/http/client/protocol/HttpClientContext;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getEncoder", "()Lorg/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder", "setHttpRequest", "(Lorg/apache/http/HttpRequest;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder", "setMessageContext", "(Lorg/opensaml/messaging/context/MessageContext;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder", "initialize", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder", "prepareContext", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getOutboundTransportMessageHandler", "()Lorg/opensaml/messaging/handler/MessageHandler;", true);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label13);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getOutboundTransportMessageHandler", "()Lorg/opensaml/messaging/handler/MessageHandler;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/handler/MessageHandler", "invoke", "(Lorg/opensaml/messaging/context/MessageContext;)V", true);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/http/client/methods/HttpUriRequest", "org/apache/http/client/protocol/HttpClientContext", "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder", "encode", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "getHttpClient", "()Lorg/apache/http/client/HttpClient;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/client/HttpClient", "execute", "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/client/methods/HttpUriRequest", "getURI", "()Ljava/net/URI;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getScheme", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/httpclient/HttpClientSecuritySupport", "checkTLSCredentialEvaluated", "(Lorg/apache/http/client/protocol/HttpClientContext;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getDecoder", "()Lorg/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder", "setHttpResponse", "(Lorg/apache/http/HttpResponse;)V", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder", "initialize", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder", "decode", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder", "getMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "setInboundMessageContext", "(Lorg/opensaml/messaging/context/MessageContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getInboundMessageHandler", "()Lorg/opensaml/messaging/handler/MessageHandler;", true);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getInboundMessageHandler", "()Lorg/opensaml/messaging/handler/MessageHandler;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getInboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/handler/MessageHandler", "invoke", "(Lorg/opensaml/messaging/context/MessageContext;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getEncoder", "()Lorg/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder", "destroy", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getDecoder", "()Lorg/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder", "destroy", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label14);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/soap/common/SOAP11FaultDecodingException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPFaultException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/common/SOAP11FaultDecodingException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPFaultException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/common/SOAP11FaultDecodingException", "getFault", "()Lorg/opensaml/soap/soap11/Fault;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/SOAPFaultException", "setFault", "(Lorg/opensaml/soap/soap11/Fault;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/net/ssl/SSLException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/SecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Problem establising TLS connection to: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/SecurityException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"net/shibboleth/utilities/java/support/component/ComponentInitializationException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/common/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Problem initializing a SOAP client component");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/common/SOAPException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/messaging/encoder/MessageEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/common/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Problem encoding SOAP request message to: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/common/SOAPException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/messaging/decoder/MessageDecodingException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/common/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Problem decoding SOAP response message from: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/common/SOAPException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/messaging/handler/MessageHandlerException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/common/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Problem handling SOAP message exchange with: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/common/SOAPException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/http/client/ClientProtocolException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/common/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Client protocol problem sending SOAP request message to: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/common/SOAPException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/common/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("I/O problem with SOAP message exchange with: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/common/SOAPException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label15);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getEncoder", "()Lorg/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/encoder/httpclient/HttpClientRequestMessageEncoder", "destroy", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", "getDecoder", "()Lorg/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/messaging/decoder/httpclient/HttpClientResponseMessageDecoder", "destroy", "()V", true);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 10, new Object[] {"org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "java/lang/String", "org/opensaml/messaging/context/InOutOperationContext", "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline", Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "java/lang/String", "org/opensaml/messaging/context/InOutOperationContext", "org/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resolvePipeline", "(Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline;", "(Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline<TInboundMessageType;TOutboundMessageType;>;", new String[] { "org/opensaml/soap/common/SOAPException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/soap/common/SOAPException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "newPipeline", "()Lorg/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/soap/common/SOAPException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Problem resolving pipeline instance");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Problem resolving pipeline instance");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "warn", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/common/SOAPException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Could not resolve pipeline");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/common/SOAPException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "newPipeline", "()Lorg/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline;", "()Lorg/opensaml/messaging/pipeline/httpclient/HttpClientMessagePipeline<TInboundMessageType;TOutboundMessageType;>;", new String[] { "org/opensaml/soap/common/SOAPException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_DEPRECATED, "checkTLSCredentialTrusted", "(Lorg/apache/http/client/protocol/HttpClientContext;Lorg/apache/http/client/methods/HttpUriRequest;)V", null, new String[] { "javax/net/ssl/SSLPeerUnverifiedException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/client/methods/HttpUriRequest", "getURI", "()Ljava/net/URI;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getScheme", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/httpclient/HttpClientSecuritySupport", "checkTLSCredentialEvaluated", "(Lorg/apache/http/client/protocol/HttpClientContext;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildHttpRequest", "(Ljava/lang/String;Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/apache/http/client/methods/HttpUriRequest;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/http/client/methods/HttpPost");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/client/methods/HttpPost", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildHttpContext", "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/apache/http/client/protocol/HttpClientContext;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "resolveClientContext", "(Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/apache/http/client/protocol/HttpClientContext;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "resolveContextSecurityParameters", "(Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/httpclient/HttpClientSecuritySupport", "marshalSecurityParameters", "(Lorg/apache/http/client/protocol/HttpClientContext;Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "getHttpClientSecurityParameters", "()Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/httpclient/HttpClientSecuritySupport", "marshalSecurityParameters", "(Lorg/apache/http/client/protocol/HttpClientContext;Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;Z)V", false);
methodVisitor.visitLdcInsn("https");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/client/methods/HttpUriRequest", "getURI", "()Ljava/net/URI;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getScheme", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("opensaml.TrustEngine");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/client/protocol/HttpClientContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("opensaml.CriteriaSet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/client/protocol/HttpClientContext", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("opensaml.CriteriaSet");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "buildTLSCriteriaSet", "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/opensaml/messaging/context/InOutOperationContext;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/client/protocol/HttpClientContext", "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/http/client/protocol/HttpClientContext", "org/opensaml/security/httpclient/HttpClientSecurityParameters"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/security/httpclient/HttpClientSecuritySupport", "addDefaultTLSTrustEngineCriteria", "(Lorg/apache/http/client/protocol/HttpClientContext;Lorg/apache/http/client/methods/HttpUriRequest;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resolveContextSecurityParameters", "(Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/messaging/HttpClientSecurityContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/security/messaging/HttpClientSecurityContext");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/security/messaging/HttpClientSecurityContext", "getSecurityParameters", "()Lorg/opensaml/security/httpclient/HttpClientSecurityParameters;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/security/messaging/HttpClientSecurityContext"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "resolveClientContext", "(Lorg/opensaml/messaging/context/InOutOperationContext;)Lorg/apache/http/client/protocol/HttpClientContext;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/messaging/context/httpclient/HttpClientRequestContext;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/messaging/context/httpclient/HttpClientRequestContext");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/httpclient/HttpClientRequestContext", "getHttpClientContext", "()Lorg/apache/http/client/protocol/HttpClientContext;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/httpclient/HttpClientRequestContext", "getHttpClientContext", "()Lorg/apache/http/client/protocol/HttpClientContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/opensaml/messaging/context/httpclient/HttpClientRequestContext"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/http/client/protocol/HttpClientContext", "create", "()Lorg/apache/http/client/protocol/HttpClientContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildTLSCriteriaSet", "(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/opensaml/messaging/context/InOutOperationContext;)Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "getTLSCriteriaSetStrategy", "()Lcom/google/common/base/Function;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/AbstractPipelineHttpSOAPClient", "getTLSCriteriaSetStrategy", "()Lcom/google/common/base/Function;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"net/shibboleth/utilities/java/support/resolver/CriteriaSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/security/credential/UsageType;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "contains", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/security/criteria/UsageCriterion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/security/credential/UsageType", "SIGNING", "Lorg/opensaml/security/credential/UsageType;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/security/criteria/UsageCriterion", "<init>", "(Lorg/opensaml/security/credential/UsageType;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "net/shibboleth/utilities/java/support/resolver/CriteriaSet", "add", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
