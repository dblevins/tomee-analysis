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
public class KerberosAuthenticationFilter$KerberosSecurityContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosSecurityContext", null, "org/apache/cxf/common/security/SimpleSecurityContext", null);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosPrincipal", "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "KerberosPrincipal", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosSecurityContext", "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter", "KerberosSecurityContext", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "context", "Lorg/ietf/jgss/GSSContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosPrincipal;Lorg/ietf/jgss/GSSContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/common/security/SimpleSecurityContext", "<init>", "(Ljava/security/Principal;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosSecurityContext", "context", "Lorg/ietf/jgss/GSSContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGSSContext", "()Lorg/ietf/jgss/GSSContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter$KerberosSecurityContext", "context", "Lorg/ietf/jgss/GSSContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
