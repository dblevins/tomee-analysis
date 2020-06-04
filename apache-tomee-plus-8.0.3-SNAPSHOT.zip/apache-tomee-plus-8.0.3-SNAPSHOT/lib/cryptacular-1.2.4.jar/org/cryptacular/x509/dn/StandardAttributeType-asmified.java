package asm.org.cryptacular.x509.dn;
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
public class StandardAttributeTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/cryptacular/x509/dn/StandardAttributeType", "Ljava/lang/Enum<Lorg/cryptacular/x509/dn/StandardAttributeType;>;Lorg/cryptacular/x509/dn/AttributeType;", "java/lang/Enum", new String[] { "org/cryptacular/x509/dn/AttributeType" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CommonName", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CountryName", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Description", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DnQualifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DomainComponent", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EmailAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GenerationQualifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GivenName", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Initials", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LocalityName", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Mail", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Name", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OrganizationName", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OrganizationalUnitName", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PostalAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PostalCode", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PostOfficeBox", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SerialNumber", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StateOrProvinceName", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StreetAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Surname", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TelephoneNumber", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Title", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UniqueIdentifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UserId", "Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "oid", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "$VALUES", "[Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/cryptacular/x509/dn/StandardAttributeType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/cryptacular/x509/dn/StandardAttributeType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/x509/dn/StandardAttributeType", "oid", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/x509/dn/StandardAttributeType", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOid", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/dn/StandardAttributeType", "oid", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/dn/StandardAttributeType", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/x509/dn/StandardAttributeType", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromOid", "(Ljava/lang/String;)Lorg/cryptacular/x509/dn/StandardAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "values", "()[Lorg/cryptacular/x509/dn/StandardAttributeType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/cryptacular/x509/dn/StandardAttributeType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/x509/dn/StandardAttributeType", "getOid", "()Ljava/lang/String;", false);
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
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromName", "(Ljava/lang/String;)Lorg/cryptacular/x509/dn/AttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "values", "()[Lorg/cryptacular/x509/dn/StandardAttributeType;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/cryptacular/x509/dn/StandardAttributeType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/cryptacular/x509/dn/AttributeType", "getName", "()Ljava/lang/String;", true);
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
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CommonName");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("2.5.4.3");
methodVisitor.visitLdcInsn("CN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "CommonName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CountryName");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("2.5.4.6");
methodVisitor.visitLdcInsn("C");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "CountryName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Description");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("2.5.4.13");
methodVisitor.visitLdcInsn("DESCRIPTION");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Description", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DnQualifier");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("2.5.4.46");
methodVisitor.visitLdcInsn("DNQUALIFIER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "DnQualifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DomainComponent");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("0.9.2342.19200300.100.1.25");
methodVisitor.visitLdcInsn("DC");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "DomainComponent", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EmailAddress");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("1.2.840.113549.1.9.1");
methodVisitor.visitLdcInsn("EMAILADDRESS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "EmailAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GenerationQualifier");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("2.5.4.44");
methodVisitor.visitLdcInsn("GENERATIONQUALIFIER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "GenerationQualifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GivenName");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("2.5.4.42");
methodVisitor.visitLdcInsn("GIVENNAME");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "GivenName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Initials");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("2.5.4.43");
methodVisitor.visitLdcInsn("INITIALS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Initials", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LocalityName");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("2.5.4.7");
methodVisitor.visitLdcInsn("L");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "LocalityName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Mail");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("0.9.2342.19200300.100.1.3");
methodVisitor.visitLdcInsn("MAIL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Mail", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Name");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("2.5.4.41");
methodVisitor.visitLdcInsn("NAME");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Name", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OrganizationName");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("2.5.4.10");
methodVisitor.visitLdcInsn("O");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "OrganizationName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OrganizationalUnitName");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("2.5.4.11");
methodVisitor.visitLdcInsn("OU");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "OrganizationalUnitName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PostalAddress");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("2.5.4.16");
methodVisitor.visitLdcInsn("POSTALADDRESS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "PostalAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PostalCode");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("2.5.4.17");
methodVisitor.visitLdcInsn("POSTALCODE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "PostalCode", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PostOfficeBox");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("2.5.4.18");
methodVisitor.visitLdcInsn("POSTOFFICEBOX");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "PostOfficeBox", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SerialNumber");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("2.5.4.5");
methodVisitor.visitLdcInsn("SERIALNUMBER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "SerialNumber", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StateOrProvinceName");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("2.5.4.8");
methodVisitor.visitLdcInsn("ST");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "StateOrProvinceName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StreetAddress");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("2.5.4.9");
methodVisitor.visitLdcInsn("STREET");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "StreetAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Surname");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("2.5.4.4");
methodVisitor.visitLdcInsn("SN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Surname", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TelephoneNumber");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("2.5.4.20");
methodVisitor.visitLdcInsn("TELEPHONENUMBER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "TelephoneNumber", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Title");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("2.5.4.12");
methodVisitor.visitLdcInsn("TITLE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Title", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UniqueIdentifier");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitLdcInsn("0.9.2342.19200300.100.1.44");
methodVisitor.visitLdcInsn("UNIQUEIDENTIFIER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "UniqueIdentifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UserId");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitLdcInsn("0.9.2342.19200300.100.1.1");
methodVisitor.visitLdcInsn("UID");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/x509/dn/StandardAttributeType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "UserId", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/cryptacular/x509/dn/StandardAttributeType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "CommonName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "CountryName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Description", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "DnQualifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "DomainComponent", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "EmailAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "GenerationQualifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "GivenName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Initials", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "LocalityName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Mail", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Name", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "OrganizationName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "OrganizationalUnitName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "PostalAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "PostalCode", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "PostOfficeBox", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "SerialNumber", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "StateOrProvinceName", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "StreetAddress", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Surname", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "TelephoneNumber", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "Title", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "UniqueIdentifier", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "UserId", "Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/x509/dn/StandardAttributeType", "$VALUES", "[Lorg/cryptacular/x509/dn/StandardAttributeType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
