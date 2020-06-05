package asm.org.apache.catalina.connector;
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
public class ConnectorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/connector/Connector", null, "org/apache/catalina/util/LifecycleMBeanBase", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RECYCLE_FACADES", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERNAL_EXECUTOR_NAME", "Ljava/lang/String;", null, "Internal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "service", "Lorg/apache/catalina/Service;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "allowTrace", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "asyncTimeout", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "enableLookups", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "xpoweredBy", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "proxyName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "proxyPort", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "discardFacades", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "redirectPort", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "scheme", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "secure", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxCookieCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "maxParameterCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "maxPostSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "maxSavePostSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "parseBodyMethods", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "parseBodyMethodsSet", "Ljava/util/HashSet;", "Ljava/util/HashSet<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "useIPVHosts", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "protocolHandlerClassName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "configuredProtocol", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "adapter", "Lorg/apache/coyote/Adapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "uriCharset", "Ljava/nio/charset/Charset;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encodedSolidusHandling", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "useBodyEncodingForURI", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("HTTP/1.1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/connector/Connector", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/util/LifecycleMBeanBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "service", "Lorg/apache/catalina/Service;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "allowTrace", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(30000L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "asyncTimeout", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "enableLookups", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "xpoweredBy", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "proxyName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "proxyPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "RECYCLE_FACADES", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "discardFacades", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 443);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "redirectPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "scheme", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "secure", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 200);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxCookieCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 10000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxParameterCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2097152));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxPostSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxSavePostSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "parseBodyMethods", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "useIPVHosts", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "adapter", "Lorg/apache/coyote/Adapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "UTF_8", "Ljava/nio/charset/Charset;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "uriCharset", "Ljava/nio/charset/Charset;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/EncodedSolidusHandling", "REJECT", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "encodedSolidusHandling", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "useBodyEncodingForURI", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "configuredProtocol", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/core/AprLifecycleListener", "isAprAvailable", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/core/AprLifecycleListener", "getUseAprConnector", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/catalina/connector/Connector", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/coyote/ProtocolHandler", "create", "(Ljava/lang/String;Z)Lorg/apache/coyote/ProtocolHandler;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/catalina/connector/Connector", "java/lang/String", Opcodes.INTEGER, "org/apache/coyote/ProtocolHandler"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerInstantiationFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "protocolHandlerClassName", "Ljava/lang/String;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "protocolHandlerClassName", "Ljava/lang/String;");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.apache.catalina.startup.EXIT_ON_INIT_FAILURE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "getBoolean", "(Ljava/lang/String;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setThrowOnFailure", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/coyote/ProtocolHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/util/LifecycleMBeanBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "service", "Lorg/apache/catalina/Service;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "allowTrace", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Long(30000L));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "asyncTimeout", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "enableLookups", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "xpoweredBy", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "proxyName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "proxyPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "RECYCLE_FACADES", "Z");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "discardFacades", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 443);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "redirectPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "scheme", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "secure", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 200);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxCookieCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 10000);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxParameterCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(new Integer(2097152));
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxPostSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 4096);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxSavePostSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("POST");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "parseBodyMethods", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "useIPVHosts", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "adapter", "Lorg/apache/coyote/Adapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "UTF_8", "Ljava/nio/charset/Charset;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "uriCharset", "Ljava/nio/charset/Charset;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/EncodedSolidusHandling", "REJECT", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "encodedSolidusHandling", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "useBodyEncodingForURI", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "protocolHandlerClassName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandlerClassName", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "configuredProtocol", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.apache.catalina.startup.EXIT_ON_INIT_FAILURE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "getBoolean", "(Ljava/lang/String;)Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setThrowOnFailure", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/IntrospectionUtils", "getProperty", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/IntrospectionUtils", "setProperty", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "setAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getService", "()Lorg/apache/catalina/Service;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "service", "Lorg/apache/catalina/Service;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setService", "(Lorg/apache/catalina/Service;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "service", "Lorg/apache/catalina/Service;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllowTrace", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "allowTrace", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAllowTrace", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "allowTrace", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("allowTrace");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAsyncTimeout", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "asyncTimeout", "J");
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAsyncTimeout", "(J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "asyncTimeout", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("asyncTimeout");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(J)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDiscardFacades", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "discardFacades", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/Globals", "IS_SECURITY_ENABLED", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDiscardFacades", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "discardFacades", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEnableLookups", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "enableLookups", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnableLookups", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "enableLookups", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("enableLookups");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxCookieCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "maxCookieCount", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxCookieCount", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxCookieCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxParameterCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "maxParameterCount", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxParameterCount", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxParameterCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("maxParameterCount");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxPostSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "maxPostSize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxPostSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxPostSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("maxPostSize");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxSavePostSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "maxSavePostSize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxSavePostSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "maxSavePostSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("maxSavePostSize");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParseBodyMethods", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "parseBodyMethods", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParseBodyMethods", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\\s*,\\s*");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "addAll", "(Ljava/util/Collection;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/HashSet"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("TRACE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "contains", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.parseBodyMethodNoTrace");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "parseBodyMethods", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "parseBodyMethodsSet", "Ljava/util/HashSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("parseBodyMethods");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isParseBodyMethod", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "parseBodyMethodsSet", "Ljava/util/HashSet;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashSet", "contains", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPort", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/coyote/AbstractProtocol");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/AbstractProtocol");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/AbstractProtocol", "getPort", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("port");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Integer");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPort", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("port");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPortOffset", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/coyote/AbstractProtocol");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/AbstractProtocol");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/AbstractProtocol", "getPortOffset", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("portOffset");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/Integer");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPortOffset", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("portOffset");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPortWithOffset", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getPort", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getPortOffset", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalPort", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("localPort");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProtocol", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "configuredProtocol", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProtocolHandlerClassName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandlerClassName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProtocolHandler", "()Lorg/apache/coyote/ProtocolHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProxyName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "proxyName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProxyName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "proxyName", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "proxyName", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("proxyName");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "proxyName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProxyPort", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "proxyPort", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProxyPort", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "proxyPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("proxyPort");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRedirectPort", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "redirectPort", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRedirectPort", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "redirectPort", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("redirectPort");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRedirectPortWithOffset", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getRedirectPort", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getPortOffset", "()I", false);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScheme", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "scheme", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setScheme", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "scheme", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSecure", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "secure", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSecure", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "secure", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("secure");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "toString", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getURIEncoding", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "uriCharset", "Ljava/nio/charset/Charset;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/charset/Charset", "name", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getURICharset", "()Ljava/nio/charset/Charset;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "uriCharset", "Ljava/nio/charset/Charset;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setURIEncoding", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/B2CConverter", "getCharset", "(Ljava/lang/String;)Ljava/nio/charset/Charset;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/CharsetUtil", "isAsciiSuperset", "(Ljava/nio/charset/Charset;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.notAsciiSuperset");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/nio/charset/Charset"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "uriCharset", "Ljava/nio/charset/Charset;");
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/catalina/connector/Connector", "java/lang/String"}, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.invalidEncoding");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "uriCharset", "Ljava/nio/charset/Charset;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/charset/Charset", "name", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUseBodyEncodingForURI", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "useBodyEncodingForURI", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUseBodyEncodingForURI", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "useBodyEncodingForURI", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("useBodyEncodingForURI");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXpoweredBy", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "xpoweredBy", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXpoweredBy", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "xpoweredBy", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("xpoweredBy");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUseIPVHosts", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "useIPVHosts", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("useIPVHosts");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setProperty", "(Ljava/lang/String;Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUseIPVHosts", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "useIPVHosts", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExecutorName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "getExecutor", "()Ljava/util/concurrent/Executor;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/Executor");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/Executor");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Executor", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitLdcInsn("Internal");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addSslHostConfig", "(Lorg/apache/tomcat/util/net/SSLHostConfig;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "addSslHostConfig", "(Lorg/apache/tomcat/util/net/SSLHostConfig;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findSslHostConfigs", "()[Lorg/apache/tomcat/util/net/SSLHostConfig;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "findSslHostConfigs", "()[Lorg/apache/tomcat/util/net/SSLHostConfig;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addUpgradeProtocol", "(Lorg/apache/coyote/UpgradeProtocol;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "addUpgradeProtocol", "(Lorg/apache/coyote/UpgradeProtocol;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findUpgradeProtocols", "()[Lorg/apache/coyote/UpgradeProtocol;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "findUpgradeProtocols", "()[Lorg/apache/coyote/UpgradeProtocol;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncodedSolidusHandling", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "encodedSolidusHandling", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/buf/EncodedSolidusHandling", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEncodedSolidusHandling", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/EncodedSolidusHandling", "fromString", "(Ljava/lang/String;)Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "encodedSolidusHandling", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncodedSolidusHandlingInternal", "()Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "encodedSolidusHandling", "Lorg/apache/tomcat/util/buf/EncodedSolidusHandling;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createRequest", "()Lorg/apache/catalina/connector/Request;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/connector/Request");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/connector/Request", "<init>", "(Lorg/apache/catalina/connector/Connector;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createResponse", "()Lorg/apache/catalina/connector/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "getDesiredBufferSize", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/connector/Response");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/connector/Response", "<init>", "(I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/connector/Response");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/connector/Response", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createObjectNameKeyProperties", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("address");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("type=");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(",port=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getPortWithOffset", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/Object", "java/lang/StringBuilder", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("auto-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("nameIndex");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/net/InetAddress");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/InetAddress");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/InetAddress", "getHostAddress", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(",address=");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/management/ObjectName", "quote", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "pause", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "pause", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerPauseFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resume", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "resume", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerResumeFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initInternal", "()V", null, new String[] { "org/apache/catalina/LifecycleException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/util/LifecycleMBeanBase", "initInternal", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerInstantiationFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/connector/CoyoteAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/connector/CoyoteAdapter", "<init>", "(Lorg/apache/catalina/connector/Connector;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/connector/Connector", "adapter", "Lorg/apache/coyote/Adapter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "adapter", "Lorg/apache/coyote/Adapter;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "setAdapter", "(Lorg/apache/coyote/Adapter;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "service", "Lorg/apache/catalina/Service;");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "service", "Lorg/apache/catalina/Service;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Service", "getServer", "()Lorg/apache/catalina/Server;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Server", "getUtilityExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "setUtilityExecutor", "(Ljava/util/concurrent/ScheduledExecutorService;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "parseBodyMethodsSet", "Ljava/util/HashSet;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getParseBodyMethods", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setParseBodyMethods", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "isAprRequired", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/core/AprLifecycleListener", "isInstanceCreated", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerNoAprListener");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProtocolHandlerClassName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "isAprRequired", "()Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/core/AprLifecycleListener", "isAprAvailable", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerNoAprLibrary");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProtocolHandlerClassName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/core/AprLifecycleListener", "isAprAvailable", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/core/AprLifecycleListener", "getUseOpenSSL", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/coyote/http11/AbstractHttp11JsseProtocol");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/coyote/http11/AbstractHttp11JsseProtocol");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http11/AbstractHttp11JsseProtocol", "isSSLEnabled", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http11/AbstractHttp11JsseProtocol", "getSslImplementationName", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/net/openssl/OpenSSLImplementation;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/http11/AbstractHttp11JsseProtocol", "setSslImplementationName", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "init", "()V", true);
methodVisitor.visitLabel(label1);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerInitializationFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "startInternal", "()V", null, new String[] { "org/apache/catalina/LifecycleException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getPortWithOffset", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFGE, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.invalidPort");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getPortWithOffset", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STARTING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setState", "(Lorg/apache/catalina/LifecycleState;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "start", "()V", true);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerStartFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "stopInternal", "()V", null, new String[] { "org/apache/catalina/LifecycleException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STOPPING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "setState", "(Lorg/apache/catalina/LifecycleState;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "stop", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerStopFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "destroyInternal", "()V", null, new String[] { "org/apache/catalina/LifecycleException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "protocolHandler", "Lorg/apache/coyote/ProtocolHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/coyote/ProtocolHandler", "destroy", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/LifecycleException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("coyoteConnector.protocolHandlerDestroyFailed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/LifecycleException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getService", "()Lorg/apache/catalina/Service;", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getService", "()Lorg/apache/catalina/Service;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Service", "removeConnector", "(Lorg/apache/catalina/connector/Connector;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/util/LifecycleMBeanBase", "destroyInternal", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Connector[");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProtocol", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getPortWithOffset", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/StringBuilder", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("auto-");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("nameIndex");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getDomainInternal", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "getService", "()Lorg/apache/catalina/Service;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/catalina/Service"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/connector/Connector", "service", "Lorg/apache/catalina/Service;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Service", "getDomain", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getObjectNameKeyProperties", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Connector");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Connector", "createObjectNameKeyProperties", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/connector/Connector;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/connector/Connector", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitLdcInsn("org.apache.catalina.connector.RECYCLE_FACADES");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "parseBoolean", "(Ljava/lang/String;)Z", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/connector/Connector", "RECYCLE_FACADES", "Z");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/connector/Connector;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/connector/Connector", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
