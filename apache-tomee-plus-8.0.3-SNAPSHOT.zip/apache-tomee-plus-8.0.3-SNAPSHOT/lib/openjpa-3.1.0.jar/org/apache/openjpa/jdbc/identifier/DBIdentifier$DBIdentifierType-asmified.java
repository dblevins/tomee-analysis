package asm.org.apache.openjpa.jdbc.identifier;
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
public class DBIdentifier$DBIdentifierTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "Ljava/lang/Enum<Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "org/apache/openjpa/jdbc/identifier/DBIdentifier", "DBIdentifierType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TABLE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SCHEMA", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CATALOG", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATABASE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLUMN", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLUMN_DEFINITION", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SEQUENCE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONSTRAINT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INDEX", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FOREIGN_KEY", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONSTANT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROCEDURE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NULL", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "$VALUES", "[Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "DEFAULT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TABLE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "TABLE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SCHEMA");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "SCHEMA", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CATALOG");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "CATALOG", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATABASE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "DATABASE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLUMN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "COLUMN", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLUMN_DEFINITION");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "COLUMN_DEFINITION", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEQUENCE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "SEQUENCE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONSTRAINT");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "CONSTRAINT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INDEX");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "INDEX", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FOREIGN_KEY");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "FOREIGN_KEY", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONSTANT");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "CONSTANT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROCEDURE");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "PROCEDURE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NULL");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "NULL", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "DEFAULT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "TABLE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "SCHEMA", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "CATALOG", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "DATABASE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "COLUMN", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "COLUMN_DEFINITION", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "SEQUENCE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "CONSTRAINT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "INDEX", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "FOREIGN_KEY", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "CONSTANT", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "PROCEDURE", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "NULL", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType", "$VALUES", "[Lorg/apache/openjpa/jdbc/identifier/DBIdentifier$DBIdentifierType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
