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
public class CertConstraintsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/https/CertConstraints", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/transport/https/CertConstraints$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/cxf/transport/https/CertConstraints$DNConstraints", "org/apache/cxf/transport/https/CertConstraints", "DNConstraints", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/transport/https/CertConstraints$Combinator", "org/apache/cxf/transport/https/CertConstraints", "Combinator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "subjectDNConstraints", "Lorg/apache/cxf/transport/https/CertConstraints$DNConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "issuerDNConstraints", "Lorg/apache/cxf/transport/https/CertConstraints$DNConstraints;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;Ljava/util/List;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;)V", "(Ljava/util/List<Ljava/lang/String;>;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;Ljava/util/List<Ljava/lang/String;>;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;)V", new String[] { "java/util/regex/PatternSyntaxException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/https/CertConstraints$DNConstraints");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/https/CertConstraints$DNConstraints", "<init>", "(Ljava/util/List;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/https/CertConstraints", "subjectDNConstraints", "Lorg/apache/cxf/transport/https/CertConstraints$DNConstraints;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/https/CertConstraints$DNConstraints");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/https/CertConstraints$DNConstraints", "<init>", "(Ljava/util/List;Lorg/apache/cxf/transport/https/CertConstraints$Combinator;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/https/CertConstraints", "issuerDNConstraints", "Lorg/apache/cxf/transport/https/CertConstraints$DNConstraints;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "matches", "(Ljava/security/cert/X509Certificate;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/https/CertConstraints", "subjectDNConstraints", "Lorg/apache/cxf/transport/https/CertConstraints$DNConstraints;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getSubjectX500Principal", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/CertConstraints$DNConstraints", "matches", "(Ljavax/security/auth/x500/X500Principal;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/https/CertConstraints", "issuerDNConstraints", "Lorg/apache/cxf/transport/https/CertConstraints$DNConstraints;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/cert/X509Certificate", "getIssuerX500Principal", "()Ljavax/security/auth/x500/X500Principal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/https/CertConstraints$DNConstraints", "matches", "(Ljavax/security/auth/x500/X500Principal;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
