package asm.org.codehaus.swizzle.stream;
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
public class DelimitedTokenReplacementInputStream$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", null, "java/lang/Object", new String[] { "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy" });

classWriter.visitOuterClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", null, null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", null, null, 0);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy", "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "StreamReadingStrategy", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "_read", "()I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$200", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "size", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$800", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$402", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy", "_read", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$100", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$200", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "append", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$200", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "match", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$200", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$800", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$402", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "read", "()I", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$200", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "hasData", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$3", "_read", "()I", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
