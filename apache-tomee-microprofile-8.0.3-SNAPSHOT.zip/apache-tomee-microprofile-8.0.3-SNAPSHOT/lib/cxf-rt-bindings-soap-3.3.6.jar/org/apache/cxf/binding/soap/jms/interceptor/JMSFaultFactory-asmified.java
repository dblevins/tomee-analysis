package asm.org.apache.cxf.binding.soap.jms.interceptor;
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
public class JMSFaultFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createContentTypeMismatchFault", "(Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTENTTYPE_MISMATCH");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getContentTypeMismatchQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createContentEncodingNotSupported", "(Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTENT_ENCODING_NOT_SUPPORTED");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getContentTypeMismatchQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMalformedRequestURIFault", "(Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MALFORMED_REQUESTURI");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getMalformedRequestURIQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMismatchedSoapActionFault", "(Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISMATCHED_SOAPACTION");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getMismatchedSoapActionQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMissingContentTypeFault", "()Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISSING_CONTENTTYPE");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getMissingContentTypeQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMissingSoapActionFault", "()Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISSING_SOAPACTION");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getMissingSoapActionQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createMissingRequestURIFault", "()Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISSING_REQUESTURI");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getMissingRequestURIQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createTargetServiceNotAllowedInRequestURIFault", "()Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TARGET_SERVICE_NOT_ALLOWED_IN_REQUESTURI");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getTargetServiceNotAllowedInRequestURIQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createUnrecognizedBindingVerionFault", "(Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNRECOGNIZED_BINDINGVERSION");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getUnrecognizedBindingVersionQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createUnsupportedJMSMessageFormatFault", "(Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/common/i18n/Message");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSUPPORTED_JMSMESSAGEFORMAT");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/i18n/Message", "<init>", "(Ljava/lang/String;Ljava/util/logging/Logger;[Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/common/i18n/Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/SoapJMSConstants", "getUnsupportedJMSMessageFormatQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "createFault", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFault;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultType", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultType", "setFaultCode", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/binding/soap/jms/interceptor/JMSFault");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/jms/interceptor/JMSFault", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/jms/interceptor/JMSFault", "setJmsFaultType", "(Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFaultType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/jms/interceptor/JMSFault", "setSender", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/binding/soap/jms/interceptor/JMSFaultFactory", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
