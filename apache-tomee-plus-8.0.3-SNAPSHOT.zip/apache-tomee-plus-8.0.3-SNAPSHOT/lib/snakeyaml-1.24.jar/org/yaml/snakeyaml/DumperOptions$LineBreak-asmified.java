package asm.org.yaml.snakeyaml;
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
public class DumperOptions$LineBreakDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/yaml/snakeyaml/DumperOptions$LineBreak", "Ljava/lang/Enum<Lorg/yaml/snakeyaml/DumperOptions$LineBreak;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/yaml/snakeyaml/DumperOptions$LineBreak", "org/yaml/snakeyaml/DumperOptions", "LineBreak", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WIN", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAC", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNIX", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "lineBreak", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "$VALUES", "[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/yaml/snakeyaml/DumperOptions$LineBreak;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/DumperOptions$LineBreak");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/DumperOptions$LineBreak", "lineBreak", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/DumperOptions$LineBreak", "lineBreak", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Line break: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/DumperOptions$LineBreak", "name", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getPlatformLineBreak", "()Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("line.separator");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "values", "()[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"java/lang/String", "[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/DumperOptions$LineBreak", "lineBreak", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "UNIX", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$LineBreak");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WIN");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("\r\n");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$LineBreak", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "WIN", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$LineBreak");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("\r");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$LineBreak", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "MAC", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$LineBreak");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNIX");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("\n");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$LineBreak", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "UNIX", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/yaml/snakeyaml/DumperOptions$LineBreak");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "WIN", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "MAC", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "UNIX", "Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$LineBreak", "$VALUES", "[Lorg/yaml/snakeyaml/DumperOptions$LineBreak;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
