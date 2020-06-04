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
public class HtmlSelectManyMenu$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "Ljava/lang/Enum<Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "javax/faces/component/html/HtmlSelectManyMenu", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "accesskey", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "disabled", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "readonly", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onclick", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ondblclick", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeydown", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeypress", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeyup", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousedown", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousemove", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseout", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseover", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseup", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "style", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "styleClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "role", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "label", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "dir", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "lang", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "title", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onblur", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onfocus", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "tabindex", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "disabledClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "enabledClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onchange", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "$VALUES", "[Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
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
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "accesskey", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("disabled");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "disabled", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("readonly");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "readonly", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseout");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseover");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("label");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "label", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("title");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onblur", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onfocus");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onfocus", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("tabindex");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "tabindex", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("disabledClass");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "disabledClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("enabledClass");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "enabledClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onchange");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onchange", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "accesskey", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "disabled", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "readonly", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "label", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onblur", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onfocus", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "tabindex", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "disabledClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "enabledClass", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "onchange", "Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlSelectManyMenu$PropertyKeys", "$VALUES", "[Ljavax/faces/component/html/HtmlSelectManyMenu$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
