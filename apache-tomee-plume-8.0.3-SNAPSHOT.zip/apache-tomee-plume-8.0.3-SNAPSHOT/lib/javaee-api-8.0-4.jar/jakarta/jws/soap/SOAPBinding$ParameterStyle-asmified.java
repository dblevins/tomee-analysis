package asm.jakarta.jws.soap;
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

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "Ljava/lang/Enum<Ljakarta/jws/soap/SOAPBinding$ParameterStyle;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/jws/soap/SOAPBinding$ParameterStyle", "jakarta/jws/soap/SOAPBinding", "ParameterStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BARE", "Ljakarta/jws/soap/SOAPBinding$ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WRAPPED", "Ljakarta/jws/soap/SOAPBinding$ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/jws/soap/SOAPBinding$ParameterStyle;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/jws/soap/SOAPBinding$ParameterStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "$VALUES", "[Ljakarta/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/jws/soap/SOAPBinding$ParameterStyle;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/jws/soap/SOAPBinding$ParameterStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/jws/soap/SOAPBinding$ParameterStyle;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/jws/soap/SOAPBinding$ParameterStyle");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/jws/soap/SOAPBinding$ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BARE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "BARE", "Ljakarta/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitTypeInsn(NEW, "jakarta/jws/soap/SOAPBinding$ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WRAPPED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "WRAPPED", "Ljakarta/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/jws/soap/SOAPBinding$ParameterStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "BARE", "Ljakarta/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "WRAPPED", "Ljakarta/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/jws/soap/SOAPBinding$ParameterStyle", "$VALUES", "[Ljakarta/jws/soap/SOAPBinding$ParameterStyle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
