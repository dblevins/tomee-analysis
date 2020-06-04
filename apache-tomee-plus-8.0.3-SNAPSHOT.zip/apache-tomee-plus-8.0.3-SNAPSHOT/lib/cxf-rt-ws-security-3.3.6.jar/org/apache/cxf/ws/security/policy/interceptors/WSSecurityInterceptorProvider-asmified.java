package asm.org.apache.cxf.ws.security.policy.interceptors;
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
public class WSSecurityInterceptorProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", null, "org/apache/cxf/ws/policy/AbstractPolicyInterceptorProvider", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-6222118542914666817L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ASSERTION_TYPES", "Ljava/util/Collection;", "Ljava/util/Collection<Ljavax/xml/namespace/QName;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/AbstractPolicyInterceptorProvider", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JInInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JInInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getOutInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor", "INSTANCE", "Lorg/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getOutFaultInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor", "INSTANCE", "Lorg/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JOutInterceptor;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getInInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getInFaultInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JStaxOutInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JStaxOutInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JStaxInInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/security/wss4j/PolicyBasedWSS4JStaxInInterceptor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getOutInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getOutFaultInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getInInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "getInFaultInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP12Constants", "TRANSPORT_BINDING", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP12Constants", "ASYMMETRIC_BINDING", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP12Constants", "SYMMETRIC_BINDING", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP12Constants", "SIGNED_PARTS", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP11Constants", "TRANSPORT_BINDING", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP11Constants", "ASYMMETRIC_BINDING", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP11Constants", "SYMMETRIC_BINDING", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/security/policy/interceptors/WSSecurityInterceptorProvider", "ASSERTION_TYPES", "Ljava/util/Collection;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/policy/SP11Constants", "SIGNED_PARTS", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
