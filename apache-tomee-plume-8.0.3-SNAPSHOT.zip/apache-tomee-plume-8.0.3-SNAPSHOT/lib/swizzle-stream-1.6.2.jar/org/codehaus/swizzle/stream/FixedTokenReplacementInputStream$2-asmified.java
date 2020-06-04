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
public class FixedTokenReplacementInputStream$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", null, "java/lang/Object", new String[] { "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$StreamReadingStrategy" });

classWriter.visitOuterClass("org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", null, null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", null, null, 0);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$StreamReadingStrategy", "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "StreamReadingStrategy", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$300", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "append", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "match", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "getScanString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$500", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/StreamTokenHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/StreamTokenHandler", "processToken", "(Ljava/lang/String;)Ljava/io/InputStream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$002", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;Ljava/io/InputStream;)Ljava/io/InputStream;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$600", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$102", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "read", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/FixedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "hasData", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/FixedTokenReplacementInputStream$2", "_read", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
