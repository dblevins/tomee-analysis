package asm.org.apache.xbean.asm7.tree;
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
public class TableSwitchInsnNodeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", null, "org/apache/xbean/asm7/tree/AbstractInsnNode", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "min", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "max", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dflt", "Lorg/apache/xbean/asm7/tree/LabelNode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "labels", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/xbean/asm7/tree/LabelNode;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_VARARGS, "<init>", "(IILorg/apache/xbean/asm7/tree/LabelNode;[Lorg/apache/xbean/asm7/tree/LabelNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 170);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/AbstractInsnNode", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "min", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "max", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "dflt", "Lorg/apache/xbean/asm7/tree/LabelNode;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/tree/Util", "asArrayList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "labels", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "accept", "(Lorg/apache/xbean/asm7/MethodVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "labels", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/xbean/asm7/Label");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "labels", "Ljava/util/List;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/asm7/tree/LabelNode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/LabelNode", "getLabel", "()Lorg/apache/xbean/asm7/Label;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "min", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "max", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "dflt", "Lorg/apache/xbean/asm7/tree/LabelNode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/LabelNode", "getLabel", "()Lorg/apache/xbean/asm7/Label;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/MethodVisitor", "visitTableSwitchInsn", "(IILorg/apache/xbean/asm7/Label;[Lorg/apache/xbean/asm7/Label;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "acceptAnnotations", "(Lorg/apache/xbean/asm7/MethodVisitor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clone", "(Ljava/util/Map;)Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", "(Ljava/util/Map<Lorg/apache/xbean/asm7/tree/LabelNode;Lorg/apache/xbean/asm7/tree/LabelNode;>;)Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/asm7/tree/TableSwitchInsnNode");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "min", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "max", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "dflt", "Lorg/apache/xbean/asm7/tree/LabelNode;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "clone", "(Lorg/apache/xbean/asm7/tree/LabelNode;Ljava/util/Map;)Lorg/apache/xbean/asm7/tree/LabelNode;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "labels", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "clone", "(Ljava/util/List;Ljava/util/Map;)[Lorg/apache/xbean/asm7/tree/LabelNode;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "<init>", "(IILorg/apache/xbean/asm7/tree/LabelNode;[Lorg/apache/xbean/asm7/tree/LabelNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/asm7/tree/TableSwitchInsnNode", "cloneAnnotations", "(Lorg/apache/xbean/asm7/tree/AbstractInsnNode;)Lorg/apache/xbean/asm7/tree/AbstractInsnNode;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
