package asm.org.yaml.snakeyaml.emitter;
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
public class Emitter$ExpectBlockMappingKeyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", null, "java/lang/Object", new String[] { "org/yaml/snakeyaml/emitter/EmitterState" });

classWriter.visitInnerClass("org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "org/yaml/snakeyaml/emitter/Emitter", "ExpectBlockMappingKey", ACC_PRIVATE);

classWriter.visitInnerClass("org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingSimpleValue", "org/yaml/snakeyaml/emitter/Emitter", "ExpectBlockMappingSimpleValue", ACC_PRIVATE);

classWriter.visitInnerClass("org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingValue", "org/yaml/snakeyaml/emitter/Emitter", "ExpectBlockMappingValue", ACC_PRIVATE);

classWriter.visitInnerClass("org/yaml/snakeyaml/emitter/Emitter$1", "org/yaml/snakeyaml/emitter/Emitter", null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "first", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitter;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "first", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "expect", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "first", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$100", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Lorg/yaml/snakeyaml/events/Event;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/yaml/snakeyaml/events/MappingEndEvent");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$1900", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Lorg/yaml/snakeyaml/util/ArrayStack;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/util/ArrayStack", "pop", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$1802", "(Lorg/yaml/snakeyaml/emitter/Emitter;Ljava/lang/Integer;)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$1500", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Lorg/yaml/snakeyaml/util/ArrayStack;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/util/ArrayStack", "pop", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/emitter/EmitterState");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$202", "(Lorg/yaml/snakeyaml/emitter/Emitter;Lorg/yaml/snakeyaml/emitter/EmitterState;)Lorg/yaml/snakeyaml/emitter/EmitterState;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/emitter/Emitter", "writeIndent", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$2700", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$1500", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Lorg/yaml/snakeyaml/util/ArrayStack;", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingSimpleValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingSimpleValue", "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitter;Lorg/yaml/snakeyaml/emitter/Emitter$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/util/ArrayStack", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$1600", "(Lorg/yaml/snakeyaml/emitter/Emitter;ZZZ)V", false);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitLdcInsn("?");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/emitter/Emitter", "writeIndicator", "(Ljava/lang/String;ZZZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$1500", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Lorg/yaml/snakeyaml/util/ArrayStack;", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingValue", "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitter;Lorg/yaml/snakeyaml/emitter/Emitter$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/util/ArrayStack", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectBlockMappingKey", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$1600", "(Lorg/yaml/snakeyaml/emitter/Emitter;ZZZ)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
