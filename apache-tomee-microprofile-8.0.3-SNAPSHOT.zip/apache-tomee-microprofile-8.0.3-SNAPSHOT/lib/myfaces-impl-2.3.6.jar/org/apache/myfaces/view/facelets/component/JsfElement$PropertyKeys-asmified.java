package asm.org.apache.myfaces.view.facelets.component;
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
public class JsfElement$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "Ljava/lang/Enum<Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "org/apache/myfaces/view/facelets/component/JsfElement", "PropertyKeys", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onload", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onunload", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onchange", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onselect", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onclick", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ondblclick", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeydown", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeypress", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onkeyup", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousedown", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmousemove", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseout", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseover", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onmouseup", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "style", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "styleClass", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onblur", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "onfocus", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onload");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onload", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onunload");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onunload", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onchange");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onchange", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onselect");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onselect", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onclick", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "ondblclick", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onkeydown", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onkeypress", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onkeyup", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmousedown", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmousemove", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseout");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmouseout", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseover");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmouseover", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmouseup", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "style", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "styleClass", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onblur", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("onfocus");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onfocus", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onload", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onunload", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onchange", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onselect", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onclick", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "ondblclick", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onkeydown", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onkeypress", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onkeyup", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmousedown", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmousemove", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmouseout", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmouseover", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onmouseup", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "style", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "styleClass", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onblur", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "onfocus", "Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/view/facelets/component/JsfElement$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
