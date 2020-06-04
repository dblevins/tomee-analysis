package asm.javax.faces.component;
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
public class UIInput$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/faces/component/UIInput$PropertyKeys", "Ljava/lang/Enum<Ljavax/faces/component/UIInput$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/faces/component/UIInput$PropertyKeys", "javax/faces/component/UIInput", "PropertyKeys", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "localValueSet", "Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "required", "Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "requiredMessage", "Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "converterMessage", "Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "validatorMessage", "Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "valid", "Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "immediate", "Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "$VALUES", "[Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/faces/component/UIInput$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/faces/component/UIInput$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/faces/component/UIInput$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/faces/component/UIInput$PropertyKeys");
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
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("localValueSet");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "localValueSet", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("required");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "required", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("requiredMessage");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "requiredMessage", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("converterMessage");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "converterMessage", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("validatorMessage");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "validatorMessage", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("valid");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "valid", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("immediate");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/UIInput$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "immediate", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/faces/component/UIInput$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "localValueSet", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "required", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "requiredMessage", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "converterMessage", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "validatorMessage", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "valid", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/faces/component/UIInput$PropertyKeys", "immediate", "Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/faces/component/UIInput$PropertyKeys", "$VALUES", "[Ljavax/faces/component/UIInput$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
