package asm.org.opensaml.saml.saml2.core;
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
public class DecisionTypeEnumerationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PERMIT", "Lorg/opensaml/saml/saml2/core/DecisionTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DENY", "Lorg/opensaml/saml/saml2/core/DecisionTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INDETERMINATE", "Lorg/opensaml/saml/saml2/core/DecisionTypeEnumeration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "decisionType", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "decisionType", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "decisionType", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Permit");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "PERMIT", "Lorg/opensaml/saml/saml2/core/DecisionTypeEnumeration;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Deny");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "DENY", "Lorg/opensaml/saml/saml2/core/DecisionTypeEnumeration;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Indeterminate");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/saml2/core/DecisionTypeEnumeration", "INDETERMINATE", "Lorg/opensaml/saml/saml2/core/DecisionTypeEnumeration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
