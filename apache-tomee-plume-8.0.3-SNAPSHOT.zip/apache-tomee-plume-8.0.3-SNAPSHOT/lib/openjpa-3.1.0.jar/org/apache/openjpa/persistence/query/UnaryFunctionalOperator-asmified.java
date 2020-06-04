package asm.org.apache.openjpa.persistence.query;
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
public class UnaryFunctionalOperatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ABS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALL", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANY", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AVG", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONCAT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COUNT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISTINCT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXISTS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INDEX", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LENGTH", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOCATE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOWER", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAX", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MIN", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MINUS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIZE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SOME", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SQRT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUBSTR", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUM", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRIM", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TYPE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UPPER", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_symbol", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ABS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("ABS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "ABS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "ALL", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ANY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "ANY", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AVG");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("AVG");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "AVG", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONCAT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("CONCAT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "CONCAT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COUNT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("COUNT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "COUNT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISTINCT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("DISTINCT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "DISTINCT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXISTS");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("EXISTS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "EXISTS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INDEX");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("INDEX");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "INDEX", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LENGTH");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("LENGTH");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "LENGTH", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOCATE");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("LOCATE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "LOCATE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOWER");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("LOWER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "LOWER", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAX");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("MAX");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "MAX", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MIN");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("MIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "MIN", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MINUS");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "MINUS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIZE");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("SIZE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SIZE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SOME");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("SOME");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SOME", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SQRT");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("SQRT");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SQRT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUBSTR");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("SUBSTRING");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SUBSTR", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUM");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("SUM");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SUM", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRIM");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("TRIM");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "TRIM", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TYPE");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("TYPE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "TYPE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UPPER");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("UPPER");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "UPPER", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "ABS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "ALL", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "ANY", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "AVG", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "CONCAT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "COUNT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "DISTINCT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "EXISTS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "INDEX", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "LENGTH", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "LOCATE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "LOWER", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "MAX", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "MIN", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "MINUS", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SIZE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SOME", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SQRT", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SUBSTR", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "SUM", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "TRIM", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "TYPE", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "UPPER", "Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryFunctionalOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/UnaryFunctionalOperator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
