package asm.org.opensaml.xmlsec.encryption.support;
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
public class ChainingEncryptedKeyResolver$ChainingIterableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "Ljava/lang/Object;Ljava/lang/Iterable<Lorg/opensaml/xmlsec/encryption/EncryptedKey;>;", "java/lang/Object", new String[] { "java/lang/Iterable" });

classWriter.visitInnerClass("org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver", "ChainingIterable", ACC_PUBLIC);

classWriter.visitInnerClass("org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterator", "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver", "ChainingIterator", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parent", "Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;Lorg/opensaml/xmlsec/encryption/EncryptedData;)V", null, null);
methodVisitor.visitAnnotableParameterCount(2, true);
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(0, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = methodVisitor.visitParameterAnnotation(1, "Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "this$0", "Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "parent", "Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Lorg/opensaml/xmlsec/encryption/EncryptedKey;>;", null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/annotation/Nonnull;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "this$0", "Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "parent", "Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterable", "encryptedData", "Lorg/opensaml/xmlsec/encryption/EncryptedData;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver$ChainingIterator", "<init>", "(Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;Lorg/opensaml/xmlsec/encryption/support/ChainingEncryptedKeyResolver;Lorg/opensaml/xmlsec/encryption/EncryptedData;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
