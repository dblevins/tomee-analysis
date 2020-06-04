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
public class HtmlOutputLabel$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "Ljava/lang/Enum<Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "javax/faces/component/html/HtmlOutputLabel", "PropertyKeys", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "forVal", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "accesskey", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "escape", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onclick", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ondblclick", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeydown", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeypress", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeyup", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousedown", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousemove", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseout", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseover", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseup", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "style", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "styleClass", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "role", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "dir", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "lang", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "title", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onblur", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onfocus", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "tabindex", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "c", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "$VALUES", "[Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "c", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "c", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "c", "Ljava/lang/String;");
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
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("forVal");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("for");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "forVal", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "accesskey", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("escape");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "escape", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseout");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseover");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("title");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onblur", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onfocus");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onfocus", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("tabindex");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "tabindex", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "forVal", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "accesskey", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "escape", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onclick", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "ondblclick", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onkeydown", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onkeypress", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onkeyup", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmousedown", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmousemove", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmouseout", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmouseover", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onmouseup", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "style", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "styleClass", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "role", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "dir", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "lang", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "title", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onblur", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "onfocus", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "tabindex", "Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/html/HtmlOutputLabel$PropertyKeys", "$VALUES", "[Ljavax/faces/component/html/HtmlOutputLabel$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
