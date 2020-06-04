package asm.org.opensaml.saml.saml1.binding.decoding.impl;
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
public class HTTPSOAP11DecoderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "Lorg/opensaml/soap/soap11/decoder/http/impl/HTTPSOAP11Decoder<Lorg/opensaml/saml/common/SAMLObject;>;Lorg/opensaml/saml/common/binding/decoding/SAMLMessageDecoder;", "org/opensaml/soap/soap11/decoder/http/impl/HTTPSOAP11Decoder", new String[] { "org/opensaml/saml/common/binding/decoding/SAMLMessageDecoder" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "log", "Lorg/slf4j/Logger;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bindingDescriptor", "Lorg/opensaml/saml/common/binding/BindingDescriptor;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/soap11/decoder/http/impl/HTTPSOAP11Decoder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/common/binding/impl/SAMLSOAPDecoderBodyHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/binding/impl/SAMLSOAPDecoderBodyHandler", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "setBodyHandler", "(Lorg/opensaml/messaging/handler/MessageHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBindingURI", "()Ljava/lang/String;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitAnnotation("Lnet/shibboleth/utilities/java/support/annotation/constraint/NotEmpty;", false);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("urn:oasis:names:tc:SAML:1.0:bindings:SOAP-binding");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBindingDescriptor", "()Lorg/opensaml/saml/common/binding/BindingDescriptor;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "bindingDescriptor", "Lorg/opensaml/saml/common/binding/BindingDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBindingDescriptor", "(Lorg/opensaml/saml/common/binding/BindingDescriptor;)V", null, null);
methodVisitor.visitAnnotableParameterCount(1, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nullable;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "bindingDescriptor", "Lorg/opensaml/saml/common/binding/BindingDescriptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doDecode", "()V", null, new String[] { "org/opensaml/messaging/decoder/MessageDecodingException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/soap/soap11/decoder/http/impl/HTTPSOAP11Decoder", "doDecode", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "getMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "populateBindingContext", "(Lorg/opensaml/messaging/context/MessageContext;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "getMessageContext", "()Lorg/opensaml/messaging/context/MessageContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getMessage", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/SAMLObject");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Decoded SOAP messaged which included SAML message of type {}");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/common/SAMLObject", "getElementQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "populateBindingContext", "(Lorg/opensaml/messaging/context/MessageContext;)V", "(Lorg/opensaml/messaging/context/MessageContext<Lorg/opensaml/saml/common/SAMLObject;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/messaging/context/SAMLBindingContext;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/messaging/context/MessageContext", "getSubcontext", "(Ljava/lang/Class;Z)Lorg/opensaml/messaging/context/BaseContext;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/messaging/context/SAMLBindingContext");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "getBindingURI", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLBindingContext", "setBindingUri", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml1/binding/decoding/impl/HTTPSOAP11Decoder", "bindingDescriptor", "Lorg/opensaml/saml/common/binding/BindingDescriptor;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLBindingContext", "setBindingDescriptor", "(Lorg/opensaml/saml/common/binding/BindingDescriptor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLBindingContext", "setHasBindingSignature", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/common/messaging/context/SAMLBindingContext", "setIntendedDestinationEndpointURIRequired", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
