package asm.com.sun.xml.fastinfoset.algorithm;
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
public class UUIDEncodingAlgorithm$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", null, "java/lang/Object", new String[] { "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm$WordListener" });

classWriter.visitOuterClass("com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm", "convertFromCharacters", "([CII)Ljava/lang/Object;");

classWriter.visitInnerClass("com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm$WordListener", "com/sun/xml/fastinfoset/algorithm/BuiltInEncodingAlgorithm", "WordListener", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$cb", "Ljava/nio/CharBuffer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$longList", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;Ljava/nio/CharBuffer;Ljava/util/List;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "this$0", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "val$cb", "Ljava/nio/CharBuffer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "val$longList", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "word", "(II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "val$cb", "Ljava/nio/CharBuffer;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "subSequence", "(II)Ljava/nio/CharBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/nio/CharBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "this$0", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm", "fromUUIDString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "val$longList", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "this$0", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm", "access$000", "(Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "val$longList", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm$1", "this$0", "Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm", "access$100", "(Lcom/sun/xml/fastinfoset/algorithm/UUIDEncodingAlgorithm;)J", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
