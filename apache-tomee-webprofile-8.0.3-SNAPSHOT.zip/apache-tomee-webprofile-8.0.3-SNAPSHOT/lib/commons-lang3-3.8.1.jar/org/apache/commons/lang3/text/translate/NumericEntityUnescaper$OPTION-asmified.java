package asm.org.apache.commons.lang3.text.translate;
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
public class NumericEntityUnescaper$OPTIONDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "Ljava/lang/Enum<Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "org/apache/commons/lang3/text/translate/NumericEntityUnescaper", "OPTION", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "semiColonRequired", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "semiColonOptional", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "errorIfNoSemiColon", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "$VALUES", "[Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("semiColonRequired");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "semiColonRequired", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("semiColonOptional");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "semiColonOptional", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("errorIfNoSemiColon");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "errorIfNoSemiColon", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "semiColonRequired", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "semiColonOptional", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "errorIfNoSemiColon", "Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION", "$VALUES", "[Lorg/apache/commons/lang3/text/translate/NumericEntityUnescaper$OPTION;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
