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
public class HttpsTokenInterceptorProvider$HttpsTokenInInterceptor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor$1", null, "java/lang/Object", new String[] { "org/apache/cxf/security/SecurityContext" });

classWriter.visitOuterClass("org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor", "createSecurityContext", "(Ljava/security/Principal;)Lorg/apache/cxf/security/SecurityContext;");

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor", "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider", "HttpsTokenInInterceptor", ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$p", "Ljava/security/Principal;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor;Ljava/security/Principal;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor$1", "this$0", "Lorg/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor$1", "val$p", "Ljava/security/Principal;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserPrincipal", "()Ljava/security/Principal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/HttpsTokenInterceptorProvider$HttpsTokenInInterceptor$1", "val$p", "Ljava/security/Principal;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isUserInRole", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
