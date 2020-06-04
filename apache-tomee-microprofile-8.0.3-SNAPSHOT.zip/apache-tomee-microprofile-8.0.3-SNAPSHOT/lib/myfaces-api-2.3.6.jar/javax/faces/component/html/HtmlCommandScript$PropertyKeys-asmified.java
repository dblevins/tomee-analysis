package asm.javax.faces.component.html;
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
public class HtmlCommandScript$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "Ljava/lang/Enum<Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/faces/component/html/HtmlCommandScript$PropertyKeys", "javax/faces/component/html/HtmlCommandScript", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "autorun", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "execute", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "name", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onerror", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onevent", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "render", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "resetValues", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "$VALUES", "[Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
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
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("autorun");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "autorun", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("execute");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "execute", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("name");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "name", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onerror");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "onerror", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onevent");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "onevent", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("render");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "render", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("resetValues");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "resetValues", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/faces/component/html/HtmlCommandScript$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "autorun", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "execute", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "name", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "onerror", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "onevent", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "render", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "resetValues", "Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlCommandScript$PropertyKeys", "$VALUES", "[Ljavax/faces/component/html/HtmlCommandScript$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
