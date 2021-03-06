package asm.org.yaml.snakeyaml.parser;
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
public class ParserImpl$ParseIndentlessSequenceEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", null, "java/lang/Object", new String[] { "org/yaml/snakeyaml/parser/Production" });

classWriter.visitInnerClass("org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "org/yaml/snakeyaml/parser/ParserImpl", "ParseIndentlessSequenceEntry", ACC_PRIVATE);

classWriter.visitInnerClass("org/yaml/snakeyaml/parser/ParserImpl$1", "org/yaml/snakeyaml/parser/ParserImpl", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/tokens/Token$ID", "org/yaml/snakeyaml/tokens/Token", "ID", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/yaml/snakeyaml/parser/ParserImpl$ParseBlockNode", "org/yaml/snakeyaml/parser/ParserImpl", "ParseBlockNode", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "produce", "()Lorg/yaml/snakeyaml/events/Event;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl", "scanner", "Lorg/yaml/snakeyaml/scanner/Scanner;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/yaml/snakeyaml/scanner/Scanner", "checkToken", "([Lorg/yaml/snakeyaml/tokens/Token$ID;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl", "scanner", "Lorg/yaml/snakeyaml/scanner/Scanner;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/yaml/snakeyaml/scanner/Scanner", "getToken", "()Lorg/yaml/snakeyaml/tokens/Token;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl", "scanner", "Lorg/yaml/snakeyaml/scanner/Scanner;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/yaml/snakeyaml/tokens/Token$ID");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockEntry", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Key", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "Value", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/tokens/Token$ID", "BlockEnd", "Lorg/yaml/snakeyaml/tokens/Token$ID;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/yaml/snakeyaml/scanner/Scanner", "checkToken", "([Lorg/yaml/snakeyaml/tokens/Token$ID;)Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/parser/ParserImpl", "access$600", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)Lorg/yaml/snakeyaml/util/ArrayStack;", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/util/ArrayStack", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl$ParseBlockNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseBlockNode", "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;Lorg/yaml/snakeyaml/parser/ParserImpl$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseBlockNode", "produce", "()Lorg/yaml/snakeyaml/events/Event;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/yaml/snakeyaml/tokens/Token"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/parser/ParserImpl", "access$102", "(Lorg/yaml/snakeyaml/parser/ParserImpl;Lorg/yaml/snakeyaml/parser/Production;)Lorg/yaml/snakeyaml/parser/Production;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/tokens/Token", "getEndMark", "()Lorg/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/parser/ParserImpl", "access$1200", "(Lorg/yaml/snakeyaml/parser/ParserImpl;Lorg/yaml/snakeyaml/error/Mark;)Lorg/yaml/snakeyaml/events/Event;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl", "scanner", "Lorg/yaml/snakeyaml/scanner/Scanner;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/yaml/snakeyaml/scanner/Scanner", "peekToken", "()Lorg/yaml/snakeyaml/tokens/Token;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/events/SequenceEndEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/tokens/Token", "getStartMark", "()Lorg/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/tokens/Token", "getEndMark", "()Lorg/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/events/SequenceEndEvent", "<init>", "(Lorg/yaml/snakeyaml/error/Mark;Lorg/yaml/snakeyaml/error/Mark;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/parser/ParserImpl", "access$600", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)Lorg/yaml/snakeyaml/util/ArrayStack;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/util/ArrayStack", "pop", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/yaml/snakeyaml/parser/Production");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/parser/ParserImpl", "access$102", "(Lorg/yaml/snakeyaml/parser/ParserImpl;Lorg/yaml/snakeyaml/parser/Production;)Lorg/yaml/snakeyaml/parser/Production;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;Lorg/yaml/snakeyaml/parser/ParserImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseIndentlessSequenceEntry", "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
