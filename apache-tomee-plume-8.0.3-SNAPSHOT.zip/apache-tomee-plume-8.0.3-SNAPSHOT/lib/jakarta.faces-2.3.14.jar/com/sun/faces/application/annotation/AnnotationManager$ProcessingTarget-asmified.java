package asm.com.sun.faces.application.annotation;
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
public class AnnotationManager$ProcessingTargetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Ljava/lang/Enum<Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "com/sun/faces/application/annotation/AnnotationManager", "ProcessingTarget", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Behavior", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ClientBehaviorRenderer", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UIComponent", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Validator", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Converter", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Renderer", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SystemEvent", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "scanners", "[Lcom/sun/faces/application/annotation/Scanner;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "$VALUES", "[Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", "([Lcom/sun/faces/application/annotation/Scanner;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "scanners", "[Lcom/sun/faces/application/annotation/Scanner;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;)[Lcom/sun/faces/application/annotation/Scanner;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "scanners", "[Lcom/sun/faces/application/annotation/Scanner;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Behavior");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/annotation/AnnotationManager", "access$000", "()[Lcom/sun/faces/application/annotation/Scanner;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Behavior", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ClientBehaviorRenderer");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/annotation/AnnotationManager", "access$100", "()[Lcom/sun/faces/application/annotation/Scanner;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "ClientBehaviorRenderer", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UIComponent");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/annotation/AnnotationManager", "access$200", "()[Lcom/sun/faces/application/annotation/Scanner;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "UIComponent", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Validator");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/annotation/AnnotationManager", "access$300", "()[Lcom/sun/faces/application/annotation/Scanner;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Validator", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Converter");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/annotation/AnnotationManager", "access$400", "()[Lcom/sun/faces/application/annotation/Scanner;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Converter", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Renderer");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/annotation/AnnotationManager", "access$500", "()[Lcom/sun/faces/application/annotation/Scanner;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Renderer", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SystemEvent");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/annotation/AnnotationManager", "access$600", "()[Lcom/sun/faces/application/annotation/Scanner;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "<init>", "(Ljava/lang/String;I[Lcom/sun/faces/application/annotation/Scanner;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "SystemEvent", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Behavior", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "ClientBehaviorRenderer", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "UIComponent", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Validator", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Converter", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "Renderer", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "SystemEvent", "Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/annotation/AnnotationManager$ProcessingTarget", "$VALUES", "[Lcom/sun/faces/application/annotation/AnnotationManager$ProcessingTarget;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
