package asm.jakarta.faces.component.html;
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
public class HtmlInputFile$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "Ljava/lang/Enum<Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "jakarta/faces/component/html/HtmlInputFile", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "maxlength", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "size", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "autocomplete", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "accesskey", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onselect", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "disabled", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "readonly", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onclick", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ondblclick", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeydown", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeypress", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeyup", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousedown", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousemove", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseout", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseover", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseup", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "style", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "styleClass", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "role", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "label", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "alt", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "dir", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "lang", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "title", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onblur", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onfocus", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "tabindex", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onchange", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "$VALUES", "[Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("maxlength");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "maxlength", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("size");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "size", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("autocomplete");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "autocomplete", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "accesskey", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onselect");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onselect", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("disabled");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "disabled", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("readonly");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "readonly", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseout");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseover");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "role", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("label");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "label", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("alt");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "alt", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "dir", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "lang", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("title");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "title", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onblur", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onfocus");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onfocus", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("tabindex");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "tabindex", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onchange");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onchange", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "maxlength", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "size", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "autocomplete", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "accesskey", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onselect", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "disabled", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "readonly", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "role", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "label", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "alt", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "dir", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "lang", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "title", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onblur", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onfocus", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "tabindex", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "onchange", "Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlInputFile$PropertyKeys", "$VALUES", "[Ljakarta/faces/component/html/HtmlInputFile$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}