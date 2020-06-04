package asm.org.eclipse.microprofile.openapi.annotations.enums;
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
public class ParameterStyleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "Ljava/lang/Enum<Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEFAULT", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MATRIX", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LABEL", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FORM", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SPACEDELIMITED", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PIPEDELIMITED", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEEPOBJECT", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SIMPLE", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "value", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "$VALUES", "[Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "value", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEFAULT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "DEFAULT", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MATRIX");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("matrix");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "MATRIX", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LABEL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("label");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "LABEL", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FORM");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("form");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "FORM", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SPACEDELIMITED");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("spaceDelimited");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "SPACEDELIMITED", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PIPEDELIMITED");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("pipeDelimited");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "PIPEDELIMITED", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEEPOBJECT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("deepObject");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "DEEPOBJECT", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SIMPLE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("simple");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "SIMPLE", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "DEFAULT", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "MATRIX", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "LABEL", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "FORM", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "SPACEDELIMITED", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "PIPEDELIMITED", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "DEEPOBJECT", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "SIMPLE", "Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/microprofile/openapi/annotations/enums/ParameterStyle", "$VALUES", "[Lorg/eclipse/microprofile/openapi/annotations/enums/ParameterStyle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
