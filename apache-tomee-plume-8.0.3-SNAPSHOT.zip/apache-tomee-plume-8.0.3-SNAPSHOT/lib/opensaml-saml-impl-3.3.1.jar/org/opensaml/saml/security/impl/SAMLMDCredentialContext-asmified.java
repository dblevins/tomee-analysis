package asm.org.opensaml.saml.security.impl;
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
public class SAMLMDCredentialContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/saml/security/impl/SAMLMDCredentialContext", null, "java/lang/Object", new String[] { "org/opensaml/security/credential/CredentialContext" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "keyDescriptor", "Lorg/opensaml/saml/saml2/metadata/KeyDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "role", "Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encMethods", "Ljava/util/List;", "Ljava/util/List<Lorg/opensaml/saml/saml2/metadata/EncryptionMethod;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/saml/saml2/metadata/KeyDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/security/impl/SAMLMDCredentialContext", "keyDescriptor", "Lorg/opensaml/saml/saml2/metadata/KeyDescriptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/KeyDescriptor", "getEncryptionMethods", "()Ljava/util/List;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/security/impl/SAMLMDCredentialContext", "encMethods", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/opensaml/saml/saml2/metadata/KeyDescriptor", "getParent", "()Lorg/opensaml/core/xml/XMLObject;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/saml2/metadata/RoleDescriptor");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/security/impl/SAMLMDCredentialContext", "role", "Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/opensaml/saml/security/impl/SAMLMDCredentialContext", "org/opensaml/saml/saml2/metadata/KeyDescriptor"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKeyDescriptor", "()Lorg/opensaml/saml/saml2/metadata/KeyDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/security/impl/SAMLMDCredentialContext", "keyDescriptor", "Lorg/opensaml/saml/saml2/metadata/KeyDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptionMethods", "()Ljava/util/List;", "()Ljava/util/List<Lorg/opensaml/saml/saml2/metadata/EncryptionMethod;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/security/impl/SAMLMDCredentialContext", "encMethods", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRoleDescriptor", "()Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/security/impl/SAMLMDCredentialContext", "role", "Lorg/opensaml/saml/saml2/metadata/RoleDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
