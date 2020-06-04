package asm.org.yaml.snakeyaml.events;
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
public class Event$IDDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/yaml/snakeyaml/events/Event$ID", "Ljava/lang/Enum<Lorg/yaml/snakeyaml/events/Event$ID;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/yaml/snakeyaml/events/Event$ID", "org/yaml/snakeyaml/events/Event", "ID", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Alias", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DocumentEnd", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DocumentStart", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MappingEnd", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MappingStart", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "Scalar", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SequenceEnd", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SequenceStart", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StreamEnd", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StreamStart", "Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "$VALUES", "[Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/yaml/snakeyaml/events/Event$ID;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/yaml/snakeyaml/events/Event$ID;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/yaml/snakeyaml/events/Event$ID;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/events/Event$ID");
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
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Alias");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "Alias", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DocumentEnd");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "DocumentEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DocumentStart");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "DocumentStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MappingEnd");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "MappingEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MappingStart");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "MappingStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Scalar");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "Scalar", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SequenceEnd");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "SequenceEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SequenceStart");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "SequenceStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StreamEnd");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "StreamEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StreamStart");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/Event$ID", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "StreamStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/yaml/snakeyaml/events/Event$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "Alias", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "DocumentEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "DocumentStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "MappingEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "MappingStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "Scalar", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "SequenceEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "SequenceStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "StreamEnd", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/events/Event$ID", "StreamStart", "Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/yaml/snakeyaml/events/Event$ID", "$VALUES", "[Lorg/yaml/snakeyaml/events/Event$ID;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
