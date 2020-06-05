package asm.org.apache.cxf.transport.servlet.servicelist;
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
public class ServiceListJAASAuthenticatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HEADER_WWW_AUTHENTICATE", "Ljava/lang/String;", null, "WWW-Authenticate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HEADER_AUTHORIZATION", "Ljava/lang/String;", null, "Authorization");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "AUTHENTICATION_SCHEME_BASIC", "Ljava/lang/String;", null, "Basic");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "realm", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRealm", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "realm", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRealm", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "realm", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "authenticate", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "doAuthenticate", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/security/auth/Subject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "doAuthenticate", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/security/auth/Subject;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/security/auth/login/FailedLoginException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "javax/security/auth/login/AccountException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "java/security/GeneralSecurityException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/Subject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/Subject", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/login/LoginContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "realm", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator$1", "<init>", "(Lorg/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/login/LoginContext", "<init>", "(Ljava/lang/String;Ljavax/security/auth/Subject;Ljavax/security/auth/callback/CallbackHandler;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/login/LoginContext", "login", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/security/auth/login/FailedLoginException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Login failed ");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/security/auth/login/AccountException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Account failure ");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/GeneralSecurityException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("General Security Exception ");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "authenticate", "(Ljakarta/servlet/http/HttpServletRequest;Ljakarta/servlet/http/HttpServletResponse;)Z", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Authorization");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletRequest", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("Basic");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "base64Decode", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "doAuthenticate", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/security/auth/Subject;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "jakarta/servlet/http/HttpServletRequest", "jakarta/servlet/http/HttpServletResponse", "java/lang/String", Opcodes.INTEGER, "java/lang/String", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("WWW-Authenticate");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Basic realm=\"");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "realm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("\"");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletResponse", "setHeader", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 401);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletResponse", "setStatus", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletResponse", "setContentLength", "(I)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/servlet/http/HttpServletResponse", "flushBuffer", "()V", true);
methodVisitor.visitLabel(label4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "base64Decode", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/cxf/common/util/Base64Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/Base64Utility", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("ISO-8859-1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"java/lang/String", "[B"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transport/http/blueprint/HttpDestinationBPBeanDefinitionParser;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/servlet/servicelist/ServiceListJAASAuthenticator", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
