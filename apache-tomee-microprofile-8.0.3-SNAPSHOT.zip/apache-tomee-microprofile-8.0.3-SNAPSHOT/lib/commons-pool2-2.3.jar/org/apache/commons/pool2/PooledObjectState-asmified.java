package asm.org.apache.commons.pool2;
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
public class PooledObjectStateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/pool2/PooledObjectState", "Ljava/lang/Enum<Lorg/apache/commons/pool2/PooledObjectState;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EVICTION", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EVICTION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALIDATION", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALIDATION_PREALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALIDATION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ABANDONED", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RETURNING", "Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/pool2/PooledObjectState;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/pool2/PooledObjectState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "$VALUES", "[Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/pool2/PooledObjectState;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/pool2/PooledObjectState;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/pool2/PooledObjectState;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IDLE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOCATED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "ALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EVICTION");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EVICTION_RETURN_TO_HEAD");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALIDATION");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "VALIDATION", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALIDATION_PREALLOCATED");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "VALIDATION_PREALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALIDATION_RETURN_TO_HEAD");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "VALIDATION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "INVALID", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ABANDONED");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "ABANDONED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RETURNING");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/pool2/PooledObjectState", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "RETURNING", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/pool2/PooledObjectState");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "IDLE", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "ALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "EVICTION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "VALIDATION", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "VALIDATION_PREALLOCATED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "VALIDATION_RETURN_TO_HEAD", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "INVALID", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "ABANDONED", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/pool2/PooledObjectState", "RETURNING", "Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/pool2/PooledObjectState", "$VALUES", "[Lorg/apache/commons/pool2/PooledObjectState;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
