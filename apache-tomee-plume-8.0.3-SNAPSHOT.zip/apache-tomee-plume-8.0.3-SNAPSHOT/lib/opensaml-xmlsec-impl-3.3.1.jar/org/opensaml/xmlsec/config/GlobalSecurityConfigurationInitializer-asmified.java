package asm.org.opensaml.xmlsec.config;
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
public class GlobalSecurityConfigurationInitializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/config/GlobalSecurityConfigurationInitializer", null, "java/lang/Object", new String[] { "org/opensaml/core/config/Initializer" });

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "()V", null, new String[] { "org/opensaml/core/config/InitializationException" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/EncryptionConfiguration;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/config/DefaultSecurityConfigurationBootstrap", "buildDefaultEncryptionConfiguration", "()Lorg/opensaml/xmlsec/impl/BasicEncryptionConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/config/ConfigurationService", "register", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/DecryptionConfiguration;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/config/DefaultSecurityConfigurationBootstrap", "buildDefaultDecryptionConfiguration", "()Lorg/opensaml/xmlsec/impl/BasicDecryptionConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/config/ConfigurationService", "register", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/SignatureSigningConfiguration;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/config/DefaultSecurityConfigurationBootstrap", "buildDefaultSignatureSigningConfiguration", "()Lorg/opensaml/xmlsec/impl/BasicSignatureSigningConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/config/ConfigurationService", "register", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/SignatureValidationConfiguration;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/xmlsec/config/DefaultSecurityConfigurationBootstrap", "buildDefaultSignatureValidationConfiguration", "()Lorg/opensaml/xmlsec/impl/BasicSignatureValidationConfiguration;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/opensaml/core/config/ConfigurationService", "register", "(Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
