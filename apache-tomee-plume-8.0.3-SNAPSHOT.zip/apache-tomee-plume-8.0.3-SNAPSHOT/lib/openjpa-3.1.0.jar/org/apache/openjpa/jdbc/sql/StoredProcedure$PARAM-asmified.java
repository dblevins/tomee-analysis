package asm.org.apache.openjpa.jdbc.sql;
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
public class StoredProcedure$PARAMDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "Ljava/lang/Enum<Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "org/apache/openjpa/jdbc/sql/StoredProcedure", "PARAM", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNKNOW", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INOUT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESULT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OUT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RETURN", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "$VALUES", "[Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNKNOW");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "UNKNOW", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "IN", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INOUT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "INOUT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESULT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "RESULT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OUT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "OUT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RETURN");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "RETURN", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "UNKNOW", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "IN", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "INOUT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "RESULT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "OUT", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "RETURN", "Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/sql/StoredProcedure$PARAM", "$VALUES", "[Lorg/apache/openjpa/jdbc/sql/StoredProcedure$PARAM;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
