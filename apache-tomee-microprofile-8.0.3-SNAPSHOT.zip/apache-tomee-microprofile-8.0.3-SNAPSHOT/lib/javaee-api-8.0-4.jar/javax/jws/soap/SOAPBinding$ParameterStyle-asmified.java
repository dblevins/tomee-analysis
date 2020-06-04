package asm.javax.jws.soap;
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
public class SOAPBinding$ParameterStyleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "javax/jws/soap/SOAPBinding$ParameterStyle", "Ljava/lang/Enum<Ljavax/jws/soap/SOAPBinding$ParameterStyle;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("javax/jws/soap/SOAPBinding$ParameterStyle", "javax/jws/soap/SOAPBinding", "ParameterStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BARE", "Ljavax/jws/soap/SOAPBinding$ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAPPED", "Ljavax/jws/soap/SOAPBinding$ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljavax/jws/soap/SOAPBinding$ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljavax/jws/soap/SOAPBinding$ParameterStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/jws/soap/SOAPBinding$ParameterStyle", "$VALUES", "[Ljavax/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljavax/jws/soap/SOAPBinding$ParameterStyle;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljavax/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljavax/jws/soap/SOAPBinding$ParameterStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/jws/soap/SOAPBinding$ParameterStyle;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jws/soap/SOAPBinding$ParameterStyle");
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
methodVisitor.visitTypeInsn(NEW, "javax/jws/soap/SOAPBinding$ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BARE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jws/soap/SOAPBinding$ParameterStyle", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/jws/soap/SOAPBinding$ParameterStyle", "BARE", "Ljavax/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "javax/jws/soap/SOAPBinding$ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAPPED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/jws/soap/SOAPBinding$ParameterStyle", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/jws/soap/SOAPBinding$ParameterStyle", "WRAPPED", "Ljavax/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/jws/soap/SOAPBinding$ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/jws/soap/SOAPBinding$ParameterStyle", "BARE", "Ljavax/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/jws/soap/SOAPBinding$ParameterStyle", "WRAPPED", "Ljavax/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "javax/jws/soap/SOAPBinding$ParameterStyle", "$VALUES", "[Ljavax/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
