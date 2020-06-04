package asm.jakarta.enterprise.inject.spi;
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
public class InterceptionTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/enterprise/inject/spi/InterceptionType", "Ljava/lang/Enum<Ljakarta/enterprise/inject/spi/InterceptionType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AROUND_INVOKE", "Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AROUND_TIMEOUT", "Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AROUND_CONSTRUCT", "Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_CONSTRUCT", "Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_DESTROY", "Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_PASSIVATE", "Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_ACTIVATE", "Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "$VALUES", "[Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/enterprise/inject/spi/InterceptionType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/enterprise/inject/spi/InterceptionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/inject/spi/InterceptionType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/enterprise/inject/spi/InterceptionType");
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
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AROUND_INVOKE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/InterceptionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "AROUND_INVOKE", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AROUND_TIMEOUT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/InterceptionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "AROUND_TIMEOUT", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AROUND_CONSTRUCT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/InterceptionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "AROUND_CONSTRUCT", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_CONSTRUCT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/InterceptionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "POST_CONSTRUCT", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_DESTROY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/InterceptionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "PRE_DESTROY", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_PASSIVATE");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/InterceptionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "PRE_PASSIVATE", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitTypeInsn(NEW, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_ACTIVATE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/inject/spi/InterceptionType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "POST_ACTIVATE", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/enterprise/inject/spi/InterceptionType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "AROUND_INVOKE", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "AROUND_TIMEOUT", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "AROUND_CONSTRUCT", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "POST_CONSTRUCT", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "PRE_DESTROY", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "PRE_PASSIVATE", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "POST_ACTIVATE", "Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/enterprise/inject/spi/InterceptionType", "$VALUES", "[Ljakarta/enterprise/inject/spi/InterceptionType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
