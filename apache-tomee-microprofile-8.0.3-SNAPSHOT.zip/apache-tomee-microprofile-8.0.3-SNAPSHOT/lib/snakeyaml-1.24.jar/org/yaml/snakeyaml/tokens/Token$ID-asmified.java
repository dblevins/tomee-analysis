package asm.org.yaml.snakeyaml.tokens;
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
public class Token$IDDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/yaml/snakeyaml/tokens/Token$ID", "Ljava/lang/Enum<Lorg/yaml/snakeyaml/tokens/Token$ID;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/yaml/snakeyaml/tokens/Token$ID", "org/yaml/snakeyaml/tokens/Token", "ID", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Alias", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Anchor", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BlockEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BlockEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BlockMappingStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BlockSequenceStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Directive", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DocumentEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DocumentStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FlowEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FlowMappingEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FlowMappingStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FlowSequenceEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FlowSequenceStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Key", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Scalar", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StreamEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StreamStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Tag", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Value", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Whitespace", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Comment", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Error", "Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "description", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "$VALUES", "[Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/yaml/snakeyaml/tokens/Token$ID;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/yaml/snakeyaml/tokens/Token$ID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/yaml/snakeyaml/tokens/Token$ID;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/tokens/Token$ID");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/tokens/Token$ID", "description", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/tokens/Token$ID", "description", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Alias");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("<alias>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Alias", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Anchor");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("<anchor>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Anchor", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BlockEnd");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("<block end>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BlockEntry");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BlockMappingStart");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("<block mapping start>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockMappingStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BlockSequenceStart");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("<block sequence start>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockSequenceStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Directive");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("<directive>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Directive", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DocumentEnd");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("<document end>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "DocumentEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DocumentStart");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("<document start>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "DocumentStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FlowEntry");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn(",");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FlowMappingEnd");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("}");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowMappingEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FlowMappingStart");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("{");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowMappingStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FlowSequenceEnd");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowSequenceEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FlowSequenceStart");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("[");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowSequenceStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Key");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("?");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Key", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Scalar");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("<scalar>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Scalar", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StreamEnd");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("<stream end>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "StreamEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StreamStart");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("<stream start>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "StreamStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Tag");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("<tag>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Tag", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Value");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn(":");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Value", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Whitespace");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("<whitespace>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Whitespace", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Comment");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("#");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Comment", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Error");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitLdcInsn("<error>");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/tokens/Token$ID", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Error", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Alias", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Anchor", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockMappingStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockSequenceStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Directive", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "DocumentEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "DocumentStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowMappingEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowMappingStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowSequenceEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "FlowSequenceStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Key", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Scalar", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "StreamEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "StreamStart", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Tag", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Value", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Whitespace", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Comment", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Error", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "$VALUES", "[Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
