package asm.com.sun.faces.el;
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
public class ELUtils$ScopeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/el/ELUtils$Scope", "Ljava/lang/Enum<Lcom/sun/faces/el/ELUtils$Scope;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/el/ELUtils$Scope", "com/sun/faces/el/ELUtils", "Scope", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lcom/sun/faces/el/ELUtils$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUEST", "Lcom/sun/faces/el/ELUtils$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VIEW", "Lcom/sun/faces/el/ELUtils$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SESSION", "Lcom/sun/faces/el/ELUtils$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "APPLICATION", "Lcom/sun/faces/el/ELUtils$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "scope", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/el/ELUtils$Scope;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/el/ELUtils$Scope;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "$VALUES", "[Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/el/ELUtils$Scope;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/el/ELUtils$Scope;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/el/ELUtils$Scope;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/el/ELUtils$Scope");
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
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/el/ELUtils$Scope", "scope", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/el/ELUtils$Scope", "scope", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/ELUtils$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/ELUtils$Scope", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/ELUtils$Scope", "NONE", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/ELUtils$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUEST");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("request");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/ELUtils$Scope", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/ELUtils$Scope", "REQUEST", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/ELUtils$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VIEW");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("view");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/ELUtils$Scope", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/ELUtils$Scope", "VIEW", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/ELUtils$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SESSION");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("session");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/ELUtils$Scope", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/ELUtils$Scope", "SESSION", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/el/ELUtils$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("APPLICATION");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("application");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/el/ELUtils$Scope", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/ELUtils$Scope", "APPLICATION", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/el/ELUtils$Scope");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "NONE", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "REQUEST", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "VIEW", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "SESSION", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/el/ELUtils$Scope", "APPLICATION", "Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/el/ELUtils$Scope", "$VALUES", "[Lcom/sun/faces/el/ELUtils$Scope;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
