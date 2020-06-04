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
public class FixedTokenListReplacementInputStream$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", null, "java/lang/Object", new String[] { "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy" });

classWriter.visitOuterClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", null, null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", null, null, 0);

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
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
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
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$000", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "read", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$200", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "access$102", "(Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;)Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$StreamReadingStrategy;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream$1", "this$0", "Lorg/codehaus/swizzle/stream/FixedTokenListReplacementInputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/swizzle/stream/FixedTokenListReplacementInputStream", "read", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
