package asm.org.apache.xbean.asm7.commons;
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
public class TryCatchBlockSorter$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", "Ljava/lang/Object;Ljava/util/Comparator<Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;>;", "java/lang/Object", new String[] { "java/util/Comparator" });

classWriter.visitOuterClass("org/apache/xbean/asm7/commons/TryCatchBlockSorter", "visitEnd", "()V");

classWriter.visitInnerClass("org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xbean/asm7/commons/TryCatchBlockSorter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/xbean/asm7/commons/TryCatchBlockSorter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", "this$0", "Lorg/apache/xbean/asm7/commons/TryCatchBlockSorter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", "blockLength", "(Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", "blockLength", "(Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;)I", false);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "blockLength", "(Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", "this$0", "Lorg/apache/xbean/asm7/commons/TryCatchBlockSorter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/TryCatchBlockSorter", "instructions", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TryCatchBlockNode", "start", "Lorg/apache/xbean/asm7/tree/LabelNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "indexOf", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", "this$0", "Lorg/apache/xbean/asm7/commons/TryCatchBlockSorter;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/commons/TryCatchBlockSorter", "instructions", "Lorg/apache/xbean/asm7/tree/InsnList;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TryCatchBlockNode", "end", "Lorg/apache/xbean/asm7/tree/LabelNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/InsnList", "indexOf", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/TryCatchBlockNode");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/TryCatchBlockNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/commons/TryCatchBlockSorter$1", "compare", "(Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;Lorg/apache/xbean/asm7/tree/TryCatchBlockNode;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
