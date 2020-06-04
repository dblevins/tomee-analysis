package asm.org.bouncycastle.crypto;
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
public class PasswordConverterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ENUM | ACC_ABSTRACT, "org/bouncycastle/crypto/PasswordConverter", "Ljava/lang/Enum<Lorg/bouncycastle/crypto/PasswordConverter;>;Lorg/bouncycastle/crypto/CharToByteConverter;", "java/lang/Enum", new String[] { "org/bouncycastle/crypto/CharToByteConverter" });

classWriter.visitInnerClass("org/bouncycastle/crypto/PasswordConverter$1", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/crypto/PasswordConverter$2", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/bouncycastle/crypto/PasswordConverter$3", null, null, ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ASCII", "Lorg/bouncycastle/crypto/PasswordConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UTF8", "Lorg/bouncycastle/crypto/PasswordConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PKCS12", "Lorg/bouncycastle/crypto/PasswordConverter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/bouncycastle/crypto/PasswordConverter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/bouncycastle/crypto/PasswordConverter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/PasswordConverter", "$VALUES", "[Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/bouncycastle/crypto/PasswordConverter;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/bouncycastle/crypto/PasswordConverter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/crypto/PasswordConverter;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/PasswordConverter");
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
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILorg/bouncycastle/crypto/PasswordConverter$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/PasswordConverter", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/PasswordConverter$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ASCII");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/PasswordConverter$1", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/PasswordConverter", "ASCII", "Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/PasswordConverter$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UTF8");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/PasswordConverter$2", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/PasswordConverter", "UTF8", "Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/PasswordConverter$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PKCS12");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/PasswordConverter$3", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/PasswordConverter", "PKCS12", "Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/crypto/PasswordConverter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/PasswordConverter", "ASCII", "Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/PasswordConverter", "UTF8", "Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/bouncycastle/crypto/PasswordConverter", "PKCS12", "Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/PasswordConverter", "$VALUES", "[Lorg/bouncycastle/crypto/PasswordConverter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
