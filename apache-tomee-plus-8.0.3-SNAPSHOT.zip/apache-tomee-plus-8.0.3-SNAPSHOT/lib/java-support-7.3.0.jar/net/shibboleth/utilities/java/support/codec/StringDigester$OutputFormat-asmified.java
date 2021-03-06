package asm.net.shibboleth.utilities.java.support.codec;
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
public class StringDigester$OutputFormatDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "Ljava/lang/Enum<Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "net/shibboleth/utilities/java/support/codec/StringDigester", "OutputFormat", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BASE64", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEX_LOWER", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HEX_UPPER", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "$VALUES", "[Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat");
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
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BASE64");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "BASE64", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEX_LOWER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "HEX_LOWER", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitTypeInsn(NEW, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HEX_UPPER");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "HEX_UPPER", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "BASE64", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "HEX_LOWER", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "HEX_UPPER", "Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "net/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat", "$VALUES", "[Lnet/shibboleth/utilities/java/support/codec/StringDigester$OutputFormat;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
