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
public class DelimitedTokenReplacementInputStream$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", null, "java/lang/Object", new String[] { "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy" });

classWriter.visitOuterClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", null, null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", null, null, 0);

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
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$000", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "flush", "()V", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$100", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$000", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "append", "(I)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(I2C);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(I2C);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$200", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "getScanString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "insert", "(ILjava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitTypeInsn(NEW, "java/io/ByteArrayInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/ByteArrayInputStream", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$302", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Ljava/io/InputStream;)Ljava/io/InputStream;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$000", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "resetPosition", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$500", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$402", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy", "_read", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(I2C);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$000", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/ScanBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/ScanBuffer", "match", "()Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$600", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/StreamTokenHandler;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/StreamTokenHandler", "processToken", "(Ljava/lang/String;)Ljava/io/InputStream;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$302", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Ljava/io/InputStream;)Ljava/io/InputStream;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$500", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$402", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "access$400", "(Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream;)Lorg/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream$StreamReadingStrategy", "_read", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
