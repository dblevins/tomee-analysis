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
public class HttpSOAPClientDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/soap/client/http/HttpSOAPClient", null, "net/shibboleth/utilities/java/support/component/AbstractInitializableComponent", new String[] { "org/opensaml/soap/client/SOAPClient" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/annotation/concurrent/ThreadSafe;", false);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/opensaml/soap/client/SOAPClient$SOAPRequestParameters", "org/opensaml/soap/client/SOAPClient", "SOAPRequestParameters", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

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
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parserPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NonnullAfterInit;", false);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "soapClientContextLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/soap/client/SOAPClientContext;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "soap11ContextLookupStrategy", "Lcom/google/common/base/Function;", "Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/soap/messaging/context/SOAP11Context;>;", null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
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
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/soap/client/http/HttpSOAPClient;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/ChildContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/soap/client/SOAPClientContext;"));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/ChildContextLookup", "<init>", "(Ljava/lang/Class;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soapClientContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/navigate/ChildContextLookup");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/soap/messaging/context/SOAP11Context;"));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/navigate/ChildContextLookup", "<init>", "(Ljava/lang/Class;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soap11ContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doInitialize", "()V", null, new String[] { "net/shibboleth/utilities/java/support/component/ComponentInitializationException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/AbstractInitializableComponent", "doInitialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "httpClient", "Lorg/apache/http/client/HttpClient;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HttpClient cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "parserPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/component/ComponentInitializationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ParserPool cannot be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/component/ComponentInitializationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
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
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("HttpClient cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/http/client/HttpClient");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "httpClient", "Lorg/apache/http/client/HttpClient;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParserPool", "(Lnet/shibboleth/utilities/java/support/xml/ParserPool;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("ParserPool cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/xml/ParserPool");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "parserPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSOAPClientContextLookupStrategy", "()Lcom/google/common/base/Function;", "()Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/soap/client/SOAPClientContext;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soapClientContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSOAPClientContextLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/soap/client/SOAPClientContext;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("SOAP client context lookup strategy cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soapClientContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSOAP11ContextLookupStrategy", "()Lcom/google/common/base/Function;", "()Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/soap/messaging/context/SOAP11Context;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soap11ContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSOAP11ContextLookupStrategy", "(Lcom/google/common/base/Function;)V", "(Lcom/google/common/base/Function<Lorg/opensaml/messaging/context/MessageContext;Lorg/opensaml/soap/messaging/context/SOAP11Context;>;)V", null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/component/ComponentSupport", "ifInitializedThrowUnmodifiabledComponentException", "(Lnet/shibboleth/utilities/java/support/component/InitializableComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("SOAP 1.1 context lookup strategy cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/google/common/base/Function");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soap11ContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
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
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, null);
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label2, label4, label3, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Endpoint cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("Operation context cannot be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soap11ContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/messaging/context/SOAP11Context");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "soapClientContextLookupStrategy", "Lcom/google/common/base/Function;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getOutboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/google/common/base/Function", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/client/SOAPClientContext");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/messaging/context/SOAP11Context", "getEnvelope", "()Lorg/opensaml/soap/soap11/Envelope;", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/opensaml/soap/messaging/context/SOAP11Context", "org/opensaml/soap/client/SOAPClientContext", "org/opensaml/soap/client/http/HttpSOAPRequestParameters"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Operation context did not contain an outbound SOAP Envelope");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/SOAPClientContext", "getSOAPRequestParameters", "()Lorg/opensaml/soap/client/SOAPClient$SOAPRequestParameters;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/client/http/HttpSOAPRequestParameters");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/messaging/context/SOAP11Context", "getEnvelope", "()Lorg/opensaml/soap/soap11/Envelope;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPClient", "createPostMethod", "(Ljava/lang/String;Lorg/opensaml/soap/client/http/HttpSOAPRequestParameters;Lorg/opensaml/soap/soap11/Envelope;)Lorg/apache/http/client/methods/HttpPost;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "httpClient", "Lorg/apache/http/client/HttpClient;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/client/HttpClient", "execute", "(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/HttpResponse", "getStatusLine", "()Lorg/apache/http/StatusLine;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/StatusLine", "getStatusCode", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Received HTTP status code of {} when POSTing SOAP message to {}");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(SIPUSH, 200);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPClient", "processSuccessfulResponse", "(Lorg/apache/http/HttpResponse;Lorg/opensaml/messaging/context/InOutOperationContext;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/http/client/methods/HttpPost", "org/apache/http/HttpResponse", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitIntInsn(SIPUSH, 500);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPClient", "processFaultResponse", "(Lorg/apache/http/HttpResponse;Lorg/opensaml/messaging/context/InOutOperationContext;)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Received ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" HTTP response status code from HTTP request to ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/client/methods/HttpPost", "reset", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unable to send request to ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/client/methods/HttpPost", "reset", "()V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createPostMethod", "(Ljava/lang/String;Lorg/opensaml/soap/client/http/HttpSOAPRequestParameters;Lorg/opensaml/soap/soap11/Envelope;)Lorg/apache/http/client/methods/HttpPost;", null, new String[] { "org/opensaml/soap/client/SOAPClientException" });
methodVisitor.visitAnnotableParameterCount(3, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(2, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitAnnotableParameterCount(3, false);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("POSTing SOAP message to {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/apache/http/client/methods/HttpPost");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/client/methods/HttpPost", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/nio/charset/Charset", "forName", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPClient", "createRequestEntity", "(Lorg/opensaml/soap/soap11/Envelope;Ljava/nio/charset/Charset;)Lorg/apache/http/HttpEntity;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/client/methods/HttpPost", "setEntity", "(Lorg/apache/http/HttpEntity;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPRequestParameters", "getSOAPAction", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("SOAPAction");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPRequestParameters", "getSOAPAction", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/http/client/methods/HttpPost", "setHeader", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/http/client/methods/HttpPost"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createRequestEntity", "(Lorg/opensaml/soap/soap11/Envelope;Ljava/nio/charset/Charset;)Lorg/apache/http/HttpEntity;", null, new String[] { "org/opensaml/soap/client/SOAPClientException" });
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljakarta/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/opensaml/core/xml/io/MarshallingException");
methodVisitor.visitLabel(label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getMarshallerFactory", "()Lorg/opensaml/core/xml/io/MarshallerFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/io/MarshallerFactory", "getMarshaller", "(Lorg/opensaml/core/xml/XMLObject;)Lorg/opensaml/core/xml/io/Marshaller;", false);
methodVisitor.visitLdcInsn("SOAP Envelope marshaller not available");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/io/Marshaller");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isDebugEnabled", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Outbound SOAP message is:\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Marshaller", "marshall", "(Lorg/opensaml/core/xml/XMLObject;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/xml/SerializeSupport", "prettyPrintXML", "(Lorg/w3c/dom/Node;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/core/xml/io/Marshaller", "java/io/ByteArrayOutputStream"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Marshaller", "marshall", "(Lorg/opensaml/core/xml/XMLObject;)Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/xml/SerializeSupport", "writeNode", "(Lorg/w3c/dom/Node;Ljava/io/OutputStream;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/http/entity/ByteArrayEntity");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/ByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitLdcInsn("text/xml");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/http/entity/ContentType", "create", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lorg/apache/http/entity/ContentType;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/http/entity/ByteArrayEntity", "<init>", "([BLorg/apache/http/entity/ContentType;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/soap/client/http/HttpSOAPClient", "org/opensaml/soap/soap11/Envelope", "java/nio/charset/Charset"}, 1, new Object[] {"org/opensaml/core/xml/io/MarshallingException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to marshall SOAP envelope");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processSuccessfulResponse", "(Lorg/apache/http/HttpResponse;Lorg/opensaml/messaging/context/InOutOperationContext;)V", null, new String[] { "org/opensaml/soap/client/SOAPClientException" });
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
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/HttpResponse", "getEntity", "()Lorg/apache/http/HttpEntity;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No response body from server");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/HttpResponse", "getEntity", "()Lorg/apache/http/HttpEntity;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/HttpEntity", "getContent", "()Ljava/io/InputStream;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPClient", "unmarshallResponse", "(Ljava/io/InputStream;)Lorg/opensaml/soap/soap11/Envelope;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/MessageContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/MessageContext", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "setInboundMessageContext", "(Lorg/opensaml/messaging/context/MessageContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getInboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/soap/messaging/context/SOAP11Context;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;Z)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/messaging/context/SOAP11Context");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/messaging/context/SOAP11Context", "setEnvelope", "(Lorg/opensaml/soap/soap11/Envelope;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to read response");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processFaultResponse", "(Lorg/apache/http/HttpResponse;Lorg/opensaml/messaging/context/InOutOperationContext;)V", null, new String[] { "org/opensaml/soap/client/SOAPClientException", "org/opensaml/soap/client/SOAPFaultException" });
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
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/HttpResponse", "getEntity", "()Lorg/apache/http/HttpEntity;", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No response body from server");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/HttpResponse", "getEntity", "()Lorg/apache/http/HttpEntity;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/http/HttpEntity", "getContent", "()Ljava/io/InputStream;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/http/HttpSOAPClient", "unmarshallResponse", "(Ljava/io/InputStream;)Lorg/opensaml/soap/soap11/Envelope;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/messaging/context/MessageContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/messaging/context/MessageContext", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "setInboundMessageContext", "(Lorg/opensaml/messaging/context/MessageContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/InOutOperationContext", "getInboundMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/soap/messaging/context/SOAP11Context;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;Z)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/messaging/context/SOAP11Context");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/messaging/context/SOAP11Context", "setEnvelope", "(Lorg/opensaml/soap/soap11/Envelope;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/Envelope", "getBody", "()Lorg/opensaml/soap/soap11/Body;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/Envelope", "getBody", "()Lorg/opensaml/soap/soap11/Body;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/soap/soap11/Fault", "DEFAULT_ELEMENT_NAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/Body", "getUnknownXMLObjects", "(Ljavax/xml/namespace/QName;)Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HTTP status code was 500 but SOAP response did not contain a Fault");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/opensaml/soap/soap11/Envelope", "java/util/List"}, 0, null);
methodVisitor.visitLdcInsn("(not set)");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLdcInsn("(not set)");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/soap11/Fault");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/Fault", "getCode", "()Lorg/opensaml/soap/soap11/FaultCode;", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/Fault", "getCode", "()Lorg/opensaml/soap/soap11/FaultCode;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/FaultCode", "getValue", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "java/lang/String", "org/opensaml/soap/soap11/Fault"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/Fault", "getMessage", "()Lorg/opensaml/soap/soap11/FaultString;", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/Fault", "getMessage", "()Lorg/opensaml/soap/soap11/FaultString;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/soap/soap11/FaultString", "getValue", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("SOAP fault code {} with message {}");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPFaultException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("SOAP Fault: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" Fault Message: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPFaultException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/soap/client/SOAPFaultException", "setFault", "(Lorg/opensaml/soap/soap11/Fault;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/opensaml/soap/client/http/HttpSOAPClient", "org/apache/http/HttpResponse", "org/opensaml/messaging/context/InOutOperationContext", "org/opensaml/soap/soap11/Envelope"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HTTP status code was 500 but SOAP response did not contain a Body");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/opensaml/soap/client/http/HttpSOAPClient", "org/apache/http/HttpResponse", "org/opensaml/messaging/context/InOutOperationContext"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to read response");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "unmarshallResponse", "(Ljava/io/InputStream;)Lorg/opensaml/soap/soap11/Envelope;", null, new String[] { "org/opensaml/soap/client/SOAPClientException" });
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljakarta/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "net/shibboleth/utilities/java/support/xml/XMLParserException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "org/opensaml/core/xml/io/UnmarshallingException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "parserPool", "Lnet/shibboleth/utilities/java/support/xml/ParserPool;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "net/shibboleth/utilities/java/support/xml/ParserPool", "parse", "(Ljava/io/InputStream;)Lorg/w3c/dom/Document;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Document", "getDocumentElement", "()Lorg/w3c/dom/Element;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "isDebugEnabled", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/soap/client/http/HttpSOAPClient", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Inbound SOAP message was:\n");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/xml/SerializeSupport", "prettyPrintXML", "(Lorg/w3c/dom/Node;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/w3c/dom/Element"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/xml/config/XMLObjectProviderRegistrySupport", "getUnmarshallerFactory", "()Lorg/opensaml/core/xml/io/UnmarshallerFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/core/xml/io/UnmarshallerFactory", "getUnmarshaller", "(Lorg/w3c/dom/Element;)Lorg/opensaml/core/xml/io/Unmarshaller;", false);
methodVisitor.visitLdcInsn("SOAP envelope unmarshaller not available");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/core/xml/io/Unmarshaller");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/core/xml/io/Unmarshaller", "unmarshall", "(Lorg/w3c/dom/Element;)Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/soap/soap11/Envelope");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/opensaml/soap/client/http/HttpSOAPClient", "java/io/InputStream"}, 1, new Object[] {"net/shibboleth/utilities/java/support/xml/XMLParserException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to parse the XML within the response");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/opensaml/core/xml/io/UnmarshallingException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/soap/client/SOAPClientException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to unmarshall the response DOM");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/client/SOAPClientException", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "evaluateSecurityPolicy", "(Lorg/opensaml/soap/client/SOAPClientContext;)V", null, new String[] { "org/opensaml/soap/client/SOAPClientException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
