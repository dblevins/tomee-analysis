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
public class ParserImpl$ParseFlowSequenceFirstEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceFirstEntry", null, "java/lang/Object", new String[] { "org/yaml/snakeyaml/parser/Production" });

classWriter.visitInnerClass("org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceFirstEntry", "org/yaml/snakeyaml/parser/ParserImpl", "ParseFlowSequenceFirstEntry", ACC_PRIVATE);

classWriter.visitInnerClass("org/yaml/snakeyaml/parser/ParserImpl$1", "org/yaml/snakeyaml/parser/ParserImpl", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceEntry", "org/yaml/snakeyaml/parser/ParserImpl", "ParseFlowSequenceEntry", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceFirstEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceFirstEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl", "scanner", "Lorg/yaml/snakeyaml/scanner/Scanner;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/yaml/snakeyaml/scanner/Scanner", "getToken", "()Lorg/yaml/snakeyaml/tokens/Token;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceFirstEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/yaml/snakeyaml/parser/ParserImpl", "access$1100", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)Lorg/yaml/snakeyaml/util/ArrayStack;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/tokens/Token", "getStartMark", "()Lorg/yaml/snakeyaml/error/Mark;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/util/ArrayStack", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceEntry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceFirstEntry", "this$0", "Lorg/yaml/snakeyaml/parser/ParserImpl;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceEntry", "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceEntry", "produce", "()Lorg/yaml/snakeyaml/events/Event;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;Lorg/yaml/snakeyaml/parser/ParserImpl$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/yaml/snakeyaml/parser/ParserImpl$ParseFlowSequenceFirstEntry", "<init>", "(Lorg/yaml/snakeyaml/parser/ParserImpl;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
