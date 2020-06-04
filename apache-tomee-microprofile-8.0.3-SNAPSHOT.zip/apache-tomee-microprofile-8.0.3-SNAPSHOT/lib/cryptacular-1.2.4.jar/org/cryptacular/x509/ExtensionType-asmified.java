package asm.org.cryptacular.x509;
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
public class ExtensionTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/cryptacular/x509/ExtensionType", "Ljava/lang/Enum<Lorg/cryptacular/x509/ExtensionType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AuthorityInformationAccess", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AuthorityKeyIdentifier", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BasicConstraints", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CertificatePolicies", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CRLDistributionPoints", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ExtendedKeyUsage", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IssuerAlternativeName", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeyUsage", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NameConstraints", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PolicyConstraints", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PolicyMappings", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PrivateKeyUsagePeriod", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SubjectAlternativeName", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SubjectKeyIdentifier", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SubjectDirectoryAttributes", "Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "oid", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "critical", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/cryptacular/x509/ExtensionType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/cryptacular/x509/ExtensionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "$VALUES", "[Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/cryptacular/x509/ExtensionType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/cryptacular/x509/ExtensionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/cryptacular/x509/ExtensionType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "(Ljava/lang/String;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/x509/ExtensionType", "oid", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/x509/ExtensionType", "critical", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromOid", "(Ljava/lang/String;)Lorg/cryptacular/x509/ExtensionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/x509/ExtensionType", "values", "()[Lorg/cryptacular/x509/ExtensionType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/cryptacular/x509/ExtensionType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/x509/ExtensionType", "getOid", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid X.509v3 extension OID ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromName", "(Ljava/lang/String;)Lorg/cryptacular/x509/ExtensionType;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/IllegalArgumentException");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/cryptacular/x509/ExtensionType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/x509/ExtensionType", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/IllegalArgumentException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Invalid X.509v3 extension name ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isCritical", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/ExtensionType", "critical", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOid", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/ExtensionType", "oid", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AuthorityInformationAccess");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("1.3.6.1.5.5.7.1.1");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "AuthorityInformationAccess", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AuthorityKeyIdentifier");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("2.5.29.35");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "AuthorityKeyIdentifier", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BasicConstraints");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("2.5.29.19");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "BasicConstraints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CertificatePolicies");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("2.5.29.32");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "CertificatePolicies", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CRLDistributionPoints");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("2.5.29.31");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "CRLDistributionPoints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ExtendedKeyUsage");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("2.5.29.37");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "ExtendedKeyUsage", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IssuerAlternativeName");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("2.5.29.18");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "IssuerAlternativeName", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeyUsage");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("2.5.29.15");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "KeyUsage", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NameConstraints");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("2.5.29.30");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "NameConstraints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PolicyConstraints");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("2.5.29.36");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "PolicyConstraints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PolicyMappings");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("2.5.29.33");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "PolicyMappings", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PrivateKeyUsagePeriod");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("2.5.29.16");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "PrivateKeyUsagePeriod", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SubjectAlternativeName");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("2.5.29.17");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "SubjectAlternativeName", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SubjectKeyIdentifier");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("2.5.29.14");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "SubjectKeyIdentifier", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SubjectDirectoryAttributes");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("2.5.29.9");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/ExtensionType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "SubjectDirectoryAttributes", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/cryptacular/x509/ExtensionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "AuthorityInformationAccess", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "AuthorityKeyIdentifier", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "BasicConstraints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "CertificatePolicies", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "CRLDistributionPoints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "ExtendedKeyUsage", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "IssuerAlternativeName", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "KeyUsage", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "NameConstraints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "PolicyConstraints", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "PolicyMappings", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "PrivateKeyUsagePeriod", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "SubjectAlternativeName", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "SubjectKeyIdentifier", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/ExtensionType", "SubjectDirectoryAttributes", "Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/ExtensionType", "$VALUES", "[Lorg/cryptacular/x509/ExtensionType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
