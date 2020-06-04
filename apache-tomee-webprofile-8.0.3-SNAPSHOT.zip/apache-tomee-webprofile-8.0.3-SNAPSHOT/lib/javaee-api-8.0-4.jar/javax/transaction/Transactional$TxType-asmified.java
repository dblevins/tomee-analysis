package asm.javax.transaction;
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
public class Transactional$TxTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/transaction/Transactional$TxType", "Ljava/lang/Enum<Ljavax/transaction/Transactional$TxType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/transaction/Transactional$TxType", "javax/transaction/Transactional", "TxType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRED", "Ljavax/transaction/Transactional$TxType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRES_NEW", "Ljavax/transaction/Transactional$TxType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANDATORY", "Ljavax/transaction/Transactional$TxType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUPPORTS", "Ljavax/transaction/Transactional$TxType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_SUPPORTED", "Ljavax/transaction/Transactional$TxType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NEVER", "Ljavax/transaction/Transactional$TxType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/transaction/Transactional$TxType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/transaction/Transactional$TxType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/transaction/Transactional$TxType", "$VALUES", "[Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/transaction/Transactional$TxType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/transaction/Transactional$TxType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/transaction/Transactional$TxType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/transaction/Transactional$TxType");
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
methodVisitor.visitTypeInsn(NEW, "javax/transaction/Transactional$TxType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/Transactional$TxType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/transaction/Transactional$TxType", "REQUIRED", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitTypeInsn(NEW, "javax/transaction/Transactional$TxType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRES_NEW");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/Transactional$TxType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/transaction/Transactional$TxType", "REQUIRES_NEW", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitTypeInsn(NEW, "javax/transaction/Transactional$TxType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANDATORY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/Transactional$TxType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/transaction/Transactional$TxType", "MANDATORY", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitTypeInsn(NEW, "javax/transaction/Transactional$TxType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUPPORTS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/Transactional$TxType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/transaction/Transactional$TxType", "SUPPORTS", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitTypeInsn(NEW, "javax/transaction/Transactional$TxType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_SUPPORTED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/Transactional$TxType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/transaction/Transactional$TxType", "NOT_SUPPORTED", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitTypeInsn(NEW, "javax/transaction/Transactional$TxType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NEVER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/transaction/Transactional$TxType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/transaction/Transactional$TxType", "NEVER", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/transaction/Transactional$TxType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/transaction/Transactional$TxType", "REQUIRED", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/transaction/Transactional$TxType", "REQUIRES_NEW", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/transaction/Transactional$TxType", "MANDATORY", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/transaction/Transactional$TxType", "SUPPORTS", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/transaction/Transactional$TxType", "NOT_SUPPORTED", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/transaction/Transactional$TxType", "NEVER", "Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/transaction/Transactional$TxType", "$VALUES", "[Ljavax/transaction/Transactional$TxType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
