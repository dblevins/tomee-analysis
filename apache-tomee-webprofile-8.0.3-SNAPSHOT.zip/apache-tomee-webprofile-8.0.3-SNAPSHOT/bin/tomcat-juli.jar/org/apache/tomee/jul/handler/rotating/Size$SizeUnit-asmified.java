package asm.org.apache.tomee.jul.handler.rotating;
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
public class Size$SizeUnitDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ENUM, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "Ljava/lang/Enum<Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "org/apache/tomee/jul/handler/rotating/Size", "SizeUnit", ACC_PRIVATE | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$SizeUnit$5", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$SizeUnit$4", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$SizeUnit$3", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$SizeUnit$2", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$SizeUnit$1", null, null, ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomee/jul/handler/rotating/Size$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KILOBYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MEGABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GIGABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TERABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "B0", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "B1", "J", null, new Long(1024L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "B2", "J", null, new Long(1048576L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "B3", "J", null, new Long(1073741824L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "B4", "J", null, new Long(1099511627776L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "$VALUES", "[Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit");
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "x", "(JJJ)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitLdcInsn(new Long(9223372036854775807L));
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 4);
methodVisitor.visitInsn(LNEG);
methodVisitor.visitInsn(LCMP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFGE, label1);
methodVisitor.visitLdcInsn(new Long(-9223372036854775808L));
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitInsn(LMUL);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toBytes", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/AbstractMethodError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AbstractMethodError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toKilobytes", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/AbstractMethodError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AbstractMethodError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toMegabytes", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/AbstractMethodError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AbstractMethodError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toGigabytes", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/AbstractMethodError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AbstractMethodError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toTerabytes", "(J)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/AbstractMethodError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AbstractMethodError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "convert", "(JLorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;)J", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/AbstractMethodError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AbstractMethodError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/String;ILorg/apache/tomee/jul/handler/rotating/Size$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BYTES");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$1", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "BYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KILOBYTES");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$2", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "KILOBYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$3");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MEGABYTES");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$3", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "MEGABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$4");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GIGABYTES");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$4", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "GIGABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$5");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TERABYTES");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit$5", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "TERABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "BYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "KILOBYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "MEGABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "GIGABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "TERABYTES", "Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomee/jul/handler/rotating/Size$SizeUnit", "$VALUES", "[Lorg/apache/tomee/jul/handler/rotating/Size$SizeUnit;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
