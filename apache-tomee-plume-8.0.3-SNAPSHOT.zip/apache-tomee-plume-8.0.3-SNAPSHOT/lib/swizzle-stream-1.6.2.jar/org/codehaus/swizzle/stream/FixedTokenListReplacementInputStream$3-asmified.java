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
public class FixedTokenListReplacementInputStream$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", null, "java/lang/Object", new String[] { "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy" });

classWriter.visitOuterClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", null, null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", null, null, 0);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy", "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "StreamReadingStrategy", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$500", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$300", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "append", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$600", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)[Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$600", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)[Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "append", "(I)I", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "match", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$700", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "getScanString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$300", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "clear", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$800", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/StreamTokenHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/StreamTokenHandler", "processToken", "(Ljava/lang/String;)Ljava/io/InputStream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$002", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;Ljava/io/InputStream;)Ljava/io/InputStream;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$300", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "hasData", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$900", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$102", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$102", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "read", "()I", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$300", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "hasData", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$3", "_read", "()I", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLabel(label8);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
