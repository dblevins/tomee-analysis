package asm.javax.persistence.criteria;
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
public class Predicate$BooleanOperatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/persistence/criteria/Predicate$BooleanOperator", "Ljava/lang/Enum<Ljavax/persistence/criteria/Predicate$BooleanOperator;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/persistence/criteria/Predicate$BooleanOperator", "javax/persistence/criteria/Predicate", "BooleanOperator", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AND", "Ljavax/persistence/criteria/Predicate$BooleanOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OR", "Ljavax/persistence/criteria/Predicate$BooleanOperator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/persistence/criteria/Predicate$BooleanOperator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/persistence/criteria/Predicate$BooleanOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "$VALUES", "[Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/persistence/criteria/Predicate$BooleanOperator;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/persistence/criteria/Predicate$BooleanOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/persistence/criteria/Predicate$BooleanOperator;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/criteria/Predicate$BooleanOperator");
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
methodVisitor.visitTypeInsn(NEW, "javax/persistence/criteria/Predicate$BooleanOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AND");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/criteria/Predicate$BooleanOperator", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "AND", "Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitTypeInsn(NEW, "javax/persistence/criteria/Predicate$BooleanOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OR");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/criteria/Predicate$BooleanOperator", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "OR", "Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/persistence/criteria/Predicate$BooleanOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "AND", "Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "OR", "Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/criteria/Predicate$BooleanOperator", "$VALUES", "[Ljavax/persistence/criteria/Predicate$BooleanOperator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
