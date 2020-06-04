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
public class BinaryConditionalOperatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BETWEEN", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BETWEEN_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EQUAL_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GREATER", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GREATEREQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IN_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LESS", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LESSEQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LIKE", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LIKE_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MEMBER", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MEMBER_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_symbol", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BETWEEN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("BETWEEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "BETWEEN", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BETWEEN_NOT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("NOT BETWEEN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "BETWEEN_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EQUAL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("=");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "EQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EQUAL_NOT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("<>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "EQUAL_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GREATER");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn(">");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "GREATER", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GREATEREQUAL");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(">=");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "GREATEREQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("IN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "IN", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IN_NOT");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("NOT IN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "IN_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LESS");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("<");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LESS", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LESSEQUAL");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("<=");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LESSEQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LIKE");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("LIKE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LIKE", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LIKE_NOT");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("NOT LIKE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LIKE_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MEMBER");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("MEMBER OF");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "MEMBER", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MEMBER_NOT");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("NOT MEMBER OF");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "MEMBER_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/query/BinaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "BETWEEN", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "BETWEEN_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "EQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "EQUAL_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "GREATER", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "GREATEREQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "IN", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "IN_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LESS", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LESSEQUAL", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LIKE", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "LIKE_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "MEMBER", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "MEMBER_NOT", "Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/BinaryConditionalOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/BinaryConditionalOperator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
