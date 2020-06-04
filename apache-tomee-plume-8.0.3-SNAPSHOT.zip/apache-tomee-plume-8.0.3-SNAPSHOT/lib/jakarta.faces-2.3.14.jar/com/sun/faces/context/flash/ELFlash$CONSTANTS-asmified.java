package asm.com.sun.faces.context.flash;
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
public class ELFlash$CONSTANTSDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "Ljava/lang/Enum<Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/context/flash/ELFlash$CONSTANTS", "com/sun/faces/context/flash/ELFlash", "CONSTANTS", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RequestFlashManager", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SavedResponseCompleteFlagValue", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FacesMessageAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeepAllMessagesAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KeepFlagAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DidWriteCookieAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ForceSetMaxAgeZero", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "$VALUES", "[Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
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
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RequestFlashManager");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "RequestFlashManager", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SavedResponseCompleteFlagValue");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "SavedResponseCompleteFlagValue", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FacesMessageAttributeName");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "FacesMessageAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeepAllMessagesAttributeName");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "KeepAllMessagesAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KeepFlagAttributeName");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "KeepFlagAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DidWriteCookieAttributeName");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "DidWriteCookieAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ForceSetMaxAgeZero");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "ForceSetMaxAgeZero", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/context/flash/ELFlash$CONSTANTS");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "RequestFlashManager", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "SavedResponseCompleteFlagValue", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "FacesMessageAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "KeepAllMessagesAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "KeepFlagAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "DidWriteCookieAttributeName", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "ForceSetMaxAgeZero", "Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/flash/ELFlash$CONSTANTS", "$VALUES", "[Lcom/sun/faces/context/flash/ELFlash$CONSTANTS;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
