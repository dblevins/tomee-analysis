package asm.com.sun.faces.facelets.tag;
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
public class DefaultTagDecorator$NamespaceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "Ljava/lang/Enum<Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "com/sun/faces/facelets/tag/DefaultTagDecorator", "Namespace", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "p", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "jsf", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "h", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "uri", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "$VALUES", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace");
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
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "uri", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "(Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "uri", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("p");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf/passthrough");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "p", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jsf");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/jsf");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "jsf", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("h");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("http://java.sun.com/jsf/html");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "h", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "p", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "jsf", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "h", "Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/DefaultTagDecorator$Namespace", "$VALUES", "[Lcom/sun/faces/facelets/tag/DefaultTagDecorator$Namespace;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
