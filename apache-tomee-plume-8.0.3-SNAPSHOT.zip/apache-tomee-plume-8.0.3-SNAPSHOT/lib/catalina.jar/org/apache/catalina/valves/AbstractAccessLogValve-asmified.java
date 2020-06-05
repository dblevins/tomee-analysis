package asm.org.apache.catalina.valves;
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
public class AbstractAccessLogValveDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/catalina/valves/AbstractAccessLogValve", null, "org/apache/catalina/valves/ValveBase", new String[] { "org/apache/catalina/AccessLog" });

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$ConnectionStatusElement", "org/apache/catalina/valves/AbstractAccessLogValve", "ConnectionStatusElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$SessionAttributeElement", "org/apache/catalina/valves/AbstractAccessLogValve", "SessionAttributeElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$RequestAttributeElement", "org/apache/catalina/valves/AbstractAccessLogValve", "RequestAttributeElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$ResponseHeaderElement", "org/apache/catalina/valves/AbstractAccessLogValve", "ResponseHeaderElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$CookieElement", "org/apache/catalina/valves/AbstractAccessLogValve", "CookieElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$HeaderElement", "org/apache/catalina/valves/AbstractAccessLogValve", "HeaderElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$StringElement", "org/apache/catalina/valves/AbstractAccessLogValve", "StringElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$LocalServerNameElement", "org/apache/catalina/valves/AbstractAccessLogValve", "LocalServerNameElement", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$RequestURIElement", "org/apache/catalina/valves/AbstractAccessLogValve", "RequestURIElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$SessionIdElement", "org/apache/catalina/valves/AbstractAccessLogValve", "SessionIdElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$QueryElement", "org/apache/catalina/valves/AbstractAccessLogValve", "QueryElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$FirstByteTimeElement", "org/apache/catalina/valves/AbstractAccessLogValve", "FirstByteTimeElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$ElapsedTimeElement", "org/apache/catalina/valves/AbstractAccessLogValve", "ElapsedTimeElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$MethodElement", "org/apache/catalina/valves/AbstractAccessLogValve", "MethodElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$ByteSentElement", "org/apache/catalina/valves/AbstractAccessLogValve", "ByteSentElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$PortElement", "org/apache/catalina/valves/AbstractAccessLogValve", "PortElement", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$HttpStatusCodeElement", "org/apache/catalina/valves/AbstractAccessLogValve", "HttpStatusCodeElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$RequestElement", "org/apache/catalina/valves/AbstractAccessLogValve", "RequestElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$DateAndTimeElement", "org/apache/catalina/valves/AbstractAccessLogValve", "DateAndTimeElement", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$UserElement", "org/apache/catalina/valves/AbstractAccessLogValve", "UserElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$ProtocolElement", "org/apache/catalina/valves/AbstractAccessLogValve", "ProtocolElement", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$LogicalUserNameElement", "org/apache/catalina/valves/AbstractAccessLogValve", "LogicalUserNameElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$HostElement", "org/apache/catalina/valves/AbstractAccessLogValve", "HostElement", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$RemoteAddrElement", "org/apache/catalina/valves/AbstractAccessLogValve", "RemoteAddrElement", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$LocalAddrElement", "org/apache/catalina/valves/AbstractAccessLogValve", "LocalAddrElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$ThreadNameElement", "org/apache/catalina/valves/AbstractAccessLogValve", "ThreadNameElement", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$CachedElement", "org/apache/catalina/valves/AbstractAccessLogValve", "CachedElement", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement", "org/apache/catalina/valves/AbstractAccessLogValve", "AccessLogElement", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache", "org/apache/catalina/valves/AbstractAccessLogValve", "DateFormatCache", ACC_PROTECTED | ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$PortType", "org/apache/catalina/valves/AbstractAccessLogValve", "PortType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$FormatType", "org/apache/catalina/valves/AbstractAccessLogValve", "FormatType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$2", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/AbstractAccessLogValve$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/catalina/valves/Constants$AccessLog", "org/apache/catalina/valves/Constants", "AccessLog", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "log", "Lorg/apache/juli/logging/Log;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "enabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ipv6Canonical", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "pattern", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "globalCacheSize", "I", null, new Integer(300));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "localCacheSize", "I", null, new Integer(60));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "globalDateCache", "Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "localDateCache", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "localDate", "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal<Ljava/util/Date;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "condition", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "conditionIf", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "localeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "locale", "Ljava/util/Locale;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "logElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "cachedElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "requestAttributesEnabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "charArrayWriters", "Lorg/apache/tomcat/util/collections/SynchronizedStack;", "Lorg/apache/tomcat/util/collections/SynchronizedStack<Ljava/io/CharArrayWriter;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "maxLogMessageBufferSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tlsAttributeRequired", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/ValveBase", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "enabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "ipv6Canonical", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "condition", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "conditionIf", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Locale", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "localeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "locale", "Ljava/util/Locale;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "logElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "cachedElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "requestAttributesEnabled", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/collections/SynchronizedStack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/collections/SynchronizedStack", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "charArrayWriters", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "maxLogMessageBufferSize", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "tlsAttributeRequired", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxLogMessageBufferSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "maxLogMessageBufferSize", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxLogMessageBufferSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "maxLogMessageBufferSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIpv6Canonical", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "ipv6Canonical", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIpv6Canonical", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "ipv6Canonical", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRequestAttributesEnabled", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "requestAttributesEnabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRequestAttributesEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "requestAttributesEnabled", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "enabled", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnabled", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "enabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPattern", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPattern", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("common");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("%h %l %u %t \"%r\" %s %b");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("combined");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("%h %l %u %t \"%r\" %s %b \"%{Referer}i\" \"%{User-Agent}i\"");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "createLogElements", "()[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "logElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "logElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve", "createCachedElements", "([Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;)[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "cachedElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCondition", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "condition", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCondition", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "condition", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConditionUnless", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "getCondition", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConditionUnless", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "setCondition", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConditionIf", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "conditionIf", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConditionIf", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "conditionIf", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocale", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "localeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLocale", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "localeName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "locale", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "findLocale", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/Locale;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "locale", "Ljava/util/Locale;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invoke", "(Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;)V", null, new String[] { "java/io/IOException", "jakarta/servlet/ServletException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "tlsAttributeRequired", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.servlet.request.X509Certificate");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "cachedElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "cachedElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/valves/AbstractAccessLogValve$CachedElement", "cache", "(Lorg/apache/catalina/connector/Request;)V", true);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "getNext", "()Lorg/apache/catalina/Valve;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Valve", "invoke", "(Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "log", "(Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "getState", "()Lorg/apache/catalina/LifecycleState;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/LifecycleState", "isAvailable", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "getEnabled", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "logElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "condition", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "getRequest", "()Ljakarta/servlet/http/HttpServletRequest;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "condition", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "conditionIf", "Ljava/lang/String;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "getRequest", "()Ljakarta/servlet/http/HttpServletRequest;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "conditionIf", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletRequest", "getAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/connector/Request", "getCoyoteRequest", "()Lorg/apache/coyote/Request;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/coyote/Request", "getStartTime", "()J", false);
methodVisitor.visitVarInsn(LSTORE, 5);
methodVisitor.visitVarInsn(LLOAD, 5);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitInsn(LADD);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "getDate", "(J)Ljava/util/Date;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "charArrayWriters", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "pop", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/CharArrayWriter");
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitTypeInsn(NEW, "java/io/CharArrayWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/CharArrayWriter", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.LONG, "java/util/Date", "java/io/CharArrayWriter"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "logElements", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement", "addElement", "(Ljava/io/CharArrayWriter;Ljava/util/Date;Lorg/apache/catalina/connector/Request;Lorg/apache/catalina/connector/Response;J)V", true);
methodVisitor.visitIincInsn(11, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "log", "(Ljava/io/CharArrayWriter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/CharArrayWriter", "size", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "maxLogMessageBufferSize", "I");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/CharArrayWriter", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "charArrayWriters", "Lorg/apache/tomcat/util/collections/SynchronizedStack;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/collections/SynchronizedStack", "push", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "log", "(Ljava/io/CharArrayWriter;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getDate", "(J)Ljava/util/Date;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "localDate", "Ljava/lang/ThreadLocal;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Date");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Date", "setTime", "(J)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "findLocale", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/util/Locale;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getAvailableLocales", "()[Ljava/util/Locale;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/util/Locale;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Locale", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitLdcInsn("accessLogValve.invalidLocale");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/res/StringManager", "getString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/juli/logging/Log", "error", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_SYNCHRONIZED, "startInternal", "()V", null, new String[] { "org/apache/catalina/LifecycleException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STARTING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "setState", "(Lorg/apache/catalina/LifecycleState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_SYNCHRONIZED, "stopInternal", "()V", null, new String[] { "org/apache/catalina/LifecycleException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/LifecycleState", "STOPPING", "Lorg/apache/catalina/LifecycleState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "setState", "(Lorg/apache/catalina/LifecycleState;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createLogElements", "()[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/catalina/valves/AbstractAccessLogValve", "java/util/List", Opcodes.INTEGER, "java/lang/StringBuilder", Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, "java/lang/StringBuilder", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label5);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "createAccessLogElement", "(Ljava/lang/String;C)Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "createAccessLogElement", "(C)Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/AbstractAccessLogValve", "createAccessLogElement", "(C)Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 37);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label10);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "length", "()I", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFLE, label11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createCachedElements", "([Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;)[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/catalina/valves/AbstractAccessLogValve", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", "java/util/List", "[Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/catalina/valves/AbstractAccessLogValve$CachedElement");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/valves/AbstractAccessLogValve$CachedElement");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/valves/AbstractAccessLogValve$CachedElement");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/valves/AbstractAccessLogValve$CachedElement;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createAccessLogElement", "(Ljava/lang/String;C)Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTableSwitchInsn(99, 116, label1, new Label[] { label0, label1, label1, label1, label1, label1, label2, label1, label1, label1, label1, label1, label3, label4, label1, label5, label6, label7 });
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$HeaderElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$HeaderElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$CookieElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$CookieElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ResponseHeaderElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ResponseHeaderElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$PortElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$PortElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/util/TLSUtil", "isTLSRequestAttribute", "(Ljava/lang/String;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "tlsAttributeRequired", "Z");
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$RequestAttributeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$RequestAttributeElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$SessionAttributeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$SessionAttributeElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$DateAndTimeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$DateAndTimeElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("???");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createAccessLogElement", "(C)Lorg/apache/catalina/valves/AbstractAccessLogValve$AccessLogElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
Label label18 = new Label();
Label label19 = new Label();
Label label20 = new Label();
Label label21 = new Label();
Label label22 = new Label();
methodVisitor.visitTableSwitchInsn(65, 118, label2, new Label[] { label0, label1, label2, label3, label2, label4, label2, label5, label6, label2, label2, label2, label2, label2, label2, label2, label2, label2, label7, label8, label9, label2, label2, label10, label2, label2, label2, label2, label2, label2, label2, label2, label11, label12, label2, label2, label2, label2, label2, label13, label2, label2, label2, label14, label15, label2, label2, label16, label17, label18, label19, label20, label21, label22 });
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$RemoteAddrElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$RemoteAddrElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$LocalAddrElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "ipv6Canonical", "Z");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$LocalAddrElement", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ByteSentElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ByteSentElement", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ByteSentElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ByteSentElement", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ElapsedTimeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ElapsedTimeElement", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$FirstByteTimeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$FirstByteTimeElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$HostElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$HostElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ProtocolElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ProtocolElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$LogicalUserNameElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$LogicalUserNameElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$MethodElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$MethodElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$PortElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$PortElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$QueryElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$QueryElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$RequestElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$RequestElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$HttpStatusCodeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$HttpStatusCodeElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$SessionIdElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$SessionIdElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$DateAndTimeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$DateAndTimeElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ElapsedTimeElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ElapsedTimeElement", "<init>", "(Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$UserElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$UserElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$RequestURIElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$RequestURIElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$LocalServerNameElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$LocalServerNameElement", "<init>", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ThreadNameElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ThreadNameElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$ConnectionStatusElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$ConnectionStatusElement", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("???");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("???");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$StringElement", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "()Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "globalDateCache", "Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/apache/catalina/valves/AbstractAccessLogValve;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/AbstractAccessLogValve", "ipv6Canonical", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "()Ljava/lang/ThreadLocal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "localDateCache", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$800", "()Lorg/apache/juli/logging/Log;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/valves/AbstractAccessLogValve;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/juli/logging/LogFactory", "getLog", "(Ljava/lang/Class;)Lorg/apache/juli/logging/Log;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "log", "Lorg/apache/juli/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 300);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Locale", "getDefault", "()Ljava/util/Locale;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache", "<init>", "(ILjava/util/Locale;Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "globalDateCache", "Lorg/apache/catalina/valves/AbstractAccessLogValve$DateFormatCache;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$1", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "localDateCache", "Ljava/lang/ThreadLocal;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/AbstractAccessLogValve$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/AbstractAccessLogValve$2", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/AbstractAccessLogValve", "localDate", "Ljava/lang/ThreadLocal;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
