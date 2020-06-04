package asm.org.eclipse.persistence.expressions.spatial;
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
public class SpatialParameters$MaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "Ljava/lang/Enum<Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "org/eclipse/persistence/expressions/spatial/SpatialParameters", "Mask", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOUCH", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OVERLAPBDYDISJOINT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OVERLAPBDYINTERSECT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EQUAL", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INSIDE", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COVEREDBY", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONTAINS", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COVERS", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANYINTERACT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ON", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOUCH");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "TOUCH", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OVERLAPBDYDISJOINT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "OVERLAPBDYDISJOINT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OVERLAPBDYINTERSECT");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "OVERLAPBDYINTERSECT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EQUAL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "EQUAL", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INSIDE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "INSIDE", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COVEREDBY");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "COVEREDBY", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONTAINS");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "CONTAINS", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COVERS");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "COVERS", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANYINTERACT");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "ANYINTERACT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ON");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "ON", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "TOUCH", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "OVERLAPBDYDISJOINT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "OVERLAPBDYINTERSECT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "EQUAL", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "INSIDE", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "COVEREDBY", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "CONTAINS", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "COVERS", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "ANYINTERACT", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "ON", "Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "ENUM$VALUES", "[Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask", "ENUM$VALUES", "[Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/expressions/spatial/SpatialParameters$Mask;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/expressions/spatial/SpatialParameters$Mask");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
