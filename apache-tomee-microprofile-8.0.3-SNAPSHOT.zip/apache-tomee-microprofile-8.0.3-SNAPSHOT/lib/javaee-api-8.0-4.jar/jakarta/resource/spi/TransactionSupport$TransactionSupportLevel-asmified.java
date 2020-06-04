package asm.jakarta.resource.spi;
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
public class TransactionSupport$TransactionSupportLevelDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "Ljava/lang/Enum<Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "jakarta/resource/spi/TransactionSupport", "TransactionSupportLevel", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NoTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LocalTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "XATransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "$VALUES", "[Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NoTransaction");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "NoTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LocalTransaction");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "LocalTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("XATransaction");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "XATransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "NoTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "LocalTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "XATransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "$VALUES", "[Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
