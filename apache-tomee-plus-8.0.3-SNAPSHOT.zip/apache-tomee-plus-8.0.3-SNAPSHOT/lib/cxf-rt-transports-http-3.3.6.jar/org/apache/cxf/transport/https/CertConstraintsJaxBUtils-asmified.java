package asm.org.apache.cxf.transport.https;
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
public class CertConstraintsJaxBUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/transport/https/CertConstraintsJaxBUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/transport/https/CertConstraints$Combinator", "org/apache/cxf/transport/https/CertConstraints", "Combinator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createCertConstraints", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Lorg/apache/cxf/transport/https/CertConstraints;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/https/CertConstraintsJaxBUtils", "getSubjectConstraints", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/https/CertConstraintsJaxBUtils", "getSubjectConstraintsCombinator", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Lorg/apache/cxf/transport/https/CertConstraints$Combinator;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/https/CertConstraintsJaxBUtils", "getIssuerConstraints", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/transport/https/CertConstraintsJaxBUtils", "getIssuerConstraintsCombinator", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Lorg/apache/cxf/transport/https/CertConstraints$Combinator;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/https/CertConstraints");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/https/CertConstraints", "<init>", "(Ljava/util/List;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;Ljava/util/List;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSubjectConstraints", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Ljava/util/List;", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "isSetSubjectDNConstraints", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "getSubjectDNConstraints", "()Lorg/apache/cxf/configuration/security/DNConstraintsType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/DNConstraintsType", "getRegularExpression", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIssuerConstraints", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Ljava/util/List;", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "isSetIssuerDNConstraints", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "getIssuerDNConstraints", "()Lorg/apache/cxf/configuration/security/DNConstraintsType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/DNConstraintsType", "getRegularExpression", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSubjectConstraintsCombinator", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Lorg/apache/cxf/transport/https/CertConstraints$Combinator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "isSetSubjectDNConstraints", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "getSubjectDNConstraints", "()Lorg/apache/cxf/configuration/security/DNConstraintsType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/DNConstraintsType", "isSetCombinator", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/DNConstraintsType", "getCombinator", "()Lorg/apache/cxf/configuration/security/CombinatorType;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/configuration/security/CombinatorType", "ANY", "Lorg/apache/cxf/configuration/security/CombinatorType;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/CertConstraints$Combinator", "ANY", "Lorg/apache/cxf/transport/https/CertConstraints$Combinator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/CertConstraints$Combinator", "ALL", "Lorg/apache/cxf/transport/https/CertConstraints$Combinator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getIssuerConstraintsCombinator", "(Lorg/apache/cxf/configuration/security/CertificateConstraintsType;)Lorg/apache/cxf/transport/https/CertConstraints$Combinator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "isSetIssuerDNConstraints", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/CertificateConstraintsType", "getIssuerDNConstraints", "()Lorg/apache/cxf/configuration/security/DNConstraintsType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/DNConstraintsType", "isSetCombinator", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/configuration/security/DNConstraintsType", "getCombinator", "()Lorg/apache/cxf/configuration/security/CombinatorType;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/configuration/security/CombinatorType", "ANY", "Lorg/apache/cxf/configuration/security/CombinatorType;");
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/CertConstraints$Combinator", "ANY", "Lorg/apache/cxf/transport/https/CertConstraints$Combinator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/https/CertConstraints$Combinator", "ALL", "Lorg/apache/cxf/transport/https/CertConstraints$Combinator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
