package asm.org.apache.catalina.valves.rewrite;
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
public class QuotedStringTokenizer$WordModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "Ljava/lang/Enum<Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "org/apache/catalina/valves/rewrite/QuotedStringTokenizer", "WordMode", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SPACES", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUOTED", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ESCAPED", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIMPLE", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COMMENT", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "$VALUES", "[Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SPACES");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "SPACES", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUOTED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "QUOTED", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ESCAPED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "ESCAPED", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIMPLE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "SIMPLE", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COMMENT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "COMMENT", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "SPACES", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "QUOTED", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "ESCAPED", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "SIMPLE", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "COMMENT", "Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode", "$VALUES", "[Lorg/apache/catalina/valves/rewrite/QuotedStringTokenizer$WordMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
