package asm.org.apache.cxf.interceptor.security.callback;
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
public class CallbackHandlerTlsCert$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/interceptor/security/callback/CallbackHandlerTlsCert$1", null, "java/lang/Object", new String[] { "org/apache/cxf/interceptor/security/callback/CertificateToNameMapper" });

classWriter.visitOuterClass("org/apache/cxf/interceptor/security/callback/CallbackHandlerTlsCert", "<init>", "()V");

classWriter.visitInnerClass("org/apache/cxf/interceptor/security/callback/CallbackHandlerTlsCert$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/interceptor/security/callback/CallbackHandlerTlsCert;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/interceptor/security/callback/CallbackHandlerTlsCert;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/interceptor/security/callback/CallbackHandlerTlsCert$1", "this$0", "Lorg/apache/cxf/interceptor/security/callback/CallbackHandlerTlsCert;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUserName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/cert/X509Certificate");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getSubjectDN", "()Ljava/security/Principal;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/Principal", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
