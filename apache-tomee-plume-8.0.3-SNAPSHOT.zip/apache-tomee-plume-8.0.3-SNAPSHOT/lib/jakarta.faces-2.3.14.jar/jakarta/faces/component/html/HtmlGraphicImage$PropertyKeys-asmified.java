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
public class HtmlGraphicImage$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "Ljava/lang/Enum<Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "jakarta/faces/component/html/HtmlGraphicImage", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "alt", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "dir", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "height", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ismap", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "lang", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "longdesc", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onclick", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ondblclick", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeydown", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeypress", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeyup", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousedown", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousemove", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseout", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseover", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseup", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "role", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "style", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "styleClass", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "title", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "usemap", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "width", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "toString", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "$VALUES", "[Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
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
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "toString", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "toString", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "toString", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("alt");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "alt", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "dir", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("height");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "height", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ismap");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "ismap", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "lang", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("longdesc");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "longdesc", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseout");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseover");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "role", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("title");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "title", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("usemap");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "usemap", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("width");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "width", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "alt", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "dir", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "height", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "ismap", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "lang", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "longdesc", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onclick", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "ondblclick", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onkeydown", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onkeypress", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onkeyup", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmousedown", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmousemove", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmouseout", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmouseover", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "onmouseup", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "role", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "style", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "styleClass", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "title", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "usemap", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "width", "Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/html/HtmlGraphicImage$PropertyKeys", "$VALUES", "[Ljakarta/faces/component/html/HtmlGraphicImage$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
