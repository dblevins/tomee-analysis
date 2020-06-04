package asm.org.apache.myfaces.view.facelets;
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
public class ELExpressionCacheModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "Ljava/lang/Enum<Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "noCache", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "strict", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "allowCset", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "always", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "alwaysRecompile", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "$VALUES", "[Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/myfaces/view/facelets/ELExpressionCacheMode");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/ELExpressionCacheMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("noCache");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "noCache", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/ELExpressionCacheMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("strict");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "strict", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/ELExpressionCacheMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("allowCset");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "allowCset", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/ELExpressionCacheMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("always");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "always", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/view/facelets/ELExpressionCacheMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("alwaysRecompile");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "alwaysRecompile", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/myfaces/view/facelets/ELExpressionCacheMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "noCache", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "strict", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "allowCset", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "always", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "alwaysRecompile", "Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/view/facelets/ELExpressionCacheMode", "$VALUES", "[Lorg/apache/myfaces/view/facelets/ELExpressionCacheMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
