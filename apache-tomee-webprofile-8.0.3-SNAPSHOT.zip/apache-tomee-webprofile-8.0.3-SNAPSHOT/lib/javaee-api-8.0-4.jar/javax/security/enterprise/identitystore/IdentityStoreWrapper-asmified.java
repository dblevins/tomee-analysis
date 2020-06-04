package asm.javax.security.enterprise.identitystore;
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
public class IdentityStoreWrapperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "javax/security/enterprise/identitystore/IdentityStoreWrapper", null, "java/lang/Object", new String[] { "javax/security/enterprise/identitystore/IdentityStore" });

classWriter.visitInnerClass("javax/security/enterprise/identitystore/IdentityStore$ValidationType", "javax/security/enterprise/identitystore/IdentityStore", "ValidationType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "identityStore", "Ljavax/security/enterprise/identitystore/IdentityStore;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/security/enterprise/identitystore/IdentityStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/security/enterprise/identitystore/IdentityStoreWrapper", "identityStore", "Ljavax/security/enterprise/identitystore/IdentityStore;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWrapped", "()Ljavax/security/enterprise/identitystore/IdentityStore;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/security/enterprise/identitystore/IdentityStoreWrapper", "identityStore", "Ljavax/security/enterprise/identitystore/IdentityStore;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Ljavax/security/enterprise/credential/Credential;)Ljavax/security/enterprise/identitystore/CredentialValidationResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/identitystore/IdentityStoreWrapper", "getWrapped", "()Ljavax/security/enterprise/identitystore/IdentityStore;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/identitystore/IdentityStore", "validate", "(Ljavax/security/enterprise/credential/Credential;)Ljavax/security/enterprise/identitystore/CredentialValidationResult;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCallerGroups", "(Ljavax/security/enterprise/identitystore/CredentialValidationResult;)Ljava/util/Set;", "(Ljavax/security/enterprise/identitystore/CredentialValidationResult;)Ljava/util/Set<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/identitystore/IdentityStoreWrapper", "getWrapped", "()Ljavax/security/enterprise/identitystore/IdentityStore;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/identitystore/IdentityStore", "getCallerGroups", "(Ljavax/security/enterprise/identitystore/CredentialValidationResult;)Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "priority", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/identitystore/IdentityStoreWrapper", "getWrapped", "()Ljavax/security/enterprise/identitystore/IdentityStore;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/identitystore/IdentityStore", "priority", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validationTypes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljavax/security/enterprise/identitystore/IdentityStore$ValidationType;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/security/enterprise/identitystore/IdentityStoreWrapper", "getWrapped", "()Ljavax/security/enterprise/identitystore/IdentityStore;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/security/enterprise/identitystore/IdentityStore", "validationTypes", "()Ljava/util/Set;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
