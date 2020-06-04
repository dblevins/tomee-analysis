package asm.org.opensaml.xmlsec.impl;
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
public class StaticEncryptionParametersResolverDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/impl/StaticEncryptionParametersResolver", null, "java/lang/Object", new String[] { "org/opensaml/xmlsec/EncryptionParametersResolver" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "params", "Lorg/opensaml/xmlsec/EncryptionParameters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/xmlsec/EncryptionParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("Parameters instance may not be null");
methodVisitor.visitMethodInsn(INVOKESTATIC, "net/shibboleth/utilities/java/support/logic/Constraint", "isNotNull", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/EncryptionParameters");
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/impl/StaticEncryptionParametersResolver", "params", "Lorg/opensaml/xmlsec/EncryptionParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolve", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable;", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable<Lorg/opensaml/xmlsec/EncryptionParameters;>;", new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/impl/StaticEncryptionParametersResolver", "params", "Lorg/opensaml/xmlsec/EncryptionParameters;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singleton", "(Ljava/lang/Object;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "resolveSingle", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Lorg/opensaml/xmlsec/EncryptionParameters;", null, new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/impl/StaticEncryptionParametersResolver", "params", "Lorg/opensaml/xmlsec/EncryptionParameters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "resolveSingle", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/impl/StaticEncryptionParametersResolver", "resolveSingle", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Lorg/opensaml/xmlsec/EncryptionParameters;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "resolve", "(Ljava/lang/Object;)Ljava/lang/Iterable;", null, new String[] { "net/shibboleth/utilities/java/support/resolver/ResolverException" });
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/resolver/CriteriaSet");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/opensaml/xmlsec/impl/StaticEncryptionParametersResolver", "resolve", "(Lnet/shibboleth/utilities/java/support/resolver/CriteriaSet;)Ljava/lang/Iterable;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
