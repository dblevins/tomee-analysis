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
public class UIRepeat$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "Ljava/lang/Enum<Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "org/apache/myfaces/view/facelets/component/UIRepeat", "PropertyKeys", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "value", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "var", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "size", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "varStatus", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "offset", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "step", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "begin", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "end", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "value", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("var");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "var", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("size");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "size", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("varStatus");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "varStatus", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("offset");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "offset", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("step");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "step", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("begin");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "begin", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("end");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "end", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "value", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "var", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "size", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "varStatus", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "offset", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "step", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "begin", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "end", "Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys", "$VALUES", "[Lorg/apache/myfaces/view/facelets/component/UIRepeat$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
