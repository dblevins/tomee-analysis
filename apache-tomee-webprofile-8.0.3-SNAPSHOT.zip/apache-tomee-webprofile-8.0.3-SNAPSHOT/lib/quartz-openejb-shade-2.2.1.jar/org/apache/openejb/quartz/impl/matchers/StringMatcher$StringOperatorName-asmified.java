package asm.org.apache.openejb.quartz.impl.matchers;
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
public class StringMatcher$StringOperatorNameDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER | ACC_ENUM | ACC_ABSTRACT, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "Ljava/lang/Enum<Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "org/apache/openejb/quartz/impl/matchers/StringMatcher", "StringOperatorName", ACC_PUBLIC | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$1", "org/apache/openejb/quartz/impl/matchers/StringMatcher", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$1", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$2", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$3", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$4", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$5", null, null, ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EQUALS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STARTS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENDS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONTAINS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANYTHING", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "$VALUES", "[Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "evaluate", "(Ljava/lang/String;Ljava/lang/String;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILorg/apache/openejb/quartz/impl/matchers/StringMatcher$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EQUALS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$1", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "EQUALS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STARTS_WITH");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$2", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "STARTS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENDS_WITH");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$3", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ENDS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTAINS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$4", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "CONTAINS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANYTHING");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName$5", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ANYTHING", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "EQUALS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "STARTS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ENDS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "CONTAINS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ANYTHING", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "$VALUES", "[Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
