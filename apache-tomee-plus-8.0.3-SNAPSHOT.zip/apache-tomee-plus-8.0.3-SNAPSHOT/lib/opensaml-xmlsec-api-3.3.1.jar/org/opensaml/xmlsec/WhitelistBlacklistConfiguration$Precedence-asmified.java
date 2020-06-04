package asm.org.opensaml.xmlsec;
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
public class WhitelistBlacklistConfiguration$PrecedenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "Ljava/lang/Enum<Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "org/opensaml/xmlsec/WhitelistBlacklistConfiguration", "Precedence", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WHITELIST", "Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BLACKLIST", "Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "$VALUES", "[Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence");
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
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WHITELIST");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "WHITELIST", "Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BLACKLIST");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "BLACKLIST", "Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "WHITELIST", "Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "BLACKLIST", "Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence", "$VALUES", "[Lorg/opensaml/xmlsec/WhitelistBlacklistConfiguration$Precedence;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
