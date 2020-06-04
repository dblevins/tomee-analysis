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
public class UnaryConditionalOperatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXISTS", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXISTS_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ISEMPTY", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ISEMPTY_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ISNULL", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ISNULL_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SOME", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_symbol", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "_symbol", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXISTS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("EXISTS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "EXISTS", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXISTS_NOT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("NOT EXISTS");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "EXISTS_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ISEMPTY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("IS EMPTY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISEMPTY", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ISEMPTY_NOT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("IS NOT EMPTY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISEMPTY_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ISNULL");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("IS NULL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISNULL", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ISNULL_NOT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("IS NOT NULL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISNULL_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SOME");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("SOME");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "SOME", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/query/UnaryConditionalOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "EXISTS", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "EXISTS_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISEMPTY", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISEMPTY_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISNULL", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "ISNULL_NOT", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "SOME", "Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/query/UnaryConditionalOperator", "$VALUES", "[Lorg/apache/openjpa/persistence/query/UnaryConditionalOperator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
