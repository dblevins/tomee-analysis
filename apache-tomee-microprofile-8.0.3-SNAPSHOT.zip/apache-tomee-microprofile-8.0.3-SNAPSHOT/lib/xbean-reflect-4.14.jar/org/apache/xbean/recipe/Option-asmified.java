package asm.org.apache.xbean.recipe;
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
public class OptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/xbean/recipe/Option", "Ljava/lang/Enum<Lorg/apache/xbean/recipe/Option;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRIVATE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STATIC_PROPERTIES", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FIELD_INJECTION", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IGNORE_MISSING_PROPERTIES", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CASE_INSENSITIVE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LAZY_ASSIGNMENT", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRIVATE_CONSTRUCTOR", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRIVATE_FACTORY", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CASE_INSENSITIVE_FACTORY", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NAMED_PARAMETERS", "Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/xbean/recipe/Option;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/xbean/recipe/Option;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "$VALUES", "[Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/xbean/recipe/Option;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/xbean/recipe/Option;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xbean/recipe/Option;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/recipe/Option");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRIVATE_PROPERTIES");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "PRIVATE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STATIC_PROPERTIES");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "STATIC_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FIELD_INJECTION");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "FIELD_INJECTION", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IGNORE_MISSING_PROPERTIES");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "IGNORE_MISSING_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CASE_INSENSITIVE_PROPERTIES");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "CASE_INSENSITIVE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LAZY_ASSIGNMENT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "LAZY_ASSIGNMENT", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRIVATE_CONSTRUCTOR");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "PRIVATE_CONSTRUCTOR", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRIVATE_FACTORY");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "PRIVATE_FACTORY", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CASE_INSENSITIVE_FACTORY");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "CASE_INSENSITIVE_FACTORY", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NAMED_PARAMETERS");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/recipe/Option", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "NAMED_PARAMETERS", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/xbean/recipe/Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "PRIVATE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "STATIC_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "FIELD_INJECTION", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "IGNORE_MISSING_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "CASE_INSENSITIVE_PROPERTIES", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "LAZY_ASSIGNMENT", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "PRIVATE_CONSTRUCTOR", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "PRIVATE_FACTORY", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "CASE_INSENSITIVE_FACTORY", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/recipe/Option", "NAMED_PARAMETERS", "Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/recipe/Option", "$VALUES", "[Lorg/apache/xbean/recipe/Option;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
