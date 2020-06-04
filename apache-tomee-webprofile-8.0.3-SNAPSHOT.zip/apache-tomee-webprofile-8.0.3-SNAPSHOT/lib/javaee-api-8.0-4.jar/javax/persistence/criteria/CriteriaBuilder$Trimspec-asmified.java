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
public class CriteriaBuilder$TrimspecDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "Ljava/lang/Enum<Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/persistence/criteria/CriteriaBuilder$Trimspec", "javax/persistence/criteria/CriteriaBuilder", "Trimspec", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LEADING", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRAILING", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BOTH", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "$VALUES", "[Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/persistence/criteria/CriteriaBuilder$Trimspec");
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
methodVisitor.visitTypeInsn(NEW, "javax/persistence/criteria/CriteriaBuilder$Trimspec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LEADING");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "LEADING", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitTypeInsn(NEW, "javax/persistence/criteria/CriteriaBuilder$Trimspec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRAILING");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "TRAILING", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitTypeInsn(NEW, "javax/persistence/criteria/CriteriaBuilder$Trimspec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BOTH");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "BOTH", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/persistence/criteria/CriteriaBuilder$Trimspec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "LEADING", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "TRAILING", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "BOTH", "Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/persistence/criteria/CriteriaBuilder$Trimspec", "$VALUES", "[Ljavax/persistence/criteria/CriteriaBuilder$Trimspec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
