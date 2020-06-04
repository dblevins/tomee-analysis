package asm.com.sun.faces.context;
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
public class ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIESDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "Ljava/lang/Enum<Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "com/sun/faces/context/ExternalContextImpl", "ALLOWABLE_COOKIE_PROPERTIES", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "domain", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "maxAge", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "path", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "secure", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "httpOnly", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "$VALUES", "[Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES");
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
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("domain");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "domain", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("maxAge");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "maxAge", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("path");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "path", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("secure");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "secure", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("httpOnly");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "httpOnly", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "domain", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "maxAge", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "path", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "secure", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "httpOnly", "Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES", "$VALUES", "[Lcom/sun/faces/context/ExternalContextImpl$ALLOWABLE_COOKIE_PROPERTIES;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
