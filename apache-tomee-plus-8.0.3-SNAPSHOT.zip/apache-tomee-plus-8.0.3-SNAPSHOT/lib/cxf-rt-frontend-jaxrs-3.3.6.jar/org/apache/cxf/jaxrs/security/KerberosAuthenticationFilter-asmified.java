package asm.org.apache.cxf.jaxrs.security;
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
public class KerberosAuthenticationFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", null, "java/lang/Object", new String[] { "jakarta/ws/rs/container/ContainerRequestFilter" });

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/ws/rs/container/PreMatching;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosSecurityContext", "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "KerberosSecurityContext", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosPrincipal", "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "KerberosPrincipal", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$ValidateServiceTicketAction", "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "ValidateServiceTicketAction", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("jakarta/ws/rs/core/Response$ResponseBuilder", "jakarta/ws/rs/core/Response", "ResponseBuilder", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NEGOTIATE_SCHEME", "Ljava/lang/String;", null, "Negotiate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PROPERTY_USE_KERBEROS_OID", "Ljava/lang/String;", null, "auth.spnego.useKerberosOid");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "KERBEROS_OID", "Ljava/lang/String;", null, "1.2.840.113554.1.2.2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SPNEGO_OID", "Ljava/lang/String;", null, "1.3.6.1.5.5.2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "messageContext", "Lorg/apache/cxf/jaxrs/ext/MessageContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "loginConfig", "Ljavax/security/auth/login/Configuration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "loginContextName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "servicePrincipalName", "Ljava/lang/String;", null, null);
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
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "loginContextName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "filter", "(Ljakarta/ws/rs/container/ContainerRequestContext;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/security/auth/login/LoginException");
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label3, "org/ietf/jgss/GSSException");
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label4, "java/security/PrivilegedActionException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "messageContext", "Lorg/apache/cxf/jaxrs/ext/MessageContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/jaxrs/ext/MessageContext", "getHttpHeaders", "()Ljakarta/ws/rs/core/HttpHeaders;", true);
methodVisitor.visitLdcInsn("Authorization");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/HttpHeaders", "getRequestHeader", "(Ljava/lang/String;)Ljava/util/List;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/List"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("No Authorization header is available");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ExceptionUtils", "toNotAuthorizedException", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/WebApplicationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label7);
methodVisitor.visitLdcInsn("Negotiate");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/String;"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Negotiate Authorization scheme is expected");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ExceptionUtils", "toNotAuthorizedException", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/WebApplicationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getServiceTicket", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "loginAndGetSubject", "()Ljavax/security/auth/Subject;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "createGSSContext", "()Lorg/ietf/jgss/GSSContext;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$ValidateServiceTicketAction");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$ValidateServiceTicketAction", "<init>", "(Lorg/ietf/jgss/GSSContext;[BLorg/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/security/auth/Subject", "doAs", "(Ljavax/security/auth/Subject;Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/ietf/jgss/GSSContext", "getSrcName", "()Lorg/ietf/jgss/GSSName;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ExceptionUtils", "toNotAuthorizedException", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/WebApplicationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "jakarta/ws/rs/container/ContainerRequestContext", "java/util/List", "[Ljava/lang/String;", "[B", "javax/security/auth/Subject", "org/ietf/jgss/GSSContext", "org/ietf/jgss/GSSName"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/ietf/jgss/GSSName", "toString", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "lastIndexOf", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ILOAD, 10);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFLE, label10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(II)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "java/lang/String", Opcodes.INTEGER}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/JAXRSUtils", "getCurrentMessage", "()Lorg/apache/cxf/message/Message;", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/security/SecurityContext;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "createSecurityContext", "(Ljava/lang/String;Ljava/lang/String;Lorg/ietf/jgss/GSSContext;)Lorg/apache/cxf/security/SecurityContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "put", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/ietf/jgss/GSSContext", "getCredDelegState", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/ietf/jgss/GSSContext", "dispose", "()V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "jakarta/ws/rs/container/ContainerRequestContext", "java/util/List", "[Ljava/lang/String;", "[B"}, 0, new Object[] {});
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/security/auth/login/LoginException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unsuccessful JAAS login for the service principal: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/login/LoginException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ExceptionUtils", "toNotAuthorizedException", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/WebApplicationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/ietf/jgss/GSSException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("GSS API exception: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/ietf/jgss/GSSException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ExceptionUtils", "toNotAuthorizedException", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/WebApplicationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/security/PrivilegedActionException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("PrivilegedActionException: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/PrivilegedActionException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ExceptionUtils", "toNotAuthorizedException", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/WebApplicationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createSecurityContext", "(Ljava/lang/String;Ljava/lang/String;Lorg/ietf/jgss/GSSContext;)Lorg/apache/cxf/security/SecurityContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosSecurityContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosPrincipal");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosPrincipal", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosSecurityContext", "<init>", "(Lorg/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosPrincipal;Lorg/ietf/jgss/GSSContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createGSSContext", "()Lorg/ietf/jgss/GSSContext;", null, new String[] { "org/ietf/jgss/GSSException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "messageContext", "Lorg/apache/cxf/jaxrs/ext/MessageContext;");
methodVisitor.visitLdcInsn("auth.spnego.useKerberosOid");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/jaxrs/ext/MessageContext", "getContextualProperty", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/PropertyUtils", "isTrue", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/ietf/jgss/Oid");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLdcInsn("1.2.840.113554.1.2.2");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", Opcodes.INTEGER}, 2, new Object[] {label0, label0});
methodVisitor.visitLdcInsn("1.3.6.1.5.5.2");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", Opcodes.INTEGER}, 3, new Object[] {label0, label0, "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/ietf/jgss/Oid", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/ietf/jgss/GSSManager", "getInstance", "()Lorg/ietf/jgss/GSSManager;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getCompleteServicePrincipalName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/ietf/jgss/GSSManager", "createName", "(Ljava/lang/String;Lorg/ietf/jgss/Oid;)Lorg/ietf/jgss/GSSName;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/ietf/jgss/GSSName", "canonicalize", "(Lorg/ietf/jgss/Oid;)Lorg/ietf/jgss/GSSName;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/ietf/jgss/GSSManager", "createContext", "(Lorg/ietf/jgss/GSSName;Lorg/ietf/jgss/Oid;Lorg/ietf/jgss/GSSCredential;I)Lorg/ietf/jgss/GSSContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "loginAndGetSubject", "()Ljavax/security/auth/Subject;", null, new String[] { "javax/security/auth/login/LoginException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "loginContextName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "loginConfig", "Ljavax/security/auth/login/Configuration;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/security/auth/login/LoginContext"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/login/LoginContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "loginContextName", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "loginConfig", "Ljavax/security/auth/login/Configuration;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/login/LoginContext", "<init>", "(Ljava/lang/String;Ljavax/security/auth/Subject;Ljavax/security/auth/callback/CallbackHandler;Ljavax/security/auth/login/Configuration;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("LoginContext can not be initialized");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "javax/security/auth/login/LoginException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/security/auth/login/LoginException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/login/LoginContext", "login", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/auth/login/LoginContext", "getSubject", "()Ljavax/security/auth/Subject;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getServiceTicket", "(Ljava/lang/String;)[B", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/apache/cxf/common/util/Base64Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/Base64Utility", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/cxf/common/util/Base64Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/ExceptionUtils", "toNotAuthorizedException", "(Ljava/lang/Throwable;Ljakarta/ws/rs/core/Response;)Ljakarta/ws/rs/WebApplicationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getFaultResponse", "()Ljakarta/ws/rs/core/Response;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 401);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/jaxrs/utils/JAXRSUtils", "toResponseBuilder", "(I)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitLdcInsn("WWW-Authenticate");
methodVisitor.visitLdcInsn("Negotiate");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "header", "(Ljava/lang/String;Ljava/lang/Object;)Ljakarta/ws/rs/core/Response$ResponseBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/ws/rs/core/Response$ResponseBuilder", "build", "()Ljakarta/ws/rs/core/Response;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getCompleteServicePrincipalName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "servicePrincipalName", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("HTTP/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "messageContext", "Lorg/apache/cxf/jaxrs/ext/MessageContext;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/jaxrs/ext/MessageContext", "getUriInfo", "()Ljakarta/ws/rs/core/UriInfo;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/ws/rs/core/UriInfo", "getBaseUri", "()Ljava/net/URI;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getHost", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "servicePrincipalName", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "realm", "Ljava/lang/String;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("@");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "realm", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMessageContext", "(Lorg/apache/cxf/jaxrs/ext/MessageContext;)V", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljakarta/ws/rs/core/Context;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "messageContext", "Lorg/apache/cxf/jaxrs/ext/MessageContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLoginContextName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "loginContextName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setServicePrincipalName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "servicePrincipalName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRealm", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "realm", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCallbackHandler", "(Ljavax/security/auth/callback/CallbackHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "callbackHandler", "Ljavax/security/auth/callback/CallbackHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/jaxrs/security/KerberosAuthenticationFilter;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
