package asm.jakarta.xml.ws.soap;
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
public class AddressingFeature$ResponsesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/xml/ws/soap/AddressingFeature$Responses", "Ljava/lang/Enum<Ljakarta/xml/ws/soap/AddressingFeature$Responses;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/xml/ws/soap/AddressingFeature$Responses", "jakarta/xml/ws/soap/AddressingFeature", "Responses", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANONYMOUS", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NON_ANONYMOUS", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALL", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/xml/ws/soap/AddressingFeature$Responses;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/xml/ws/soap/AddressingFeature$Responses;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "$VALUES", "[Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/xml/ws/soap/AddressingFeature$Responses;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/xml/ws/soap/AddressingFeature$Responses;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/xml/ws/soap/AddressingFeature$Responses;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/ws/soap/AddressingFeature$Responses");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/soap/AddressingFeature$Responses");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANONYMOUS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/soap/AddressingFeature$Responses", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "ANONYMOUS", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/soap/AddressingFeature$Responses");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NON_ANONYMOUS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/soap/AddressingFeature$Responses", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "NON_ANONYMOUS", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/ws/soap/AddressingFeature$Responses");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/ws/soap/AddressingFeature$Responses", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "ALL", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/xml/ws/soap/AddressingFeature$Responses");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "ANONYMOUS", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "NON_ANONYMOUS", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "ALL", "Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/xml/ws/soap/AddressingFeature$Responses", "$VALUES", "[Ljakarta/xml/ws/soap/AddressingFeature$Responses;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
