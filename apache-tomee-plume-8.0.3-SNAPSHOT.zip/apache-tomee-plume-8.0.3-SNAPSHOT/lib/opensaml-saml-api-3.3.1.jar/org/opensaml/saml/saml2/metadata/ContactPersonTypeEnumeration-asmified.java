package asm.org.opensaml.saml.saml2.metadata;
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
public class ContactPersonTypeEnumerationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TECHNICAL", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUPPORT", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADMINISTRATIVE", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BILLING", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OTHER", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "type", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "type", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("technical");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "TECHNICAL", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("support");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "SUPPORT", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("administrative");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "ADMINISTRATIVE", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("billing");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "BILLING", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("other");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration", "OTHER", "Lorg/opensaml/saml/saml2/metadata/ContactPersonTypeEnumeration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
