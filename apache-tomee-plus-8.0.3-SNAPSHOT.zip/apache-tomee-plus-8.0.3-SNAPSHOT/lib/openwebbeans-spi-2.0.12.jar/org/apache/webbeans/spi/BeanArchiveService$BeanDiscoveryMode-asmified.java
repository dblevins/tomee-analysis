package asm.org.apache.webbeans.spi;
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
public class BeanArchiveService$BeanDiscoveryModeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "Ljava/lang/Enum<Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "org/apache/webbeans/spi/BeanArchiveService", "BeanDiscoveryMode", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRIM", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALL", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANNOTATED", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "ordinal", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "$VALUES", "[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;II)V", "(I)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "ordinal", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrdinal", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "ordinal", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getByOrdinal", "(I)Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "values", "()[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "getOrdinal", "()I", false);
methodVisitor.visitVarInsn(ILOAD, 0);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "max", "(Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;)Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "getOrdinal", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "getOrdinal", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "getByOrdinal", "(I)Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRIM");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "TRIM", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "ALL", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANNOTATED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "ANNOTATED", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitTypeInsn(NEW, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "<init>", "(Ljava/lang/String;II)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "NONE", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "TRIM", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "ALL", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "ANNOTATED", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "NONE", "Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode", "$VALUES", "[Lorg/apache/webbeans/spi/BeanArchiveService$BeanDiscoveryMode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
