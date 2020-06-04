package asm.org.eclipse.persistence.jpa.jpql;
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
public class LiteralTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/jpa/jpql/LiteralType", "Ljava/lang/Enum<Lorg/eclipse/persistence/jpa/jpql/LiteralType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ABSTRACT_SCHEMA_NAME", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTITY_TYPE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IDENTIFICATION_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INPUT_PARAMETER", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PATH_EXPRESSION_ALL_PATH", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PATH_EXPRESSION_IDENTIFICATION_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PATH_EXPRESSION_LAST_PATH", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RESULT_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STRING_LITERAL", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ABSTRACT_SCHEMA_NAME");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "ABSTRACT_SCHEMA_NAME", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTITY_TYPE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "ENTITY_TYPE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IDENTIFICATION_VARIABLE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "IDENTIFICATION_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INPUT_PARAMETER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "INPUT_PARAMETER", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PATH_EXPRESSION_ALL_PATH");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "PATH_EXPRESSION_ALL_PATH", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PATH_EXPRESSION_IDENTIFICATION_VARIABLE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "PATH_EXPRESSION_IDENTIFICATION_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PATH_EXPRESSION_LAST_PATH");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "PATH_EXPRESSION_LAST_PATH", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RESULT_VARIABLE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "RESULT_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STRING_LITERAL");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jpa/jpql/LiteralType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "STRING_LITERAL", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "ABSTRACT_SCHEMA_NAME", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "ENTITY_TYPE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "IDENTIFICATION_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "INPUT_PARAMETER", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "PATH_EXPRESSION_ALL_PATH", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "PATH_EXPRESSION_IDENTIFICATION_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "PATH_EXPRESSION_LAST_PATH", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "RESULT_VARIABLE", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "STRING_LITERAL", "Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jpa/jpql/LiteralType", "ENUM$VALUES", "[Lorg/eclipse/persistence/jpa/jpql/LiteralType;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/jpa/jpql/LiteralType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jpa/jpql/LiteralType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jpa/jpql/LiteralType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
