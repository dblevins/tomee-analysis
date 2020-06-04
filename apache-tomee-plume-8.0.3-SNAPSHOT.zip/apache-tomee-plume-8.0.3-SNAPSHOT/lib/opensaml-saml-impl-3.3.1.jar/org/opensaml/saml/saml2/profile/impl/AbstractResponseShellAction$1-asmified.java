package asm.org.opensaml.saml.saml2.profile.impl;
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
public class AbstractResponseShellAction$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction$1", "Ljava/lang/Object;Lcom/google/common/base/Function<Lorg/opensaml/profile/context/ProfileRequestContext;Lnet/shibboleth/utilities/java/support/security/IdentifierGenerationStrategy;>;", "java/lang/Object", new String[] { "com/google/common/base/Function" });

classWriter.visitOuterClass("org/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction", "<init>", "()V");

classWriter.visitInnerClass("org/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction$1", "this$0", "Lorg/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Lnet/shibboleth/utilities/java/support/security/IdentifierGenerationStrategy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/security/SecureRandomIdentifierGenerationStrategy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/security/SecureRandomIdentifierGenerationStrategy", "<init>", "()V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/profile/context/ProfileRequestContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/saml/saml2/profile/impl/AbstractResponseShellAction$1", "apply", "(Lorg/opensaml/profile/context/ProfileRequestContext;)Lnet/shibboleth/utilities/java/support/security/IdentifierGenerationStrategy;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
