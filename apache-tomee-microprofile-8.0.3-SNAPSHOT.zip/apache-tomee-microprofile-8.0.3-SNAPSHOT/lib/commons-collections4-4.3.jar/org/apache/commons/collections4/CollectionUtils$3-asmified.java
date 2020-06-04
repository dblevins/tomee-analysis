package asm.org.apache.commons.collections4;
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
public class CollectionUtils$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/commons/collections4/CollectionUtils$3", "Ljava/lang/Object;Lorg/apache/commons/collections4/Transformer<TE;Lorg/apache/commons/collections4/CollectionUtils$EquatorWrapper<TE;>;>;", "java/lang/Object", new String[] { "org/apache/commons/collections4/Transformer" });

classWriter.visitOuterClass("org/apache/commons/collections4/CollectionUtils", "removeAll", "(Ljava/lang/Iterable;Ljava/lang/Iterable;Lorg/apache/commons/collections4/Equator;)Ljava/util/Collection;");

classWriter.visitInnerClass("org/apache/commons/collections4/CollectionUtils$3", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/collections4/CollectionUtils$EquatorWrapper", "org/apache/commons/collections4/CollectionUtils", "EquatorWrapper", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$equator", "Lorg/apache/commons/collections4/Equator;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/collections4/Equator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/collections4/CollectionUtils$3", "val$equator", "Lorg/apache/commons/collections4/Equator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/CollectionUtils$EquatorWrapper;", "(TE;)Lorg/apache/commons/collections4/CollectionUtils$EquatorWrapper<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/collections4/CollectionUtils$EquatorWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/collections4/CollectionUtils$3", "val$equator", "Lorg/apache/commons/collections4/Equator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/collections4/CollectionUtils$EquatorWrapper", "<init>", "(Lorg/apache/commons/collections4/Equator;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "transform", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/collections4/CollectionUtils$3", "transform", "(Ljava/lang/Object;)Lorg/apache/commons/collections4/CollectionUtils$EquatorWrapper;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
