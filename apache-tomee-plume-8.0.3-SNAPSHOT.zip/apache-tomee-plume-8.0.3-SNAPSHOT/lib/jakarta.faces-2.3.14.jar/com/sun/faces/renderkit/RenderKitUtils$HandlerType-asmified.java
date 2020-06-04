package asm.com.sun.faces.renderkit;
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
public class RenderKitUtils$HandlerTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "Ljava/lang/Enum<Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/renderkit/RenderKitUtils$HandlerType", "com/sun/faces/renderkit/RenderKitUtils", "HandlerType", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USER_HANDLER_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SINGLE_BEHAVIOR_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUBMIT_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CHAIN", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "$VALUES", "[Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/renderkit/RenderKitUtils$HandlerType");
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
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$HandlerType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USER_HANDLER_ONLY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "USER_HANDLER_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$HandlerType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SINGLE_BEHAVIOR_ONLY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "SINGLE_BEHAVIOR_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$HandlerType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUBMIT_ONLY");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "SUBMIT_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/renderkit/RenderKitUtils$HandlerType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CHAIN");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "CHAIN", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/renderkit/RenderKitUtils$HandlerType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "USER_HANDLER_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "SINGLE_BEHAVIOR_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "SUBMIT_ONLY", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "CHAIN", "Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/renderkit/RenderKitUtils$HandlerType", "$VALUES", "[Lcom/sun/faces/renderkit/RenderKitUtils$HandlerType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
