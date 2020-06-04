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
public class DumperOptions$ScalarStyleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "Ljava/lang/Enum<Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/yaml/snakeyaml/DumperOptions$ScalarStyle", "org/yaml/snakeyaml/DumperOptions", "ScalarStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DOUBLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SINGLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LITERAL", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FOLDED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PLAIN", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "styleChar", "Ljava/lang/Character;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "$VALUES", "[Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/DumperOptions$ScalarStyle");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/Character;)V", "(Ljava/lang/Character;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "styleChar", "Ljava/lang/Character;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChar", "()Ljava/lang/Character;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "styleChar", "Ljava/lang/Character;");
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
methodVisitor.visitLdcInsn("Scalar style: '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "styleChar", "Ljava/lang/Character;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createStyle", "(Ljava/lang/Character;)Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "PLAIN", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Character", "charValue", "()C", false);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitLookupSwitchInsn(label5, new int[] { 34, 39, 62, 124 }, new Label[] { label1, label2, label3, label4 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "DOUBLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "SINGLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "LITERAL", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "FOLDED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/error/YAMLException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unknown scalar style character: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/error/YAMLException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$ScalarStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DOUBLE_QUOTED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "<init>", "(Ljava/lang/String;ILjava/lang/Character;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "DOUBLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$ScalarStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SINGLE_QUOTED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "<init>", "(Ljava/lang/String;ILjava/lang/Character;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "SINGLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$ScalarStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LITERAL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 124);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "<init>", "(Ljava/lang/String;ILjava/lang/Character;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "LITERAL", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$ScalarStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FOLDED");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "<init>", "(Ljava/lang/String;ILjava/lang/Character;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "FOLDED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/DumperOptions$ScalarStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PLAIN");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "<init>", "(Ljava/lang/String;ILjava/lang/Character;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "PLAIN", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/yaml/snakeyaml/DumperOptions$ScalarStyle");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "DOUBLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "SINGLE_QUOTED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "LITERAL", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "FOLDED", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "PLAIN", "Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/DumperOptions$ScalarStyle", "$VALUES", "[Lorg/yaml/snakeyaml/DumperOptions$ScalarStyle;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
