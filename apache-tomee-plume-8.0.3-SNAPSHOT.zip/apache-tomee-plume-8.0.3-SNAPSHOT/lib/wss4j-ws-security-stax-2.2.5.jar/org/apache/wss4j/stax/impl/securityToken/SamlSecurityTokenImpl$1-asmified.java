package asm.org.apache.wss4j.stax.impl.securityToken;
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
public class SamlSecurityTokenImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl$1", null, "java/lang/Object", new String[] { "org/apache/wss4j/common/principal/SAMLTokenPrincipal" });

classWriter.visitOuterClass("org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl", "getPrincipal", "()Ljava/security/Principal;");

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getToken", "()Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl", "access$000", "(Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;)Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl", "access$000", "(Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;)Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "getSubjectName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl", "access$000", "(Lorg/apache/wss4j/stax/impl/securityToken/SamlSecurityTokenImpl;)Lorg/apache/wss4j/common/saml/SamlAssertionWrapper;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/common/saml/SamlAssertionWrapper", "getId", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
