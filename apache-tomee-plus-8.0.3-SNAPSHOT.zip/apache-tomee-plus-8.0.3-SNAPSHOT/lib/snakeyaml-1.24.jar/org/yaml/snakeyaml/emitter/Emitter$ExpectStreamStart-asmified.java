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
public class Emitter$ExpectStreamStartDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", null, "java/lang/Object", new String[] { "org/yaml/snakeyaml/emitter/EmitterState" });

classWriter.visitInnerClass("org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "org/yaml/snakeyaml/emitter/Emitter", "ExpectStreamStart", ACC_PRIVATE);

classWriter.visitInnerClass("org/yaml/snakeyaml/emitter/Emitter$1", "org/yaml/snakeyaml/emitter/Emitter", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/emitter/Emitter$ExpectFirstDocumentStart", "org/yaml/snakeyaml/emitter/Emitter", "ExpectFirstDocumentStart", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "expect", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$100", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Lorg/yaml/snakeyaml/events/Event;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/yaml/snakeyaml/events/StreamStartEvent");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/emitter/Emitter", "writeStreamStart", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/emitter/Emitter$ExpectFirstDocumentStart");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/emitter/Emitter$ExpectFirstDocumentStart", "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitter;Lorg/yaml/snakeyaml/emitter/Emitter$1;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$202", "(Lorg/yaml/snakeyaml/emitter/Emitter;Lorg/yaml/snakeyaml/emitter/EmitterState;)Lorg/yaml/snakeyaml/emitter/EmitterState;", false);
methodVisitor.visitInsn(POP);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/emitter/EmitterException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("expected StreamStartEvent, but got ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "this$0", "Lorg/yaml/snakeyaml/emitter/Emitter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/emitter/Emitter", "access$100", "(Lorg/yaml/snakeyaml/emitter/Emitter;)Lorg/yaml/snakeyaml/events/Event;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/emitter/EmitterException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitter;Lorg/yaml/snakeyaml/emitter/Emitter$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/emitter/Emitter$ExpectStreamStart", "<init>", "(Lorg/yaml/snakeyaml/emitter/Emitter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
